package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pci extends awpk implements awqg {
    int a;
    final /* synthetic */ pcm b;
    final /* synthetic */ plx c;
    final /* synthetic */ List d;
    final /* synthetic */ plb e;
    final /* synthetic */ pax f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pci(pcm pcmVar, plx plxVar, List list, plb plbVar, pax paxVar, boolean z, boolean z2, boolean z3, awoq awoqVar) {
        super(1, awoqVar);
        this.b = pcmVar;
        this.c = plxVar;
        this.d = list;
        this.e = plbVar;
        this.f = paxVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pci(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pci) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            pcm pcmVar = this.b;
            plx plxVar = this.c;
            List list = this.d;
            plb plbVar = this.e;
            pax paxVar = this.f;
            boolean z = this.g;
            boolean z2 = this.h;
            boolean z3 = this.i;
            this.a = 1;
            if (pcmVar.h(plxVar, list, plbVar, paxVar, z, z2, z3, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
