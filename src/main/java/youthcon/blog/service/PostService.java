package youthcon.blog.service;

import org.springframework.stereotype.Service;
import youthcon.blog.domain.PostRepository;
import youthcon.blog.dto.PostListResponseDto;
import youthcon.blog.web.dto.PostSaveRequestDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void save(PostSaveRequestDto requestDto) {
        postRepository.save(requestDto.toEntity());
    }

    public List<PostListResponseDto> findAll() {
        return postRepository.findAll().stream()
                .map(post -> new PostListResponseDto(post))
                .collect(Collectors.toList());
    }
}
