package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class spm implements spn, rsn {
    private static final Duration c = Duration.ofMinutes(10);
    public final Map a = new ConcurrentHashMap();
    public final mbc b;
    private final ahey d;
    private final sny e;
    private final ruq f;
    private final xte g;

    public spm(ahey aheyVar, mbc mbcVar, xte xteVar, ruq ruqVar, sny snyVar) {
        this.d = aheyVar;
        this.b = mbcVar;
        this.g = xteVar;
        this.f = ruqVar;
        this.e = snyVar;
    }

    private final void h(List list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        aihf aihfVarCreateBuilder = ains.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ains ainsVar = (ains) aihfVarCreateBuilder.instance;
        ainsVar.b |= 2;
        ainsVar.c = str;
        this.f.b(new sgc((ains) aihfVarCreateBuilder.build()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivk aivkVar = (aivk) it.next();
            try {
                try {
                    try {
                        Uri uriA = ((zzj) this.f.a.io()).a(tyu.c(aivkVar.c), new zzi[0]);
                        try {
                            xte xteVar = this.g;
                            sny snyVar = this.e;
                            wjk wjkVar = new wjk(aivkVar.e, 1);
                            boolean z = aivkVar.f;
                            int iAX = a.aX(aivkVar.h);
                            xteVar.k(snyVar, uriA, wjkVar, z, Long.MAX_VALUE, iAX == 0 ? 1 : iAX, null, null, 0);
                        } catch (sat e) {
                            rmp.j(null, "[ARCS] Failed to log the ping: ".concat(String.valueOf(e.getMessage())));
                        }
                    } catch (tzn e2) {
                        throw new rso(e2.toString(), e2);
                    }
                } catch (rso e3) {
                    rmp.j(null, "[ARCS] Failed to apply macro: ".concat(String.valueOf(e3.getMessage())));
                }
            } catch (MalformedURLException unused) {
                rmp.j(null, "[ARCS] Badly formed uri in ping: ".concat(String.valueOf(aivkVar.c)));
            }
        }
        this.f.c();
    }

    private final void i(String str) {
        spo spoVar = (spo) this.a.remove(str);
        if (spoVar != null) {
            spoVar.b();
            Iterator it = spoVar.b.keySet().iterator();
            while (it.hasNext()) {
                it.remove();
            }
            spoVar.b();
            for (ListenableFuture listenableFuture : spoVar.c.values()) {
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                }
            }
            spoVar.b();
            Map map = spoVar.d;
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                String str2 = ((shg) it2.next()).a;
            }
            map.clear();
        }
    }

    @Override // defpackage.rsn
    public final smn a(String str, smm smmVar) {
        typ.f(str);
        spo spoVar = (spo) this.a.get(str);
        aiui aiuiVar = null;
        if (spoVar == null) {
            spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
            return new smn(agpi.a, null);
        }
        String str2 = smmVar.a;
        spoVar.b();
        shg shgVar = (shg) spoVar.d.get(str2);
        if (shgVar == null) {
            spl splVar2 = spl.PREFETCH_SERVICE_INITIALIZED;
            return new smn(agpi.a, null);
        }
        spl splVar3 = spl.PREFETCH_SERVICE_INITIALIZED;
        String str3 = shgVar.a;
        ajnu ajnuVar = shgVar.c;
        h(ajnuVar.d, str3);
        if ((ajnuVar.b & 8) != 0 && (aiuiVar = ajnuVar.f) == null) {
            aiuiVar = aiui.a;
        }
        return new smn(shgVar.b, aiuiVar);
    }

    @Override // defpackage.spn
    public final void b(String str, String str2) {
        typ.f(str);
        typ.f(str2);
        spo spoVar = (spo) this.a.get(str);
        if (spoVar != null) {
            spoVar.c(str2);
            spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
        }
    }

    @Override // defpackage.spn
    public final void c(String str, String str2) {
        typ.f(str);
        typ.f(str2);
        spo spoVar = (spo) this.a.get(str);
        if (spoVar == null) {
            spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
        } else {
            spl splVar2 = spl.PREFETCH_SERVICE_INITIALIZED;
            spoVar.e(str2, 1);
        }
    }

    @Override // defpackage.spn
    public final void d(String str, String str2) {
        typ.f(str);
        typ.f(str2);
        rhk rhkVar = new rhk(this, 13);
        Map map = this.a;
        spo spoVar = (spo) j$.util.Map.EL.computeIfAbsent(map, str, rhkVar);
        spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
        spoVar.e(str2, 0);
        if (map.size() > 5) {
            long j = Long.MAX_VALUE;
            spo spoVar2 = null;
            for (spo spoVar3 : map.values()) {
                if (!spoVar3.a.equals(str)) {
                    long j2 = spoVar3.e;
                    if (j2 < j) {
                        spoVar2 = spoVar3;
                        j = j2;
                    }
                }
            }
            if (spoVar2 != null) {
                i(spoVar2.a);
            }
        }
    }

    @Override // defpackage.spn
    public final void e(String str, String str2, wgk wgkVar) {
        String str3;
        shg shgVar;
        typ.f(str);
        typ.f(str2);
        spo spoVar = (spo) this.a.get(str);
        if (spoVar == null) {
            spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
            return;
        }
        spoVar.c(str2);
        spl splVar2 = spl.PREFETCH_SERVICE_INITIALIZED;
        ArrayList<shg> arrayList = new ArrayList();
        agke agkeVarA = wgkVar.a();
        for (ajnu ajnuVar : wgkVar.a.f) {
            if (ajnuVar == null || (ajnuVar.b & 1) == 0 || ajnuVar.d.size() <= 0 || (ajnuVar.b & 4) == 0) {
                str3 = str2;
            } else {
                agjz agjzVar = new agjz(4);
                int size = agkeVarA.size();
                for (int i = 0; i < size; i++) {
                    aivt aivtVar = (aivt) agkeVarA.get(i);
                    if ((aivtVar.b & 2) != 0 && aivtVar.d.equals(ajnuVar.c)) {
                        agjzVar.h(aivtVar);
                    }
                }
                agke agkeVarG = agjzVar.g();
                if (agkeVarG.isEmpty()) {
                    shgVar = null;
                    str3 = str2;
                } else {
                    long epochMilli = this.b.f().toEpochMilli();
                    typ.f(str2);
                    agkeVarG.getClass();
                    ajnuVar.getClass();
                    str3 = str2;
                    shgVar = new shg(str3, epochMilli, agkeVarG, ajnuVar);
                }
                if (shgVar != null) {
                    arrayList.add(shgVar);
                }
            }
            str2 = str3;
        }
        for (shg shgVar2 : arrayList) {
            ajnu ajnuVar2 = shgVar2.c;
            String str4 = ajnuVar2.c;
            if (spoVar.d(str4) != null) {
                spoVar.a(str4);
            }
            spoVar.b();
            String str5 = shgVar2.a;
            akwz akwzVar = ajnuVar2.e;
            if (akwzVar == null) {
                akwzVar = akwz.a;
            }
            long j = (akwzVar.b & 2) != 0 ? akwzVar.c : -1L;
            spm spmVar = this;
            String str6 = str;
            ahew ahewVarSchedule = this.d.schedule(new hni(spmVar, str6, shgVar2, spoVar, str4, 10), (j < 0 ? c : Duration.ofMillis(j)).toMillis(), TimeUnit.MILLISECONDS);
            spoVar.b();
            this = spmVar;
            str = str6;
        }
    }

    @Override // defpackage.spn
    public final void f(String str) {
        spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
        i(str);
    }

    @Override // defpackage.spn
    public final void g(String str, String str2) {
        typ.f(str);
        typ.f(str2);
        spo spoVar = (spo) this.a.get(str);
        if (spoVar == null) {
            spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
        } else {
            spl splVar2 = spl.PREFETCH_SERVICE_INITIALIZED;
            spoVar.c(str2);
        }
    }
}
