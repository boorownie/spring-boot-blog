package youthcon.blog.dto;

import youthcon.blog.domain.Post;

public class PostListResponseDto {
    private Long id;
    private String title;
    private String author;

    public PostListResponseDto(Post entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
