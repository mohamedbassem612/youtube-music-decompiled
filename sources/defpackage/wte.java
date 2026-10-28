package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wte {
    public static final agkz a;
    private static final agkz b;

    static {
        agkz agkzVarS = agkz.s("youtube.com", "m.youtube.com", "www.youtube.com", "youtu.be");
        agkzVarS.getClass();
        a = agkzVarS;
        agkz agkzVarU = agkz.u("v", "t", "list", "index", "autoplay", "fs", new String[0]);
        agkzVarU.getClass();
        b = agkzVarU;
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff A[EDGE_INSN: B:70:0x00ff->B:71:0x0100 BREAK  A[LOOP:1: B:65:0x00e2->B:69:0x00fc]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0151  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    public final alsv a(Uri uri, String str) {
        int i;
        String queryParameter;
        aihf aihfVarCreateBuilder;
        String queryParameter2;
        Integer numG;
        Integer num;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        if (!queryParameterNames.isEmpty()) {
            Iterator<T> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                if (!b.contains((String) it.next())) {
                    return null;
                }
            }
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        String strX = awrc.x(str, 11);
        String queryParameter3 = uri.getQueryParameter("t");
        if (queryParameter3 != null) {
            if (queryParameter3.length() != 0) {
                int length = queryParameter3.length();
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                i = 0;
                boolean z3 = false;
                int i3 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    if (i2 >= length) {
                        if (!z) {
                            i = i3;
                            break;
                        }
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    char cCharAt = queryParameter3.charAt(i2);
                    if (cCharAt < '0' || cCharAt >= ':') {
                        if (cCharAt == 'h' && !z3 && !z4 && !z5) {
                            if (z2) {
                                i += i3 * 3600;
                                z = true;
                                z3 = true;
                            } else {
                                z2 = false;
                            }
                            z2 = false;
                            i3 = 0;
                        }
                        if (cCharAt == 'm' && !z4 && !z5 && z2) {
                            i += i3 * 60;
                            z = true;
                            z4 = true;
                        } else if (cCharAt == 's' && !z5 && z2) {
                            i += i3;
                            z = true;
                            z5 = true;
                        }
                        z2 = false;
                        i3 = 0;
                    } else {
                        i3 = (i3 * 10) + (cCharAt - '0');
                        z2 = true;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            queryParameter = uri.getQueryParameter("list");
            if (queryParameter == null || queryParameter.length() < 2) {
                queryParameter = null;
                break;
            }
            if (awrc.n(queryParameter, "PL", false)) {
                int length2 = queryParameter.length();
                if (length2 != 18 && length2 != 34) {
                    queryParameter = null;
                    break;
                }
                uhd uhdVar = new uhd(17);
                for (int i4 = 0; i4 < queryParameter.length(); i4++) {
                    if (!((Boolean) uhdVar.invoke(Character.valueOf(queryParameter.charAt(i4)))).booleanValue()) {
                        queryParameter = null;
                        break;
                    }
                }
            } else {
                queryParameter = "&UNSUPPORTEDPLAYLIST&";
            }
            if (!awrc.c(queryParameter, "&UNSUPPORTEDPLAYLIST&")) {
                return null;
            }
            aihfVarCreateBuilder = arij.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar = (arij) aihfVarCreateBuilder.instance;
            arijVar.b |= 1;
            arijVar.d = strX;
            if (i > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                arij arijVar2 = (arij) aihfVarCreateBuilder.instance;
                arijVar2.b |= SemanticState.Hidden;
                arijVar2.k = i;
            }
            if (queryParameter != null) {
                aihfVarCreateBuilder.copyOnWrite();
                arij arijVar3 = (arij) aihfVarCreateBuilder.instance;
                arijVar3.b |= 2;
                arijVar3.e = queryParameter;
                queryParameter2 = uri.getQueryParameter("index");
                if (queryParameter2 != null && (numG = awrc.G(queryParameter2)) != null) {
                    num = numG.intValue() > 0 ? numG : null;
                    if (num != null) {
                        int iIntValue = num.intValue() - 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        arij arijVar4 = (arij) aihfVarCreateBuilder.instance;
                        arijVar4.b |= 4;
                        arijVar4.f = iIntValue;
                    }
                }
            }
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(arik.a, aihfVarCreateBuilder.build());
            aihn aihnVarBuild = aihhVar.build();
            aihnVarBuild.getClass();
            aihf aihfVarCreateBuilder2 = alsv.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            alsv alsvVar = (alsv) aihfVarCreateBuilder2.instance;
            alsvVar.d = (ajwo) aihnVarBuild;
            alsvVar.b |= 2;
            return (alsv) aihfVarCreateBuilder2.build();
        }
        i = 0;
        queryParameter = uri.getQueryParameter("list");
        if (queryParameter == null) {
            queryParameter = null;
            break;
        }
        queryParameter = null;
        break;
        if (!awrc.c(queryParameter, "&UNSUPPORTEDPLAYLIST&")) {
            return null;
        }
        aihfVarCreateBuilder = arij.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        arij arijVar5 = (arij) aihfVarCreateBuilder.instance;
        arijVar5.b |= 1;
        arijVar5.d = strX;
        if (i > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar6 = (arij) aihfVarCreateBuilder.instance;
            arijVar6.b |= SemanticState.Hidden;
            arijVar6.k = i;
        }
        if (queryParameter != null) {
            aihfVarCreateBuilder.copyOnWrite();
            arij arijVar7 = (arij) aihfVarCreateBuilder.instance;
            arijVar7.b |= 2;
            arijVar7.e = queryParameter;
            queryParameter2 = uri.getQueryParameter("index");
            if (queryParameter2 != null) {
                if (numG.intValue() > 0) {
                }
                if (num != null) {
                    int iIntValue2 = num.intValue() - 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    arij arijVar8 = (arij) aihfVarCreateBuilder.instance;
                    arijVar8.b |= 4;
                    arijVar8.f = iIntValue2;
                }
            }
        }
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihhVar2.e(arik.a, aihfVarCreateBuilder.build());
        aihn aihnVarBuild2 = aihhVar2.build();
        aihnVarBuild2.getClass();
        aihf aihfVarCreateBuilder3 = alsv.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        alsv alsvVar2 = (alsv) aihfVarCreateBuilder3.instance;
        alsvVar2.d = (ajwo) aihnVarBuild2;
        alsvVar2.b |= 2;
        return (alsv) aihfVarCreateBuilder3.build();
    }
}
