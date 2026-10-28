package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afug extends aftp implements afto {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public afug(String str, afto aftoVar, afuy afuyVar, boolean z, afvh afvhVar) {
        super("<missing root>:".concat(String.valueOf(str)), aftoVar, afuy.e(afuyVar, afux.b), afvhVar);
        this.b = aftoVar.h();
        this.a = aftoVar.i();
        this.c = z;
    }

    public static void m() {
        agkz agkzVar = (agkz) afty.b.get();
        if (agkzVar.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(agkzVar, new aavj(12));
    }

    @Override // defpackage.afto
    public final afvl c(String str, afuy afuyVar, boolean z, afvh afvhVar) {
        boolean z2 = true;
        if (z && !this.c) {
            afty.r(true);
        }
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new afug(str, this, afuyVar, z2, afvhVar);
    }

    @Override // defpackage.afto
    public final Exception h() {
        return this.b;
    }

    @Override // defpackage.afto
    public final boolean i() {
        return this.a;
    }

    @Override // defpackage.aftp, defpackage.afvl
    public final afuv k(aguu aguuVar) {
        afuv afuvVarK = super.k(aguuVar);
        return afuvVarK.c() == 3 ? afuv.d(2) : afuvVarK;
    }

    @Override // defpackage.afvl
    public final long l() {
        return -1L;
    }

    @Override // defpackage.afvl
    public final afuy n() {
        return afux.a;
    }

    @Override // defpackage.afvl
    public final afvl q(String str, int i, afuy afuyVar, afvh afvhVar) {
        afty.r(true);
        return c(str, afuyVar, true, afvhVar);
    }

    @Override // defpackage.afvl
    public final void r() {
    }

    @Override // defpackage.afvl
    public final void o(boolean z) {
    }

    @Override // defpackage.afvl
    public final void p(int i) {
    }

    public afug(UUID uuid, String str, String str2, afuy afuyVar, Exception exc, boolean z, boolean z2, afvh afvhVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, afuy.e(afuyVar, afux.b), afvhVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
    }

    @Override // defpackage.afvl
    public final void t(aguu aguuVar, Object obj) {
    }
}
