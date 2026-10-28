package com.youtube.android.libraries.elements.templates;

import defpackage.axoz;
import defpackage.meg;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class EkoProcessor {
    static {
        meg.a();
    }

    public static axoz a(byte[] bArr, byte[] bArr2) {
        byte[][] bArr3 = {null, null};
        Status statusNativeProcess = nativeProcess(bArr, bArr2, bArr3);
        return statusNativeProcess.e() ? new axoz(statusNativeProcess, bArr3[0], null) : new axoz(statusNativeProcess, null, null);
    }

    private static native Status nativeProcess(byte[] bArr, byte[] bArr2, byte[][] bArr3);
}
