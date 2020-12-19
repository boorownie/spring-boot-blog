package youthcon.blog.web.dto;

import youthcon.blog.domain.Post;

public class PostSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public PostSaveRequestDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Post toEntity() {
        return new Post(title, content, author);
    }
}