package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwf {
    public String a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    private boolean g;
    private byte h = 1;

    public acwf(ycv ycvVar) {
        this.d = ycvVar.a;
        this.e = ycvVar.b;
        this.c = ycvVar.c;
        this.f = ycvVar.d;
        this.g = ycvVar.e;
        this.a = ycvVar.f;
        this.b = ycvVar.g;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [acwm, java.lang.Object] */
    public final acww a() {
        if (this.h != 1) {
            throw new IllegalStateException("Missing required properties: cancelable");
        }
        String str = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        return new acww(str, (alay) obj, (ajnf) obj2, (ajnf) obj3, this.g, (ajwo) this.e, this.f);
    }

    public final void b(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }

    public final ycv c() {
        String str;
        Object obj;
        if (this.h == 1 && (str = this.a) != null && (obj = this.b) != null) {
            return new ycv((xvu) this.d, (xvy) this.e, (xvv) this.c, (xvh) this.f, this.g, str, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" userInitiated");
        }
        if (this.a == null) {
            sb.append(" magmaKey");
        }
        if (this.b == null) {
            sb.append(" browserChannelUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }
}
