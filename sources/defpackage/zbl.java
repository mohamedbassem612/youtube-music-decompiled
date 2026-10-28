package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbl extends btn {
    private final boolean b;
    private final bss c;

    public zbl(boolean z, bss bssVar) {
        this.b = z;
        this.c = bssVar;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        return obj != zbj.c ? -1 : 0;
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
        Integer num2;
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        if (z) {
            num = zbj.b;
            num2 = zbj.c;
        } else {
            num = null;
            num2 = null;
        }
        btlVar.m(num, num2, -9223372036854775807L, 0L);
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        bss bssVar = this.c;
        btmVar.e(btm.a, bssVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.b, true, bssVar.d, 0L, -9223372036854775807L, 0, 0L);
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        if (i == 0) {
            return zbj.c;
        }
        throw new IndexOutOfBoundsException();
    }
}
