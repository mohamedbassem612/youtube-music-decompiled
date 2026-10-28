package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class avff implements avdu {
    @Override // defpackage.avdu
    public final auyo a() {
        throw null;
    }

    protected abstract avdu b();

    @Override // defpackage.avdu
    public final void g(avfu avfuVar) {
        b().g(avfuVar);
    }

    @Override // defpackage.avdu
    public final void h(Status status) {
        b().h(status);
    }

    @Override // defpackage.avdu
    public final void i() {
        b().i();
    }

    @Override // defpackage.avdu
    public final void j(auzi auziVar) {
        b().j(auziVar);
    }

    @Override // defpackage.avdu
    public final void k(auzl auzlVar) {
        b().k(auzlVar);
    }

    @Override // defpackage.avdu
    public final void l(int i) {
        b().l(i);
    }

    @Override // defpackage.avdu
    public final void m(int i) {
        b().m(i);
    }

    @Override // defpackage.avdu
    public void n(avdw avdwVar) {
        throw null;
    }

    @Override // defpackage.avka
    public final boolean o() {
        return b().o();
    }

    @Override // defpackage.avka
    public final void r() {
        b().r();
    }

    @Override // defpackage.avka
    public final void s() {
        b().s();
    }

    @Override // defpackage.avka
    public final void t(auyz auyzVar) {
        b().t(auyzVar);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", b());
        return ageuVarAc.toString();
    }

    @Override // defpackage.avka
    public final void u(InputStream inputStream) {
        b().u(inputStream);
    }

    @Override // defpackage.avka
    public final void v() {
        b().v();
    }
}
