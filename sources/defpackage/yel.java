package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yel implements agfr {
    final /* synthetic */ zjr a;
    final /* synthetic */ aunn b;
    final /* synthetic */ zwb c;
    final /* synthetic */ yfu d;

    public yel(zjr zjrVar, aunn aunnVar, zwb zwbVar, yfu yfuVar) {
        this.a = zjrVar;
        this.b = aunnVar;
        this.c = zwbVar;
        this.d = yfuVar;
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jsk io() {
        jsk jskVarIo;
        if (this.a.j.m(71, 45378771L)) {
            yfo yfoVar = (yfo) this.b.io();
            zkf.d(yfoVar);
            jskVarIo = yfoVar.b(this.c.e());
        } else {
            jskVarIo = this.d.io();
        }
        return jskVarIo;
    }
}
