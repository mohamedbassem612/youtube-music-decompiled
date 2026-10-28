package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aosy implements weh {
    static final aosx a;
    public static final weq b;
    private final aosz c;

    static {
        aosx aosxVar = new aosx();
        a = aosxVar;
        b = aosxVar;
    }

    public aosy(aosz aoszVar) {
        this.c = aoszVar;
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
        return new aosw(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aosy) && this.c.equals(((aosy) obj).c);
    }

    public Boolean getIsCollaborative() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "PlaylistCollaborationEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
