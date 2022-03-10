package com.sg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.entities.Share;

@Repository
public interface ShareDoa extends JpaRepository<Share, Integer> {

}
