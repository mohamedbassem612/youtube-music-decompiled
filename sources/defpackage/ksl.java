package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksl extends kmz implements krw {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        ksk kskVar = new ksk();
        c = kskVar;
        b = new khn("ClientTelemetry.API", kskVar, kroVar);
    }

    public ksl(Context context, krx krxVar) {
        super(context, null, b, krxVar, kmy.a);
    }

    @Override // defpackage.krw
    public final lpa a(krv krvVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{kkq.a};
        kpjVar.b();
        kpjVar.a = new kgr(krvVar, 2);
        return super.A(2, kpjVar.a());
    }
}
