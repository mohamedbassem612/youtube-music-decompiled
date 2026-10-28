package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeil implements aeif {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aeir a;

    public /* synthetic */ aeil(aeir aeirVar, int i) {
        this.$cid = i;
        this.a = aeirVar;
    }

    @Override // defpackage.aeif
    public final boolean a() {
        int i = this.$cid;
        if (i == 0) {
            return ((aeim) this.a).j.a();
        }
        if (i != 1) {
            aeir aeirVar = this.a;
            if (i == 2) {
                return ((aein) aeirVar).j.j.isEmpty();
            }
            aeis aeisVar = ((aeit) aeirVar).j;
            if (!aeisVar.a() || !aeisVar.k) {
                return false;
            }
        } else if (((aeim) this.a).j.j.isEmpty()) {
            return false;
        }
        return true;
    }
}
