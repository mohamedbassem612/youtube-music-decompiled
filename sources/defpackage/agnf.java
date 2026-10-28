package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class agnf extends agmm implements agns {
    public volatile agnt c;

    public agnf(Object obj, int i) {
        super(obj, i);
        this.c = agnw.a;
    }

    @Override // defpackage.agms
    public final Object d() {
        return this.c.get();
    }

    @Override // defpackage.agns
    public final agnt e() {
        return this.c;
    }
}
