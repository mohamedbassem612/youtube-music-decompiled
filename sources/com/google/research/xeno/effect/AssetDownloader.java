package com.google.research.xeno.effect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface AssetDownloader {

    /* JADX INFO: compiled from: PG */
    public interface DownloadCallback {
        void onCompletion(String str, String str2);
    }

    void downloadAsset(String str, DownloadCallback downloadCallback);
}
