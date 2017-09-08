package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Xiaoqian on 5/8/17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String url;
    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
        if (url.length() < 1 || url == null) {
            return null;
        }
        // Perform the HTTP request for earthquake data and process the response

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(url);
        return result;
    }
}
