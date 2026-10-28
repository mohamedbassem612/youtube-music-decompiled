package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkk extends kmz implements kki {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        kkj kkjVar = new kkj();
        c = kkjVar;
        b = new khn("ClearcutLoggerSampling.API", kkjVar, kroVar);
    }

    public kkk(Context context) {
        super(context, null, b, kms.f, kmy.a);
    }

    @Override // defpackage.kki
    public final lpa a(kko kkoVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{kiu.b};
        kpjVar.b();
        kpjVar.a = new kak(kkoVar, 4);
        return super.A(0, kpjVar.a());
    }
}
