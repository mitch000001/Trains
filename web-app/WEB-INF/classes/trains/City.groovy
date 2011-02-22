package trains

class City {
    String name
    String shortCode

    static constraints = {
        name()
        shortCode()
    }

    String toString() {shortCode}
}
