package org.example.lessons.lesson03.homework

// 1. Название мероприятия
val eventName: String = "Hackathon Survival"

// 2. Дата проведения
var eventDate: String = "10 ноября 2025"

// 3. Место проведения
var eventLocation: String = "Тбилиси, Expo Georgia"

// 4. Подробный бюджет мероприятия
private val detailedBudget: String =
    "подробная информация с перечислением поставщиков и сумм"

// 5. Количество участников
var participantsCount: Int = 0
    set(value) {
        require(value >= 0)
        field = value
    }

// 6. Длительность хакатона
var hackathonDurationHours: Int = 24

// 7. Контактная информация и условия соглашений с поставщиками
private val supplierContracts: String =
    "контактная информация и условия соглашений"

// 8. Текущее состояние хакатона
var hackathonStatus: String = "Идет подготовка"

// 9. Список спонсоров
var sponsors: String = "Список спонсоров"

// 10. Бюджет мероприятия
private val eventBudget: Double = 100500.0

// 11. Текущий уровень доступа к интернету
var internetAccessLevel: Int = 0
    set(value) {
        require(value in 0..100)
        field = value
    }

// 12. Информация о транспортировке оборудования и координации
private val logisticsInformation: String =
    "информация о транспортировке, распределении ресурсов и координации"

// 13. Количество команд
var teamsCount: Int = 0
    set(value) {
        require(value >= 0)
        field = value
    }

// 14. Перечень задач
var tasks: String = "Перечень задач"

// 15. План эвакуации
val evacuationPlan: String = "План эвакуации мероприятия"

// 16. Список доступного оборудования
var availableEquipment: String = "Список оборудования"

// 17. Список свободного оборудования
var freeEquipment: String = "Список свободного оборудования"

// 18. График питания участников
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
val contingencyPlan: String = "План действий при сбоях"

// 20. Список экспертов и жюри
var expertsAndJudges: String = "Список экспертов и жюри"

// 21. Политика конфиденциальности
val privacyPolicy: String = "Политика конфиденциальности мероприятия"

// 22. Приватные отзывы участников и зрителей
private var privateFeedback: String = "Отзывы"

// 23. Текущая температура в помещении
var currentTemperature: Double = 20.0
    set(value) {
        require(value in -50.0..100.0)
        field = value
    }

// 24. Данные мониторинга и анализ производительности сети
private val networkMonitoringData: String =
    "данные мониторинга и анализа производительности"

// 25. Регулятор скорости интернета
var internetSpeedMultiplier: Double = 1.0
    set(value) {
        require(value in 0.0..1.0)
        field = value
    }

// 26. Уровень освещения
var lightingLevel: Int = 0
    set(value) {
        require(value >= 0)
        field = value
    }

// 27. Лог событий мероприятия
var eventLog: String = "События мероприятия"

// 28. Возможность получения медицинской помощи
val medicalAssistanceAvailable: Boolean = true

// 29. Планы и процедуры обеспечения безопасности
private val safetyProcedures: String =
    "Планы эвакуации и протоколы чрезвычайных ситуаций"

// 30. Регистрационный номер мероприятия
val eventRegistrationNumber: String = "MH-2025-001"

// 31. Максимально допустимый уровень шума
val maximumNoiseLevel: Double = 85.0

// 32. Индикатор превышения уровня шума
var noiseLimitExceeded: Boolean = false

// 33. План взаимодействия с прессой
val pressInteractionPlan: String =
    "План взаимодействия с прессой"

// 34. Детальная публичная информация о проектах команд
val teamProjectsInformation: String =
    "Информация о проектах команд, статистика запусков и результаты проверок"

// 35. Статус получения необходимых разрешений
var permitsStatus: String = "В процессе"

// 36. Индикатор доступности специализированного оборудования
var specializedEquipmentAvailable: Boolean = false

// 37. Список партнеров мероприятия
var partners: String = "Список партнеров"

// 38. Отчёт, доступный после завершения мероприятия
//val eventReport: String by lazy {
//    generateEventReport()
//}

// 39. Внутренние правила распределения призов
private val prizeDistributionRules: String =
    "Внутренние правила распределения призов"

// 40. Список разыгрываемых призов
val prizes: String = "Список призов"

// 41. Контакты экстренных служб и медицинского персонала
private val emergencyContacts: String =
    "Контакты экстренных служб и медицинского персонала"

// 42. Особые условия для участников с ограниченными возможностями
val accessibilityRequirements: String =
    "Особые условия для участников с ограниченными возможностями"

// 43. Общее настроение участников
//val participantsMood: String by lazy {
//    calculateParticipantsMood()
//}

// 44. Подробный план хакатона
lateinit var hackathonPlan: String

// 45. Имя знаменитого специального гостя
lateinit var specialGuestName: String

// 46. Максимальная вместимость места проведения
val venueCapacity: Int = 1000

// 47. Количество часов, отведённое каждой команде
val hoursPerTeam: Int = 48