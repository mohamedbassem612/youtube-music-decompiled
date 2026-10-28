package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anju implements weh {
    static final anjt a;
    public static final weq b;
    private final ankc c;

    static {
        anjt anjtVar = new anjt();
        a = anjtVar;
        b = anjtVar;
    }

    public anju(ankc ankcVar) {
        this.c = ankcVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        ankc ankcVar = this.c;
        if ((ankcVar.b & 2) != 0) {
            agkxVar.c(ankcVar.d);
        }
        if (ankcVar.f.size() > 0) {
            agkxVar.j(ankcVar.f);
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
        return new anjs(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anju) && this.c.equals(((anju) obj).c);
    }

    public String getDescription() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicAlbumReleaseDetailEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
