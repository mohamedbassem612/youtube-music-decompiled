package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apwc implements weh {
    static final apwb a;
    public static final weq b;
    private final apwd c;

    static {
        apwb apwbVar = new apwb();
        a = apwbVar;
        b = apwbVar;
    }

    public apwc(apwd apwdVar) {
        this.c = apwdVar;
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
        return new apwa(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apwc) && this.c.equals(((apwc) obj).c);
    }

    public Integer getAssetsCount() {
        return Integer.valueOf(this.c.p);
    }

    public Long getCompositionDurationMillis() {
        return Long.valueOf(this.c.k);
    }

    public Long getCreatedTimestampMillis() {
        return Long.valueOf(this.c.f);
    }

    public String getDraftFrontendId() {
        return this.c.n;
    }

    public Long getExpirationTimestampMillis() {
        return Long.valueOf(this.c.s);
    }

    public aigj getImageData() {
        apwd apwdVar = this.c;
        return apwdVar.c == 6 ? (aigj) apwdVar.d : aigj.d;
    }

    public String getImageFilePath() {
        apwd apwdVar = this.c;
        return apwdVar.c == 7 ? (String) apwdVar.d : "";
    }

    public Long getLastModifiedTimestampMillis() {
        return Long.valueOf(this.c.g);
    }

    public apvr getLastSaveAction() {
        apvr apvrVarA = apvr.a(this.c.i);
        return apvrVarA == null ? apvr.SHORTS_CREATION_DRAFT_SAVE_ACTION_UNSPECIFIED : apvrVarA;
    }

    public List getOrchestrationIds() {
        return this.c.q;
    }

    public List getOrchestrationMetadata() {
        return this.c.r;
    }

    public Boolean getProjectIsModifiedSinceLastMdeSnapshot() {
        return Boolean.valueOf(this.c.o);
    }

    public String getProjectTitle() {
        return this.c.l;
    }

    public aigj getSnapshotData() {
        return this.c.m;
    }

    public String getThumbnailFileFullPath() {
        return this.c.j;
    }

    public Integer getUserSaveCount() {
        return Integer.valueOf(this.c.h);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ShortsCreationProjectMetadataEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
