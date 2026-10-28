package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odm extends odl {
    private final Map a;
    private final obb b;

    public odm(fxg fxgVar, ocu ocuVar, obb obbVar, Map map, omj omjVar) {
        super("Ig54C4HkxKGmba9akO3LJXn9K1puUA3SO14/+XDmtlV5+VzEDiGjIpvOeUWhbBE/", "OwwY29bMiNq1I+JVOkuvok8Z+jykc/OLsRnpOv6oGnc=", fxgVar, ocuVar, omjVar.h(122));
        this.a = map;
        this.b = obbVar;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.a;
        lArr[0] = (Long) ahno.ad((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) ahno.ad((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) ahno.ad((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) ahno.ad((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) ahno.ad((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) ahno.ad((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) ahno.ad((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) ahno.ad((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) ahno.ad((Long) map.get("tst"), -1L);
        for (int i = 0; i < 9; i++) {
            if (lArr[i] == null) {
                lArr[i] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.b.ordinal()));
        lArr2.getClass();
        synchronized (fxgVar) {
            long jLongValue = lArr2[0].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.e |= 32;
            fxlVar.am = jLongValue;
            long jLongValue2 = lArr2[1].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar3 = (fxl) fxgVar.instance;
            fxlVar3.b |= 134217728;
            fxlVar3.x = jLongValue2;
            long jLongValue3 = lArr2[2].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar4 = (fxl) fxgVar.instance;
            fxlVar4.b |= 2097152;
            fxlVar4.s = jLongValue3;
            long jLongValue4 = lArr2[3].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar5 = (fxl) fxgVar.instance;
            fxlVar5.b |= 65536;
            fxlVar5.p = jLongValue4;
            long jLongValue5 = lArr2[4].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar6 = (fxl) fxgVar.instance;
            fxlVar6.d |= SemanticState.Multiline;
            fxlVar6.ag = jLongValue5;
            long jLongValue6 = lArr2[5].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar7 = (fxl) fxgVar.instance;
            fxlVar7.d |= 16384;
            fxlVar7.ah = jLongValue6;
            long jLongValue7 = lArr2[6].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar8 = (fxl) fxgVar.instance;
            fxlVar8.c |= SemanticState.Obscured;
            fxlVar8.M = jLongValue7;
            long jLongValue8 = lArr2[7].longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar9 = (fxl) fxgVar.instance;
            fxlVar9.c |= SemanticState.Multiline;
            fxlVar9.N = jLongValue8;
        }
    }
}
