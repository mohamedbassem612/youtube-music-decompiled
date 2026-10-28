package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xer implements aupn {
    public static xet b(awmd awmdVar, awmd awmdVar2, ztn ztnVar) {
        if (true != ztnVar.a()) {
            awmdVar = awmdVar2;
        }
        xet xetVar = (xet) awmdVar.io();
        xetVar.getClass();
        return xetVar;
    }

    public static xgo c(Context context, tbt tbtVar, vxu vxuVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, vyo vyoVar, awmd awmdVar4, tqj tqjVar, Object obj, vxz vxzVar) {
        return new xgo(context, tbtVar, vxuVar, awmdVar, awmdVar2, awmdVar3, vyoVar, awmdVar4, tqjVar, (xgl) obj, vxzVar);
    }

    public static xhk d(tqj tqjVar, xhk xhkVar, xhk xhkVar2) {
        tqjVar.getClass();
        xhkVar.getClass();
        xhkVar2.getClass();
        int i = tqr.a;
        return tqjVar.l(1074615367, 254) ? xhkVar2 : xhkVar;
    }

    public static xla e(vxu vxuVar, vyo vyoVar, vxz vxzVar, vxz vxzVar2, Optional optional) {
        vxz vxzVar3;
        long jC;
        vxz vxzVar4;
        agkz agkzVar;
        agkz agkzVar2;
        String str;
        agke agkeVar;
        agke agkeVar2;
        agke agkeVar3;
        agke agkeVar4;
        agke agkeVar5;
        agkz agkzVar3;
        vxuVar.getClass();
        vyoVar.getClass();
        vxzVar2.getClass();
        xlb xlbVar = (xlb) optional.orElse(xlb.a);
        int i = xkx.a;
        ajvu ajvuVarC = vxuVar.c();
        if (ajvuVarC == null) {
            ajvuVarC = ajvu.a;
        }
        anhb anhbVar = ajvuVarC.j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        amzb amzbVar = anhbVar.e;
        if (amzbVar == null) {
            amzbVar = amzb.a;
        }
        xky xkyVar = new xky();
        agke agkeVar6 = agpi.a;
        xkyVar.b(agkeVar6);
        agpr agprVar = agpr.a;
        xkyVar.c(agprVar);
        xkyVar.d(0);
        xkyVar.e(agprVar);
        List list = xla.a;
        xkyVar.i(list);
        xkyVar.j(0);
        xkyVar.n(false);
        xkyVar.p(false);
        xkyVar.o(false);
        xkyVar.w(false);
        xkyVar.x(false);
        xkyVar.z(false);
        xkyVar.A(false);
        xkyVar.B(false);
        xkyVar.D(false);
        xkyVar.E(false);
        xkyVar.L(false);
        xkyVar.M(false);
        xkyVar.R(false);
        xkyVar.l(false);
        xkyVar.S(false);
        xkyVar.T(false);
        xkyVar.U(false);
        xkyVar.V(false);
        xkyVar.Z(false);
        xkyVar.aa(false);
        xkyVar.ab(false);
        xkyVar.ac(false);
        xkyVar.af(false);
        xkyVar.ah(false);
        List list2 = xla.b;
        xkyVar.aj(list2);
        xkyVar.ak(agprVar);
        xkyVar.al(0);
        xkyVar.am(false);
        xkyVar.an(0);
        xkyVar.ao(0);
        xkyVar.ap(0);
        xkyVar.aq(0);
        xkyVar.ar(0);
        xkyVar.as("");
        xkyVar.at(0);
        xkyVar.au(false);
        xkyVar.av(0L);
        xkyVar.aA(false);
        xkyVar.aG(0L);
        xkyVar.aH(0);
        xkyVar.aI(0);
        xkyVar.aM(0);
        xkyVar.aN(0);
        xkyVar.aJ(0L);
        xkyVar.aK(0L);
        xkyVar.aL(0.0d);
        xkyVar.q(false);
        xkyVar.az(0L);
        xkyVar.X(false);
        xkyVar.aC(agkeVar6);
        xkyVar.W(false);
        xkyVar.aB(agkeVar6);
        xkyVar.k(false);
        xkyVar.r(true);
        xkyVar.ad(false);
        xkyVar.N(false);
        xkyVar.aF(false);
        xkyVar.K(false);
        xkyVar.ae(true);
        xkyVar.Q(false);
        xkyVar.O(false);
        xkyVar.F(false);
        xkyVar.J(false);
        xkyVar.P(false);
        xkyVar.aD(false);
        xkyVar.I(true);
        long jC2 = 10;
        xkyVar.g(10L);
        xkyVar.f(10L);
        xkyVar.ag(false);
        xkyVar.aE(3L);
        xkyVar.a(0L);
        xkyVar.h(10L);
        xkyVar.C(false);
        xkyVar.u(false);
        xkyVar.H(false);
        xkyVar.s(false);
        xkyVar.ai(false);
        xkyVar.G(false);
        xkyVar.m(false);
        xkyVar.Y(false);
        xkyVar.t(false);
        xkyVar.aw(0L);
        xkyVar.v(false);
        xkyVar.ay(0L);
        xkyVar.ax(0L);
        xkyVar.y(false);
        xkyVar.c(agkz.n(amzbVar.b));
        xkyVar.ak(agkz.n(amzbVar.d));
        amzc amzcVar = amzbVar.c;
        if (amzcVar == null) {
            amzcVar = amzc.a;
        }
        if ((amzcVar.b & 4) != 0) {
            amzc amzcVar2 = amzbVar.c;
            if (amzcVar2 == null) {
                amzcVar2 = amzc.a;
            }
            amza amzaVar = amzcVar2.c;
            if (amzaVar == null) {
                amzaVar = amza.a;
            }
            xkyVar.af(amzaVar.b);
            xkyVar.V(amzaVar.c);
            xkyVar.am(amzaVar.e);
            xkyVar.as(amzaVar.f);
            xkyVar.I(amzaVar.d);
        }
        amya amyaVar = ajvuVarC.m;
        if (amyaVar == null) {
            amyaVar = amya.a;
        }
        xkyVar.R(Build.VERSION.SDK_INT > 32 && (amyaVar.p || xlbVar == xlb.b));
        xkyVar.l(vxzVar2.l(50, 45388681L, false));
        xkyVar.B(Build.VERSION.SDK_INT >= 30 && amyaVar.H);
        xkyVar.L(amyaVar.g);
        xkyVar.D(amyaVar.h);
        xkyVar.au(amyaVar.b);
        xkyVar.Z(amyaVar.e);
        xkyVar.U(amyaVar.d);
        xkyVar.ac(amyaVar.i);
        xkyVar.ah(amyaVar.j);
        xkyVar.at(amyaVar.f);
        xkyVar.aq(amyaVar.c);
        xkyVar.aa(amyaVar.r);
        xkyVar.aA(amyaVar.l);
        xkyVar.T(amyaVar.k);
        xkyVar.S(amyaVar.m);
        xkyVar.ab(amyaVar.q);
        xkyVar.av(amyaVar.n);
        xkyVar.E(amyaVar.o);
        xkyVar.ar(amyaVar.t);
        int i2 = amyaVar.s;
        if (i2 <= 0) {
            i2 = 14;
        }
        xkyVar.d(i2);
        xkyVar.ap(amyaVar.u);
        xkyVar.ao(amyaVar.v);
        xkyVar.al(amyaVar.w);
        xkyVar.an(amyaVar.x);
        xkyVar.j(amyaVar.y);
        if (!amyaVar.z.isEmpty()) {
            list = amyaVar.z;
        }
        xkyVar.i(list);
        xkyVar.aI(amyaVar.A);
        xkyVar.aN(amyaVar.B);
        xkyVar.aM(amyaVar.C);
        xkyVar.aH(amyaVar.E);
        xkyVar.p(amyaVar.D);
        xkyVar.w(amyaVar.F);
        xkyVar.x(amyaVar.K);
        xkyVar.b(amyaVar.G);
        xkyVar.M(amyaVar.J);
        xkyVar.o(vxzVar.l(0, 45354180L, false));
        if (vxzVar.q(0, 45354182L).b.size() > 0) {
            list2 = vxzVar.q(0, 45354182L).b;
        }
        xkyVar.aj(list2);
        xkyVar.n(vxzVar.l(1, 45354314L, false));
        xkyVar.aJ(vxzVar.c(0, 45354799L, 0L));
        xkyVar.aK(vxzVar.c(1, 45354800L, 0L));
        xkyVar.aL(vxzVar.a(0, 45354801L, 0.0d));
        xkyVar.aG(vxzVar.c(2, 45355275L, 0L));
        xkyVar.q(vxzVar.l(3, 45355480L, false));
        xkyVar.z(vxzVar.l(9, 45358062L, false));
        xkyVar.A(vxzVar2.l(63, 45411558L, false));
        xkyVar.az(vxzVar.c(3, 45358237L, 0L));
        xkyVar.X(vxzVar.l(11, 45358681L, false));
        xkyVar.aC(vxzVar.q(1, 45358752L).b);
        xkyVar.W(vxzVar.l(12, 45359085L, false));
        xkyVar.aB(vxzVar2.q(3, 45360201L).b);
        xkyVar.k(vxzVar2.l(9, 45359474L, false));
        xkyVar.e(agkz.n(vxzVar2.q(0, 45359536L).b));
        xkyVar.r(amyaVar.I);
        xkyVar.ad(vxzVar2.l(10, 45360224L, false));
        xkyVar.N(vxzVar2.l(11, 45360273L, false));
        xkyVar.aF(vxzVar2.l(15, 45362387L, false));
        xkyVar.K(vxzVar2.l(19, 45364190L, false));
        xkyVar.ae(!vxzVar2.l(21, 45366937L, false));
        xkyVar.Q(vxzVar2.l(24, 45368785L, false));
        xkyVar.O(vxzVar2.l(34, 45374998L, false));
        xkyVar.F(vxzVar2.l(40, 45383016L, false));
        xkyVar.J(vxzVar2.l(42, 45383916L, false));
        xkyVar.P(vxzVar2.l(45, 45385638L, false));
        xkyVar.aD(vxzVar2.l(46, 45385686L, false));
        xkyVar.g(vxzVar2.c(5, 45400396L, 0L) > 0 ? vxzVar2.c(5, 45400396L, 0L) : 10L);
        xkyVar.f(vxzVar2.c(6, 45400397L, 0L) > 0 ? vxzVar2.c(6, 45400397L, 0L) : 10L);
        if (vxzVar2.c(7, 45400398L, 0L) > 0) {
            vxzVar3 = vxzVar2;
            jC = vxzVar3.c(7, 45400398L, 0L);
        } else {
            vxzVar3 = vxzVar2;
            jC = 3;
        }
        xkyVar.aE(jC);
        xkyVar.ag(vxzVar3.l(59, 45401988L, false));
        xkyVar.a(Math.max(vxzVar3.c(8, 45407158L, 0L), 0L));
        if (vxzVar2.c(9, 45407159L, 0L) > 0) {
            vxzVar4 = vxzVar2;
            jC2 = vxzVar4.c(9, 45407159L, 0L);
        } else {
            vxzVar4 = vxzVar2;
        }
        xkyVar.h(jC2);
        xkyVar.C(vxzVar4.l(66, 45412870L, false));
        xkyVar.u(vxzVar4.l(69, 45414067L, false));
        xkyVar.H(vxzVar4.l(109, 45619623L, false));
        xkyVar.s(vxzVar4.l(72, 45415079L, false));
        xkyVar.ai(vxzVar4.l(90, 45427655L, false));
        xkyVar.G(vxzVar4.l(92, 45430115L, false));
        xkyVar.m(vxzVar4.l(71, 45414906L, false));
        xkyVar.Y(vxzVar4.l(100, 45461718L, false));
        xkyVar.t(vxzVar4.l(105, 45615440L, false));
        xkyVar.aw(vxzVar4.c(11, 45616010L, 0L));
        xkyVar.v(vxzVar4.l(107, 45618306L, false));
        xkyVar.ay(vxzVar4.c(12, 45617024L, 0L));
        xkyVar.ax(vxzVar2.c(13, 45617025L, 0L));
        xkyVar.y(vxzVar2.l(113, 45622273L, false));
        if (xkyVar.aO == -1 && xkyVar.aP == -1 && xkyVar.aQ == 524287 && (agkzVar = xkyVar.a) != null && (agkzVar2 = xkyVar.b) != null && (str = xkyVar.f) != null && (agkeVar = xkyVar.F) != null && (agkeVar2 = xkyVar.N) != null && (agkeVar3 = xkyVar.U) != null && (agkeVar4 = xkyVar.ac) != null && (agkeVar5 = xkyVar.ae) != null && (agkzVar3 = xkyVar.ag) != null) {
            return new xkz(agkzVar, agkzVar2, xkyVar.c, xkyVar.d, xkyVar.e, str, xkyVar.g, xkyVar.h, xkyVar.i, xkyVar.j, xkyVar.k, xkyVar.l, xkyVar.m, xkyVar.n, xkyVar.o, xkyVar.p, xkyVar.q, xkyVar.r, xkyVar.s, xkyVar.t, xkyVar.u, xkyVar.v, xkyVar.w, xkyVar.x, xkyVar.y, xkyVar.z, xkyVar.A, xkyVar.B, xkyVar.C, xkyVar.D, xkyVar.E, agkeVar, xkyVar.G, xkyVar.H, xkyVar.I, xkyVar.J, xkyVar.K, xkyVar.L, xkyVar.M, agkeVar2, xkyVar.O, xkyVar.P, xkyVar.Q, xkyVar.R, xkyVar.S, xkyVar.T, agkeVar3, xkyVar.V, xkyVar.W, xkyVar.X, xkyVar.Y, xkyVar.Z, xkyVar.aa, xkyVar.ab, agkeVar4, xkyVar.ad, agkeVar5, xkyVar.af, agkzVar3, xkyVar.ah, xkyVar.ai, xkyVar.aj, xkyVar.ak, xkyVar.al, xkyVar.am, xkyVar.an, xkyVar.ao, xkyVar.ap, xkyVar.aq, xkyVar.ar, xkyVar.as, xkyVar.at, xkyVar.au, xkyVar.av, xkyVar.aw, xkyVar.ax, xkyVar.ay, xkyVar.az, xkyVar.aA, xkyVar.aB, xkyVar.aC, xkyVar.aD, xkyVar.aE, xkyVar.aF, xkyVar.aG, xkyVar.aH, xkyVar.aI, xkyVar.aJ, xkyVar.aK, xkyVar.aL, xkyVar.aM, xkyVar.aN);
        }
        StringBuilder sb = new StringBuilder();
        if (xkyVar.a == null) {
            sb.append(" capabilities");
        }
        if (xkyVar.b == null) {
            sb.append(" experiments");
        }
        if ((xkyVar.aO & 1) == 0) {
            sb.append(" enableSkippableAds");
        }
        if ((xkyVar.aO & 2) == 0) {
            sb.append(" enablePlaylistModes");
        }
        if ((xkyVar.aO & 4) == 0) {
            sb.append(" isLivingRoomNotificationsEnabled");
        }
        if (xkyVar.f == null) {
            sb.append(" mdxImpactedSessionsServerEvent");
        }
        if ((xkyVar.aO & 8) == 0) {
            sb.append(" enableErrorDialogForMdxConnections");
        }
        if ((xkyVar.aO & 16) == 0) {
            sb.append(" enableCastToNative");
        }
        if ((xkyVar.aO & 32) == 0) {
            sb.append(" mdxSmartRemoteEnableMealbar");
        }
        if ((xkyVar.aO & 64) == 0) {
            sb.append(" enableRemoteButtonsInCastDialog");
        }
        if ((xkyVar.aO & SemanticState.Focused) == 0) {
            sb.append(" enablePersistentCastIcon");
        }
        if ((xkyVar.aO & SemanticState.Hidden) == 0) {
            sb.append(" enableSeamlessDelegateAccountSignInFix");
        }
        if ((xkyVar.aO & SemanticState.LiveRegion) == 0) {
            sb.append(" enableWoL");
        }
        if ((xkyVar.aO & SemanticState.ReadOnly) == 0) {
            sb.append(" mdxNotificationsMaxDetectedScreensNum");
        }
        if ((xkyVar.aO & SemanticState.Modal) == 0) {
            sb.append(" prioritizeMobileSenderPlaybackStateOnConnection");
        }
        if ((xkyVar.aO & SemanticState.Obscured) == 0) {
            sb.append(" enableRemoteDeviceContext");
        }
        if ((xkyVar.aO & SemanticState.Multiline) == 0) {
            sb.append(" mdxAssistedSignInQuietPeriodDays");
        }
        if ((xkyVar.aO & 16384) == 0) {
            sb.append(" enablePassiveSignIn");
        }
        if ((xkyVar.aO & 32768) == 0) {
            sb.append(" enableMediaRouteProviderService");
        }
        if ((xkyVar.aO & 65536) == 0) {
            sb.append(" enableRetryOnCastConnectionFailure");
        }
        if ((xkyVar.aO & 131072) == 0) {
            sb.append(" oauthTokenRefreshIntervalMs");
        }
        if ((xkyVar.aO & 262144) == 0) {
            sb.append(" enableClearOauthTokenOnAuthError");
        }
        if ((xkyVar.aO & 524288) == 0) {
            sb.append(" enableMediaRouteOutputSwitcher");
        }
        if ((xkyVar.aO & 1048576) == 0) {
            sb.append(" disableOutputSwitcherForegroundUmo");
        }
        if ((xkyVar.aO & 2097152) == 0) {
            sb.append(" connectionFailureMaxRetryAttempt");
        }
        if ((xkyVar.aO & 4194304) == 0) {
            sb.append(" mdxHeartbeatIntervalMinutes");
        }
        if ((xkyVar.aO & 8388608) == 0) {
            sb.append(" loungeTokenPollingTimeoutMs");
        }
        if ((xkyVar.aO & 16777216) == 0) {
            sb.append(" loungeTokenPollingMaxRetries");
        }
        if ((xkyVar.aO & 33554432) == 0) {
            sb.append(" hangingGetToLoungeTimeoutMs");
        }
        if ((xkyVar.aO & 67108864) == 0) {
            sb.append(" joinLoungeMaxRetries");
        }
        if ((xkyVar.aO & 134217728) == 0) {
            sb.append(" dialScreenIdPollingTimeoutMs");
        }
        if (xkyVar.F == null) {
            sb.append(" dialScreenIdPollingIntervalsMs");
        }
        if ((xkyVar.aO & 268435456) == 0) {
            sb.append(" wolMagicPacketBroadcastIntervalMs");
        }
        if ((xkyVar.aO & 536870912) == 0) {
            sb.append(" wolStatusCheckIntervalMs");
        }
        if ((xkyVar.aO & 1073741824) == 0) {
            sb.append(" wolStatusCheckDefaultTimeoutMs");
        }
        if ((xkyVar.aO & Integer.MIN_VALUE) == 0) {
            sb.append(" wolCacheEntryDurationMs");
        }
        if ((xkyVar.aP & 1) == 0) {
            sb.append(" disableSavedDialScreenId");
        }
        if ((xkyVar.aP & 2) == 0) {
            sb.append(" enableAutoconnectPrompt");
        }
        if ((xkyVar.aP & 4) == 0) {
            sb.append(" enableAutoconnectPromptCounterfactual");
        }
        if (xkyVar.N == null) {
            sb.append(" blockedDialModels");
        }
        if ((xkyVar.aP & 8) == 0) {
            sb.append(" enableCastSettingsPrompt");
        }
        if ((xkyVar.aP & 16) == 0) {
            sb.append(" enableGetScreenAvailabilityRequestWithExtraInfo");
        }
        if ((xkyVar.aP & 32) == 0) {
            sb.append(" wolSmartFilteringEffectiveLogDurationHour");
        }
        if ((xkyVar.aP & 64) == 0) {
            sb.append(" wolSmartFilteringEffectiveUsageCount");
        }
        if ((xkyVar.aP & SemanticState.Focused) == 0) {
            sb.append(" wolSmartFilteringSuccessRateThreshold");
        }
        if ((xkyVar.aP & SemanticState.Hidden) == 0) {
            sb.append(" disableSaveSessionStarting");
        }
        if (xkyVar.U == null) {
            sb.append(" expectedDisconnectReasonList");
        }
        if ((xkyVar.aP & SemanticState.LiveRegion) == 0) {
            sb.append(" disableRelaunchingCastAppForSingleUserSessions");
        }
        if ((xkyVar.aP & SemanticState.ReadOnly) == 0) {
            sb.append(" sessionRecoveryExpirationTimeMs");
        }
        if ((xkyVar.aP & SemanticState.Modal) == 0) {
            sb.append(" disableWolOnUnknownReceiver");
        }
        if ((xkyVar.aP & SemanticState.Obscured) == 0) {
            sb.append(" enableCastAuthErrorDialog");
        }
        if ((xkyVar.aP & SemanticState.Multiline) == 0) {
            sb.append(" enableCastSessionRecoveryFix");
        }
        if ((xkyVar.aP & 16384) == 0) {
            sb.append(" postConnectionReceiverStatusCheckTimeoutMs");
        }
        if ((xkyVar.aP & 32768) == 0) {
            sb.append(" enableReceiverPingAndroidDial");
        }
        if (xkyVar.ac == null) {
            sb.append(" receiverPingAndroidDialAllowedReasonList");
        }
        if ((xkyVar.aP & 65536) == 0) {
            sb.append(" enableReceiverPingAndroidCast");
        }
        if (xkyVar.ae == null) {
            sb.append(" receiverPingAndroidCastAllowedReasonList");
        }
        if ((xkyVar.aP & 131072) == 0) {
            sb.append(" disableDialStatusCheckOnRecovery");
        }
        if (xkyVar.ag == null) {
            sb.append(" dialDelayedRetryDisconnectReasonList");
        }
        if ((xkyVar.aP & 262144) == 0) {
            sb.append(" disconnectWhenDialAppStatusIsUnknown");
        }
        if ((xkyVar.aP & 524288) == 0) {
            sb.append(" enableServerVerifiedSessionDeletion");
        }
        if ((xkyVar.aP & 1048576) == 0) {
            sb.append(" enableIdentityMatchingCheckForDial");
        }
        if ((xkyVar.aP & 2097152) == 0) {
            sb.append(" saveCloudScreenInfoInLocalStorageForSmoothPairingOnVerticals");
        }
        if ((xkyVar.aP & 4194304) == 0) {
            sb.append(" enableDisconnectStrategyNonAtvChromecastsStopReceiver");
        }
        if ((xkyVar.aP & 8388608) == 0) {
            sb.append(" enableSetStopReceiverAppOnDisconnectInCloudSessionDisconnect");
        }
        if ((xkyVar.aP & 16777216) == 0) {
            sb.append(" enableMdxSourceContainerId");
        }
        if ((xkyVar.aP & 33554432) == 0) {
            sb.append(" enableLaunchingKabukiAppOnDialForMusic");
        }
        if ((xkyVar.aP & 67108864) == 0) {
            sb.append(" enableConnectionToClassicKabuki");
        }
        if ((xkyVar.aP & 134217728) == 0) {
            sb.append(" enableDevicePicker");
        }
        if ((xkyVar.aP & 268435456) == 0) {
            sb.append(" enableMdxContextAccuracyImprovement");
        }
        if ((xkyVar.aP & 536870912) == 0) {
            sb.append(" removeCancelButtonFromSuggestedCastDevice");
        }
        if ((xkyVar.aP & 1073741824) == 0) {
            sb.append(" enableContinueWatchingOnTvNotifications");
        }
        if ((xkyVar.aP & Integer.MIN_VALUE) == 0) {
            sb.append(" dialRefreshIntervalSeconds");
        }
        if ((xkyVar.aQ & 1) == 0) {
            sb.append(" dialRefreshDelaySeconds");
        }
        if ((xkyVar.aQ & 2) == 0) {
            sb.append(" requestsPerDialSearch");
        }
        if ((xkyVar.aQ & 4) == 0) {
            sb.append(" enableWifiTriggerDialSearch");
        }
        if ((xkyVar.aQ & 8) == 0) {
            sb.append(" activeMdxUserThresholdDays");
        }
        if ((xkyVar.aQ & 16) == 0) {
            sb.append(" dialRefreshIntervalSecondsForActiveMdxUser");
        }
        if ((xkyVar.aQ & 32) == 0) {
            sb.append(" enableCastStartTimeFix");
        }
        if ((xkyVar.aQ & 64) == 0) {
            sb.append(" enableAndroidNonCastSdkSessionRecoverer");
        }
        if ((xkyVar.aQ & SemanticState.Focused) == 0) {
            sb.append(" enableContinueWatchingOnTvFix");
        }
        if ((xkyVar.aQ & SemanticState.Hidden) == 0) {
            sb.append(" enableAndroidCastDiscoveryAppVisibilityFix");
        }
        if ((xkyVar.aQ & SemanticState.LiveRegion) == 0) {
            sb.append(" enableYtvMobileHandoffRetrieveAction");
        }
        if ((xkyVar.aQ & SemanticState.ReadOnly) == 0) {
            sb.append(" enableConnectionTypeFlowableForSessionRecovery");
        }
        if ((xkyVar.aQ & SemanticState.Modal) == 0) {
            sb.append(" disablePlayQueueDialog");
        }
        if ((xkyVar.aQ & SemanticState.Obscured) == 0) {
            sb.append(" enableRecoveryForHandoffFlows");
        }
        if ((xkyVar.aQ & SemanticState.Multiline) == 0) {
            sb.append(" enableAndroidHandoffRequireNoChildIdentityFix");
        }
        if ((xkyVar.aQ & 16384) == 0) {
            sb.append(" onUserActivityPollingIntervalSeconds");
        }
        if ((xkyVar.aQ & 32768) == 0) {
            sb.append(" enableAndroidPassiveSignInFrequencyFix");
        }
        if ((xkyVar.aQ & 65536) == 0) {
            sb.append(" passiveSignInQuietPeriodSeconds");
        }
        if ((xkyVar.aQ & 131072) == 0) {
            sb.append(" passiveSignInDismissedQuietPeriodSeconds");
        }
        if ((xkyVar.aQ & 262144) == 0) {
            sb.append(" enableCastAdditionalDataTvsignin");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static String f(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("MdxDeviceAllowlist", "");
        string.getClass();
        return string;
    }

    public static xwv g(awmd awmdVar, xmr xmrVar) {
        boolean z = xmrVar.h;
        xwv xwvVar = (xwv) awmdVar.io();
        xwvVar.getClass();
        return xwvVar;
    }

    public static xtl h(vxz vxzVar, awmd awmdVar) {
        xtl xtpVar = vxzVar.l(42, 45383916L, false) ? (xtl) awmdVar.io() : new xtp();
        xtpVar.getClass();
        return xtpVar;
    }

    public static did i(String str) {
        heg hegVar = new heg((char[]) null);
        hegVar.m(str);
        hegVar.m("android.media.intent.category.LIVE_AUDIO");
        hegVar.m(new hed("2DB7CC49", (Collection) null).k());
        did didVarK = hegVar.k();
        didVarK.getClass();
        return didVarK;
    }

    public static zgf j(yfu yfuVar, aunn aunnVar, zjr zjrVar) {
        zgf zgfVar = yfuVar;
        if (zjrVar.j.m(98, 45402481L)) {
            yfo yfoVar = (yfo) aunnVar.io();
            zkf.d(yfoVar);
            zgfVar = yfoVar;
        }
        zgfVar.getClass();
        return zgfVar;
    }

    public static Executor k(Executor executor, Executor executor2, zjr zjrVar) {
        int i = 1;
        if ((zjrVar.R().b & 16777216) != 0) {
            ajce ajceVar = zjrVar.R().r;
            if (ajceVar == null) {
                ajceVar = ajce.a;
            }
            int iBc = a.bc(ajceVar.b);
            if (iBc != 0) {
                i = iBc;
            }
        }
        if (!zjrVar.j.m(188, 45620011L)) {
            zkf.d(executor2);
            int i2 = i - 1;
            if (i2 != 2) {
                if (i2 == 3) {
                    executor2 = new szx(4, new szw(3, "mediaCronetResp"));
                } else if (i2 == 4) {
                    executor = new szx(4, new szw(0, "mediaCronetResp"));
                }
                executor = executor2;
            } else {
                executor = new szx(4, new szw(6, "mediaCronetResp"));
            }
        }
        executor.getClass();
        return executor;
    }

    public static zgy l(xeu xeuVar, wis wisVar, zin zinVar, zjr zjrVar, agfr agfrVar) {
        if (!zjrVar.aF()) {
            agfrVar = new xjr(2);
        }
        return new zil(zinVar, xeuVar, false, agfrVar, 3, wisVar);
    }

    public static void m(vyo vyoVar, tgr tgrVar) {
        anin aninVar = vyoVar.b().g;
        if (aninVar == null) {
            aninVar = anin.a;
        }
        aoba aobaVar = aninVar.f;
        if (aobaVar == null) {
            aobaVar = aoba.a;
        }
        tgrVar.b(aobaVar.c * aobaVar.b);
        tgrVar.getClass();
    }

    public static zfs n(zjr zjrVar, aunn aunnVar, aunn aunnVar2) {
        if (true == zjrVar.bL()) {
            aunnVar = aunnVar2;
        }
        zfs zfsVar = (zfs) aunnVar.io();
        zfsVar.getClass();
        return zfsVar;
    }

    public static mbc o(vyo vyoVar, tyq tyqVar, zjg zjgVar) {
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        apbx apbxVar = anewVar.d;
        if (apbxVar == null) {
            apbxVar = apbx.b;
        }
        int iAS = a.aS(apbxVar.g);
        if (iAS == 0) {
            iAS = 1;
        }
        mbc mbcVar = tyqVar;
        if (iAS - 1 == 2) {
            mbcVar = zjgVar;
        }
        mbcVar.getClass();
        return mbcVar;
    }

    public static ztf p(awmd awmdVar, awmd awmdVar2, ztn ztnVar) {
        if (true == ztnVar.a()) {
            awmdVar = awmdVar2;
        }
        ztf ztfVar = (ztf) awmdVar.io();
        ztfVar.getClass();
        return ztfVar;
    }

    public static qrx q(Context context, String str, ahex ahexVar, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mdx");
        qpqVar.d("device_management.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = str;
        qrnVar.b();
        qrnVar.d("youtube.mdx:dial_devices");
        qrnVar.e(new xwf());
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(atpa.a);
        qrlVarA.b(qrpVarA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static qrx r(Context context, String str, ahex ahexVar, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("mdx");
        qpqVar.d("manual_pairing_screens.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVar = new qrn(context.getApplicationContext(), ahexVar);
        qrnVar.c = str;
        qrnVar.b();
        qrnVar.d("deviceIds", "screenIds", "screenNames");
        qrnVar.e(new tpi(3));
        qrp qrpVarA = qrnVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(ainm.a);
        qrlVarA.b(qrpVarA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static hed s(Optional optional, hed hedVar) {
        hed hedVar2 = (hed) optional.orElse(hedVar);
        hedVar2.getClass();
        return hedVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [abvn, java.lang.Object] */
    public static abvn t(ci ciVar) {
        ciVar.getClass();
        return ciVar.a;
    }

    public static xeq u(Object obj, ztf ztfVar, xet xetVar, zwb zwbVar, ci ciVar, mbc mbcVar, tun tunVar, tag tagVar, Optional optional, vxz vxzVar, dov dovVar) {
        return new xeq((xev) obj, ztfVar, xetVar, zwbVar, ciVar, mbcVar, tunVar, tagVar, optional, vxzVar, dovVar);
    }

    public static xfc v(xdz xdzVar, Object obj, xic xicVar, wrg wrgVar, zwb zwbVar, ci ciVar, zrs zrsVar, tag tagVar, ztf ztfVar, Executor executor) {
        return new xfc(xdzVar, (xev) obj, xicVar, wrgVar, zwbVar, ciVar, zrsVar, tagVar, ztfVar, executor);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
