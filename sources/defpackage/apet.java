package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apet implements weh {
    static final apes a;
    public static final weq b;
    private final apeu c;

    static {
        apes apesVar = new apes();
        a = apesVar;
        b = apesVar;
    }

    public apet(apeu apeuVar) {
        this.c = apeuVar;
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
        return new aper(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apet) && this.c.equals(((apet) obj).c);
    }

    public Boolean getIsVisible() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ReelPlayerOrganicAdOverlayVisibilityEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
