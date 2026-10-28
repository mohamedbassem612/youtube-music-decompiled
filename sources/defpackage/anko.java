package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anko implements weh {
    static final ankn a;
    public static final weq b;
    private final ankv c;

    static {
        ankn anknVar = new ankn();
        a = anknVar;
        b = anknVar;
    }

    public anko(ankv ankvVar) {
        this.c = ankvVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        ankv ankvVar = this.c;
        if ((ankvVar.b & 2) != 0) {
            agkxVar.c(ankvVar.d);
        }
        return agkxVar.g();
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
        return new ankm(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anko) && this.c.equals(((anko) obj).c);
    }

    public String getDescription() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicArtistDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
