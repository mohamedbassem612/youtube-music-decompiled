package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcx extends tud {
    final /* synthetic */ View a;
    final /* synthetic */ vda b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcx(vda vdaVar, String str, View view) {
        super(str);
        this.a = view;
        this.b = vdaVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view = this.a;
        if (view.getWidth() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int left = view.getLeft();
            vda vdaVar = this.b;
            ObjectAnimator duration = ObjectAnimator.ofInt(vdaVar.b, "scrollX", (left - (vdaVar.d / 2)) + (view.getWidth() / 2)).setDuration(225L);
            duration.setInterpolator(new bnn());
            duration.start();
        }
    }
}
