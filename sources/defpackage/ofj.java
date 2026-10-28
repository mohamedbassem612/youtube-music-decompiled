package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ofj implements Application.ActivityLifecycleCallbacks {
    public final ogh a;
    public final ofu b;
    public final oml c;
    private final nrm d = new nrm();

    public ofj(int i, oml omlVar, View view, ogi ogiVar, ofe ofeVar) {
        ogh oghVar = new ogh(b(ogiVar, i, ofeVar), ofeVar);
        this.a = oghVar;
        oghVar.t(view);
        this.b = new ogc(omlVar);
        this.c = omlVar;
        Application applicationA = omlVar.a();
        if (applicationA == null || !ofeVar.c) {
            return;
        }
        ogm ogmVarA = ogiVar.a();
        if (ogmVarA != null) {
            oghVar.a = ogmVarA.d;
        }
        applicationA.registerActivityLifecycleCallbacks(this);
    }

    private static final ofv b(ogi ogiVar, int i, ofe ofeVar) {
        return (ofeVar.c && i == 4) ? new ofm(ogiVar) : new ogn(ogiVar);
    }

    public final ofg a(ogj ogjVar) {
        int iOrdinal = ogjVar.ordinal();
        if (iOrdinal == 10 || iOrdinal == 11) {
            ofu ofuVar = this.b;
            ogh oghVar = this.a;
            ofuVar.b(oghVar, ogjVar);
            oghVar.v();
        } else if (iOrdinal != 17) {
            if (iOrdinal != 18) {
                switch (iOrdinal) {
                    case 0:
                        ogh oghVar2 = this.a;
                        oghVar2.j = false;
                        ofu ofuVar2 = this.b;
                        oghVar2.q = ofuVar2.a() > 0.0d;
                        oghVar2.b = System.currentTimeMillis();
                        ofuVar2.b(oghVar2, ogjVar);
                        oghVar2.s(ogj.START);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        ofu ofuVar3 = this.b;
                        ogh oghVar3 = this.a;
                        ofuVar3.b(oghVar3, ogjVar);
                        oghVar3.s(ogjVar);
                        break;
                    case 4:
                        ofu ofuVar4 = this.b;
                        ogh oghVar4 = this.a;
                        ofuVar4.b(oghVar4, ogjVar);
                        oghVar4.s(ogj.COMPLETE);
                        break;
                    case 5:
                        ofu ofuVar5 = this.b;
                        ogh oghVar5 = this.a;
                        ofuVar5.b(oghVar5, ogjVar);
                        oghVar5.j = false;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        ofu ofuVar6 = this.b;
                        ogh oghVar6 = this.a;
                        ofuVar6.b(oghVar6, ogjVar);
                        oghVar6.j = true;
                        break;
                    default:
                        this.b.b(this.a, ogjVar);
                        break;
                }
            } else {
                ofu ofuVar7 = this.b;
                ogh oghVar7 = this.a;
                ofuVar7.b(oghVar7, ogjVar);
                oghVar7.l = false;
            }
        } else {
            ofu ofuVar8 = this.b;
            ogh oghVar8 = this.a;
            ofuVar8.b(oghVar8, ogjVar);
            oghVar8.l = true;
        }
        ogh oghVar9 = this.a;
        ofg ofgVarN = oghVar9.n(ogjVar);
        if (!ogjVar.v) {
            oghVar9.r(ogjVar);
        }
        if (ogjVar.c() && ogjVar != ogj.COMPLETE) {
            oghVar9.u(ogjVar.w + 1);
        }
        return ofgVarN;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ogh oghVar = this.a;
        if (oghVar.i() && oghVar.j(activity)) {
            oghVar.a = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ogh oghVar = this.a;
        if (oghVar.i() && oghVar.j(activity)) {
            oghVar.a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public ofj(int i, ogi ogiVar, ofe ofeVar) {
        ogh oghVar = new ogh(b(ogiVar, i, ofeVar), ofeVar);
        this.a = oghVar;
        this.b = new ogk(oghVar, ofeVar.d);
        this.c = null;
    }
}
