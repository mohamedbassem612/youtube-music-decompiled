package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbt extends sbk implements rsq, rst {
    boolean c;
    private final awmd d;
    final Map a = new HashMap();
    final Map b = new HashMap();
    private String e = "";

    public sbt(awmd awmdVar) {
        this.d = awmdVar;
    }

    private final void t(List list, String str, boolean z) {
        for (sni sniVar : this.g.aa()) {
            if (TextUtils.equals(((yvs) sniVar.c.d(sih.class)).a, str)) {
                snk snkVar = sniVar.b;
                if (z) {
                    if (snkVar instanceof sky) {
                        list.add(sniVar);
                        return;
                    }
                } else if (snkVar instanceof skx) {
                    list.add(sniVar);
                    return;
                }
            }
        }
        rmp.n(null, "LiveStreamBreakTransitionTriggerAdapter: cannot activate trigger of type ".concat(true != z ? "Exiting" : "Entering"));
    }

    @Override // defpackage.rst
    public final void O(String str, String str2, String str3) {
        c(str2);
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.q(sky.class, skx.class);
    }

    public final void c(String str) {
        String str2 = (String) this.a.get(str);
        if (TextUtils.equals(this.e, str2)) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        String str3 = this.e;
        if (!ahno.aa(str3)) {
            t(arrayList, str3, false);
            this.e = "";
        }
        if (!ahno.aa(str2)) {
            t(arrayList, str2, true);
            this.e = str2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.d.io()).q(arrayList);
    }

    @Override // defpackage.rsq
    public final void d(String str, int i) {
        if (this.c) {
            if (ahno.aa((String) this.a.get(str)) && i == 1) {
                rmp.n(null, "LiveStreamBreakTransitionTriggerAdapter: cannot retrieve cuepoint from associated cpn");
            }
            c(str);
        }
    }

    @Override // defpackage.rsq
    public final void e(aaxa aaxaVar) {
        yvs yvsVar = aaxaVar.a;
        this.b.put(yvsVar.a, yvsVar);
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (abobVar == abob.a) {
            this.a.clear();
            this.b.clear();
            this.e = "";
        } else if (abobVar == abob.c) {
            this.c = wjfVar.f().av();
        }
    }

    public final void s(sko skoVar, String str) {
        if (!skoVar.e(sjq.class)) {
            if (skoVar.e(sjb.class)) {
                this.a.put(((slb) skoVar.d(sjb.class)).o, str);
            }
        } else {
            for (sko skoVar2 : (List) skoVar.d(sjq.class)) {
                if (skoVar2.e(sjb.class)) {
                    this.a.put(((slb) skoVar2.d(sjb.class)).o, str);
                }
            }
        }
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rst
    public final /* synthetic */ void P(long j, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
