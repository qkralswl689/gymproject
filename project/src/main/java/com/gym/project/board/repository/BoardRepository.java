package com.gym.project.board.repository;

import com.gym.project.board.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity,Integer> {
}
