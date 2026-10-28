package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avxs extends avmc implements avol {
    private final /* synthetic */ int $cid;
    final avlh a;

    public avxs(avlh avlhVar, int i) {
        this.$cid = i;
        this.a = avlhVar;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        if (this.$cid != 0) {
            this.a.ap(new avwq(avmdVar));
            return;
        }
        try {
            this.a.ap(new avxr(avmdVar, new ArrayList()));
        } catch (Throwable th) {
            avkz.a(th);
            avns.h(th, avmdVar);
        }
    }

    @Override // defpackage.avol
    public final avlh a() {
        int i = this.$cid;
        avlh avlhVar = this.a;
        if (i != 0) {
            avwp avwpVar = new avwp(avlhVar);
            avnn avnnVar = atqp.j;
            return avwpVar;
        }
        avxq avxqVar = new avxq(avlhVar);
        avnn avnnVar2 = atqp.j;
        return avxqVar;
    }
}
