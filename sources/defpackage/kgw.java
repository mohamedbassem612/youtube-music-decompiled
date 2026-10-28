package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgw extends kmz {
    public static final /* synthetic */ int a = 0;
    private static final khn b;
    private static final kro c;
    private static final kro d;

    static {
        kro kroVar = new kro();
        d = kroVar;
        kgs kgsVar = new kgs();
        c = kgsVar;
        b = new khn("CastApi.API", kgsVar, kroVar);
    }

    public kgw(Context context) {
        super(context, null, b, kms.f, kmy.a);
    }

    public final lpa a(String[] strArr) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kgr(strArr, 1);
        kpjVar.b = new klq[]{kaf.d};
        kpjVar.b();
        kpjVar.c = 8425;
        return super.A(0, kpjVar.a());
    }

    public final lpa b(String[] strArr) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kgr(strArr, 0);
        kpjVar.b = new klq[]{kaf.h};
        kpjVar.b();
        kpjVar.c = 8427;
        return super.A(0, kpjVar.a());
    }

    public final lpa c(String[] strArr) {
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(strArr, 2);
        kpjVar.b = new klq[]{kaf.g};
        kpjVar.b();
        kpjVar.c = 8426;
        return super.A(0, kpjVar.a());
    }
}
