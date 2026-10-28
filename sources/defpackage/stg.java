package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class stg extends WindowInsetsAnimation$Callback {
    final /* synthetic */ View a;
    final /* synthetic */ ste b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ ViewGroup.MarginLayoutParams e;
    final /* synthetic */ acfd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stg(acfd acfdVar, View view, ste steVar, int i, View view2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(0);
        this.f = acfdVar;
        this.a = view;
        this.b = steVar;
        this.c = i;
        this.d = view2;
        this.e = marginLayoutParams;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        acfd acfdVar = this.f;
        if (acfdVar.a) {
            acfdVar.a = false;
            View view = this.a;
            int iC = this.c;
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                iC += nsf.c(rootWindowInsets);
            }
            if (this.e.bottomMargin != iC) {
                tym.h(this.d, new tyi(iC, 1), ViewGroup.MarginLayoutParams.class);
            }
            this.b.i();
        }
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            this.f.a = true;
            this.a.requestApplyInsets();
            Dialog dialog = this.b.f;
            if (dialog instanceof aevw) {
                ((aevw) dialog).a().I(3);
            }
        }
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        if (this.f.a) {
            tym.h(this.d, new tyi(this.c + nsf.c(windowInsets), 1), ViewGroup.MarginLayoutParams.class);
        }
        return windowInsets;
    }
}
