import java.time.LocalDate
import java.time.Month

object Test {
    fun loadTestDataProfessors() {
        University.listOfProfessors.clear()

        val professor1 = Professor("Mohammed Alavi",
            "4210391182",
            LocalDate.of(1980, Month.NOVEMBER, 15),
            10001,
            Major.Advertising,
            Rank.Professor
        )

        val professor2 = Professor(
            "Mohsen Elahi",
            "4210391183",
            LocalDate.of(1983, Month.NOVEMBER, 15),
            10002,
            Major.BiologicalSciences,
            Rank.AssistantProfessor,
        )

        val professor3 = Professor(
            "Ali Keifi",
            "4210391184",
            LocalDate.of(1975, Month.NOVEMBER, 15),
            10003,
            Major.Communication,
            Rank.Instructor,
        )

        University.addProfessor(professor1)
        University.addProfessor(professor2)
        University.addProfessor(professor3)
    }

    fun loadTestDataStudents() {
        University.listOfStudents.clear()

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

        val student3 = Student(
            "Azade Sarvari",
            "4210391187",
            LocalDate.of(1990, Month.APRIL, 23),
            20003,
        )
        student3.major = Major.Communication

        val student4 = Student(
            "Fateme Parsi",
            "4210391188",
            LocalDate.of(1990, Month.APRIL, 22),
            20004,
        )
        student4.major = Major.Communication

        val student5 = Student(
            "Mina Asqari",
            "4210391189",
            LocalDate.of(1990, Month.APRIL, 21),
            20005,
        )
        student5.major = Major.Advertising

        val student6 = Student(
            "Ali Baqi",
            "4210391190",
            LocalDate.of(1990, Month.APRIL, 20),
            20006,
        )
        student6.major = Major.Advertising

        University.addStudent(student1)
        University.addStudent(student2)
        University.addStudent(student3)
        University.addStudent(student4)
        University.addStudent(student5)
        University.addStudent(student6)

    }

    fun loadTestDataCourses() {
        for (student in University.listOfStudents) {
            student.listOfCourses.clear()
        }
        University.listOfCourses.clear()

        val course1 = Course("Social Psychology", 1, 30001)
        course1.major = Major.Advertising
        val course2 = Course("Cultural Sociology", 2, 30002)
        course2.major = Major.Advertising
        val course3 = Course("Art and Communication", 3, 30003)
        course3.major = Major.Advertising
        val course4 = Course("Media Studies", 4, 30004)
        course4.major = Major.Advertising

        val course5 = Course("General Physics of Biology", 4, 30005)
        course5.major =  Major.BiologicalSciences
        val course6 = Course("General Mathematics", 3, 30006)
        course6.major =  Major.BiologicalSciences
        val course7 = Course("Biostatistics", 2, 30007)
        course7.major =  Major.BiologicalSciences
        val course8 = Course("Biological data Processing", 1, 30008)
        course8.major =  Major.BiologicalSciences

        val course9 = Course("Methods of Checking the Audience", 1, 30009)
        course9.major = Major.Communication
        val course10 = Course("Sociology of Persuasion and Propaganda", 2, 30010 )
        course10.major = Major.Communication
        val course11 = Course("Music, Culture and Society", 3, 30011 )
        course11.major = Major.Communication
        val course12 = Course("Sociology of Art and Literature", 4, 30012 )
        course12.major = Major.Communication

        University.addCourse(course1)
        University.addCourse(course2)
        University.addCourse(course3)
        University.addCourse(course4)
        University.addCourse(course5)
        University.addCourse(course6)
        University.addCourse(course7)
        University.addCourse(course8)
        University.addCourse(course9)
        University.addCourse(course10)
        University.addCourse(course11)
        University.addCourse(course12)

        for (student in University.listOfStudents) {
            for (course in University.listOfCourses) {
                if (student.major == course.major) {
                    student.addCourse(course)
                }
            }
        }
    }
}