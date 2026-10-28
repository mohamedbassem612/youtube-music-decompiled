package defpackage;

import android.view.MotionEvent;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abkp implements abko {
    public final MotionEvent a;
    public final int b;
    public final Duration c;

    public abkp(MotionEvent motionEvent, int i, boolean z, Duration duration) {
        this.a = motionEvent;
        this.b = i;
        this.c = duration;
    }

    public static int a(int i, int i2) {
        float f = i2;
        float f2 = 0.33333334f * f;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        float f5 = i;
        if (f5 < f3 - f4) {
            return 2;
        }
        return f5 > f3 + f4 ? 1 : 0;
    }
}
