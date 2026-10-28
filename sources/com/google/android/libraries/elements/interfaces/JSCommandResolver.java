package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSCommandResolver {
    public abstract Status resolve(byte[] bArr);

    public abstract Status resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver);

    public abstract Status resolveAsyncWithData(byte[] bArr, JSCommandData jSCommandData, JSPromiseResolver jSPromiseResolver);

    public abstract Status resolveWithData(byte[] bArr, JSCommandData jSCommandData);
}
