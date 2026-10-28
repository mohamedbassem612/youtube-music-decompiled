package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acab {
    public final arie a;
    public final mbc b;
    public final vyo c;
    public final avlh d;
    public final avlh e;
    public final avlh f;
    public final avlh g;
    public final avlh h;
    public final avlh i;
    public final avlh j;
    public final avlh k;
    public final avlh l;
    public final avlh m;
    public final avlh n;
    public final avlh o;
    public zgj p;
    public final avmm q = new avmm();
    public final adws r;
    private final zgm s;
    private final String t;
    private final boolean u;
    private final abmt v;

    public acab(mbc mbcVar, String str, abnl abnlVar, arie arieVar, boolean z, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, avlh avlhVar4, avlh avlhVar5, avlh avlhVar6, avlh avlhVar7, avlh avlhVar8, avlh avlhVar9, avlh avlhVar10, avlh avlhVar11, vyo vyoVar, zgm zgmVar, adws adwsVar, vxu vxuVar, avlh avlhVar12, abmt abmtVar) {
        this.b = mbcVar;
        this.t = str;
        this.a = arieVar;
        this.u = z;
        this.d = avlhVar;
        this.e = avlhVar2;
        this.f = avlhVar3;
        this.g = avlhVar4;
        this.h = avlhVar5;
        this.i = avlhVar6;
        this.l = avlhVar7;
        this.m = avlhVar8;
        this.k = avlhVar9;
        this.j = avlhVar10;
        this.n = avlhVar11;
        this.c = vyoVar;
        this.s = zgmVar;
        this.r = adwsVar;
        this.o = avlhVar12;
        this.v = abmtVar;
        if (abmt.co(vxuVar) && a(vyoVar).d) {
            this.p = zgmVar.a(str, abnlVar != null ? abnlVar.w() : null, arieVar, false, false);
        }
    }

    public static apbx a(vyo vyoVar) {
        if (vyoVar == null || vyoVar.b() == null) {
            return apbx.b;
        }
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        apbx apbxVar = anewVar.d;
        return apbxVar == null ? apbx.b : apbxVar;
    }

    public final void b(String str, wjf wjfVar, String str2, String str3) {
        acab acabVar;
        if (wjfVar != null) {
            acabVar = this;
            acabVar.c(wjfVar.G(), str2, this.a, wjfVar.g(), wjfVar.h().e, wjfVar.f(), wjfVar.Z());
        } else {
            acabVar = this;
            if (acabVar.p == null && str3 != null) {
                acabVar.p = acabVar.s.a(str2, str3, acabVar.a, false, false);
            }
        }
        zgj zgjVar = acabVar.p;
        if (zgjVar != null) {
            zgjVar.k(str);
        }
    }

    public final void c(String str, String str2, arie arieVar, wja wjaVar, wjm wjmVar, wiu wiuVar, boolean z) {
        zgj zgjVar = this.p;
        if (zgjVar != null) {
            if (zgjVar.t) {
                return;
            }
            zgjVar.f(wjmVar, str2, "", null, str, wjaVar, wiuVar, null, z);
            return;
        }
        zgm zgmVar = this.s;
        boolean z2 = this.u;
        boolean z3 = false;
        if (this.v.aL() && z) {
            z3 = true;
        }
        this.p = zgmVar.b(wjmVar, str2, arieVar, "", null, str, wjaVar, z2, wiuVar, null, z3);
    }

    public final boolean d(aboe aboeVar) {
        String str;
        String str2 = this.t;
        if (str2 != null) {
            return !this.v.aK() || (str = aboeVar.b) == null || str2.equals(str);
        }
        return false;
    }

    public final boolean e() {
        alik alikVarB;
        vyo vyoVar = this.c;
        if (vyoVar == null || (alikVarB = vyoVar.b()) == null) {
            return false;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        ajbv ajbvVar = anewVar.g;
        if (ajbvVar == null) {
            ajbvVar = ajbv.a;
        }
        return ajbvVar.i;
    }
}
