package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajqv implements weh {
    static final ajqu a;
    public static final weq b;
    private final ajqw c;

    static {
        ajqu ajquVar = new ajqu();
        a = ajquVar;
        b = ajquVar;
    }

    public ajqv(ajqw ajqwVar) {
        this.c = ajqwVar;
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
        return new ajqt(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajqv) && this.c.equals(((ajqv) obj).c);
    }

    public asnm getImage() {
        asnm asnmVar = this.c.d;
        return asnmVar == null ? asnm.a : asnmVar;
    }

    public Boolean getIsDefault() {
        return Boolean.valueOf(this.c.e);
    }

    public aonc getUploadStatus() {
        aonc aoncVarA = aonc.a(this.c.f);
        return aoncVarA == null ? aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED : aoncVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ChannelImageEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
