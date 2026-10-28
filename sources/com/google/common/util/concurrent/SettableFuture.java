package com.google.common.util.concurrent;

import defpackage.ahcg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class SettableFuture extends ahcg {
    private SettableFuture() {
    }

    public static SettableFuture create() {
        return new SettableFuture();
    }

    @Override // defpackage.ahch
    public boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // defpackage.ahch
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // defpackage.ahch
    public boolean setFuture(ListenableFuture listenableFuture) {
        return super.setFuture(listenableFuture);
    }
}
