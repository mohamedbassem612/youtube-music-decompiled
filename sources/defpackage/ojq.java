package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojq {
    public String a;
    public agev b;
    public long c;
    public byte d;
    public int e;
    private long f;
    private agev g;

    public ojq() {
        agdf agdfVar = agdf.a;
        this.b = agdfVar;
        this.g = agdfVar;
    }

    public final ojr a() {
        String str;
        int i;
        if (this.d == 3 && (str = this.a) != null && (i = this.e) != 0) {
            return new ojr(str, this.f, i, this.b, this.g, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tag");
        }
        if ((this.d & 1) == 0) {
            sb.append(" periodSeconds");
        }
        if (this.e == 0) {
            sb.append(" networkState");
        }
        if ((this.d & 2) == 0) {
            sb.append(" nextScheduleTimeOverride");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(agev agevVar) {
        if (agevVar == null) {
            throw new NullPointerException("Null flexIntervalOptional");
        }
        this.g = agevVar;
    }

    public final void c(long j) {
        this.f = j;
        this.d = (byte) (this.d | 1);
    }
}
