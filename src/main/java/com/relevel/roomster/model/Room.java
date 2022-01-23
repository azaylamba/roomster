package com.relevel.roomster.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    private long room_id;
}
