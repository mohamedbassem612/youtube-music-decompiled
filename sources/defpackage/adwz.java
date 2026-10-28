package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adwz implements adlz {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ adwz(adxb adxbVar, aqaw aqawVar, int i) {
        this.$cid = i;
        this.a = adxbVar;
        this.b = aqawVar;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        int i2 = this.$cid;
        Object obj = this.a;
        if (i2 != 0) {
            adlyVar.f("listener", obj);
            adlyVar.a(((vhz) this.b).d);
            return;
        }
        adxb adxbVar = (adxb) obj;
        adlyVar.f("sortFilterMenu", adxbVar.a);
        adlyVar.f("sortFilterMenuModel", this.b);
        adlyVar.f("sortFilterContinuationHandler", adxbVar.c);
        adlyVar.f("sortFilterEndpointArgsKey", null);
        adlyVar.a(adxbVar.b);
    }

    public /* synthetic */ adwz(vhz vhzVar, yno ynoVar, int i) {
        this.$cid = i;
        this.b = vhzVar;
        this.a = ynoVar;
    }
}
