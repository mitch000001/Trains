import trains.Route
import trains.Trip
import trains.City

class BootStrap {

    def init = { servletContext ->
        def c1 = new City(shortCode: 'A').save()
        def c2 = new City(shortCode: 'B').save()
        def c3 = new City(shortCode: 'C').save()
        def c4 = new City(shortCode: 'D').save()
        def c5 = new City(shortCode: 'E').save()
        new Route(name: 'AB5',
                  startCity: c1,
                  endCity: c2,
                  distance: 5).save()
        new Route(name: 'BC4',
                  startCity: c2,
                  endCity: c3,
                  distance: 4).save()
        new Route(name: 'CD8',
                  startCity: c3,
                  endCity: c4,
                  distance: 8).save()
        new Route(name: 'DC8',
                  startCity: c4,
                  endCity: c3,
                  distance: 8).save()
        new Route(name: 'DE6',
                  startCity: c4,
                  endCity: c5,
                  distance: 6).save()
        new Route(name: 'AD5',
                  startCity: c1,
                  endCity: c4,
                  distance: 5).save()
        new Route(name: 'CE2',
                  startCity: c3,
                  endCity: c5,
                  distance: 2).save()
        new Route(name: 'EB3',
                  startCity: c5,
                  endCity: c2,
                  distance: 3).save()
        new Route(name: 'AE7',
                  startCity: c1,
                  endCity: c5,
                  distance: 7).save()
        def r1 = Route.findByName('AB5')
        def r2 = Route.findByName('BC4')
        def r3 = Route.findByName('CD8')
        def r4 = Route.findByName('DC8')
        def r5 = Route.findByName('DE6')
        def r6 = Route.findByName('AD5')
        def r7 = Route.findByName('CE2')
        def r8 = Route.findByName('EB3')
        def r9 = Route.findByName('AE7')
        def t1 = new Trip(name: 'A-B-C',
                          distance: 9)
        def t2 = new Trip(name: 'A-D',
                          distance:  5)
        def t3 = new Trip(name: 'A-D-C',
                          distance: 13)
        def t4 = new Trip(name: 'A-E-B-C-D',
                          distance: 22)
        def t5 = new Trip(name: 'A-E-D')

        t1.addToRoutes(r1)
        t1.addToRoutes(r2)
        t1.save()
        t2.addToRoutes(r6)
        t2.save()
        t3.addToRoutes(r6)
        t3.addToRoutes(r4)
        t3.save()
        t4.addToRoutes(r9)
        t4.addToRoutes(r8)
        t4.addToRoutes(r2)
        t4.addToRoutes(r3)
        t4.save()
        t5.save()
    }
    def destroy = {
    }
}
