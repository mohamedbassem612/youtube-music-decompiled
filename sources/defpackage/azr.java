package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class azr implements View.OnApplyWindowInsetsListener {
    bbn a = null;
    final /* synthetic */ View b;
    final /* synthetic */ ayx c;

    public azr(View view, ayx ayxVar) {
        this.b = view;
        this.c = ayxVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        bbn bbnVarO = bbn.o(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            azs.b(windowInsets, this.b);
            if (bbnVarO.equals(this.a)) {
                return this.c.a(view, bbnVarO).e();
            }
        }
        this.a = bbnVarO;
        bbn bbnVarA = this.c.a(view, bbnVarO);
        if (Build.VERSION.SDK_INT >= 30) {
            return bbnVarA.e();
        }
        int i = bac.a;
        view.requestApplyInsets();
        return bbnVarA.e();
    }
}
