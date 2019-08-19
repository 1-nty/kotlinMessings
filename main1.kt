//val list_ads : List<Any> = listOf(1,1.1,"String")
class Student(var age:Int,var seat:String,var name: String){
    init{
        println("New Student Created")
    }
}
var classroom : List<Student> = listOf(
	Student(12,"a1","Jeremy"),
    Student(12,"a2","Mike"),
    Student(13,"a3","Kate"),
    Student(13,"a4","Tim"),
    Student(11,"b1","Jerry"),
    Student(12,"b2","Matt"),
    Student(12,"b3","Ashley"),
    Student(11,"b4","Kerry")
)

fun teenAgePrint(it:Student){
    it.age += 1
    println(it.age)
}

fun main(args: Array<String>){
    for (i in classroom){
    println(i.name)
	}
    println("////////////")
    val count = classroom.count()
    println(count)
    println("////////////")
    val teens = classroom.filter({it.age > 12})
    println(teens)
    for (i in teens){
    	println(i.name)
	}
    println("////////////")
    teens.forEach({teenAgePrint(it)})
}
