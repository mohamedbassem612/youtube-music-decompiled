package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class anj {
    public int a;
    public int b;
    public long c = 0;
    public long d = ape.d(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY);
    public long e = 0;

    protected abstract void q(long j);

    public final void u() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = awro.h((int) j, apd.d(j2), apd.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        int iH = awro.h((int) j3, apd.c(j4), apd.a(j4));
        this.b = iH;
        int i = this.a;
        long j5 = this.c;
        this.e = (((long) ((i - ((int) (j5 >> 32))) / 2)) << 32) | (((long) ((iH - ((int) (j5 & 4294967295L))) / 2)) & 4294967295L);
    }

    protected final void v(long j) {
        if (this.c != j) {
            this.c = j;
            u();
        }
    }
}
