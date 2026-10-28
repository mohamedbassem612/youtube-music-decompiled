package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkr extends fgw {
    public final fks a;

    public fkr(fhd fhdVar, fks fksVar) {
        super(fhdVar, fksVar);
        this.a = fksVar;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void g(int i) {
        this.a.e = i;
    }

    @Override // defpackage.fgv
    public final /* synthetic */ fgy a() {
        return this.a;
    }

    public final void aa() {
        this.a.b = true;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: ab, reason: merged with bridge method [inline-methods] */
    public final void h(int i) {
        this.a.f = i;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(int i) {
        this.a.c = i;
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(int i) {
        this.a.d = i;
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void i(int i, float f) {
        this.a.k().v(i, f);
    }

    @Override // defpackage.fgw
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void f(fgy fgyVar) {
        if (fgyVar != null) {
            fks fksVar = this.a;
            if (fksVar.a == null) {
                fksVar.a = new ArrayList();
            }
            fksVar.a.add(fgyVar);
        }
    }
}
