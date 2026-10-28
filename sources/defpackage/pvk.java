package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvk implements pvh {
    public final dma a = new pvi();
    public final dlz b = new pvj();
    private final dmq c;

    public pvk(dmq dmqVar) {
        this.c = dmqVar;
    }

    @Override // defpackage.pvh
    public final Object a(awoq awoqVar) {
        return apb.g(this.c, true, false, new bfu(11), awoqVar);
    }

    @Override // defpackage.pvh
    public final Object b(List list, awoq awoqVar) {
        return apb.g(this.c, false, true, new pge(this, list, 6, null), awoqVar);
    }

    @Override // defpackage.pvh
    public final Object c(List list, awoq awoqVar) {
        list.getClass();
        return apb.g(this.c, false, true, new pge(this, list, 4, null), awoqVar);
    }

    @Override // defpackage.pvh
    public final Long[] d(List list) {
        return (Long[]) apb.f(this.c, false, true, new pge(this, list, 3, null));
    }

    @Override // defpackage.pvh
    public final void e(List list) {
        ((Integer) apb.f(this.c, false, true, new pge(this, list, 5, null))).intValue();
    }

    @Override // defpackage.pvh
    public final plx f(int i, String str) {
        return (plx) apb.f(this.c, true, false, new mai(i, str, 3));
    }

    @Override // defpackage.pvh
    public final Object g(int i, String str, awoq awoqVar) {
        return apb.g(this.c, true, false, new mai(i, str, 2), awoqVar);
    }
}
