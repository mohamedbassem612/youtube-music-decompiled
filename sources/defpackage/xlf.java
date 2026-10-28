package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xlf {
    public int a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    private int f;

    public xlf(xlg xlgVar) {
        this.c = xlgVar.a;
        this.f = xlgVar.e;
        this.d = xlgVar.b;
        this.a = xlgVar.c;
        this.e = xlgVar.d;
        this.b = (byte) 1;
    }

    public final xlg a() {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        if (this.b == 1 && (obj = this.c) != null && (i = this.f) != 0 && (obj2 = this.d) != null && (obj3 = this.e) != null) {
            return new xlg((String) obj, i, (String) obj2, this.a, (xyv) obj3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" routeId");
        }
        if (this.f == 0) {
            sb.append(" sessionType");
        }
        if (this.d == null) {
            sb.append(" deviceName");
        }
        if (this.b == 0) {
            sb.append(" timeoutSeconds");
        }
        if (this.e == null) {
            sb.append(" playbackDescriptor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.a = i;
        this.b = (byte) 1;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null sessionType");
        }
        this.f = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qic] */
    public final qhx d() {
        int i;
        if (this.c == null) {
            this.c = agpi.a;
        }
        if (this.b == 3 && (i = this.a) != 0) {
            return new qhx(i, this.f, this.e, (agev) this.d, (agke) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.b & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(int i) {
        this.f = i;
        this.b = (byte) (this.b | 1);
    }

    public xlf(byte[] bArr) {
        this.d = agdf.a;
    }
}
