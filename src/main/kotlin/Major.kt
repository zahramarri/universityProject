class Major(name: String, id: Int) {
    val listOfLessons: MutableList<Lesson> = mutableListOf()
    val listOfStudents: MutableList<Student> = mutableListOf()
    val listOfProfessors: MutableList<Professor> = mutableListOf()
}