package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class affk implements affq {
    private final afpa a;

    public affk(afpa afpaVar) {
        this.a = afpaVar;
    }

    @Override // defpackage.affq
    public final Intent a() {
        return new Intent();
    }

    @Override // defpackage.affq
    public final rc b() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.affq
    public final rc c() {
        throw new UnsupportedOperationException("FragmentHosts cannot start Activities");
    }

    @Override // defpackage.affq
    public final boolean e() {
        return false;
    }

    @Override // defpackage.affq
    public final boolean f() {
        return false;
    }

    @Override // defpackage.affq
    public final boolean g() {
        return this.a.a().ad();
    }

    @Override // defpackage.affq
    public final void d(rb rbVar, rb rbVar2) {
    }
}
