import java.time.LocalDateTime
import kotlin.properties.Delegates

class Course(
    title: String,
    major: Major,
    credit: Int,
    id: Int,
) {
    var credit by Delegates.notNull<Int>()
    lateinit var dateOfExam: LocalDateTime
}