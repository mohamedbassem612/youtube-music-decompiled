package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kdw implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kdw(Context context, int i, int i2) {
        this.$cid = i2;
        this.c = context;
        this.b = "com.google.android.libraries.youtube.mdx.mediaroute.providerservice.MdxMediaRouteProviderService";
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bvs, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            Map map = ((kdx) obj).d;
            int i2 = this.a;
            Object obj2 = this.c;
            synchronized (map) {
                ((kdx) obj).o((did) obj2, i2);
            }
            return;
        }
        if (i == 1) {
            for (bvu bvuVar : (CopyOnWriteArraySet) this.b) {
                if (!bvuVar.c) {
                    int i3 = this.a;
                    if (i3 != -1) {
                        bvuVar.d.i(i3);
                    }
                    ?? r3 = this.c;
                    bvuVar.b = true;
                    r3.a(bvuVar.a);
                }
            }
            return;
        }
        if (i == 2) {
            Context context = (Context) this.c;
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context.getPackageName(), (String) this.b), this.a, 1);
        } else if (i != 3) {
            ((BottomSheetBehavior) this.b).L((View) this.c, this.a, false);
        } else {
            Context context2 = (Context) this.c;
            context2.getPackageManager().setComponentEnabledSetting(new ComponentName(context2, (Class<?>) this.b), this.a, 1);
        }
    }

    public kdw(Context context, Class cls, int i, int i2) {
        this.$cid = i2;
        this.c = context;
        this.b = cls;
        this.a = i;
    }

    public kdw(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.$cid = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    public /* synthetic */ kdw(CopyOnWriteArraySet copyOnWriteArraySet, int i, bvs bvsVar, int i2) {
        this.$cid = i2;
        this.b = copyOnWriteArraySet;
        this.a = i;
        this.c = bvsVar;
    }

    public /* synthetic */ kdw(kdx kdxVar, did didVar, int i, int i2) {
        this.$cid = i2;
        this.b = kdxVar;
        this.c = didVar;
        this.a = i;
    }
}
