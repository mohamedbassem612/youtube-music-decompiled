package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnb extends zkk {
    final /* synthetic */ abnc a;

    public abnb(abnc abncVar) {
        this.a = abncVar;
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zkj io() {
        abnc abncVar = this.a;
        zki zkiVar = abncVar.d;
        zkj zkjVarB = abncVar.b();
        zkj zkjVar = new zkj(zkjVarB.c, zkjVarB.d, abncVar.u());
        if (zkjVar.c == -1 || zkjVar.d == -1) {
            return (zkiVar == null || !zkiVar.m()) ? zkj.a : new zkj(zkiVar.b(), zkiVar.a(), abncVar.u());
        }
        return zkjVar;
    }
}
