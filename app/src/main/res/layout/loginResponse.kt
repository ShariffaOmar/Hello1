import com.google.gson.annotations.SerializedName
import layout.Student

data class loginResponse (
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)
