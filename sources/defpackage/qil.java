package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qil {
    public agev a = agdf.a;
    public byte b;
    public int c;

    public final qim a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new qim(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
