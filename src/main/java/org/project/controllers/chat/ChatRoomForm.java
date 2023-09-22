package org.project.controllers.chat;

import lombok.Builder;

// 데이터를 담기 위한 용도
@Builder
public record ChatRoomForm(Long roomNo, String roomNm, int max) {}// getter, 생성사, toString, equalsAndHashCode 자동 추가.
