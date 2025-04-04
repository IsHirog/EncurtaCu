package dev.xoxo.EncurtaCu.service;

import dev.xoxo.EncurtaCu.model.Link;
import dev.xoxo.EncurtaCu.repository.LinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link encurtarLink(String urlLong) {
        Link link = new Link();
        link.setUrlLong(urlLong);
        link.setUrlEncurtada("https://curto.ly/" + UUID.randomUUID().toString().substring(0, 6));
        return linkRepository.save(link);
    }

    public List<Link> listarLinks() {
        return linkRepository.findAll();
    }
}
