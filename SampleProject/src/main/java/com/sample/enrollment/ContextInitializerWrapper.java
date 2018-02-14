package com.sample.enrollment;

public interface ContextInitializerWrapper<IN, OUT> {

    public abstract InitialContextEntity getInitContextData(String in);
}