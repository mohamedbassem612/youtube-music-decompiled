package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lbb extends ldz implements leb {
    protected lbb(ldr ldrVar) {
        super(ldrVar);
    }

    public final lba g() {
        return this.t.c();
    }

    public final lct h() {
        return this.t.e();
    }

    public final ler i() {
        return this.t.i();
    }

    public final lff j() {
        return this.t.k();
    }

    public final lgr k() {
        return this.t.m();
    }

    public final lhh l() {
        return this.t.o();
    }

    public final lhj m() {
        return this.t.p();
    }

    public final lhm n() {
        return this.t.q();
    }

    @Override // defpackage.ldz
    public final void o() {
        this.t.aU().o();
    }

    public final void p() {
        o();
        if (J().k(System.currentTimeMillis())) {
            J().h.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                aT().k.a("Detected application was in foreground");
                q(System.currentTimeMillis(), SystemClock.elapsedRealtime());
            }
        }
    }

    public final void q(long j, long j2) {
        o();
        if (this.t.w()) {
            J().k.b(j);
            aT().k.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            i().ae("auto", "_sid", lValueOf, j);
            ldi ldiVar = J().l;
            lValueOf.getClass();
            ldiVar.b(j3);
            J().h.a(false);
            Bundle bundle = new Bundle();
            lValueOf.getClass();
            bundle.putLong("_sid", j3);
            i().O("auto", "_s", j, j2, bundle);
            String strA = J().p.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            i().O("auto", "_ssr", j, j2, bundle2);
        }
    }

    public final void r(long j, long j2) {
        o();
        m().t();
        if (J().k(j)) {
            J().h.a(true);
            h().x();
        }
        J().k.b(j);
        if (J().h.b()) {
            q(j, j2);
        }
    }
}
