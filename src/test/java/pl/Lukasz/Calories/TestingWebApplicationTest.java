package pl.Lukasz.Calories;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("User Name :")))
                .andExpect(content().string(containsString("Password:")));
    }

    @Test
    public void shouldReturnDefaultMessageLoginError() throws Exception {
        this.mockMvc.perform(get("/login?error")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("User Name :")))
                .andExpect(content().string(containsString("Password:")))
                .andExpect(content().string(containsString("Invalid username and password.")));
    }

    @Test
    public void shouldReturnDefaultMessageLoginLoggedOut() throws Exception {
        this.mockMvc.perform(get("/login?logout")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("User Name :")))
                .andExpect(content().string(containsString("Password:")))
                .andExpect(content().string(containsString("You have been logged out.")));
    }

    @Test
    public void shouldReturnDefaultMessageLoginSignIN() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
        .post("/login")
        .param("username","user")
        .param("password","password"))
                .andExpect(content().string(containsString("Hello World!")));
    }
}
