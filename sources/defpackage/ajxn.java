package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxn implements weh {
    static final ajxm a;
    public static final weq b;
    public final ajxo c;

    static {
        ajxm ajxmVar = new ajxm();
        a = ajxmVar;
        b = ajxmVar;
    }

    public ajxn(ajxo ajxoVar) {
        this.c = ajxoVar;
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
    public final ajxl d() {
        return new ajxl(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajxn) && this.c.equals(((ajxn) obj).c);
    }

    public String getCommentDraft() {
        return this.c.h;
    }

    public String getCommentText() {
        return this.c.d;
    }

    public Boolean getDisableEntryPoint() {
        return Boolean.valueOf(this.c.i);
    }

    public ajwo getDismissDialogCommand() {
        ajwo ajwoVar = this.c.l;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public List getEmojiRuns() {
        return this.c.g;
    }

    public String getFirstLineText() {
        return this.c.q;
    }

    public Boolean getForceDisableDiscardDialog() {
        return Boolean.valueOf(this.c.w);
    }

    public String getImageUrl() {
        return this.c.v;
    }

    public Boolean getIsInitialized() {
        return Boolean.valueOf(this.c.j);
    }

    public Boolean getIsMultilineMode() {
        return Boolean.valueOf(this.c.x);
    }

    public Float getLineHeight() {
        return Float.valueOf(this.c.n);
    }

    public List getMentionRuns() {
        return this.c.f;
    }

    public Float getNumLines() {
        return Float.valueOf(this.c.m);
    }

    public Boolean getNumLinesChanged() {
        return Boolean.valueOf(this.c.o);
    }

    public Integer getRating() {
        return Integer.valueOf(this.c.t);
    }

    public Boolean getShouldDisplayStoredText() {
        return Boolean.valueOf(this.c.k);
    }

    public String getShownText() {
        return this.c.e;
    }

    public Boolean getSmartReplyServed() {
        return Boolean.valueOf(this.c.r);
    }

    public alay getStartingText() {
        alay alayVar = this.c.s;
        return alayVar == null ? alay.a : alayVar;
    }

    public String getTenorId() {
        return this.c.u;
    }

    public Float getTextWidth() {
        return Float.valueOf(this.c.p);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommentComposerTextStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
