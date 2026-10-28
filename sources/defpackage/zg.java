package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zg {
    public static int c;
    public final Object a;
    public Object b;

    public zg(arx arxVar) {
        this.b = null;
        this.a = new ArrayList();
        c++;
        this.b = arxVar;
    }

    public final long a(arp arpVar, long j) {
        arx arxVar = arpVar.d;
        if (arxVar instanceof art) {
            return j;
        }
        List list = arpVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            arn arnVar = (arn) list.get(i);
            if (arnVar instanceof arp) {
                arp arpVar2 = (arp) arnVar;
                if (arpVar2.d != arxVar) {
                    jMin = Math.min(jMin, a(arpVar2, ((long) arpVar2.e) + j));
                }
            }
        }
        if (arpVar != arxVar.i) {
            return jMin;
        }
        long jA = arxVar.a();
        arp arpVar3 = arxVar.h;
        long j2 = j - jA;
        return Math.min(Math.min(jMin, a(arpVar3, j2)), j2 - ((long) arpVar3.e));
    }

    public final long b(arp arpVar, long j) {
        arx arxVar = arpVar.d;
        if (arxVar instanceof art) {
            return j;
        }
        List list = arpVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            arn arnVar = (arn) list.get(i);
            if (arnVar instanceof arp) {
                arp arpVar2 = (arp) arnVar;
                if (arpVar2.d != arxVar) {
                    jMax = Math.max(jMax, b(arpVar2, ((long) arpVar2.e) + j));
                }
            }
        }
        if (arpVar != arxVar.h) {
            return jMax;
        }
        long jA = arxVar.a();
        arp arpVar3 = arxVar.i;
        long j2 = j + jA;
        return Math.max(Math.max(jMax, b(arpVar3, j2)), j2 - ((long) arpVar3.e));
    }

    public final void c(blm blmVar, int i, int i2) {
        zg zgVarE = e(blmVar.a(i));
        if (zgVarE == null) {
            zgVarE = new zg(1);
            ((SparseArray) this.a).put(blmVar.a(i), zgVarE);
        }
        if (i2 > i) {
            zgVarE.c(blmVar, i + 1, i2);
        } else {
            zgVarE.b = blmVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bof, java.lang.Object] */
    public final void d() {
        ((boc) this.a).c(this.b);
        this.b = null;
    }

    public final zg e(int i) {
        return (zg) ((SparseArray) this.a).get(i);
    }

    public zg(int i) {
        this.a = new SparseArray(i);
    }

    private zg() {
        throw null;
    }

    public zg(boc bocVar, boe boeVar) {
        this.a = bocVar;
        this.b = boeVar;
        bocVar.b(boeVar);
    }
}
