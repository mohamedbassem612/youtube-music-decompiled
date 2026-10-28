package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class DrawKey {
    private final long handle;

    private /* synthetic */ DrawKey(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DrawKey m521boximpl(long j) {
        return new DrawKey(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m523equalsimpl(long j, Object obj) {
        return (obj instanceof DrawKey) && j == ((DrawKey) obj).m527unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m524equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m525hashCodeimpl(long j) {
        return DrawKey$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m526toStringimpl(long j) {
        return egq.a(j, "DrawKey(handle=");
    }

    public boolean equals(Object obj) {
        return m523equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m525hashCodeimpl(this.handle);
    }

    public String toString() {
        return m526toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m527unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m522constructorimpl(long j) {
        return j;
    }
}
