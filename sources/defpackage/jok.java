package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jok extends qa {
    public long a;
    final /* synthetic */ jol b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jok(jol jolVar) {
        super((byte[]) null);
        this.b = jolVar;
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        boolean z;
        if (i != 0) {
            z = true;
            if (i != 1) {
                return;
            }
        } else {
            if (!this.c) {
                return;
            }
            this.a = ((mbc) this.b.E.io()).b();
            z = false;
        }
        this.c = z;
    }
}
