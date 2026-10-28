package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxj implements weh {
    static final ajxi a;
    public static final weq b;
    private final ajxk c;

    static {
        ajxi ajxiVar = new ajxi();
        a = ajxiVar;
        b = ajxiVar;
    }

    public ajxj(ajxk ajxkVar) {
        this.c = ajxkVar;
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
        return new ajxh(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajxj) && this.c.equals(((ajxj) obj).c);
    }

    public Boolean getChannelCreated() {
        return Boolean.valueOf(this.c.k);
    }

    public String getChannelCreationToken() {
        return this.c.h;
    }

    public String getCreateCommentParams() {
        ajxk ajxkVar = this.c;
        return ajxkVar.c == 2 ? (String) ajxkVar.d : "";
    }

    public ajwo getDiscardDialogReshowCommand() {
        ajwo ajwoVar = this.c.i;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public Boolean getShouldHideComposer() {
        return Boolean.valueOf(this.c.o);
    }

    public Boolean getShouldHideDisclaimer() {
        return Boolean.valueOf(this.c.m);
    }

    public Boolean getShouldReshowWithDraftText() {
        return Boolean.valueOf(this.c.j);
    }

    public String getTargetId() {
        return this.c.n;
    }

    public String getUpdateCommentParams() {
        ajxk ajxkVar = this.c;
        return ajxkVar.c == 3 ? (String) ajxkVar.d : "";
    }

    public argu getVoiceReplyData() {
        argu arguVar = this.c.l;
        return arguVar == null ? argu.a : arguVar;
    }

    public ajwo getZeroStepFailureCommand() {
        ajwo ajwoVar = this.c.g;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public ajwo getZeroStepSuccessCommand() {
        ajwo ajwoVar = this.c.f;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommentComposerControlsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
