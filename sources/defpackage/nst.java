package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nst {
    public static String a(oiz oizVar) {
        StringBuilder sb = new StringBuilder(oizVar.e);
        sb.append('|');
        int iAS = a.aS(oizVar.f);
        if (iAS == 0) {
            iAS = 1;
        }
        sb.append(iAS - 1);
        return sb.toString();
    }

    public static String b(oiz oizVar) {
        String strAP;
        StringBuilder sb = new StringBuilder(oizVar.c);
        sb.append('|');
        sb.append(oizVar.d);
        sb.append('|');
        sb.append(oizVar.e);
        sb.append('|');
        int iAS = a.aS(oizVar.f);
        if (iAS == 0) {
            iAS = 1;
        }
        sb.append(iAS - 1);
        sb.append('|');
        if ((oizVar.b & 16) != 0) {
            atyn atynVar = oizVar.g;
            if (atynVar == null) {
                atynVar = atyn.a;
            }
            strAP = qnl.aP(atynVar);
        } else {
            strAP = "";
        }
        sb.append(strAP);
        return sb.toString();
    }

    public static oiz c(String str, Context context, qnl qnlVar) throws onx {
        aihf aihfVarCreateBuilder;
        List listH = agfm.c("|").h(str);
        int iOrdinal = qnl.bT(context, qnlVar).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (listH.size() != 4) {
                    throw new onx("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
                aihfVarCreateBuilder = oiz.a.createBuilder();
                String str2 = (String) listH.get(0);
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar = (oiz) aihfVarCreateBuilder.instance;
                str2.getClass();
                oizVar.b |= 1;
                oizVar.c = str2;
                long j = Integer.parseInt((String) listH.get(1));
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar2 = (oiz) aihfVarCreateBuilder.instance;
                oizVar2.b |= 2;
                oizVar2.d = j;
                String str3 = (String) listH.get(2);
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar3 = (oiz) aihfVarCreateBuilder.instance;
                str3.getClass();
                oizVar3.b |= 4;
                oizVar3.e = str3;
                int iAS = a.aS(Integer.parseInt((String) listH.get(3)));
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar4 = (oiz) aihfVarCreateBuilder.instance;
                int i = iAS - 1;
                if (iAS == 0) {
                    throw null;
                }
                oizVar4.f = i;
                oizVar4.b |= 8;
            } else {
                if (listH.size() != 2) {
                    throw new onx("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                aihfVarCreateBuilder = oiz.a.createBuilder();
                String str4 = (String) listH.get(0);
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar5 = (oiz) aihfVarCreateBuilder.instance;
                str4.getClass();
                oizVar5.b |= 4;
                oizVar5.e = str4;
                int iAS2 = a.aS(Integer.parseInt((String) listH.get(1)));
                aihfVarCreateBuilder.copyOnWrite();
                oiz oizVar6 = (oiz) aihfVarCreateBuilder.instance;
                int i2 = iAS2 - 1;
                if (iAS2 == 0) {
                    throw null;
                }
                oizVar6.f = i2;
                oizVar6.b |= 8;
            }
        } else {
            if (listH.size() != 5) {
                throw new onx("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            }
            aihf aihfVarCreateBuilder2 = oiz.a.createBuilder();
            String str5 = (String) listH.get(0);
            aihfVarCreateBuilder2.copyOnWrite();
            oiz oizVar7 = (oiz) aihfVarCreateBuilder2.instance;
            str5.getClass();
            oizVar7.b |= 1;
            oizVar7.c = str5;
            long j2 = Integer.parseInt((String) listH.get(1));
            aihfVarCreateBuilder2.copyOnWrite();
            oiz oizVar8 = (oiz) aihfVarCreateBuilder2.instance;
            oizVar8.b |= 2;
            oizVar8.d = j2;
            String str6 = (String) listH.get(2);
            aihfVarCreateBuilder2.copyOnWrite();
            oiz oizVar9 = (oiz) aihfVarCreateBuilder2.instance;
            str6.getClass();
            oizVar9.b |= 4;
            oizVar9.e = str6;
            int iAS3 = a.aS(Integer.parseInt((String) listH.get(3)));
            aihfVarCreateBuilder2.copyOnWrite();
            oiz oizVar10 = (oiz) aihfVarCreateBuilder2.instance;
            int i3 = iAS3 - 1;
            if (iAS3 == 0) {
                throw null;
            }
            oizVar10.f = i3;
            oizVar10.b |= 8;
            if (listH.get(4) != null && !((String) listH.get(4)).isEmpty()) {
                try {
                    String str7 = (String) listH.get(4);
                    atyn atynVar = atyn.a;
                    atyn atynVar2 = (atyn) qnl.aM(str7, aihn.getParserForClass(atyn.class));
                    aihfVarCreateBuilder2.copyOnWrite();
                    oiz oizVar11 = (oiz) aihfVarCreateBuilder2.instance;
                    atynVar2.getClass();
                    oizVar11.g = atynVar2;
                    oizVar11.b |= 16;
                } catch (aiik e) {
                    throw new onx("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            aihfVarCreateBuilder = aihfVarCreateBuilder2;
        }
        return (oiz) aihfVarCreateBuilder.build();
    }

    public static String d(oiz oizVar, Context context, qnl qnlVar) {
        int iOrdinal = qnl.bT(context, qnlVar).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return b(oizVar);
            }
            if (iOrdinal == 2) {
                return a(oizVar);
            }
            throw new RuntimeException(null, null);
        }
        StringBuilder sb = new StringBuilder(oizVar.c);
        sb.append('|');
        sb.append(oizVar.d);
        sb.append('|');
        sb.append(oizVar.e);
        sb.append('|');
        int iAS = a.aS(oizVar.f);
        sb.append((iAS != 0 ? iAS : 1) - 1);
        return sb.toString();
    }
}
