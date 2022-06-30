object University {
    val listOfProfessors: MutableList<Professor> = mutableListOf()
    val listOfStudents: MutableList<Student> = mutableListOf()
    val listOfMages: MutableList<Major> = mutableListOf()

    fun takeCourse(student: Student, course: Course) {
        if (student.totalCredits + course.credit <= 24 &&
            student.average > 17) {
            student.listOfCourses.add(course)
        }
    }

    fun addProfessor() {}
    fun removeProfessor() {}
    fun addStudent() {}
    fun removeStudent() {}
}