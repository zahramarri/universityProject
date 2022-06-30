import java.time.LocalDateTime

class Professor(name: String,
                dateOfBirth: LocalDateTime,
                identificationNumber: Int,
                rank: Rank,
                id: Int) {
    val listOfLessons: MutableList<Lesson> = mutableListOf()
}