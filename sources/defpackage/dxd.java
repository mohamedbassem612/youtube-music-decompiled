package defpackage;

import android.app.Activity;
import android.os.Build;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxd implements dxc {
    public final dyd b;

    public /* synthetic */ dxd() {
        this.b = Build.VERSION.SDK_INT >= 34 ? dye.a : dyf.a;
        new ArrayList(new awnl(new Integer[]{1, 2, 4, 8, 16, 32, 64, Integer.valueOf(SemanticState.Focused)}, true));
    }

    @Override // defpackage.dxc
    public final dwz a(Activity activity) {
        activity.getClass();
        return azw.r().a(activity, this.b);
    }
}
