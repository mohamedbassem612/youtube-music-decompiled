package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class svo {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/commerce/payment/controller/PaymentClientTokenController");
    private final cf b;
    private final awmd c;
    private final zwb d;
    private final Context e;
    private final omj f;

    public svo(cf cfVar, awmd awmdVar, omj omjVar, zwb zwbVar, Context context) {
        this.b = cfVar;
        this.c = awmdVar;
        this.f = omjVar;
        this.d = zwbVar;
        this.e = context;
    }

    public final void a(vyq vyqVar, svn svnVar) {
        try {
            Account accountM = this.f.M(this.d.e());
            cf cfVar = this.b;
            Context context = this.e;
            avju avjuVar = new avju((byte[]) null);
            int i = vyqVar != vyq.PRODUCTION ? 3 : 1;
            avjuVar.b = i == 1 ? i : 3;
            avjuVar.c = accountM;
            lrn lrnVar = new lrn(avjuVar);
            khn khnVar = lro.a;
            kmz kmzVar = new kmz(context, lrnVar);
            lrx lrxVar = new lrx();
            lrxVar.a();
            lrt lrtVar = new lrt(lrxVar, false, 1);
            knc kncVar = kmzVar.C;
            lsl lslVar = new lsl(kncVar, lrtVar);
            kncVar.a(lslVar);
            taf.k(cfVar, qnl.bp(krn.b(lslVar, new lrr())), new jlz(svnVar, 18), new jlz(svnVar, 19));
        } catch (RemoteException | kmj | kmk e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/commerce/payment/controller/PaymentClientTokenController", "continueGetClientToken", 'Z', "PaymentClientTokenController.java")).t("Error getting signed-in account");
            svnVar.a(e);
        }
    }

    public final void b(svn svnVar) {
        taf.k(this.b, hed.C(), new svm(this, svnVar, 1), new svm(this, svnVar, 0));
    }
}
