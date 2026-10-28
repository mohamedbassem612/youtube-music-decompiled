package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfh extends lfo {
    public final ldi a;
    public final ldi b;
    public final ldi c;
    public final ldi d;
    public final ldi e;
    public final ldi f;
    private final Map g;

    public lfh(lfv lfvVar) {
        super(lfvVar);
        this.g = new HashMap();
        this.a = new ldi(J(), "last_delete_stale", 0L);
        this.b = new ldi(J(), "last_delete_stale_batch", 0L);
        this.c = new ldi(J(), "backoff", 0L);
        this.d = new ldi(J(), "last_upload", 0L);
        this.e = new ldi(J(), "last_upload_attempt", 0L);
        this.f = new ldi(J(), "midnight_offset", 0L);
    }

    @Deprecated
    final Pair a(String str) {
        lfg lfgVar;
        jwa jwaVarE;
        o();
        Map map = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lfg lfgVar2 = (lfg) map.get(str);
        if (lfgVar2 != null && jElapsedRealtime < lfgVar2.c) {
            return new Pair(lfgVar2.a, Boolean.valueOf(lfgVar2.b));
        }
        long jI = G().i(str) + jElapsedRealtime;
        try {
            try {
                jwaVarE = jwb.e(aS());
            } catch (PackageManager.NameNotFoundException unused) {
                if (lfgVar2 != null && jElapsedRealtime < lfgVar2.c + G().E(str, lcl.c)) {
                    return new Pair(lfgVar2.a, Boolean.valueOf(lfgVar2.b));
                }
                jwaVarE = null;
            }
            if (jwaVarE == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = jwaVarE.a;
            lfgVar = str2 != null ? new lfg(str2, jwaVarE.b, jI) : new lfg("", jwaVarE.b, jI);
            this.g.put(str, lfgVar);
            return new Pair(lfgVar.a, Boolean.valueOf(lfgVar.b));
        } catch (Exception e) {
            aT().j.b("Unable to get advertising id", e);
            lfgVar = new lfg("", false, jI);
        }
    }

    public final Pair c(lbg lbgVar, lgh lghVar) {
        String str = lbgVar.a;
        kro.i(str);
        return (lghVar.m() && lbgVar.n) ? a(str) : new Pair("", Boolean.FALSE);
    }

    public final String d(lbg lbgVar, lgh lghVar) {
        o();
        String str = lbgVar.a;
        kro.i(str);
        if (!lghVar.m() || !lbgVar.n) {
            return "";
        }
        String str2 = (String) a(str).first;
        MessageDigest messageDigestA = lga.A();
        if (messageDigestA == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestA.digest(str2.getBytes())));
    }

    @Override // defpackage.lfo
    protected final void b() {
    }
}
