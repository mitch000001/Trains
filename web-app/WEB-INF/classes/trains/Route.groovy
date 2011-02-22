package trains

class Route {
    String name
    City startCity
    City endCity
    int distance

    static constraints = {
        name()
        startCity()
        endCity()
        distance()
    }

    String toString() {startCity+endCity+distance}
}