package dev.xoxo.EncurtaCu.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlLong;
    private String urlEncurtada;
    private LocalDateTime urlCriadaEm = LocalDateTime.now();

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrlLong() { return urlLong; }
    public void setUrlLong(String urlLong) { this.urlLong = urlLong; }

    public String getUrlEncurtada() { return urlEncurtada; }
    public void setUrlEncurtada(String urlEncurtada) { this.urlEncurtada = urlEncurtada; }

    public LocalDateTime getUrlCriadaEm() { return urlCriadaEm; }
    public void setUrlCriadaEm(LocalDateTime urlCriadaEm) { this.urlCriadaEm = urlCriadaEm; }
}
