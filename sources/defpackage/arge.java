package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arge implements weh {
    static final argd a;
    public static final weq b;
    public final argf c;

    static {
        argd argdVar = new argd();
        a = argdVar;
        b = argdVar;
    }

    public arge(argf argfVar) {
        this.c = argfVar;
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
        return new argc(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof arge) && this.c.equals(((arge) obj).c);
    }

    public alay getExtraShortViewCount() {
        alay alayVar = this.c.i;
        return alayVar == null ? alay.a : alayVar;
    }

    public Integer getExtraShortViewCountLength() {
        return Integer.valueOf(this.c.h);
    }

    public alay getLiveStreamDate() {
        alay alayVar = this.c.k;
        return alayVar == null ? alay.a : alayVar;
    }

    public Integer getLiveStreamDateLength() {
        return Integer.valueOf(this.c.l);
    }

    public aplu getRollFromNumber() {
        aplu apluVar = this.c.p;
        return apluVar == null ? aplu.a : apluVar;
    }

    public alay getShortViewCount() {
        alay alayVar = this.c.f;
        return alayVar == null ? alay.a : alayVar;
    }

    public Integer getShortViewCountLength() {
        return Integer.valueOf(this.c.g);
    }

    public String getUnlabeledConcurrentViewers() {
        return this.c.j;
    }

    public alay getUnlabeledViewCountValue() {
        alay alayVar = this.c.m;
        return alayVar == null ? alay.a : alayVar;
    }

    public argg getVideoType() {
        argg arggVarA = argg.a(this.c.q);
        return arggVarA == null ? argg.VIEW_COUNT_VIDEO_TYPE_UNKNOWN : arggVarA;
    }

    public alay getViewCount() {
        alay alayVar = this.c.d;
        return alayVar == null ? alay.a : alayVar;
    }

    public alay getViewCountLabel() {
        alay alayVar = this.c.n;
        return alayVar == null ? alay.a : alayVar;
    }

    public Integer getViewCountLength() {
        return Integer.valueOf(this.c.e);
    }

    public Long getViewCountNumber() {
        return Long.valueOf(this.c.o);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ViewCountEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
