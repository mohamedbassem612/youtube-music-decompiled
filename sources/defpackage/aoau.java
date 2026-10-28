package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoau implements weh {
    static final aoat a;
    public static final weq b;
    private final aoav c;

    static {
        aoat aoatVar = new aoat();
        a = aoatVar;
        b = aoatVar;
    }

    public aoau(aoav aoavVar) {
        this.c = aoavVar;
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
        return new aoas(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aoau) && this.c.equals(((aoau) obj).c);
    }

    public Long getUnreadCount() {
        return Long.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "NavigationItemEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
