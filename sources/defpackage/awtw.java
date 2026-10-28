package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awtw implements awub {
    private final awtv[] a;

    public awtw(awtv[] awtvVarArr) {
        this.a = awtvVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            awtv[] awtvVarArr = this.a;
            if (i >= awtvVarArr.length) {
                return;
            }
            awvk awvkVar = awtvVarArr[i].a;
            if (awvkVar == null) {
                awrc.b("handle");
                awvkVar = null;
            }
            awvkVar.kv();
            i++;
        }
    }

    @Override // defpackage.awub
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
