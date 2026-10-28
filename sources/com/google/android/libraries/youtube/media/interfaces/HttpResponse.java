package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpResponse {
    final ArrayList headers;
    final int status;

    public HttpResponse(int i, ArrayList arrayList) {
        this.status = i;
        this.headers = arrayList;
    }

    public ArrayList getHeaders() {
        return this.headers;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "HttpResponse{status=" + this.status + ",headers=" + String.valueOf(this.headers) + '}';
    }
}
