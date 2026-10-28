package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adwf extends qa {
    final /* synthetic */ adwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwf(adwg adwgVar) {
        super((byte[]) null);
        this.a = adwgVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        adwg adwgVar = this.a;
        if (adwgVar.ax) {
            return;
        }
        np npVar = recyclerView.n;
        if ((npVar instanceof GridLayoutManager) || (npVar instanceof LinearLayoutManager) || (npVar instanceof FlowLayoutManager)) {
            adwgVar.ay = adwgVar.aP(npVar).a();
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        adwg adwgVar = this.a;
        Runnable runnable = adwgVar.U;
        if (runnable != null) {
            if (i == 1) {
                adwgVar.U = null;
            } else if (i == 0) {
                recyclerView.post(runnable);
                adwgVar.U = null;
            }
        }
        adsu adsuVar = adwgVar.az;
        if (adsuVar.a && !adsuVar.b && i == 0) {
            adsuVar.b = true;
        } else if (adsuVar.b) {
            adsuVar.a = false;
        }
    }
}
