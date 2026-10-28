package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpe implements avlf {
    public final nuc a;
    public final nsl b;
    public final int c;

    public mpe(nuc nucVar) {
        this.a = nucVar;
        this.b = nsl.a;
        this.c = 0;
    }

    public final mpe a(nsl nslVar) {
        return new mpe(this.a, nslVar, this.c);
    }

    public final mpe b(int i) {
        return new mpe(this.a, this.b, i);
    }

    @Override // defpackage.avlf
    public final avle c(avlb avlbVar) {
        return avlbVar.k(new jgq(this, 17)).s();
    }

    private mpe(nuc nucVar, nsl nslVar, int i) {
        this.a = nucVar;
        this.b = nslVar;
        this.c = i;
    }
}
