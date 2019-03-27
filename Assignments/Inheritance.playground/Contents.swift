import UIKit

class Vehicle {
    var tire = 4
    var make: String?
    var model: String?
    var currentSpeed: Double = 0

    init(){
        print("Parent Class")
    }
    func drive(speedIncrease: Double){
        currentSpeed += speedIncrease * 2
    }

    func brake(){
        
    }
}

class SportsCar: Vehicle{
    override init() {
        super.init()
        print("Child Class")
        make = "Pontiac"
        model = "Trans Am"
    }
    
    override func drive(speedIncrease: Double){
        currentSpeed += speedIncrease * 8
    }
}
    let car = SportsCar()
