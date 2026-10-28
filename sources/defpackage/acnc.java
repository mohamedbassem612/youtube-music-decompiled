package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acnc implements avnj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ acnc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [awql, java.lang.Object] */
    @Override // defpackage.avnj
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                obj.getClass();
                obj2.getClass();
                obj3.getClass();
                return this.a.invoke(obj, obj2, obj3);
            }
            int iIntValue = ((Integer) obj).intValue() + ((Integer) obj2).intValue();
            if (((Integer) obj3).intValue() == 1) {
                iIntValue = Math.min(iIntValue, ((vua) this.a).c.c().bottom);
            }
            return Integer.valueOf(iIntValue);
        }
        Boolean bool = (Boolean) obj;
        vtl vtlVar = (vtl) obj2;
        boolean zBooleanValue = bool.booleanValue() ^ ((Boolean) obj3).booleanValue();
        Object obj4 = this.a;
        if (zBooleanValue) {
            acng acngVar = (acng) obj4;
            acngVar.c(0);
            acngVar.b(0);
            acngVar.d(0);
            return Boolean.FALSE;
        }
        acng acngVar2 = (acng) obj4;
        if (acngVar2.o.aM()) {
            acngVar2.l = bool.booleanValue();
            acngVar2.k = vtlVar;
        }
        if (bool.booleanValue()) {
            int i2 = vtlVar.a;
            acngVar2.h(i2);
            acngVar2.b(0);
            acngVar2.e(i2);
        } else {
            acngVar2.i(vtlVar.b);
            acngVar2.c(0);
        }
        return Boolean.TRUE;
    }
}
