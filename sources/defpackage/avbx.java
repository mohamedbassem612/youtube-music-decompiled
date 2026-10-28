package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class avbx extends auyt {
    @Override // defpackage.auyt
    public void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // defpackage.auyt
    public final void c() {
        f().c();
    }

    @Override // defpackage.auyt
    public final void e() {
        f().e();
    }

    protected abstract auyt f();

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("delegate", f());
        return ageuVarAc.toString();
    }
}
