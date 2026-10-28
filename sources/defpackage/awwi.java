package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awwi extends awwg {
    private final awwk a;
    private final awwj b;
    private final awui c;
    private final Object g;

    public awwi(awwk awwkVar, awwj awwjVar, awui awuiVar, Object obj) {
        this.a = awwkVar;
        this.b = awwjVar;
        this.c = awuiVar;
        this.g = obj;
    }

    @Override // defpackage.awwg
    public final void a(Throwable th) {
        boolean z = awuv.a;
        awwk awwkVar = this.a;
        awwj awwjVar = this.b;
        awui awuiVar = this.c;
        awui awuiVarN = awwk.N(awuiVar);
        Object obj = this.g;
        if (awuiVarN == null || !awwkVar.M(awwjVar, awuiVarN, obj)) {
            awwjVar.a.j(2);
            awui awuiVarN2 = awwk.N(awuiVar);
            if (awuiVarN2 == null || !awwkVar.M(awwjVar, awuiVarN2, obj)) {
                awwkVar.kH(awwkVar.x(awwjVar, obj));
            }
        }
    }

    @Override // defpackage.awwg
    public final boolean b() {
        return false;
    }
}
