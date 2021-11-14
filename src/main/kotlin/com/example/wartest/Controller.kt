package com.example.wartest

import com.example.wartest.entity.*
import com.example.wartest.repositories.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class Controller(
        @Autowired
        private val favoriteHorseRepository: FavoriteHorseRepository,
        @Autowired
        private val horseRepository: HorseRepository,
        @Autowired
        private val locationRepository: LocationRepository,
        @Autowired
        private val breedRepository: BreedRepository,
        @Autowired
        private val sellerRepository: SellerRepository,
        @Autowired
        private val colorRepository: ColorRepository,
        @Autowired
        private val userPrincipalRepository: UserPrincipalRepository,
        @Autowired
        private val salesContractRepository: SalesContractRepository
) {
    //сохранение логина и пароля
    @PostMapping(path = ["/addUser"])
    fun addUser(@RequestBody user: UserPrincipal) = userPrincipalRepository.save(user)

    //сохранение данных пользователя
    @PostMapping(path = ["/addSeller"])
    fun addSeller(@RequestBody seller: Seller) = sellerRepository.save(seller)

    //достаем юзера
    @GetMapping(path = ["/seller/{login}"])
    fun findSeller(@PathVariable("login") login: String) = sellerRepository.getSeller(login)

    //все объявления о продаже
    @GetMapping(path = ["/allHorses"])
    fun findAllHorses(): MutableIterable<SalesContract> = salesContractRepository.getAllHorses()

    //выставить лошадь на продажу
    @PostMapping(path = ["/addHorse"])
    fun addHorse(@RequestBody horse: Horse) = horseRepository.save(horse)

    //добавление договора купли-продажи
    @PostMapping(path = ["/addSalesContract"])
    fun addSalesContract(@RequestBody salesContract: SalesContract) =
            salesContractRepository.save(salesContract)

    //детальная информация о лошади
    @GetMapping(path = ["/informHorse/{idHorse}"])
    fun findInformHorse(@PathVariable("idHorse") idHorse: Int): SalesContract = salesContractRepository.getInformHorse(idHorse)

    //лошади в избранном
    @GetMapping(path = ["/favoriteHorses/{login}"])
    fun findFavoriteHorses(@PathVariable("login") login: String): MutableIterable<SalesContract> =
            favoriteHorseRepository.getFavoriteHorses(login)

    //добавить лошадь в избранное
    @PostMapping(path = ["/addFavoriteHorse"])
    fun addFavoriteHorse(@RequestBody favoriteHorse: FavoriteHorse) = favoriteHorseRepository.save(favoriteHorse)

    @GetMapping(path = ["/allBreeds"])
    fun findAllBreeds() = breedRepository.getAllBreed()

    @GetMapping(path = ["/allColors"])
    fun findAllColors() = colorRepository.getAllColor()

    @GetMapping(path = ["/allCities"])
    fun findAllCities() = locationRepository.getAllCity()
}