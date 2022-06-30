import java.time.LocalDateTime
import kotlin.properties.Delegates

class Student(
    name: String,
    identificationNumber: Int,
    dateOfBirth: LocalDateTime,
    id: Int,
    major: Major
) : Person(name, identificationNumber, dateOfBirth, id) {
    val listOfCourses: MutableList<Course> = mutableListOf()
    val gradeINCourse: MutableMap<Course, Double> = mutableMapOf()
    var totalCredits by Delegates.notNull<Int>()
    var average by Delegates.notNull<Double>()


    init {
        for (course in listOfCourses) {
            totalCredits += course.credit
        }

        var sum = 0.0
        for (course in listOfCourses) {
            sum += gradeINCourse[course]!!
        }
        average = sum / totalCredits
    }

    fun addLesson() {}
    fun removeLesson() {}
    fun showProgress() {}
}