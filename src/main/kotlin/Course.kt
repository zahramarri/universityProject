import kotlin.properties.Delegates

class Course(
    title: String,
    id: Int,
) {
    var credit: Int = 0
    lateinit var major: Major
    val listOfExams: MutableList<Exam> = mutableListOf()
}