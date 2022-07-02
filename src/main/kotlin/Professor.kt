import java.time.LocalDate

class Professor(
    name: String,
    identificationNumber: String,
    dateOfBirth: LocalDate,
    id: Int,
    major: Major,
    rank: Rank
) : Person(name, identificationNumber, dateOfBirth, id) {
    val listOfCourses: MutableList<Course> = mutableListOf()
    val studentsInCourse: MutableMap<Course, MutableList<Student>> = mutableMapOf()

    fun addCourse(course: Course) {
        listOfCourses.add(course)
    }

    fun removeCourse(course: Course) {
        listOfCourses.remove(course)
    }
}