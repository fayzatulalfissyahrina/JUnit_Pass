/**
 * Kelas PasswordValid digunakan untuk memeriksa apakah sebuah kata sandi memenuhi kriteria tertentu.
 *
 * Kriteria yang diperiksa adalah:
 * 1. Kata sandi harus memiliki panjang minimal 8 karakter.
 * 2. Kata sandi harus mengandung setidaknya satu huruf.
 * 3. Kata sandi harus mengandung setidaknya satu angka.
 * 4. Kata sandi harus mengandung setidaknya satu karakter simbol.
 */
class PasswordValid {
    /**
     * Memeriksa apakah kata sandi memenuhi kriteria yang ditetapkan.
     *
     * @param password Kata sandi yang akan diperiksa.
     * @return `true` jika kata sandi memenuhi kriteria, `false` jika tidak.
     */
    fun isPasswordValid(password: String): Boolean {
        // Memeriksa apakah kata sandi memiliki panjang minimal 8 karakter
        if (password.length < 8) {
            return false
        }

        // Memeriksa apakah kata sandi mengandung huruf
        val containsLetter = password.any { it.isLetter() }

        // Memeriksa apakah kata sandi mengandung angka
        val containsDigit = password.any { it.isDigit() }

        // Memeriksa apakah kata sandi mengandung karakter simbol
        val containsSpecialChar = password.any { it.isLetterOrDigit().not() }

        return containsLetter && containsDigit && containsSpecialChar
    }
}
