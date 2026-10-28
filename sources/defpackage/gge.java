package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gge implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gge(AppBarLayout appBarLayout, afbe afbeVar, int i) {
        this.$cid = i;
        this.b = appBarLayout;
        this.a = afbeVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$cid;
        if (i == 0) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ggf ggfVar = (ggf) this.a;
            int length = ggfVar.c.length;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int[] iArr2 = ggfVar.b;
                iArr[i2] = ((Integer) ((ArgbEvaluator) this.b).evaluate(animatedFraction, Integer.valueOf(iArr2.length > i2 ? iArr2[i2] : 0), Integer.valueOf(ggfVar.c[i2]))).intValue();
                i2++;
            }
            ggfVar.d = iArr;
            ggfVar.c();
            return;
        }
        if (i == 1) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            dqf dqfVar = (dqf) this.b;
            dqg.e(fFloatValue, dqfVar);
            dqg dqgVar = (dqg) this.a;
            dqgVar.a(fFloatValue, dqfVar, false);
            dqgVar.invalidateSelf();
            return;
        }
        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((afbe) this.a).p(fFloatValue2);
        AppBarLayout appBarLayout = (AppBarLayout) this.b;
        Drawable drawable = appBarLayout.i;
        if (drawable instanceof afbe) {
            ((afbe) drawable).p(fFloatValue2);
        }
        Iterator it = appBarLayout.f.iterator();
        while (it.hasNext()) {
            ((aeuk) it.next()).a();
        }
        Iterator it2 = appBarLayout.g.iterator();
        while (it2.hasNext()) {
            ((aeul) it2.next()).a();
        }
    }

    public gge(dqg dqgVar, dqf dqfVar, int i) {
        this.$cid = i;
        this.a = dqgVar;
        this.b = dqfVar;
    }

    public /* synthetic */ gge(ggf ggfVar, ArgbEvaluator argbEvaluator, int i) {
        this.$cid = i;
        this.a = ggfVar;
        this.b = argbEvaluator;
    }
}
