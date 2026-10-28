package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ban implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bbn a;
    final /* synthetic */ bbn b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ ci e;

    public ban(ci ciVar, bbn bbnVar, bbn bbnVar2, int i, View view) {
        this.e = ciVar;
        this.a = bbnVar;
        this.b = bbnVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bbb bavVar;
        ci ciVar = this.e;
        ciVar.n(valueAnimator.getAnimatedFraction());
        float fK = ciVar.k();
        Interpolator interpolator = baq.a;
        int i = Build.VERSION.SDK_INT;
        bbn bbnVar = this.a;
        if (i >= 36) {
            bavVar = new bba(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax(bbnVar);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw(bbnVar);
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVar) : new bau(bbnVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.c & i2) == 0) {
                bavVar.g(i2, bbnVar.f(i2));
            } else {
                bbn bbnVar2 = this.b;
                avw avwVarF = bbnVar.f(i2);
                avw avwVarF2 = bbnVar2.f(i2);
                float f = 1.0f - fK;
                bavVar.g(i2, bbn.i(avwVarF, (int) (((double) ((avwVarF.b - avwVarF2.b) * f)) + 0.5d), (int) (((double) ((avwVarF.c - avwVarF2.c) * f)) + 0.5d), (int) (((double) ((avwVarF.d - avwVarF2.d) * f)) + 0.5d), (int) (((double) ((avwVarF.e - avwVarF2.e) * f)) + 0.5d)));
            }
        }
        baq.c(this.d, bavVar.a(), Collections.singletonList(ciVar));
    }
}
