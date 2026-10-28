package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ros extends tnf implements tnz {
    private static final twq l = new twq(100, 10000, 3, -1, 2.0d);
    private final Context m;
    private Map n;
    private final rlt o;
    private final rly p;
    private final twr q;

    public ros(Context context, String str, rlt rltVar, rly rlyVar, wjr wjrVar, mbc mbcVar) {
        String strReplace = "https://www.googleapis.com/reauth/v1beta/users/%user_id%/reauthProofTokens".replace("%user_id%", "me");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("credentialType", "password");
            jSONObject.put("credential", str);
            super(strReplace, jSONObject, null, null, false, mbcVar);
            this.m = context;
            rltVar.getClass();
            this.o = rltVar;
            rlyVar.getClass();
            this.p = rlyVar;
            wjrVar.getClass();
            this.q = wjrVar.j(l);
            this.d = this;
        } catch (JSONException e) {
            throw new RuntimeException("Error while creating password verification request", e);
        }
    }

    @Override // defpackage.tnz
    public final int a() {
        return 60000;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final tnr af() {
        return tnr.c;
    }

    @Override // defpackage.tnz
    public final int b() {
        return (int) this.q.a;
    }

    @Override // defpackage.tnz
    public final Duration d(toe toeVar) {
        boolean z = toeVar instanceof tmg;
        if (!z && !taq.B(toeVar)) {
            return null;
        }
        long jA = this.q.a();
        if (jA < 0) {
            return null;
        }
        if (z) {
            if (b() > 1) {
                return null;
            }
            rlt rltVar = this.o;
            if (!rltVar.d) {
                this.n = null;
                this.p.b(rltVar);
            }
        }
        return Duration.ofMillis(jA);
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() throws tmg {
        if (this.n == null) {
            HashMap map = new HashMap();
            this.n = map;
            map.put("Content-Type", "application/json");
            zwk zwkVarA = this.p.a(this.o);
            if (!zwkVarA.f()) {
                if (zwkVarA.e()) {
                    throw new tmg(zwkVarA.a());
                }
                Exception excC = zwkVarA.c();
                if (excC instanceof IOException) {
                    throw new tmg(this.m.getString(R.string.common_error_connection), excC);
                }
                throw new tmg();
            }
            Optional optionalB = zwkVarA.b(this.a);
            if (optionalB.isPresent()) {
                map.put((String) ((Pair) optionalB.get()).first, (String) ((Pair) optionalB.get()).second);
            }
        }
        Map map2 = this.n;
        map2.getClass();
        return map2;
    }

    @Override // defpackage.tnz
    public final void f(toe toeVar) throws toe {
        boolean z = toeVar instanceof tmg;
        if ((!z && !taq.B(toeVar)) || !this.q.b()) {
            throw toeVar;
        }
        if (z) {
            if (b() > 1) {
                throw toeVar;
            }
            rlt rltVar = this.o;
            if (rltVar.d) {
                return;
            }
            this.n = null;
            this.p.b(rltVar);
        }
    }

    @Override // defpackage.tnz
    public final void g() {
    }
}
