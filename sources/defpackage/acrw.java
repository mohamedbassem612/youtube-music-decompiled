package defpackage;

import android.util.LruCache;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrw implements zza {
    static final long a;
    public boolean b;
    public String c;
    private final acuv d;
    private final ArrayList e = new ArrayList();
    private final List f = new ArrayList();
    private final long g;
    private final LruCache h;
    private final awmd i;
    private final abvk j;
    private final mbc k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private boolean p;
    private final boolean q;
    private final tre r;
    private final aunn s;
    private final hno t;
    private final abxu u;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        a = 10000L;
    }

    public acrw(acuv acuvVar, long j, LruCache lruCache, awmd awmdVar, abvk abvkVar, awmd awmdVar2, mbc mbcVar, awmd awmdVar3, boolean z, hno hnoVar, awmd awmdVar4, awmd awmdVar5, tre treVar, abxu abxuVar, aunn aunnVar) {
        this.d = acuvVar;
        this.g = j;
        this.h = lruCache;
        this.i = awmdVar;
        this.j = abvkVar;
        this.o = awmdVar2;
        this.k = mbcVar;
        this.l = awmdVar3;
        this.s = aunnVar;
        this.q = z;
        this.t = hnoVar;
        this.m = awmdVar4;
        this.n = awmdVar5;
        this.r = treVar;
        this.u = abxuVar;
    }

    private final wja g(alqc alqcVar) {
        if (alqcVar == null || (alqcVar.b & 4) == 0 || this.q) {
            return null;
        }
        wjb wjbVar = (wjb) this.l.io();
        alvt alvtVar = alqcVar.e;
        if (alvtVar == null) {
            alvtVar = alvt.a;
        }
        return wji.ai(wjbVar, alvtVar, this.g);
    }

    private final acry h(String str, alqc alqcVar) {
        wja wjaVarG;
        acry acryVar = null;
        if (!this.b && ((wjaVarG = g(alqcVar)) != null || this.q)) {
            long jB = acrz.b(alqcVar);
            boolean z = this.q;
            mbc mbcVar = this.k;
            long jB2 = z ? mbcVar.b() + TimeUnit.SECONDS.toMillis(jB) : Math.min(mbcVar.b() + TimeUnit.SECONDS.toMillis(jB), wjaVarG.i - a);
            LruCache lruCache = this.h;
            synchronized (lruCache) {
                if (!this.b) {
                    acry acryVar2 = new acry();
                    acryVar2.b = alqcVar;
                    acryVar2.d = jB2;
                    acryVar2.e = wjaVarG;
                    acryVar2.a = null;
                    lruCache.put(str, acryVar2);
                    acryVar = acryVar2;
                }
            }
        }
        return acryVar;
    }

    private final String i() {
        String str = this.c;
        return str == null ? this.d.Y() : str;
    }

    private final void j() {
        LruCache lruCache = this.h;
        synchronized (lruCache) {
            if (!this.b) {
                lruCache.remove(i());
            }
        }
    }

    private final boolean k() {
        if (!this.p) {
            return false;
        }
        this.p = false;
        acuv acuvVar = this.d;
        acuvVar.h = false;
        acuvVar.b = false;
        ((acuw) this.i.io()).b(acuvVar, this);
        return true;
    }

    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        alqc alqcVar = (alqc) obj;
        long jC = ((vxz) this.t.j).c(54, 45771173L, 0L);
        if (jC > 0) {
            trd trdVar = this.r.h;
            int iA = trdVar.a(260);
            if (trd.m(trdVar.a(264)) && !trdVar.l() && (iA == 6 || iA == 7 || iA == 8)) {
                ((avmb) this.u.x().d).c(new acnp(this, alqcVar, 10), jC, TimeUnit.MILLISECONDS);
                return;
            }
        }
        f(alqcVar);
    }

    public final void d(zza zzaVar, boolean z) {
        this.e.add(zzaVar);
        if (z || !this.d.h) {
            return;
        }
        this.p = true;
    }

    public final void e(zza zzaVar, boolean z) {
        this.f.add(zzaVar);
        if (z || !this.d.h) {
            return;
        }
        this.p = true;
    }

    public final void f(alqc alqcVar) {
        int iAX;
        wja wjaVarG;
        Long lValueOf;
        int i = alqcVar.f;
        int iAX2 = a.aX(i);
        Long lValueOf2 = null;
        if ((iAX2 == 0 || iAX2 != 3) && ((iAX = a.aX(i)) == 0 || iAX != 4)) {
            acry acryVarH = h(i(), alqcVar);
            if (acryVarH == null || (wjaVarG = acryVarH.e) == null) {
                wjaVarG = g(alqcVar);
            }
            if ((alqcVar.b & SemanticState.ReadOnly) != 0) {
                ajwo ajwoVar = alqcVar.k;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                acuv acuvVarN = acrz.n(ajwoVar, (acuw) this.i.io(), this.t, this.m, this.n, this.s);
                aihf builder = alqcVar.toBuilder();
                builder.copyOnWrite();
                alqc alqcVar2 = (alqc) builder.instance;
                alqcVar2.k = null;
                alqcVar2.b &= -1025;
                builder.copyOnWrite();
                alqc alqcVar3 = (alqc) builder.instance;
                alqcVar3.b &= -2049;
                alqcVar3.l = alqc.a.l;
                h(acuvVarN.Y(), (alqc) builder.build());
            }
        } else {
            if (k()) {
                return;
            }
            j();
            wjaVarG = null;
        }
        boolean z = this.q;
        if (!z && (wjaVarG == null || (alqcVar.b & 4) == 0)) {
            if (k()) {
                return;
            }
            j();
            aihf builder2 = alqcVar.toBuilder();
            builder2.copyOnWrite();
            alqc alqcVar4 = (alqc) builder2.instance;
            alqcVar4.f = 2;
            alqcVar4.b |= 8;
            alqcVar = (alqc) builder2.build();
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zza) arrayList.get(i2)).a(new acrx(alqcVar, wjaVarG, false));
        }
        if (z) {
            return;
        }
        if ((alqcVar.b & 4) == 0) {
            toe toeVar = new toe("Reel with no PlayerResponse.");
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((zza) it.next()).jj(toeVar);
            }
            return;
        }
        alvt alvtVar = alqcVar.e;
        if (alvtVar == null) {
            alvtVar = alvt.a;
        }
        wji wjiVar = new wji(alvtVar, this.g, wjaVarG);
        ajwo ajwoVar2 = alqcVar.k;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar2.c(aihlVarCheckIsLite);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i3 = apfpVar.e;
        if (i3 == 64) {
            lValueOf = (Long) apfpVar.f;
            lValueOf.longValue();
        } else if (i3 == 35) {
            lValueOf = Long.valueOf(TimeUnit.SECONDS.toMillis((long) (apfpVar.e == 35 ? ((Float) apfpVar.f).floatValue() : 0.0f)));
        } else {
            lValueOf = null;
        }
        int i4 = apfpVar.g;
        if (i4 == 65) {
            lValueOf2 = (Long) apfpVar.h;
            lValueOf2.longValue();
        } else if (i4 == 37) {
            lValueOf2 = Long.valueOf(TimeUnit.SECONDS.toMillis((long) (apfpVar.g == 37 ? ((Float) apfpVar.h).floatValue() : 0.0f)));
        }
        abvk abvkVarO = this.j;
        if (abvkVarO == null) {
            abvkVarO = ((abvn) this.o.io()).o();
        }
        abvkVarO.R(lValueOf, lValueOf2);
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((zza) it2.next()).a(wjiVar);
        }
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        if (k()) {
            return;
        }
        j();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zza) arrayList.get(i)).jj(toeVar);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((zza) it.next()).jj(toeVar);
        }
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
