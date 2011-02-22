package trains

class Route {
    String name
    String startCity
    String endCity
    int distance

    static belongsTo = Trip

    static constraints = {
        name()
        startCity()
        endCity()
        distance()
    }
    String toString() {startCity+endCity+distance}
}