package com.medical.entity.message;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "m_chat_messages")
public class ChatMessage extends BaseEntity {

    @ManyToOne
    private User fromUser;

    @ManyToOne
    private User toUser;

    private String message;
}
