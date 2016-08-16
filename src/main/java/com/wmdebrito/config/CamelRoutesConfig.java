package com.wmdebrito.config;

import com.wmdebrito.processor.GitHubProcessor;
import com.wmdebrito.processor.SummaryProcessor;
import com.wmdebrito.processor.TwitterProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by DELL-WAGNER on 15-Aug-16.
 */
@Component
public class CamelRoutesConfig extends RouteBuilder {
    @Autowired
    GitHubProcessor gitHubProcessor;

    @Autowired
    TwitterProcessor twitterProcessor;

    @Autowired
    SummaryProcessor summaryProcessor;

    @Override
    public void configure() throws Exception {

        from("direct:gitHubRepo")
                .process(gitHubProcessor)
                .to("direct:twitter");


        from("direct:twitter")
                .process(twitterProcessor)
                .to("direct:summary");

        from("direct:summary")
                .process(summaryProcessor);
    }

}
