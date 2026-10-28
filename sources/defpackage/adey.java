package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adey implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public adey(aemn aemnVar, int i) {
        this.$cid = i;
        this.a = aemnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$cid) {
            case 0:
                Matrix matrix = (Matrix) valueAnimator.getAnimatedValue();
                adfc adfcVar = (adfc) this.a;
                adfcVar.setImageMatrix(matrix);
                adfcVar.invalidate();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Object obj = this.a;
                if (fFloatValue < 0.5f) {
                    VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout = (VerticalShimmerLoadingFrameLayout) obj;
                    float height = verticalShimmerLoadingFrameLayout.a.getHeight();
                    float f = (-height) * (fFloatValue + fFloatValue);
                    verticalShimmerLoadingFrameLayout.a.setTranslationY(f);
                    verticalShimmerLoadingFrameLayout.b.setTranslationY(height + f);
                } else {
                    float f2 = fFloatValue - 0.5f;
                    VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout2 = (VerticalShimmerLoadingFrameLayout) obj;
                    float height2 = verticalShimmerLoadingFrameLayout2.a.getHeight();
                    float f3 = (-height2) * (f2 + f2);
                    verticalShimmerLoadingFrameLayout2.b.setTranslationY(f3);
                    verticalShimmerLoadingFrameLayout2.a.setTranslationY(height2 + f3);
                }
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                aedb aedbVar = (aedb) this.a;
                aedbVar.c.setAlpha(iIntValue);
                aedbVar.invalidateSelf();
                break;
            case 3:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f4 = fFloatValue2 / 2.0f;
                aedb aedbVar2 = (aedb) this.a;
                aedbVar2.c.setStrokeWidth(fFloatValue2);
                Rect bounds = aedbVar2.getBounds();
                RectF rectF = aedbVar2.d;
                rectF.set(bounds);
                rectF.inset(f4, f4);
                aedbVar2.invalidateSelf();
                break;
            case 4:
                ((TouchFeedbackDrawable) this.a).a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                TouchFeedbackDrawable touchFeedbackDrawable = (TouchFeedbackDrawable) this.a;
                touchFeedbackDrawable.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                touchFeedbackDrawable.invalidateSelf();
                break;
            case 6:
                TouchFeedbackDrawable touchFeedbackDrawable2 = (TouchFeedbackDrawable) this.a;
                touchFeedbackDrawable2.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                touchFeedbackDrawable2.invalidateSelf();
                break;
            case 7:
                AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = ((aemn) this.a).p;
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                anchorableTopPeekingScrollView.f(iIntValue2, iIntValue2, false);
                break;
            case 8:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.intValue();
                ((aeoh) this.a).o.kk(num);
                break;
            case 9:
                ((View) this.a).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 10:
                aezq aezqVar = (aezq) this.a;
                aezqVar.b.e = aezqVar.e.getInterpolation(aezqVar.d.getAnimatedFraction());
                break;
            case 11:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                afcd afcdVar = (afcd) this.a;
                for (afex afexVar : afcdVar.d) {
                    afexVar.v = fFloatValue3;
                    afexVar.w = fFloatValue3;
                    afexVar.z = aetz.a(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue3);
                    afexVar.invalidateSelf();
                }
                afcdVar.postInvalidateOnAnimation();
                break;
            case 12:
                ((afdt) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = ((afdt) this.a).h;
                checkableImageButton.setScaleX(fFloatValue4);
                checkableImageButton.setScaleY(fFloatValue4);
                break;
            default:
                ((afeb) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ adey(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
