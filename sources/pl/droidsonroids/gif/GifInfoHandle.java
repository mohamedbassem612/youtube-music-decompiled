package pl.droidsonroids.gif;

import android.graphics.Bitmap;
import defpackage.a;
import defpackage.axsn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class GifInfoHandle {
    public volatile long a;

    static {
        axsn.b();
    }

    public GifInfoHandle(byte[] bArr) {
        this.a = openByteArray(bArr);
    }

    private static native void free(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getNumberOfFrames(long j);

    private static native int getWidth(long j);

    static native long openByteArray(byte[] bArr);

    private static native boolean reset(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    public static native void setOptions(long j, char c, boolean z);

    public final synchronized int a() {
        return getDuration(this.a);
    }

    public final synchronized int b(int i) {
        int numberOfFrames = getNumberOfFrames(this.a);
        if (i < 0 || i >= numberOfFrames) {
            throw new IndexOutOfBoundsException(a.ci((byte) 62, numberOfFrames, "Frame index is not in range <0;"));
        }
        return getFrameDuration(this.a, i);
    }

    public final synchronized int c() {
        return getHeight(this.a);
    }

    public final synchronized int d() {
        return getNumberOfFrames(this.a);
    }

    public final synchronized int e() {
        return getWidth(this.a);
    }

    public final synchronized void f() {
        free(this.a);
        this.a = 0L;
    }

    protected final void finalize() throws Throwable {
        try {
            f();
        } finally {
            super.finalize();
        }
    }

    public final synchronized void g(int i, Bitmap bitmap) {
        seekToFrame(this.a, i, bitmap);
    }

    public final synchronized void h() {
        reset(this.a);
    }
}
