package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vat extends uhv {
    public final vab b;
    public final uzx c;
    public final Set d;
    public final aunn e;
    public final vao f;
    public final ConcurrentHashMap g;
    public boolean h;
    public uzx i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final List m;
    public final xsc n;
    private final avmb o;
    private final uxj p;
    private avmm q;
    private final avmm r;
    private uzl s;
    private final aunn t;
    private final int u;
    private final xpl v;

    public vat(cc ccVar, xsc xscVar, vab vabVar, uzx uzxVar, avmb avmbVar, xpl xplVar, aunn aunnVar, vao vaoVar, uxj uxjVar, aunn aunnVar2) {
        super(ccVar, true);
        this.q = new avmm();
        this.r = new avmm();
        this.d = ConcurrentHashMap.newKeySet();
        this.g = new ConcurrentHashMap();
        this.u = 2;
        this.m = new ArrayList();
        this.n = xscVar;
        this.b = vabVar;
        this.o = avmbVar;
        this.v = xplVar;
        this.e = aunnVar;
        this.c = uzxVar;
        this.p = uxjVar;
        this.f = vaoVar;
        this.t = aunnVar2;
        k();
    }

    private final void r(uzx uzxVar, String str, String str2, String str3, int i, int i2, List list, Optional optional, apvy apvyVar, ajfz ajfzVar) {
        String strM = m(ajfzVar.f, str);
        this.d.add(strM);
        this.g.put(str, ajfzVar);
        this.n.E(strM, str, str2, ajfzVar, list);
        uzy uzyVarA = uzz.a();
        uzyVarA.b(str);
        uzyVarA.c(str2);
        uzyVarA.d(str3);
        uzyVarA.e = i;
        uzyVarA.f(i2);
        uzyVarA.e(list);
        uzyVarA.a = optional;
        uzyVarA.d = apvyVar;
        uzyVarA.c = ajfzVar.f;
        uzxVar.f(uzyVarA.a());
    }

    @Override // defpackage.uhv
    protected final void d() {
        this.r.dispose();
        this.q.dispose();
        uzl uzlVar = this.s;
        if (uzlVar != null) {
            uzlVar.a();
            this.s = null;
        }
        if (this.j) {
            n();
        }
        aunn aunnVar = this.e;
        if (aunnVar.io() == null || !this.l) {
            return;
        }
        ((vbf) aunnVar.io()).c(agke.n(this.d));
    }

    @Override // defpackage.uhv
    protected final void h() {
        this.q = new avmm();
        if (this.f.d(((vbf) this.e.io()).a())) {
            this.q.c(((ukp) this.t.io()).e().O(this.o).af(new avni() { // from class: vas
                @Override // defpackage.avni
                public final void a(Object obj) {
                    vat vatVar;
                    Optional optional = (Optional) obj;
                    if (optional.isPresent()) {
                        auhs auhsVar = (auhs) optional.get();
                        auhsVar.g.size();
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        Iterator it = auhsVar.g.iterator();
                        while (true) {
                            vatVar = this.a;
                            if (!it.hasNext()) {
                                break;
                            }
                            aufd aufdVar = (aufd) it.next();
                            ajwo ajwoVar = (aufdVar.e == 1000 ? (auff) aufdVar.f : auff.a).c;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfz.b);
                                ajwoVar.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                ajfz ajfzVar = (ajfz) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                                for (ajfy ajfyVar : ajfzVar.d) {
                                    String str = ajfyVar.c;
                                    String strM = vatVar.m(ajfzVar.f, str);
                                    hashSet.add(str);
                                    hashSet2.add(strM);
                                    vatVar.g.put(str, ajfzVar);
                                    vatVar.n.E(strM, str, ajfyVar.d, ajfzVar, ajfyVar.g);
                                    vatVar.d.add(strM);
                                }
                                if (ajfzVar.d.isEmpty()) {
                                    for (aqyu aqyuVar : ajfzVar.e) {
                                        int i = aqyuVar.b;
                                        String str2 = (i == 2 || i == 3) ? (String) aqyuVar.c : "";
                                        String str3 = str2;
                                        String strM2 = vatVar.m(ajfzVar.f, str3);
                                        hashSet.add(str3);
                                        hashSet2.add(strM2);
                                        vatVar.g.put(str3, ajfzVar);
                                        vatVar.n.E(strM2, str3, "unpublished_effect_logging_id", ajfzVar, agpi.a);
                                        vatVar.d.add(strM2);
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        ConcurrentHashMap concurrentHashMap = vatVar.g;
                        for (String str4 : concurrentHashMap.keySet()) {
                            if (!hashSet.contains(str4)) {
                                arrayList.add(str4);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str5 = (String) arrayList.get(i2);
                            ajfz ajfzVar2 = (ajfz) concurrentHashMap.remove(str5);
                            if (ajfzVar2 != null) {
                                String strM3 = vatVar.m(ajfzVar2.f, str5);
                                if (!hashSet2.contains(strM3)) {
                                    vatVar.n.F(strM3, str5);
                                    vatVar.d.remove(strM3);
                                }
                            }
                        }
                        vatVar.l = true;
                    }
                }
            }));
            o();
        } else if (!this.h || this.i != null) {
            p();
            this.l = true;
        } else {
            avmm avmmVar = this.q;
            uxj uxjVar = this.p;
            avmmVar.c(uxjVar.c.K(new ugm(this, 6)).O(this.o).af(new var(this, 2)));
        }
    }

    @Override // defpackage.uhv
    protected final void i() {
        this.q.dispose();
        uzl uzlVar = this.s;
        if (uzlVar != null) {
            uzlVar.a();
            this.s = null;
        }
    }

    @Override // defpackage.uhv
    protected final void iV() {
        boolean zQ;
        uzx uzxVar;
        vbd vbdVarA = ((vbf) this.e.io()).a();
        agkz agkzVar = (agkz) this.p.b.au();
        int iOrdinal = vbdVarA.ordinal();
        vao vaoVar = this.f;
        int i = 1;
        int i2 = 0;
        if (iOrdinal == 0) {
            zQ = vaoVar.a.Q();
        } else if (iOrdinal != 1) {
            zQ = iOrdinal == 2 && vaoVar.a.Q() && vaoVar.a(agkzVar);
        } else {
            zQ = vaoVar.a.M();
        }
        this.h = zQ;
        if (vaoVar.d(vbdVarA)) {
            this.i = this.c;
        } else {
            if (this.h) {
                uzxVar = vbdVarA == vbd.c ? this.c : null;
            } else {
                uzxVar = this.b;
            }
            this.i = uzxVar;
        }
        avmm avmmVar = this.r;
        xpl xplVar = this.v;
        awly awlyVarAz = ((awly) xplVar.a).az();
        avmb avmbVar = this.o;
        avmmVar.c(awlyVarAz.O(avmbVar).af(new var(this, i)));
        avmmVar.c(((awly) xplVar.b).az().O(avmbVar).af(new var(this, i2)));
    }

    public final ajfz l(String str) {
        return (ajfz) this.g.get(str);
    }

    public final String m(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return (!this.h || TextUtils.isEmpty(str2)) ? xsc.C("asset_item_selected_entity") : xsc.C(str2);
        }
        return str;
    }

    public final void n() {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.n.D((String) it.next());
        }
        set.clear();
    }

    public final void o() {
        uzl uzlVar = this.s;
        if (uzlVar != null) {
            uzlVar.a();
        }
        this.s = this.b.m(new usf(this, 12));
    }

    public final void p() {
        agkx agkxVar = new agkx();
        agkxVar.j(((vbf) this.e.io()).b());
        Set set = this.d;
        agkxVar.j(set);
        agkz agkzVarG = agkxVar.g();
        if (agkzVarG.isEmpty()) {
            o();
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(agkzVarG.size());
        set.addAll(agkzVarG);
        agqr it = agkzVarG.iterator();
        while (it.hasNext()) {
            this.q.c(this.n.G((String) it.next()).O(this.o).ar().K(new hpn(this, atomicInteger, 8)).Q(new ugm(atomicInteger, 5)).B(new sqj(7)).af(new usn(this, 20)));
        }
    }

    public final void q(ajfz ajfzVar) {
        uzx uzxVar;
        String str;
        if (this.h) {
            List list = this.m;
            synchronized (list) {
                uzxVar = this.i;
                if (uzxVar == null) {
                    list.add(ajfzVar);
                    return;
                }
            }
        } else {
            uzxVar = this.i;
            if (uzxVar == null) {
                return;
            }
        }
        uzx uzxVar2 = uzxVar;
        for (ajfy ajfyVar : ajfzVar.d) {
            String str2 = ajfyVar.c;
            String str3 = ajfyVar.d;
            String str4 = ajfyVar.e;
            int i = this.u;
            aiie aiieVar = ajfyVar.g;
            Optional optionalEmpty = Optional.empty();
            apvy apvyVar = ajfyVar.f;
            if (apvyVar == null) {
                apvyVar = apvy.a;
            }
            r(uzxVar2, str2, str3, str4, 2, i, aiieVar, optionalEmpty, apvyVar, ajfzVar);
        }
        if (ajfzVar.d.isEmpty()) {
            for (aqyu aqyuVar : ajfzVar.e) {
                int i2 = aqyuVar.b;
                if (i2 == 2) {
                    str = (String) aqyuVar.c;
                    i2 = 2;
                } else if (i2 == 3) {
                    str = (String) aqyuVar.c;
                    i2 = 3;
                } else {
                    str = "";
                }
                r(uzxVar2, str, "unpublished_effect_logging_id", "", i2 == 2 ? 12 : 13, 4, agpi.a, Optional.of(aqyuVar.d), null, ajfzVar);
            }
        }
    }
}
