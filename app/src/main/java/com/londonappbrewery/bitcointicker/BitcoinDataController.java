package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataController {
    private double mPrice;
    public static BitcoinDataController fromJson(JSONObject jsonObject)
    {
        BitcoinDataController bitcoinData = new BitcoinDataController();
        try
        {
            bitcoinData.mPrice = jsonObject.getDouble("last");
            return bitcoinData;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public String getPrice() {
        return Double.toString(mPrice);
    }
}
