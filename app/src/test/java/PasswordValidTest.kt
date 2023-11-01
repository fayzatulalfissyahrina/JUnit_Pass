import org.junit.Test
import org.junit.Assert.*

/**
 * Kelas PasswordValidTest berisi serangkaian tes JUnit untuk menguji kelas PasswordValid.
 */
class PasswordValidTest {
    /**
     * Tes apakah kata sandi yang memenuhi kriteria dinyatakan valid.
     */
    @Test
    fun testValidPassword() {
        val passwordValid = PasswordValid()
        assertTrue(passwordValid.isPasswordValid("P@ssw0rd"))
    }

    /**
     * Tes apakah kata sandi yang terlalu pendek dinyatakan tidak valid.
     */
    @Test
    fun testInvalidPasswordShort() {
        val passwordValid = PasswordValid()
        assertFalse(passwordValid.isPasswordValid("Ab1$"))
    }

    /**
     * Tes apakah kata sandi tanpa huruf dinyatakan tidak valid.
     */
    @Test
    fun testInvalidPasswordNoLetter() {
        val passwordValid = PasswordValid()
        assertFalse(passwordValid.isPasswordValid("1234@567"))
    }

    /**
     * Tes apakah kata sandi tanpa angka dinyatakan tidak valid.
     */
    @Test
    fun testInvalidPasswordNoDigit() {
        val passwordValid = PasswordValid()
        assertFalse(passwordValid.isPasswordValid("AbC@defG"))
    }

    /**
     * Tes apakah kata sandi tanpa karakter simbol dinyatakan tidak valid.
     */
    @Test
    fun testInvalidPasswordNoSpecialChar() {
        val passwordValid = PasswordValid()
        assertFalse(passwordValid.isPasswordValid("Password123"))
    }
}
