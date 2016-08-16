package com.wmdebrito.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wmdebrito.config.SummaryConfig;
import com.wmdebrito.model.summary.Summary;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

/**
 * Created by DELL-WAGNER on 16-Aug-16.
 */
@Component
public class SummaryProcessor implements Processor {
    @Autowired
    SummaryConfig summaryConfig;

    public void process(Exchange exchange) throws Exception {
        List<Summary> repoTweetInfo = (List<Summary>) exchange.getIn().getBody();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(summaryConfig.getFileName()), repoTweetInfo);
    }

}
