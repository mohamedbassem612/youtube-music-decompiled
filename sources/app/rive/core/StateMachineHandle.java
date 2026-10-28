package app.rive.core;

import defpackage.egq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class StateMachineHandle {
    private final long handle;

    private /* synthetic */ StateMachineHandle(long j) {
        this.handle = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StateMachineHandle m564boximpl(long j) {
        return new StateMachineHandle(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m566equalsimpl(long j, Object obj) {
        return (obj instanceof StateMachineHandle) && j == ((StateMachineHandle) obj).m570unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m567equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m568hashCodeimpl(long j) {
        return StateMachineHandle$$ExternalSyntheticBackport0.m(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m569toStringimpl(long j) {
        return egq.a(j, "StateMachineHandle(");
    }

    public boolean equals(Object obj) {
        return m566equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m568hashCodeimpl(this.handle);
    }

    public String toString() {
        return m569toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m570unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m565constructorimpl(long j) {
        return j;
    }
}
