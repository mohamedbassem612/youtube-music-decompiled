package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkk {
    public final xgn a;
    public final abkq b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public final Runnable f = new yas(this, 18, null);
    public abks g;
    private final acdo h;

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xgn] */
    public abkk(awmd awmdVar, abkq abkqVar, Handler handler, acdo acdoVar) {
        this.a = ((glj) awmdVar).a;
        this.b = abkqVar;
        this.c = handler;
        this.h = acdoVar;
    }

    public final void a(MotionEvent motionEvent, View view) {
        int iA = abkp.a((int) motionEvent.getX(), view.getWidth());
        if (iA != 0) {
            abkq abkqVar = this.b;
            char c = 1;
            abkp abkpVar = new abkp(motionEvent, iA, false, iA == 1 ? abkqVar.a() : abkqVar.a().negated());
            if (this.g != null) {
                int i = abkpVar.b;
                Duration duration = abkpVar.c;
                Duration duration2 = new abkj(duration, Optional.empty()).a;
                xgn xgnVar = this.a;
                long millis = duration2.toMillis();
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(i == 1 ? 28240 : 28239)), (amdd) Optional.empty().orElse(null));
                boolean z = this.e;
                acdo acdoVar = this.h;
                if (z) {
                    acdoVar.l(millis, appa.SEEK_SOURCE_DOUBLE_TAP_TO_SEEK);
                } else {
                    acdoVar.g(millis);
                }
                abkq abkqVar2 = this.b;
                abkqVar2.b = abkqVar2.c;
                abkqVar2.c = abkpVar;
                abko abkoVar = abkqVar2.b;
                if (abkoVar != null && ((abkp) abkoVar).b != ((abkp) abkqVar2.c).b) {
                    abkqVar2.b();
                }
                abkqVar2.d++;
                Handler handler = this.c;
                Runnable runnable = this.f;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 650L);
                this.d = true;
                long seconds = ((long) abkqVar2.d) * duration.toSeconds();
                Resources resources = abkqVar2.a;
                int i2 = (int) seconds;
                String quantityString = resources.getQuantityString(R.plurals.quick_seek_x_second, i2, Integer.valueOf(i2));
                abks abksVar = this.g;
                abksVar.a();
                ((CircularClipTapBloomView) abksVar.h.a).invalidate();
                abksVar.a.setText(quantityString);
                abksVar.b.setVisibility(8);
                float width = abksVar.e.getWidth();
                LinearLayout linearLayout = (LinearLayout) abksVar.i.a;
                int i3 = i == 1 ? 1 : 0;
                float f = width * 0.25f;
                linearLayout.setTranslationX(i3 != 0 ? f : -f);
                CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView) abksVar.h.a;
                circularClipTapBloomView.a = i3;
                circularClipTapBloomView.a();
                hwc hwcVar = (hwc) abksVar.k.a;
                hwcVar.E(hwcVar.h);
                abksVar.i.h(true, true);
                abksVar.g.h(true, true);
                MotionEvent motionEvent2 = abkpVar.a;
                abuz abuzVar = abksVar.j;
                int x = (int) motionEvent2.getX();
                int y = (int) motionEvent2.getY();
                abky abkyVar = (abky) abuzVar.b;
                abkyVar.b = x;
                abkyVar.c = y;
                abuzVar.c().start();
                abksVar.h.h(true, true);
                LinearLayout linearLayout2 = abksVar.d;
                if (i3 == 0) {
                    f = -f;
                }
                linearLayout2.setTranslationX(f);
                abksVar.d.setScaleX(1 != i3 ? -1.0f : 1.0f);
                abkx abkxVar = abksVar.c;
                AnimatorSet animatorSet = abkxVar.a;
                if (animatorSet == null) {
                    abkxVar.a = new AnimatorSet();
                    agke agkeVar = abkxVar.c;
                    ArrayList arrayList = new ArrayList(agkeVar.size());
                    Duration durationPlus = Duration.ZERO;
                    int size = agkeVar.size();
                    int i4 = 0;
                    while (i4 < size) {
                        View view2 = (View) agkeVar.get(i4);
                        agke agkeVar2 = abkxVar.d;
                        ArrayList arrayList2 = new ArrayList(agkeVar2.size());
                        int size2 = agkeVar2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            abkv abkvVar = (abkv) agkeVar2.get(i5);
                            float f2 = abkvVar.a;
                            float f3 = abkvVar.b;
                            char c2 = c;
                            float[] fArr = new float[2];
                            fArr[0] = f2;
                            fArr[c2] = f3;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
                            objectAnimatorOfFloat.setDuration(abkvVar.c.toMillis());
                            arrayList2.add(objectAnimatorOfFloat);
                            i5++;
                            c = c2;
                        }
                        char c3 = c;
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(arrayList2);
                        animatorSet2.setStartDelay(durationPlus.toMillis());
                        arrayList.add(animatorSet2);
                        durationPlus = durationPlus.plus(abkxVar.b);
                        i4++;
                        c = c3;
                    }
                    Animator.AnimatorListener animatorListener = abkxVar.e;
                    if (animatorListener != null) {
                        ((Animator) arrayList.get(0)).addListener(animatorListener);
                    }
                    abkxVar.a.playTogether(arrayList);
                } else if (animatorSet.isStarted()) {
                    return;
                }
                agke agkeVar3 = abkxVar.c;
                int size3 = agkeVar3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    View view3 = (View) agkeVar3.get(i6);
                    view3.setVisibility(0);
                    agke agkeVar4 = abkxVar.d;
                    view3.setAlpha(agkeVar4.isEmpty() ? 0.0f : ((abkv) agkeVar4.get(0)).a);
                }
                abkxVar.a.start();
            }
        }
    }
}
