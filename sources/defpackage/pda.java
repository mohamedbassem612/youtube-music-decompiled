package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pda extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ pdb b;
    final /* synthetic */ plx c;
    final /* synthetic */ List d;
    final /* synthetic */ plb e;
    final /* synthetic */ pax f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pda(pdb pdbVar, plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pdbVar;
        this.c = plxVar;
        this.d = list;
        this.e = plbVar;
        this.f = paxVar;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new pda(this.b, this.c, this.d, this.e, this.f, this.g, this.h, awoqVar, 1, null) : new pda(this.b, this.c, this.d, this.e, this.f, this.g, this.h, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pda) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pda) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.$cid == 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                pdb pdbVar = this.b;
                pda pdaVar = new pda(pdbVar, this.c, this.d, this.e, this.f, this.g, this.h, null, 1, null);
                this.a = 1;
                if (awro.p(pdbVar.b, pdaVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i2 = this.a;
        atqp.j(obj);
        if (i2 == 0) {
            pdb pdbVar2 = this.b;
            plx plxVar = this.c;
            List list = this.d;
            plb plbVar = this.e;
            pax paxVar = this.f;
            boolean z = this.g;
            boolean z2 = this.h;
            this.a = 1;
            if (pcy.b(pdbVar2.a, plxVar, list, plbVar, paxVar, z, false, true, z2, this) == awoxVar2) {
                return awoxVar2;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pda(pdb pdbVar, plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pdbVar;
        this.c = plxVar;
        this.d = list;
        this.e = plbVar;
        this.f = paxVar;
        this.g = z;
        this.h = z2;
    }
}
