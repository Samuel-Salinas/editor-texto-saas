package mx.edu.um.editor_texto_saas.repository;
import mx.edu.um.editor_texto_saas.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {}