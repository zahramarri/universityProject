import java.time.LocalDateTime

class Professor(
    name: String,
    dateOfBirth: LocalDateTime,
    identificationNumber: Int,
    major: Major,
    rank: Rank,
    id: Int,
) : Person(name, identificationNumber, dateOfBirth, id) {
    val listOfCourses: MutableList<Course> = mutableListOf()

    fun addLesson() {}
    fun removeLesson() {}
}