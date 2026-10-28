package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adxm implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adxm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            wkf wkfVar = (wkf) obj;
            boolean z = wkfVar instanceof wrw;
            Object obj2 = this.a;
            if (z) {
                wrw wrwVar = (wrw) wkfVar;
                alap alapVar = ((asih) obj2).b;
                if (alapVar == null) {
                    alapVar = alap.a;
                }
                wrwVar.e(alapVar);
                return;
            }
            if (wkfVar instanceof woo) {
                woo wooVar = (woo) wkfVar;
                alap alapVar2 = ((asih) obj2).b;
                if (alapVar2 == null) {
                    alapVar2 = alap.a;
                }
                wooVar.e = alapVar2;
                return;
            }
            if (wkfVar instanceof wtm) {
                wtm wtmVar = (wtm) wkfVar;
                alap alapVar3 = ((asih) obj2).b;
                if (alapVar3 == null) {
                    alapVar3 = alap.a;
                }
                wtmVar.d = alapVar3;
                return;
            }
            return;
        }
        if (i == 1) {
            wkf wkfVar2 = (wkf) obj;
            asia asiaVar = (asia) this.a;
            if ((asiaVar.b & 2) == 0 || !(wkfVar2 instanceof woo)) {
                return;
            }
            woo wooVar2 = (woo) wkfVar2;
            alap alapVar4 = asiaVar.d;
            if (alapVar4 == null) {
                alapVar4 = alap.a;
            }
            wooVar2.e = alapVar4;
            return;
        }
        if (i != 2) {
            ((aehd) this.a).f((String) obj);
            return;
        }
        wkf wkfVar3 = (wkf) obj;
        boolean z2 = wkfVar3 instanceof wrw;
        Object obj3 = this.a;
        if (z2) {
            wrw wrwVar2 = (wrw) wkfVar3;
            alap alapVar5 = ((asij) obj3).c;
            if (alapVar5 == null) {
                alapVar5 = alap.a;
            }
            wrwVar2.e(alapVar5);
            return;
        }
        if (wkfVar3 instanceof woo) {
            woo wooVar3 = (woo) wkfVar3;
            alap alapVar6 = ((asij) obj3).c;
            if (alapVar6 == null) {
                alapVar6 = alap.a;
            }
            wooVar3.e = alapVar6;
        }
    }
}
