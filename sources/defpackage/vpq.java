package defpackage;

import android.text.TextUtils;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpq {
    public final xgn a;
    public final tqj b;
    public akuj c;
    public amdd d;
    public String e;
    public ajwo f;
    public List g;
    public final vxz h;
    public final vxz i;
    private final awli j = new awli();
    private avmn k;

    public vpq(vxz vxzVar, vxz vxzVar2, tqj tqjVar, xgn xgnVar) {
        this.a = xgnVar;
        this.h = vxzVar;
        this.i = vxzVar2;
        this.b = tqjVar;
    }

    public final void a() {
        this.k = this.j.X(new uxe(8)).af(new avni() { // from class: vpp
            @Override // defpackage.avni
            public final void a(Object obj) {
                xgt xgtVarA;
                List list;
                int i;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vpq vpqVar = this.a;
                if (!zBooleanValue) {
                    xgn xgnVar = vpqVar.a;
                    vpqVar.e = xgnVar.i();
                    akuj akujVar = vpqVar.c;
                    if (akujVar != null) {
                        xgnVar.p(new xgj(xia.a(akujVar)), vpqVar.d);
                    }
                    tqj tqjVar = vpqVar.b;
                    int i2 = tqr.a;
                    if (!tqjVar.k(1073828950) && vpqVar.h.l(5, 45363147L, false) && (xgtVarA = xgnVar.a()) != null) {
                        Map map = xgtVarA.i;
                        vpqVar.g = !map.isEmpty() ? (List) Collection.EL.stream(map.entrySet()).filter(new xdn(2)).map(new vmw(17)).collect(aghu.a) : (List) Collection.EL.stream(xgtVarA.h.entrySet()).filter(new xdn(3)).map(new vmw(18)).collect(aghu.a);
                    }
                    if (vpqVar.h.l(73, 45614663L, false)) {
                        xgnVar.u();
                    }
                    xgnVar.t();
                    return;
                }
                akuj akujVar2 = vpqVar.c;
                int i3 = 32633;
                if (akujVar2 != null && (i = akujVar2.D) > 0) {
                    i3 = i;
                }
                if (TextUtils.isEmpty(vpqVar.e)) {
                    xgn xgnVar2 = vpqVar.a;
                    xhc xhcVarA = xhb.a(i3);
                    xgu xguVar = xgu.b;
                    ajwo ajwoVar = vpqVar.f;
                    xgnVar2.c(xhcVarA, xguVar, ajwoVar, yno.dl(ajwoVar, amdx.b), yno.dl(vpqVar.f, amdx.a));
                    amud amudVarA = xia.a(vpqVar.c);
                    if (amudVarA == null || (amudVarA.c & 1) == 0) {
                        akuj akujVar3 = vpqVar.c;
                        if (akujVar3 != null) {
                            akuh akuhVar = akujVar3.h;
                            if (akuhVar == null) {
                                akuhVar = akuh.a;
                            }
                            if (akuhVar.b == 49399797) {
                                akuj akujVar4 = vpqVar.c;
                                akujVar4.getClass();
                                akuh akuhVar2 = akujVar4.h;
                                if (akuhVar2 == null) {
                                    akuhVar2 = akuh.a;
                                }
                                xgnVar2.d(new xgj((akuhVar2.b == 49399797 ? (apoq) akuhVar2.c : apoq.a).m.G()));
                            }
                        }
                    } else {
                        xgnVar2.d(new xgj(amudVarA.d, (amud) null));
                        xgnVar2.y(vpqVar.c, aigj.d, vpqVar.d);
                    }
                } else {
                    xgn xgnVar3 = vpqVar.a;
                    xhc xhcVarA2 = xhb.a(i3);
                    xgu xguVar2 = xgu.b;
                    aihh aihhVar = (aihh) vpqVar.f.toBuilder();
                    aihl aihlVar = aoaq.b;
                    ajwo ajwoVar2 = vpqVar.f;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    ajwoVar2.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
                    aihf builder = ((aoar) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).toBuilder();
                    String str = vpqVar.e;
                    str.getClass();
                    builder.copyOnWrite();
                    aoar aoarVar = (aoar) builder.instance;
                    aoarVar.b |= 32;
                    aoarVar.f = str;
                    aihhVar.e(aihlVar, (aoar) builder.build());
                    xgnVar3.c(xhcVarA2, xguVar2, (ajwo) aihhVar.build(), yno.dl(vpqVar.f, amdx.b), yno.dl(vpqVar.f, amdx.a));
                    tqj tqjVar2 = vpqVar.b;
                    int i4 = tqr.a;
                    if (!tqjVar2.k(1073828950) && vpqVar.h.l(5, 45363147L, false) && (list = vpqVar.g) != null && !list.isEmpty()) {
                        Iterator it = vpqVar.g.iterator();
                        while (it.hasNext()) {
                            xgnVar3.w((xgz) it.next(), null);
                        }
                    }
                }
                if (vpqVar.i.l(141, 45693775L, false)) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.offer(new xgj(xhb.b(96494)));
                    arrayDeque.offer(new xgj(xhb.b(31880)));
                    xgn xgnVar4 = vpqVar.a;
                    Iterable$EL.forEach(arrayDeque, new vnm(xgnVar4, 2));
                    akuj akujVar5 = vpqVar.c;
                    if (akujVar5 != null) {
                        akui akuiVar = akujVar5.g;
                        if (akuiVar == null) {
                            akuiVar = akui.a;
                        }
                        if (((akuiVar.b == 138681548 ? (akuo) akuiVar.c : akuo.a).b & 2097152) != 0) {
                            xgnVar4.l(new xgj(xhb.b(33917)));
                        }
                    }
                }
                if (vpqVar.h.l(73, 45614663L, false)) {
                    vpqVar.a.v();
                }
            }
        });
    }

    public final void b() {
        avmn avmnVar = this.k;
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        avnr.b((AtomicReference) this.k);
    }

    public final void c() {
        this.j.kk(Boolean.FALSE);
    }

    public final void d(ajwo ajwoVar) {
        this.f = ajwoVar;
        this.j.kk(Boolean.TRUE);
    }

    public final void e() {
        this.e = null;
    }

    public final void f(akuj akujVar, amdd amddVar) {
        this.c = akujVar;
        this.d = amddVar;
    }
}
