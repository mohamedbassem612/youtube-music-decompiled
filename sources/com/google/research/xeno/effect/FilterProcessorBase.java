package com.google.research.xeno.effect;

import defpackage.atth;
import defpackage.atvq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class FilterProcessorBase extends atvq {
    public volatile Effect a;
    private EventManager b;

    protected FilterProcessorBase(atth atthVar) {
        super(atthVar);
    }

    protected static native long nativeGetEventManager(long j);

    protected static native long nativeGetUserInteractionManager(long j);

    protected static native long nativeNewVideoProcessor(int i, long j, long j2, long[] jArr, long j3, byte[] bArr, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2, NativeCallbacks$AuxOutputCallback nativeCallbacks$AuxOutputCallback);

    private static native void nativeRelease(long j);

    public static native void nativeSendPresentationTimedVideoProcessorFramePacket(long j, long j2, long j3, long j4, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendVideoProcessorAudioPacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSetEffect(long j, long j2, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStartVideoProcessing(long j, int i, long j2, long j3, int i2, int i3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStopVideoProcessing(long j, Callbacks$StatusCallback callbacks$StatusCallback);

    public final EventManager g() {
        return this.b;
    }

    @Override // defpackage.atvq
    protected final void iC(long j) {
        nativeRelease(j);
    }

    @Override // defpackage.atvq
    protected final void m(long j) {
        UserInteractionManager.e(this, nativeGetUserInteractionManager(j));
        this.b = EventManager.b(this, nativeGetEventManager(j));
        super.m(j);
    }
}
