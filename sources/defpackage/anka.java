package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anka implements weh {
    static final anjz a;
    public static final weq b;
    private final anke c;

    static {
        anjz anjzVar = new anjz();
        a = anjzVar;
        b = anjzVar;
    }

    public anka(anke ankeVar) {
        this.c = ankeVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anke ankeVar = this.c;
        if ((ankeVar.b & 2) != 0) {
            agkxVar.c(ankeVar.d);
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
        return new anjy(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anka) && this.c.equals(((anka) obj).c);
    }

    public Boolean getInLibrary() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicAlbumReleaseUserDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
