package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cwo implements cvz {
    final /* synthetic */ cwq a;
    private final long b;

    public cwo(cwq cwqVar, long j) {
        this.a = cwqVar;
        this.b = j;
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.b;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        cwq cwqVar = this.a;
        cvx cvxVarB = cwqVar.a[0].b(j);
        int i = 1;
        while (true) {
            cwt[] cwtVarArr = cwqVar.a;
            if (i >= cwtVarArr.length) {
                return cvxVarB;
            }
            cvx cvxVarB2 = cwtVarArr[i].b(j);
            if (cvxVarB2.a.c < cvxVarB.a.c) {
                cvxVarB = cvxVarB2;
            }
            i++;
        }
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }
}
