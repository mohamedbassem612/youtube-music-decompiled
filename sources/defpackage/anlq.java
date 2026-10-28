package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anlq implements weh {
    static final anlp a;
    public static final weq b;
    private final anlr c;

    static {
        anlp anlpVar = new anlp();
        a = anlpVar;
        b = anlpVar;
    }

    public anlq(anlr anlrVar) {
        this.c = anlrVar;
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
        return new anlo(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anlq) && this.c.equals(((anlq) obj).c);
    }

    public String getExternalChannelId() {
        return this.c.d;
    }

    public String getTitle() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicChannelEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
