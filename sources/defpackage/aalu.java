package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aalu {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/logging/OfflineLoggingUtil");

    public static int a(int i) {
        int i2 = (i & 8) != 0 ? 2 : 0;
        if ((i & 2) != 0) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            i2 |= 16;
        }
        if ((i & SemanticState.Focused) != 0) {
            i2 |= 64;
        }
        return (i & SemanticState.Obscured) != 0 ? i2 | SemanticState.Hidden : i2;
    }

    public static boolean b(aamb aambVar) {
        long j = aarq.a;
        int iB = aambVar.b("transfer_type", 0);
        return (iB == 3 || iB == 4) && !TextUtils.isEmpty(aarq.e(aambVar));
    }

    public static aihf c(aamw aamwVar) {
        aihf aihfVarCreateBuilder = aogy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar = (aogy) aihfVarCreateBuilder.instance;
        aogyVar.b |= SemanticState.Hidden;
        aogyVar.k = aamwVar.d / 1024;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar2 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar2.b |= SemanticState.ReadOnly;
        aogyVar2.m = aamwVar.e / 1024;
        long j = aarq.a;
        aamb aambVar = aamwVar.f;
        int iB = aambVar.b("transfer_type", 0);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar3 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar3.b |= 32768;
        int i = 3;
        aogyVar3.q = iB == 3;
        boolean zM = aambVar.m("triggered_by_refresh", false);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar4 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar4.b |= 33554432;
        aogyVar4.w = zM;
        aohx aohxVarC = aaus.c(aambVar.a("stream_quality"));
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar5 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar5.t = aohxVarC.l;
        aogyVar5.b |= 1048576;
        aodp aodpVarB = aarq.b(aambVar);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar6 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar6.u = aodpVarB.e;
        aogyVar6.b |= 2097152;
        aofb aofbVarC = aarq.c(aambVar);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar7 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar7.r = aofbVarC.i;
        aogyVar7.b |= 65536;
        int iB2 = aambVar.b("transfer_type", 0);
        if (iB2 == 0) {
            i = 1;
        } else if (iB2 == 1) {
            i = 2;
        } else if (iB2 != 2) {
            if (iB2 == 3) {
                i = 4;
            } else if (iB2 != 4) {
                i = 7;
                if (iB2 != 6) {
                    if (iB2 != 7) {
                        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/logging/OfflineLoggingUtil", "convertTransferTypeIntToEnum", 133, "OfflineLoggingUtil.java")).t("Unrecognized offline transfer type, defaulting to unknown.");
                        i = 1;
                    } else {
                        i = 8;
                    }
                }
            } else {
                i = 5;
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar8 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar8.x = i - 1;
        aogyVar8.c |= 2;
        String strE = aarq.e(aambVar);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar9 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar9.b |= 1;
        aogyVar9.d = strE;
        String strP = aambVar.p();
        if (!TextUtils.isEmpty(strP)) {
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar10 = (aogy) aihfVarCreateBuilder.instance;
            aogyVar10.b |= 2;
            aogyVar10.e = strP;
        }
        String strF = aambVar.f("partial_playback_nonce");
        if (strF != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar11 = (aogy) aihfVarCreateBuilder.instance;
            aogyVar11.b |= 4;
            aogyVar11.f = strF;
        }
        String strD = aarq.d(aambVar);
        if (strD != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar12 = (aogy) aihfVarCreateBuilder.instance;
            aogyVar12.b |= 524288;
            aogyVar12.s = strD;
        }
        byte[] bArrN = aambVar.n("logging_params");
        if (bArrN != null) {
            aigj aigjVarV = aigj.v(bArrN);
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar13 = (aogy) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            aogyVar13.c |= 32;
            aogyVar13.z = aigjVarV;
        }
        return aihfVarCreateBuilder;
    }
}
