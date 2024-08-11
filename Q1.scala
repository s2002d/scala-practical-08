object Q1 {

  def encrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isUpper =>
        ((c.toInt - 65 + shift) % 26 + 65).toChar
      case c if c.isLower =>
        ((c.toInt - 97 + shift) % 26 + 97).toChar 
      case c => c 
    }
  }

  def decrypt(text: String, shift: Int): String = {
    text.map {
      case c if c.isUpper =>
        ((c.toInt - 65 - shift + 26) % 26 + 65).toChar
      case c if c.isLower =>
        ((c.toInt - 97 - shift + 26) % 26 + 97).toChar
      case c => c 
    }
  }

  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter string = ")
    val plaintext = scala.io.StdIn.readLine()
    print("Enter Shift Position = ")
    val shift = scala.io.StdIn.readInt()

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
