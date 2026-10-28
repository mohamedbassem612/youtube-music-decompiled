package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.graphics.Rect;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tdu implements avlt {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tdu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avlt
    public final void a(avls avlsVar) {
        int i = this.$cid;
        if (i == 0) {
            vwt.C(new lph(this.a, avlsVar, 17, (byte[]) null));
            return;
        }
        int i2 = 1;
        if (i != 1) {
            final hbp hbpVar = new hbp(avlsVar, 3);
            final View view = (View) this.a;
            avlsVar.d(new avnh() { // from class: tue
                @Override // defpackage.avnh
                public final void a() {
                    view.removeOnLayoutChangeListener(hbpVar);
                }
            });
            if (!avlsVar.f()) {
                avlsVar.c(new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            view.addOnLayoutChangeListener(hbpVar);
            return;
        }
        if (avlsVar.f()) {
            return;
        }
        Activity activity = (Activity) this.a;
        avlsVar.c(activity.getResources().getConfiguration());
        sxq sxqVar = new sxq(avlsVar);
        activity.registerComponentCallbacks(sxqVar);
        avnr.i((AtomicReference) avlsVar, new avml(new tdt(activity, (ComponentCallbacks) sxqVar, i2)));
    }
}
