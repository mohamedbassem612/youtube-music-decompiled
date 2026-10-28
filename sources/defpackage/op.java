package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class op extends od {
    final /* synthetic */ oq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(oq oqVar, Context context) {
        super(context);
        this.a = oqVar;
    }

    @Override // defpackage.od
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.od
    protected final void c(View view, ob obVar) {
        oq oqVar = this.a;
        RecyclerView recyclerView = oqVar.a;
        if (recyclerView != null) {
            int[] iArrC = oqVar.c(recyclerView.n, view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
            if (iJ > 0) {
                obVar.b(i, i2, iJ, this.j);
            }
        }
    }
}
