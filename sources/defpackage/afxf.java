package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxf extends qa {
    final /* synthetic */ String a = "ttr_ReelPageController.scrollListener";
    final /* synthetic */ qa b;
    final /* synthetic */ ahub c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxf(ahub ahubVar, qa qaVar) {
        super((byte[]) null);
        this.b = qaVar;
        this.c = ahubVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (afty.o()) {
            this.b.e(recyclerView, i, i2);
            return;
        }
        ahub ahubVar = this.c;
        afun afunVarD = ((afvq) ahubVar.a).d(this.a, 206);
        try {
            this.b.e(recyclerView, i, i2);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                afunVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (afty.o()) {
            this.b.fO(recyclerView, i);
            return;
        }
        ahub ahubVar = this.c;
        afun afunVarD = ((afvq) ahubVar.a).d(this.a, 205);
        try {
            this.b.fO(recyclerView, i);
            afunVarD.close();
        } catch (Throwable th) {
            try {
                afunVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
