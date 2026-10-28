package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anku implements weh {
    static final ankt a;
    public static final weq b;
    private final ankx c;

    static {
        ankt anktVar = new ankt();
        a = anktVar;
        b = anktVar;
    }

    public anku(ankx ankxVar) {
        this.c = ankxVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        ankx ankxVar = this.c;
        if ((ankxVar.b & 2) != 0) {
            agkxVar.c(ankxVar.d);
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
        return new anks(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anku) && this.c.equals(((anku) obj).c);
    }

    public Boolean getSubscribed() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicArtistUserDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
