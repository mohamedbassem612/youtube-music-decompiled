package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtc implements weh {
    static final amtb a;
    public static final weq b;
    private final amtd c;

    static {
        amtb amtbVar = new amtb();
        a = amtbVar;
        b = amtbVar;
    }

    public amtc(amtd amtdVar) {
        this.c = amtdVar;
    }

    public static amta e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = amtd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amtd amtdVar = (amtd) aihfVarCreateBuilder.instance;
        amtdVar.b |= 1;
        amtdVar.c = str;
        return new amta(aihfVarCreateBuilder);
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
        return new amta(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amtc) && this.c.equals(((amtc) obj).c);
    }

    public final boolean f() {
        return (this.c.b & 4) != 0;
    }

    public Long getImageFetchedTimestampMs() {
        return Long.valueOf(this.c.f);
    }

    public Boolean getIsChannelAvatar() {
        return Boolean.valueOf(this.c.g);
    }

    public String getLocalImageUrl() {
        return this.c.e;
    }

    public String getRemoteImageUrl() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LocalImageEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
