package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedu {
    public int a;
    public int b;
    public int c;
    public int d;

    public final aedv a() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        if (i4 != 0 && (i = this.b) != 0 && (i2 = this.c) != 0 && (i3 = this.d) != 0) {
            return new aedv(i4, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" fontRole");
        }
        if (this.b == 0) {
            sb.append(" fontSize");
        }
        if (this.c == 0) {
            sb.append(" fontLineHeight");
        }
        if (this.d == 0) {
            sb.append(" fontWeight");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.a = 3;
    }
}
