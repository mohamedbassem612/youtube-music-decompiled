package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class svr extends nsh {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/commerce/payment/controller/PurchaseManagerController");
    public final cf b;
    public final awmd c;
    private final zwh d;
    private final lse e;
    private final zvl f;
    private final mgk g;
    private final omj h;

    public svr(cf cfVar, mgk mgkVar, awmd awmdVar, omj omjVar, zwh zwhVar, zvl zvlVar, Context context) {
        super(null, null);
        this.b = cfVar;
        this.g = mgkVar;
        this.c = awmdVar;
        this.h = omjVar;
        this.d = zwhVar;
        this.f = zvlVar;
        this.e = new lse(context);
    }

    private final void k(String str, Exception exc) {
        ((agrc) ((agrc) ((agrc) a.b()).j(exc)).k("com/google/android/libraries/youtube/commerce/payment/controller/PurchaseManagerController", "logError", (char) 202, "PurchaseManagerController.java")).w("%s", str);
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 20;
        CharSequence[] charSequenceArr = {"svr", str};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) ": ");
        sb.append(charSequenceArr[1]);
        zvjVarA.d(sb.toString());
        this.f.a(zvjVarA.a());
    }

    public final void j(vyq vyqVar, byte[] bArr, yhi yhiVar) {
        SecurePaymentsPayload securePaymentsPayload;
        try {
            Account accountM = this.h.M(this.d.hw());
            if (accountM == null) {
                k("Purchase Manager account is null.", null);
                yhiVar.e();
                return;
            }
            if (vyqVar == null) {
                vyqVar = vyq.PRODUCTION;
            }
            try {
                ahxs ahxsVar = (ahxs) aihn.parseFrom(ahxs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                int size = ahxsVar.c.size();
                lsf[] lsfVarArr = new lsf[size];
                for (int i = 0; i < size; i++) {
                    ahxr ahxrVar = (ahxr) ahxsVar.c.get(i);
                    lsfVarArr[i] = new lsf(ahxrVar.b, ahxrVar.c);
                }
                securePaymentsPayload = new SecurePaymentsPayload(ahxsVar.b.G(), lsfVarArr);
            } catch (aiik unused) {
                securePaymentsPayload = null;
            }
            if (securePaymentsPayload == null) {
                k("Error parsing secure payload.", null);
                yhiVar.e();
                return;
            }
            lse lseVar = this.e;
            lseVar.d((vyqVar == vyq.PRODUCTION || vyqVar == vyq.STAGING) ? 1 : 0);
            lseVar.a.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
            lseVar.b(accountM);
            lseVar.e();
            lrx lrxVar = new lrx();
            lrxVar.a();
            lseVar.c(lrxVar);
            this.g.b(lseVar.a(), 1902, new svq(this.f, yhiVar));
        } catch (RemoteException | kmj | kmk e) {
            k("Error getting signed-in account", e);
            yhiVar.e();
        }
    }
}
