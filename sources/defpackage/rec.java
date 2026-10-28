package defpackage;

import android.util.Size;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rec implements reo, rid {
    public final req c;
    public Duration d;
    public Size e;
    public qxj f;
    public int g;
    public reo h;
    public reo i;
    public Runnable j;
    reb k;
    private final int n;
    public static final rbm l = new rbm("rec");
    private static final Duration m = Duration.ofMillis(500);
    public static final Duration a = Duration.ofMillis(50);
    public static final Duration b = ahbt.b(1);

    public rec(qxj qxjVar, int i, req reqVar) {
        this.f = qxjVar;
        this.g = i;
        this.c = reqVar;
        rdr rdrVar = (rdr) reqVar;
        this.e = rdrVar.s;
        this.d = qxjVar.b();
        this.n = Math.min(rdrVar.q.f, 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        reb rebVar = this.k;
        if (rebVar != null) {
            rebVar.close();
            this.k = null;
        }
        reo reoVar = this.h;
        if (reoVar != null) {
            reoVar.close();
            this.h = null;
        }
        reo reoVar2 = this.i;
        if (reoVar2 != null) {
            reoVar2.close();
            this.i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(Duration duration) {
        int i;
        reb rebVar;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        rec recVar = this;
        duration.getClass();
        Duration duration2 = recVar.d;
        req reqVar = recVar.c;
        if (aext.i(duration2.minus(((rdr) reqVar).q.e ? m : Duration.ZERO), duration)) {
            duration.getClass();
            if (aext.l(recVar.d.plus(recVar.f.c), duration)) {
                if (recVar.k == null) {
                    try {
                        new rbc(l, rbd.a).a("Renderer going live at %s", duration);
                        rhg rhgVar = new rhg(reqVar.t(), ((rdr) reqVar).y, ((rdr) reqVar).u, ((rdr) reqVar).v, ((rdr) reqVar).H, reqVar.j(), reqVar.M(), ((rdr) reqVar).q.a, reqVar.r(), reqVar);
                        rhe rheVar = new rhe();
                        int i5 = rgm.c;
                        rgk rgkVar = new rgk();
                        rgkVar.a = recVar.n;
                        rgkVar.b(rhgVar);
                        rgkVar.b(rheVar);
                        rgkVar.c = ((rdr) reqVar).q.a.c;
                        rgkVar.d = ((rdr) reqVar).q.a;
                        rgm rgmVarA = rgkVar.a();
                        rgmVarA.g = recVar.j;
                        rih rihVar = new rih(((rdr) reqVar).q.b, recVar.f.c, 1);
                        rihVar.b = rhgVar;
                        rihVar.c((Duration) afyd.e(duration.minus(recVar.d), Duration.ZERO));
                        try {
                            z2 = true;
                            i4 = 2;
                            i3 = 0;
                            try {
                                rie rieVar = new rie(((rdr) reqVar).l, recVar.f.b, rihVar, reqVar.t(), recVar, ((rdr) reqVar).q.a, reqVar);
                                try {
                                    rgmVarA.i(rieVar);
                                    rieVar.e.e(new rhz(rieVar, ((rdr) reqVar).v, 2));
                                    recVar = this;
                                    try {
                                        reb rebVar2 = new reb(recVar, rieVar, rgmVarA, rhgVar, rheVar);
                                        rebVar2.b(recVar.f, recVar.g, ((rdr) reqVar).s);
                                        recVar.k = rebVar2;
                                        z = i3;
                                    } catch (RuntimeException e) {
                                        e = e;
                                        rbc rbcVar = new rbc(l, rbd.e);
                                        rbcVar.a = e;
                                        rbcVar.c();
                                        rbcVar.a("Failed to create the LiveRenderer.", new Object[i3]);
                                        req reqVar2 = recVar.c;
                                        tge tgeVarA = quk.a();
                                        tgeVarA.b = e;
                                        tgeVarA.c = new quj(recVar.f.b, i4);
                                        ((rdr) reqVar2).D(tgeVarA.e());
                                        i2 = i3;
                                        return i2;
                                    }
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    recVar = this;
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                recVar = recVar;
                            }
                        } catch (RuntimeException e4) {
                            e = e4;
                            i4 = 2;
                            i3 = 0;
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                        i3 = 0;
                        i4 = 2;
                    }
                } else {
                    z = 0;
                    z2 = true;
                }
                duration.getClass();
                if (aext.i(recVar.d.minus(a), duration)) {
                    reb rebVar3 = recVar.k;
                    rebVar3.getClass();
                    if (!rebVar3.c) {
                        rie rieVar2 = rebVar3.a;
                        synchronized (rieVar2.b) {
                            ahno.P((rieVar2.o == null || rieVar2.r == 0) ? z : z2, "Calling start before configuring the source.");
                            rieVar2.k = z2;
                            rieVar2.l = z;
                        }
                        rebVar3.c = z2;
                    }
                }
                duration.getClass();
                return aext.i(recVar.d, duration);
            }
            i = 0;
            rebVar = recVar.k;
            i2 = i;
            if (rebVar != null) {
                try {
                    rebVar.close();
                } catch (Exception e6) {
                    rbc rbcVar2 = new rbc(l, rbd.e);
                    rbcVar2.a = e6;
                    rbcVar2.c();
                    rbcVar2.a("Failed to close the LiveRenderer.", new Object[0]);
                }
                recVar.k = null;
                i2 = i;
            }
        } else {
            i = 0;
            rebVar = recVar.k;
            i2 = i;
            if (rebVar != null) {
                rebVar.close();
                recVar.k = null;
                i2 = i;
            }
        }
        return i2;
    }

    @Override // defpackage.rer
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ren iw(Duration duration) {
        if (e(duration)) {
            reb rebVar = this.k;
            rebVar.getClass();
            rgm rgmVar = rebVar.b;
            ren renVarH = rgmVar.h(duration);
            if (renVarH.b()) {
                return renVarH;
            }
            return rgmVar.g() ? ren.c : ren.a;
        }
        Optional optionalOfNullable = Optional.ofNullable(this.i);
        hlx hlxVar = new hlx(duration, 16);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iw((Duration) hlxVar.a));
        }
        ren renVar = ren.c;
        ren renVar2 = (ren) optionalOfNullable.orElse(renVar);
        Optional optionalOfNullable2 = Optional.ofNullable(this.h);
        hlx hlxVar2 = new hlx(duration, 17);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iw((Duration) hlxVar2.a));
        }
        ren renVar3 = (ren) optionalOfNullable2.orElse(renVar);
        rel relVar = renVar2.d;
        rel relVar2 = rel.d;
        if (!relVar.equals(relVar2)) {
            return renVar2;
        }
        if (!renVar3.d.equals(relVar2)) {
            return renVar3;
        }
        duration.getClass();
        return aext.l(this.d, duration) ? renVar : ren.b;
    }

    @Override // defpackage.reo
    public final Duration ix() {
        Optional optionalOfNullable = Optional.ofNullable(this.h);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).ix());
        }
        Duration duration = (Duration) optionalOfNullable.orElse(Duration.ZERO);
        Optional optionalOfNullable2 = Optional.ofNullable(this.i);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).ix());
        }
        return (Duration) afyd.e(duration, (Duration) optionalOfNullable2.orElse(Duration.ZERO));
    }

    @Override // defpackage.reo
    public final Duration iy() {
        Optional optionalOfNullable = Optional.ofNullable(this.h);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((reo) optionalOfNullable.get()).iy());
        }
        Duration duration = (Duration) optionalOfNullable.orElse(Duration.ZERO);
        Optional optionalOfNullable2 = Optional.ofNullable(this.i);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(((reo) optionalOfNullable2.get()).iy());
        }
        return (Duration) afyd.f(duration, (Duration) optionalOfNullable2.orElse(Duration.ZERO));
    }

    @Override // defpackage.reo
    public final void iz(Duration duration) {
        reo reoVar = this.h;
        if (reoVar != null) {
            reoVar.iz(duration);
        }
        reo reoVar2 = this.i;
        if (reoVar2 != null) {
            reoVar2.iz(duration);
        }
        e(duration);
        reb rebVar = this.k;
        if (rebVar != null) {
            rebVar.a();
            rebVar.b.d();
            duration.getClass();
            if (aext.l(rebVar.d.d.minus(a), duration)) {
                rie rieVar = rebVar.a;
                Object obj = rieVar.b;
                Duration duration2 = Duration.ZERO;
                synchronized (obj) {
                    rieVar.d.c(duration2);
                }
                return;
            }
            rie rieVar2 = rebVar.a;
            Comparable comparableE = afyd.e(duration.minus(rebVar.d.d), Duration.ZERO);
            synchronized (rieVar2.b) {
                rieVar2.d.c((Duration) comparableE);
                rieVar2.l = false;
            }
            rebVar.c = true;
        }
    }
}
