package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class wl implements DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    private final WeakReference a;

    public wl(wm wmVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = new WeakReference(wmVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$cid;
        WeakReference weakReference = this.a;
        if (i2 != 0) {
            if (weakReference.get() != null) {
                ((wm) weakReference.get()).l(true);
            }
        } else if (weakReference.get() != null) {
            ((wm) weakReference.get()).m(true);
        }
    }

    public wl(wm wmVar, int i) {
        this.$cid = i;
        this.a = new WeakReference(wmVar);
    }
}
