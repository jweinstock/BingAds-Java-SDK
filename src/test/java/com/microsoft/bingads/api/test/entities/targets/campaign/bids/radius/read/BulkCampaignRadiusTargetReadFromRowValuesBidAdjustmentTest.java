package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius.BulkCampaignRadiusTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusTargetReadFromRowValuesBidAdjustmentTest extends BulkCampaignRadiusTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123}            
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Bid Adjustment", this.datum, this.expectedResult, new Function<BulkCampaignRadiusTargetBid, Integer>() {
            @Override
            public Integer apply(BulkCampaignRadiusTargetBid c) {
                return c.getRadiusTargetBid().getBidAdjustment();
            }
        });
    }
}
