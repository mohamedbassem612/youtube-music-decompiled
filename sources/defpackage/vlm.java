package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vlm implements loo {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vlm(int i) {
        this.$cid = i;
    }

    @Override // defpackage.loo
    public final Object a(lpa lpaVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                return i != 2 ? 403 : -1;
            }
            return Boolean.valueOf(lpaVar.j());
        }
        if (!lpaVar.j() || ((ljk) lpaVar.f()).f == null) {
            throw new vln(lpaVar.e());
        }
        agrx agrxVar = agso.a;
        lpaVar.f();
        return new vli(((ljk) lpaVar.f()).e, ((ljk) lpaVar.f()).f);
    }
}
