import java.time.LocalDate
import kotlin.properties.Delegates

class Exam {
    var date by Delegates.notNull<LocalDate>()
}
