package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apn implements ane {
    final /* synthetic */ apq a;
    final /* synthetic */ anq b;

    public apn(apq apqVar, anq anqVar) {
        this.a = apqVar;
        this.b = anqVar;
    }

    private final int a(int i) {
        apq apqVar = this.a;
        apqVar.measure(apq.c(0, i, apqVar.getLayoutParams().width), 0);
        return apqVar.getMeasuredHeight();
    }

    private final int b(int i) {
        apq apqVar = this.a;
        apqVar.measure(0, apq.c(0, i, apqVar.getLayoutParams().height));
        return apqVar.getMeasuredWidth();
    }

    @Override // defpackage.ane
    public final int maxIntrinsicHeight(ana anaVar, List list, int i) {
        return a(i);
    }

    @Override // defpackage.ane
    public final int maxIntrinsicWidth(ana anaVar, List list, int i) {
        return b(i);
    }

    @Override // defpackage.ane
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final anf mo201measure3p2s80s(ang angVar, List list, long j) {
        apq apqVar = this.a;
        if (apqVar.getChildCount() == 0) {
            return angVar.r(apd.d(j), apd.c(j), awnp.a, new akl(8));
        }
        int i = 0;
        if (apd.d(j) != 0) {
            apqVar.getChildAt(0).setMinimumWidth(apd.d(j));
        }
        if (apd.c(j) != 0) {
            apqVar.getChildAt(0).setMinimumHeight(apd.c(j));
        }
        apqVar.measure(apq.c(apd.d(j), apd.b(j), apqVar.getLayoutParams().width), apq.c(apd.c(j), apd.a(j), apqVar.getLayoutParams().height));
        return angVar.r(apqVar.getMeasuredWidth(), apqVar.getMeasuredHeight(), awnp.a, new apm(apqVar, this.b, i));
    }

    @Override // defpackage.ane
    public final int minIntrinsicHeight(ana anaVar, List list, int i) {
        return a(i);
    }

    @Override // defpackage.ane
    public final int minIntrinsicWidth(ana anaVar, List list, int i) {
        return b(i);
    }
}
