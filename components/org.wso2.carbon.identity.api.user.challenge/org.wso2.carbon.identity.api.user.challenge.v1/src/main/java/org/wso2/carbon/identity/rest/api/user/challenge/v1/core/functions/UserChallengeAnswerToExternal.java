/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.user.challenge.v1.core.functions;

import org.wso2.carbon.identity.recovery.model.UserChallengeAnswer;
import org.wso2.carbon.identity.rest.api.user.challenge.v1.dto.UserChallengeAnswerDTO;

import java.util.function.Function;

public class UserChallengeAnswerToExternal implements Function<UserChallengeAnswer, UserChallengeAnswerDTO> {

    @Override
    public UserChallengeAnswerDTO apply(UserChallengeAnswer userChallengeAnswer) {
        UserChallengeAnswerDTO userChallengeAnswerDTO = new UserChallengeAnswerDTO();
        userChallengeAnswerDTO.setAnswer(userChallengeAnswer.getAnswer());
        userChallengeAnswerDTO.setQuestion(userChallengeAnswer.getQuestion().getQuestion());
        userChallengeAnswerDTO.setQuestionSetId(userChallengeAnswer.getQuestion().getQuestionSetId());
        return userChallengeAnswerDTO;
    }
}
