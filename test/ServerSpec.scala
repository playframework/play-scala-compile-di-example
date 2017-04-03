import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.play._

/**
 * Runs a play server on the default test port (Helpers.testServerPort == 19001).
 */
class ServerSpec extends PlaySpec
  with BaseOneServerPerSuite
  with MyApplicationFactory
  with ScalaFutures {

  private implicit val implicitPort = port

  "Server query should" should {
    "work" in {
      whenReady(play.api.test.WsTestClient.wsUrl("/").get) { response =>
        response.status mustBe play.api.http.Status.OK
      }
    }

  }

}
