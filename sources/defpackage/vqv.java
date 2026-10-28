package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vqv extends vqx {
    vqu a;

    private final void f() {
        vqu vquVar = this.a;
        if (vquVar != null) {
            if (!vquVar.hasStarted() || this.a.hasEnded()) {
                this.a.cancel();
            }
        }
    }

    @Override // defpackage.vqx
    protected final void b() {
        f();
    }

    @Override // defpackage.vqx
    protected final void c(int i, View view) {
        d(i, view);
    }

    @Override // defpackage.vqx
    public final void d(int i, View view) {
        f();
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        RectF rectF2 = new RectF(0.0f, 0.0f, view.getWidth(), Math.min(i, view.getHeight()));
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        vqu vquVar = new vqu(matrix);
        this.a = vquVar;
        vquVar.setFillAfter(true);
        view.startAnimation(this.a);
    }
}
