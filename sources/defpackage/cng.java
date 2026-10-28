package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cng extends btn {
    private final bss b;

    public cng(bss bssVar) {
        this.b = bssVar;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        return obj == cnf.c ? 0 : -1;
    }

    @Override // defpackage.btn
    public final int b() {
        return 1;
    }

    @Override // defpackage.btn
    public final int c() {
        return 1;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        Integer num;
        Object obj;
        if (z) {
            num = 0;
            obj = cnf.c;
        } else {
            num = null;
            obj = null;
        }
        btlVar.j(num, obj, 0, -9223372036854775807L, 0L, brp.a, true, -9223372036854775807L);
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        btmVar.e(btm.a, this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        btmVar.l = true;
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        return cnf.c;
    }
}
