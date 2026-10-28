package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgi implements nwg {
    private final /* synthetic */ int $cid;

    public mgi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return this.$cid != 0 ? amtv.b : amty.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return this.$cid != 0 ? a.r() : a.r();
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        if (this.$cid != 0) {
            amtv amtvVar = (amtv) obj;
            int i = amtvVar.c;
            return ((i & 2) == 0 || (i & 1) == 0) ? avlb.e() : avlb.n(new hmg(amtvVar, nwfVar, 5, null)).v(avmh.a());
        }
        amty amtyVar = (amty) obj;
        int i2 = amtyVar.c;
        return ((i2 & 2) == 0 || (i2 & 1) == 0) ? avlb.e() : avlb.n(new hmg(amtyVar, nwfVar, 6, null)).v(avmh.a());
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return this.$cid != 0 ? nrb.a(this, mewVar, nwfVar) : nrb.a(this, mewVar, nwfVar);
    }
}
