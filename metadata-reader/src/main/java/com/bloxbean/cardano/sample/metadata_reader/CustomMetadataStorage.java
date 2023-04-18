package com.bloxbean.cardano.sample.metadata_reader;

import com.bloxbean.cardano.yaci.store.metadata.domain.TxMetadataLabel;
import com.bloxbean.cardano.yaci.store.metadata.storage.TxMetadataStorage;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

/**
 * Override default metadata storage. This is optional. If not provided, default metadata storage will be used.
 */
//@Component
@Slf4j
public class CustomMetadataStorage implements TxMetadataStorage {
    public CustomMetadataStorage() {
        log.info("CustomMetadataStorage >>>>>");
    }
    @Override
    public List<TxMetadataLabel> saveAll(List<TxMetadataLabel> txMetadataLabelList) {
        //do nothing
        return txMetadataLabelList;
    }

    @Override
    public List<TxMetadataLabel> findByTxHash(String txHash) {
        return Collections.emptyList();
    }
}
