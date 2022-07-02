object University {
    val listOfStudents: MutableList<Student> = mutableListOf()
    val listOfCourses: MutableList<Course> = mutableListOf()

    fun takeCourse(student: Student, course: Course) {
        var flag = false
        if (student.totalCredits + course.credit <= 11) {
            if (student.average >= 17) {
                for (exam1 in course.listOfExams) {
                    for (exam2 in student.listOfExams)
                        if (exam1.date == exam2.date) {
                            flag = true
                        }
                }
                if (!flag) {
                    student.addCourse(course)
                    println("course added")
                }
            } else {
                println("average < 17")
            }
        } else {
            println("total credits > 11")
        }
    }
}