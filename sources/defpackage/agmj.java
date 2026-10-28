package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agmj {
    boolean a;
    int b = -1;
    int c = -1;
    agmy d;
    agmy e;
    ageb f;

    final int a() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    final int b() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public final agmy c() {
        return (agmy) ahno.ad(this.d, agmy.a);
    }

    public final agmy d() {
        return (agmy) ahno.ad(this.e, agmy.a);
    }

    public final void e(ageb agebVar) {
        ageb agebVar2 = this.f;
        ahno.R(agebVar2 == null, "key equivalence was already set to %s", agebVar2);
        this.f = agebVar;
        this.a = true;
    }

    public final void f(agmy agmyVar) {
        agmy agmyVar2 = this.d;
        ahno.R(agmyVar2 == null, "Key strength was already set to %s", agmyVar2);
        this.d = agmyVar;
        if (agmyVar != agmy.a) {
            this.a = true;
        }
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        int i = this.b;
        if (i != -1) {
            ageuVarAc.e("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            ageuVarAc.e("concurrencyLevel", i2);
        }
        agmy agmyVar = this.d;
        if (agmyVar != null) {
            ageuVarAc.b("keyStrength", ahno.ae(agmyVar.toString()));
        }
        agmy agmyVar2 = this.e;
        if (agmyVar2 != null) {
            ageuVarAc.b("valueStrength", ahno.ae(agmyVar2.toString()));
        }
        if (this.f != null) {
            ageuVarAc.a("keyEquivalence");
        }
        return ageuVarAc.toString();
    }
}
