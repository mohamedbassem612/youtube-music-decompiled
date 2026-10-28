package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukg {
    private float a;
    private float b;
    private float c;
    private float d;
    private byte e;

    public final ukh a() {
        if (this.e == 15) {
            return new ukh(this.a, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" left");
        }
        if ((this.e & 2) == 0) {
            sb.append(" top");
        }
        if ((this.e & 4) == 0) {
            sb.append(" right");
        }
        if ((this.e & 8) == 0) {
            sb.append(" bottom");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(float f) {
        this.d = f;
        this.e = (byte) (this.e | 8);
    }

    public final void c(float f) {
        this.a = f;
        this.e = (byte) (this.e | 1);
    }

    public final void d(float f) {
        this.c = f;
        this.e = (byte) (this.e | 4);
    }

    public final void e(float f) {
        this.b = f;
        this.e = (byte) (this.e | 2);
    }
}
