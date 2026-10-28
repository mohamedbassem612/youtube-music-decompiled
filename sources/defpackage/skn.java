package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class skn {
    public aixg a;
    public agkj b;
    public shh c;
    private String d;
    private int e;
    private agke f;
    private agke g;
    private agke h;
    private agke i;
    private agke j;
    private agke k;
    private agke l;
    private agke m;
    private agev n;
    private agev o;
    private final agev p;
    private agke q;
    private agev r;
    private agev s;
    private byte t;

    public skn() {
        agdf agdfVar = agdf.a;
        this.n = agdfVar;
        this.o = agdfVar;
        this.p = agdfVar;
        this.r = agdfVar;
        this.s = agdfVar;
    }

    public final sko a() {
        String str;
        aixg aixgVar;
        agke agkeVar;
        agke agkeVar2;
        agke agkeVar3;
        agke agkeVar4;
        agke agkeVar5;
        agke agkeVar6;
        agke agkeVar7;
        agke agkeVar8;
        agkj agkjVar;
        shh shhVar;
        agke agkeVar9;
        if (this.t == 1 && (str = this.d) != null && (aixgVar = this.a) != null && (agkeVar = this.f) != null && (agkeVar2 = this.g) != null && (agkeVar3 = this.h) != null && (agkeVar4 = this.i) != null && (agkeVar5 = this.j) != null && (agkeVar6 = this.k) != null && (agkeVar7 = this.l) != null && (agkeVar8 = this.m) != null && (agkjVar = this.b) != null && (shhVar = this.c) != null && (agkeVar9 = this.q) != null) {
            return new sko(str, aixgVar, this.e, agkeVar, agkeVar2, agkeVar3, agkeVar4, agkeVar5, agkeVar6, agkeVar7, agkeVar8, agkjVar, this.n, this.o, this.p, shhVar, agkeVar9, this.r, this.s);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" layoutId");
        }
        if (this.a == null) {
            sb.append(" layoutType");
        }
        if (this.t == 0) {
            sb.append(" managerLayer");
        }
        if (this.f == null) {
            sb.append(" layoutExitNormalTriggers");
        }
        if (this.g == null) {
            sb.append(" layoutExitNormalServerTriggers");
        }
        if (this.h == null) {
            sb.append(" layoutExitSkipTriggers");
        }
        if (this.i == null) {
            sb.append(" layoutExitSkipServerTriggers");
        }
        if (this.j == null) {
            sb.append(" layoutExitMuteTriggers");
        }
        if (this.k == null) {
            sb.append(" layoutExitMuteServerTriggers");
        }
        if (this.l == null) {
            sb.append(" layoutExitUserCancelledTriggers");
        }
        if (this.m == null) {
            sb.append(" layoutExitUserCancelledServerTriggers");
        }
        if (this.b == null) {
            sb.append(" layoutPingDispatchTriggerBindings");
        }
        if (this.c == null) {
            sb.append(" clientMetadata");
        }
        if (this.q == null) {
            sb.append(" subLayouts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aiua aiuaVar) {
        this.n = agev.i(aiuaVar);
    }

    public final void c(amco amcoVar) {
        this.o = agev.i(amcoVar);
    }

    public final void d(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitMuteServerTriggers");
        }
        this.k = agkeVar;
    }

    public final void e(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitMuteTriggers");
        }
        this.j = agkeVar;
    }

    public final void f(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitNormalServerTriggers");
        }
        this.g = agkeVar;
    }

    public final void g(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitNormalTriggers");
        }
        this.f = agkeVar;
    }

    public final void h(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitSkipServerTriggers");
        }
        this.i = agkeVar;
    }

    public final void i(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitSkipTriggers");
        }
        this.h = agkeVar;
    }

    public final void j(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitUserCancelledServerTriggers");
        }
        this.m = agkeVar;
    }

    public final void k(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null layoutExitUserCancelledTriggers");
        }
        this.l = agkeVar;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null layoutId");
        }
        this.d = str;
    }

    public final void m(int i) {
        this.e = i;
        this.t = (byte) 1;
    }

    public final void n(sml smlVar) {
        this.r = agev.i(smlVar);
    }

    public final void o(apji apjiVar) {
        this.s = agev.i(apjiVar);
    }

    public final void p(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null subLayouts");
        }
        this.q = agkeVar;
    }
}
