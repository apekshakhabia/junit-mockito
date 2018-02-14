package com.sample.enrollment;

public class GetTokenService implements ContextInitializerWrapper{


    public InitialContextEntity getInitContextData(String id) {
        Enrollment enrollment = getEnrollment(id);
        return new InitialContextEntity(enrollment.getFlowId(), enrollment.getIssuerId());

    }


    public Enrollment getEnrollment(String id){
        return new Enrollment(id, id);
    }

}





