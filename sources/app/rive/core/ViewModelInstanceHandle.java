package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelInstanceHandle {
    private final long handle;

    private /* synthetic */ ViewModelInstanceHandle(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ViewModelInstanceHandle m578boximpl(long j) {
        return new ViewModelInstanceHandle(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m580equalsimpl(long j, Object obj) {
        return (obj instanceof ViewModelInstanceHandle) && j == ((ViewModelInstanceHandle) obj).m584unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m581equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m582hashCodeimpl(long j) {
        return ViewModelInstanceHandle$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m583toStringimpl(long j) {
        return egq.a(j, "ViewModelInstanceHandle(");
    }

    public boolean equals(Object obj) {
        return m580equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m582hashCodeimpl(this.handle);
    }

    public String toString() {
        return m583toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m584unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m579constructorimpl(long j) {
        return j;
    }
}
