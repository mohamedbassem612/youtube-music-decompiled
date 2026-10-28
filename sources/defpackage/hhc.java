package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhc {
    public final /* synthetic */ Object a;

    public hhc(Object obj) {
        this.a = obj;
    }

    public final avmn[] a(abvn abvnVar) {
        int i = 1;
        int i2 = 18;
        return new avmn[]{((avlh) abvnVar.r().a).i(new abwr(i)).al(new hxi(this, 0), new hpw(i2)), abvnVar.P().i(new abwr(i)).al(new hxi(this, 2), new hpw(i2))};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final boolean b(String str, String str2) {
        return ((omj) ((ruk) this.a).a.get(str)) != null && str2.equals("");
    }

    public final boolean c() {
        return ((ldr) this.a).aT().i(3);
    }

    @tcc
    public void handleSequencerEndedEvent(aayu aayuVar) {
        Object obj;
        hgz hgzVar = new hgz(amlg.INDIFFERENT, false, null);
        hhd hhdVar = (hhd) this.a;
        hhdVar.e = hgzVar;
        hhdVar.f = null;
        Iterator it = hhdVar.c.iterator();
        while (it.hasNext()) {
            ((hha) it.next()).a(hhdVar.e);
        }
        if (!hhdVar.j.m(8, 45661900L) || (obj = hhdVar.h) == null) {
            return;
        }
        avnr.b((AtomicReference) obj);
    }

    @tcc
    public void handleSequencerStageEvent(aayw aaywVar) {
        abnw abnwVar;
        amlh amlhVar;
        String str;
        String str2;
        wjf wjfVar;
        String strG;
        if (aaywVar == null || (abnwVar = aaywVar.b) == null) {
            return;
        }
        Object obj = this.a;
        hhd hhdVar = (hhd) obj;
        int i = 8;
        if (hhdVar.j.m(8, 45661900L) && abnwVar == abnw.d && (wjfVar = aaywVar.c) != null && (strG = wjfVar.G()) != null) {
            Object obj2 = hhdVar.h;
            if (obj2 != null) {
                avnr.b((AtomicReference) obj2);
            }
            hhdVar.h = hhdVar.g.b(hhdVar.a.e()).k(wfs.g(62, strG)).B(new gkq(7)).K(new gnw(9)).h(amld.class).O(hhdVar.b).ag(new hgl(this, i), new gfh(11));
        }
        if (abnwVar.b(abnw.e)) {
            wgi wgiVar = aaywVar.d;
            amks amksVarW = fhz.W(wgiVar);
            if (amksVarW != null || !txz.g(hhdVar.d)) {
                hgz hgzVar = hhdVar.e;
                if (hgzVar != null && (amlhVar = hgzVar.c) != null && wgiVar != null && (str = wgiVar.b) != null && !TextUtils.equals(str, amlhVar.c)) {
                    hhdVar.f = null;
                }
                if (hhdVar.f == null) {
                    if (amksVarW != null) {
                        hhdVar.e = new hgz(amksVarW);
                    } else {
                        hhdVar.e = new hgz();
                    }
                    Iterator it = hhdVar.c.iterator();
                    while (it.hasNext()) {
                        ((hha) it.next()).a(hhdVar.e);
                    }
                    return;
                }
                return;
            }
            if (wgiVar != null) {
                str2 = wgiVar.b;
            } else {
                wgiVar = null;
                str2 = null;
            }
            if (!hhdVar.i.j(0)) {
                if (wgiVar == null || str2 == null) {
                    return;
                }
                hhdVar.e = new hgz();
                hhdVar.k.r(str2, "", "", -1, "", wgiVar.d(), new gtg(obj, 3), null, Optional.empty(), Optional.empty(), Optional.empty());
                return;
            }
            if (str2 != null) {
                amlg amlgVar = amlg.INDIFFERENT;
                aihf aihfVarCreateBuilder = amlh.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amlh amlhVar2 = (amlh) aihfVarCreateBuilder.instance;
                amlhVar2.b |= 1;
                amlhVar2.c = str2;
                hhdVar.e = new hgz(amlgVar, true, (amlh) aihfVarCreateBuilder.build());
            } else {
                hhdVar.e = new hgz();
            }
            Iterator it2 = hhdVar.c.iterator();
            while (it2.hasNext()) {
                ((hha) it2.next()).a(hhdVar.e);
            }
        }
    }

    public /* synthetic */ hhc(ruk rukVar) {
        this.a = rukVar;
    }
}
