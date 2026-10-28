package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ssb implements ssd, ssc {
    private final Activity a;
    private final stb b;
    private final String c;
    private final twi d;
    private final vxe e;
    private final xsc f;

    public ssb(Activity activity, xsc xscVar, stb stbVar, String str, twi twiVar, vxe vxeVar) {
        this.a = activity;
        this.f = xscVar;
        this.b = stbVar;
        this.c = str;
        this.d = twiVar;
        this.e = vxeVar;
    }

    private final xgn f() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof xgm) {
            return ((xgm) componentCallbacks2).hB();
        }
        return null;
    }

    @Override // defpackage.ssd, defpackage.ssc
    public final String a() {
        return this.c;
    }

    @Override // defpackage.ssd
    public final void b(toe toeVar) {
        this.d.a(toeVar);
    }

    @Override // defpackage.ssd
    public final void c(aloc alocVar) {
        alna alnaVar;
        this.b.dismiss();
        if ((alocVar.b & 2) == 0 && alocVar.e.size() > 0) {
            if (f() != null) {
                alna alnaVar2 = alocVar.f;
                if (alnaVar2 == null) {
                    alnaVar2 = alna.a;
                }
                if ((alnaVar2.b & SemanticState.Multiline) != 0) {
                    alna alnaVar3 = alocVar.f;
                    if (alnaVar3 == null) {
                        alnaVar3 = alna.a;
                    }
                    if (alnaVar3.g) {
                        f().l(new xgj(xhb.b(103918)));
                        f().l(new xgj(xhb.b(104381)));
                        f().l(new xgj(xhb.b(104380)));
                        f().l(new xgj(xhb.b(104382)));
                    }
                }
            }
            this.e.b(alocVar.e);
            return;
        }
        xsc xscVar = this.f;
        if ((alocVar.b & 4) != 0) {
            alnaVar = alocVar.f;
            if (alnaVar == null) {
                alnaVar = alna.a;
            }
        } else {
            alnaVar = null;
        }
        xscVar.V(alnaVar, null);
        alod alodVar = alocVar.d;
        if (alodVar == null) {
            alodVar = alod.a;
        }
        if (alodVar.b == 62285947) {
            alod alodVar2 = alocVar.d;
            if (alodVar2 == null) {
                alodVar2 = alod.a;
            }
            ajye ajyeVar = alodVar2.b == 62285947 ? (ajye) alodVar2.c : ajye.a;
            if ((ajyeVar.c & 16) == 0 || f() == null) {
                return;
            }
            f().d(new xgj(ajyeVar.g.G()));
        }
    }

    @Override // defpackage.ssc
    public final void d(toe toeVar) {
        this.d.a(toeVar);
    }

    @Override // defpackage.ssc
    public final void e(alnz alnzVar) {
        alna alnaVar;
        this.b.dismiss();
        if ((alnzVar.b & 2) != 0 || alnzVar.e.size() <= 0) {
            xsc xscVar = this.f;
            if ((alnzVar.b & 8) != 0) {
                alnaVar = alnzVar.f;
                if (alnaVar == null) {
                    alnaVar = alna.a;
                }
            } else {
                alnaVar = null;
            }
            xscVar.V(alnaVar, null);
            aloa aloaVar = alnzVar.d;
            if (aloaVar == null) {
                aloaVar = aloa.a;
            }
            int i = aloaVar.b;
            return;
        }
        if (f() != null) {
            alna alnaVar2 = alnzVar.f;
            if (alnaVar2 == null) {
                alnaVar2 = alna.a;
            }
            if ((alnaVar2.b & SemanticState.Multiline) != 0) {
                alna alnaVar3 = alnzVar.f;
                if (alnaVar3 == null) {
                    alnaVar3 = alna.a;
                }
                if (alnaVar3.g) {
                    f().l(new xgj(xhb.b(103918)));
                    f().l(new xgj(xhb.b(104381)));
                    f().l(new xgj(xhb.b(104380)));
                    f().l(new xgj(xhb.b(104382)));
                }
            }
        }
        this.e.b(alnzVar.e);
    }
}
