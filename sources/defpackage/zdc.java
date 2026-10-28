package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zdc implements cwj {
    private final cwj a;
    private final yxr b;
    private final int c;
    private final bse d;
    private int e = 0;

    public zdc(cwj cwjVar, yxr yxrVar, int i, bse bseVar) {
        this.a = cwjVar;
        this.b = yxrVar;
        this.c = i;
        this.d = bseVar;
    }

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        this.a.b(bseVar);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        this.a.c(bwbVar, i);
    }

    @Override // defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        int iCn;
        int i4 = this.e + i2;
        this.e = i4;
        String str = this.d.a;
        yxr yxrVar = this.b;
        if (!yxrVar.f && (iCn = zik.cn(str)) != -1) {
            Set set = yxrVar.d;
            Integer numValueOf = Integer.valueOf(iCn);
            if (!set.contains(numValueOf)) {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                if (j / 1000 < ((Long) yxrVar.a.get()).longValue() + ((long) ((Integer) yxrVar.c.get()).intValue())) {
                    Long l = (Long) yxrVar.e.get(numValueOf);
                    if (!yxrVar.g && l != null && l.longValue() <= i4 + i3) {
                        ((zjd) yxrVar.b.get()).G();
                        yxrVar.g = true;
                        zhq zhqVar = zhq.ABR;
                        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                    }
                } else {
                    int i5 = this.c;
                    zhq zhqVar2 = zhq.ABR;
                    TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                    if (i5 == 1) {
                        ((zjd) yxrVar.b.get()).e();
                        set.add(numValueOf);
                    } else {
                        ((zjd) yxrVar.b.get()).ay();
                        set.add(numValueOf);
                    }
                }
            }
        }
        this.a.e(j, i, i2, i3, cwiVar);
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) {
        return this.a.a(brvVar, i, z);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}
