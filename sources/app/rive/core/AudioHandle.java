package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AudioHandle {
    private final long handle;

    private /* synthetic */ AudioHandle(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AudioHandle m377boximpl(long j) {
        return new AudioHandle(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m379equalsimpl(long j, Object obj) {
        return (obj instanceof AudioHandle) && j == ((AudioHandle) obj).m383unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m380equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m381hashCodeimpl(long j) {
        return AudioHandle$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m382toStringimpl(long j) {
        return egq.a(j, "AudioHandle(");
    }

    public boolean equals(Object obj) {
        return m379equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m381hashCodeimpl(this.handle);
    }

    public String toString() {
        return m382toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m383unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m378constructorimpl(long j) {
        return j;
    }
}
