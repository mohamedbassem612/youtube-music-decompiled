package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tzd implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public tzd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            avpr avprVar = (avpr) this.a;
            if (avprVar.f()) {
                return;
            }
            avprVar.b(th);
            return;
        }
        if (i == 1) {
            ofb ofbVar = (ofb) this.a;
            ofbVar.b(th);
            ofbVar.a();
            return;
        }
        if (i == 2) {
            avyd avydVar = (avyd) this.a;
            if (avydVar.f()) {
                return;
            }
            avydVar.b(th);
            return;
        }
        if (i != 3) {
            if (i == 4 || !(th instanceof TimeoutException)) {
                return;
            }
            ((agrc) ((agrc) ((agrc) afjn.a.c()).j(th)).k("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 213, "AndroidFutures.java")).w("exceeded timeout: %s", this.a);
            return;
        }
        awgm awgmVar = (awgm) this.a;
        if (awgmVar.f()) {
            return;
        }
        awgmVar.a(th);
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            avpr avprVar = (avpr) this.a;
            if (avprVar.f()) {
                return;
            }
            avprVar.a();
            return;
        }
        if (i == 1) {
            ((ofb) this.a).a();
            return;
        }
        if (i == 2) {
            avyd avydVar = (avyd) this.a;
            if (avydVar.f()) {
                return;
            }
            if (obj != null) {
                avydVar.c(obj);
                return;
            } else {
                avydVar.a();
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                Iterator it = ((Set) ((afid) this.a).c.io()).iterator();
                while (it.hasNext()) {
                    afjn.d(116, ((afhv) it.next()).a(), "AvailableAccountsInvalidatedObserver failed", new Object[0]);
                }
                return;
            }
            return;
        }
        awgm awgmVar = (awgm) this.a;
        if (awgmVar.f()) {
            return;
        }
        if (obj != null) {
            awgmVar.b(obj);
        } else {
            awgmVar.a(new IllegalStateException("The value returned from the future was null. This is not allowed. Use Maybe instead if you intend to return null."));
        }
    }
}
