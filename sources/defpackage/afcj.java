package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afcj implements Handler.Callback {
    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        int height = 0;
        if (i == 0) {
            afcr afcrVar = (afcr) message.obj;
            afcq afcqVar = afcrVar.k;
            if (afcqVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = afcqVar.getLayoutParams();
                if (layoutParams instanceof asv) {
                    asv asvVar = (asv) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = afcrVar.w;
                    if (baseTransientBottomBar$Behavior == null) {
                        baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    }
                    baseTransientBottomBar$Behavior.l.b = afcrVar.x;
                    baseTransientBottomBar$Behavior.t(new afcm(afcrVar));
                    asvVar.b(baseTransientBottomBar$Behavior);
                    if (afcrVar.d() == null) {
                        asvVar.g = 80;
                    }
                }
                ViewGroup viewGroup = afcrVar.i;
                afcqVar.g = true;
                viewGroup.addView(afcqVar);
                afcqVar.g = false;
                if (afcrVar.d() != null) {
                    int[] iArr = new int[2];
                    afcrVar.d().getLocationOnScreen(iArr);
                    int i2 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    height = (iArr2[1] + viewGroup.getHeight()) - i2;
                }
                afcrVar.s = height;
                afcrVar.j();
                afcqVar.setVisibility(4);
            }
            if (afcqVar.isLaidOut()) {
                afcrVar.i();
            } else {
                afcrVar.v = true;
            }
        } else {
            if (i != 1) {
                return false;
            }
            afcr afcrVar2 = (afcr) message.obj;
            int i3 = message.arg1;
            if (afcrVar2.l()) {
                afcq afcqVar2 = afcrVar2.k;
                if (afcqVar2.getVisibility() != 0) {
                    afcrVar2.f(i3);
                } else if (afcqVar2.c == 1) {
                    ValueAnimator valueAnimatorC = afcrVar2.c(1.0f, 0.0f);
                    valueAnimatorC.setDuration(afcrVar2.e);
                    valueAnimatorC.addListener(new afcf(afcrVar2, i3));
                    valueAnimatorC.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, afcrVar2.b());
                    valueAnimator.setInterpolator(afcrVar2.g);
                    valueAnimator.setDuration(afcrVar2.f);
                    valueAnimator.addListener(new afci(afcrVar2, i3));
                    valueAnimator.addUpdateListener(new afcg(afcrVar2, 4));
                    valueAnimator.start();
                }
            } else {
                afcrVar2.f(i3);
            }
        }
        return true;
    }
}
