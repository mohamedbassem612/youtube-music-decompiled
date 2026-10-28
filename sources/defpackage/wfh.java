package defpackage;

import android.util.Base64;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wfh implements wfp {
    @Override // defpackage.wfp
    public final akve a(String str) {
        int iAS;
        try {
            aigm aigmVarM = aigm.M(Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8));
            aihf aihfVarCreateBuilder = akve.a.createBuilder();
            boolean z = false;
            for (int iN = aigmVarM.n(); iN > 0; iN = aigmVarM.n()) {
                int i = iN & 7;
                int i2 = iN >>> 3;
                if (i2 == 2) {
                    if (i != 2) {
                        return null;
                    }
                    aigj aigjVarW = aigmVarM.w();
                    aihfVarCreateBuilder.copyOnWrite();
                    akve akveVar = (akve) aihfVarCreateBuilder.instance;
                    aigjVarW.getClass();
                    akveVar.b |= 8;
                    akveVar.f = aigjVarW;
                } else if (i2 == 4) {
                    if (i != 0) {
                        return null;
                    }
                    long jS = ((aigk) aigmVarM).s();
                    aihfVarCreateBuilder.copyOnWrite();
                    akve akveVar2 = (akve) aihfVarCreateBuilder.instance;
                    akveVar2.b |= 1;
                    akveVar2.c = jS;
                } else if (i2 != 5) {
                    if (i2 != 6) {
                        aigmVarM.F(iN);
                    } else {
                        if (i != 2) {
                            return null;
                        }
                        aigj aigjVarW2 = aigmVarM.w();
                        aihfVarCreateBuilder.copyOnWrite();
                        akve akveVar3 = (akve) aihfVarCreateBuilder.instance;
                        aigjVarW2.getClass();
                        akveVar3.b |= 4;
                        akveVar3.e = aigjVarW2;
                    }
                } else {
                    if (i != 0 || (iAS = a.aS(((aigk) aigmVarM).k())) == 0) {
                        return null;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    akve akveVar4 = (akve) aihfVarCreateBuilder.instance;
                    akveVar4.d = iAS - 1;
                    akveVar4.b |= 2;
                }
                z = true;
            }
            if (aigmVarM.D() && z) {
                return (akve) aihfVarCreateBuilder.buildPartial();
            }
            return null;
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }
}
