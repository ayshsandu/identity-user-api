package org.wso2.carbon.identity.rest.api.user.challenge;

import org.wso2.carbon.identity.rest.api.user.challenge.dto.*;
import org.wso2.carbon.identity.rest.api.user.challenge.MeApiService;
import org.wso2.carbon.identity.rest.api.user.challenge.factories.MeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.identity.rest.api.user.challenge.dto.ChallengeAnswerDTO;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.ErrorDTO;
import java.util.List;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.UserChallengeAnswerDTO;
import org.wso2.carbon.identity.rest.api.user.challenge.dto.ChallengeSetDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/me")


@io.swagger.annotations.Api(value = "/me", description = "the me API")
public class MeApi  {

   private final MeApiService delegate = MeApiServiceFactory.getMeApi();

    @POST
    @Path("/challenge-answers")
    
    
    @io.swagger.annotations.ApiOperation(value = "answers a new challenge question", notes = "Adds a new challenge question answer to the system\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Item Created"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Element Already Exists"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response addChallengeAnswersForLoggedInUser(@ApiParam(value = "username of the user",required=true ) @PathParam("user-id")  String userId,
    @ApiParam(value = "challenge-question with answer"  ) List<ChallengeAnswerDTO> challengeAnswer)
    {
    return delegate.addChallengeAnswersForLoggedInUser(userId,challengeAnswer);
    }
    @DELETE
    @Path("/challenge-answers/{challenge-set-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "removes a challenge question answer", notes = "Removes existing challenge question answers of authenticated user\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Item Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified resource is not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response deleteChallengeAnswerOfLoggedInUser(@ApiParam(value = "Challenge Question set Id",required=true ) @PathParam("challenge-set-id")  String challengeSetId,
    @ApiParam(value = "username of the user",required=true ) @PathParam("user-id")  String userId)
    {
    return delegate.deleteChallengeAnswerOfLoggedInUser(challengeSetId,userId);
    }
    @DELETE
    @Path("/challenge-answers")
    
    
    @io.swagger.annotations.ApiOperation(value = "removes challenge question answers", notes = "Removes an existing challenge question answers of the authenticated user\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Item Deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified resource is not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response deleteChallengeAnswersOfLoggedInUser(@ApiParam(value = "username of the user",required=true ) @PathParam("user-id")  String userId)
    {
    return delegate.deleteChallengeAnswersOfLoggedInUser(userId);
    }
    @GET
    @Path("/challenge-answers")
    
    
    @io.swagger.annotations.ApiOperation(value = "get user's challenge answers", notes = "Get answered challenges in the system for a specific user.\n", response = UserChallengeAnswerDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response getAnsweredChallengesOfLoggedInUser(@ApiParam(value = "username of the user",required=true ) @PathParam("user-id")  String userId)
    {
    return delegate.getAnsweredChallengesOfLoggedInUser(userId);
    }
    @GET
    @Path("/challenges")
    
    
    @io.swagger.annotations.ApiOperation(value = "searches challenge-question for authenticated user", notes = "Retrieve the\navailable challenge-question in the system for the authenticated user\n", response = ChallengeSetDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response getChallengesForLoggedInUser(@ApiParam(value = "number of records to skip for pagination") @QueryParam("offset")  Integer offset,
    @ApiParam(value = "maximum number of records to return") @QueryParam("limit")  Integer limit)
    {
    return delegate.getChallengesForLoggedInUser(offset,limit);
    }
    @PUT
    @Path("/challenge-answers/{challenge-set-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "answers a new challenge question", notes = "Adds a new challenge question answer to the system for authenticated user.\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The specified resource is not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error") })

    public Response updateChallengeAnswerOfLoggedInUser(@ApiParam(value = "Challenge Question set Id",required=true ) @PathParam("challenge-set-id")  String challengeSetId,
    @ApiParam(value = "username of the user",required=true ) @PathParam("user-id")  String userId,
    @ApiParam(value = "challenge-question with answer"  ) ChallengeAnswerDTO challengeAnswer)
    {
    return delegate.updateChallengeAnswerOfLoggedInUser(challengeSetId,userId,challengeAnswer);
    }
}

