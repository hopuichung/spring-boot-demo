package com.mhho.demo.model;

public class Post {

    public Post() {
    }

    public Post(String postId, String postBody) {
        this.postId = postId;
        this.postBody = postBody;
    }

    private String postId;

    private String postBody;


    public String getPostId() {
        return this.postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostBody() {
        return this.postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    @Override
    public String toString() {
        return "{" +
            " postId='" + getPostId() + "'" +
            ", postBody='" + getPostBody() + "'" +
            "}";
    }

}
