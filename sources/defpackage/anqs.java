package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anqs implements weh {
    static final anqr a;
    public static final weq b;
    public final anqt c;

    static {
        anqr anqrVar = new anqr();
        a = anqrVar;
        b = anqrVar;
    }

    public anqs(anqt anqtVar) {
        this.c = anqtVar;
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
        return new anqq(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anqs) && this.c.equals(((anqs) obj).c);
    }

    public Boolean getInLibrary() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicLibraryStatusEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
