package defpackage;

import android.util.Size;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vkj implements ugc {
    final /* synthetic */ vkl a;
    private ufz b = null;
    private uxi c;

    public vkj(vkl vklVar, uxi uxiVar) {
        this.a = vklVar;
        this.c = uxiVar;
    }

    @Override // defpackage.ugc
    public final uga a() {
        return new vkh(this.a);
    }

    @Override // defpackage.ugc
    public final void b(ufz ufzVar) {
        this.b = ufzVar;
        vkl vklVar = this.a;
        if (vklVar.O == 2) {
            vklVar.n(false);
        } else {
            vklVar.d();
        }
        this.c = null;
    }

    @Override // defpackage.ugc
    public final void c() {
        ufz ufzVar = this.b;
        if (ufzVar != null) {
            ufzVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uxi] */
    @Override // defpackage.ugc
    public final void d(ufz ufzVar) {
        vkw vkwVarB;
        this.b = ufzVar;
        vkl vklVar = this.a;
        uxi uxiVar = this.c;
        if (uxiVar != null) {
            Optional optional = vklVar.N.f.f;
            uhe uheVar = new uhe(uxiVar, 6);
            if (true == optional.isPresent()) {
                ((uql) optional.get()).f.l(new uui(uheVar.a.a(), Float.valueOf(0.0f)));
            }
        }
        if (uxiVar == null) {
            vkwVarB = vkw.a();
        } else {
            umf umfVar = vklVar.N;
            vkwVarB = ((vxz) umfVar.h.b).l(605, 45845607L, false) ? vkw.b(uxiVar, umfVar.c.densityDpi, (Size) umfVar.f.b.orElse(null)) : vkw.b(uxiVar, 0, null);
        }
        vklVar.G = vkwVarB;
        boolean zIsEmpty = vklVar.G.d.isEmpty();
        if (vklVar.J) {
            if (zIsEmpty) {
                vklVar.K = null;
            } else {
                vklVar.K = null;
            }
        }
        vklVar.m(zIsEmpty);
    }
}
