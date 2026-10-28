package com.google.cardboard.sdk.qrcode;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class UrlFactory {
    private static final String HTTPS_SCHEME = "https";
    public static final String TAG = "UrlFactory";

    public HttpURLConnection openHttpsConnection(Uri uri) throws IOException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(uri.buildUpon().scheme(HTTPS_SCHEME).build().toString()).openConnection();
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return (HttpURLConnection) uRLConnectionOpenConnection;
            }
            Log.w(TAG, "Expected HttpURLConnection");
            throw new IllegalArgumentException("Expected HttpURLConnection");
        } catch (MalformedURLException e) {
            Log.w(TAG, e.toString());
            return null;
        }
    }
}
