package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wfm {
    public String a;
    private int b;
    private byte c;

    public final wfn a() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new wfn(str, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" entityId");
        }
        if (this.c == 0) {
            sb.append(" entityType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
