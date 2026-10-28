package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ruf {
    public final awmd a;
    public final awmd b;
    public final vyo d;
    public sog e;
    public seq g;
    public final vxz h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private abwk m;
    public boolean f = false;
    public final Set c = new CopyOnWriteArraySet();
    private som l = som.a().a();

    public ruf(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, tbt tbtVar, vxz vxzVar, vyo vyoVar) {
        this.i = awmdVar;
        this.j = awmdVar2;
        this.a = awmdVar3;
        this.b = awmdVar4;
        this.k = awmdVar5;
        this.h = vxzVar;
        this.d = vyoVar;
        tbtVar.f(this);
        tbtVar.a(this, seq.class, new gla(this, 5));
    }

    private final boolean j() {
        return this.m != null;
    }

    public final void a(sof sofVar) {
        this.c.add(sofVar);
    }

    public final void b(sog sogVar) throws rso {
        if (this.e != null) {
            throw new rso("Tried to override existing listener", 71);
        }
        this.e = sogVar;
    }

    public final void c(seo seoVar) {
        this.h.m(36, 45754294L);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((sof) it.next()).t(seoVar);
        }
    }

    public final void d(sog sogVar) {
        sog sogVar2 = this.e;
        if (sogVar2 == null || Objects.equals(sogVar, sogVar2)) {
            this.e = null;
        } else {
            rmp.n(null, "Tried to remove unassociated listener");
        }
    }

    public final void e(som somVar) {
        this.l = somVar;
        if (j()) {
            abfx abfxVar = (abfx) this.m.b;
            abfxVar.g = somVar;
            if (abfxVar.c().f(1)) {
                spi spiVar = abfxVar.a;
                spiVar.f = abfxVar.f();
                spiVar.d(abfxVar.g.f, abfxVar.f());
            }
            if (abfxVar.f()) {
                abfy abfyVarC = abfxVar.c();
                if (abfyVarC.g()) {
                    abfyVarC.b();
                } else {
                    abfyVarC.e(28);
                    abfyVarC.d();
                }
            } else {
                abfxVar.b.d(Boolean.FALSE, false);
                abfy abfyVarC2 = abfxVar.c();
                tss tssVar = abfyVarC2.f;
                if (tssVar == null || tssVar.a()) {
                    abfyVarC2.b();
                } else {
                    abfyVarC2.e(20);
                    abfyVarC2.a(8);
                    abfyVarC2.d();
                }
            }
            abfxVar.d(1);
        }
    }

    public final abfx f() {
        abwk abwkVar = this.m;
        if (abwkVar == null) {
            return null;
        }
        return (abfx) abwkVar.b;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    public final void g() {
        if (!j()) {
            rmp.n(null, "Ignoring onAdClickthrough because adOverlay inaccessible");
            return;
        }
        abuz abuzVar = (abuz) this.i.io();
        Object obj = this.m.b;
        if (((vxu) ((ovo) abuzVar.b.io()).a.io()).b().i && obj == abuzVar.a) {
            return;
        }
        ((scj) this.k.io()).y();
        sog sogVar = this.e;
        if (sogVar != null) {
            sogVar.y();
        }
    }

    @tcc
    public void handleAdClickthroughEvent(sem semVar) {
        g();
    }

    @tcc
    public void handleMuteAdEndpoint(soe soeVar) {
        sog sogVar = this.e;
        if (sogVar != null) {
            sogVar.x();
        }
    }

    public final void i(abwk abwkVar) {
        abwk abwkVar2 = this.m;
        if (abwkVar2 != null) {
            abwkVar2.d = null;
        }
        this.m = abwkVar;
        if (afxw.e(this.d).cb) {
            this.f = abwkVar == null;
        }
        abwk abwkVar3 = this.m;
        if (abwkVar3 != null) {
            abwkVar3.d = this;
            e(this.l);
        }
        ((ruk) this.j.io()).b = abwkVar != null ? abwkVar.c : null;
    }

    public final void h() {
    }
}
