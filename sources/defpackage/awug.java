package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awug extends awwg {
    public final awud a;

    public awug(awud awudVar) {
        this.a = awudVar;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) throws awve {
        awud awudVar = this.a;
        Throwable thO = awudVar.o(e());
        if (awudVar.A()) {
            awtr awtrVar = ((axda) awudVar.a).f;
            while (true) {
                Object obj = awtrVar.a;
                axdy axdyVar = axdb.b;
                if (awrc.c(obj, axdyVar)) {
                    if (awtrVar.d(axdyVar, thO)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (awtrVar.d(obj, null)) {
                    }
                }
            }
        }
        awudVar.f(thO);
        awudVar.v();
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return true;
    }
}
