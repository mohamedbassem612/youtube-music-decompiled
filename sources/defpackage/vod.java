package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vod implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public /* synthetic */ vod(AppBarLayout appBarLayout, ColorStateList colorStateList, afbe afbeVar, Integer num, int i) {
        this.$cid = i;
        this.a = appBarLayout;
        this.c = colorStateList;
        this.b = afbeVar;
        this.d = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        int i = this.$cid;
        if (i == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * ((voe) this.d).a;
            View view = (View) this.b;
            float fB = vog.b(view, fFloatValue);
            view.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.a.setTranslationX(fB);
            ((View) this.c).setTranslationX(fB);
            return;
        }
        if (i == 1) {
            float fFloatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = ((voe) this.d).a;
            View view2 = (View) this.b;
            float fB2 = vog.b(view2, fFloatValue2) * f;
            view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.a.setTranslationX(fB2);
            ((View) this.c).setTranslationX(fB2);
            return;
        }
        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        int iL = afba.L(appBarLayout.h, ((ColorStateList) this.c).getDefaultColor(), fFloatValue3);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iL);
        afbe afbeVar = (afbe) this.b;
        afbeVar.q(colorStateListValueOf);
        if (appBarLayout.i != null && (num = appBarLayout.j) != null && num.equals(this.d)) {
            appBarLayout.i.setTint(iL);
        }
        List<aeuk> list = appBarLayout.f;
        if (!list.isEmpty()) {
            for (aeuk aeukVar : list) {
                if (afbeVar.j() != null) {
                    aeukVar.a();
                }
            }
        }
        LinkedHashSet linkedHashSet = appBarLayout.g;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((aeul) it.next()).a();
        }
    }

    public vod(voe voeVar, View view, View view2, View view3, int i) {
        this.$cid = i;
        this.b = view;
        this.a = view2;
        this.c = view3;
        this.d = voeVar;
    }
}
