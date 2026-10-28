package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaua {
    public boolean a;
    public int b;
    public byte c;

    public final aaub a() {
        if (this.c == 3) {
            return new aaub(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" shouldShow");
        }
        if ((this.c & 2) == 0) {
            sb.append(" removeActionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public final void c() {
        this.a = true;
        this.c = (byte) (this.c | 1);
    }

    public final void d(int i) {
        this.b = i;
        this.c = (byte) (this.c | 1);
    }

    public final void e(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 2);
    }
}
