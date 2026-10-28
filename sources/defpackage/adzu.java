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
final class adzu extends WindowInsetsAnimation$Callback {
    final /* synthetic */ adyw a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ View d;
    final /* synthetic */ ViewGroup.MarginLayoutParams e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adzu(adyw adywVar, int i, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(0);
        this.a = adywVar;
        this.b = i;
        this.c = view;
        this.d = view2;
        this.e = marginLayoutParams;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        adyw adywVar = this.a;
        if (adywVar.G) {
            adywVar.G = false;
            View view = this.d;
            int iC = this.b;
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                iC += aecm.c(rootWindowInsets);
            }
            if (this.e.bottomMargin != iC) {
                tym.h(this.c, new tyi(iC, 1), ViewGroup.MarginLayoutParams.class);
            }
        }
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            adyw adywVar = this.a;
            adywVar.G = true;
            Dialog dialog = adywVar.O;
            if (dialog != null) {
                ((aevw) dialog).a().I(3);
            }
        }
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        if (this.a.G) {
            tym.h(this.c, new tyi(this.b + aecm.c(windowInsets), 1), ViewGroup.MarginLayoutParams.class);
        }
        return windowInsets;
    }
}
