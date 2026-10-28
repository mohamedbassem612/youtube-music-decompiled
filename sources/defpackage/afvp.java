package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afvp implements cx {
    final /* synthetic */ afvq a;
    private afun b;
    private boolean c;

    public afvp(afvq afvqVar) {
        this.a = afvqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cx
    public final void b(cc ccVar, boolean z) {
        ccVar.getClass();
        if (z && this.b == null && !afty.o()) {
            boolean zP = afty.p();
            this.c = zP;
            if (!zP) {
                this.b = this.a.d("FragmentTransaction Popped", 203);
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (ccVar instanceof afvj)) {
            ((afvj) ccVar).setBackPressRef(afwn.b());
        }
    }

    @Override // defpackage.cx
    public final void c() {
        if (this.c) {
            this.c = false;
            afty.k();
            return;
        }
        afun afunVar = this.b;
        if (afunVar != null) {
            afunVar.close();
            this.b = null;
        }
    }

    @Override // defpackage.cx
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cx
    public final /* synthetic */ void hz() {
    }
}
