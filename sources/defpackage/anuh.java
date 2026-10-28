package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anuh implements weh {
    static final anug a;
    public static final weq b;
    private final anut c;

    static {
        anug anugVar = new anug();
        a = anugVar;
        b = anugVar;
    }

    public anuh(anut anutVar) {
        this.c = anutVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anut anutVar = this.c;
        if ((anutVar.b & 2) != 0) {
            agkxVar.c(anutVar.d);
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
        return new anuf(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anuh) && this.c.equals(((anuh) obj).c);
    }

    public String getDescription() {
        return this.c.e;
    }

    public Long getNumberOfViews() {
        return Long.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlaylistDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
