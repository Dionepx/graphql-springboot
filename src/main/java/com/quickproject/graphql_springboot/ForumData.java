package com.quickproject.graphql_springboot;

record Post(String id, String content) {

}

record Comment(String id, String content, String postId) {

}
