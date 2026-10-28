package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dsq extends dsp {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.dsp
    public void e(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.dsp
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
