package defpackage;

import android.text.TextUtils;
import j$.lang.Iterable$EL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class scc extends sbk implements rsq {
    public final awmd a;
    public final tun b;
    public boolean c;
    private final sci d;
    private final ahey e;
    private String f;
    private boolean h;
    private final List i = new ArrayList();
    private final abnc j;
    private final aboi k;

    public scc(awmd awmdVar, sci sciVar, tun tunVar, abnc abncVar, aboi aboiVar, vwt vwtVar, ahey aheyVar) {
        this.a = awmdVar;
        this.d = sciVar;
        this.b = tunVar;
        this.j = abncVar;
        this.k = aboiVar;
        this.e = aheyVar;
        vwtVar.an(new scb(this));
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return agkz.s(skf.class, slg.class, sli.class, slh.class);
    }

    public final void b(sni sniVar, long j) {
        this.i.add(ahng.p(new gwj(this, sniVar, 17), j, TimeUnit.MILLISECONDS, this.e));
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        agke agkeVar;
        if (!TextUtils.equals(this.f, str)) {
            this.f = str;
            this.h = false;
        }
        if (i != 3 && i != 2) {
            if (i != 4) {
                return;
            } else {
                i = 4;
            }
        }
        if (i == 2) {
            List list = this.i;
            if (!list.isEmpty()) {
                Iterable$EL.forEach(list, new hgi(18));
                list.clear();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snk snkVar = sniVar.b;
            if (snkVar instanceof slg) {
                slg slgVar = (slg) snkVar;
                if (i == 3) {
                    String str2 = slgVar.b;
                    if (TextUtils.equals(str2, str) && (!slgVar.a || !this.d.a(str2))) {
                        arrayList.add(sniVar);
                    }
                }
            } else if (snkVar instanceof sli) {
                sli sliVar = (sli) snkVar;
                if (i == 2 && this.h) {
                    String str3 = sliVar.b;
                    if (TextUtils.equals(str3, str) && (!sliVar.a || !this.d.a(str3))) {
                        arrayList.add(sniVar);
                    }
                }
            } else if (snkVar instanceof skf) {
                skf skfVar = (skf) snkVar;
                if (i == 3 && TextUtils.equals(skfVar.a, str) && this.k.b && ((agkeVar = skfVar.b) == null || agkeVar.isEmpty() || agkeVar.contains(this.j.e()))) {
                    if (!skfVar.c || !this.c) {
                        b(sniVar, 0L);
                    }
                }
            } else if (snkVar instanceof slh) {
                slh slhVar = (slh) snkVar;
                if (i == 2 && !this.h) {
                    String str4 = slhVar.b;
                    if (TextUtils.equals(str4, str) && (!slhVar.a || !this.d.a(str4))) {
                        arrayList.add(sniVar);
                    }
                }
            }
        }
        this.h = this.h || i == 2;
        if (arrayList.isEmpty()) {
            return;
        }
        ((rsk) this.a.io()).q(arrayList);
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
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

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
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
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
