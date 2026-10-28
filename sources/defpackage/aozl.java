package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozl implements weh {
    static final aozk a;
    public static final weq b;
    private final aozm c;

    static {
        aozk aozkVar = new aozk();
        a = aozkVar;
        b = aozkVar;
    }

    public aozl(aozm aozmVar) {
        this.c = aozmVar;
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
        return new aozj(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aozl) && this.c.equals(((aozl) obj).c);
    }

    public Boolean getIsControlOverlayVisible() {
        return Boolean.valueOf(this.c.e);
    }

    public Boolean getIsFullscreen() {
        return Boolean.valueOf(this.c.f);
    }

    public Integer getVideoTimeSec() {
        return Integer.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ProductsInVideoEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
