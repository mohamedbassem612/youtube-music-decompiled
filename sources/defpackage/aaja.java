package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaja {
    public static int a(int i) {
        if (i == 0) {
            return 2;
        }
        switch (i) {
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 5;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 1;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 1 : 6;
        }
        return 5;
    }

    public static void c(aoia aoiaVar, xgn xgnVar, String str, String str2, aohx aohxVar, aamn aamnVar, int i) {
        if (xgnVar != null) {
            ahno.F(TextUtils.isEmpty(str) != TextUtils.isEmpty(str2));
            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
            aihf aihfVarCreateBuilder2 = amdi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            amdi amdiVar = (amdi) aihfVarCreateBuilder2.instance;
            amdiVar.c = aohxVar.l;
            amdiVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            amdi amdiVar2 = (amdi) aihfVarCreateBuilder2.instance;
            amdiVar2.b |= 2;
            amdiVar2.d = true;
            if ((aoiaVar.b & 64) != 0) {
                aofb aofbVarA = aofb.a(aoiaVar.f);
                if (aofbVarA == null) {
                    aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar3 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar3.e = aofbVarA.i;
                amdiVar3.b |= 4;
            } else if (aamnVar.ordinal() != 0) {
                aofb aofbVar = aofb.OFFLINE_TYPE_UNKNOWN;
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar4 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar4.e = aofbVar.i;
                amdiVar4.b |= 4;
            } else {
                aofb aofbVar2 = aofb.OFFLINE_NOW;
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar5 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar5.e = aofbVar2.i;
                amdiVar5.b |= 4;
            }
            if (!TextUtils.isEmpty(str)) {
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar6 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar6.f = 1;
                amdiVar6.b |= 8;
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar7 = (amdi) aihfVarCreateBuilder2.instance;
                str.getClass();
                amdiVar7.b |= 16;
                amdiVar7.g = str;
            } else if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar8 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar8.f = 2;
                amdiVar8.b |= 8;
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar9 = (amdi) aihfVarCreateBuilder2.instance;
                str2.getClass();
                amdiVar9.b |= 16;
                amdiVar9.g = str2;
            }
            if (i != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                amdi amdiVar10 = (amdi) aihfVarCreateBuilder2.instance;
                amdiVar10.h = i - 1;
                amdiVar10.b |= 32;
            }
            aihfVarCreateBuilder.copyOnWrite();
            amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
            amdi amdiVar11 = (amdi) aihfVarCreateBuilder2.build();
            amdiVar11.getClass();
            amddVar.h = amdiVar11;
            amddVar.b |= 16;
            if ((aoiaVar.b & SemanticState.Hidden) != 0 && aoiaVar.g.d() > 0) {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aoiaVar.g, (amud) null), (amdd) aihfVarCreateBuilder.build());
                return;
            }
            if (true == TextUtils.isEmpty(str)) {
                str = str2;
            }
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgx(xgnVar.g(str, xhb.b(7111))), (amdd) aihfVarCreateBuilder.build());
        }
    }

    public static String d(long j) {
        int i;
        if (j >= 3600000) {
            i = 5;
        } else {
            i = j >= 60000 ? 4 : 3;
        }
        return typ.i(j / 1000, i);
    }

    public static String e(wgs wgsVar) {
        if (wgsVar == null) {
            return "N/A";
        }
        String strZ = wgsVar.z();
        int iIndexOf = strZ.indexOf("codecs=\"");
        int i = iIndexOf + 8;
        int iMin = Math.min(strZ.indexOf("\"", iIndexOf + 9), iIndexOf + 12);
        StringBuilder sb = new StringBuilder(wgsVar.f);
        if (i >= 8 && iMin >= 0) {
            sb.append(' ');
            sb.append((CharSequence) strZ, i, iMin);
        }
        if (wgsVar.af()) {
            sb.append(' ');
            sb.append(wgsVar.i());
            sb.append('x');
            sb.append(wgsVar.d());
            int iC = wgsVar.c();
            if (iC > 0) {
                sb.append('@');
                sb.append(iC);
            }
        }
        if (wgsVar.Z()) {
            sb.append(" otf");
        }
        return sb.toString();
    }

    public static boolean f(long j, long j2) {
        return j2 + (-15000) <= j;
    }

    public static void g(aoqp aoqpVar) {
        alay alayVar = aoqpVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        ackj.k(null, alayVar, null, false).toString();
    }
}
