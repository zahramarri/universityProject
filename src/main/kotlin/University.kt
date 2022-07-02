object University {
    val listOfProfessors: MutableList<Professor> = mutableListOf()
    val listOfStudents: MutableList<Student> = mutableListOf()
    val listOfCourses: MutableList<Course> = mutableListOf()

    fun takeCourse(student: Student, course: Course) {
        var flag = false
        if (student.totalCredits + course.credit <= 24 &&
            student.average > 17
        ) {
            for (exam1 in course.listOfExams) {
                for (exam2 in student.listOfExams)
                    if (exam1.date == exam2.date) {
                        flag = true
                    }
            }
            if (!flag) {
                student.addCourse(course)
            }
        }
    }

    fun addProfessor(professor: Professor) {
        listOfProfessors.add(professor)
    }

    fun removeProfessor(professor: Professor) {
        listOfProfessors.remove(professor)
    }

    fun addStudent(student: Student) {
        listOfStudents.add(student)
    }

    fun removeStudent(student: Student) {
        listOfStudents.remove(student)
    }

    fun addCourse(course: Course) {
        listOfCourses.add(course)
    }

    fun removeCourse(course: Course) {
        listOfCourses.remove(course)
    }
}