package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anek implements weh {
    static final anej a;
    public static final weq b;
    private final anem c;

    static {
        anej anejVar = new anej();
        a = anejVar;
        b = anejVar;
    }

    public anek(anem anemVar) {
        this.c = anemVar;
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
        return new anei(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anek) && this.c.equals(((anek) obj).c);
    }

    public List getCompletedJobs() {
        return this.c.d;
    }

    public aijp getLatestCompletedJobTimestampSeenByClient() {
        aijp aijpVar = this.c.g;
        return aijpVar == null ? aijp.a : aijpVar;
    }

    public String getLatestGenerationThumbnailUrl() {
        return this.c.h;
    }

    public ajwo getNavigationCommand() {
        ajwo ajwoVar = this.c.i;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public List getPendingJobs() {
        return this.c.e;
    }

    public Integer getPercentComplete() {
        return Integer.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MediaGenStatusTrackingEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
