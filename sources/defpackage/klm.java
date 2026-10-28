package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klm extends kmz implements kks {
    private static final khn a;
    private static final kro b;
    private static final kro c;

    static {
        kro kroVar = new kro();
        c = kroVar;
        kll kllVar = new kll();
        b = kllVar;
        a = new khn("CloudMessaging.API", kllVar, kroVar);
    }

    public klm(Context context) {
        super(context, null, a, kms.f, kmy.a);
    }

    @Override // defpackage.kks
    public final lpa a(kle kleVar) {
        kpj kpjVar = new kpj();
        kpjVar.b = new klq[]{kkw.a};
        kpjVar.a = new jyx(this, kleVar, 5);
        kpjVar.c = 39001;
        return super.A(0, kpjVar.a());
    }
}
