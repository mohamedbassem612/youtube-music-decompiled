package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class drp extends dsx {
    public drp(int i) {
        this.w = i;
    }

    private static float P(dsk dskVar, float f) {
        Float f2;
        return (dskVar == null || (f2 = (Float) dskVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator Q(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        dso.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) dso.b, f2);
        dro droVar = new dro(view);
        objectAnimatorOfFloat.addListener(droVar);
        j().D(droVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.dsx, defpackage.dsa
    public final void c(dsk dskVar) {
        dsx.O(dskVar);
        Float fValueOf = (Float) dskVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = dskVar.b.getVisibility() == 0 ? Float.valueOf(dso.a(dskVar.b)) : Float.valueOf(0.0f);
        }
        dskVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.dsa
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dsx
    public final Animator f(View view, dsk dskVar) {
        dsp dspVar = dso.a;
        return Q(view, P(dskVar, 0.0f), 1.0f);
    }

    @Override // defpackage.dsx
    public final Animator g(View view, dsk dskVar, dsk dskVar2) {
        dsp dspVar = dso.a;
        Animator animatorQ = Q(view, P(dskVar, 1.0f), 0.0f);
        if (animatorQ == null) {
            dso.c(view, P(dskVar2, 1.0f));
        }
        return animatorQ;
    }
}
