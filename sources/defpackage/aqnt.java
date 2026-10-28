package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqnt implements weh {
    static final aqns a;
    public static final weq b;
    public final aqnu c;

    static {
        aqns aqnsVar = new aqns();
        a = aqnsVar;
        b = aqnsVar;
    }

    public aqnt(aqnu aqnuVar) {
        this.c = aqnuVar;
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
        return new aqnr(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqnt) && this.c.equals(((aqnt) obj).c);
    }

    public Boolean getIsToggled() {
        return Boolean.valueOf(this.c.d);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ToggleMenuServiceItemEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
