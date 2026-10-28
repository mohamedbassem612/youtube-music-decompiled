package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpRequest {
    final byte[] body;
    final boolean followRedirects;
    final ArrayList headers;
    final HttpMethod method;
    final String uri;

    public HttpRequest(String str, ArrayList arrayList, byte[] bArr, HttpMethod httpMethod, boolean z) {
        this.uri = str;
        this.headers = arrayList;
        this.body = bArr;
        this.method = httpMethod;
        this.followRedirects = z;
    }

    public byte[] getBody() {
        return this.body;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public ArrayList getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public String getUri() {
        return this.uri;
    }

    public String toString() {
        HttpMethod httpMethod = this.method;
        byte[] bArr = this.body;
        return "HttpRequest{uri=" + this.uri + ",headers=" + String.valueOf(this.headers) + ",body=" + String.valueOf(bArr) + ",method=" + String.valueOf(httpMethod) + ",followRedirects=" + this.followRedirects + '}';
    }
}
