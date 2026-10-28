package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xya extends xwv {
    private final Optional k;
    private final xla l;
    private final vxz m;

    public xya(awmd awmdVar, abvn abvnVar, Optional optional, xla xlaVar, ci ciVar, vxz vxzVar, mbc mbcVar) {
        super(awmdVar, abvnVar, vxzVar, ciVar, mbcVar);
        this.k = optional;
        this.l = xlaVar;
        this.m = vxzVar;
    }

    @Override // defpackage.xwv
    protected final int a() {
        Optional optional = this.k;
        optional.isPresent();
        return xyv.b(((Integer) Optional.ofNullable(Integer.valueOf(((abjp) ((hwz) optional.get()).b).a())).orElse(-1)).intValue());
    }

    @Override // defpackage.xwv
    protected final xyv b(xyv xyvVar) {
        if (!this.l.ay()) {
            xyu xyuVar = new xyu(xyvVar);
            Optional optional = this.k;
            optional.isPresent();
            List listE = ((hwz) optional.get()).e();
            int size = listE.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                abke abkeVar = (abke) listE.get(i);
                if (abkeVar != null) {
                    arrayList.add(abkeVar.t());
                }
            }
            xyuVar.i((List) Optional.ofNullable(agke.n(arrayList)).orElse(null));
            return xyuVar.a();
        }
        xyu xyuVar2 = new xyu(xyvVar);
        Optional optional2 = this.k;
        optional2.isPresent();
        List<hyz> listE2 = ((hwz) optional2.get()).e();
        ArrayList arrayList2 = new ArrayList(listE2.size());
        for (hyz hyzVar : listE2) {
            if (hyzVar != null && hyzVar.t() != null) {
                arrayList2.add(xzv.a(hyzVar.t(), hwz.d(hyzVar)));
            }
        }
        List list = (List) Optional.ofNullable(agke.n(arrayList2)).orElse(agpi.a);
        if (list == null) {
            throw new NullPointerException("Null videoEntries");
        }
        xyuVar2.c = list;
        xyuVar2.d |= 131072;
        optional2.isPresent();
        Optional optionalC = ((hwz) optional2.get()).c();
        xyuVar2.a = (xzv) awrc.f((!optionalC.isPresent() || ahno.aa(((hyz) optionalC.get()).t())) ? Optional.empty() : Optional.of(xzv.a(((hyz) optionalC.get()).t(), hwz.d((hyz) optionalC.get()))));
        xyuVar2.d |= 2;
        return xyuVar2.a();
    }

    @Override // defpackage.xwv
    protected final String c() {
        return null;
    }

    @Override // defpackage.xwv
    public final xyv e() {
        vxz vxzVar = this.m;
        boolean z = false;
        if (!vxzVar.l(134, 45638448L, false)) {
            return super.e();
        }
        abvk abvkVar = (abvk) this.a.io();
        Optional optional = this.k;
        optional.isPresent();
        Optional optionalC = ((hwz) optional.get()).c();
        Optional optionalEmpty = (!optionalC.isPresent() || ahno.aa(((hyz) optionalC.get()).t())) ? Optional.empty() : Optional.ofNullable(((hyz) optionalC.get()).n());
        String strW = optionalEmpty.isPresent() ? ((abnl) optionalEmpty.get()).w() : "";
        acfw acfwVarH = abvkVar.h();
        wjf wjfVarC = acfwVarH == null ? null : acfwVarH.c();
        boolean z2 = wjfVarC != null && wjfVarC.f().ax();
        boolean z3 = vxzVar.l(110, 45620291L, false) && vxzVar.l(262, 45847159L, false);
        boolean z4 = z3 && this.g.getAndSet(false);
        boolean z5 = z2;
        if (vxzVar.l(164, 45673420L, false) && z3 && !z4 && !abvkVar.X()) {
            return xyv.a;
        }
        if (TextUtils.isEmpty(strW) || z5) {
            return b(xyv.a);
        }
        abnl abnlVar = (abnl) optionalEmpty.orElse(null);
        xyv xyvVar = xyv.a;
        xyu xyuVar = new xyu();
        xyuVar.n(strW);
        xyuVar.l(Integer.valueOf(a()));
        xyuVar.c(yno.cU(wjfVarC, this.b, acfwVarH, this.f));
        xyuVar.m(abnlVar == null ? null : abvkVar.g());
        xyuVar.k(abnlVar == null ? null : abnlVar.Q());
        xyuVar.e(abnlVar == null ? null : abnlVar.s());
        xyuVar.h(wjfVarC != null ? wjfVarC.t().v : "");
        if (z3) {
            xyuVar.g(z4);
        }
        if (vxzVar.l(96, 45460566L, false)) {
            if (!abvkVar.X() && (!vxzVar.l(164, 45673420L, false) || !z4)) {
                z = true;
            }
            xyuVar.d(z);
        }
        Optional.empty().isPresent();
        return b(xyuVar.a());
    }
}
