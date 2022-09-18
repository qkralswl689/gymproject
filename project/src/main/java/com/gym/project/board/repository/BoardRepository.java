package com.gym.project.board.repository;

import com.gym.project.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity,Integer> {

    String tmp = "SELECT MAX(ID) FROM CODE";

    @Query(value = tmp , nativeQuery = true)
    int findId();
}
