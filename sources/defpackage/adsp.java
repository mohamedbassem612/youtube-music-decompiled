package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adsp implements admb {
    public final advo a;
    public advl b;
    public final advo c;
    public advl d;
    public boolean e = false;
    public final /* synthetic */ adsr f;

    public adsp(adsr adsrVar, advo advoVar, advo advoVar2) {
        this.f = adsrVar;
        this.a = advoVar;
        this.c = advoVar2;
    }

    private final advl i(adtt adttVar) {
        adsr adsrVar = this.f;
        return new advl(adttVar, adsrVar.as, adsrVar, adsrVar);
    }

    private final void j() {
        advo advoVar = this.c;
        if (advoVar != null) {
            this.d = null;
            this.f.j.q(advoVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [acjx, java.lang.Object] */
    private static final boolean k(adtt adttVar, acjw acjwVar) {
        acjx acjxVar;
        if (adttVar instanceof adtk) {
            if (((adtk) adttVar).a == acjwVar) {
                return true;
            }
        } else if (adttVar instanceof adts) {
            agev agevVar = ((adts) adttVar).b;
            if (agevVar.g() && agevVar.c().a() == acjwVar) {
                return true;
            }
        } else if ((adttVar instanceof adtr) && (acjxVar = ((adtr) adttVar).b) != null && acjxVar.a() == acjwVar) {
            return true;
        }
        return false;
    }

    @Override // defpackage.admb
    public final void a(adma admaVar, Object obj) {
        Executor executor;
        Executor executor2;
        adsr adsrVar = this.f;
        vxz vxzVar = adsrVar.aa;
        boolean z = false;
        if (vxzVar != null && vxzVar.l(87, 45818906L, false)) {
            z = true;
        }
        if (obj == this.b) {
            if (!z || (executor2 = adsrVar.C) == null) {
                adsrVar.aq();
                return;
            } else {
                executor2.execute(new acqu(this, 11));
                return;
            }
        }
        advl advlVar = this.d;
        if (obj != advlVar || advlVar == null) {
            return;
        }
        if (!z || (executor = adsrVar.C) == null) {
            adsrVar.X();
        } else {
            executor.execute(new acqu(adsrVar, 12));
        }
    }

    public final void b(acjx acjxVar) {
        advo advoVar = this.a;
        if (advoVar != null) {
            adsr adsrVar = this.f;
            anin aninVar = adsrVar.s.b().g;
            if (aninVar == null) {
                aninVar = anin.a;
            }
            boolean z = aninVar.d;
            advl advlVar = this.b;
            boolean z2 = !z ? !(advlVar != null || adsrVar.o(acjw.b) || (adsrVar.n.isEmpty() && adsrVar.o(acjw.d))) : !(advlVar != null || (acjxVar != null ? acjxVar.a() == acjw.b : adsrVar.o(acjw.b)) || (adsrVar.n.isEmpty() && (acjxVar != null ? acjxVar.a() == acjw.d : adsrVar.o(acjw.d))));
            adlq adlqVar = adsrVar.j;
            if (z2 != (adlqVar.i(advoVar) != -1)) {
                if (!z2) {
                    adlqVar.q(advoVar);
                    return;
                }
                adlqVar.m(adsrVar.y(), advoVar, true);
                if (adsrVar.o(acjw.b)) {
                    advl advlVarI = this.b;
                    if (advlVarI == null) {
                        advlVarI = i(adts.a);
                        this.b = advlVarI;
                    }
                    e(advlVarI.a);
                }
            }
        }
    }

    public final void c() {
        advo advoVar;
        int i;
        if (!this.e || (advoVar = this.c) == null) {
            return;
        }
        adsr adsrVar = this.f;
        boolean zO = adsrVar.o(acjw.c);
        boolean z = this.d != null || zO;
        adlq adlqVar = adsrVar.j;
        int i2 = -1;
        if (z != (adlqVar.i(advoVar) != -1)) {
            if (!z) {
                adlqVar.q(advoVar);
                return;
            }
            advo advoVar2 = adsrVar.t.c;
            if (advoVar2 == null || (i = adlqVar.i(advoVar2)) == -1) {
                adkz adkzVar = adsrVar.M;
                if (adkzVar != null) {
                    i2 = adlqVar.i(adkzVar);
                }
            } else {
                i2 = i;
            }
            adlqVar.m(i2, advoVar, true);
            if (zO) {
                advl advlVarI = this.d;
                if (advlVarI == null) {
                    advlVarI = i(adts.a);
                    this.d = advlVarI;
                }
                f((adtt) Optional.ofNullable(advlVarI.a).orElse(adts.a));
            }
        }
    }

    public final void d() {
        advo advoVar = this.a;
        if (advoVar != null) {
            this.b = null;
            this.f.j.q(advoVar);
        }
    }

    public final void e(adtt adttVar) {
        advo advoVar = this.a;
        if (advoVar != null) {
            if (adttVar instanceof adts) {
                adsr adsrVar = this.f;
                if (!adsrVar.am((adts) adttVar)) {
                    advoVar.b(null);
                    if (adsrVar.j.i(advoVar) != -1) {
                        d();
                        return;
                    }
                    return;
                }
            }
            advl advlVar = this.b;
            if (advlVar == null) {
                this.b = i(adttVar);
            } else if (advlVar.a != adttVar) {
                this.b = advlVar.a(adttVar);
            }
            if (!(adttVar instanceof adtk)) {
                advoVar.b(this.b);
                return;
            }
            adsr adsrVar2 = this.f;
            if (!adsrVar2.o(acjw.b)) {
                advoVar.b(null);
                if (adsrVar2.j.i(advoVar) != -1) {
                    d();
                    return;
                }
                return;
            }
            advl advlVar2 = this.b;
            adts adtsVar = adts.a;
            advl advlVarA = advlVar2.a(adtsVar);
            this.b = advlVarA;
            advoVar.b(advlVarA);
            adlq adlqVar = adsrVar2.j;
            if (adlqVar.i(advoVar) == -1) {
                if (this.b == null) {
                    advl advlVarI = i(adtsVar);
                    this.b = advlVarI;
                    advoVar.b(advlVarI);
                }
                adlqVar.m(adsrVar2.y(), advoVar, true);
            }
        }
    }

    public final void f(adtt adttVar) {
        advo advoVar = this.c;
        if (advoVar != null) {
            advl advlVarA = this.d;
            if (advlVarA == null) {
                advlVarA = i(adttVar);
            } else if (advlVarA.a != adttVar) {
                advlVarA = advlVarA.a(adttVar);
            }
            this.d = advlVarA;
            if (!(adttVar instanceof adtk)) {
                advoVar.b(advlVarA);
                return;
            }
            adsr adsrVar = this.f;
            if (!adsrVar.o(acjw.c)) {
                advoVar.b(null);
                if (adsrVar.j.i(advoVar) != -1) {
                    j();
                    return;
                }
                return;
            }
            adts adtsVar = adts.a;
            advl advlVarA2 = advlVarA.a(adtsVar);
            this.d = advlVarA2;
            advoVar.b(advlVarA2);
            adlq adlqVar = adsrVar.j;
            if (adlqVar.i(advoVar) == -1) {
                if (this.d == null) {
                    advl advlVarI = i(adtsVar);
                    this.d = advlVarI;
                    advoVar.b(advlVarI);
                }
                advo advoVar2 = adsrVar.t.c;
                int i = advoVar2 != null ? adlqVar.i(advoVar2) : -1;
                adkz adkzVar = adsrVar.M;
                int i2 = adkzVar != null ? adlqVar.i(adkzVar) : 0;
                if (i == -1) {
                    i = i2;
                }
                adlqVar.m(i, advoVar, true);
            }
        }
    }

    public final void g(Object obj, Object obj2) {
        h();
        adsr adsrVar = this.f;
        if (obj == null) {
            adsrVar.r.f(this);
            return;
        }
        tbt tbtVar = adsrVar.r;
        tbtVar.h(this, obj);
        if (obj2 == null || obj2 == obj) {
            return;
        }
        tbtVar.h(this, obj2);
    }

    public final void h() {
        this.f.r.l(this);
    }

    @tcc
    void handleContentEvent(adtk adtkVar) {
        this.f.Z();
        if (this.c == null || !k(adtkVar, acjw.c)) {
            e(adtkVar);
        }
        if (k(adtkVar, acjw.b)) {
            return;
        }
        f(adtkVar);
    }

    @tcc
    void handleErrorEvent(adtr adtrVar) {
        this.f.Z();
        if (this.c == null || !k(adtrVar, acjw.c)) {
            e(adtrVar);
        } else {
            f(adtrVar);
        }
    }

    @tcc
    void handleLoadingEvent(adts adtsVar) {
        adtsVar.a();
        if (this.f.am(adtsVar)) {
            if (this.c == null || !k(adtsVar, acjw.c)) {
                e(adtsVar);
            } else if (this.e) {
                f(adtsVar);
            } else {
                j();
            }
        }
    }
}
