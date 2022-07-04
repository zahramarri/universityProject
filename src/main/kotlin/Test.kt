import java.time.LocalDate
import java.time.Month

object Test {
    fun loadTestData() {
        val course1 = Course("Social Psychology", 30001)
        course1.major = Major.Advertising
        course1.credit = 1

        val exam1 = Exam()
        exam1.date = LocalDate.of(2022, Month.APRIL, 25)
        val exam2 = Exam()
        exam2.date = LocalDate.of(2022, Month.APRIL, 24)

        course1.listOfExams.add(exam1)
        course1.listOfExams.add(exam2)



        val course2 = Course("Cultural Sociology", 30002)
        course2.major = Major.Advertising
        course2.credit = 2

        val exam3 = Exam()
        exam3.date = LocalDate.of(2022, Month.APRIL, 23)
        val exam4 = Exam()
        exam4.date = LocalDate.of(2022, Month.APRIL, 22)

        course2.listOfExams.add(exam3)
        course2.listOfExams.add(exam4)



        val course3 = Course("Art and Communication", 30003)
        course3.major = Major.BiologicalSciences
        course3.credit = 3

        val exam5 = Exam()
        exam5.date = LocalDate.of(2022, Month.APRIL, 21)
        val exam6 = Exam()
        exam6.date = LocalDate.of(2022, Month.APRIL, 20)

        course3.listOfExams.add(exam5)
        course3.listOfExams.add(exam6)



        val course4 = Course("Media Studies", 30004)
        course4.major = Major.BiologicalSciences
        course4.credit = 4

        val exam7 = Exam()
        exam7.date = LocalDate.of(2022, Month.APRIL, 19)
        val exam8 = Exam()
        exam8.date = LocalDate.of(2022, Month.APRIL, 18)

        course4.listOfExams.add(exam7)
        course4.listOfExams.add(exam8)



        val professor1 = Professor("Mohammed Alavi",
            "4210391182",
            LocalDate.of(1980, Month.NOVEMBER, 15),
            10001,
            Major.Advertising,
            Rank.Professor
        )

        professor1.listOfCourses.add(course1)
        professor1.listOfCourses.add(course2)

        val professor2 = Professor(
            "Mohsen Elahi",
            "4210391183",
            LocalDate.of(1983, Month.NOVEMBER, 15),
            10002,
            Major.BiologicalSciences,
            Rank.AssistantProfessor,
        )

        professor2.listOfCourses.add(course3)
        professor2.listOfCourses.add(course4)



        val student1 = Student(
            "Saeed Sadeqi",
            "4210391185",
            LocalDate.of(1990, Month.APRIL, 25),
            20001,
        )
        student1.major = Major.BiologicalSciences

        val student2 = Student(
            "Omid Sharifi",
            "4210391186",
            LocalDate.of(1990, Month.APRIL, 24),
            20002,
        )
        student2.major = Major.BiologicalSciences

        professor2.studentsInCourse[course3] = mutableListOf(student1, student2)
        professor2.studentsInCourse[course4] = mutableListOf(student1, student2)

        val student3 = Student(
            "Azade Sarvari",
            "4210391187",
            LocalDate.of(1990, Month.APRIL, 23),
            20003,
        )
        student3.major = Major.Advertising

        val student4 = Student(
            "Fateme Parsi",
            "4210391188",
            LocalDate.of(1990, Month.APRIL, 22),
            20004,
        )
        student4.major = Major.Advertising

        professor1.studentsInCourse[course1] = mutableListOf(student3, student4)
        professor1.studentsInCourse[course2] = mutableListOf(student3, student4)



        student1.addCourse(course3)
        student1.addCourse(course4)
        student2.addCourse(course3)
        student2.addCourse(course4)

        student3.addCourse(course1)
        student3.addCourse(course2)
        student4.addCourse(course1)
        student4.addCourse(course2)



        University.listOfStudents.addAll(mutableListOf(student1, student2, student3, student4))
        for (student in University.listOfStudents) {
            for (exam in student.listOfExams) {
                student.gradeInExam[exam] = (0..20).random().toDouble()
                println(student.gradeInExam[exam])
            }
        }

        println(student1.gradesInCourse[course3])
        println(student1.gradesInCourse[course4])
        println(student1.totalCredits)
        println(student1.averageGradeINCourse[course3])
        println(student1.average)
        println(student1.evaluate(course3, LocalDate.of(2022, Month.MARCH, 1), LocalDate.of(2022, Month.MAY, 1)))
    }
}


fun main() {
    Test.loadTestData()
}