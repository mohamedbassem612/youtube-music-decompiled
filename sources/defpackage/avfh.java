package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class avfh implements avef {
    @Override // defpackage.avdx
    public avdu a(avbh avbhVar, avbe avbeVar, auyq auyqVar, auyw[] auywVarArr) {
        throw null;
    }

    @Override // defpackage.avhm
    public final Runnable b(avhl avhlVar) {
        return d().b(avhlVar);
    }

    @Override // defpackage.avae
    public final avaa c() {
        return d().c();
    }

    protected abstract avef d();

    @Override // defpackage.avhm
    public void e(Status status) {
        d().e(status);
    }

    @Override // defpackage.avhm
    public void f(Status status) {
        d().f(status);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", d());
        return ageuVarAc.toString();
    }
}
