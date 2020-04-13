package bowling.controller

import bowling.BaseSpec
import bowling.BowlingServiceClient
import org.springframework.beans.factory.annotation.Autowired

class GameApiControllerSpec extends BaseSpec {

    @Autowired
    BowlingServiceClient client

    def "should hello"() {
        expect:
        client.hello().getContentAsString() == "Hello"
    }
}
