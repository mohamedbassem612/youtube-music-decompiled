package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;
import com.google.android.apps.youtube.music.player.indicator.RoundedPlayingIndicatorView;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pr implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public pr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        switch (this.$cid) {
            case 0:
                ((ps) this.a).p = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                mf mfVar = (mf) this.a;
                int i = (int) fFloatValue;
                mfVar.b.setAlpha(i);
                mfVar.c.setAlpha(i);
                mfVar.h();
                break;
            case 2:
                ((View) ((hd) ((qcb) this.a).a).c.getParent()).invalidate();
                break;
            case 3:
                ((frc) this.a).setScrollX(Integer.parseInt(valueAnimator.getAnimatedValue().toString()));
                break;
            case 4:
                ((GradientDrawable) this.a).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                ((GradientDrawable) this.a).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                ((GradientDrawable) this.a).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                ((AudioVideoSwitcherToggleView) this.a).invalidate();
                break;
            case 8:
                if (valueAnimator.getAnimatedFraction() == 1.0f) {
                    ((RoundedPlayingIndicatorView) this.a).a.e();
                }
                break;
            case 9:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f3 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f3 != null) {
                    ((jah) this.a).c(f3.floatValue(), false);
                }
                break;
            case 10:
                ((GradientDrawable) this.a).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 11:
                ((GradientDrawable) this.a).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 12:
                ((jfr) this.a).a.setPadding(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 13:
                ((jjy) this.a).m.setImageAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 14:
                jqo jqoVar = (jqo) this.a;
                int i2 = jqoVar.t << 1;
                duh duhVar = jqoVar.l.g;
                if (duhVar.b.g) {
                    float f4 = duhVar.f - i2;
                    duhVar.f = f4;
                    int iRound = Math.round(f4 - duhVar.g);
                    duhVar.g += iRound;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    int iA = duhVar.a.a();
                    int i3 = iA ^ 1;
                    int i4 = 1 != iA ? iRound : 0;
                    int i5 = 1 == iA ? iRound : 0;
                    if (i3 != 0) {
                        f2 = 0.0f;
                        f = duhVar.f;
                    } else {
                        f = 0.0f;
                        f2 = duhVar.f;
                    }
                    duhVar.c.scrollBy(i4, i5);
                    duhVar.a(jUptimeMillis, 2, f, f2);
                }
                break;
            case 15:
                ((ouj) this.a).s();
                break;
            case 16:
                tym.h((View) this.a, new tyl(((Integer) valueAnimator.getAnimatedValue()).intValue(), 1), ViewGroup.LayoutParams.class);
                break;
            case 17:
                ((vhn) this.a).c(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 18:
                View view = (View) this.a;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.setLayoutParams(layoutParams);
                }
                break;
            case 19:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.intValue();
                ((awku) this.a).kk(num);
                break;
            default:
                ((LiveChatSwipeableContainerLayout) this.a).d(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }

    public /* synthetic */ pr(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
