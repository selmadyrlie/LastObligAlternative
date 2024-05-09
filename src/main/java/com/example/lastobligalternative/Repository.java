package com.example.lastobligalternative;

import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository <Billett, Long> {

}
