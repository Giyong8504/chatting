package org.project.controllers.chat;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

// 데이터를 담기 위한 용도
// getter, 생성사, toString, equalsAndHashCode 자동 추가.
@Builder
public record ChatRoomForm(
        Long roomNo,
        @NotBlank String roomNm,
        int max) {}
