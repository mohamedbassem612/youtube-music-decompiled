package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MetadataStore {
    public abstract void readDataAsync(String str, MetadataStoreCallbacks metadataStoreCallbacks);

    public abstract void writeData(String str, byte[] bArr);
}
