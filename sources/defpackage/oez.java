package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oez implements AppOpsManager$OnOpActiveChangedListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public oez(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (this.$cid != 0) {
            Object obj = this.a;
            if (z) {
                gbn gbnVar = (gbn) obj;
                gbnVar.b = System.currentTimeMillis();
                gbnVar.e = true;
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            gbn gbnVar2 = (gbn) obj;
            long j = gbnVar2.c;
            if (j > 0 && jCurrentTimeMillis >= j) {
                gbnVar2.d = jCurrentTimeMillis - j;
            }
            gbnVar2.e = false;
            return;
        }
        Object obj2 = this.a;
        synchronized (obj2) {
            try {
                if (z) {
                    ((ofa) obj2).e = System.currentTimeMillis();
                    ((ofa) obj2).h = true;
                } else {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j2 = ((ofa) obj2).f;
                    if (j2 > 0 && jCurrentTimeMillis2 >= j2) {
                        ((ofa) obj2).g = jCurrentTimeMillis2 - j2;
                    }
                    ((ofa) obj2).h = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
