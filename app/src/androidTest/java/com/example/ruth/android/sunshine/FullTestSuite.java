package com.example.ruth.android.sunshine;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by RUTH on 15/04/05.
 */
public class FullTestSuite extends TestSuite
{
    public static Test suite()
    {
        return new TestSuiteBuilder(FullTestSuite.class).includeAllPackagesUnderHere().build();
    }

    public FullTestSuite() {
    }
}
