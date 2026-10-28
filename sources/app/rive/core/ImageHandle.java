package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageHandle {
    private final long handle;

    private /* synthetic */ ImageHandle(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageHandle m551boximpl(long j) {
        return new ImageHandle(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m553equalsimpl(long j, Object obj) {
        return (obj instanceof ImageHandle) && j == ((ImageHandle) obj).m557unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m554equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m555hashCodeimpl(long j) {
        return ImageHandle$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m556toStringimpl(long j) {
        return egq.a(j, "ImageHandle(");
    }

    public boolean equals(Object obj) {
        return m553equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m555hashCodeimpl(this.handle);
    }

    public String toString() {
        return m556toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m557unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m552constructorimpl(long j) {
        return j;
    }
}
