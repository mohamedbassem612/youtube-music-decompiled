package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdp implements Interpolator {
    private final /* synthetic */ int $cid;

    public bdp(int i) {
        this.$cid = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.$cid != 0) {
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
