package com.resumeprojects.postservice.DTO;

import lombok.Data;

@Data
public class PostReqDto {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostReqDto{" +
                "content='" + content + '\'' +
                '}';
    }
}
