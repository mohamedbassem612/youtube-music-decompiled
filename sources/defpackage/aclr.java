package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aclr {
    public int a;
    public int b;
    public byte c;

    public final void a(int i) {
        this.a = i;
        this.c = (byte) (this.c | 4);
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 8);
    }

    public final abns c() {
        int i;
        if (this.c == 1 && (i = this.b) != 0) {
            return new abns(i, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" prefetchReason");
        }
        if (this.c == 0) {
            sb.append(" playbackBeginsInSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(int i) {
        this.a = i;
        this.c = (byte) 1;
    }
}
