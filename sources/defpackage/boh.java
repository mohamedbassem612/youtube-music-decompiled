package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class boh extends boc {
    public boolean b;
    public bob d;
    private int g;
    private boolean h;
    private final axaf i;
    private final ci j;
    private final boolean f = true;
    public trf e = new trf();
    public final List c = new ArrayList();

    public boh(bog bogVar) {
        this.j = new ci(bogVar);
        bob bobVar = bob.b;
        this.d = bobVar;
        this.i = axaw.a(bobVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Comparable, java.lang.Object] */
    private final bob g(bof bofVar) {
        ?? r2;
        Object obj;
        bnw bnwVar = (bnw) ((agu) this.e.a).a(bofVar);
        bnw bnwVar2 = bnwVar != null ? bnwVar.c : null;
        if (bnwVar2 == null || (obj = ((ahto) bnwVar2.a).c) == null) {
            r2 = obj;
            r2 = bob.e;
        }
        r2 = obj;
        bob bobVar = (bob) atqq.ac(this.c);
        if (bobVar == null) {
            bobVar = bob.e;
        }
        bob bobVar2 = this.d;
        bobVar2.getClass();
        r2.getClass();
        return (bob) atqq.h(bobVar2, atqq.h(r2, bobVar));
    }

    private final void h(bob bobVar) {
        if (this.d != bobVar) {
            bog bogVar = (bog) this.j.C();
            bob bobVar2 = this.d;
            if (bobVar2 == bob.b && bobVar == bob.a) {
                throw new IllegalStateException("State must be at least '" + bob.c + "' to be moved to '" + bobVar + "' in component " + bogVar);
            }
            bob bobVar3 = bob.a;
            if (bobVar2 == bobVar3 && bobVar2 != bobVar) {
                throw new IllegalStateException("State is '" + bobVar3 + "' and cannot be moved to `" + bobVar + "` in component " + bogVar);
            }
            this.d = bobVar;
            if (this.h || this.g != 0) {
                this.b = true;
                return;
            }
            this.h = true;
            i();
            this.h = false;
            if (this.d == bobVar3) {
                this.e = new trf();
            }
        }
    }

    private final void i() {
        Object objC = this.j.C();
        if (objC == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        bog bogVar = (bog) objC;
        while (this.e.d() != 0) {
            Object obj = ((ahto) ((bnw) this.e.e()).a).c;
            trf trfVar = this.e;
            Object obj2 = trfVar.b;
            if (obj2 == null) {
                throw new NoSuchElementException("Collection is empty.");
            }
            Object obj3 = ((ahto) ((bnw) obj2).a).c;
            if (obj == obj3 && this.d == obj3) {
                break;
            }
            this.b = false;
            if (this.d.compareTo((Enum) ((ahto) ((bnw) trfVar.e()).a).c) < 0) {
                trf trfVar2 = this.e;
                apm apmVar = new apm(this, bogVar, 2);
                Object obj4 = trfVar2.b;
                while (obj4 != null) {
                    bnw bnwVar = (bnw) obj4;
                    if (!bnwVar.d) {
                        apmVar.invoke(obj4);
                    }
                    obj4 = bnwVar.c;
                }
            }
            Object obj5 = this.e.b;
            Object obj6 = obj5 != null ? ((ahto) ((bnw) obj5).a).c : null;
            if (!this.b && obj6 != null && this.d.compareTo((Enum) obj6) > 0) {
                trf trfVar3 = this.e;
                eck eckVar = new eck(this, bogVar, 1);
                Object obj7 = trfVar3.c;
                while (obj7 != null) {
                    bnw bnwVar2 = (bnw) obj7;
                    if (!bnwVar2.d) {
                        eckVar.invoke(obj7);
                    }
                    obj7 = bnwVar2.b;
                }
            }
        }
        this.b = false;
        this.i.d(this.d);
    }

    @Override // defpackage.boc
    public final bob a() {
        return this.d;
    }

    @Override // defpackage.boc
    public final void b(bof bofVar) {
        Object obj;
        bog bogVar;
        bofVar.getClass();
        d("addObserver");
        bob bobVar = this.d;
        bob bobVar2 = bob.a;
        if (bobVar != bobVar2) {
            bobVar2 = bob.b;
        }
        ahto ahtoVar = new ahto(bofVar, bobVar2);
        trf trfVar = this.e;
        agu aguVar = (agu) trfVar.a;
        bnw bnwVar = (bnw) aguVar.a(bofVar);
        if (bnwVar != null) {
            obj = bnwVar.a;
        } else {
            bnw bnwVar2 = new bnw(bofVar, ahtoVar);
            aguVar.g(bofVar, bnwVar2);
            Object obj2 = trfVar.b;
            if (obj2 == null) {
                trfVar.c = bnwVar2;
            } else {
                bnw bnwVar3 = (bnw) obj2;
                bnwVar3.b = bnwVar2;
                bnwVar2.c = bnwVar3;
            }
            trfVar.b = bnwVar2;
            obj = null;
        }
        if (obj != null || (bogVar = (bog) this.j.C()) == null) {
            return;
        }
        boolean z = this.g != 0 || this.h;
        bob bobVarG = g(bofVar);
        this.g++;
        while (((bob) ahtoVar.c).compareTo(bobVarG) < 0 && this.e.f(bofVar)) {
            List list = this.c;
            list.add(ahtoVar.c);
            bnz bnzVar = boa.Companion;
            boa boaVarB = bnz.b((bob) ahtoVar.c);
            if (boaVarB == null) {
                Object obj3 = ahtoVar.c;
                Objects.toString(obj3);
                throw new IllegalStateException("no event up from ".concat(String.valueOf(obj3)));
            }
            ahtoVar.i(bogVar, boaVarB);
            atqq.aF(list);
            bobVarG = g(bofVar);
        }
        if (!z) {
            i();
        }
        this.g--;
    }

    @Override // defpackage.boc
    public final void c(bof bofVar) {
        bofVar.getClass();
        d("removeObserver");
        trf trfVar = this.e;
        bnw bnwVar = (bnw) ((agu) trfVar.a).f(bofVar);
        if (bnwVar != null) {
            bnw bnwVar2 = bnwVar.c;
            bnw bnwVar3 = bnwVar.b;
            if (bnwVar2 == null) {
                trfVar.c = bnwVar3;
            } else {
                bnwVar2.b = bnwVar3;
            }
            bnw bnwVar4 = bnwVar.b;
            if (bnwVar4 == null) {
                trfVar.b = bnwVar2;
            } else {
                bnwVar4.c = bnwVar2;
            }
            bnwVar.d = true;
        }
    }

    public final void d(String str) {
        if (this.f && !vq.q().r()) {
            throw new IllegalStateException(a.bT(str, "Method ", " must be called on the main thread"));
        }
    }

    public void e(boa boaVar) {
        boaVar.getClass();
        d("handleLifecycleEvent");
        drd drdVar = drd.d;
        drdVar.a("androidx.lifecycle");
        axjt axjtVar = axjt.a;
        try {
            h(boaVar.a());
            afxw.v(axjtVar);
        } catch (Throwable th) {
            try {
                wg.d(drdVar, th);
                throw new awmh();
            } catch (Throwable th2) {
                afxw.v(axjtVar);
                throw th2;
            }
        }
    }

    public final void f(bob bobVar) {
        bobVar.getClass();
        d("setCurrentState");
        h(bobVar);
    }
}
