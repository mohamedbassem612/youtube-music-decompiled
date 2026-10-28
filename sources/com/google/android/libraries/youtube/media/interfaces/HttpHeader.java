package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpHeader {
    final String key;
    final String value;

    public HttpHeader(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "HttpHeader{key=" + this.key + ",value=" + this.value + '}';
    }
}
