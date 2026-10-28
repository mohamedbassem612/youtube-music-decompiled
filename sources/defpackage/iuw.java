package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iuw {
    private long a;
    private String b;
    private agke c;
    private byte d;

    public final iux a() {
        String str;
        agke agkeVar;
        if (this.d == 1 && (str = this.b) != null && (agkeVar = this.c) != null) {
            return new iux(this.a, str, agkeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.c == null) {
            sb.append(" tracks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.d = (byte) 1;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public final void d(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null tracks");
        }
        this.c = agkeVar;
    }
}
