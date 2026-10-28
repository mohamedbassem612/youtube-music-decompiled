package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aajg {
    public static void a(aakx aakxVar) {
        aaqu aaquVarM = aakxVar.e.m();
        aaqw aaqwVarA = aaquVarM != null ? aaquVarM.a(aakxVar.c) : null;
        int i = aakxVar.g;
        if (i != 2) {
            if (i != 4 || aaqwVarA == null) {
                return;
            }
            aakxVar.d.e(new aahr(aaqwVarA.a()));
            return;
        }
        tbt tbtVar = aakxVar.d;
        tbtVar.e(new aahj(aakxVar.c));
        if (aaqwVarA != null) {
            tbtVar.e(new aaho(aaqwVarA.a()));
        }
    }

    public static void b(aofh aofhVar, agke agkeVar, avlr avlrVar, tbt tbtVar, aaqn aaqnVar, int i) {
        avlrVar.af(new zgd(new aakx(aofhVar, agkeVar, tbtVar, aaqnVar, i), 11));
    }

    public static float c(long j, long j2) {
        if (j == 0 || j2 == 0 || j2 > j) {
            return 0.0f;
        }
        float f = j2;
        long j3 = j - j2;
        int i = (int) ((f / j) * 100.0f);
        if (j < 600) {
            if (j3 < 60 && i >= 10) {
                return 0.0f;
            }
        } else if (j > 6000) {
            if (j3 < 600) {
                return 0.0f;
            }
        } else if (i > 90) {
            return 0.0f;
        }
        return f;
    }

    public static altq d(alts altsVar, String str) {
        if (altsVar != null) {
            for (altt alttVar : altsVar.c) {
                altq altqVar = alttVar.b;
                if (altqVar == null) {
                    altqVar = altq.a;
                }
                if (altqVar.c.equals(str)) {
                    altq altqVar2 = alttVar.b;
                    return altqVar2 == null ? altq.a : altqVar2;
                }
            }
        }
        return null;
    }

    public static aofu e(altv altvVar, String str) {
        for (aofv aofvVar : altvVar.d) {
            aofu aofuVar = aofvVar.c;
            if (aofuVar == null) {
                aofuVar = aofu.a;
            }
            if (aofuVar.c.equals(str)) {
                aofu aofuVar2 = aofvVar.c;
                return aofuVar2 == null ? aofu.a : aofuVar2;
            }
        }
        return null;
    }

    public static aqmh f(aqmh aqmhVar, List list) {
        aqmg aqmgVar;
        if (aqmhVar == null) {
            return aqmh.a;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new rit(12));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        aqmg aqmgVar2 = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            aiie aiieVar = aqmhVar.c;
            if (!aiieVar.isEmpty()) {
                Iterator it = aiieVar.iterator();
                do {
                    if (!it.hasNext()) {
                        aqmgVar = (aqmg) aguu.K(aiieVar);
                        break;
                    }
                    aqmgVar = (aqmg) it.next();
                } while (aqmgVar.d < iIntValue);
            } else {
                aqmgVar = null;
            }
            if (aqmgVar != null && aqmgVar2 != aqmgVar) {
                arrayList2.add(aqmgVar);
                aqmgVar2 = aqmgVar;
            }
        }
        aihh aihhVar = (aihh) aqmhVar.toBuilder();
        aihhVar.copyOnWrite();
        ((aqmh) aihhVar.instance).c = aqmh.emptyProtobufList();
        aihhVar.q(arrayList2);
        return (aqmh) aihhVar.build();
    }

    public static boolean g(int i) {
        return i == 2 || i == 3;
    }

    public static boolean h(wjf wjfVar) {
        if (wjfVar == null || wjfVar.t() == null || !aaje.o(wjfVar.t())) {
            return false;
        }
        return !wjfVar.V() || wjfVar.f().aT();
    }

    public static Set i(abrn abrnVar) {
        return new agqj(abrnVar.d());
    }

    public static boolean j(abrn abrnVar, String str) {
        if (!str.equals(abrnVar.d())) {
            return false;
        }
        abrnVar.f();
        return true;
    }

    public static String k(int i) {
        if (i == 0) {
            return "NONE";
        }
        switch (i) {
            case 2:
                return "PLAYING";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPED";
            case 5:
                return "BUFFERING";
            case 6:
                return "PAUSED_BUFFERING";
            case 7:
                return "ENDED";
            case 8:
                return "ERROR";
            case 9:
                return "SEEKING";
            case 10:
                return "PAUSED_SEEKING";
            case 11:
                return "RENDERED_FRAME";
            default:
                return a.ci((byte) 41, i, "UNKNOWN(");
        }
    }

    public static int l(int i) {
        switch (i) {
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 10;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
            case 10:
                return 6;
            default:
                return 1;
        }
    }
}
