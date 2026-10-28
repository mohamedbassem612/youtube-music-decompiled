package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jod {
    public final awku a;
    public anid b;
    public boolean c;
    public boolean d;
    private final avmb e;
    private final avmb f;
    private final avmm g;
    private avmn h;

    public jod(abvn abvnVar, avmb avmbVar, avmb avmbVar2) {
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        this.a = new awku(Optional.empty());
        this.c = false;
        this.d = false;
        this.e = avmbVar;
        this.f = avmbVar2;
        int i = 5;
        avlh avlhVarH = abvnVar.P().N().x(new jna(i)).H(new igz(i));
        int i2 = 6;
        int i3 = 19;
        avmmVar.e(avlhVarH.x(new jna(i2)).H(new igz(i2)).H(new igz(7)).L(avmbVar2).al(new joc(this, 0), new ihp(i3)), ((avlh) abvnVar.r().a).H(new igz(8)).p().L(avmbVar2).al(new joc(this, 2), new ihp(i3)));
    }

    public static final String d(anid anidVar) {
        if (anidVar == null) {
            return "";
        }
        alay alayVar = anidVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return ackj.k(null, alayVar, null, false).toString();
    }

    public final avlh a() {
        return this.a.N();
    }

    public final void b() {
        avmn avmnVar = this.h;
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        avnr.b((AtomicReference) this.h);
    }

    public final void c() {
        b();
        anid anidVar = this.b;
        if (anidVar == null || (anidVar.b & 2) == 0) {
            return;
        }
        this.h = avlr.ac(anidVar.d, TimeUnit.MILLISECONDS, this.e).O(this.f).ag(new jgq(this, 7), new ihp(19));
    }
}
