package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awct extends avow {
    final avlw a;
    final Object[] b;
    int c;
    boolean d;
    volatile boolean e;

    public awct(avlw avlwVar, Object[] objArr) {
        this.a = avlwVar;
        this.b = objArr;
    }

    @Override // defpackage.avot
    public final void c() {
        this.c = this.b.length;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        this.e = true;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.avot
    public final boolean i() {
        return this.c == this.b.length;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.d = true;
        return 1;
    }

    @Override // defpackage.avot
    public final Object km() {
        Object[] objArr = this.b;
        int i = this.c;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        obj.getClass();
        return obj;
    }
}
