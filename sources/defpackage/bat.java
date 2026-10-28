package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bat {
    private final int a;
    private float b;
    private final Interpolator c;
    private final long d;

    public bat(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float g() {
        return 1.0f;
    }

    public float h() {
        Interpolator interpolator = this.c;
        float f = this.b;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int i() {
        return this.a;
    }

    public long j() {
        return this.d;
    }

    public void k(float f) {
        this.b = f;
    }
}
