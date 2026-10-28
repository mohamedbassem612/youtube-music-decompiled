package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abpy implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abpy(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                abqc abqcVar = (abqc) this.b;
                abqcVar.k = (wjf) obj;
                if (!abqcVar.f.bg()) {
                    abqcVar.h = false;
                }
                if (!this.a) {
                    abqcVar.e();
                }
                break;
            case 1:
                boolean z = this.a;
                Object obj2 = this.b;
                if (z) {
                    hia hiaVar = (hia) obj2;
                    if (hiaVar.x == null || hiaVar.x.isDone()) {
                        hiaVar.o(hhz.c);
                    } else {
                        hiaVar.x.addListener(new hgx(obj2, 2), hiaVar.p);
                    }
                }
                hia hiaVar2 = (hia) obj2;
                hiaVar2.C.b();
                hiaVar2.n();
                break;
            case 2:
                boolean z2 = this.a;
                ((abqc) this.b).d(z2, (Throwable) obj);
                break;
            case 3:
                abqc abqcVar2 = (abqc) this.b;
                abqcVar2.i = (wgi) obj;
                abqcVar2.k(this.a);
                break;
            case 4:
                boolean z3 = this.a;
                ((abqc) this.b).f(z3, (Throwable) obj);
                break;
            case 5:
                abqc abqcVar3 = (abqc) this.b;
                abqcVar3.k = (wjf) obj;
                if (!abqcVar3.f.bg()) {
                    abqcVar3.h = false;
                }
                if (!this.a) {
                    abqcVar3.e();
                }
                break;
            case 6:
                abqc abqcVar4 = (abqc) this.b;
                abqcVar4.i = (wgi) obj;
                abqcVar4.k(this.a);
                break;
            default:
                boolean z4 = this.a;
                ((abqc) this.b).f(z4, (Throwable) obj);
                break;
        }
    }
}
