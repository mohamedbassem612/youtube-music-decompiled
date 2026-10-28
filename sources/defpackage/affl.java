package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class affl implements affq {
    private final cc a;
    private final agev b;
    private rc c;
    private rc d;
    private final Intent e;
    private final boolean f;
    private final boolean g;
    private final afpa h;

    public affl(cc ccVar, afpa afpaVar, agev agevVar) {
        this.a = ccVar;
        this.h = afpaVar;
        this.b = agevVar;
        this.e = (Intent) agevVar.a(new aeqk(new actf(6), 2)).d(new ytj(15));
        this.f = ((Boolean) agevVar.a(new aeqk(new actf(7), 3)).d(new ytj(16))).booleanValue();
        ((Boolean) agevVar.a(new aeqk(new actf(8), 4)).d(new ytj(17))).booleanValue();
        this.g = afpaVar.a().ad();
    }

    @Override // defpackage.affq
    public final Intent a() {
        return this.e;
    }

    @Override // defpackage.affq
    public final rc b() {
        if (!this.b.g()) {
            throw new UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        rc rcVar = this.d;
        if (rcVar != null) {
            return rcVar;
        }
        awrc.b("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.affq
    public final rc c() {
        if (!this.b.g()) {
            throw new UnsupportedOperationException("@ScreenFragment in FragmentHost cannot start Activities");
        }
        rc rcVar = this.c;
        if (rcVar != null) {
            return rcVar;
        }
        awrc.b("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.affq
    public final void d(rb rbVar, rb rbVar2) {
        if (this.b.g()) {
            cc ccVar = this.a;
            this.c = ccVar.registerForActivityResult(new rr(), rbVar);
            this.d = ccVar.registerForActivityResult(new rr(), rbVar2);
        }
    }

    @Override // defpackage.affq
    public final boolean e() {
        return this.b.g();
    }

    @Override // defpackage.affq
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.affq
    public final boolean g() {
        return this.g;
    }
}
