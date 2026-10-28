package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kza extends kmz implements kyv {
    public static final khn a;
    static final kro b;

    static {
        kro kroVar = new kro();
        b = kroVar;
        a = new khn("LocationServices.API", new kyz(), kroVar);
    }

    public kza(Context context) {
        super(context, null, a, kms.f, kmy.a);
    }

    @Override // defpackage.kyv
    public final lpa a() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(5);
        kpjVar.c = 2414;
        return super.A(0, kpjVar.a());
    }
}
