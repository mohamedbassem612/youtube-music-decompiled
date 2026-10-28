package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achp {
    public String a;
    public byte[] b;
    public alvl c;
    public wja d;
    public alvf e;
    public aigj f;
    public aopm g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String l;
    public aigj m;
    public byte n;

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null currentVideoId");
        }
        this.a = str;
    }

    public final void b(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 1);
    }

    public final void c(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 2);
    }
}
