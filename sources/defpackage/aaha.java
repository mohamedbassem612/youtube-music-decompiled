package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaha {
    public aahc a;
    public weo b;
    private int c;
    private String d;
    private byte e;

    public final aahb a() {
        aahc aahcVar;
        String str;
        if (this.e == 1 && (aahcVar = this.a) != null && (str = this.d) != null) {
            return new aagv(aahcVar, this.b, this.c, str, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" entityEventType");
        }
        if (this.e == 0) {
            sb.append(" entityType");
        }
        if (this.d == null) {
            sb.append(" entityId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null entityId");
        }
        this.d = str;
    }

    public final void c(int i) {
        this.c = i;
        this.e = (byte) 1;
    }
}
