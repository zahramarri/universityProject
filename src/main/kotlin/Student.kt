import java.time.LocalDate

class Student(
    name: String,
    identificationNumber: String,
    dateOfBirth: LocalDate,
    id: Int
) : Person(name, identificationNumber, dateOfBirth, id) {
    lateinit var major: Major
    val listOfExams: MutableList<Exam> = mutableListOf()
    private val listOfCourses: MutableList<Course> = mutableListOf()
    val gradeInExam: MutableMap<Exam, Double> = mutableMapOf()
    val gradesInCourse: MutableMap<Course, MutableList<Double?>> = mutableMapOf()
        get() {
            for (course in listOfCourses) {
                val temp = mutableListOf<Double?>()
                for (exam1 in course.listOfExams) {
                    for (exam2 in listOfExams) {
                        if (exam1.date == exam2.date) {
                           temp.add(gradeInExam[exam2])
                        }
                    }
                }
                field[course] = temp
            }
            return field
        }
    val averageGradeINCourse: MutableMap<Course, Double> = mutableMapOf()
        get() {
            var sum2 = 0.0
            for (course in listOfCourses) {
                for (grade in gradesInCourse[course]!!) {
                    if (grade != null) {
                        sum2 += grade
                    }
                }
                field[course] = sum2 / (gradesInCourse[course]?.size!!)
            }
            return field
        }
    var totalCredits: Int = 0
        get() {
            for (course in listOfCourses) {
                field += course.credit
            }
            return field
        }
    val average: Double
        get() {
            var sum1 = 0.0
            for (course in listOfCourses) {
                sum1 += averageGradeINCourse[course]!! * course.credit
            }
            return sum1 / totalCredits
        }

    fun addCourse(course: Course) {
        listOfCourses.add(course)
        listOfExams.addAll(course.listOfExams)
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