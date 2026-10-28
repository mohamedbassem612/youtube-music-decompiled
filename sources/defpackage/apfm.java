package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apfm implements weh {
    static final apfl a;
    public static final weq b;
    private final apfn c;

    static {
        apfl apflVar = new apfl();
        a = apflVar;
        b = apflVar;
    }

    public apfm(apfn apfnVar) {
        this.c = apfnVar;
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
        return new apfk(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apfm) && this.c.equals(((apfm) obj).c);
    }

    public Long getCreationTimeUtcSeconds() {
        return Long.valueOf(this.c.f);
    }

    public Long getExpirationTimeUtcSeconds() {
        return Long.valueOf(this.c.e);
    }

    public ajwo getUpdatedEndpointProto() {
        ajwo ajwoVar = this.c.d;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ReelWatchEndpointDataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
