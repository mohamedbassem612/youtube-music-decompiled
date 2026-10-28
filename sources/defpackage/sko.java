package defpackage;

import j$.util.Collection;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sko {
    public final String a;
    public final aixg b;
    public final int c;
    public final agke d;
    public final agke e;
    public final agke f;
    public final agke g;
    public final agke h;
    public final agke i;
    public final agke j;
    public final agke k;
    public final agkj l;
    public final agev m;
    public final agev n;
    public final shh o;
    public final agev p;
    private final agev q;
    private final agke r;
    private final agev s;

    public sko(String str, aixg aixgVar, int i, agke agkeVar, agke agkeVar2, agke agkeVar3, agke agkeVar4, agke agkeVar5, agke agkeVar6, agke agkeVar7, agke agkeVar8, agkj agkjVar, agev agevVar, agev agevVar2, agev agevVar3, shh shhVar, agke agkeVar9, agev agevVar4, agev agevVar5) {
        this.a = str;
        this.b = aixgVar;
        this.c = i;
        this.d = agkeVar;
        this.e = agkeVar2;
        this.f = agkeVar3;
        this.g = agkeVar4;
        this.h = agkeVar5;
        this.i = agkeVar6;
        this.j = agkeVar7;
        this.k = agkeVar8;
        this.l = agkjVar;
        this.m = agevVar;
        this.n = agevVar2;
        this.q = agevVar3;
        this.o = shhVar;
        this.r = agkeVar9;
        this.s = agevVar4;
        this.p = agevVar5;
    }

    public static skn a() {
        skn sknVar = new skn();
        agke agkeVar = agpi.a;
        sknVar.g(agkeVar);
        sknVar.i(agkeVar);
        sknVar.e(agkeVar);
        sknVar.k(agkeVar);
        sknVar.b = agpn.b;
        sknVar.f(agkeVar);
        sknVar.h(agkeVar);
        sknVar.d(agkeVar);
        sknVar.j(agkeVar);
        sknVar.p(agkeVar);
        return sknVar;
    }

    public final agke b() {
        agjz agjzVar = new agjz(4);
        agjzVar.j(this.e);
        agjzVar.j(this.g);
        agjzVar.j(this.i);
        agjzVar.j(this.k);
        return agjzVar.g();
    }

    public final agke c() {
        agjz agjzVar = new agjz(4);
        agjzVar.j(this.d);
        agjzVar.j(this.f);
        agjzVar.j(this.h);
        agjzVar.j(this.j);
        return agjzVar.g();
    }

    public final Object d(Class cls) {
        return this.o.d(cls);
    }

    public final boolean e(Class cls) {
        return this.o.e(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sko) {
            sko skoVar = (sko) obj;
            if (this.a.equals(skoVar.a) && this.b.equals(skoVar.b) && this.c == skoVar.c && aguu.v(this.d, skoVar.d) && aguu.v(this.e, skoVar.e) && aguu.v(this.f, skoVar.f) && aguu.v(this.g, skoVar.g) && aguu.v(this.h, skoVar.h) && aguu.v(this.i, skoVar.i) && aguu.v(this.j, skoVar.j) && aguu.v(this.k, skoVar.k) && aguu.q(this.l, skoVar.l) && this.m.equals(skoVar.m) && this.n.equals(skoVar.n) && this.q.equals(skoVar.q) && this.o.equals(skoVar.o) && aguu.v(this.r, skoVar.r) && this.s.equals(skoVar.s) && this.p.equals(skoVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(aixg aixgVar, Class... clsArr) {
        return aixgVar == this.b && Collection.EL.stream(Arrays.asList(clsArr)).allMatch(new sco(this, 8));
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    public final String toString() {
        return "Layout[layoutType=" + this.b.name() + ", managerLayer=" + this.c + ", layoutExitNormalTriggers=" + this.d + ", layoutExitSkipTriggers=" + this.f + ", layoutExitMuteTriggers=" + this.h + ", layoutExitUserCancelledTriggers=" + this.j + ", layoutExitNormalServerTriggers=" + this.e + ", layoutExitSkipServerTriggers=" + this.g + ", layoutExitMuteServerTriggers=" + this.i + ", layoutExitUserCancelledServerTriggers=" + this.k + ", clientMetadata=" + this.o + ", adLayoutLoggingData=" + this.m + ']';
    }

    public sko() {
        throw null;
    }
}
