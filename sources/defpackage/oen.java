package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oen implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oen(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awqk, java.lang.Object] */
    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        if (this.$cid == 0) {
            return oeo.e((Context) this.a, (oaq) this.b, aqiVar);
        }
        ?? r0 = this.a;
        aqiVar.a(new px((awwd) r0.get(awwd.d), 10), dyu.INSTANCE);
        return awro.t(awrc.K(r0), null, 1, new dyz((awqk) this.b, aqiVar, (awoq) null, 0), 1);
    }
}
