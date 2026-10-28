package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtt implements ayx {
    final /* synthetic */ duc a;
    private final Rect b = new Rect();

    public dtt(duc ducVar) {
        this.a = ducVar;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        bbb bavVar;
        bbn bbnVarF = bac.f(view, bbnVar);
        if (bbnVarF.w()) {
            return bbnVarF;
        }
        Rect rect = this.b;
        rect.left = bbnVarF.b();
        rect.top = bbnVarF.d();
        rect.right = bbnVarF.c();
        rect.bottom = bbnVarF.a();
        duc ducVar = this.a;
        int childCount = ducVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bbn bbnVarE = bac.e(ducVar.getChildAt(i), bbnVarF);
            rect.left = Math.min(bbnVarE.b(), rect.left);
            rect.top = Math.min(bbnVarE.d(), rect.top);
            rect.right = Math.min(bbnVarE.c(), rect.right);
            rect.bottom = Math.min(bbnVarE.a(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba(bbnVarF);
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz(bbnVarF);
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay(bbnVarF);
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax(bbnVarF);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw(bbnVarF);
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVarF) : new bau(bbnVarF);
        }
        bavVar.c(avw.d(rect.left, rect.top, rect.right, rect.bottom));
        return bavVar.a();
    }
}
