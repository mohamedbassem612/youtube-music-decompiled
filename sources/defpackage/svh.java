package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/commerce/payment/controller/AddInstrumentController");
    public final cf b;
    public final awmd c;
    public final Set d = new HashSet();
    private final zwb e;
    private final lsc f;
    private final mgk g;
    private final omj h;

    public svh(cf cfVar, mgk mgkVar, awmd awmdVar, omj omjVar, zwb zwbVar, Context context) {
        this.b = cfVar;
        this.g = mgkVar;
        this.c = awmdVar;
        this.h = omjVar;
        this.e = zwbVar;
        this.f = new lsc(context);
    }

    public final void a(vyq vyqVar, byte[] bArr, byte[] bArr2) {
        try {
            Account accountM = this.h.M(this.e.e());
            lsc lscVar = this.f;
            lscVar.d(vyqVar != vyq.PRODUCTION ? 3 : 1);
            Intent intent = lscVar.a;
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr2);
            lscVar.b(accountM);
            lscVar.e();
            lrx lrxVar = new lrx();
            lrxVar.a();
            lscVar.c(lrxVar);
            this.g.b(lscVar.a(), 1901, new svg(this));
        } catch (RemoteException | kmj | kmk e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/commerce/payment/controller/AddInstrumentController", "continueAddflow", 'l', "AddInstrumentController.java")).t("Error getting signed-in account");
        }
    }
}
