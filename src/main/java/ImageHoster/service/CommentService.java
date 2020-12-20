package ImageHoster.service;


import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    // Using Constructor based Dependency Injection.
    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    // Creates new comment for the image
    public void createNewComment(Comment comment) {
        commentRepository.createComment(comment);
    }
}
