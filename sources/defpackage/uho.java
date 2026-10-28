package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uho {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private byte f;

    public final uhp a() {
        if (this.f == 31) {
            uhp uhpVar = new uhp(this.a, this.b, this.c, this.d, this.e);
            int i = uhpVar.c;
            ahno.G(((i == -1 || uhpVar.d == -1) ? false : true) ^ (i == -1 && uhpVar.d == -1), "Both exitIcon and exitText must be set.");
            int i2 = uhpVar.a;
            ahno.G(((i2 == -1 || uhpVar.b == -1) ? false : true) ^ (i2 == -1 && uhpVar.b == -1), "Both reshootIcon and reshootText must be set.");
            return uhpVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" reshootIcon");
        }
        if ((this.f & 2) == 0) {
            sb.append(" reshootText");
        }
        if ((this.f & 4) == 0) {
            sb.append(" exitIcon");
        }
        if ((this.f & 8) == 0) {
            sb.append(" exitText");
        }
        if ((this.f & 16) == 0) {
            sb.append(" immersive");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.f = (byte) (this.f | 4);
    }

    public final void c(int i) {
        this.d = i;
        this.f = (byte) (this.f | 8);
    }

    public final void d(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 16);
    }

    public final void e(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public final void f(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }
}
