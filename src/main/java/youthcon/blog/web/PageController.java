package youthcon.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import youthcon.blog.service.PostService;

@Controller
public class PageController {
    private PostService postService;

    public PageController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "index";
    }

    @GetMapping("/posts/save")
    public String save() {
        return "posts-save";
    }
}