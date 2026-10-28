package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zxe extends zyn {
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/net/ping/DelayedPingVolleyRequest");
    private final jrh m;
    private final mbc n;
    private final zza o;
    private final zwb p;
    private final Set q;
    private final zya r;

    /* JADX WARN: Illegal instructions before constructor call */
    public zxe(jrh jrhVar, zza zzaVar, mbc mbcVar, zrw zrwVar, zwb zwbVar, Set set, vxz vxzVar) {
        int i;
        switch (jrhVar.d) {
            case -1:
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            default:
                throw new IllegalArgumentException("Given method number is not defined");
        }
        jrhVar.getClass();
        super(i, jrhVar.e, zzaVar);
        if (vxzVar.c(8, 45634442L, 0L) > 0) {
            this.d = new tna((int) TimeUnit.SECONDS.toMillis(zrwVar.d()), (int) vxzVar.c(8, 45634442L, 0L));
        } else {
            this.d = new tna((int) TimeUnit.SECONDS.toMillis(zrwVar.d()));
        }
        this.f = false;
        this.m = jrhVar;
        this.o = zzaVar;
        this.n = mbcVar;
        this.p = zwbVar;
        this.q = set;
        this.r = new wjk(jrhVar, 3);
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final zwa Q() {
        String str = this.m.q;
        if (TextUtils.isEmpty(str)) {
            return zvz.a;
        }
        zwa zwaVarF = this.p.f(str);
        if (zwaVarF != null) {
            return zwaVarF;
        }
        ((agrc) ((agrc) l.b()).k("com/google/android/libraries/youtube/net/ping/DelayedPingVolleyRequest", "getIdentity", 156, "DelayedPingVolleyRequest.java")).t("DelayedPingVolleyRequest: AuthFailureError, identity id not found");
        return zvz.a;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return tnx.e(null);
    }

    @Override // defpackage.tns
    public final Class ab() {
        return Void.class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        this.o.a(null);
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        jrh jrhVar = this.m;
        if ((jrhVar.b & 16) != 0) {
            return jrhVar.h.G();
        }
        return null;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        HashMap map = new HashMap();
        jrh jrhVar = this.m;
        for (jrd jrdVar : jrhVar.f) {
            int i = jrdVar.b;
            if ((i & 1) != 0 && (i & 2) != 0) {
                map.put(jrdVar.c, jrdVar.d);
            }
        }
        for (zxy zxyVar : this.q) {
            if (this.r.a(zxyVar.a()) && !zxyVar.c()) {
                zxyVar.b(map, this);
            }
        }
        map.put("X-Goog-Request-Time", String.valueOf(this.n.f().toEpochMilli()));
        map.put("X-Goog-Event-Time", String.valueOf(jrhVar.i));
        return map;
    }
}
