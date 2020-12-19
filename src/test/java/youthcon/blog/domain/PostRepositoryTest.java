package youthcon.blog.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;

    @DisplayName("게시글 저장 후 불러오기")
    @Test
    public void saveAndFind() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        String author = "작성자";
        Post post = new Post(title, content, author);
        postRepository.save(post);

        //when
        List<Post> postList = postRepository.findAll();

        //then
        Post persistPost = postList.get(0);
        assertThat(persistPost.getTitle()).isEqualTo(title);
        assertThat(persistPost.getContent()).isEqualTo(content);
    }
}
