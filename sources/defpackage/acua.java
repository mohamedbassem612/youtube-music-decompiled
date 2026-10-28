package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acua implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public acua(Object obj, boolean z, Object obj2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = obj2;
        this.c = obj;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.$cid == 0 || !this.a) {
            return;
        }
        ((ooe) ((agfa) ((zpw) this.c).l).a).h((String) this.b);
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        Long lValueOf;
        if (this.$cid != 0) {
            return;
        }
        acuc acucVar = (acuc) this.c;
        wjf wjfVar = (wjf) obj;
        if (acucVar.g.bg() && !this.a && !wjfVar.N()) {
            acucVar.b.e((ajwo) this.b, wjfVar, 0L);
        }
        aoqd aoqdVar = wjfVar.u().e;
        if (aoqdVar == null) {
            aoqdVar = aoqd.a;
        }
        aopd aopdVar = aoqdVar.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        Long lValueOf2 = null;
        if ((aopdVar.b & SemanticState.Hidden) != 0) {
            aoqd aoqdVar2 = wjfVar.u().e;
            if (aoqdVar2 == null) {
                aoqdVar2 = aoqd.a;
            }
            aopd aopdVar2 = aoqdVar2.h;
            if (aopdVar2 == null) {
                aopdVar2 = aopd.a;
            }
            arev arevVar = aopdVar2.g;
            if (arevVar == null) {
                arevVar = arev.a;
            }
            lValueOf = Long.valueOf(arevVar.c);
        } else {
            lValueOf = null;
        }
        aoqd aoqdVar3 = wjfVar.u().e;
        if (aoqdVar3 == null) {
            aoqdVar3 = aoqd.a;
        }
        aoor aoorVar = aoqdVar3.i;
        if (aoorVar == null) {
            aoorVar = aoor.a;
        }
        if ((aoorVar.b & 8) != 0) {
            aoqd aoqdVar4 = wjfVar.u().e;
            if (aoqdVar4 == null) {
                aoqdVar4 = aoqd.a;
            }
            aoor aoorVar2 = aoqdVar4.i;
            if (aoorVar2 == null) {
                aoorVar2 = aoor.a;
            }
            arev arevVar2 = aoorVar2.c;
            if (arevVar2 == null) {
                arevVar2 = arev.a;
            }
            lValueOf2 = Long.valueOf(arevVar2.c);
        }
        if (lValueOf == null && lValueOf2 == null) {
            return;
        }
        acucVar.f.o().R(lValueOf, lValueOf2);
    }
}
