package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fll implements flm {
    final int a;
    final Interpolator b;

    public fll(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    @Override // defpackage.flm
    public final fms a(fmo fmoVar) {
        return new fmr(this.a, fmoVar, this.b);
    }
}
