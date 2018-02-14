package com.sample.test.employee;

import com.sample.employee.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// Junit with Mockito
@RunWith(MockitoJUnitRunner.class)
public class ManageEmployeeTest {

    // Inject all the mocks in ManageEmployee created in this class
    @InjectMocks
    private ManageEmployee manEmp;

    @Mock
    private EmployeeService service;

    @Mock
    private Employee emp;

    @Mock(answer = Answers.RETURNS_MOCKS)
    private Department dep;


    // To be executed before test
    @Before
    public void setUp(){

    }

    // test case for addEmployee
    @Test
    public void testAddEmployee(){
        // when
        when(service.addEmployee(emp)).thenReturn(emp);

        // then
        assertEquals(emp, manEmp.addEmployee(emp));

        // verify
        verify(service).addEmployee(emp);
    }

    // test case for getEmpOfDepartment
    @Test
    public void testGetEmpOfDepartment(){
        // when
        when(manEmp.getEmpOfDepartment(dep)).thenReturn(emp);
        when(emp.getName()).thenReturn("aaa");

        // then
        assertEquals(emp,manEmp.getEmpOfDepartment(dep));
        assertThat(dep).isNotNull();
        assertThat(emp).isNotNull();
        assertThat(dep.getEmp()).isNotNull();
        assertThat(emp.getName()).isNotEmpty();

        // verify
        verify(service).getEmpOfDepartment(dep);
    }

    // test case for returning randomEmployee
    @Test
    public void testRandomEmployee(){
        // when
        emp = manEmp.randomEmployee();

        // then
        assertThat(emp.getName()).isNotEmpty();
    }

    @After
    public void cleanUp(){

    }

}
