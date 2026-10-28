package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ksh extends kmz implements kqb {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        ksg ksgVar = new ksg();
        c = ksgVar;
        b = new khn("ClientNotification.API", ksgVar, kroVar);
    }

    public ksh(Context context) {
        super(context, null, b, kms.f, kmy.a);
    }

    @Override // defpackage.kqb
    public final void a(kqa kqaVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{kkq.b};
        kpjVar.b();
        kpjVar.a = new kak(kqaVar, 5);
        super.A(2, kpjVar.a());
    }
}
