package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.makeramen.RoundedImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acne implements nr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public acne(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.nr
    public final void hO(View view) {
        int i = this.$cid;
        if (i == 0) {
            Context context = view.getContext();
            acng acngVar = (acng) this.a;
            if (acngVar.n.b(context)) {
                oh ohVarJ = acngVar.j.j(view);
                if (ohVarJ instanceof acrp) {
                    acngVar.f((acrp) ohVarJ);
                    return;
                }
                return;
            }
            return;
        }
        Object obj = this.a;
        char c = 1;
        if (i != 1) {
            ((aeei) obj).k();
            return;
        }
        hdj hdjVar = (hdj) obj;
        if (hdjVar.n.getChildCount() == hdjVar.i()) {
            hdjVar.y = new AnimatorSet();
            char c2 = 0;
            AnimatorSet.Builder builderPlay = hdjVar.y.play(ValueAnimator.ofInt(0));
            Context context2 = ((cc) obj).getContext();
            int color = context2.getColor(R.color.thumbnail_gallery_loading_light);
            int color2 = context2.getColor(R.color.thumbnail_gallery_loading_medium);
            int color3 = context2.getColor(R.color.thumbnail_gallery_loading_dark);
            int i2 = 0;
            while (i2 < hdjVar.n.getChildCount()) {
                if (!(hdjVar.n.getChildAt(i2) instanceof RoundedImageView)) {
                    return;
                }
                int i3 = hdjVar.i() >> 2;
                RoundedImageView roundedImageView = (RoundedImageView) hdjVar.n.getChildAt(i2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                char c3 = c;
                gradientDrawable.setCornerRadius(hdjVar.getResources().getDimensionPixelOffset(R.dimen.generated_thumbnail_corner_radius));
                int i4 = i2 / i3;
                if (i4 == 0) {
                    gradientDrawable.setColor(color);
                } else {
                    gradientDrawable.setColor(color3);
                }
                roundedImageView.setForeground(gradientDrawable);
                AnimatorSet animatorSet = new AnimatorSet();
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Integer numValueOf = Integer.valueOf(color);
                Integer numValueOf2 = Integer.valueOf(color2);
                char c4 = c2;
                Object[] objArr = new Object[2];
                objArr[c4] = numValueOf;
                objArr[c3] = numValueOf2;
                ValueAnimator duration = ValueAnimator.ofObject(argbEvaluator, objArr).setDuration(300L);
                duration.addUpdateListener(new pr(gradientDrawable, 4, null));
                duration.setStartDelay(300L);
                ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                Integer numValueOf3 = Integer.valueOf(color3);
                Object[] objArr2 = new Object[2];
                objArr2[c4] = numValueOf2;
                objArr2[c3] = numValueOf3;
                ValueAnimator duration2 = ValueAnimator.ofObject(argbEvaluator2, objArr2).setDuration(300L);
                duration2.addUpdateListener(new pr(gradientDrawable, 5, null));
                duration2.setStartDelay(300L);
                int i5 = color;
                ValueAnimator duration3 = ValueAnimator.ofArgb(color3).setDuration(600L);
                ValueAnimator duration4 = ValueAnimator.ofArgb(color3).setDuration(600L);
                ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
                int i6 = color3;
                Object[] objArr3 = new Object[2];
                objArr3[c4] = numValueOf3;
                objArr3[c3] = numValueOf;
                ValueAnimator duration5 = ValueAnimator.ofObject(argbEvaluator3, objArr3).setDuration(300L);
                duration5.addUpdateListener(new pr(gradientDrawable, 6, null));
                duration5.setStartDelay(300L);
                ValueAnimator[] valueAnimatorArr = new ValueAnimator[5];
                valueAnimatorArr[c4] = duration;
                valueAnimatorArr[c3] = duration2;
                valueAnimatorArr[2] = duration3;
                valueAnimatorArr[3] = duration4;
                valueAnimatorArr[4] = duration5;
                ArrayList arrayList = new ArrayList(Arrays.asList(valueAnimatorArr));
                Collections.rotate(arrayList, i4);
                animatorSet.playSequentially(arrayList);
                builderPlay.with(animatorSet);
                i2++;
                c = c3;
                color = i5;
                c2 = c4;
                color3 = i6;
            }
            hdjVar.y.addListener(new hdg(this));
            hdjVar.y.setStartDelay(300L);
            hdjVar.y.start();
        }
    }

    @Override // defpackage.nr
    public final void b(View view) {
    }
}
