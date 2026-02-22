package tech.metaclass.kts.hw2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform