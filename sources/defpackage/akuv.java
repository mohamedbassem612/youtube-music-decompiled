package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuv implements weh {
    static final akuu a;
    public static final weq b;
    private final akuw c;

    static {
        akuu akuuVar = new akuu();
        a = akuuVar;
        b = akuuVar;
    }

    public akuv(akuw akuwVar) {
        this.c = akuwVar;
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
        return new akut(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akuv) && this.c.equals(((akuv) obj).c);
    }

    public akur getHeartState() {
        akur akurVarA = akur.a(this.c.e);
        return akurVarA == null ? akur.TOOLBAR_HEART_STATE_UNKNOWN : akurVarA;
    }

    public akus getLikeState() {
        akus akusVarA = akus.a(this.c.d);
        return akusVarA == null ? akus.TOOLBAR_LIKE_STATE_UNKNOWN : akusVarA;
    }

    public CommandOuterClass$Command getVoiceReplyTooltipCommand() {
        CommandOuterClass$Command commandOuterClass$Command = this.c.f;
        return commandOuterClass$Command == null ? CommandOuterClass$Command.getDefaultInstance() : commandOuterClass$Command;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "EngagementToolbarStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
