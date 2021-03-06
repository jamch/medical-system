package com.medical.entity.message;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "m_chat_messages")
@DynamicInsert
@DynamicUpdate
public class ChatMessage extends BaseEntity {

    @ManyToOne(optional = false)
    private User fromUser;

    @ManyToOne(optional = false)
    private User toUser;

    private String message;
}
