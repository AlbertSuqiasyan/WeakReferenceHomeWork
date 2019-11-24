import java.lang.StringBuilder
import java.lang.ref.WeakReference
import kotlin.reflect.KProperty
fun main(args: Array<String>){
    val human: Human = Human()
    var horse: Horse by Delegate()
    horse = weakRef
}

var weakRef: WeakReference<Horse> = WeakReference()
fun WeakReference(): WeakReference<Horse> {
return WeakReference()
}

abstract class Animal(){

}

interface CanMove {
    fun walk(): String
}

interface CanTalk {
    fun talk(): String
}
class Human() : Animal(), CanMove,CanTalk{
    override fun walk(): String {
        return "walk"
    }

    override fun talk(): String {
        return "Hello"
    }

}
class Horse : CanMove by Human(), CanTalk{
      override fun talk(): String {
        return "horse Talk"
    }
}
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Horse {
        return Horse()
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Horse) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}