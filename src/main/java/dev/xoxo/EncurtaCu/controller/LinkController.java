package dev.xoxo.EncurtaCu.controller;

import dev.xoxo.EncurtaCu.model.Link;
import dev.xoxo.EncurtaCu.service.LinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("links", linkService.listarLinks());
        return "index";
    }

    @PostMapping("/encurtar")
    public String encurtar(@RequestParam String urlLong) {
        linkService.encurtarLink(urlLong);
        return "redirect:/";
    }
}
