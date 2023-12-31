package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Comment type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Comments", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byPost", fields = {"postID"})
@Index(name = "byUser", fields = {"userID"})
public final class Comment implements Model {
  public static final QueryField ID = field("Comment", "id");
  public static final QueryField MESSAGE = field("Comment", "message");
  public static final QueryField POST_ID = field("Comment", "postID");
  public static final QueryField USER_ID = field("Comment", "userID");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String message;
  private final @ModelField(targetType="ID", isRequired = true) String postID;
  private final @ModelField(targetType="ID", isRequired = true) String userID;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public String getMessage() {
      return message;
  }
  
  public String getPostId() {
      return postID;
  }
  
  public String getUserId() {
      return userID;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Comment(String id, String message, String postID, String userID) {
    this.id = id;
    this.message = message;
    this.postID = postID;
    this.userID = userID;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Comment comment = (Comment) obj;
      return ObjectsCompat.equals(getId(), comment.getId()) &&
              ObjectsCompat.equals(getMessage(), comment.getMessage()) &&
              ObjectsCompat.equals(getPostId(), comment.getPostId()) &&
              ObjectsCompat.equals(getUserId(), comment.getUserId()) &&
              ObjectsCompat.equals(getCreatedAt(), comment.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), comment.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getMessage())
      .append(getPostId())
      .append(getUserId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Comment {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("message=" + String.valueOf(getMessage()) + ", ")
      .append("postID=" + String.valueOf(getPostId()) + ", ")
      .append("userID=" + String.valueOf(getUserId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static PostIdStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Comment justId(String id) {
    return new Comment(
      id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      message,
      postID,
      userID);
  }
  public interface PostIdStep {
    UserIdStep postId(String postId);
  }
  

  public interface UserIdStep {
    BuildStep userId(String userId);
  }
  

  public interface BuildStep {
    Comment build();
    BuildStep id(String id);
    BuildStep message(String message);
  }
  

  public static class Builder implements PostIdStep, UserIdStep, BuildStep {
    private String id;
    private String postID;
    private String userID;
    private String message;
    @Override
     public Comment build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Comment(
          id,
          message,
          postID,
          userID);
    }
    
    @Override
     public UserIdStep postId(String postId) {
        Objects.requireNonNull(postId);
        this.postID = postId;
        return this;
    }
    
    @Override
     public BuildStep userId(String userId) {
        Objects.requireNonNull(userId);
        this.userID = userId;
        return this;
    }
    
    @Override
     public BuildStep message(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String message, String postId, String userId) {
      super.id(id);
      super.postId(postId)
        .userId(userId)
        .message(message);
    }
    
    @Override
     public CopyOfBuilder postId(String postId) {
      return (CopyOfBuilder) super.postId(postId);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
    
    @Override
     public CopyOfBuilder message(String message) {
      return (CopyOfBuilder) super.message(message);
    }
  }
  
}
