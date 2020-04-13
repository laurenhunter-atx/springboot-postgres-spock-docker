package bowling

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.test.web.servlet.MockMvc

import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print

class BowlingServiceClient {
    @Autowired
    ObjectMapper objectMapper

    private String baseUri
    private MockMvc mvc

    BowlingServiceClient(String baseUri, MockMvc mvc) {
        this.baseUri = baseUri
        this.mvc = mvc
    }

    MockHttpServletResponse hello() {
        return mvc.perform(
                get("${baseUri}/hello")
                        .accept(APPLICATION_JSON)
                        .contentType(APPLICATION_JSON))
                .andDo(print()).andReturn().getResponse()
    }
}
