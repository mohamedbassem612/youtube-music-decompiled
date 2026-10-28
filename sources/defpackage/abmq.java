package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmq implements abml {
    public final abwj a;
    public final abmo c;
    public final adet d;
    public final dxu e;
    private final aunn f;
    private final abmt g;
    private final abpj h;
    private final abwp i;
    public final HashMap b = new HashMap();
    private agke j = agpi.a;
    private acip k = null;

    public abmq(aunn aunnVar, abwj abwjVar, abmt abmtVar, abpj abpjVar, abwp abwpVar, adet adetVar, abmo abmoVar, dxu dxuVar) {
        this.f = aunnVar;
        this.a = abwjVar;
        this.g = abmtVar;
        this.h = abpjVar;
        this.i = abwpVar;
        this.d = adetVar;
        this.c = abmoVar;
        this.e = dxuVar;
    }

    private final Optional j(acex acexVar) {
        return Collection.EL.stream(this.j).filter(new aajl(acexVar, 17)).findFirst();
    }

    @Override // defpackage.abml
    public final ListenableFuture a(abnt abntVar, abnl abnlVar, abnp abnpVar) {
        ListenableFuture listenableFutureF = ((abos) this.f.io()).a(abnlVar).f(abnlVar, abntVar, abnpVar.b, abnpVar);
        return listenableFutureF == null ? ahng.m(new IllegalStateException("Failed to prefetch player response")) : listenableFutureF;
    }

    @Override // defpackage.abml
    @Deprecated
    public final ListenableFuture b(abnt abntVar, abnl abnlVar, abnp abnpVar, absr absrVar, abmj abmjVar) {
        f();
        return this.c.b(abntVar, abnlVar, abnpVar, absrVar, abmjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [acey, java.lang.Object] */
    @Override // defpackage.abml
    public final synchronized void c(agke agkeVar) {
        agke agkeVarG;
        f();
        acip acipVar = this.k;
        if (acipVar != null) {
            this.j = agkeVar;
            wjf wjfVarF = acipVar.f();
            agjz agjzVar = new agjz(4);
            int size = agkeVar.size();
            int i = 0;
            while (i < size) {
                abmk abmkVar = (abmk) agkeVar.get(i);
                wjf wjfVar = abmkVar.a.c;
                abmt abmtVar = this.g;
                if ((rmp.t(wjfVar, abmtVar.ba()) && !abmtVar.B()) || wjfVarF == null || (rmp.s(wjfVarF) && !abmtVar.A())) {
                    break;
                }
                agjzVar.h(abmkVar);
                i++;
                wjfVarF = wjfVar;
            }
            abwp abwpVar = this.i;
            agke agkeVar2 = (agke) Collection.EL.stream(agjzVar.g()).map(new aalr(18)).collect(aghu.a);
            abwk abwkVar = abwpVar.a;
            synchronized (abwkVar) {
                try {
                    ?? r3 = abwkVar.d;
                    if (r3 == 0 || (abwpVar.e.O() && r3.am())) {
                        agkeVarG = agpi.a;
                    } else {
                        agjz agjzVar2 = new agjz(4);
                        agqs agqsVarListIterator = agkeVar2.listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                            acex acexVar = (acex) agqsVarListIterator.next();
                            if (!aaje.q(acexVar.c.t())) {
                                break;
                            } else {
                                agjzVar2.h(acexVar);
                            }
                        }
                        agkeVarG = agjzVar2.g();
                        r3.N(agkeVarG);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.clear();
            for (int i2 = 0; i2 < ((agpi) agkeVarG).d; i2++) {
                acex acexVar2 = (acex) agkeVarG.get(i2);
                Optional optionalO = acexVar2.a.o();
                acog acogVar = new acog(this, acexVar2, 1);
                if (true == optionalO.isPresent()) {
                    Object obj = optionalO.get();
                    Object obj2 = acogVar.a;
                    ((abmq) obj2).b.put((String) obj, acogVar.b);
                }
            }
        }
    }

    @Override // defpackage.abml
    public final boolean d() {
        return !this.b.isEmpty() || this.c.d();
    }

    @Override // defpackage.abml
    @Deprecated
    public final boolean e(abnl abnlVar, abnp abnpVar, wjf wjfVar, abmj abmjVar) {
        f();
        return this.c.e(abnlVar, abnpVar, wjfVar, abmjVar);
    }

    public final synchronized void f() {
        g(true);
    }

    public final synchronized void g(boolean z) {
        this.j = agpi.a;
        this.b.clear();
        if (z) {
            this.c.f();
        }
    }

    public final synchronized void h(aazq aazqVar) {
        acip acipVar = aazqVar.b;
        this.k = acipVar;
        String strAu = acipVar.au();
        HashMap map = this.b;
        Optional optionalOfNullable = Optional.ofNullable((acex) map.remove(strAu));
        int i = 0;
        if (optionalOfNullable.isEmpty()) {
            g(false);
            return;
        }
        abnl abnlVarN = acipVar.n();
        abnp abnpVarO = acipVar.o();
        if (this.a.l && abnlVarN != null) {
            Optional optionalJ = j((acex) optionalOfNullable.get());
            if (!optionalJ.isEmpty()) {
                abnlVarN = ((abmk) optionalJ.get()).b.a(abnlVarN);
            }
        }
        abpj abpjVar = this.h;
        abpjVar.o(abnlVarN, abnpVarO, acipVar.f());
        if (abnlVarN == null || abnlVarN.O()) {
            abpjVar.u(acipVar.au(), new abmp(this, 0));
        }
        Optional optionalJ2 = j((acex) optionalOfNullable.get());
        if (!optionalJ2.isEmpty()) {
            abmk abmkVar = (abmk) optionalJ2.get();
            abmkVar.b.b(abmkVar.a.a);
            agke agkeVar = this.j;
            int size = agkeVar.size();
            while (i < size) {
                abmk abmkVar2 = (abmk) agkeVar.get(i);
                Optional optionalO = abmkVar2.a.a.o();
                yyk yykVar = new yyk(map, 18);
                if (true == optionalO.isPresent()) {
                    Object obj = optionalO.get();
                    ((HashMap) yykVar.a).remove((String) obj);
                }
                i++;
                if (Objects.equals(abmkVar2, abmkVar)) {
                    break;
                }
            }
        }
    }

    public final synchronized void i(aazs aazsVar) {
        this.b.remove(aazsVar.a());
    }
}
