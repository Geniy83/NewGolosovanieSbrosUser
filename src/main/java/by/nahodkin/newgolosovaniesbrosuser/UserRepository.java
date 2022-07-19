package by.nahodkin.newgolosovaniesbrosuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String> {

    @Modifying
    @Query("update User set status =:status" +
            ", q11 =:q11, q12 =:q12, q13 =:q13" +
            ", q21 =:q21, q22 =:q22, q23 =:q23" +
            ", q31 =:q31, q32 =:q32, q33 =:q33" +
            " where id =:id")
    void updateStatusByUser(@Param("id") Integer id, @Param("status") String status
            , @Param("q11") String q11, @Param("q12") String q12, @Param("q13") String q13
            , @Param("q21") String q21, @Param("q22") String q22, @Param("q23") String q23
            , @Param("q31") String q31, @Param("q32") String q32, @Param("q33") String q33
    );
}