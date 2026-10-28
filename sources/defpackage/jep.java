package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jep implements adlz {
    private final /* synthetic */ int $cid;

    public jep(int i) {
        this.$cid = i;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        boolean z = true;
        if (this.$cid == 0) {
            if (i != adkzVar.a() - 1 && (i != adkzVar.a() - 2 || (!(adkzVar.d(adkzVar.a() - 1) instanceof advl) && !(adkzVar.d(adkzVar.a() - 1) instanceof ajnf)))) {
                z = false;
            }
            adlyVar.f("isLastMergedItem", Boolean.valueOf(z));
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= adkzVar.a()) {
                i2 = 0;
                break;
            } else if (!jeq.a.contains(adkzVar.d(i2).getClass())) {
                break;
            } else {
                i2++;
            }
        }
        adlyVar.f("isFirstItem", Boolean.valueOf(i <= i2));
    }
}
