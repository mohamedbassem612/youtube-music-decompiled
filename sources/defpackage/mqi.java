package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqi implements nrw {
    private final aunn a;
    private final boolean b;
    private final avmb c;

    public mqi(aunn aunnVar, agev agevVar, avmb avmbVar) {
        this.a = aunnVar;
        this.b = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
        this.c = avmbVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asnz.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        avlb avqjVar;
        asnz asnzVar = (asnz) obj;
        nry nryVar = (nry) this.a.io();
        if (asnzVar.c.size() <= 0) {
            return avlb.e();
        }
        if (this.b) {
            avlh avlhVarB = avlh.B(asnzVar.c);
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            int i = avlh.a;
            avoj.a(iAvailableProcessors, "parallelism");
            avoj.a(i, "prefetch");
            awga awgaVar = new awga(avlhVarB, iAvailableProcessors, i);
            avnn avnnVar = atqp.q;
            avmb avmbVar = this.c;
            avmbVar.getClass();
            avoj.a(i, "prefetch");
            awgj awgjVar = new awgj(awgaVar, avmbVar, i);
            avnn avnnVar2 = atqp.q;
            hpn hpnVar = new hpn(nryVar, nrvVar, 3, null);
            avoj.a(i, "prefetch");
            awfx awfxVar = new awfx(awgjVar, hpnVar, i);
            avnn avnnVar3 = atqp.q;
            avoj.a(i, "prefetch");
            awge awgeVar = new awge(awfxVar, i);
            avnn avnnVar4 = atqp.j;
            avqjVar = new avuq(awgeVar);
            avnn avnnVar5 = atqp.p;
        } else {
            avqjVar = new avqj(avlh.B(asnzVar.c).H(new hpn(nryVar, nrvVar, 4, null)));
            avnn avnnVar6 = atqp.p;
        }
        return avqjVar;
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
