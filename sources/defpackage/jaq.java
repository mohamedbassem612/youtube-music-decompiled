package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jaq extends qa {
    final /* synthetic */ jav a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaq(jav javVar) {
        super((byte[]) null);
        this.a = javVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (i2 >= 0 || adwg.aO(recyclerView.n).a() != 0) {
            return;
        }
        this.a.X();
    }
}
