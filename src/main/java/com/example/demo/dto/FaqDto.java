package com.example.demo.dto;
import com.example.demo.domain.Faq;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public class FaqDto {

    @Builder
    @Setter
    @Getter
    public static class CreateReqDto {
        private String title;
        private String content;
        private Long userId;

        public Faq toEntity(){
            return Faq.of(getUserId(), getTitle(), getContent());
        }
    }
    @Setter
    @Getter
    public static class UpdateReqDto {
        private Long id;
        private String title;
        private String content;
    }

    @Builder
    @Setter
    @Getter
    public static class CreateResDto {
        private Long id;
    }

    @Setter
    @Getter
    public static class DetailResDto {
        private Long id;
        private Long userId;
        private String title;
        private String content;
        private String UserUsername;
    }

    @Setter
    @Getter
    public static class ListReqDto{
        private String title;
    }
}