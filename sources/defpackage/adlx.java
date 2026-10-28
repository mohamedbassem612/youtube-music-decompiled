package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adlx implements adlz {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public adlx(Context context, ajwd ajwdVar, int i) {
        this.$cid = i;
        this.b = ajwdVar;
        this.a = (WindowManager) context.getSystemService(WindowManager.class);
    }

    public static Object b(adly adlyVar, Class cls) {
        if (adlyVar != null) {
            Object objC = adlyVar.c("SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY");
            if (cls.isInstance(objC)) {
                return cls.cast(objC);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.WindowManager, java.lang.Object] */
    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        if (this.$cid == 0) {
            adlyVar.f((String) this.b, this.a);
            return;
        }
        Object objD = adkzVar.d(i);
        if (objD instanceof adla) {
            adla adlaVar = (adla) objD;
            int i2 = adlaVar.a;
            adlyVar.f("shelfItemWidthOverridePx", Integer.valueOf((((twm.e(this.a) - adlaVar.c) - adlaVar.d) - (adlaVar.e * (i2 - 1))) / i2));
            adlyVar.f("twoRowItemShouldHaveMatchParentWidth", Boolean.TRUE);
            adlyVar.f("collectionStyleItemSize", this.b);
        }
    }

    public adlx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";
    }
}
