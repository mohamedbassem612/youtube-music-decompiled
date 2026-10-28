package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gga implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gga(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$cid;
        if (i == 0) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ggb ggbVar = (ggb) this.a;
            int[] iArr = ggbVar.a;
            int i2 = iArr[0];
            float f = i2;
            int[] iArr2 = ggbVar.b;
            float f2 = (iArr2[0] - i2) * animatedFraction;
            int[] iArr3 = ggbVar.c;
            int i3 = (int) (f + f2);
            iArr3[0] = i3;
            int i4 = iArr[1];
            int i5 = (int) (i4 + ((iArr2[1] - i4) * animatedFraction));
            iArr3[1] = i5;
            int i6 = iArr[2];
            int i7 = (int) (i6 + ((iArr2[2] - i6) * animatedFraction));
            iArr3[2] = i7;
            int i8 = iArr[3];
            int i9 = (int) (i8 + ((iArr2[3] - i8) * animatedFraction));
            iArr3[3] = i9;
            ggbVar.b(Color.argb(i3, i5, i7, i9));
            return;
        }
        if (i == 1) {
            ehm ehmVar = (ehm) this.a;
            if (ehmVar.z()) {
                ehmVar.invalidateSelf();
                return;
            }
            elf elfVar = ehmVar.k;
            if (elfVar != null) {
                elfVar.m(ehmVar.b.c());
                return;
            }
            return;
        }
        if (i != 2) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            abky abkyVar = (abky) ((abuz) this.a).b;
            abkyVar.b(fFloatValue);
            abkyVar.invalidate();
            return;
        }
        Float f3 = (Float) valueAnimator.getAnimatedValue();
        f3.floatValue();
        WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
        ((awku) ((kwq) watchWhileLayout.n.io()).d).kk(f3);
        watchWhileLayout.requestLayout();
    }
}
