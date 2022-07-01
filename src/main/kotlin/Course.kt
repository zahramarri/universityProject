import kotlin.properties.Delegates

class Course(
    title: String,
    major: Major,
    credit: Int,
    id: Int,
) {
    var credit by Delegates.notNull<Int>()
    lateinit var listOfExams: MutableList<Exam>
}