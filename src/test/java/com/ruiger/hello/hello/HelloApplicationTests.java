package com.ruiger.hello.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Test
    public void contextLoads() {
        run();
    }

    @Resource
    private KieSession kieSession;

    public static void main(String[] args) {



    }

    private void run(){
        final State a = new State( "A" );
        final State b = new State( "B" );
        final State c = new State( "C" );
        final State d = new State( "D" );

        kieSession.insert( a );
        kieSession.insert( b );
        kieSession.insert( c );
        kieSession.insert( d );

        int i = kieSession.fireAllRules();

        System.out.println(i+"+++++++++++++++");

        kieSession.dispose();
    }

}
