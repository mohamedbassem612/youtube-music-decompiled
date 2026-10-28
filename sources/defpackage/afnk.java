package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afnk implements qnt {
    private final Optional a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;

    public afnk(Optional optional, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar3.getClass();
        awmdVar4.getClass();
        this.a = optional;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
    }

    @Override // defpackage.qnt
    public final void a() {
        this.a.isPresent();
        if (qnl.m()) {
            Object obj = ((aupo) this.d).b;
            obj.getClass();
            Optional optional = (Optional) obj;
            Object obj2 = ((aupo) this.e).b;
            obj2.getClass();
            Optional optional2 = (Optional) obj2;
            Object obj3 = Boolean.FALSE;
            Object obj4 = optional2.isPresent() ? optional2.get() : obj3;
            if (optional.isPresent()) {
                obj4 = optional.get();
            }
            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
            int i = 1;
            if (!zBooleanValue) {
                afnj afnjVar = (afnj) this.b.io();
                if (afnjVar.k.m()) {
                    afnjVar.a(true);
                    return;
                } else {
                    boolean z = afnjVar.i;
                    return;
                }
            }
            obj2.getClass();
            if (optional2.isPresent()) {
                obj3 = optional2.get();
            }
            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
            afnp afnpVar = (afnp) this.c.io();
            if (qnl.l(afnpVar.a) == null) {
                ((agrc) afnpVar.h.c().k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "runListeners", 118, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Couldn't determine current process name. Skipping startup after package replaced listeners.");
            } else if (afnpVar.k.m()) {
                afjn.d(135, ahno.aq(new afnm(afnpVar, zBooleanValue2, i), afnpVar.c), "StartupAfterPackageReplacedListenerWithRetryRunner infrastructure failure.", new Object[0]);
            } else {
                boolean z2 = afnpVar.i;
            }
        }
    }
}
