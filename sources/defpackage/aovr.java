package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aovr implements weh {
    static final aovq a;
    public static final weq b;
    private final aovs c;

    static {
        aovq aovqVar = new aovq();
        a = aovqVar;
        b = aovqVar;
    }

    public aovr(aovs aovsVar) {
        this.c = aovsVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aovp(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aovr) && this.c.equals(((aovr) obj).c);
    }

    public String getDeletedThumbnailName() {
        aovs aovsVar = this.c;
        return aovsVar.c == 6 ? (String) aovsVar.d : "";
    }

    public String getEncodedPlaylistImageGenerationProvenance() {
        return this.c.h;
    }

    public String getGeneratedImageResourceId() {
        aovs aovsVar = this.c;
        return aovsVar.c == 3 ? (String) aovsVar.d : "";
    }

    public String getPendingThumbnailUri() {
        return this.c.g;
    }

    public String getPlaylistImageName() {
        return this.c.f;
    }

    public String getUploadedImageResourceId() {
        aovs aovsVar = this.c;
        return aovsVar.c == 2 ? (String) aovsVar.d : "";
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "PlaylistThumbnailEditsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
