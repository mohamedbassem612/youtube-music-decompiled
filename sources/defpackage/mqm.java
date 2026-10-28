package defpackage;

import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.core.widget.NestedScrollView;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqm implements nrw {
    public ObjectAnimator a;
    private final avmb b;

    public mqm() {
        avmb avmbVar = avmh.a;
        JniZero.a(avmbVar);
        this.a = null;
        this.b = avmbVar;
    }

    public static int d(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asoj.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return rpi.A();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        return avlb.o(new lez((Object) this, obj, (Object) nrvVar, 5, (char[]) null)).v(this.b);
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }

    public final View f(View view) {
        if ((view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewF = f(viewGroup.getChildAt(i));
                if (viewF != null) {
                    return viewF;
                }
            }
        }
        return null;
    }

    public final void g() {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.a.cancel();
        }
        this.a = null;
    }
}
