package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annq implements weh {
    static final annp a;
    public static final weq b;
    private final annr c;

    static {
        annp annpVar = new annp();
        a = annpVar;
        b = annpVar;
    }

    public annq(annr annrVar) {
        this.c = annrVar;
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
        return new anno(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof annq) && this.c.equals(((annq) obj).c);
    }

    public Float getDownloadProgress() {
        return Float.valueOf(this.c.e);
    }

    public ardr getDownloadState() {
        ardr ardrVarA = ardr.a(this.c.d);
        return ardrVarA == null ? ardr.DOWNLOAD_STATE_UNKNOWN : ardrVarA;
    }

    public Boolean getIsSmartDownloaded() {
        return Boolean.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicDownloadStatusEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
