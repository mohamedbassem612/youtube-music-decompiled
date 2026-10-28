package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class TimeIntervalJniBridge {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends TimeIntervalJniBridge {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native Time clamp(TimeInterval timeInterval, Time time);

        public static native int compare(TimeInterval timeInterval, TimeInterval timeInterval2);

        public static native boolean containsTime(TimeInterval timeInterval, Time time);

        public static native TimeInterval convertToCommonTimescale(long j, Time time, int i, Time time2, int i2);

        public static native boolean equals(TimeInterval timeInterval, TimeInterval timeInterval2);

        public static native TimeInterval intersect(TimeInterval timeInterval, TimeInterval timeInterval2);

        public static native void nativeDestroy(long j);

        public static native TimeInterval union(TimeInterval timeInterval, TimeInterval timeInterval2);

        public void _djinni_private_destroy() {
            this.destroyed.getAndSet(true);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static Time clamp(TimeInterval timeInterval, Time time) {
        return CppProxy.clamp(timeInterval, time);
    }

    public static int compare(TimeInterval timeInterval, TimeInterval timeInterval2) {
        return CppProxy.compare(timeInterval, timeInterval2);
    }

    public static boolean containsTime(TimeInterval timeInterval, Time time) {
        return CppProxy.containsTime(timeInterval, time);
    }

    public static TimeInterval convertToCommonTimescale(long j, Time time, int i, Time time2, int i2) {
        return CppProxy.convertToCommonTimescale(j, time, i, time2, i2);
    }

    public static boolean equals(TimeInterval timeInterval, TimeInterval timeInterval2) {
        return CppProxy.equals(timeInterval, timeInterval2);
    }

    public static TimeInterval intersect(TimeInterval timeInterval, TimeInterval timeInterval2) {
        return CppProxy.intersect(timeInterval, timeInterval2);
    }

    public static TimeInterval union(TimeInterval timeInterval, TimeInterval timeInterval2) {
        return CppProxy.union(timeInterval, timeInterval2);
    }
}
