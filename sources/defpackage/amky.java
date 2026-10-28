package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amky implements weh {
    static final amkx a;
    public static final weq b;
    private final amkz c;

    static {
        amkx amkxVar = new amkx();
        a = amkxVar;
        b = amkxVar;
    }

    public amky(amkz amkzVar) {
        this.c = amkzVar;
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
        return new amkw(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amky) && this.c.equals(((amky) obj).c);
    }

    public askp getExpandedLikeCountIfDisliked() {
        askp askpVar = this.c.h;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getExpandedLikeCountIfIndifferent() {
        askp askpVar = this.c.i;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getExpandedLikeCountIfLiked() {
        askp askpVar = this.c.g;
        return askpVar == null ? askp.a : askpVar;
    }

    public aplu getExpandedRollFromNumber() {
        aplu apluVar = this.c.s;
        return apluVar == null ? aplu.a : apluVar;
    }

    public aplu getExpandedRollFromNumberIfDisliked() {
        aplu apluVar = this.c.w;
        return apluVar == null ? aplu.a : apluVar;
    }

    public aplu getExpandedRollFromNumberIfLiked() {
        aplu apluVar = this.c.v;
        return apluVar == null ? aplu.a : apluVar;
    }

    public askp getLikeButtonA11YText() {
        askp askpVar = this.c.k;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getLikeCountIfDisliked() {
        askp askpVar = this.c.e;
        return askpVar == null ? askp.a : askpVar;
    }

    public Long getLikeCountIfDislikedNumber() {
        return Long.valueOf(this.c.m);
    }

    public askp getLikeCountIfIndifferent() {
        askp askpVar = this.c.f;
        return askpVar == null ? askp.a : askpVar;
    }

    public Long getLikeCountIfIndifferentNumber() {
        return Long.valueOf(this.c.n);
    }

    public askp getLikeCountIfLiked() {
        askp askpVar = this.c.d;
        return askpVar == null ? askp.a : askpVar;
    }

    public Long getLikeCountIfLikedNumber() {
        return Long.valueOf(this.c.l);
    }

    public askp getLikeCountLabel() {
        askp askpVar = this.c.j;
        return askpVar == null ? askp.a : askpVar;
    }

    public aplu getRollFromNumber() {
        aplu apluVar = this.c.r;
        return apluVar == null ? aplu.a : apluVar;
    }

    public aplu getRollFromNumberIfDisliked() {
        aplu apluVar = this.c.u;
        return apluVar == null ? aplu.a : apluVar;
    }

    public aplu getRollFromNumberIfLiked() {
        aplu apluVar = this.c.t;
        return apluVar == null ? aplu.a : apluVar;
    }

    public askp getSentimentFactoidA11YTextIfDisliked() {
        askp askpVar = this.c.q;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getSentimentFactoidA11YTextIfLiked() {
        askp askpVar = this.c.p;
        return askpVar == null ? askp.a : askpVar;
    }

    public Boolean getShouldExpandLikeCount() {
        return Boolean.valueOf(this.c.o);
    }

    public aqfc getSubtitleLikeCountIfDisliked() {
        aqfc aqfcVar = this.c.y;
        return aqfcVar == null ? aqfc.a : aqfcVar;
    }

    public aqfc getSubtitleLikeCountIfIndifferent() {
        aqfc aqfcVar = this.c.z;
        return aqfcVar == null ? aqfc.a : aqfcVar;
    }

    public aqfc getSubtitleLikeCountIfLiked() {
        aqfc aqfcVar = this.c.x;
        return aqfcVar == null ? aqfc.a : aqfcVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LikeCountEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
