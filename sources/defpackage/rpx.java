package defpackage;

import com.google.cardboard.sdk.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rpx implements zza {
    final /* synthetic */ zwb a;
    final /* synthetic */ vxe b;
    final /* synthetic */ cf c;
    final /* synthetic */ rqa d;

    public rpx(zwb zwbVar, rqa rqaVar, vxe vxeVar, cf cfVar) {
        this.a = zwbVar;
        this.d = rqaVar;
        this.b = vxeVar;
        this.c = cfVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        xsc xscVar = (xsc) obj;
        for (ovo ovoVar : xscVar.b) {
            for (wnq wnqVar : ovoVar.i()) {
                if (wnqVar.e != null) {
                    if (this.a.u()) {
                        this.d.j(true, false);
                    }
                    this.b.a(wnqVar.d());
                    return;
                }
            }
            if (!this.a.u()) {
                for (wnq wnqVar2 : ovoVar.i()) {
                    if (wnqVar2.k() && (wnqVar2.o() || wnqVar2.m())) {
                        if (wnqVar2.c != null) {
                            this.b.a(wnqVar2.d());
                            return;
                        }
                    }
                }
            }
        }
        if (this.a.u()) {
            return;
        }
        wnt wntVar = (wnt) xscVar.a;
        if (wntVar.c().isEmpty()) {
            ((agrc) ((agrc) rpy.a.b()).k("com/google/android/libraries/youtube/account/signin/flow/DefaultModularOnboardingController$1", "onResponse", 101, "DefaultModularOnboardingController.java")).t("Failed to fetch kids onboarding status, finishing the App.");
            this.c.finishAffinity();
            return;
        }
        Iterator it = wntVar.c().iterator();
        while (it.hasNext()) {
            if (((wns) it.next()).a) {
                ((agrc) ((agrc) rpy.a.b()).k("com/google/android/libraries/youtube/account/signin/flow/DefaultModularOnboardingController$1", "onResponse", 109, "DefaultModularOnboardingController.java")).t("Failed to fetch kids onboarding status, finishing the App.");
                this.c.finishAffinity();
                return;
            }
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        if (this.a.u()) {
            return;
        }
        ((agrc) ((agrc) rpy.a.b()).k("com/google/android/libraries/youtube/account/signin/flow/DefaultModularOnboardingController$1", "onErrorResponse", R.styleable.AppCompatTheme_windowMinWidthMajor, "DefaultModularOnboardingController.java")).t("Failed to fetch kids onboarding status, finishing the App.");
        this.c.finishAffinity();
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
