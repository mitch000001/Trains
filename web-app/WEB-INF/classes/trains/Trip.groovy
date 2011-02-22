package trains

class Trip {
    int distance
    String name
    static hasMany = [routes:Route]
    int stops

    static constraints = {
        name()
        distance()
        routes(nullable:false)
        stops()
    }
    String toString() {name}
}
