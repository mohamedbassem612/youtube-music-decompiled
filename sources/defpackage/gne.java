package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gne extends qa {
    final /* synthetic */ gnf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gne(gnf gnfVar) {
        super((byte[]) null);
        this.a = gnfVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        gnf gnfVar = this.a;
        jhs jhsVar = gnfVar.u;
        boolean z = jhsVar != null && jhsVar.a.A();
        boolean z2 = gnfVar.w.isPresent() && !((adsr) gnfVar.w.get()).Q;
        if (!zCanScrollVertically || z || z2) {
            ggd ggdVar = gnfVar.v;
            if (ggdVar != null) {
                ggdVar.a();
                return;
            }
            return;
        }
        ggd ggdVar2 = gnfVar.v;
        if (ggdVar2 != null) {
            ggdVar2.b();
        }
    }
}
