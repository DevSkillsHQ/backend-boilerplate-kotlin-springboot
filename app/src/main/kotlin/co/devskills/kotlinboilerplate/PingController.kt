package co.devskills.kotlinboilerplate

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.sql.Connection
import java.sql.DriverManager

@RestController
class PingController {

    @GetMapping("/ping")
    fun ping(): String {
        var conn: Connection? = null
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:appdb.sqlite")
            val statement = conn.createStatement()
            val result = statement.executeQuery("SELECT 1")
            result.next()
            return result.getString(1)
        } catch (e: Exception) {
            return "Error connecting to database: ${e.message}"
        } finally {
            conn?.close()
        }
    }
}