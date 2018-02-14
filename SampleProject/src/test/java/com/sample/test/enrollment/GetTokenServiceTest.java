package com.sample.test.enrollment;

import com.sample.enrollment.Enrollment;
import com.sample.enrollment.GetTokenService;
import com.sample.enrollment.InitialContextEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GetTokenServiceTest {

    @InjectMocks
    GetTokenService objectUnderTest;

    @Mock
    Enrollment enrollment;

    @Before
    public void setUp(){

    }

    @Test
    public void should_initContextData_hasNotEmpty_flowId_andIssuerId_onInitContext() {

        InitialContextEntity initContextData = objectUnderTest.getInitContextData(randomUUID().toString());
        assertThat(initContextData.getFlowId()).isNotEmpty();
        assertThat(initContextData.getIssuerId()).isNotEmpty();
    }
}
