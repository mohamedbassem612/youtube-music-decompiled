package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wra implements acjy {
    private final /* synthetic */ int $cid;
    private Object a;
    private final aihn b;

    public wra(alsi alsiVar, int i) {
        this.$cid = i;
        alsiVar.getClass();
        this.b = alsiVar;
    }

    @Override // defpackage.acjy
    public final apjh a() {
        int i = this.$cid;
        if (i == 0) {
            alsi alsiVar = (alsi) this.b;
            if ((alsiVar.b & 4) == 0) {
                return null;
            }
            apjh apjhVar = alsiVar.d;
            return apjhVar == null ? apjh.a : apjhVar;
        }
        aihn aihnVar = this.b;
        if (i == 1) {
            apjh apjhVar2 = ((alnp) aihnVar).c;
            return apjhVar2 == null ? apjh.a : apjhVar2;
        }
        alqy alqyVar = (alqy) aihnVar;
        if ((alqyVar.b & 4) == 0) {
            return null;
        }
        apjh apjhVar3 = alqyVar.d;
        return apjhVar3 == null ? apjh.a : apjhVar3;
    }

    @Override // defpackage.acjy
    public final Object b() {
        int i = this.$cid;
        return this.a;
    }

    @Override // defpackage.acjy
    public final void c(Object obj) {
        if (this.$cid != 0) {
        }
        this.a = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        int i = this.$cid;
        if (i == 0) {
            return ((alsi) this.b).e.G();
        }
        aihn aihnVar = this.b;
        return i != 1 ? ((alqy) aihnVar).e.G() : ((alnp) aihnVar).d.G();
    }

    public wra(aihn aihnVar, int i) {
        this.$cid = i;
        this.b = aihnVar;
    }
}
