import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.properties.Delegates

class Student(
    name: String,
    identificationNumber: String,
    dateOfBirth: LocalDate,
    id: Int,
) : Person(name, identificationNumber, dateOfBirth, id) {
    lateinit var major: Major
    val listOfExams: MutableList<Exam> = mutableListOf()
    val gradeInExam: MutableMap<Exam, Double> = mutableMapOf()
    val listOfCourses: MutableList<Course> = mutableListOf()
    val gradesInCourse: MutableMap<Course, MutableList<Double>> = mutableMapOf()
    val averageGradeINCourse: MutableMap<Course, Double> = mutableMapOf()
    var totalCredits by Delegates.notNull<Int>()
    var average by Delegates.notNull<Double>()

    init {
        for (course in listOfCourses) {
            totalCredits += course.credit
        }

        var sum1 = 0.0
        for (course in listOfCourses) {
            sum1 += averageGradeINCourse[course]!! * course.credit
        }
        average = sum1 / totalCredits

        var sum2 = 0.0
        for (course in listOfCourses) {
            for (grade in gradesInCourse[course]!!) {
                sum2 += grade
            }
            averageGradeINCourse[course] = sum2 / (gradesInCourse[course]?.size!!)
        }
    }

    fun addCourse(course: Course) {
        listOfCourses.add(course)
        listOfExams.addAll(course.listOfExams)
    }

    fun removeCourse(course: Course) {
        listOfCourses.add(course)
    }

    fun evaluate(course: Course, periodStartPoint: LocalDate, periodEndPoint: LocalDate): String {
        val listOfIntendedExam: MutableList<Exam> = mutableListOf()
        for (exam in course.listOfExams) {
            if (exam.date in periodStartPoint..periodEndPoint) {
                listOfIntendedExam.add(exam)
            }
        }

        listOfIntendedExam.sortWith(compareBy { it.date })

        var i = 1
        var progress = 0
        while (i < listOfIntendedExam.size) {
            if (gradeInExam[listOfIntendedExam[i]]!! - gradeInExam[listOfIntendedExam[i - 1]]!! > 0) {
                progress++
            } else if (gradeInExam[listOfIntendedExam[i]]!! - gradeInExam[listOfIntendedExam[i - 1]]!! < 0) {
                progress--
            }

            i++
        }

        return if (progress > 0) {
            "Progress"
        } else if (progress < 0) {
            "Relapsed"
        } else {
            "No Change"
        }
    }
}