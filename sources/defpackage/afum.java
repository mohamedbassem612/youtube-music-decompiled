package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afum implements afvl {
    public final afwz a;
    public final afvl b;
    public Thread c;
    public aftj d;
    private final afwy e;

    private afum(afwy afwyVar, afum afumVar, afvh afvhVar) {
        this.e = afwyVar;
        this.a = afumVar.a;
        this.b = afumVar;
        aftj aftjVar = afvhVar.e;
        if (aftjVar == null) {
            this.d = null;
            this.c = Thread.currentThread();
        } else {
            this.d = aftjVar;
            this.c = null;
        }
    }

    @Override // defpackage.afvl
    public final aftj a() {
        return this.d;
    }

    @Override // defpackage.afvl
    public final afvl b() {
        return this.b;
    }

    public final int c() {
        return this.e.h;
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        afty.j(this);
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.afvl
    public final String d() {
        return this.e.c;
    }

    @Override // defpackage.afvl
    public final String e() {
        return this.a.c;
    }

    @Override // defpackage.afvl
    public final Thread f() {
        return this.c;
    }

    @Override // defpackage.afvl
    public final UUID g() {
        return this.a.b;
    }

    @Override // defpackage.afvl
    public final afuy j() {
        afwy afwyVar = this.e;
        return afuy.e(afwyVar.g, afwyVar.b());
    }

    @Override // defpackage.afvl
    public final afuv k(aguu aguuVar) {
        return afuy.j(aguuVar, j());
    }

    @Override // defpackage.afvl
    public final long l() {
        return this.a.a() / 1000000;
    }

    @Override // defpackage.afvl
    public final afuy n() {
        throw null;
    }

    @Override // defpackage.afvl
    public final void o(boolean z) {
        long jA = this.a.a();
        afwy afwyVar = this.e;
        long j = jA - afwyVar.f;
        if (afwyVar.d()) {
            throw new IllegalStateException();
        }
        afwyVar.j = (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE | (j & 4611686018427387903L);
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    @Override // defpackage.afvl
    public final void p(int i) {
        this.e.k = i;
    }

    @Override // defpackage.afvl
    public final afvl q(String str, int i, afuy afuyVar, afvh afvhVar) {
        AtomicReference atomicReference;
        afwy afwyVar;
        boolean z;
        afwz afwzVar = this.a;
        afwy afwyVar2 = new afwy(this.e, str, i, afwzVar.a(), afuyVar);
        do {
            atomicReference = afwzVar.e;
            afwyVar = (afwy) atomicReference.get();
            z = true;
            int i2 = afwyVar.h + 1;
            if (i2 >= afwzVar.a.f) {
                afwyVar2.c(Integer.MIN_VALUE, null);
                synchronized (afwzVar) {
                    afwzVar.g++;
                }
                break;
            }
            afwyVar2.c(i2, afwyVar);
        } while (!a.av(atomicReference, afwyVar, afwyVar2));
        afum afumVar = new afum(afwyVar2, this, afvhVar);
        afvl afvlVar = afumVar.b;
        boolean z2 = afty.a;
        afvlVar.getClass();
        ahno.P((afumVar.c == null && afumVar.d == null) ? false : true, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        aftj aftjVar = afumVar.d;
        afum afumVar2 = (afum) afvlVar;
        if (aftjVar == null ? afumVar2.c != afumVar.c : aftjVar != afumVar2.d) {
            z = false;
        }
        afwyVar2.i = z;
        return afumVar;
    }

    @Override // defpackage.afvl
    public final void t(aguu aguuVar, Object obj) {
        afwy afwyVar;
        afwu afwuVar;
        afwv afwvVarA;
        afwv afwvVar = new afwv(aguuVar, obj);
        do {
            afwyVar = this.e;
            afwuVar = afwy.a;
            afwvVarA = afwuVar.a(afwyVar);
            if (afwvVarA != null) {
                afwvVar.b = afwvVarA;
            }
        } while (!afwuVar.b(afwyVar, afwvVarA, afwvVar));
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    public final String toString() {
        return afty.i(this);
    }

    @Override // defpackage.afvl
    public final void r() {
    }

    public afum(afwy afwyVar, afwz afwzVar, afvh afvhVar) {
        this.e = afwyVar;
        this.a = afwzVar;
        Thread threadCurrentThread = null;
        this.b = null;
        aftj aftjVar = afvhVar.e;
        if (aftjVar == null) {
            this.d = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.d = aftjVar;
        }
        this.c = threadCurrentThread;
    }
}
