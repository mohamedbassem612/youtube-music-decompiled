package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajgy implements weh {
    static final ajgw a;
    public static final weq b;
    private final ajgz c;

    static {
        ajgw ajgwVar = new ajgw();
        a = ajgwVar;
        b = ajgwVar;
    }

    public ajgy(ajgz ajgzVar) {
        this.c = ajgzVar;
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
        return new ajgx(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajgy) && this.c.equals(((ajgy) obj).c);
    }

    public askp getValue() {
        askp askpVar = this.c.d;
        return askpVar == null ? askp.a : askpVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "AttributedStringEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
