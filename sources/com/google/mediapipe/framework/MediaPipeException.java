package com.google.mediapipe.framework;

import defpackage.ahxn;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MediaPipeException extends RuntimeException {
    public MediaPipeException(int i, String str) {
        super(ahxn.values()[i].s + ": " + str);
        ahxn ahxnVar = ahxn.values()[i];
    }

    MediaPipeException(int i, byte[] bArr) {
        this(i, new String(bArr, StandardCharsets.UTF_8));
    }
}
