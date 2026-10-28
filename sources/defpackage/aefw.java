package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefw implements aeem {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aihn a;
    final /* synthetic */ Object b;

    public aefw(Object obj, aihn aihnVar, int i) {
        this.$cid = i;
        this.a = aihnVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, vxe] */
    @Override // defpackage.aeem
    public final /* synthetic */ void a(Object obj, int i) {
        if (this.$cid != 0) {
            Object obj2 = this.b;
            ((abmc) obj2).f.kk(Boolean.FALSE);
            return;
        }
        aihn aihnVar = this.a;
        ajwo ajwoVar = null;
        if (i == 1) {
            aqof aqofVar = (aqof) aihnVar;
            aozn aoznVar = aqofVar.k;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            if ((aoznVar.b & 4) != 0) {
                aozn aoznVar2 = aqofVar.k;
                if (aoznVar2 == null) {
                    aoznVar2 = aozn.a;
                }
                ajwoVar = aoznVar2.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            }
        } else {
            aqof aqofVar2 = (aqof) aihnVar;
            aozn aoznVar3 = aqofVar2.k;
            if (aoznVar3 == null) {
                aoznVar3 = aozn.a;
            }
            if ((aoznVar3.b & 8) != 0) {
                aozn aoznVar4 = aqofVar2.k;
                if (aoznVar4 == null) {
                    aoznVar4 = aozn.a;
                }
                ajwoVar = aoznVar4.f;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
            }
            if ((aqofVar2.b & 65536) != 0) {
                Object obj3 = this.b;
                ajwo ajwoVar2 = aqofVar2.q;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                ((abhh) obj3).a.c(ajwoVar2, xhd.h(aihnVar, false));
            }
        }
        if (ajwoVar == null || i == 2) {
            return;
        }
        Object obj4 = this.b;
        ((abhh) obj4).a.c(ajwoVar, xhd.h(this.a, true));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xgm] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, vxe] */
    @Override // defpackage.aeem
    public final /* synthetic */ void b(Object obj) {
        if (this.$cid != 0) {
            Object obj2 = this.b;
            abmc abmcVar = (abmc) obj2;
            abmcVar.f.kk(Boolean.TRUE);
            arnj arnjVar = (arnj) this.a;
            abmcVar.g(arnjVar);
            abmcVar.b(arnjVar, true);
            abmcVar.h(3, arnjVar);
            abmcVar.h(23, arnjVar);
            return;
        }
        abhh abhhVar = (abhh) this.b;
        ?? r0 = abhhVar.b;
        aihn aihnVar = this.a;
        aqof aqofVar = (aqof) aihnVar;
        r0.hB().w(new xgj(aqofVar.p, (amud) null), null);
        if ((aqofVar.b & SemanticState.Hidden) != 0) {
            ?? r6 = abhhVar.a;
            aozn aoznVar = aqofVar.k;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            yno.eA(r6, aoznVar.d, xhd.h(aihnVar, false));
        }
    }
}
