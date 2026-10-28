package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akie implements weh {
    static final akid a;
    public static final weq b;
    private final akif c;

    static {
        akid akidVar = new akid();
        a = akidVar;
        b = akidVar;
    }

    public akie(akif akifVar) {
        this.c = akifVar;
    }

    public static akic e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = akif.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akif akifVar = (akif) aihfVarCreateBuilder.instance;
        akifVar.b |= 1;
        akifVar.c = str;
        return new akic(aihfVarCreateBuilder);
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
        return new akic(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akie) && this.c.equals(((akie) obj).c);
    }

    public String getEncryptedBlobId() {
        return this.c.h;
    }

    public Long getImageHeight() {
        return Long.valueOf(this.c.f);
    }

    public Long getImageSize() {
        return Long.valueOf(this.c.d);
    }

    public Long getImageWidth() {
        return Long.valueOf(this.c.e);
    }

    public aonc getUploadStatus() {
        aonc aoncVarA = aonc.a(this.c.i);
        return aoncVarA == null ? aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED : aoncVarA;
    }

    public String getUri() {
        return this.c.g;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CreatorImageUploadEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
