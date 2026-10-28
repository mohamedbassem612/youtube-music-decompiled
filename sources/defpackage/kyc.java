package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyc {
    public int a;
    public int b;
    private String c;
    private byte d;

    public final void a() {
        this.c = "";
    }

    public final void b() {
        this.d = (byte) 1;
    }

    public final void c() {
        if (this.d == 1 && this.c != null && this.a != 0 && this.b != 0) {
            int i = kyd.a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" fileOwner");
        }
        if (this.d == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.a == 0) {
            sb.append(" fileChecks");
        }
        if (this.b == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
