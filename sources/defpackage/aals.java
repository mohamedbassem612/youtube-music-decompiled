package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aals implements aalm {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/offline/logging/OfflineClientStateProviderLegacyImpl");
    public final agev a;
    public final agev b;
    public final agev c;
    public final aart d;
    public final abxv e;
    private final awmd g;
    private final Executor h;
    private final wco i;

    public aals(Executor executor, abxv abxvVar, awmd awmdVar, agev agevVar, agev agevVar2, wco wcoVar, agev agevVar3, aart aartVar) {
        this.h = executor;
        this.e = abxvVar;
        this.g = awmdVar;
        this.a = agevVar;
        this.b = agevVar2;
        this.i = wcoVar;
        this.c = agevVar3;
        this.d = aartVar;
    }

    public static aqdf b(String str) {
        aihf aihfVarCreateBuilder = aqdf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqdf aqdfVar = (aqdf) aihfVarCreateBuilder.instance;
        aqdfVar.d = 0;
        aqdfVar.b |= 2;
        if (TextUtils.isEmpty(str)) {
            return (aqdf) aihfVarCreateBuilder.build();
        }
        List listH = agfm.b(';').h(str);
        if (listH.size() != 2) {
            return (aqdf) aihfVarCreateBuilder.build();
        }
        if (((String) listH.get(0)).length() < 2) {
            return (aqdf) aihfVarCreateBuilder.build();
        }
        String strSubstring = ((String) listH.get(0)).substring(((String) listH.get(0)).length() - 2);
        if (((String) listH.get(1)).length() <= 0) {
            return (aqdf) aihfVarCreateBuilder.build();
        }
        String strSubstring2 = ((String) listH.get(1)).substring(((String) listH.get(1)).length() - 1);
        try {
            int i = Integer.parseInt(strSubstring, 16);
            aihfVarCreateBuilder.copyOnWrite();
            aqdf aqdfVar2 = (aqdf) aihfVarCreateBuilder.instance;
            aqdfVar2.b |= 1;
            aqdfVar2.c = i;
            int i2 = Integer.parseInt(strSubstring2);
            if (i2 == 1) {
                aihfVarCreateBuilder.copyOnWrite();
                aqdf aqdfVar3 = (aqdf) aihfVarCreateBuilder.instance;
                aqdfVar3.d = 1;
                aqdfVar3.b |= 2;
            } else if (i2 == 2) {
                aihfVarCreateBuilder.copyOnWrite();
                aqdf aqdfVar4 = (aqdf) aihfVarCreateBuilder.instance;
                aqdfVar4.d = 2;
                aqdfVar4.b |= 2;
            } else if (i2 != 3) {
                aihfVarCreateBuilder.copyOnWrite();
                aqdf aqdfVar5 = (aqdf) aihfVarCreateBuilder.instance;
                aqdfVar5.d = 0;
                aqdfVar5.b |= 2;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                aqdf aqdfVar6 = (aqdf) aihfVarCreateBuilder.instance;
                aqdfVar6.d = 3;
                aqdfVar6.b |= 2;
            }
            return (aqdf) aihfVarCreateBuilder.build();
        } catch (NumberFormatException unused) {
            return (aqdf) aihfVarCreateBuilder.build();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(aihf aihfVar, aamt aamtVar) {
        int i;
        aams aamsVar;
        int iA;
        aamw aamwVar;
        aamp aampVar = aamp.DELETED;
        int i2 = 3;
        switch (aamtVar.f()) {
            case DELETED:
                i = 7;
                break;
            case PLAYABLE:
                i = 2;
                break;
            case CANDIDATE:
                i = 18;
                break;
            case TRANSFER_IN_PROGRESS:
            case OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE:
                i = 3;
                break;
            case TRANSFER_WAITING_IN_QUEUE:
                if (aamtVar.q == null && aamtVar.d() == aamtVar.e()) {
                    i = 1;
                } else {
                    i = 10;
                }
                break;
            case TRANSFER_PENDING_USER_APPROVAL:
            case TRANSFER_PENDING_NETWORK:
            case TRANSFER_PENDING_WIFI:
            case TRANSFER_PENDING_STORAGE:
                i = 10;
                break;
            case TRANSFER_PENDING_TOOTHFAIRY:
            default:
                i = 1;
                break;
            case TRANSFER_PAUSED:
                i = 4;
                break;
            case ERROR_PENDING_PLAYABILITY_ACTION:
                i = 17;
                break;
            case ERROR_STREAMS_MISSING:
                i = true == aamtVar.q() ? 19 : 11;
                break;
            case ERROR_NOT_PLAYABLE:
                i = 5;
                break;
            case ERROR_POLICY:
                i = 8;
                break;
            case ERROR_EXPIRED:
            case ERROR_EXPIRED_RENTAL:
                i = 9;
                break;
            case ERROR_NETWORK:
                i = 15;
                break;
            case ERROR_DISK:
            case ERROR_DISK_SD_CARD:
                i = 14;
                break;
            case ERROR_GENERIC:
                i = 6;
                break;
        }
        aihfVar.copyOnWrite();
        aoei aoeiVar = (aoei) aihfVar.instance;
        aoei aoeiVar2 = aoei.a;
        aoeiVar.d = i - 1;
        aoeiVar.b |= 2;
        aams aamsVar2 = aamtVar.m;
        int iG = agvp.G(((aoei) aihfVar.instance).d);
        if (iG == 0 || iG != 8) {
            aamsVar = aamsVar2;
        } else if (aamsVar2 != null) {
            aofp aofpVarA = aofp.a(aamsVar2.c.j);
            if (aofpVarA == null) {
                aofpVarA = aofp.OFFLINE_PLAYBACK_DISABLED_REASON_UNSPECIFIED;
            }
            aihfVar.copyOnWrite();
            aoei aoeiVar3 = (aoei) aihfVar.instance;
            aoeiVar3.w = aofpVarA.m;
            aoeiVar3.b |= 16777216;
            aamsVar = aamsVar2;
        } else {
            aamsVar = null;
        }
        int iG2 = agvp.G(((aoei) aihfVar.instance).d);
        if (iG2 != 0 && iG2 == 5) {
            aofp aofpVar = aofp.OFFLINE_PLAYBACK_DISABLED_REASON_CLIENT_UNPLAYABLE_PLAYER_RESPONSE;
            aihfVar.copyOnWrite();
            aoei aoeiVar4 = (aoei) aihfVar.instance;
            aoeiVar4.w = aofpVar.m;
            aoeiVar4.b |= 16777216;
        }
        int iG3 = agvp.G(((aoei) aihfVar.instance).d);
        if (iG3 != 0 && iG3 == 9) {
            aofp aofpVar2 = aofp.OFFLINE_PLAYBACK_DISABLED_REASON_CLIENT_OFFLINE_CONTENT_EXPIRED;
            aihfVar.copyOnWrite();
            aoei aoeiVar5 = (aoei) aihfVar.instance;
            aoeiVar5.w = aofpVar2.m;
            aoeiVar5.b |= 16777216;
            if (aamsVar2 == null || !aamsVar2.e()) {
                i2 = 1;
            } else if (aamtVar.f() == aamp.ERROR_EXPIRED_RENTAL) {
                i2 = 4;
            } else if (aamsVar2.d()) {
                i2 = 2;
            } else if (!aamsVar2.e()) {
                i2 = 1;
            }
            aihfVar.copyOnWrite();
            aoei aoeiVar6 = (aoei) aihfVar.instance;
            aoeiVar6.x = i2 - 1;
            aoeiVar6.b |= 268435456;
        }
        int iG4 = agvp.G(((aoei) aihfVar.instance).d);
        if (iG4 != 0 && iG4 == 10) {
            boolean zT = aamtVar.t();
            if (aamtVar.s() && (aamwVar = aamtVar.q) != null) {
                iA = zT;
                iA = zT;
                iA = (zT ? 1 : 0) | aalu.a(aamwVar.c);
            }
            iA = zT;
            iA = zT;
            iA = zT;
            aihfVar.copyOnWrite();
            aoei aoeiVar7 = (aoei) aihfVar.instance;
            aoeiVar7.b |= 4;
            aoeiVar7.e = iA;
        }
        aamw aamwVar2 = aamtVar.q;
        if (aamwVar2 != null) {
            long j = aarq.a;
            aamb aambVar = aamwVar2.f;
            String strP = aambVar.p();
            if (!TextUtils.isEmpty(strP)) {
                aihfVar.copyOnWrite();
                aoei aoeiVar8 = (aoei) aihfVar.instance;
                aoeiVar8.b |= 524288;
                aoeiVar8.s = strP;
            }
            long jC = aambVar.c("transfer_last_progress_time_millis");
            if (jC != 0) {
                aihfVar.copyOnWrite();
                aoei aoeiVar9 = (aoei) aihfVar.instance;
                aoeiVar9.b |= 4194304;
                aoeiVar9.v = jC;
            }
        }
        long jD = aamtVar.d();
        aihfVar.copyOnWrite();
        aoei aoeiVar10 = (aoei) aihfVar.instance;
        aoeiVar10.b |= 8;
        aoeiVar10.f = jD;
        long jE = aamtVar.e();
        aihfVar.copyOnWrite();
        aoei aoeiVar11 = (aoei) aihfVar.instance;
        aoeiVar11.b |= 16;
        aoeiVar11.g = jE;
        aohx aohxVar = aamtVar.b;
        aihfVar.copyOnWrite();
        aoei aoeiVar12 = (aoei) aihfVar.instance;
        aoeiVar12.h = aohxVar.l;
        aoeiVar12.b |= 32;
        aofb aofbVarB = aamtVar.o.b();
        aihfVar.copyOnWrite();
        aoei aoeiVar13 = (aoei) aihfVar.instance;
        aoeiVar13.i = aofbVarB.i;
        aoeiVar13.b |= 64;
        long epochMilli = aamtVar.g.toEpochMilli();
        aihfVar.copyOnWrite();
        aoei aoeiVar14 = (aoei) aihfVar.instance;
        aoeiVar14.b |= SemanticState.Focused;
        aoeiVar14.j = epochMilli;
        if (aamsVar != null) {
            aihfVar.copyOnWrite();
            aoei aoeiVar15 = (aoei) aihfVar.instance;
            aoeiVar15.b |= SemanticState.Hidden;
            aoeiVar15.k = aamsVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jA = (aamsVar.a() - aamsVar.f.f().toEpochMilli()) / 1000;
            aihfVar.copyOnWrite();
            aoei aoeiVar16 = (aoei) aihfVar.instance;
            aoeiVar16.b |= SemanticState.LiveRegion;
            aoeiVar16.l = jA;
        }
        long j2 = aamtVar.h;
        aihfVar.copyOnWrite();
        aoei aoeiVar17 = (aoei) aihfVar.instance;
        aoeiVar17.b |= 32768;
        aoeiVar17.o = j2;
        long j3 = ((aohb) aamtVar.a.e).q;
        aihfVar.copyOnWrite();
        aoei aoeiVar18 = (aoei) aihfVar.instance;
        aoeiVar18.b |= SemanticState.ReadOnly;
        aoeiVar18.m = j3;
        boolean z = false;
        boolean z2 = (aamtVar.e || aamtVar.j()) ? false : true;
        aihfVar.copyOnWrite();
        aoei aoeiVar19 = (aoei) aihfVar.instance;
        aoeiVar19.b |= SemanticState.Modal;
        aoeiVar19.n = z2;
        boolean z3 = !aamtVar.a();
        aihfVar.copyOnWrite();
        aoei aoeiVar20 = (aoei) aihfVar.instance;
        aoeiVar20.b |= 65536;
        aoeiVar20.p = z3;
        aamm aammVar = aamtVar.p;
        if (aammVar != null && aammVar.h) {
            z = true;
        }
        aihfVar.copyOnWrite();
        aoei aoeiVar21 = (aoei) aihfVar.instance;
        aoeiVar21.b |= 131072;
        aoeiVar21.q = !z;
        aqdf aqdfVarB = b(aammVar != null ? aammVar.g : null);
        aihfVar.copyOnWrite();
        aoei aoeiVar22 = (aoei) aihfVar.instance;
        aqdfVarB.getClass();
        aoeiVar22.r = aqdfVarB;
        aoeiVar22.b |= 262144;
    }

    @Override // defpackage.aalm
    @Deprecated
    public final aoec a() {
        byte[] bArr = null;
        try {
            aaqn aaqnVarB = ((aanb) this.g.io()).b();
            wcn wcnVarB = this.i.b(aaqnVarB.b());
            ListenableFuture listenableFutureF = aaqnVarB.l().f();
            int i = 6;
            aajs aajsVar = new aajs(this, i);
            Executor executor = this.h;
            ListenableFuture listenableFutureAs = ahno.as(listenableFutureF, aajsVar, executor);
            ListenableFuture listenableFutureB = tzk.b(wcnVarB.q(((Integer) ((agfa) this.c).a).intValue()));
            ListenableFuture listenableFutureK = ahno.av(listenableFutureF, listenableFutureAs, listenableFutureB).k(new hlm(this, listenableFutureF, listenableFutureAs, listenableFutureB, 20), executor);
            ListenableFuture listenableFutureD = aaqnVarB.i().d();
            ListenableFuture listenableFutureAs2 = ahno.as(listenableFutureD, new aajs(this, 5), executor);
            ListenableFuture listenableFutureK2 = ahno.av(listenableFutureAs2, listenableFutureD).k(new aalq(listenableFutureD, listenableFutureAs2, 0), executor);
            ListenableFuture listenableFutureN = ahng.n(aodx.a);
            ListenableFuture listenableFutureB2 = tzk.b(wcnVarB.q(119));
            ListenableFuture listenableFutureAr = ahno.ar(tzk.b(wcnVarB.b(120)), new aakt(7), executor);
            return (aoec) mci.a(ahno.av(listenableFutureF, listenableFutureK, listenableFutureK2, listenableFutureN, listenableFutureB2, listenableFutureAr, ahno.ar(tzk.b(wcnVarB.b(198)), new aakt(8), executor), ahno.ar(ahno.ap(new aalq(this, aaqnVarB.b(), 2, bArr), executor), new aakt(i), executor)).k(new hni((Object) this, (Object) listenableFutureK, listenableFutureAr, listenableFutureK2, (Object) listenableFutureN, 14), executor));
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/offline/logging/OfflineClientStateProviderLegacyImpl", "getOfflineClientState", (char) 430, "OfflineClientStateProviderLegacyImpl.java")).t("[Offline] Error getting offline client state!");
            return null;
        }
    }
}
