package defpackage;

import android.app.Activity;
import android.app.Dialog;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wwe implements wwa {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public wwe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.wwa
    public final void a() {
        if (this.$cid == 0) {
            wwf wwfVar = (wwf) this.a;
            wwfVar.e = null;
            wwfVar.c(0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.wwa
    public final void b() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            wwf wwfVar = (wwf) obj;
            wwfVar.a.a(wwfVar.c);
            ScheduledFuture scheduledFuture = wwfVar.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                return;
            }
            return;
        }
        aaok aaokVar = (aaok) obj;
        ?? r0 = aaokVar.a;
        r0.clear();
        Object obj2 = aaokVar.b;
        Activity activity = (Activity) obj2;
        List<cc> listK = null;
        if (!activity.isFinishing() && !activity.isDestroyed() && (obj2 instanceof cf)) {
            listK = ((cf) obj2).getSupportFragmentManager().k();
        }
        if (listK != null) {
            for (cc ccVar : listK) {
                if (ccVar.isAdded() && !ccVar.isRemoving()) {
                    Objects.checkIndex(0, 3);
                    if (ccVar != null) {
                        if (ccVar instanceof adyw) {
                            if (aaok.r((bp) ccVar)) {
                                r0.add(ccVar);
                            }
                        } else if (ccVar instanceof bp) {
                            if (!(ccVar instanceof wzl)) {
                                ((bp) ccVar).iN();
                            } else if (aaok.r((bp) ccVar)) {
                                r0.add(ccVar);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.wwa
    public final void c() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((wwf) obj).b();
            return;
        }
        ?? r3 = ((aaok) obj).a;
        for (bp bpVar : r3) {
            if (bpVar.isAdded() || !bpVar.isRemoving()) {
                Dialog dialog = bpVar.f;
                if (dialog != null) {
                    dialog.show();
                }
            }
        }
        r3.clear();
    }

    @Override // defpackage.wwa
    public final void d() {
    }
}
