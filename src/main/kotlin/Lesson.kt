import java.time.LocalDateTime

class Lesson(
    title: String,
    major: Major,
    CourseCredit: Int,
    id: Int,
) {
    lateinit var dateOfExam: LocalDateTime
}