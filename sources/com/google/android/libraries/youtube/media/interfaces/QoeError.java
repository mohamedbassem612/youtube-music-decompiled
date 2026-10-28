package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class QoeError {
    final String code;
    final ArrayList details;

    public QoeError(String str, ArrayList arrayList) {
        this.code = str;
        this.details = arrayList;
    }

    public String getCode() {
        return this.code;
    }

    public ArrayList getDetails() {
        return this.details;
    }

    public String toString() {
        return "QoeError{code=" + this.code + ",details=" + String.valueOf(this.details) + '}';
    }
}
