package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iya {
    private adts a;
    private long b;
    private boolean c;
    private byte d;

    public final iyb a() {
        adts adtsVar;
        if (this.d == 3 && (adtsVar = this.a) != null) {
            return new ixu(adtsVar, this.b, this.c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" loadingEvent");
        }
        if ((this.d & 1) == 0) {
            sb.append(" spinnerDelayMs");
        }
        if ((this.d & 2) == 0) {
            sb.append(" shouldCenterSpinner");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(adts adtsVar) {
        if (adtsVar == null) {
            throw new NullPointerException("Null loadingEvent");
        }
        this.a = adtsVar;
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(long j) {
        this.b = j;
        this.d = (byte) (this.d | 1);
    }
}
