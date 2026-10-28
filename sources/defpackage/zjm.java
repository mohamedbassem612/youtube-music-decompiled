package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zjm {
    public aioy a;
    public Integer b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private byte g;

    public final zjn a() {
        aioy aioyVar;
        if (this.g == 15 && (aioyVar = this.a) != null) {
            return new zjn(aioyVar, this.c, this.d, this.e, this.f, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" codec");
        }
        if ((this.g & 1) == 0) {
            sb.append(" drmSupported");
        }
        if ((this.g & 2) == 0) {
            sb.append(" hdrSupported");
        }
        if ((this.g & 4) == 0) {
            sb.append(" isHardware");
        }
        if ((this.g & 8) == 0) {
            sb.append(" maxSoftwareHeight");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 1);
    }

    public final void c(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 2);
    }

    public final void d(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 4);
    }

    public final void e(int i) {
        this.f = i;
        this.g = (byte) (this.g | 8);
    }
}
