package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alis implements weh {
    static final alir a;
    public static final weq b;
    private final alit c;

    static {
        alir alirVar = new alir();
        a = alirVar;
        b = alirVar;
    }

    public alis(alit alitVar) {
        this.c = alitVar;
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
        return new aliq(this.c.toBuilder());
    }

    public final boolean e() {
        return (this.c.b & 2) != 0;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof alis) && this.c.equals(((alis) obj).c);
    }

    public String getBadgeText() {
        return this.c.d;
    }

    public Boolean getIsVisible() {
        return Boolean.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "IconBadgeEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
