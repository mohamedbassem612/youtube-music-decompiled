package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ksj extends kmz implements kqe {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        ksi ksiVar = new ksi();
        c = ksiVar;
        b = new khn("ClientThrottling.API", ksiVar, kroVar);
    }

    public ksj(Context context) {
        super(context, null, b, kms.f, kmy.a);
    }

    @Override // defpackage.kqe
    public final void a(kqg kqgVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{kkq.c};
        kpjVar.b();
        kpjVar.a = new kak(kqgVar, 6);
        super.A(2, kpjVar.a());
    }
}
