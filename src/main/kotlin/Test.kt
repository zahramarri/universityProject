import java.time.LocalDate
import java.time.Month

object Test {
    fun loadTestDataProfessors() {

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
    }

    fun loadTestDataStudents() {

        val student1 = Student(
            "Saeed Sadeqi",
            "4210391185",
            LocalDate.of(1990, Month.APRIL, 25),
            20001,
            Major.BiologicalSciences,
        )

        val student2 = Student(
            "Omid Sharifi",
            "4210391186",
            LocalDate.of(1990, Month.APRIL, 24),
            20002,
            Major.BiologicalSciences,
        )

        val student3 = Student(
            "Azade Sarvari",
            "4210391187",
            LocalDate.of(1990, Month.APRIL, 23),
            20003,
            Major.Communication,
        )

        val student4 = Student(
            "Fateme Parsi",
            "4210391188",
            LocalDate.of(1990, Month.APRIL, 22),
            20004,
            Major.Communication,
        )

        val student5 = Student(
            "Mina Asqari",
            "4210391189",
            LocalDate.of(1990, Month.APRIL, 21),
            20005,
            Major.Advertising,
        )

        val student6 = Student(
            "Ali Baqi",
            "4210391190",
            LocalDate.of(1990, Month.APRIL, 20),
            20006,
            Major.Advertising,
        )

    }

    fun loadTestDataCourses() {
        val course1 = Course("Social Psychology", Major.Advertising, 1, 30001)
        val course2 = Course("Cultural Sociology", Major.Advertising, 2, 30002)
        val course3 = Course("Art and Communication", Major.Advertising, 3, 30003)
        val course4 = Course("Media Studies", Major.Advertising, 4, 30004)

        val course5 = Course("General Physics of Biology", Major.BiologicalSciences, 4, 30005)
        val course6 = Course("General Mathematics", Major.BiologicalSciences, 3, 30006)
        val course7 = Course("Biostatistics", Major.BiologicalSciences, 2, 30007)
        val course8 = Course("Biological data Processing", Major.BiologicalSciences, 1, 30008)

        val course9 = Course("Methods of Checking the Audience", Major.Communication, 1, 30009 )
        val course10 = Course("Sociology of Persuasion and Propaganda", Major.Communication, 2, 30010 )
        val course11 = Course("Music, Culture and Society", Major.Communication, 3, 30011 )
        val course12 = Course("Sociology of Art and Literature", Major.Communication, 4, 30012 )
    }
}