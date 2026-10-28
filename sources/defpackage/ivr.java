package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ivr extends dsa {
    private static final void f(dsk dskVar) {
        dskVar.a.put("hatsSurveyView:HEIGHT", Integer.valueOf(dskVar.b.getHeight()));
    }

    @Override // defpackage.dsa
    public final Animator a(ViewGroup viewGroup, dsk dskVar, dsk dskVar2) {
        if (dskVar != null && dskVar2 != null) {
            Integer num = (Integer) dskVar.a.get("hatsSurveyView:HEIGHT");
            Integer num2 = (Integer) dskVar2.a.get("hatsSurveyView:HEIGHT");
            if (num != null && num2 != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", num2.intValue() - num.intValue(), 0.0f);
                objectAnimatorOfFloat.setInterpolator(new bnn());
                return objectAnimatorOfFloat;
            }
        }
        return null;
    }

    @Override // defpackage.dsa
    public final void b(dsk dskVar) {
        f(dskVar);
    }

    @Override // defpackage.dsa
    public final void c(dsk dskVar) {
        f(dskVar);
    }
}
