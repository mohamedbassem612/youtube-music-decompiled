package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edy implements edw {
    public final dma a = new edx();
    private final dmq b;

    public edy(dmq dmqVar) {
        this.b = dmqVar;
    }

    @Override // defpackage.edw
    public final List a(String str) {
        str.getClass();
        return (List) apb.f(this.b, true, false, new eck(str, 2));
    }

    @Override // defpackage.edw
    public final boolean b(String str) {
        str.getClass();
        return ((Boolean) apb.f(this.b, true, false, new apm(str, 7, (byte[]) null))).booleanValue();
    }

    @Override // defpackage.edw
    public final boolean c(String str) {
        return ((Boolean) apb.f(this.b, true, false, new apm(str, 6))).booleanValue();
    }

    @Override // defpackage.edw
    public final void d(eol eolVar) {
        apb.f(this.b, false, true, new apm(this, eolVar, 5));
    }
}
