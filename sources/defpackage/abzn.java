package defpackage;

import android.net.Uri;
import j$.util.Base64;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/stats/attestation/AttestationClient");
    public final Executor b;
    public final aopm c;
    public final wjm d;
    public final String e;
    public final String f;
    public final int g;
    public final ztf h;
    public final zta i;
    public final akki j;
    public volatile boolean k;
    public final tfq l;
    private final zxj m;
    private final zwb n;
    private final tyt o;
    private boolean p;
    private final acqf q;
    private final ek r;
    private final ci s;

    public abzn(zxj zxjVar, Executor executor, ek ekVar, zwb zwbVar, ci ciVar, tfq tfqVar, ztf ztfVar, vxu vxuVar, acqf acqfVar, abzq abzqVar, aopm aopmVar, wjm wjmVar, String str, String str2, int i) {
        this.m = zxjVar;
        this.b = executor;
        this.r = ekVar;
        this.n = zwbVar;
        this.s = ciVar;
        aopmVar.getClass();
        this.c = aopmVar;
        wjmVar.getClass();
        this.d = wjmVar;
        this.o = new tyt(wjmVar.c());
        this.l = tfqVar;
        this.h = ztfVar;
        this.j = d(vxuVar);
        this.e = str;
        this.f = str2;
        this.g = i;
        this.k = false;
        this.p = true;
        this.q = acqfVar;
        this.i = ztfVar.p() ? new zta(ztfVar, abzqVar) : null;
    }

    public static akki d(vxu vxuVar) {
        ajvu ajvuVarC = vxuVar.c();
        if (ajvuVarC != null) {
            anhb anhbVar = ajvuVarC.j;
            if (anhbVar == null) {
                anhbVar = anhb.a;
            }
            if ((anhbVar.c & 65536) != 0) {
                anhb anhbVar2 = ajvuVarC.j;
                if (anhbVar2 == null) {
                    anhbVar2 = anhb.a;
                }
                akki akkiVar = anhbVar2.u;
                return akkiVar == null ? akki.a : akkiVar;
            }
        }
        return null;
    }

    private final String e() {
        return new tyt(Uri.parse("?".concat(String.valueOf(this.c.c)))).b("c5b");
    }

    public final void a() {
        if (this.k) {
            return;
        }
        this.k = true;
        zwb zwbVar = this.n;
        ci ciVar = this.s;
        zwa zwaVarE = zwbVar.e();
        this.b.execute(new gqc(this, zwaVarE, ciVar.aD(zwaVarE), zwaVarE.m(), 4));
    }

    public final void b(zwa zwaVar) {
        aopm aopmVar = this.c;
        if (aopmVar.d) {
            taf.i(this.q.b(agkj.k("cpn", this.e, "encryptedVideoId", this.f)), this.b, new xfa(this, zwaVar, 7, null), new xwl(this, zwaVar, 11), null);
            return;
        }
        if (new tyt(Uri.parse("?".concat(String.valueOf(aopmVar.c)))).b("c5a") == null) {
            c(Optional.empty(), zwaVar);
            return;
        }
        String str = aopmVar.c;
        HashMap map = new HashMap();
        map.put("challenge", str);
        this.r.f(!ahno.aa(e()) ? e() : "yt_player", map, new abzl(this, str, zwaVar, 0));
    }

    public final void c(Optional optional, zwa zwaVar) {
        tyt tytVar;
        tyt tytVar2 = new tyt(this.o);
        String str = this.e;
        if (!str.isEmpty()) {
            tytVar2.f("cpn", str);
        }
        Uri uriA = tytVar2.a();
        zxi zxiVar = new zxi(2, "atr");
        zxiVar.b(uriA);
        if (optional.isPresent()) {
            ajgu ajguVar = (ajgu) optional.get();
            tytVar = new tyt(Uri.parse("?".concat(String.valueOf(ajguVar.e))));
            int i = ajguVar.c;
            if (i == 3) {
                tytVar.f("r5a", i == 3 ? (String) ajguVar.d : "");
            }
            if ((ajguVar.b & 2) != 0) {
                ajgt ajgtVar = ajguVar.f;
                if (ajgtVar == null) {
                    ajgtVar = ajgt.a;
                }
                Base64.Encoder encoderWithoutPadding = Base64.getEncoder().withoutPadding();
                tytVar.f("r9a", encoderWithoutPadding.encodeToString(ajgtVar.d.G()));
                Iterator it = ajgtVar.c.iterator();
                while (it.hasNext()) {
                    tytVar.d("r9b", encoderWithoutPadding.encodeToString(((aigj) it.next()).G()), "");
                }
            }
        } else {
            tytVar = new tyt(Uri.parse("?"));
        }
        HashMap map = new HashMap();
        map.put("atr", ahno.Z(tytVar.a().getEncodedQuery()));
        zxiVar.f = map;
        zxiVar.d = this.p;
        zxiVar.k = new wjk(this.d, 0);
        zxiVar.g = zwaVar;
        zxiVar.a(tok.HTTP_PING_ATTESTATION_CLIENT);
        this.m.b(null, zxiVar, zzl.c);
    }

    public abzn(zxj zxjVar, Executor executor, ek ekVar, zwb zwbVar, ci ciVar, tfq tfqVar, ztf ztfVar, vxu vxuVar, acqf acqfVar, abzq abzqVar, aopm aopmVar, wjm wjmVar) {
        this(zxjVar, executor, ekVar, zwbVar, ciVar, tfqVar, ztfVar, vxuVar, acqfVar, abzqVar, aopmVar, wjmVar, "", "", 0);
        akki akkiVarD = d(vxuVar);
        boolean z = false;
        if (akkiVarD != null && akkiVarD.f) {
            z = true;
        }
        this.p = z;
    }

    public abzn(zxj zxjVar, Executor executor, ek ekVar, zwb zwbVar, ci ciVar, tfq tfqVar, ztf ztfVar, vxu vxuVar, acqf acqfVar, abzq abzqVar, abzm abzmVar) {
        this(zxjVar, executor, ekVar, zwbVar, ciVar, tfqVar, ztfVar, vxuVar, acqfVar, abzqVar, abzmVar.a, abzmVar.b, abzmVar.c, abzmVar.e, abzmVar.d);
        this.k = abzmVar.f;
    }
}
