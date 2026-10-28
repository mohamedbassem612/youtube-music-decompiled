package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaum implements agex {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aaum(abqq abqqVar, String str, int i) {
        this.$cid = i;
        this.a = abqqVar;
        this.b = str;
    }

    @Override // defpackage.agex
    public final boolean a(Object obj) {
        if (this.$cid == 0) {
            ((abqq) this.a).m((String) this.b, (aaup) obj);
            return false;
        }
        zed zedVar = (zed) obj;
        if (aqv.a(zedVar, (zed) this.a) <= 0) {
            return false;
        }
        zep zepVar = (zep) this.b;
        return (zepVar.d.equals(arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) && zepVar.c.c().d) || zedVar.b() < 720;
    }

    public /* synthetic */ aaum(zep zepVar, zed zedVar, int i) {
        this.$cid = i;
        this.b = zepVar;
        this.a = zedVar;
    }
}
