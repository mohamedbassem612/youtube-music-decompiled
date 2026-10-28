package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rup implements zzi {
    final /* synthetic */ smr a;
    final /* synthetic */ sko b;
    final /* synthetic */ ruq c;

    public rup(ruq ruqVar, smr smrVar, sko skoVar) {
        this.a = smrVar;
        this.b = skoVar;
        this.c = ruqVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[PHI: r4
      0x0069: PHI (r4v4 shh) = (r4v3 shh), (r4v2 shh) binds: [B:17:0x0067, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        ruq ruqVar = this.c;
        awmd awmdVar = ruqVar.b;
        shh shhVarC = null;
        if (!((Map) awmdVar.io()).containsKey(str)) {
            return null;
        }
        ryy ryyVar = (ryy) ((Map) awmdVar.io()).get(str);
        smr smrVar = this.a;
        sko skoVar = this.b;
        abmt abmtVar = ruqVar.c;
        ryx ryxVar = (ryx) ryyVar.getClass().getAnnotation(ryx.class);
        if (ryxVar == null) {
            shhVarC = shh.a;
        } else {
            shh shhVar = skoVar.o;
            Class clsA = ryxVar.a();
            if (!shhVar.e(clsA)) {
                shhVar = smrVar.g;
                if (shhVar.e(clsA)) {
                    shhVarC = shhVar;
                }
            } else if ((smrVar.e(sid.class) && ((wjf) smrVar.d(sid.class)).T()) || abmtVar.ao()) {
                shhVarC = shh.c(smrVar.g, shhVar);
            } else {
                shhVarC = shhVar;
            }
        }
        return shhVarC != null ? ryyVar.b(shhVarC) : ryyVar.a();
    }

    @Override // defpackage.zzi
    public final String b() {
        return "AdsConverterForExternalPings";
    }
}
