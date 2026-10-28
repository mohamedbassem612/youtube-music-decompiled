package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tdt implements avnd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tdt(Activity activity, ComponentCallbacks componentCallbacks, int i) {
        this.$cid = i;
        this.b = activity;
        this.a = componentCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // defpackage.avnd
    public final void a() {
        int i = this.$cid;
        char[] cArr = null;
        if (i == 0) {
            vwt.C(new lph(this.a, this.b, 18, cArr));
        } else if (i != 1) {
            ((aebc) this.a).h((trb) this.b, null);
        } else {
            ((Activity) this.b).unregisterComponentCallbacks(this.a);
        }
    }

    public /* synthetic */ tdt(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
