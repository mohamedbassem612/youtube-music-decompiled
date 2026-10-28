package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wi implements Runnable {
    private final /* synthetic */ int $cid;
    private final Object a;

    public wi(wj wjVar, int i) {
        this.$cid = i;
        this.a = new WeakReference(wjVar);
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [crn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            WeakReference weakReference = (WeakReference) this.a;
            if (weakReference.get() != null) {
                ((wm) weakReference.get()).j = false;
                return;
            }
            return;
        }
        if (i == 1) {
            WeakReference weakReference2 = (WeakReference) this.a;
            if (weakReference2.get() != null) {
                ((wj) weakReference2.get()).g();
                return;
            }
            return;
        }
        ?? r3 = this.a;
        if (i != 2) {
            r3.y();
            return;
        }
        WeakReference weakReference3 = (WeakReference) r3;
        if (weakReference3.get() != null) {
            ((wm) weakReference3.get()).k = false;
        }
    }

    public wi(crn crnVar, int i) {
        this.$cid = i;
        this.a = crnVar;
    }

    public wi(wm wmVar, int i) {
        this.$cid = i;
        this.a = new WeakReference(wmVar);
    }

    public wi(wm wmVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = new WeakReference(wmVar);
    }
}
