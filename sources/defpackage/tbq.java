package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tbq implements Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tbq(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v47, types: [aecs, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        agkz agkzVarQ = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                tbr tbrVar = (tbr) this.a;
                tbt tbtVar = tbrVar.a;
                tbtVar.g.readLock().lock();
                try {
                    try {
                        agkzVarQ = tym.Q(tbtVar.c, tbrVar.b.getClass());
                    } catch (Exception e) {
                        ((agrc) ((agrc) ((agrc) tbt.a.b()).j(e)).k("com/google/android/libraries/youtube/common/eventbus/EventBus", "getHandlersForEvent", 577, "EventBus.java")).t("exception ");
                    }
                } finally {
                    tbtVar.g.readLock().unlock();
                }
                break;
            case 1:
                Context context = ((cc) this.a).getContext();
                return Integer.valueOf(context != null ? context.getResources().getDimensionPixelSize(R.dimen.bottom_bar_overlay_offset) : 0);
            case 2:
                tbr tbrVar2 = (tbr) this.a;
                tbt tbtVar2 = tbrVar2.a;
                tbtVar2.g.readLock().lock();
                Object obj = tbrVar2.b;
                try {
                    try {
                        Map map = tbtVar2.e;
                        map.getClass();
                        agkzVarQ = tym.Q(map, obj.getClass());
                    } catch (Exception e2) {
                        ((agrc) ((agrc) ((agrc) tbt.a.b()).j(e2)).k("com/google/android/libraries/youtube/common/eventbus/EventBus", "getBackgroundHandlersForEvent", 590, "EventBus.java")).t("exception ");
                    }
                } finally {
                    tbtVar2.g.readLock().unlock();
                }
                break;
            case 3:
                Object obj2 = this.a;
                vnr vnrVar = (vnr) obj2;
                vps vpsVar = vnrVar.c;
                abxu abxuVar = vnrVar.y;
                wnf wnfVar = vnrVar.a;
                xgn xgnVar = ((vmz) obj2).e;
                return vnrVar.w.b(xgnVar, wnfVar, abxuVar.q(wnfVar, xgnVar, (vnb) obj2), vnrVar, vpsVar);
            case 4:
                return ((jrc) ((aihf) this.a).instance).e;
            case 5:
                int i2 = zud.n;
                int iA = ((txl) this.a).A();
                if (iA > 32768) {
                    i = Alert.DURATION_SHOW_INDEFINITELY;
                } else if (iA > 16384) {
                    i = SemanticState.LiveRegion;
                } else if (iA > 4096) {
                    i = SemanticState.Hidden;
                }
                return Integer.valueOf(i);
            case 6:
                return Boolean.valueOf(((acdv) this.a).f());
            default:
                return this.a.e();
        }
        return agkzVarQ;
    }
}
