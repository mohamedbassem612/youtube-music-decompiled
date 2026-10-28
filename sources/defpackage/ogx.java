package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogx {
    public static final Interpolator a;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
        a = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
