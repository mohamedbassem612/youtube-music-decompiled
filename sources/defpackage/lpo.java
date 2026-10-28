package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpo extends kmz implements knd {
    public lpo(Context context) {
        super(context, null, kbe.a, kms.f, kmy.a);
    }

    public final lpa a() {
        kpj kpjVar = new kpj();
        kpjVar.a = new kah(8);
        kpjVar.c = 4501;
        return super.A(0, kpjVar.a());
    }

    public final lpa b() {
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        kpj kpjVar = new kpj();
        kpjVar.c = 8417;
        kpjVar.a = new kah(4);
        lpa lpaVarA = super.A(0, kpjVar.a());
        lpaVarA.q(new kbf(kjcVar, 0));
        lpaVarA.p(new kea(kjcVar, 1));
        return (lpa) kjcVar.a;
    }

    public lpo(Context context, lpr lprVar) {
        super(context, null, lps.a, lprVar, kmy.a);
    }
}
