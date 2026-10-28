package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xbc implements aean {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xbc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aean
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            xbf xbfVar = (xbf) this.a;
            wxl wxlVar = xbfVar.m;
            if (wxlVar != null) {
                wxlVar.d();
            }
            xbfVar.i.z();
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            aean aeanVar = ((aeaq) obj).f;
            if (aeanVar != null) {
                aeanVar.a();
                return;
            }
            return;
        }
        srd srdVar = (srd) obj;
        stb stbVar = srdVar.g;
        if (stbVar != null) {
            stbVar.e(srdVar.f);
            srdVar.g.b();
            srdVar.g.e(srdVar.e);
        }
    }
}
