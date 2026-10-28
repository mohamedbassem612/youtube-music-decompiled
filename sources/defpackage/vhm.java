package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vhm implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vhm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.animation.Animator$AnimatorListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, vhj] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        byte[] bArr = null;
        if (i == 0) {
            ?? r10 = this.a;
            vhn vhnVar = (vhn) r10;
            if (nuo.h(vhnVar.c) && vhnVar.d.getVisibility() == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.addListener(r10);
                ObjectAnimator duration = ObjectAnimator.ofFloat(vhnVar.d, (Property<TextView, Float>) View.ALPHA, 0.0f).setDuration(250L);
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(vhnVar.b), 0);
                valueAnimatorOfObject.setDuration(50L);
                valueAnimatorOfObject.addUpdateListener(new pr(r10, 17, null));
                ArrayList arrayList = new ArrayList();
                arrayList.add(duration);
                arrayList.add(valueAnimatorOfObject);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                return;
            }
            return;
        }
        if (i == 1) {
            ((vgw) this.a).b();
            return;
        }
        if (i == 2) {
            ((vhn) this.a).b();
            return;
        }
        if (i == 3) {
            this.a.o(false);
            return;
        }
        int i2 = 4;
        if (i == 4) {
            taq.c();
            aeiv aeivVar = (aeiv) this.a;
            aeivVar.c = Optional.of(((qcb) aeivVar.b).A(1, vcb.e, vcb.h));
            return;
        }
        vin vinVar = ((vjf) this.a).m;
        vinVar.getClass();
        vjq vjqVar = (vjq) vinVar;
        EditText editText = vjqVar.r;
        if (editText != null) {
            ((vjh) vinVar).ja(editText);
        }
        vjqVar.m();
        xgn xgnVar = vjqVar.t;
        if (xgnVar != null) {
            xgnVar.l(new xgj(xhb.b(185132)));
        }
        View view = vjqVar.u;
        taf.i(ape.f(new dzx(vinVar, view != null ? yno.fd(view) : null, i2, bArr)), MoreExecutors.directExecutor(), new roc(vinVar, 16), new ixb(vinVar, 7), null);
    }
}
