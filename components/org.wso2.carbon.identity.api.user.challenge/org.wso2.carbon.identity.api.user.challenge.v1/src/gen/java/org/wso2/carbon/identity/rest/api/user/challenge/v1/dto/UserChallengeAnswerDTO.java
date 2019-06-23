package org.wso2.carbon.identity.rest.api.user.challenge.v1.dto;

import org.wso2.carbon.identity.rest.api.user.challenge.v1.dto.ChallengeQuestionDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class UserChallengeAnswerDTO  {
  
  
  
  private ChallengeQuestionDTO challengeQuestion = null;
  
  @NotNull
  private String answer = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("challengeQuestion")
  public ChallengeQuestionDTO getChallengeQuestion() {
    return challengeQuestion;
  }
  public void setChallengeQuestion(ChallengeQuestionDTO challengeQuestion) {
    this.challengeQuestion = challengeQuestion;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChallengeAnswerDTO {\n");
    
    sb.append("  challengeQuestion: ").append(challengeQuestion).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
