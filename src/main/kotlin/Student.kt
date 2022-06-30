import java.time.LocalDateTime

class Student(
    name: String,
    identificationNumber: Int,
    dateOfBirth: LocalDateTime,
    id: Int,
    major: Major,
) : Person(name, identificationNumber, dateOfBirth, id) {
    val listOfLessons: MutableList<Lesson> = mutableListOf()
    val gradeOfLesson: MutableMap<Lesson, Double> = mutableMapOf()
}