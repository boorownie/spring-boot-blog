package youthcon.blog.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import youthcon.blog.service.PostService;
import youthcon.blog.web.dto.PostSaveRequestDto;

@RestController
public class PostApiController {
    private PostService postService;

    public PostApiController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/api/posts")
    public ResponseEntity save(@RequestBody PostSaveRequestDto requestDto) {
        postService.save(requestDto);
        return ResponseEntity.ok().build();
    }
}