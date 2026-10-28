package com.google.research.xeno.effect;

import defpackage.atvg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class EventManager {
    public static final String a = "EventManager";
    public long b;
    public atvg c;

    protected EventManager() {
    }

    static EventManager b(atvg atvgVar, long j) {
        EventManager eventManager = new EventManager();
        eventManager.c(atvgVar, j);
        return eventManager;
    }

    public static native long nativeCreateHandle();

    public static native void nativeDestroyHandle(long j);

    protected static native long nativeGetEventManager(long j);

    public static native void nativeSendEvent(long j, byte[] bArr);

    public final void c(atvg atvgVar, long j) {
        this.c = atvgVar;
        this.b = j;
    }
}
