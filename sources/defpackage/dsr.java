package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dsr extends dsq {
    private static boolean a = true;

    @Override // defpackage.dsp
    public void b(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
