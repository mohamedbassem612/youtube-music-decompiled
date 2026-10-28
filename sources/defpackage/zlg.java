package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zlg {
    final Map a = new HashMap();
    final Set b = new HashSet();
    private final zjr c;
    private akfp d;

    public zlg(zjr zjrVar) {
        this.c = zjrVar;
    }

    public final zlf a(yxf yxfVar) {
        zlf zlhVar;
        Map map = this.a;
        zlf zkzVar = (zlf) map.get(yxfVar);
        if (zkzVar == null) {
            int iOrdinal = yxfVar.ordinal();
            if (iOrdinal == 0) {
                zlhVar = new zlh();
            } else if (iOrdinal == 1) {
                zlhVar = new zli();
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    zjr zjrVar = this.c;
                    zkzVar = new zkz(zjrVar.i.m(513, 45846590L), zjrVar.cy());
                } else if (iOrdinal == 4) {
                    zlhVar = new zla();
                } else {
                    if (iOrdinal != 5) {
                        throw new RuntimeException(null, null);
                    }
                    zlhVar = new zld();
                }
                zkzVar.c();
                map.put(yxfVar, zkzVar);
            } else {
                zlhVar = new zkx();
            }
            zkzVar = zlhVar;
            zkzVar.c();
            map.put(yxfVar, zkzVar);
        }
        return zkzVar;
    }

    public final void b() throws zlj {
        Set set = this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zlf zlfVarA = a((yxf) it.next());
            if (this.c.cy() && (zlfVarA instanceof zkz)) {
                zkz zkzVar = (zkz) zlfVarA;
                akfp akfpVar = this.d;
                if (akfpVar != null) {
                    boolean z = zkzVar.d;
                    int i = akfpVar.b;
                    int i2 = akfpVar.c;
                    if (z) {
                        zkzVar.e(i, i2);
                    }
                }
            }
        }
        set.clear();
        if (this.c.cy()) {
            this.d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final boolean c(wiu wiuVar) {
        akfp akfpVar;
        if (wiuVar.aB()) {
            Set set = this.b;
            set.add(yxf.RECOMPOSITION);
            set.add(yxf.PASSTHROUGH);
        }
        if (wiuVar.as()) {
            Set set2 = this.b;
            set2.add(yxf.BICUBIC_UPSCALING);
            set2.add(yxf.PASSTHROUGH);
        }
        if (wiuVar.au()) {
            Set set3 = this.b;
            set3.add(yxf.PASSTHROUGH);
            if (this.c.cy()) {
                this.d = wiuVar.C();
                Map map = this.a;
                yxf yxfVar = yxf.CONVOLUTION;
                zkz zkzVar = (zkz) map.get(yxfVar);
                if (zkzVar == null || (akfpVar = this.d) == null) {
                    set3.add(yxfVar);
                } else {
                    int i = akfpVar.b;
                    int i2 = akfpVar.c;
                    if (zkzVar.e == null || zkzVar.f != i || zkzVar.g != i2) {
                        set3.add(yxfVar);
                    }
                }
            } else {
                set3.add(yxf.CONVOLUTION);
            }
        } else if (this.c.cy()) {
            this.d = null;
        }
        zjr zjrVar = this.c;
        if (zjrVar.bC()) {
            this.b.add(yxf.PASSTHROUGH);
        }
        boolean z = zjrVar.cy() && this.b.contains(yxf.CONVOLUTION);
        Set set4 = this.b;
        set4.removeAll(this.a.keySet());
        if (z) {
            set4.add(yxf.CONVOLUTION);
        }
        return !set4.isEmpty();
    }

    public final boolean d(wiu wiuVar) {
        return this.c.bC() || wiuVar.aB() || wiuVar.as() || wiuVar.au();
    }
}
