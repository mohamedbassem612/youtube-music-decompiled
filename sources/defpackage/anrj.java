package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anrj implements weh {
    static final anri a;
    public static final weq b;
    private final anrk c;

    static {
        anri anriVar = new anri();
        a = anriVar;
        b = anriVar;
    }

    public anrj(anrk anrkVar) {
        this.c = anrkVar;
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
        return new anrh(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anrj) && this.c.equals(((anrj) obj).c);
    }

    public ajug getClientLyricsData() {
        ajug ajugVar = this.c.d;
        return ajugVar == null ? ajug.a : ajugVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicLyricsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
