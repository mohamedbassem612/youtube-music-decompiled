package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeeg extends qa {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    public final /* synthetic */ aeei d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeeg(aeei aeeiVar, View view, int i, int i2) {
        super((byte[]) null);
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = aeeiVar;
    }

    @Override // defpackage.qa
    public final void c(Rect rect, View view, RecyclerView recyclerView, oe oeVar) {
        super.c(rect, view, recyclerView, oeVar);
        View view2 = this.a;
        if (view == view2) {
            aeei aeeiVar = this.d;
            int i = this.b;
            float fA = aeeiVar.a(i, view2, aeeiVar.f);
            int i2 = this.c;
            rect.bottom = (int) ((-i2) * (1.0f - fA));
            boolean z = true;
            if (aeeiVar.h && recyclerView.F != 1) {
                z = false;
            }
            if (aeeiVar.p == null && z) {
                if (aeeiVar.m > view2.getY() || aeeiVar.q) {
                    aeeiVar.p = new aecg(this, i2, i, view2, recyclerView, 2);
                    recyclerView.post(aeeiVar.p);
                }
            }
        }
    }
}
