package defpackage;

import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ablf implements ablg {
    public final abmt a;
    public String b;
    public boolean f;
    public abnx i;
    public acjb c = null;
    public acip d = null;
    public abyv e = null;
    public acga j = null;
    public final Map g = new HashMap();
    private avmm k = new avmm();
    public volatile ConcurrentHashMap h = new ConcurrentHashMap();

    public ablf(abmt abmtVar) {
        this.a = abmtVar;
    }

    @Override // defpackage.ablg
    public final void a() {
        c();
        this.k.dispose();
    }

    @Override // defpackage.ablg
    public final void b(avlh avlhVar) {
        avmm avmmVar = new avmm();
        this.k = avmmVar;
        int i = 1;
        avmmVar.c(avlhVar.i(new abwr(i)).ak(new abhb(this, 10)));
        this.k.c(avlhVar.p().X(new abld(0)).ak(new abhb(this, 11)));
        int i2 = 8;
        this.k.c(avlhVar.p().W(new vvb(new abhg(4), 7)).i(new abwr(i)).ak(new abhb(this, i2)));
        this.k.c(avlhVar.p().W(new vvb(new abhg(3), i2)).ak(new abhb(this, 9)));
    }

    public final void c() {
        this.i = null;
        this.f = false;
    }

    public final boolean d(String str) {
        return str != null && str.equals(this.b);
    }

    @Override // defpackage.ablg
    public final boolean e(long j) {
        return Collection.EL.stream(this.h.values()).anyMatch(new uqr(j, 7));
    }

    public final void f(String str, String str2, long j, boolean z, boolean z2) {
        wjf wjfVar;
        wjf wjfVar2;
        acjb acjbVar = this.c;
        acjd acjdVarC = acjbVar != null ? acjbVar.c(str) : null;
        aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
        acjd acjdVarC2 = acjbVar != null ? acjbVar.c(str2) : null;
        aciw aciwVar2 = acjdVarC2 instanceof aciw ? (aciw) acjdVarC2 : null;
        if (aciwVar == null || aciwVar2 == null || (wjfVar = aciwVar.i) == null || (wjfVar2 = aciwVar2.i) == null) {
            return;
        }
        String strG = wjfVar2.G();
        long jLongValue = -1;
        if (!d(str)) {
            Map map = this.g;
            if (map.containsKey(str)) {
                jLongValue = ((Long) map.get(str)).longValue();
            }
        }
        aaza aazaVar = new aaza(str, str2, strG, this.b, j, jLongValue, z, z2, false, wjfVar);
        acip acipVar = this.d;
        if (acipVar != null) {
            acipVar.ba().kk(aazaVar);
        }
        abyv abyvVar = this.e;
        if (abyvVar != null) {
            String str3 = aazaVar.a;
            if (!aazaVar.g) {
                if (!d(str3)) {
                    abyvVar.f = true;
                    return;
                } else {
                    if (abyvVar.f) {
                        abyvVar.l();
                        abyvVar.f = false;
                        return;
                    }
                    return;
                }
            }
            if (d(str3)) {
                abyvVar.f = true;
                abyvVar.k(aazaVar.e, str3, aazaVar.j, 0);
            } else {
                if (d(str3) || !abyvVar.f) {
                    return;
                }
                abyvVar.f = false;
            }
        }
    }
}
