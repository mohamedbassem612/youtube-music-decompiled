package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzc implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tzc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        int i = this.$cid;
        if (i == 0) {
            tze tzeVar = new tze(aqiVar, 0);
            Object obj = this.a;
            ((avlb) obj).kp(tzeVar);
            return obj;
        }
        if (i == 1) {
            ((avlb) this.a).kp(new tze(aqiVar, 1));
            return "Cpu Device Signals";
        }
        if (i != 2) {
            return ((vyo) this.a).a.ar().ag(new vub(aqiVar, 8), new vub(aqiVar, 9));
        }
        return ((vxu) this.a).a.D(new vub(aqiVar, 5), new vub(aqiVar, 6));
    }
}
