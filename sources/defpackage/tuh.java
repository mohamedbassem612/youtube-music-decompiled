package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tuh implements avnh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tuh(Context context, acth acthVar, int i) {
        this.$cid = i;
        this.b = context;
        this.a = acthVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gzh, java.lang.Object] */
    @Override // defpackage.avnh
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            ((View) this.a).removeOnLayoutChangeListener(this.b);
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            ((Context) this.b).unregisterReceiver((BroadcastReceiver) obj);
        } else {
            ((jnm) ((hoo) obj).h.io()).z(this.b);
        }
    }

    public /* synthetic */ tuh(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
