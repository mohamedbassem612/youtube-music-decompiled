package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ArtboardHandle {
    private final long handle;

    private /* synthetic */ ArtboardHandle(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ArtboardHandle m370boximpl(long j) {
        return new ArtboardHandle(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m372equalsimpl(long j, Object obj) {
        return (obj instanceof ArtboardHandle) && j == ((ArtboardHandle) obj).m376unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m373equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m374hashCodeimpl(long j) {
        return ArtboardHandle$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m375toStringimpl(long j) {
        return egq.a(j, "ArtboardHandle(");
    }

    public boolean equals(Object obj) {
        return m372equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m374hashCodeimpl(this.handle);
    }

    public String toString() {
        return m375toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m376unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m371constructorimpl(long j) {
        return j;
    }
}
