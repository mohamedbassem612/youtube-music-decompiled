package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nx extends qa {
    final /* synthetic */ RecyclerView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(RecyclerView recyclerView) {
        super((byte[]) null);
        this.a = recyclerView;
    }

    @Override // defpackage.qa
    public final void fQ() {
        RecyclerView recyclerView = this.a;
        recyclerView.x(null);
        recyclerView.O.f = true;
        recyclerView.W(true);
        if (recyclerView.g.k()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.x(null);
        kd kdVar = recyclerView.g;
        if (i2 > 0) {
            ArrayList arrayList = kdVar.a;
            arrayList.add(kdVar.b(4, i, i2, obj));
            kdVar.c |= 4;
            if (arrayList.size() == 1) {
                j();
            }
        }
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.x(null);
        kd kdVar = recyclerView.g;
        if (i2 > 0) {
            ArrayList arrayList = kdVar.a;
            arrayList.add(kdVar.b(1, i, i2, null));
            kdVar.c |= 1;
            if (arrayList.size() == 1) {
                j();
            }
        }
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.x(null);
        kd kdVar = recyclerView.g;
        if (i2 > 0) {
            ArrayList arrayList = kdVar.a;
            arrayList.add(kdVar.b(2, i, i2, null));
            kdVar.c |= 2;
            if (arrayList.size() == 1) {
                j();
            }
        }
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.x(null);
        kd kdVar = recyclerView.g;
        if (i != i2) {
            ArrayList arrayList = kdVar.a;
            arrayList.add(kdVar.b(8, i, i2, null));
            kdVar.c |= 8;
            if (arrayList.size() == 1) {
                j();
            }
        }
    }

    final void j() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.r || !recyclerView.q) {
            recyclerView.w = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.j;
            int i = bac.a;
            recyclerView.postOnAnimation(runnable);
        }
    }
}
