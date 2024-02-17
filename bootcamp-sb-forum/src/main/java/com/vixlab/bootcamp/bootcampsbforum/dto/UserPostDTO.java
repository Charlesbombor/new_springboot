package com.vixlab.bootcamp.bootcampsbforum.dto;

import java.util.List;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UserPostDTO {
  private String username;
  private String email;
  private String phone;

  private List<Post> postDTOs;

  
}
