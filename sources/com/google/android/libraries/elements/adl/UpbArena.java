package com.google.android.libraries.elements.adl;

import dalvik.annotation.optimization.CriticalNative;
import dalvik.annotation.optimization.FastNative;
import defpackage.mev;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class UpbArena {
    public final long a;
    private final UpbAlloc alloc;

    public UpbArena(long j) {
        this.a = j;
        this.alloc = jniGetUpbAlloc(j);
        mev.a(this, j);
    }

    public static UpbArena a(long j) {
        long jRotateRight = Long.rotateRight(j ^ (-6148914691236517206L), 16);
        if (jRotateRight != 0) {
            return new UpbArena(jRotateRight);
        }
        throw new IllegalArgumentException("Invalid null handle passed from C++");
    }

    public static UpbArena b(long j) {
        long jRotateRight = Long.rotateRight(j ^ (-1229782938247303442L), 16);
        if (jRotateRight == 0) {
            throw new IllegalArgumentException("Invalid null handle passed from C++");
        }
        if (jniIncrementReferenceCount(jRotateRight)) {
            return new UpbArena(jRotateRight);
        }
        return null;
    }

    public static void c(long j) {
        long jRotateRight = Long.rotateRight(j ^ (-6148914691236517206L), 16);
        if (jRotateRight != 0) {
            jniDecrementReferenceCount(jRotateRight);
        }
    }

    @CriticalNative
    private static native long jniDebugGetRefCount(long j);

    @CriticalNative
    public static native void jniDecrementReferenceCount(long j);

    public static native void jniEnableDirectByteBufferAllocator();

    @CriticalNative
    private static native void jniFuse(long j, long j2);

    @FastNative
    private static native UpbAlloc jniGetUpbAlloc(long j);

    @CriticalNative
    public static native boolean jniIncrementReferenceCount(long j);

    @CriticalNative
    private static native long jniNewInstance();

    public final void d(UpbArena upbArena) {
        long j = this.a;
        long j2 = upbArena.a;
        if (j != j2) {
            jniFuse(j, j2);
        }
    }

    public UpbArena() {
        this(jniNewInstance());
    }
}
