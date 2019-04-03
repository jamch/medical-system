package com.medical.repository.message;

import com.medical.entity.message.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/3 9:42
 */
@RepositoryRestResource(path = "chat")
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long>, QuerydslPredicateExecutor<ChatMessage> {
}
