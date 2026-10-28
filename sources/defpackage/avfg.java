package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class avfg implements avdw {
    @Override // defpackage.avdw
    public void a(Status status, avdv avdvVar, avbe avbeVar) {
        throw null;
    }

    protected abstract avdw b();

    @Override // defpackage.avdw
    public final void c(avbe avbeVar) {
        b().c(avbeVar);
    }

    @Override // defpackage.avkb
    public final void d() {
        b().d();
    }

    @Override // defpackage.avkb
    public final void e(auym auymVar) {
        b().e(auymVar);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", b());
        return ageuVarAc.toString();
    }
}
