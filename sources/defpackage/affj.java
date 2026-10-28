package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affj implements affq {
    private final cf a;
    private rc b;
    private rc c;

    public affj(cf cfVar) {
        this.a = cfVar;
    }

    @Override // defpackage.affq
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.affq
    public final rc b() {
        rc rcVar = this.c;
        if (rcVar != null) {
            return rcVar;
        }
        awrc.b("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.affq
    public final rc c() {
        rc rcVar = this.b;
        if (rcVar != null) {
            return rcVar;
        }
        awrc.b("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.affq
    public final void d(rb rbVar, rb rbVar2) {
        rr rrVar = new rr();
        cf cfVar = this.a;
        this.b = cfVar.registerForActivityResult(rrVar, rbVar);
        this.c = cfVar.registerForActivityResult(new rr(), rbVar2);
    }

    @Override // defpackage.affq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.affq
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.affq
    public final boolean g() {
        return this.a.getSupportFragmentManager().ad();
    }
}
