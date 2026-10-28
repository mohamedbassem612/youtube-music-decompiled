package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zkd {
    private Optional A;
    private String B;
    public final tpq a;
    public arfb b;
    public arfb c;
    public ajhj d;
    public boolean e;
    public volatile arfb f;
    public volatile arfb g;
    public volatile ajhj h;
    public volatile boolean i;
    public volatile boolean j;
    public final tqj k;
    public final vxz l;
    public final vxz m;
    private final avlh n;
    private final vyo o;
    private final avmm p;
    private final zju q;
    private final AtomicBoolean r;
    private final avmb s;
    private final Object t = new Object();
    private final Object u = new Object();
    private final Map v;
    private final Map w;
    private boolean x;
    private volatile boolean y;
    private final boolean z;

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public zkd(tpq tpqVar, avlh avlhVar, vyo vyoVar, zju zjuVar, avmb avmbVar, vxz vxzVar, vxz vxzVar2, tqj tqjVar) {
        boolean z;
        this.l = vxzVar;
        this.s = avmbVar;
        this.a = tpqVar;
        this.q = zjuVar;
        this.n = avlhVar;
        this.o = vyoVar;
        this.k = tqjVar;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830319)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.z = z;
        this.j = false;
        arfb arfbVar = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
        this.c = arfbVar;
        this.b = arfbVar;
        ajhj ajhjVar = ajhj.AUDIO_QUALITY_SETTING_UNKNOWN;
        this.d = ajhjVar;
        this.g = arfbVar;
        this.f = arfbVar;
        this.h = ajhjVar;
        this.m = vxzVar2;
        this.v = new zka();
        this.w = new zkb();
        this.e = false;
        this.i = false;
        this.x = false;
        this.y = false;
        this.p = new avmm();
        this.A = Optional.empty();
        this.r = new AtomicBoolean(false);
    }

    private final void r() {
        boolean zU = u();
        avmm avmmVar = this.p;
        if (!zU) {
            if (avmmVar.a() != 0) {
                synchronized (this) {
                    avmm avmmVar2 = this.p;
                    if (avmmVar2.a() != 0) {
                        avmmVar2.b();
                    }
                }
                return;
            }
            return;
        }
        if (avmmVar.a() == 0) {
            synchronized (this) {
                avmm avmmVar3 = this.p;
                if (avmmVar3.a() == 0) {
                    avlh avlhVarX = this.a.d().P().x(new wsh(this, 5));
                    avmb avmbVar = this.s;
                    int i = 3;
                    avmmVar3.c(avlhVarX.L(avmbVar).ak(new zgd(this, i)));
                    avmmVar3.c(this.n.P().x(new yqz(i)).L(avmbVar).ak(new zgd(this, 4)));
                }
            }
        }
    }

    private final void s() {
        boolean z = c().b;
        this.x = z;
        this.y = z;
    }

    private final boolean t() {
        return this.z ? this.i : this.e;
    }

    private final boolean u() {
        return this.z ? this.y : this.x;
    }

    private final boolean v() {
        if (this.r.getAndSet(true)) {
            return false;
        }
        boolean z = this.q.b;
        this.e = z;
        this.i = z;
        s();
        r();
        taf.j(this.a.b(new xwd(this, 8)), new xwk(15));
        return true;
    }

    public final ajhj a(String str) {
        ajhj ajhjVar;
        if (!this.m.l(26, 45680910L, false)) {
            return ajhj.AUDIO_QUALITY_SETTING_UNKNOWN;
        }
        if (str != null) {
            synchronized (this.u) {
                ajhjVar = (ajhj) this.w.get(str);
            }
            if (ajhjVar != null) {
                return ajhjVar;
            }
        }
        return b();
    }

    public final ajhj b() {
        return this.z ? this.h : this.d;
    }

    public final anfe c() {
        alik alikVarB = this.o.b();
        if (alikVarB == null) {
            return anfe.a;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        anfe anfeVar = anewVar.h;
        return anfeVar == null ? anfe.a : anfeVar;
    }

    public final arfb d() {
        return this.z ? this.g : this.c;
    }

    public final arfb e() {
        return this.z ? this.f : this.b;
    }

    public final arfb f(String str) {
        arfb arfbVarA;
        arfb arfbVar;
        if (!m()) {
            return arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        if (str != null) {
            synchronized (this.t) {
                arfbVar = (arfb) this.v.get(str);
            }
            if (arfbVar != null) {
                return arfbVar;
            }
        }
        if (!this.j) {
            tqj tqjVar = this.k;
            arfb arfbVar2 = null;
            if (tqjVar != null) {
                int i = tqr.a;
                boolean zK = tqjVar.k(1073830305);
                boolean z = true;
                boolean z2 = (tqjVar.a(1074093018) & 2) != 0;
                if (zK) {
                    z = z2;
                } else if (z2) {
                }
                if (tqjVar.k(88480)) {
                    arfbVarA = arfb.a(t() ? tqjVar.a(219546) : tqjVar.a(219549));
                } else if (z) {
                    arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                arfbVar2 = arfbVarA;
            }
            if (arfbVar2 != null) {
                return arfbVar2;
            }
        }
        return t() ? e() : d();
    }

    public final void g() {
        this.A = Optional.empty();
    }

    public final void h(Consumer consumer, String str, boolean z) {
        if (!v()) {
            s();
            r();
        }
        this.B = str;
        this.A = Optional.of(consumer);
        if (!z) {
            j(str, f(str));
            ajhj ajhjVarA = a(str);
            if (str != null) {
                synchronized (this.u) {
                    this.w.put(str, ajhjVarA);
                }
            }
        }
        k();
    }

    public final void i(final int i, final int i2, final long j, final String str, final agkz agkzVar) {
        final boolean zK = wgs.K(i);
        taf.j(this.a.b(new agek() { // from class: zjz
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                aihf builder = ((atpl) obj).toBuilder();
                String str2 = str;
                if (str2 == null) {
                    builder.copyOnWrite();
                    atpl atplVar = (atpl) builder.instance;
                    atplVar.b &= -9;
                    atplVar.g = atpl.a.g;
                } else {
                    builder.copyOnWrite();
                    atpl atplVar2 = (atpl) builder.instance;
                    atplVar2.b |= 8;
                    atplVar2.g = str2;
                }
                long j2 = j;
                int i3 = i2;
                int i4 = i;
                zkd zkdVar = this.a;
                aihf aihfVarCreateBuilder = atpj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                atpj atpjVar = (atpj) aihfVarCreateBuilder.instance;
                atpjVar.b |= 1;
                atpjVar.c = i4;
                aihfVarCreateBuilder.copyOnWrite();
                atpj atpjVar2 = (atpj) aihfVarCreateBuilder.instance;
                atpjVar2.b |= 2;
                atpjVar2.d = i3;
                aihfVarCreateBuilder.copyOnWrite();
                atpj atpjVar3 = (atpj) aihfVarCreateBuilder.instance;
                atpjVar3.b |= 4;
                atpjVar3.e = j2;
                if (zkdVar.m.m(6, 45399743L)) {
                    agkz agkzVar2 = agkzVar;
                    if (!agkzVar2.isEmpty()) {
                        aihfVarCreateBuilder.copyOnWrite();
                        atpj atpjVar4 = (atpj) aihfVarCreateBuilder.instance;
                        aihv aihvVar = atpjVar4.f;
                        if (!aihvVar.c()) {
                            atpjVar4.f = aihn.mutableCopy(aihvVar);
                        }
                        aifs.addAll(agkzVar2, atpjVar4.f);
                    }
                }
                if (zK) {
                    builder.copyOnWrite();
                    atpl atplVar3 = (atpl) builder.instance;
                    atpj atpjVar5 = (atpj) aihfVarCreateBuilder.build();
                    atpjVar5.getClass();
                    atplVar3.o = atpjVar5;
                    atplVar3.b |= SemanticState.Modal;
                } else {
                    builder.copyOnWrite();
                    atpl atplVar4 = (atpl) builder.instance;
                    atpj atpjVar6 = (atpj) aihfVarCreateBuilder.build();
                    atpjVar6.getClass();
                    atplVar4.p = atpjVar6;
                    atplVar4.b |= SemanticState.Obscured;
                }
                return (atpl) builder.build();
            }
        }), new xwk(13));
    }

    public final void j(String str, arfb arfbVar) {
        if (str != null) {
            synchronized (this.t) {
                this.v.put(str, arfbVar);
            }
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.function.Consumer] */
    public final void k() {
        if (u()) {
            arfb arfbVarF = f(this.B);
            Optional optional = this.A;
            yyk yykVar = new yyk(arfbVarF, 3);
            if (true == optional.isPresent()) {
                optional.get().r(yykVar.a);
            }
        }
    }

    public final boolean l() {
        return this.m.l(26, 45680910L, false);
    }

    public final boolean m() {
        v();
        return u();
    }

    public final zkc n(int i) {
        return new zkc((atpl) this.a.c(), i, this.m);
    }
}
