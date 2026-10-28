package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awij implements awje {
    final int a;
    long b;
    final awiy[] c;

    public awij(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.c = new awiy[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new awiy(threadFactory);
        }
    }

    public final void a() {
        int i = 0;
        while (true) {
            awiy[] awiyVarArr = this.c;
            if (i >= awiyVarArr.length) {
                return;
            }
            awiyVarArr[i].dispose();
            i++;
        }
    }

    @Override // defpackage.awje
    public final void b(int i, awgg awggVar) {
        int i2 = this.a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                awggVar.a(i3, awik.g);
            }
            return;
        }
        int i4 = ((int) this.b) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            awggVar.a(i5, new awii(this.c[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.b = i4;
    }

    public final awiy c() {
        int i = this.a;
        if (i == 0) {
            return awik.g;
        }
        awiy[] awiyVarArr = this.c;
        long j = this.b;
        this.b = 1 + j;
        return awiyVarArr[(int) (j % ((long) i))];
    }
}
