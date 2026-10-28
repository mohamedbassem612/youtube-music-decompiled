package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dtp {
    private dtp() {
    }

    public static Interpolator d(Context context, int i) {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        a.aP(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }

    public boolean b() {
        return false;
    }

    public boolean c(int[] iArr) {
        return false;
    }

    public dtp(char[] cArr) {
    }
}
