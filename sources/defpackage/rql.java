package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class rql {
    public zws a;
    public final rqa b;
    private final zwb c;
    private final omj d;

    public rql(rqa rqaVar, tbt tbtVar, zwb zwbVar, omj omjVar) {
        this.b = rqaVar;
        this.c = zwbVar;
        this.d = omjVar;
        tbtVar.f(this);
    }

    protected void a(Activity activity, ajwo ajwoVar) {
        dd supportFragmentManager = ((cf) activity).getSupportFragmentManager();
        rkj rkjVar = (rkj) supportFragmentManager.g("new-default-sign-in-flow-fragment");
        av avVar = new av(supportFragmentManager);
        if (rkjVar != null) {
            rkjVar.i(ajwoVar);
            if (!rkjVar.isVisible()) {
                avVar.m(rkjVar);
            }
        } else {
            Bundle bundle = new Bundle();
            if (ajwoVar != null) {
                bundle.putByteArray("endpoint", ajwoVar.toByteArray());
            }
            rqr rqrVar = new rqr();
            rqrVar.setArguments(bundle);
            avVar.g(0, rqrVar, "new-default-sign-in-flow-fragment", 1);
        }
        avVar.a(false, true);
    }

    public final void c(Activity activity, ajwo ajwoVar, @Deprecated zws zwsVar) {
        apzh apzhVar;
        ajwo ajwoVar2 = null;
        if (ajwoVar == null) {
            apzhVar = null;
        } else {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        }
        if (apzhVar != null && (apzhVar.b & 2) != 0 && (ajwoVar2 = apzhVar.c) == null) {
            ajwoVar2 = ajwo.a;
        }
        ajwo ajwoVarW = rmp.w(ajwoVar2);
        if (apzhVar != null && ajwoVarW != null) {
            aihf aihfVarCreateBuilder = apzh.a.createBuilder(apzhVar);
            aihfVarCreateBuilder.copyOnWrite();
            apzh apzhVar2 = (apzh) aihfVarCreateBuilder.instance;
            apzhVar2.c = ajwoVarW;
            apzhVar2.b |= 2;
            apzh apzhVar3 = (apzh) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(apzi.a, apzhVar3);
            ajwoVar = (ajwo) aihhVar.build();
        }
        if (!(activity instanceof cf)) {
            throw new IllegalStateException(getClass().getName() + " only supports " + cf.class.getName());
        }
        zws zwsVar2 = this.a;
        if (zwsVar2 != null) {
            zwsVar2.c();
        }
        if (zwsVar == null) {
            zwsVar = zws.u;
        }
        this.a = zwsVar;
        if (this.c.e().m()) {
            this.d.P(((cf) activity).getSupportFragmentManager(), new rqk(this, 0), ajwoVar);
        } else {
            a(activity, ajwoVar);
        }
    }

    public final void d(Activity activity, @Deprecated zws zwsVar) {
        c(activity, (ajwo) ((aihh) ajwo.a.createBuilder()).build(), zwsVar);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        zws zwsVar = this.a;
        if (zwsVar != null) {
            zwsVar.d();
            this.a = null;
        }
    }

    @tcc
    public void handleSignInFailureEvent(rqe rqeVar) {
        zws zwsVar = this.a;
        if (zwsVar != null) {
            zwsVar.e(rqeVar.a);
            this.a = null;
        }
    }

    @tcc
    public void handleSignInFlowEvent(rqg rqgVar) {
        zws zwsVar;
        if (rqgVar.a != rqf.c || (zwsVar = this.a) == null) {
            return;
        }
        zwsVar.c();
        this.a = null;
    }
}
