package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbe implements acbd {
    private final tzs a = new tzs(Collections.EMPTY_MAP);
    private final twi b;
    private final boolean c;
    private final aunn d;
    private final vwt e;

    public acbe(twi twiVar, aunn aunnVar, boolean z, boolean z2, abmt abmtVar) {
        dov dovVar = new dov((short[]) null, (byte[]) null);
        aawb.am(dovVar, z2, abmtVar);
        aawb.an(dovVar, z2, abmtVar);
        this.e = dovVar.ax();
        this.b = twiVar;
        this.d = aunnVar;
        this.c = z;
    }

    @Override // defpackage.acbd
    public final void a(acbg acbgVar, bwb bwbVar, long j, int i) throws yxm {
        acbgVar.b(j);
        try {
            acbn acbnVarB = ((acbp) this.a.a(new tpg(ByteBuffer.wrap(bwbVar.b, bwbVar.c, i)), this.e)).a();
            if (j == 0) {
                throw new yxm(2, null);
            }
            acbgVar.a(acbnVarB.b(this.b, j));
        } catch (IOException | tzp e) {
            throw new yxm(1, e);
        }
    }

    @Override // defpackage.acbd
    public final void b(acbg acbgVar, bwb bwbVar, long j, int i) {
        acbgVar.b(j);
        try {
            try {
                acbn acbnVarB = ((acbp) this.a.a(new tpg(ByteBuffer.wrap(bwbVar.b, bwbVar.c, i)), this.e)).a();
                bwbVar.P(bwbVar.c + bwbVar.d());
                twi twiVar = this.b;
                if (j == 0) {
                    acbgVar.a(acbn.a(twiVar, 0L));
                } else {
                    acbgVar.a(acbnVarB.b(twiVar, j));
                }
            } catch (Throwable th) {
                bwbVar.P(bwbVar.c + bwbVar.d());
                throw th;
            }
        } catch (IOException | tzp e) {
            acbgVar.a(acbn.a(this.b, j));
            aunn aunnVar = this.d;
            if (aunnVar != null && (i > 0 || this.c)) {
                String str = this.c ? "SABR Captions parsing error in LiveFmt3Parser" : "CABR Captions parsing error in LiveFmt3Parser";
                zvl zvlVar = (zvl) aunnVar.io();
                zvj zvjVarA = zvk.a();
                zvjVarA.j = 21;
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.f(e);
                zvjVarA.d(str);
                zvlVar.a(zvjVarA.a());
            }
            bwbVar.P(bwbVar.c + bwbVar.d());
        }
    }
}
