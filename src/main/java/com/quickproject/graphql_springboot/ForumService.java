package com.quickproject.graphql_springboot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
class PostService {
    // Usando 'postStore' para indicar que é onde os posts são armazenados
    Map<String, Post> postStore = new HashMap<>();

    // Renomeado 'createPost' para 'addPostEntry' e 'content' para 'postContentData'
    Collection<Post> addPostEntry(String postContentData) {
        var newPostRecord = new Post(UUID.randomUUID().toString(), postContentData); // Renomeado 'newPost' para 'newPostRecord'
        postStore.put(newPostRecord.id(), newPostRecord);
        return postStore.values();
    }

    // Renomeado 'postById' para 'retrievePostById' e 'id' para 'postId'
    Post retrievePostById(String postId) {
        return postStore.get(postId);
    }

    public Post postById(String id) {
        return null;
    }

    public Collection<Post> createPost(String content) {
        return java.util.List.of();
    }
}

@Service
class CommentService {
    // Usando 'commentStore' para indicar que é onde os comentários são armazenados
    Map<String, Comment> commentStore = new HashMap<>();

    // Renomeado 'createComment' para 'submitComment' e 'content' para 'commentContentData', 'postId' para 'associatedPostId'
    Collection<Comment> submitComment(String commentContentData, String associatedPostId) {
        var newCommentRecord = new Comment(UUID.randomUUID().toString(), commentContentData, associatedPostId); // Renomeado 'newComment' para 'newCommentRecord'
        commentStore.put(newCommentRecord.id(), newCommentRecord);
        return commentStore.values();
    }

    // Renomeado 'findByPost' para 'findCommentsByPostId' e 'postId' para 'targetPostIdentifier'
    public Collection<Comment> findCommentsByPostId(String targetPostIdentifier) {
        return commentStore.values().stream()
                .filter(comment -> comment.postId().equals(targetPostIdentifier)).toList();
    }

    public Collection<Comment> createComment(String content, String postId) {
        return java.util.List.of();
    }

    public Collection<Comment> findByPost(String id) {
        return java.util.List.of();
    }
}