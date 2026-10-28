package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvd implements weh {
    static final anvc a;
    public static final weq b;
    private final anve c;

    static {
        anvc anvcVar = new anvc();
        a = anvcVar;
        b = anvcVar;
    }

    public anvd(anve anveVar) {
        this.c = anveVar;
    }

    public static anvb e(anve anveVar) {
        return new anvb(anveVar.toBuilder());
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
        return new anvb(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anvd) && this.c.equals(((anvd) obj).c);
    }

    public String getAndroidMediaStoreContentUri() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlaylistSideloadMetadataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
