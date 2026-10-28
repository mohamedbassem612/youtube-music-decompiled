package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoop implements weh {
    static final aooo a;
    public static final weq b;
    public final wek c;
    public final aooq d;

    static {
        aooo aoooVar = new aooo();
        a = aoooVar;
        b = aoooVar;
    }

    public aoop(aooq aooqVar, wek wekVar) {
        this.d = aooqVar;
        this.c = wekVar;
    }

    public static aoon f(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) aooq.a.createBuilder();
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooqVar.b |= 1;
        aooqVar.c = str;
        return new aoon(aihhVar);
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        aooq aooqVar = this.d;
        if ((aooqVar.b & SemanticState.Hidden) != 0) {
            agkxVar.c(aooqVar.l);
        }
        if (aooqVar.m.size() > 0) {
            agkxVar.j(aooqVar.m);
        }
        if ((aooqVar.b & SemanticState.LiveRegion) != 0) {
            agkxVar.c(aooqVar.n);
        }
        if ((aooqVar.b & SemanticState.ReadOnly) != 0) {
            agkxVar.c(aooqVar.o);
        }
        if ((aooqVar.b & SemanticState.Modal) != 0) {
            agkxVar.c(aooqVar.p);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.d.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.d.toByteArray();
    }

    @Deprecated
    public final aohk e() {
        aooq aooqVar = this.d;
        if ((aooqVar.b & SemanticState.ReadOnly) == 0) {
            return null;
        }
        String str = aooqVar.o;
        weh wehVarD = this.c.d(str);
        boolean z = true;
        if (wehVarD != null && !(wehVarD instanceof aohk)) {
            z = false;
        }
        ahno.P(z, a.ch((byte) 41, str, wehVarD == null ? "null" : wehVarD.getClass().getSimpleName(), "offline_video_policy should be of type OfflineVideoPolicyEntityModel, but was a ", " (key="));
        return (aohk) wehVarD;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aoop) && this.d.equals(((aoop) obj).d);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aoon d() {
        return new aoon((aihh) this.d.toBuilder());
    }

    public aofo getOfflinePlayabilityStatus() {
        aofo aofoVar = this.d.e;
        return aofoVar == null ? aofo.a : aofoVar;
    }

    public String getPlayerParams() {
        return this.d.k;
    }

    public aigj getPlayerResponseBytes() {
        return this.d.d;
    }

    public String getPlayerResponseJson() {
        return this.d.f;
    }

    public aony getPlayerResponsePlayabilityCanPlayStatus() {
        aony aonyVarA = aony.a(this.d.h);
        return aonyVarA == null ? aony.OK : aonyVarA;
    }

    public Long getPlayerResponseTimestamp() {
        return Long.valueOf(this.d.g);
    }

    public Long getStreamDownloadTimestampSeconds() {
        return Long.valueOf(this.d.i);
    }

    @Deprecated
    public final aqph h() {
        aooq aooqVar = this.d;
        if ((aooqVar.b & SemanticState.Hidden) == 0) {
            return null;
        }
        String str = aooqVar.l;
        weh wehVarD = this.c.d(str);
        boolean z = true;
        if (wehVarD != null && !(wehVarD instanceof aqph)) {
            z = false;
        }
        ahno.P(z, a.ch((byte) 41, str, wehVarD == null ? "null" : wehVarD.getClass().getSimpleName(), "transfer should be of type TransferEntityModel, but was a ", " (key="));
        return (aqph) wehVarD;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.d.hashCode() ^ 1008001;
    }

    public final boolean i() {
        return (this.d.b & 2) != 0;
    }

    public final boolean j() {
        return (this.d.b & 32) != 0;
    }

    public final String toString() {
        return "PlaybackDataEntityModel{" + String.valueOf(this.d) + '}';
    }

    public weq getType() {
        return b;
    }
}
