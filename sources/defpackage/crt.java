package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class crt implements ToIntFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ crt(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = crv.e;
                return ((duk) obj).c;
            case 1:
                int i2 = but.b;
                return ((bus) obj).L;
            case 2:
                agrf agrfVar = twm.a;
                ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    return ((WindowManager.LayoutParams) layoutParams).type;
                }
                return 0;
            case 3:
                return ((akks) obj).h;
            case 4:
                return ((akks) obj).f;
            case 5:
                return ((akks) obj).e;
            case 6:
                return ((akks) obj).g;
            default:
                return ((akks) obj).d;
        }
    }
}
