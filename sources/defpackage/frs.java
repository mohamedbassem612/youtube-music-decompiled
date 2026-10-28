package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class frs extends ns {
    final /* synthetic */ RecyclerView a;

    public frs(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.ns
    public final boolean e(int i, int i2) {
        if (Math.abs(i2) > 2) {
            this.a.aq(30, 30);
            return true;
        }
        if (Math.abs(i) <= 2) {
            return false;
        }
        this.a.aq(30, 30);
        return true;
    }
}
