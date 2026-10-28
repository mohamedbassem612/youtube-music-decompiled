package defpackage;

import android.view.Choreographer;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oww implements Choreographer.FrameCallback {
    long a = 0;
    int b = 0;
    final boolean c;
    final Interpolator d;
    final long e;
    final int f;
    final /* synthetic */ int g;
    final /* synthetic */ boolean h;
    final /* synthetic */ owy i;
    final /* synthetic */ atlh j;

    public oww(owy owyVar, atlh atlhVar, int i, boolean z) {
        int iAS;
        this.j = atlhVar;
        this.g = i;
        this.h = z;
        this.i = owyVar;
        boolean z2 = true;
        if (atlhVar.e == null && (Memory.peekByte(atlhVar.c + 8) & 8) == 0) {
            z2 = false;
        }
        this.c = z2;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = null;
        if (z2 && (iAS = a.aS(Memory.peekInt(atlhVar.aV().c + 12, false))) != 0 && iAS == 3) {
            accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        }
        this.d = accelerateDecelerateInterpolator;
        float fPeekLong = 100.0f;
        if (z2 && (Memory.peekByte(atlhVar.aV().c + 8) & 2) != 0) {
            fPeekLong = Memory.peekLong(atlhVar.aV().c + 16, false);
        }
        this.e = (long) (((i / owyVar.n) * 1.0E9f) / fPeekLong);
        this.f = (Memory.peekByte(atlhVar.c + 8) & 2) != 0 ? Memory.peekInt(atlhVar.c + 16, false) : -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2 = this.a;
        if (j2 == 0) {
            this.a = j;
            j2 = j;
        }
        long j3 = j - j2;
        long j4 = this.e;
        if (j3 > j4) {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.f;
            if (i2 == -1 || i < i2) {
                this.a = 0L;
                return;
            }
            return;
        }
        Interpolator interpolator = this.d;
        float interpolation = j3 / j4;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        int i3 = this.g;
        owy owyVar = this.i;
        owyVar.l = (true == this.h ? 1 : -1) * interpolation * i3;
        owyVar.s();
    }
}
