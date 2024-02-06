
open class Avengers(var name:String,var age:Int,var gender:String){

   open fun attack(){
        println("Attacking")
    }

    fun walk(){
        println("walking!")
    }

    fun defend(){
        println("Just defend!")
    }

    open fun intro(){
        println("""Name : $name  Age :  $age  Gender : $gender""")
    }
}

class CaptionAmerica(name:String,age: Int,gender: String,var weapon: String) : Avengers(name,age,gender){

    override fun attack() {
        print("$name attacking with shield!\n")
    }

    override fun intro() {
        println("Name : $name,Age:$age,Gender:$gender,Weapon : $weapon")
    }

}

class Ironman(name:String,age:Int,gender: String,var weapon: String) : Avengers(name,age, gender){
    override fun attack() {
        print("$name attacking with Jarvis suit!\n")
    }
    override fun intro() {
        println("Name : $name,Age:$age,Gender:$gender,Weapon : $weapon")
    }
}

class BlackWindow(name:String,age: Int,gender: String,var weapon: String) : Avengers(name,age, gender){
    override fun attack() {
        print("$name attacking with hands!\n")
    }
    override fun intro() {
        println("Name : $name,Age:$age,Gender:$gender,Weapon : $weapon")
    }
}

class Thor(name:String,age:Int,gender: String,var weapon: String):Avengers(name, age, gender){
    override fun attack() {
        print("$name attacking with Myonir!\n")
    }
    override fun intro() {
        println("Name : $name,Age:$age,Gender:$gender,Weapon : $weapon")
    }
}
class  Hulk(name: String,age: Int,gender: String,var weapon: String):Avengers(name, age, gender){
    override fun attack() {
        print("$name attacking with gamma !\n")
    }
    override fun intro() {
        println("Name : $name,Age:$age,Gender:$gender,Weapon : $weapon")
    }
}



fun main(args: Array<String>) {
    var avengers = Avengers("Avenger",32,"Male")

    var cap = CaptionAmerica("Rogers",34,"Male","Shield")
    var hulk = Hulk("Dr. Baner",38,"Male","Gamma Rays")
    var blackWindow = BlackWindow("Natasha",32,"Female","Hands")
    var ironman = Ironman("Tony Stark",36,"Male","Jarvis")
    var thor = Thor("Thor",32,"Male","Myonir")

    avengers.intro()

    cap.intro()
    cap.attack()

    hulk.intro()
    hulk.attack()

    ironman.intro()
    ironman.attack()

    blackWindow.intro()
    blackWindow.attack()

    thor.intro()
    thor.attack()

}