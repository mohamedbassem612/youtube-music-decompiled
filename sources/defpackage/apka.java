package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apka implements weh {
    static final apjz a;
    public static final weq b;
    private final apkb c;

    static {
        apjz apjzVar = new apjz();
        a = apjzVar;
        b = apjzVar;
    }

    public apka(apkb apkbVar) {
        this.c = apkbVar;
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
        return new apjy(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apka) && this.c.equals(((apka) obj).c);
    }

    public String getReplyButtonAccessibilityText() {
        return this.c.f;
    }

    public askp getReplyCount() {
        askp askpVar = this.c.d;
        return askpVar == null ? askp.a : askpVar;
    }

    public Long getReplyCountNumber() {
        return Long.valueOf(this.c.e);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ReplyCountEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
