package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ansx implements weh {
    static final answ a;
    public static final weq b;
    public final ansy c;

    static {
        answ answVar = new answ();
        a = answVar;
        b = answVar;
    }

    public ansx(ansy ansyVar) {
        this.c = ansyVar;
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ansv d() {
        return new ansv(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ansx) && this.c.equals(((ansx) obj).c);
    }

    public Long getAutoDownloadBoundaryTimestampSeconds() {
        return Long.valueOf(this.c.e);
    }

    public aofs getAutoSyncType() {
        aofs aofsVarA = aofs.a(this.c.d);
        return aofsVarA == null ? aofs.OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_UNSPECIFIED : aofsVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicOfflinePlaylistSyncPolicyEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
