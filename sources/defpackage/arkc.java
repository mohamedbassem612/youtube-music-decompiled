package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arkc implements weh {
    static final arkb a;
    public static final weq b;
    private final arkd c;

    static {
        arkb arkbVar = new arkb();
        a = arkbVar;
        b = arkbVar;
    }

    public arkc(arkd arkdVar) {
        this.c = arkdVar;
    }

    public static arka e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = arkd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arkd arkdVar = (arkd) aihfVarCreateBuilder.instance;
        arkdVar.b |= 1;
        arkdVar.c = str;
        return new arka(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new arka(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof arkc) && this.c.equals(((arkc) obj).c);
    }

    public Boolean getCanGoBack() {
        return Boolean.valueOf(this.c.j);
    }

    public Boolean getCanGoForward() {
        return Boolean.valueOf(this.c.k);
    }

    public String getFullUrl() {
        return this.c.d;
    }

    public String getHostName() {
        return this.c.e;
    }

    public Boolean getIs3PHost() {
        return Boolean.valueOf(this.c.g);
    }

    public Boolean getIsLoaded() {
        return Boolean.valueOf(this.c.i);
    }

    public Boolean getIsSecuredUrl() {
        return Boolean.valueOf(this.c.l);
    }

    public String getPageTitle() {
        return this.c.h;
    }

    public String getSchema() {
        return this.c.f;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "WebViewEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
