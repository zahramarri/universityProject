import kotlin.properties.Delegates

class Course(
    title: String,
    id: Int,
) {
    var credit by Delegates.notNull<Int>()
    lateinit var major: Major
    val listOfExams: MutableList<Exam> = mutableListOf()
}