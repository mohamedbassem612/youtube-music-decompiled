package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anvh implements weh {
    static final anvg a;
    public static final weq b;
    private final anvi c;

    static {
        anvg anvgVar = new anvg();
        a = anvgVar;
        b = anvgVar;
    }

    public anvh(anvi anviVar) {
        this.c = anviVar;
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
        return new anvf(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anvh) && this.c.equals(((anvh) obj).c);
    }

    public Boolean getEnableFinishedItemAutoDeletion() {
        return Boolean.valueOf(this.c.d);
    }

    public Boolean getEnableUnfinishedItemAutoDeletion() {
        return Boolean.valueOf(this.c.f);
    }

    public Long getFinishedAutoDeletionDelayFromLastPlaybackSeconds() {
        return Long.valueOf(this.c.e);
    }

    public Long getUnfinishedAutoDeletionDelayFromAddedSeconds() {
        return Long.valueOf(this.c.g);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPodcastContentExpiryPolicyEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
