package br.com.xavecoding.regesc.Professor;

import br.com.xavecoding.regesc.orm.PostGis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface repository extends JpaRepository<PostGis, Long> {

}
