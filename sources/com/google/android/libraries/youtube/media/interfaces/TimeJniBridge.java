package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class TimeJniBridge {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends TimeJniBridge {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native Time abs(Time time, int i);

        public static native Time absSubtract(Time time, Time time2, int i);

        public static native Time add(Time time, Time time2, int i);

        public static native int compare(Time time, Time time2);

        public static native Time convertTimescale(Time time, long j, int i);

        public static native Time divide(Time time, long j, int i);

        public static native boolean equals(Time time, Time time2);

        public static native Time fromSeconds(double d, long j, int i);

        public static native Time multiply(Time time, long j, int i);

        public static native void nativeDestroy(long j);

        public static native Time negate(Time time, int i);

        public static native Time reduce(Time time);

        public static native Time subtract(Time time, Time time2, int i);

        public void _djinni_private_destroy() {
            this.destroyed.getAndSet(true);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static Time abs(Time time, int i) {
        return CppProxy.abs(time, i);
    }

    public static Time absSubtract(Time time, Time time2, int i) {
        return CppProxy.absSubtract(time, time2, i);
    }

    public static Time add(Time time, Time time2, int i) {
        return CppProxy.add(time, time2, i);
    }

    public static int compare(Time time, Time time2) {
        return CppProxy.compare(time, time2);
    }

    public static Time convertTimescale(Time time, long j, int i) {
        return CppProxy.convertTimescale(time, j, i);
    }

    public static Time divide(Time time, long j, int i) {
        return CppProxy.divide(time, j, i);
    }

    public static boolean equals(Time time, Time time2) {
        return CppProxy.equals(time, time2);
    }

    public static Time fromSeconds(double d, long j, int i) {
        return CppProxy.fromSeconds(d, j, i);
    }

    public static Time multiply(Time time, long j, int i) {
        return CppProxy.multiply(time, j, i);
    }

    public static Time negate(Time time, int i) {
        return CppProxy.negate(time, i);
    }

    public static Time reduce(Time time) {
        return CppProxy.reduce(time);
    }

    public static Time subtract(Time time, Time time2, int i) {
        return CppProxy.subtract(time, time2, i);
    }
}
