package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rlp extends rql {
    private final rre c;
    private final zwb d;
    private final tfq e;

    public rlp(rqa rqaVar, tbt tbtVar, zwb zwbVar, tfq tfqVar, rre rreVar, omj omjVar) {
        super(rqaVar, tbtVar, zwbVar, omjVar);
        this.d = zwbVar;
        this.e = tfqVar;
        this.c = rreVar;
    }

    public static void b(Activity activity, ajwo ajwoVar) {
        dd supportFragmentManager = ((cf) activity).getSupportFragmentManager();
        rlq rlqVar = (rlq) supportFragmentManager.g("new-fusion-sign-in-flow-fragment");
        av avVar = new av(supportFragmentManager);
        if (rlqVar != null) {
            rlqVar.i(ajwoVar);
            if (!rlqVar.isVisible()) {
                avVar.m(rlqVar);
            }
        } else {
            avVar.g(0, rlq.j(ajwoVar), "new-fusion-sign-in-flow-fragment", 1);
        }
        avVar.a(false, true);
    }

    @Override // defpackage.rql
    protected final void a(Activity activity, ajwo ajwoVar) {
        agev agevVarH;
        try {
            agevVarH = agev.h(this.c.d());
        } catch (RemoteException | kmj | kmk unused) {
            agevVarH = agdf.a;
        }
        if (this.d.u() || !this.e.i() || !agevVarH.g() || ((Account[]) agevVarH.c()).length != 1) {
            if (tuk.r(activity)) {
                b(activity, ajwoVar);
            }
        } else {
            rqa rqaVar = this.b;
            rmp.a(((rmu) rqaVar.a.io()).e(), (wnw) rqaVar.c.io(), ((Account[]) agevVarH.c())[0].name, new rlo(this, ajwoVar, activity));
        }
    }

    @Override // defpackage.rql
    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        super.handleSignInEvent(zwtVar);
    }

    @Override // defpackage.rql
    @tcc
    public void handleSignInFailureEvent(rqe rqeVar) {
        super.handleSignInFailureEvent(rqeVar);
    }

    @Override // defpackage.rql
    @tcc
    public void handleSignInFlowEvent(rqg rqgVar) {
        super.handleSignInFlowEvent(rqgVar);
    }
}
