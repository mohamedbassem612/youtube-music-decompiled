package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svl {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/commerce/payment/controller/GooglePaymentBillingController");
    public final zwb b;
    public final wbz c;
    public final awmd d;
    public final cf e;
    public final xeu f;
    public final avmb g;
    public final abte h;
    public final abfv i;
    private final awmd j;
    private final ttm k;
    private final lsa l;
    private final xit m;
    private xir n;
    private final vxz o;
    private final mgk p;
    private final omj q;

    public svl(mgk mgkVar, zwb zwbVar, omj omjVar, wbz wbzVar, awmd awmdVar, awmd awmdVar2, ttm ttmVar, Context context, xeu xeuVar, abte abteVar, xit xitVar, cf cfVar, avmb avmbVar, abfv abfvVar, vxz vxzVar) {
        this.p = mgkVar;
        this.b = zwbVar;
        this.q = omjVar;
        this.c = wbzVar;
        this.j = awmdVar;
        this.d = awmdVar2;
        this.k = ttmVar;
        this.l = new lsa(context);
        this.f = xeuVar;
        this.h = abteVar;
        this.m = xitVar;
        this.e = cfVar;
        this.g = avmbVar;
        this.i = abfvVar;
        this.o = vxzVar;
    }

    private final Intent d(vyq vyqVar, byte[] bArr, byte[] bArr2) {
        Account accountM;
        lrx lrxVar = new lrx();
        lrxVar.a();
        if (this.o.m(15, 45643397L)) {
            if (lrxVar.d == null) {
                lrxVar.d = new Bundle();
            }
            lrxVar.d.putInt("customThemeStyle", 2);
        }
        try {
            accountM = this.q.M(this.b.e());
        } catch (RemoteException | kmj | kmk e) {
            e("Failed to get buyer account in buy flow: ".concat(e.toString()));
            accountM = null;
        }
        if (accountM == null) {
            e("Failure: Buyer account is null.");
            return null;
        }
        lsa lsaVar = this.l;
        lsaVar.b(accountM);
        int i = 1;
        if (vyqVar != vyq.PRODUCTION && vyqVar != vyq.STAGING) {
            i = 0;
        }
        lsaVar.d(i);
        lsaVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        lsaVar.e();
        try {
            lsaVar.c(lrxVar);
        } catch (UnsupportedOperationException unused) {
        }
        if (bArr2.length > 0) {
            Intent intent = this.l.a;
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", bArr2);
            intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", bArr2);
        } else {
            zvp.a(zvn.a, zvm.l, "youtubePayment::GpayController buyFlowClientParameters is not found, fallback to non-NGBF UI.");
        }
        Intent intentA = this.l.a();
        intentA.setPackage("com.google.android.gms");
        return intentA;
    }

    private static final void e(String str) {
        zvp.a(zvn.b, zvm.l, "youtubePayment::GpayController ".concat(str));
    }

    public final void a(aigj aigjVar, aigj aigjVar2, aigj aigjVar3, String str, aroq aroqVar, svj svjVar, vyq vyqVar) {
        Intent intentD = d(vyqVar, aigjVar.G(), aigjVar2.G());
        if (intentD == null) {
            c(svjVar, null);
            return;
        }
        if (this.p.b(intentD, 906, new svk(this, aigjVar3, str, aroqVar, svjVar))) {
            acb acbVar = new acb((char[]) null);
            if (!aigjVar3.E()) {
                acbVar.d = aigjVar3;
            }
            xeu xeuVar = this.f;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(acbVar.o(), alot.TRANSACTION_FLOW_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(acbVar.k());
            }
            xir xirVar = this.n;
            if (xirVar != null) {
                xirVar.n("ttc");
            }
        }
    }

    public final void b(aigj aigjVar, aigj aigjVar2, aigj aigjVar3, String str, aroq aroqVar, svj svjVar) {
        this.n = this.m.p(185);
        taf.k(this.e, ahng.n(Boolean.FALSE), new jco(7), new svi(this, svjVar, aigjVar, aigjVar2, aigjVar3, str, aroqVar, 1));
    }

    public final void c(svj svjVar, Throwable th) {
        svjVar.b(this.k.b(th));
    }
}
