package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class dss extends dsr {
    private static boolean a = true;

    @Override // defpackage.dsp
    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.d(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
