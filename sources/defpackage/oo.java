package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oo extends qa {
    boolean a;
    final /* synthetic */ oq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(oq oqVar) {
        super((byte[]) null);
        this.b = oqVar;
        this.a = false;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.g();
        }
    }
}
