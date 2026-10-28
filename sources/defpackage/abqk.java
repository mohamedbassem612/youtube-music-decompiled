package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abqk extends wlu {
    final /* synthetic */ abql a;

    /* JADX WARN: Illegal instructions before constructor call */
    public abqk(abql abqlVar, abxv abxvVar, zwa zwaVar, vxu vxuVar) {
        this.a = abqlVar;
        int i = abqlVar.j;
        boolean z = false;
        if (abqlVar.c.bh() && abrg.g(vxuVar)) {
            z = true;
        }
        super("get_watch", abxvVar, zwaVar, i, z, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        alyg alygVar = (alyg) alyh.a.createBuilder();
        agqs agqsVarListIterator = this.a.g.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            alygVar.getClass();
            ((abqh) next).k(alygVar);
        }
        alygVar.getClass();
        return alygVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wkf
    protected final void b() {
        agqs agqsVarListIterator = this.a.g.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            aihf aihfVarB = B();
            aihfVarB.getClass();
            ((abqh) next).g(aihfVarB);
        }
    }
}
