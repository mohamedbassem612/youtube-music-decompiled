package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hob implements aacm {
    public static final agrf a;
    private final mbc b;
    private final zwb c;
    private final hsz d;
    private final avmb e;
    private final aaqg f;
    private final vxz g;
    private final vxz h;
    private final syn i;
    private final hef j;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = agrf.h("com/google/android/apps/youtube/music/offline/autooffline/MusicAutoOfflineScheduler");
    }

    public hob(mbc mbcVar, syn synVar, aaqg aaqgVar, zwb zwbVar, hef hefVar, hsz hszVar, vxz vxzVar, vxz vxzVar2, avmb avmbVar) {
        mbcVar.getClass();
        this.b = mbcVar;
        aaqgVar.getClass();
        this.f = aaqgVar;
        synVar.getClass();
        this.i = synVar;
        zwbVar.getClass();
        this.c = zwbVar;
        this.j = hefVar;
        this.d = hszVar;
        this.g = vxzVar;
        this.h = vxzVar2;
        this.e = avmbVar;
    }

    private final void g() {
        this.i.b("offline_auto_offline");
    }

    private final void h() {
        this.j.k(this.c.e()).c(new gnw(14)).k(new hmd(5)).s().v(this.e).D();
    }

    private final void i(long j) {
        String strAG = kro.aG();
        strAG.getClass();
        ahno.P(!strAG.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = anxj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anxj anxjVar = (anxj) aihfVarCreateBuilder.instance;
        anxjVar.b |= 1;
        anxjVar.c = strAG;
        anxg anxgVar = new anxg(aihfVarCreateBuilder);
        aphf aphfVarE = aphh.e(wfs.g(148, kro.aG()));
        aphfVarE.am(Long.valueOf(this.b.f().plusSeconds(j).getEpochSecond()));
        aihf aihfVar = aphfVarE.a;
        aoff aoffVar = aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK;
        aihfVar.copyOnWrite();
        aphi aphiVar = (aphi) aihfVar.instance;
        aihw aihwVar = aphi.a;
        aihv aihvVar = aphiVar.f;
        if (!aihvVar.c()) {
            aphiVar.f = aihn.mutableCopy(aihvVar);
        }
        aphiVar.f.h(aoffVar.h);
        this.j.k(this.c.e()).c(new hpn(anxgVar, aphfVarE, 1)).k(new hmd(6)).s().v(this.e).D();
    }

    @Override // defpackage.aacm
    public final void a(String str) {
        this.d.d(0);
        e();
        this.f.x(str, 0L);
    }

    @Override // defpackage.aacm
    public final void b(String str) {
        long jO = this.f.o(str);
        long j = 0;
        if (jO > 0) {
            mbc mbcVar = this.b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jMax = Math.max(0L, jO - mbcVar.f().toEpochMilli()) / 1000;
            if (this.g.l(39, 45376078L, false)) {
                g();
                i(jMax);
                return;
            }
            h();
            int i = 1;
            if (this.h.l(66, 45858271L, false) && jMax == 0) {
                i = 2;
            } else {
                j = jMax;
            }
            syn synVar = this.i;
            syj syjVar = aacr.b;
            Bundle bundle = new Bundle();
            bundle.putString("identityId", str);
            synVar.d("offline_auto_offline", j, i, 1, false, bundle, aacr.b, false);
        }
    }

    @Override // defpackage.aacm
    public final void c(String str) {
        if (this.g.l(39, 45376078L, false)) {
            g();
            i(0L);
        } else {
            h();
            this.i.d("offline_auto_offline", 0L, 2, 1, false, aacr.a(str), aacr.b, false);
        }
    }

    @Override // defpackage.aacm
    public final void d(String str, long j) {
        f(str, j);
    }

    @Override // defpackage.aacm
    public final void e() {
        g();
        h();
    }

    @Override // defpackage.aacm
    public final void f(String str, long j) {
        long j2;
        if (str != null) {
            if (this.g.l(39, 45376078L, false)) {
                g();
                i(j);
                j2 = j;
            } else {
                h();
                j2 = j;
                this.i.d("offline_auto_offline", j2, 2, 1, false, aacr.a(str), aacr.b, false);
            }
            this.f.x(str, this.b.f().toEpochMilli() + TimeUnit.SECONDS.toMillis(j2));
        }
    }
}
