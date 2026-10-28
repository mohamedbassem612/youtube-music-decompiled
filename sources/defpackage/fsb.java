package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fsb {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ fsy d;

    public fsb(fsy fsyVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = fsyVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    public final boolean a(int i) {
        fsy fsyVar = this.d;
        boolean z = fsyVar.O;
        synchronized (fsyVar) {
            List list = fsyVar.b;
            if (this.c != list.size()) {
                return false;
            }
            fqh fqhVar = (fqh) list.get(i);
            if (!fqhVar.d().m()) {
                int iQ = fsyVar.q(fqhVar);
                int iP = fsyVar.p(fqhVar);
                fsc fscVar = fna.B > 0 ? new fsc(fsyVar) : null;
                int i2 = this.b;
                int i3 = this.a;
                if ((i >= i3 || fqhVar.d().k()) && i <= i2) {
                    if (!fqhVar.s(iQ, iP)) {
                        fqhVar.h(fsyVar.g, iQ, iP, fscVar, true);
                    }
                } else if (fna.B != 0) {
                    Set set = fsyVar.M;
                    if (i - i2 > 4 || i3 >= i || !set.contains(Integer.valueOf(i))) {
                        if (i3 - i <= 4 || i2 <= i || !set.contains(Integer.valueOf(i)) || z) {
                            fsyVar.M.remove(Integer.valueOf(i));
                            if (gzj.aT()) {
                                fsy.B(fqhVar, fsyVar.l);
                            } else {
                                fsyVar.h.post(new dhr((Object) fsyVar, (Object) fqhVar, 20, (short[]) null));
                            }
                        }
                    } else if (!z) {
                        z = false;
                        if (i3 - i <= 4) {
                            fsyVar.M.remove(Integer.valueOf(i));
                            if (gzj.aT()) {
                                fsy.B(fqhVar, fsyVar.l);
                            } else {
                                fsyVar.h.post(new dhr((Object) fsyVar, (Object) fqhVar, 20, (short[]) null));
                            }
                        } else {
                            fsyVar.M.remove(Integer.valueOf(i));
                            if (gzj.aT()) {
                                fsy.B(fqhVar, fsyVar.l);
                            } else {
                                fsyVar.h.post(new dhr((Object) fsyVar, (Object) fqhVar, 20, (short[]) null));
                            }
                        }
                    }
                } else {
                    fsyVar.M.remove(Integer.valueOf(i));
                    if (gzj.aT()) {
                        fsy.B(fqhVar, fsyVar.l);
                    } else {
                        fsyVar.h.post(new dhr((Object) fsyVar, (Object) fqhVar, 20, (short[]) null));
                    }
                }
            }
            return true;
        }
    }
}
