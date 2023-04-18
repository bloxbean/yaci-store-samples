package com.bloxbean.cardano.sample.metadata_reader;

import com.bloxbean.cardano.yaci.store.metadata.domain.TxMetadataEvent;
import com.bloxbean.cardano.yaci.store.metadata.domain.TxMetadataLabel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Event listener to listen to metadata events
 */
@Component
@Slf4j
public class CurstomMetadataProcessor {

    @EventListener
    public void processMetadata(TxMetadataEvent event) {
        for (TxMetadataLabel txMetadataLabel : event.getTxMetadataList()) {
            log.info("Metadata >> " + txMetadataLabel);
        }
    }
}
