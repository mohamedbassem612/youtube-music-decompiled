package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgq extends fgw {
    public final fgr a;

    public fgq(fhd fhdVar, fgr fgrVar) {
        super(fhdVar, fgrVar);
        this.a = fgrVar;
    }

    @Override // defpackage.fgv
    public final /* synthetic */ fgy a() {
        return this.a;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(int i) {
        this.a.c = i;
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void d(int i) {
        this.a.d = i;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void f(fgy fgyVar) {
        if (fgyVar != null) {
            fgr fgrVar = this.a;
            if (fgrVar.a == null) {
                fgrVar.a = new ArrayList();
            }
            fgrVar.a.add(fgyVar);
        }
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void g(int i) {
        this.a.e = i;
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.f = i;
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void i(int i, float f) {
        this.a.k().v(i, f);
    }

    public final void j(fgv fgvVar) {
        f(fgvVar.a());
    }
}
