package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.aimatter.drishti.DrishtiCache;
import j$.util.Optional;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhg extends rhc implements rig, rhr {
    public static final rbm p = new rbm("rhg");
    public final rjb c;
    public final qug d;
    public final rht e;
    public final Optional f;
    public Optional g;
    public Optional h;
    public ListenableFuture i;
    public String j;
    public String n;
    public String o;
    private final qyy q;
    private final AtomicBoolean r;

    public rhg(rjc rjcVar, rjb rjbVar, qyy qyyVar, rfn rfnVar, DrishtiCache drishtiCache, Optional optional, Optional optional2, qua quaVar, rhh rhhVar, qug qugVar) {
        super(rjcVar);
        this.r = new AtomicBoolean(false);
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = aher.a;
        this.c = rjbVar;
        this.q = qyyVar;
        this.d = qugVar;
        this.f = optional2;
        rhp rhpVarH = rht.h();
        rhpVarH.d(rfnVar.a);
        rhpVarH.b(drishtiCache);
        rhpVarH.c(optional);
        rhpVarH.b = this;
        rhpVarH.c = optional2;
        rhpVarH.d = quaVar;
        rhpVarH.e = rhhVar;
        rhpVarH.h = rjbVar;
        rht rhtVarA = rhpVarH.a();
        this.e = rhtVarA;
        rhtVarA.b(new rgs(this, 2));
        rhtVarA.a = new rgt(this, 2);
    }

    @Override // defpackage.rhc, defpackage.rgr, java.lang.AutoCloseable
    public final void close() {
        if (this.r.getAndSet(true)) {
            rbc rbcVar = new rbc(p, rbd.c);
            rbcVar.a = new Exception();
            rbcVar.c();
            rbcVar.a("TransitionTextureProcessor calling close multiple times, ignoring.", new Object[0]);
            return;
        }
        synchronized (this) {
            super.close();
        }
        this.e.close();
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).i();
        }
    }

    @Override // defpackage.rhr
    public final void h(String str) {
        rbc rbcVar = new rbc(p, rbd.c);
        rbcVar.c();
        rbcVar.a("TransitionTextureProcessor onFrameError: %s", str);
        qug qugVar = this.d;
        if (qugVar == null || !this.g.isPresent()) {
            return;
        }
        tge tgeVarA = quk.a();
        tgeVarA.e = str;
        tgeVarA.c = new quj(((qvc) this.g.get()).c, 3);
        ((rdr) qugVar).D(tgeVarA.e());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qyy] */
    public final ListenableFuture i(Optional optional) {
        Optional optionalB;
        qyy qyyVar = this.q;
        qyyVar.getClass();
        sla slaVar = new sla(qyyVar, 1);
        if (true != optional.isPresent()) {
            optionalB = optional;
        } else {
            optionalB = slaVar.a.b((qvc) optional.get());
        }
        rjb rjbVar = this.c;
        return rjbVar.a(rjbVar.f((Collection) (true != optionalB.isPresent() ? optionalB : Optional.ofNullable(agke.q(optionalB.get()))).orElse(agpi.a), new gmf(this, optionalB, optional, 11)), Exception.class, new onn(this, 17));
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
        this.e.k(rfsVar);
    }

    @Override // defpackage.rhc
    public final void l(rfs rfsVar) {
        atwa atwaVar;
        rhf rhfVar = rfsVar.f;
        boolean z = false;
        rhf rhfVar2 = null;
        if (rhfVar != null) {
            if (rhf.class.isInstance(rhfVar)) {
                rhf rhfVar3 = rfsVar.f;
                rfsVar.f = null;
                rhfVar2 = rhfVar3;
            } else {
                rbc rbcVar = new rbc(rfs.g, rbd.a);
                rbcVar.c();
                rbcVar.a("Could not consume packet of type %s", "rhf");
            }
        }
        Optional optionalOfNullable = Optional.ofNullable(rhfVar2);
        rbj rbjVar = new rbj(this, 11);
        if (true == optionalOfNullable.isPresent()) {
            rhf rhfVar4 = (rhf) optionalOfNullable.get();
            rhg rhgVar = (rhg) rbjVar.a;
            if (rhgVar.j != null && rhgVar.n != null) {
                z = true;
            }
            ahno.F(z);
            rht rhtVar = rhgVar.e;
            rhtVar.q(rhgVar.j, rhfVar4.c);
            rhtVar.q(rhgVar.n, rhfVar4.d);
            String str = rhgVar.o;
            if (str != null && (atwaVar = rhfVar4.e) != null) {
                rhtVar.r(str, atwaVar);
            }
        }
        this.e.a(rfsVar);
    }

    @Override // defpackage.rig
    public final void m() {
        Optional optional = this.f;
        if (true == optional.isPresent()) {
            ((rbr) optional.get()).f(Optional.empty());
        }
    }
}
