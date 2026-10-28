package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuf extends afsx implements afto {
    static final aftm a = new aftn();
    public static final /* synthetic */ int b = 0;
    private final Exception c;
    private final boolean d;

    public afuf(UUID uuid, String str, Exception exc, boolean z, afvh afvhVar) {
        super("<missing root>", uuid, str, afvhVar);
        this.c = exc;
        this.d = z;
    }

    public static afuf m(afvh afvhVar) {
        UUID uuidB = aftz.a.b();
        String strKg = afsx.kg(uuidB);
        if (afvm.a == 1) {
            s();
            return new afuf(uuidB, strKg, a, false, afvhVar);
        }
        aftm aftmVar = new aftm();
        s();
        return new afuf(uuidB, strKg, aftmVar, afty.n(aftmVar), afvhVar);
    }

    public static void s() {
        agkz agkzVar = (agkz) afty.b.get();
        if (agkzVar.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(agkzVar, new aavj(11));
    }

    @Override // defpackage.afto
    public final afvl c(String str, afuy afuyVar, boolean z, afvh afvhVar) {
        if (z) {
            afty.r(true);
        }
        return new afug(str, this, afuyVar, z, afvhVar);
    }

    @Override // defpackage.afto
    public final Exception h() {
        return this.c;
    }

    @Override // defpackage.afto
    public final boolean i() {
        return this.d;
    }

    @Override // defpackage.afvl
    public final afuy j() {
        return afux.a;
    }

    @Override // defpackage.afvl
    public final afuv k(aguu aguuVar) {
        return afuv.d(2);
    }

    @Override // defpackage.afvl
    public final long l() {
        return -1L;
    }

    @Override // defpackage.afvl
    public final afuy n() {
        throw null;
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

    @Override // defpackage.afvl
    public final void t(aguu aguuVar, Object obj) {
    }
}
