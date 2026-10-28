package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adwu implements adlz {
    private final /* synthetic */ int $cid;
    private final Object a;

    public adwu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            adlyVar.f("sectionListController", this.a);
            return;
        }
        Object obj = this.a;
        if (i2 != 1) {
            adlyVar.f("SortFilterSubMenuContextDecoratorKey", obj);
        } else {
            adlyVar.f("sectionController", obj);
        }
    }
}
