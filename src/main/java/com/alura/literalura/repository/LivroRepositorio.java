package com.alura.literalura.repository;

import com.alura.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {
    List<Livro> findByIdioma(String Idioma);
    Integer countByIdioma(String Idioma);
    List<Livro> findTop10ByOrderByNumeroDownloadsDesc();
}
