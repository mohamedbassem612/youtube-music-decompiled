package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anjq implements weh {
    static final anjp a;
    public static final weq b;
    public final anjr c;

    static {
        anjp anjpVar = new anjp();
        a = anjpVar;
        b = anjpVar;
    }

    public anjq(anjr anjrVar) {
        this.c = anjrVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anjr anjrVar = this.c;
        if (anjrVar.d.size() > 0) {
            agkxVar.j(anjrVar.d);
        }
        return agkxVar.g();
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final anjo d() {
        return new anjo(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anjq) && this.c.equals(((anjq) obj).c);
    }

    public final boolean f() {
        return (this.c.b & 4) != 0;
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.e);
    }

    public Long getClientLastInvalidationTimestampMillis() {
        return Long.valueOf(this.c.i);
    }

    public Long getLastModifiedTimestampMillis() {
        return Long.valueOf(this.c.h);
    }

    public anxf getSmartDownloadMetadata() {
        anxf anxfVar = this.c.f;
        return anxfVar == null ? anxf.a : anxfVar;
    }

    public akmx getSyncState() {
        akmx akmxVarA = akmx.a(this.c.g);
        return akmxVarA == null ? akmx.DOWNLOAD_SYNC_STATE_UNKNOWN : akmxVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicAlbumReleaseDownloadMetadataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
