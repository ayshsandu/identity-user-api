package org.wso2.carbon.identity.rest.api.user.challenge;

import org.wso2.carbon.identity.rest.api.user.challenge.*;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.*;

import org.wso2.carbon.identity.rest.api.user.challenge.dto.ChallengeAnswerDTO;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.ErrorDTO;
import java.util.List;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.UserChallengeAnswerDTO;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.ChallengeSetDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class UserIdApiService {
    public abstract Response addChallengeAnswersOfAUser(String userId,List<ChallengeAnswerDTO> challengeAnswer);
    public abstract Response deleteChallengeAnswerOfAUser(String challengeSetId,String userId);
    public abstract Response deleteChallengeAnswersOfAUser(String userId);
    public abstract Response getAnsweredChallengesOfAUser(String userId);
    public abstract Response getChallengesForAUser(String userId,Integer offset,Integer limit);
    public abstract Response updateChallengeAnswerOfAUser(String challengeSetId,String userId,ChallengeAnswerDTO challengeAnswer);
    public abstract Response updateChallengeAnswersOfAUser(String userId,List<ChallengeAnswerDTO> challengeAnswers);
}

