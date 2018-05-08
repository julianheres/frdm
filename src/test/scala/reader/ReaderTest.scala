package reader

import AccountService.{balance, credit, debit}
import org.scalatest._

class ReaderSpec extends FlatSpec with Matchers {

  "A Reader" should "" in {

    val balanceAfterTransactions = for {
      _ <- credit(no, BigDecimal(100))
      _ <- credit(no, BigDecimal(300))
      _ <- debit(no, BigDecimal(160))
      b <- balance(no)
    } yield b
  }

  it should "" in {

  }
}
