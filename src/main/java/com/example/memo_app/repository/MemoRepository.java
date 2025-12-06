package com.example.memo_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.memo_app.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {}
