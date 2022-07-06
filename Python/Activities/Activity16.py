
class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " is stopped")


car1 = Car("Honda", "City", "2014", "Manual", "Red")
car2 = Car("Toyoto", "Innova", "2019", "Automatic", "Blue")
car3 = Car("mahendra", "xylo", "2015", "Manual", "white")

car1.accelerate()
car3.stop()
