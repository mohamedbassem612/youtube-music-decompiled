package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flt implements fmk {
    final /* synthetic */ flu a;
    private final ArrayList b = new ArrayList();

    public flt(flu fluVar) {
        this.a = fluVar;
    }

    @Override // defpackage.fmk
    public final void a(fmj fmjVar) {
        e(fmjVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fve, java.lang.Object] */
    @Override // defpackage.fmk
    public final void b(fmj fmjVar) {
        flu fluVar = this.a;
        List<fmp> list = (List) fluVar.a.get(fmjVar);
        if (list != null && fluVar.j != null) {
            for (fmp fmpVar : list) {
                ?? A = fmjVar.a();
                if (A != 0) {
                    String str = fmpVar.a.b;
                    fmh fmhVar = fmpVar.b;
                    A.d(new fhz());
                }
            }
        }
        e(fmjVar);
    }

    @Override // defpackage.fmk
    public final void c(fmj fmjVar) {
        ArrayList arrayList = this.b;
        fmjVar.c(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fmo fmoVar = (fmo) arrayList.get(i);
            flr flrVar = (flr) this.a.k.K(fmoVar.a());
            if (flrVar != null) {
                tge tgeVar = (tge) flrVar.a.get(fmoVar.b());
                tgeVar.d = Float.valueOf(fmoVar.b);
                tgeVar.b = fmjVar;
            }
        }
        arrayList.clear();
        flu fluVar = this.a;
        if (TextUtils.isEmpty((String) ahc.a(fluVar.b, fmjVar.hashCode()))) {
            return;
        }
        fmjVar.hashCode();
        gzj gzjVar = fvp.b;
        boolean z = fvn.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r2
      0x0048: PHI (r2v2 boolean) = (r2v1 boolean), (r2v7 boolean) binds: [B:11:0x0043, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fmk
    public final boolean d(fmj fmjVar) {
        String str;
        Object obj;
        ArrayList arrayList = this.b;
        fmjVar.c(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            fmo fmoVar = (fmo) arrayList.get(i);
            flq flqVarA = fmoVar.a();
            flu fluVar = this.a;
            flr flrVar = (flr) fluVar.k.K(flqVarA);
            tge tgeVar = flrVar != null ? (tge) flrVar.a.get(fmoVar.b()) : null;
            String str2 = fluVar.h;
            if (str2 != null) {
                String.valueOf(flqVarA);
                fmoVar.b().b();
                float f = fmoVar.b;
            }
            if (tgeVar == null) {
                z = false;
                str = str2 != null ? str2 : null;
            }
            if (z && (obj = tgeVar.e) != null) {
                if (((Float) obj).floatValue() != fmoVar.b) {
                    if (str != null) {
                        Objects.toString(tgeVar.e);
                    }
                    z = false;
                }
            }
        }
        arrayList.clear();
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    public final void e(fmj fmjVar) {
        boolean z;
        int i;
        String str;
        flu fluVar = this.a;
        List list = (List) fluVar.a.remove(fmjVar);
        if (list != null) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                fmp fmpVar = (fmp) list.get(i2);
                flq flqVar = fmpVar.a;
                jnm jnmVar = fluVar.k;
                flr flrVar = (flr) jnmVar.K(flqVar);
                fmh fmhVar = fmpVar.b;
                if (flrVar.c == 2) {
                    Map map = flrVar.a;
                    tge tgeVar = (tge) map.get(fmhVar);
                    if (tgeVar == null) {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                    tgeVar.a--;
                    if (flrVar.c != 2) {
                        throw new RuntimeException("This should only be checked for disappearing animations");
                    }
                    Iterator it = map.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (((tge) it.next()).a > 0) {
                            z = false;
                            break;
                        }
                    }
                    if (z && flrVar.b != null) {
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            flu.e((fmh) it2.next(), flrVar.b);
                        }
                    }
                } else {
                    Map map2 = flrVar.a;
                    tge tgeVar2 = (tge) map2.get(fmhVar);
                    if (tgeVar2 == null) {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                    int i3 = tgeVar2.a - 1;
                    tgeVar2.a = i3;
                    if (i3 <= 0) {
                        map2.remove(fmhVar);
                        boolean zIsEmpty = map2.isEmpty();
                        if (flrVar.b != null) {
                            flu.h(fmhVar, fmhVar.e((fjh) flrVar.e.d()), flrVar.b);
                        }
                        z = zIsEmpty;
                    } else {
                        i = i2;
                    }
                    i2 = i + 1;
                }
                if (z) {
                    if (fluVar.h != null) {
                        String.valueOf(flqVar);
                    }
                    fkm fkmVar = flrVar.b;
                    if (fkmVar != null) {
                        fluVar.d(fkmVar, true);
                    }
                    gev gevVar = fluVar.j;
                    if (gevVar != null) {
                        flw flwVar = (flw) gevVar.b;
                        fkm fkmVar2 = (fkm) flwVar.a.remove(flqVar);
                        if (fkmVar2 != null) {
                            flx.f((jnm) gevVar.a, fkmVar2);
                        } else {
                            if (!flwVar.f.remove(flqVar) && (str = ((flw) ((jnm) gevVar.a).b).j) != null) {
                                Log.e(str, enb.b(flqVar, "Ending animation for id ", " but it wasn't recorded as animating!"));
                            }
                            fwb fwbVar = flwVar.i;
                            fkm fkmVar3 = fwbVar != null ? (fkm) ((fjc) fwbVar).E.get(flqVar) : null;
                            if (fkmVar3 != null) {
                                short s = fkmVar3.b;
                                int i4 = 0;
                                while (i4 < s) {
                                    flx.j((jnm) gevVar.a, flwVar.i, flwVar.i.b(((fjh) fkmVar3.c(i4)).a), false);
                                    i4++;
                                    i2 = i2;
                                }
                            }
                        }
                    }
                    i = i2;
                    jnmVar.N(flqVar);
                    flu.b(flrVar);
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
            ahb ahbVar = fluVar.b;
            if (TextUtils.isEmpty((String) ahc.a(ahbVar, fmjVar.hashCode()))) {
                return;
            }
            fmjVar.hashCode();
            gzj gzjVar = fvp.b;
            boolean z2 = fvn.a;
            ahc.b(ahbVar, fmjVar.hashCode());
        }
    }
}
