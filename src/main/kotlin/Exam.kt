import java.time.LocalDateTime
import kotlin.properties.Delegates

class Exam {
    var date by Delegates.notNull<LocalDateTime>()
    var grade by Delegates.notNull<Double>()
}
