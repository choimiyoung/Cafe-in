package kr.cafeIn.cafeorder.model.dto.request;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequest {

  @NotBlank
  @Email
  private String email;

  @NotBlank
  private String nickname;

  @NotBlank
  private String password;


}