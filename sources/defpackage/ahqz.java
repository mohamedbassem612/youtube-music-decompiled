package defpackage;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahqz implements ahrc, ahrd {
    public final ahrs a;
    public final ahrs b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public ahqz(Context context, String str, Set set, ahrs ahrsVar, Executor executor) {
        this.a = new ahox(new ahoo(context, str, 2));
        this.d = set;
        this.e = executor;
        this.b = ahrsVar;
        this.c = context;
    }

    @Override // defpackage.ahrc
    public final lpa a() {
        return !((UserManager) this.c.getSystemService(UserManager.class)).isUserUnlocked() ? mda.m("") : mda.k(this.e, new aegt(this, 11));
    }

    @Override // defpackage.ahrd
    public final synchronized int b() {
        ahrs ahrsVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ahrg ahrgVar = (ahrg) ahrsVar.a();
        if (!ahrgVar.f(jCurrentTimeMillis)) {
            return 1;
        }
        ahrgVar.c();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            new lpf().t(null);
        } else if (((UserManager) this.c.getSystemService(UserManager.class)).isUserUnlocked()) {
            mda.k(this.e, new rru(this, 17));
        } else {
            new lpf().t(null);
        }
    }
}
