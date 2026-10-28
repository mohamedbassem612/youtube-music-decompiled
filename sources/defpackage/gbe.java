package defpackage;

import android.net.NetworkCapabilities;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gbe implements kww {
    public final gbm a;
    private final kwe b;
    private final kwi c;
    private final gbd d;
    private final gat e;
    private final gbn f;
    private final gbh g;
    private final heg h;

    public gbe(kwe kweVar, kwi kwiVar, gbm gbmVar, gbd gbdVar, gat gatVar, gbn gbnVar, gbh gbhVar, heg hegVar) {
        this.b = kweVar;
        this.c = kwiVar;
        this.a = gbmVar;
        this.d = gbdVar;
        this.e = gatVar;
        this.f = gbnVar;
        this.g = gbhVar;
        this.h = hegVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0127 A[Catch: all -> 0x0136, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:21:0x00f8, B:23:0x00fc, B:25:0x0105, B:27:0x0109, B:29:0x0114, B:31:0x0118, B:33:0x0123, B:35:0x0127), top: B:44:0x00f8 }] */
    private final Map e() {
        long j;
        HashMap map = new HashMap();
        lpa lpaVar = this.c.d;
        fxl fxlVar = kwh.a;
        if (lpaVar.j()) {
            fxlVar = (fxl) lpaVar.f();
        }
        kwe kweVar = this.b;
        map.put("v", kweVar.a);
        map.put("gms", Boolean.valueOf(kweVar.b));
        map.put("gv", Long.valueOf(fxlVar.T));
        map.put("int", fxlVar.t);
        fxo fxoVar = fxlVar.an;
        if (fxoVar == null) {
            fxoVar = fxo.a;
        }
        map.put("attts", Long.valueOf(fxoVar.c));
        fxo fxoVar2 = fxlVar.an;
        if (fxoVar2 == null) {
            fxoVar2 = fxo.a;
        }
        map.put("att", fxoVar2.e.A(StandardCharsets.ISO_8859_1));
        fxo fxoVar3 = fxlVar.an;
        if (fxoVar3 == null) {
            fxoVar3 = fxo.a;
        }
        map.put("attb", fxoVar3.e.G());
        fxo fxoVar4 = fxlVar.an;
        if (fxoVar4 == null) {
            fxoVar4 = fxo.a;
        }
        map.put("attkid", fxoVar4.d);
        map.put("up", Boolean.valueOf(this.d.a));
        map.put("t", new Throwable());
        gbh gbhVar = this.g;
        map.put("tcq", Long.valueOf(gbhVar.a));
        map.put("tpq", Long.valueOf(gbhVar.b));
        map.put("tcv", Long.valueOf(gbhVar.c));
        map.put("tpv", Long.valueOf(gbhVar.d));
        map.put("tchv", Long.valueOf(gbhVar.e));
        map.put("tphv", Long.valueOf(gbhVar.f));
        map.put("tcc", Long.valueOf(gbhVar.g));
        map.put("tpc", Long.valueOf(gbhVar.h));
        gat gatVar = this.e;
        if (gatVar != null) {
            synchronized (gat.class) {
                Object obj = gatVar.a;
                if (obj != null) {
                    if (((NetworkCapabilities) obj).hasTransport(4)) {
                        j = 2;
                    } else if (((NetworkCapabilities) gatVar.a).hasTransport(1)) {
                        j = 1;
                    } else {
                        j = ((NetworkCapabilities) gatVar.a).hasTransport(0) ? 0L : -1L;
                    }
                }
            }
            map.put("nt", Long.valueOf(j));
        }
        gbn gbnVar = this.f;
        map.put("vs", Long.valueOf(gbnVar.b()));
        map.put("vf", Long.valueOf(gbnVar.a()));
        return map;
    }

    @Override // defpackage.kww
    public final Map a() {
        gbm gbmVar = this.a;
        Map mapE = e();
        mapE.put("lts", Long.valueOf(gbmVar.a()));
        return mapE;
    }

    @Override // defpackage.kww
    public final Map b() {
        return e();
    }

    @Override // defpackage.kww
    public final Map c() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // defpackage.kww
    public final Map d() {
        Map mapE = e();
        mapE.put("vst", this.h.g());
        return mapE;
    }
}
