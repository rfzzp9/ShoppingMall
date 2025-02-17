import android.net.Network
import java.sql.DriverManager.println

//after
// -- domain layer
interface UserRepository {
    fun getUser(userId: Int): User?
}

data class User(val id: Int, val name: String, val email: String)

// --data layer
class NetworkUserRepository(private val apiClient: ApiClient) : UserRepository {
    override fun getUser(userId: Int): User? {
        val userJson = apiClient.fetchUser(userId)
        return if(userJson != null) {
            User(id = userId, name = "", email = "")
        } else {
            null
        }
    }
}

class ApiClient {
    fun fetchUser(userId: Int): String? {
        // ... 네트워크에서 userId에 해당하는 사용자 정보를 가져오는 코드 ...
        return "{}"
    }
}

fun main() {
    val apiClient = ApiClient()
    val userRepository: UserRepository = NetworkUserRepository(apiClient)
    val user = userRepository.getUser(1)
    println(user)
}
