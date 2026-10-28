package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aagu {
    public static aagz a(aamt aamtVar) {
        agke agkeVarG;
        int i;
        zj zjVar = new zj((short[]) null);
        aamw aamwVar = aamtVar.q;
        if (aamwVar == null || (i = aamwVar.c) == 0) {
            agkeVarG = agpi.a;
        } else {
            agjz agjzVar = new agjz(4);
            if (s(i, 1)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_STARTUP);
            }
            if (s(i, 2)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_NETWORK);
            }
            if (s(i, 4)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_MEDIA);
            }
            if (s(i, 8)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_WIFI);
            }
            if (s(i, 64)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_USER_RESUMED);
            }
            if (s(i, SemanticState.Focused)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_USER_PAUSED);
            }
            if (s(i, SemanticState.Hidden)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_SYSTEM_PAUSED);
            }
            if (s(i, SemanticState.LiveRegion)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_TRANSFER_REMOVED);
            }
            if (s(i, SemanticState.Obscured)) {
                agjzVar.h(aqpd.TRANSFER_STATUS_REASON_PENDING_STORAGE);
            }
            agkeVarG = agjzVar.g();
        }
        if (agkeVarG == null) {
            throw new NullPointerException("Null transferStatusReasons");
        }
        zjVar.c = agkeVarG;
        aamg aamgVar = aamg.DELETED;
        int iOrdinal = aamtVar.n.ordinal();
        if (iOrdinal != 12) {
            switch (iOrdinal) {
                case 1:
                    zjVar.a = aqpc.TRANSFER_STATE_COMPLETE;
                    return zjVar.i();
                case 2:
                    if (aamwVar == null) {
                        zjVar.a = aqpc.TRANSFER_STATE_UNKNOWN;
                        return zjVar.i();
                    }
                    zjVar.a = aamwVar.b;
                    if (aamwVar.g.o()) {
                        zjVar.j(aqpe.TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE);
                    }
                    return zjVar.i();
                case 3:
                case 4:
                    break;
                case 5:
                    zjVar.a = aqpc.TRANSFER_STATE_FAILED;
                    zjVar.j(aqpe.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE);
                    return zjVar.i();
                case 6:
                    zjVar.a = aqpc.TRANSFER_STATE_FAILED;
                    zjVar.j(aqpe.TRANSFER_FAILURE_REASON_NETWORK);
                    return zjVar.i();
                case 7:
                    zjVar.a = aqpc.TRANSFER_STATE_FAILED;
                    zjVar.j(aqpe.TRANSFER_FAILURE_REASON_PLAYABILITY);
                    return zjVar.i();
                case 8:
                    zjVar.a = aqpc.TRANSFER_STATE_PAUSED_BY_USER;
                    return zjVar.i();
                default:
                    zjVar.a = aqpc.TRANSFER_STATE_UNKNOWN;
                    return zjVar.i();
            }
        }
        zjVar.a = aqpc.TRANSFER_STATE_FAILED;
        return zjVar.i();
    }

    public static agke b(aamt aamtVar) {
        aamm aammVar = aamtVar.p;
        if (aammVar == null) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        aaml aamlVar = aammVar.b;
        boolean z = aammVar.e;
        if (aamlVar != null) {
            agjzVar.h(t(aamlVar, 2, z));
        }
        aaml aamlVar2 = aammVar.a;
        if (aamlVar2 != null) {
            agjzVar.h(t(aamlVar2, true != wir.y().contains(Integer.valueOf(aamlVar2.a())) ? 3 : 4, z));
        }
        return agjzVar.g();
    }

    public static boolean c(aohq aohqVar) {
        return aohqVar != null && Collection.EL.stream(aohqVar.getStreamsProgress()).noneMatch(new aaep(2));
    }

    public static boolean d(aqph aqphVar) {
        return aqphVar != null && aqphVar.getTransferState() == aqpc.TRANSFER_STATE_COMPLETE;
    }

    public static final aare e(aaml aamlVar, int i, ArrayList arrayList, int i2) {
        if (i >= 0) {
            return new aare(aamlVar, i, i2, (aods[]) arrayList.toArray(new aods[arrayList.size()]));
        }
        throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
    }

    public static final void f(long j, aaml aamlVar, ArrayList arrayList) {
        aihf aihfVarCreateBuilder = aods.a.createBuilder();
        int iA = aamlVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        aods aodsVar = (aods) aihfVarCreateBuilder.instance;
        aodsVar.b |= 1;
        aodsVar.c = iA;
        aihfVarCreateBuilder.copyOnWrite();
        aods aodsVar2 = (aods) aihfVarCreateBuilder.instance;
        aodsVar2.b |= 2;
        aodsVar2.d = j;
        arrayList.add((aods) aihfVarCreateBuilder.build());
    }

    public static void g(aaci aaciVar) {
        taq.d();
        java.util.Collection collectionB = aaciVar.b();
        collectionB.size();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            h((aach) it.next());
        }
    }

    public static void h(aach aachVar) {
        if (aachVar.g == 0) {
            throw null;
        }
        String str = aachVar.b;
        aachVar.c.size();
    }

    public static ajdb i(ajda ajdaVar) {
        if ((ajdaVar.b & SemanticState.Modal) != 0) {
            apji apjiVar = ajdaVar.s;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajdb.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ajdaVar.s;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajdb.b);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajdb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static ajdd j(ajda ajdaVar) {
        if ((ajdaVar.b & SemanticState.Modal) != 0) {
            apji apjiVar = ajdaVar.s;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajdd.b);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ajdaVar.s;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajdd.b);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajdd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static ajde k(ajda ajdaVar) {
        if ((ajdaVar.b & SemanticState.Modal) != 0) {
            apji apjiVar = ajdaVar.s;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = ajde.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = ajdaVar.s;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                return (ajde) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static boolean l(ajda ajdaVar) {
        alay alayVar;
        if (ajdaVar == null) {
            return false;
        }
        int i = ajdaVar.b;
        if ((i & 2) == 0 && (i & 4) == 0) {
            return false;
        }
        ajcu ajcuVar = ajdaVar.e;
        if (ajcuVar == null) {
            ajcuVar = ajcu.a;
        }
        if ((ajcuVar.b & 16) != 0) {
            alayVar = ajcuVar.g;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return !TextUtils.isEmpty(ackj.k(null, alayVar, null, false));
    }

    public static boolean m(ajda ajdaVar, aduv aduvVar) {
        alay alayVar;
        alay alayVar2;
        ajdd ajddVarJ;
        if (ajdaVar == null || (ajdaVar.b & 1) == 0) {
            return false;
        }
        ajcu ajcuVar = ajdaVar.e;
        if (ajcuVar == null) {
            ajcuVar = ajcu.a;
        }
        if ((ajcuVar.b & 8) != 0) {
            alayVar = ajcuVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        if (TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
            return false;
        }
        if ((ajcuVar.b & 16) != 0) {
            alayVar2 = ajcuVar.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        if (TextUtils.isEmpty(ackj.k(null, alayVar2, null, false)) || (ajddVarJ = j(ajdaVar)) == null || ajddVarJ.d.size() == 0) {
            return false;
        }
        for (apji apjiVar : ajddVarJ.d) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajdc.b);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            ajdc ajdcVar = (ajdc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            if ((ajdcVar.c & 1) == 0) {
                return false;
            }
            alja aljaVar = ajdcVar.d;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            if (aduvVar.a(alizVarA) == 0) {
                return false;
            }
        }
        return true;
    }

    public static aabr n(Intent intent) {
        Bundle extras = intent.getExtras();
        return extras == null ? new aabr("", -666, "") : new aabr(typ.c(extras.getString("notification_tag")), extras.getInt("notification_id", -666), typ.c(extras.getString("client_id")));
    }

    public static agev o(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        Notification notification = statusBarNotification.getNotification();
        return (notification == null || (bundle = notification.extras) == null) ? agdf.a : agev.h(bundle.getString("client_id"));
    }

    public static void p(Intent intent, aabr aabrVar) {
        intent.putExtra("notification_tag", aabrVar.a);
        intent.putExtra("notification_id", aabrVar.b);
        intent.putExtra("client_id", aabrVar.c);
    }

    public static void q(Intent intent, ajwo ajwoVar) {
        if (ajwoVar != null) {
            intent.putExtra("service_endpoint", ajwoVar.toByteArray());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    public static final aapf r(String str, boolean z, boolean z2, aamm aammVar, aadc aadcVar, grj grjVar) {
        boolean z3;
        str.getClass();
        grjVar.getClass();
        boolean zU = u(aammVar.a, z2, grjVar, aadcVar);
        boolean zU2 = u(aammVar.b, z2, grjVar, aadcVar);
        wgs wgsVarD = aammVar.d(aadcVar.i(), z2);
        wgs wgsVarB = aammVar.b(aadcVar.i(), z2);
        wgs wgsVar = null;
        if (!z) {
            if (wgsVarD == null) {
                wgsVar = wgsVarB;
            } else if (wgsVarB != null) {
                if (zU2) {
                    if (zU) {
                        wgsVar = wgsVarB;
                        z3 = true;
                        zU2 = true;
                    } else {
                        wgsVar = wgsVarB;
                        zU2 = true;
                        z3 = false;
                    }
                    zU = zU;
                } else {
                    zU = zU;
                    wgsVar = wgsVarB;
                    z3 = false;
                    zU2 = false;
                }
            }
            z3 = false;
        } else if (zU2) {
            if (wgsVarB != null) {
                wgsVar = wgsVarB;
                z3 = true;
                zU2 = true;
            } else {
                zU2 = true;
                z3 = false;
            }
            zU = zU;
        } else {
            zU = zU;
            wgsVar = wgsVarB;
            z3 = false;
            zU2 = false;
        }
        return new aapf(z3, wgsVarD, wgsVar, zU, zU2);
    }

    private static boolean s(int i, int i2) {
        return (i & i2) == i2;
    }

    private static aqdp t(aaml aamlVar, int i, boolean z) {
        long jB = aamlVar.b();
        aihf aihfVarCreateBuilder = aqdp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar = (aqdp) aihfVarCreateBuilder.instance;
        aqdpVar.b |= 1;
        long j = aamlVar.e;
        aqdpVar.c = j;
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar2 = (aqdp) aihfVarCreateBuilder.instance;
        int i2 = 2;
        aqdpVar2.b |= 2;
        aqdpVar2.d = jB;
        int iA = aamlVar.a();
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar3 = (aqdp) aihfVarCreateBuilder.instance;
        aqdpVar3.b |= 32;
        aqdpVar3.h = iA;
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar4 = (aqdp) aihfVarCreateBuilder.instance;
        aqdpVar4.e = i - 1;
        aqdpVar4.b |= 4;
        if (j == jB) {
            i2 = z ? 3 : 4;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar5 = (aqdp) aihfVarCreateBuilder.instance;
        aqdpVar5.f = i2 - 1;
        aqdpVar5.b |= 8;
        aigj byteString = aamlVar.c.b.toByteString();
        aihfVarCreateBuilder.copyOnWrite();
        aqdp aqdpVar6 = (aqdp) aihfVarCreateBuilder.instance;
        aqdpVar6.b |= 16;
        aqdpVar6.g = byteString;
        return (aqdp) aihfVarCreateBuilder.build();
    }

    private static final boolean u(aaml aamlVar, boolean z, grj grjVar, aadc aadcVar) {
        aare aareVarA;
        char c;
        File file;
        if (aamlVar != null) {
            String strF = aamlVar.f(z);
            for (jsk jskVar : ((aada) aadcVar).io()) {
                if (jskVar != null && jskVar.h().contains(strF)) {
                    if (jskVar.o(strF, 0L, aamlVar.b())) {
                        aareVarA = ((aarf) grjVar.a).a(aamlVar, z);
                        c = (aareVarA == null || aareVarA.c.length == 0) ? (char) 1 : (char) 3;
                    } else {
                        aareVarA = null;
                        c = 2;
                    }
                    try {
                        jsp jspVarC = jskVar.c(strF, 0L);
                        if (jspVarC != null && (file = jspVarC.e) != null && file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                            Environment.isExternalStorageEmulated();
                        }
                    } catch (jsi unused) {
                    }
                    if (c == 3) {
                        aareVarA.getClass();
                        break;
                    }
                    if (c != 1) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
