package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzp {
    public Long a;
    public Long b;
    public Long c;
    public Integer d;
    public nzr e;
    private String f;

    public final nzt a() {
        String str = this.f;
        if (str != null) {
            return new nzt(str, this.a, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: name");
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f = str;
    }
}
