package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mhe extends oa {
    private mhd a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public mhe(RecyclerView recyclerView, boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        recyclerView.getClass();
        this.a = new mhd(recyclerView, z3);
    }

    @Override // defpackage.oa, defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        mhd mhdVar = this.a;
        if (mhdVar == null) {
            mhd mhdVar2 = new mhd(recyclerView, this.d);
            this.a = mhdVar2;
            mhdVar = mhdVar2;
        }
        if (this.b && !recyclerView.canScrollHorizontally(-1)) {
            return false;
        }
        if (this.c) {
            mhdVar.a = recyclerView;
        }
        mhdVar.a(motionEvent);
        return false;
    }

    public mhe(boolean z, boolean z2) {
        this.b = false;
        this.c = z;
        this.d = z2;
    }
}
