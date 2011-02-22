import trains.Route
import trains.Trip

class BootStrap {

    def init = { servletContext ->
        def r1 = new Route(name: 'AB5',
                           startCity: 'A',
                           endCity: 'B',
                           distance: 5).save()
        def r2 = new Route(name: 'BC4',
                           startCity: 'B',
                           endCity: 'C',
                           distance: 4).save()
        def r3 = new Route(name: 'CD8',
                           startCity: 'C',
                           endCity: 'D',
                           distance: 8).save()
        def r4 = new Route(name: 'DC8',
                           startCity: 'D',
                           endCity: 'C',
                           distance: 8).save()
        def r5 = new Route(name: 'DE6',
                           startCity: 'D',
                           endCity: 'E',
                           distance: 6).save()
        def r6 = new Route(name: 'AD5',
                           startCity: 'A',
                           endCity: 'D',
                           distance: 5).save()
        def r7 = new Route(name: 'CE2',
                           startCity: 'C',
                           endCity: 'E',
                           distance: 2).save()
        def r8 = new Route(name: 'EB3',
                           startCity: 'E',
                           endCity: 'B',
                           distance: 3).save()
        def r9 = new Route(name: 'AE7',
                           startCity: 'A',
                           endCity: 'E',
                           distance: 7).save()
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
