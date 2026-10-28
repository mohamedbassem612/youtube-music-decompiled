package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aacx implements syk {
    private final /* synthetic */ int $cid;
    private final Object a;

    public aacx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [aati, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awmd, java.lang.Object] */
    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        int i = this.$cid;
        if (i == 0) {
            ((ci) this.a).av(bundle.getString("intentAction"), bundle);
            return 0;
        }
        if (i == 1) {
            try {
                ((itd) this.a.io()).a().get();
                return 0;
            } catch (Throwable th) {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return 2;
            }
        }
        Object obj = this.a;
        if (i != 2) {
            ((ci) obj).av(bundle.getString("intentAction"), bundle);
            return 0;
        }
        try {
            ((ci) obj).a.g().await();
            return 0;
        } catch (InterruptedException unused) {
            return 1;
        }
    }
}
