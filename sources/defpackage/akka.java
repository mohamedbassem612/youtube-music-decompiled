package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akka implements weh {
    static final akjz a;
    public static final weq b;
    public final akkb c;

    static {
        akjz akjzVar = new akjz();
        a = akjzVar;
        b = akjzVar;
    }

    public akka(akkb akkbVar) {
        this.c = akkbVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.f;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new akjy(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akka) && this.c.equals(((akka) obj).c);
    }

    public Integer getStickyVideoQualityFixedResolution() {
        akkb akkbVar = this.c;
        return Integer.valueOf(akkbVar.d == 2 ? ((Integer) akkbVar.e).intValue() : 0);
    }

    public arfb getStickyVideoQualitySetting() {
        arfb arfbVarA;
        akkb akkbVar = this.c;
        return (akkbVar.d != 3 || (arfbVarA = arfb.a(((Integer) akkbVar.e).intValue())) == null) ? arfb.VIDEO_QUALITY_SETTING_UNKNOWN : arfbVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "DataSavingVideoQualityEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
