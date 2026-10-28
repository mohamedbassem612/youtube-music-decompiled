package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dst extends dss {
    @Override // defpackage.dsp
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.dsr, defpackage.dsp
    public final void b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.dsp
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.dss, defpackage.dsp
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.dsq, defpackage.dsp
    public final void e(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.dsq, defpackage.dsp
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
