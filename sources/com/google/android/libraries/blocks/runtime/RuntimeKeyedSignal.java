package com.google.android.libraries.blocks.runtime;

import defpackage.avmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeKeyedSignal {
    public final ClientCreatorProxy b;
    private final avmm c = new avmm();
    public final int a = 247876952;

    public RuntimeKeyedSignal(ClientCreatorProxy clientCreatorProxy) {
        this.b = clientCreatorProxy;
    }

    protected final void finalize() {
        this.c.dispose();
    }
}
