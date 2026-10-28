package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fse implements fhq {
    final /* synthetic */ fqh a;
    final /* synthetic */ fsy b;
    private Thread c = null;
    private boolean d = false;

    public fse(fsy fsyVar, fqh fqhVar) {
        this.a = fqhVar;
        this.b = fsyVar;
    }

    @Override // defpackage.fhq
    public final void a(int i, int i2, boolean z) {
        int iIntValue;
        if (this.b.r() != -1) {
            int iIntValue2 = 0;
            if (!fna.K) {
                if (z) {
                    fsy fsyVar = this.b;
                    fqh fqhVar = this.a;
                    fkw fkwVarS = fsy.s(fsyVar.g, fqhVar);
                    Integer numValueOf = Integer.valueOf(fkwVarS.b);
                    Map map = fsyVar.r;
                    map.put(fqhVar, numValueOf);
                    if (fkwVarS.b != fsyVar.J.b) {
                        if (fkwVarS.b > fsyVar.J.b) {
                            fsy.S(fsyVar, fkwVarS);
                            return;
                        }
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Integer num = (Integer) ((Map.Entry) it.next()).getValue();
                            if (iIntValue2 < num.intValue()) {
                                iIntValue2 = num.intValue();
                            }
                        }
                        if (iIntValue2 != fsyVar.J.b) {
                            fsy.S(fsyVar, new fkw(fkwVarS.a, iIntValue2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (this) {
                if (this.c != null) {
                    if (Thread.currentThread() != this.c) {
                        this.d = true;
                    }
                    return;
                }
                this.c = Thread.currentThread();
                do {
                    try {
                        synchronized (this) {
                            this.d = false;
                        }
                        fsy fsyVar2 = this.b;
                        fhd fhdVar = fsyVar2.g;
                        fqh fqhVar2 = this.a;
                        fkw fkwVarS2 = fsy.s(fhdVar, fqhVar2);
                        synchronized (fsyVar2) {
                            Map map2 = fsyVar2.r;
                            Integer num2 = (Integer) map2.get(fqhVar2);
                            if (num2 == null || num2.intValue() != fkwVarS2.b) {
                                map2.put(fqhVar2, Integer.valueOf(fkwVarS2.b));
                                if (fkwVarS2.b != fsyVar2.J.b) {
                                    if (fkwVarS2.b > fsyVar2.J.b) {
                                        fsy.S(fsyVar2, fkwVarS2);
                                    } else {
                                        synchronized (fsyVar2) {
                                            try {
                                                Iterator it2 = map2.entrySet().iterator();
                                                iIntValue = 0;
                                                while (it2.hasNext()) {
                                                    Integer num3 = (Integer) ((Map.Entry) it2.next()).getValue();
                                                    if (iIntValue < num3.intValue()) {
                                                        iIntValue = num3.intValue();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (iIntValue != fsyVar2.J.b) {
                                            fsy.S(fsyVar2, new fkw(fkwVarS2.a, iIntValue));
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.c = null;
                            throw th2;
                        }
                    }
                } while (this.d);
                synchronized (this) {
                    this.c = null;
                }
            }
        }
    }
}
