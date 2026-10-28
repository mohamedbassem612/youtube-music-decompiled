package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ahgo {
    final long[] a;
    final long[] b;
    final long[] c;

    public ahgo(ahgo ahgoVar) {
        this.a = Arrays.copyOf(ahgoVar.a, 10);
        this.b = Arrays.copyOf(ahgoVar.b, 10);
        this.c = Arrays.copyOf(ahgoVar.c, 10);
    }

    final void a(ahgo ahgoVar, int i) {
        afyd.k(this.a, ahgoVar.a, i);
        afyd.k(this.b, ahgoVar.b, i);
        afyd.k(this.c, ahgoVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public ahgo(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
