package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pw {
    public final float a;
    private final float b;
    private final float c;
    private final int d;
    private final long e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    public pw(float f, float f2, float f3, int i, long j) {
        this.b = f;
        this.c = f2;
        this.a = f3;
        this.d = i;
        this.e = j;
    }
}
