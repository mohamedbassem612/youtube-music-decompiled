package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efv implements Runnable {
    private final eam a;
    private final boolean b;
    private final int c;
    private final dov d;

    public efv(eam eamVar, dov dovVar, boolean z, int i) {
        eamVar.getClass();
        this.a = eamVar;
        this.d = dovVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eby ebyVarA;
        boolean z = this.b;
        eam eamVar = this.a;
        if (z) {
            dov dovVar = this.d;
            int i = this.c;
            String str = ((eek) dovVar.a).a;
            synchronized (eamVar.l) {
                ebyVarA = eamVar.a(str);
            }
            eam.g(ebyVarA, i);
        } else {
            dov dovVar2 = this.d;
            int i2 = this.c;
            String str2 = ((eek) dovVar2.a).a;
            synchronized (eamVar.l) {
                if (eamVar.f.get(str2) != null) {
                    dzf.b();
                } else {
                    Set set = (Set) eamVar.h.get(str2);
                    if (set != null && set.contains(dovVar2)) {
                        eam.g(eamVar.a(str2), i2);
                    }
                }
            }
        }
        dzf.b();
        dzf.a("StopWorkRunnable");
    }
}
