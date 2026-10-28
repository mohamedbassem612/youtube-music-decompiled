package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fnk extends fnp {
    private final TimeInterpolator e;

    public fnk(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    @Override // defpackage.fnp
    protected final float a(long j) {
        return this.e.getInterpolation(f("default_input").c);
    }
}
