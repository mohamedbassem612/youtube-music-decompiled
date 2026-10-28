package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djt implements OnBackAnimationCallback {
    final /* synthetic */ dju a;

    public djt(dju djuVar) {
        this.a = djuVar;
    }

    public final void onBackCancelled() {
        dju djuVar = this.a;
        djl djlVar = djuVar.c;
        if (djlVar != null) {
            if (!djuVar.d) {
                djlVar.d(djuVar, null);
            }
            djq djqVar = (djq) djlVar.a;
            if (awrc.c(djuVar, djqVar.f) && djqVar.e == -1) {
                djm djmVarA = djqVar.d;
                if (djmVarA == null) {
                    djmVarA = djqVar.a(-1);
                }
                djqVar.d = null;
                djqVar.e = 0;
                djqVar.f = null;
                if (djmVarA != null) {
                    djmVarA.a();
                }
                djqVar.a.d(djr.a);
            }
            djuVar.d = false;
        }
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        djk djkVarF = vz.f(backEvent);
        dju djuVar = this.a;
        djl djlVar = djuVar.c;
        if (djlVar == null || !djuVar.d) {
            return;
        }
        djq djqVar = (djq) djlVar.a;
        if (awrc.c(djuVar, djqVar.f) && djqVar.e == -1) {
            djm djmVarA = djqVar.d;
            if (djmVarA == null) {
                djmVarA = djqVar.a(-1);
            }
            if (djmVarA != null) {
                djmVarA.c(djkVarF);
            }
            djqVar.a.d(new djs(djkVarF));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        dju djuVar = this.a;
        djk djkVarF = vz.f(backEvent);
        djl djlVar = djuVar.c;
        if (djlVar == null || djuVar.d) {
            return;
        }
        djlVar.d(djuVar, djkVarF);
        djuVar.d = true;
    }
}
