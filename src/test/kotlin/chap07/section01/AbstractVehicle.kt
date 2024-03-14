package chap07.section01

//추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변수 3개가 있음
abstract class Vehicle(val name: String, val color: String, val weight: Double) {

    //추상 프로퍼티 - 하위 클래스에서 재정의(오버라이딩)해야 함
    abstract val maxSpeed: Double

    //비추상 프로퍼티
    var year: String = "2008"

    //추상 메서드 (반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    //비추상 메서드
    fun displaySpec() {
        println("name: $name, color: $color, weight: $weight, year: $year, maxSpeed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")

    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn() {
        println("Auto Pilot ON")
    }
}

class Motorbike(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Motorbike Started")

    }

    override fun stop() {
        println("Motorbike Stopped")
    }
}

fun main() {
    var car = Car("Matiz", "red", 1000.0, 100.0)
    // var v = Vehicle() //추상 클래스로부터 인스턴스 생설 불가
    var motor = Motorbike("Motor1","blue",1000.0, 1000.0)

    car.year = "2014"
    car.displaySpec()

    motor.displaySpec()
    car.start()
    motor.start()
}
