/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.hdfs.contract;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.contract.AbstractContractMkdirTest;
import org.apache.hadoop.fs.contract.AbstractFSContract;
import org.junit.experimental.categories.Category;

import com.oracle.bmc.hdfs.IntegrationTestCategory;

@Category({IntegrationTestCategory.class})
public class TestBmcContractMkdir extends AbstractContractMkdirTest {
    @Override
    protected AbstractFSContract createContract(final Configuration conf) {
        return new BmcContract(conf);
    }
}
