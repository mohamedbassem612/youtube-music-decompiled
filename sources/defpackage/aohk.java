package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohk implements weh {
    static final aohj a;
    public static final weq b;
    public final aohl c;

    static {
        aohj aohjVar = new aohj();
        a = aohjVar;
        b = aohjVar;
    }

    public aohk(aohl aohlVar) {
        this.c = aohlVar;
    }

    public static aohi e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = aohl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aohl aohlVar = (aohl) aihfVarCreateBuilder.instance;
        aohlVar.b |= 1;
        aohlVar.c = str;
        return new aohi(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        getOfflineFutureUnplayableInfoModel();
        agkxVar.j(new agkx().g());
        getOnTapCommandOverrideDataModel();
        agkxVar.j(new agkx().g());
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
    public final boolean equals(Object obj) {
        return (obj instanceof aohk) && this.c.equals(((aohk) obj).c);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final aohi d() {
        return new aohi(this.c.toBuilder());
    }

    public aohh getAction() {
        aohh aohhVarA = aohh.a(this.c.d);
        return aohhVarA == null ? aohh.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN : aohhVarA;
    }

    public Long getExpirationTimestamp() {
        return Long.valueOf(this.c.e);
    }

    public Long getLastUpdatedTimestampSeconds() {
        return Long.valueOf(this.c.h);
    }

    public aoeu getOfflineFutureUnplayableInfo() {
        aoeu aoeuVar = this.c.g;
        return aoeuVar == null ? aoeu.a : aoeuVar;
    }

    public aoes getOfflineFutureUnplayableInfoModel() {
        aoeu aoeuVar = this.c.g;
        if (aoeuVar == null) {
            aoeuVar = aoeu.a;
        }
        return new aoes((aoeu) aoeuVar.toBuilder().build());
    }

    public aofp getOfflinePlaybackDisabledReason() {
        aofp aofpVarA = aofp.a(this.c.l);
        return aofpVarA == null ? aofp.OFFLINE_PLAYBACK_DISABLED_REASON_UNSPECIFIED : aofpVarA;
    }

    public aigj getOfflineStateBytes() {
        return this.c.f;
    }

    public String getOfflineToken() {
        return this.c.k;
    }

    public aoet getOnTapCommandOverrideData() {
        aoet aoetVar = this.c.i;
        return aoetVar == null ? aoet.a : aoetVar;
    }

    public aoer getOnTapCommandOverrideDataModel() {
        aoet aoetVar = this.c.i;
        if (aoetVar == null) {
            aoetVar = aoet.a;
        }
        return new aoer((aoet) aoetVar.toBuilder().build());
    }

    public String getShortMessageForDisabledAction() {
        return this.c.j;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "OfflineVideoPolicyEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
