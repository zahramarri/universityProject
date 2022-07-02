import kotlin.properties.Delegates

class Course(
    title: String,
    credit: Int,
    id: Int,
) {
    lateinit var major: Major
    var credit by Delegates.notNull<Int>()
    lateinit var listOfExams: MutableList<Exam>
}