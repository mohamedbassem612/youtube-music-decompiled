package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gdt implements advb {
    public WeakReference a;
    public WeakReference b;
    public admh c = new adlg();
    private final gdq d;
    private final gdq e;

    public gdt(gdq gdqVar, gdq gdqVar2) {
        this.e = gdqVar;
        this.d = gdqVar2;
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        ahno.F(cls == wnt.class);
        adlg adlgVar = new adlg();
        this.c = adlgVar;
        WeakReference weakReference = this.a;
        gdq gdqVar = this.d;
        gdqVar.a = weakReference;
        adlgVar.d(wnq.class, gdqVar);
        admh admhVar = this.c;
        WeakReference weakReference2 = this.b;
        gdq gdqVar2 = this.e;
        gdqVar2.a = weakReference2;
        admhVar.d(wnr.class, gdqVar2);
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.c;
    }
}
