package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ccx {
    public long a;
    public float b;
    public long c;

    public ccx() {
        this.a = -9223372036854775807L;
        this.b = -3.4028235E38f;
        this.c = -9223372036854775807L;
    }

    public final void a(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        ahno.F(z);
        this.c = j;
    }

    public final void b(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        ahno.F(z);
        this.b = f;
    }

    public ccx(ccy ccyVar) {
        this.a = ccyVar.a;
        this.b = ccyVar.b;
        this.c = ccyVar.c;
    }
}
