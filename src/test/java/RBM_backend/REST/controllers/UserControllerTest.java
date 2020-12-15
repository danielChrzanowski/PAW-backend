package RBM_backend.REST.controllers;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@AutoConfigureMockMvc
@SpringBootTest
class UserControllerTest {
/*    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnUserById() throws Exception {
        MvcResult storyResult =
                mockMvc.perform(
                        get("/userById/1")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                        .andExpect(status().isOk())
                        .andDo(print())
                        .andReturn();

        User user = OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(), User.class);

        assertEquals(new User(1, "testuser"), user);
    }

    @Test
    void shouldReturnUserByLogin() throws Exception {
        MvcResult storyResult =
                mockMvc.perform(
                        get("/userByLogin/testuser2")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                        .andExpect(status().isOk())
                        .andDo(print())
                        .andReturn();

        User user = OBJECT_MAPPER.readValue(storyResult.getResponse().getContentAsString(), User.class);

        assertEquals(new User(2, "testuser2"), user);
    }*/

}