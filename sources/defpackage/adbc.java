package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.NativeThemeProviderWrapper;
import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbc implements aupn {
    public static ComponentConfig b(vxz vxzVar) {
        int i = adba.a;
        nxx nxxVarA = nxx.a();
        nxxVarA.t();
        nxxVarA.x(true);
        nxxVarA.u(vxzVar.l(45, 45376748L, false));
        nxxVarA.s(vxzVar.l(304, 45704411L, false));
        nxxVarA.q(vxzVar.l(484, 45823408L, false));
        nxxVarA.v(vxzVar.l(63, 45385642L, false));
        nxxVarA.h((int) vxzVar.c(10, 45397744L, 0L));
        nxxVarA.l(vxzVar.l(306, 45706796L, false));
        nxxVarA.n(vxzVar.l(285, 45685770L, false));
        nxxVarA.e(vxzVar.l(298, 45700131L, false));
        nxxVarA.o(vxzVar.l(284, 45685769L, false));
        nxxVarA.r(vxzVar.l(302, 45702955L, false));
        nxxVarA.g(vxzVar.l(307, 45706861L, false));
        nxxVarA.f(vxzVar.l(316, 45713110L, false));
        nxxVarA.p(vxzVar.l(331, 45721069L, false));
        nxxVarA.w(vxzVar.l(346, 45728244L, false));
        nxxVarA.m(vxzVar.l(377, 45743512L, false));
        nxxVarA.k(vxzVar.l(471, 45811308L, false));
        nxxVarA.j(vxzVar.l(489, 45825861L, false));
        nxxVarA.i(vxzVar.l(SemanticState.LiveRegion, 45833856L, false));
        nxxVarA.d((int) vxzVar.c(53, 45833857L, 0L));
        nxxVarA.c((int) vxzVar.c(54, 45833858L, 0L));
        return nxxVarA.b();
    }

    public static CapabilitiesStore c(vxz vxzVar, agev agevVar) {
        int i = adba.a;
        Boolean bool = Boolean.FALSE;
        bool.booleanValue();
        CapabilitiesStore capabilitiesStoreCreate = CapabilitiesStore.create(((Boolean) agevVar.e(bool)).booleanValue(), true, vxzVar.l(357, 45732105L, false));
        capabilitiesStoreCreate.getClass();
        return capabilitiesStoreCreate;
    }

    public static nuc d(aunn aunnVar) {
        int i = adba.a;
        nuc nucVar = (nuc) aunnVar.io();
        nucVar.getClass();
        return nucVar;
    }

    public static adce e(adbv adbvVar) {
        int i = adba.a;
        return adbvVar.a();
    }

    public static ExecutorRegistry f(ahey aheyVar) {
        int i = adba.a;
        meg.a();
        ExecutorRegistry executorRegistryCreate = ExecutorRegistry.create(new npq(new npo(0), 1), new npq(new npo(aheyVar, 1), 1));
        executorRegistryCreate.getClass();
        return executorRegistryCreate;
    }

    public static mhn g(atoo atooVar, vxz vxzVar, Context context, boolean z) {
        vxz vxzVar2;
        int iC;
        JSControllerInitializationMode jSControllerInitializationMode;
        String str;
        byte[] bArr;
        String str2;
        int i = adba.a;
        JSControllerInitializationMode jSControllerInitializationMode2 = JSControllerInitializationMode.DEFAULT;
        String strN = vxzVar.n(0, 45372662L);
        if (Objects.equals(strN, "default")) {
            jSControllerInitializationMode2 = JSControllerInitializationMode.DEFAULT;
        } else if (Objects.equals(strN, "eager_context_initialization")) {
            jSControllerInitializationMode2 = JSControllerInitializationMode.EAGER_CONTEXT_INITIALIZATION;
        } else if (Objects.equals(strN, "eager_module_loading")) {
            jSControllerInitializationMode2 = JSControllerInitializationMode.EAGER_MODULE_LOADING;
        }
        JSControllerInitializationMode jSControllerInitializationMode3 = jSControllerInitializationMode2;
        if (vxzVar.c(5, 45372661L, 0L) > 0) {
            vxzVar2 = vxzVar;
            iC = (int) vxzVar2.c(5, 45372661L, 0L);
        } else {
            vxzVar2 = vxzVar;
            iC = 5;
        }
        String absolutePath = new File(context.getCacheDir(), "ElementsJSCache").getAbsolutePath();
        mhm mhmVar = new mhm();
        mhmVar.v(JSControllerInitializationMode.DEFAULT);
        mhmVar.o(false);
        mhmVar.D(5);
        mhmVar.z(false);
        mhmVar.A(false);
        mhmVar.y(false);
        mhmVar.w(false);
        mhmVar.G |= 64;
        mhmVar.s("");
        mhmVar.i = atoo.a.toByteArray();
        mhmVar.u(false);
        mhmVar.c(0);
        mhmVar.d(0);
        mhmVar.h("");
        mhmVar.g(0);
        mhmVar.B(false);
        mhmVar.x(false);
        mhmVar.t(0L);
        mhmVar.i(false);
        mhmVar.f(false);
        mhmVar.e(false);
        mhmVar.l(false);
        mhmVar.j(false);
        mhmVar.m(false);
        mhmVar.a(false);
        mhmVar.p(false);
        mhmVar.q(false);
        mhmVar.r(false);
        mhmVar.b(false);
        mhmVar.n(false);
        mhmVar.C(false);
        mhmVar.k(false);
        mhmVar.v(jSControllerInitializationMode3);
        mhmVar.o(vxzVar2.l(38, 45372660L, false));
        mhmVar.D(iC);
        mhmVar.z(vxzVar2.l(0, 45359737L, false));
        mhmVar.A(vxzVar2.l(39, 45372663L, false));
        mhmVar.y(vxzVar2.l(106, 45413938L, false));
        mhmVar.w(vxzVar2.l(115, 45417235L, false));
        mhmVar.s(vxzVar2.n(1, 45401779L));
        mhmVar.i = atooVar.toByteArray();
        mhmVar.u(vxzVar2.l(127, 45422865L, false));
        mhmVar.c((int) vxzVar2.c(14, 45422866L, 0L));
        mhmVar.d((int) vxzVar.c(17, 45446457L, 0L));
        mhmVar.h(absolutePath);
        mhmVar.g((int) vxzVar.c(18, 45446458L, 0L));
        mhmVar.x(vxzVar.l(134, 45427268L, false));
        mhmVar.t(vxzVar.c(15, 45428747L, 0L));
        mhmVar.B(vxzVar.l(132, 45426755L, false));
        mhmVar.i(vxzVar.l(158, 45530940L, false));
        mhmVar.f(vxzVar.l(210, 45643963L, false));
        mhmVar.e(vxzVar.l(211, 45643964L, false));
        mhmVar.l(z);
        mhmVar.j(vxzVar.l(279, 45681507L, false));
        mhmVar.m(vxzVar.l(257, 45670891L, false));
        mhmVar.a(vxzVar.l(324, 45717371L, false));
        mhmVar.p(vxzVar.l(328, 45718896L, false));
        mhmVar.q(vxzVar.l(332, 45721567L, false));
        mhmVar.r(vxzVar.l(333, 45721568L, false));
        mhmVar.b(vxzVar.l(353, 45730302L, false));
        mhmVar.n(vxzVar.l(356, 45731875L, false));
        mhmVar.C(vxzVar.l(396, 45764758L, false));
        mhmVar.k(vxzVar.l(483, 45822727L, false));
        if (mhmVar.G == 268435455 && (jSControllerInitializationMode = mhmVar.a) != null && (str = mhmVar.h) != null && (bArr = mhmVar.i) != null && (str2 = mhmVar.m) != null) {
            return new mhn(jSControllerInitializationMode, mhmVar.b, mhmVar.c, mhmVar.d, mhmVar.e, mhmVar.f, mhmVar.g, str, bArr, mhmVar.j, mhmVar.k, mhmVar.l, str2, mhmVar.n, mhmVar.o, mhmVar.p, mhmVar.q, mhmVar.r, mhmVar.s, mhmVar.t, mhmVar.u, mhmVar.v, mhmVar.w, mhmVar.x, mhmVar.y, mhmVar.z, mhmVar.A, mhmVar.B, mhmVar.C, mhmVar.D, mhmVar.E, mhmVar.F);
        }
        StringBuilder sb = new StringBuilder();
        if (mhmVar.a == null) {
            sb.append(" initializationMode");
        }
        if ((mhmVar.G & 1) == 0) {
            sb.append(" enableVmContextLru");
        }
        if ((mhmVar.G & 2) == 0) {
            sb.append(" vmContextLruSize");
        }
        if ((mhmVar.G & 4) == 0) {
            sb.append(" shouldLockVmIsolate");
        }
        if ((mhmVar.G & 8) == 0) {
            sb.append(" shouldUseDirectJsObjectCreation");
        }
        if ((mhmVar.G & 16) == 0) {
            sb.append(" runOnLoadModuleHookOnBackgroundThread");
        }
        if ((mhmVar.G & 32) == 0) {
            sb.append(" jsClientErrorLoggerEnabled");
        }
        if ((mhmVar.G & 64) == 0) {
            sb.append(" jsEngineSelection");
        }
        if (mhmVar.h == null) {
            sb.append(" extraVmFlags");
        }
        if (mhmVar.i == null) {
            sb.append(" platformDetails");
        }
        if ((mhmVar.G & SemanticState.Focused) == 0) {
            sb.append(" individualModuleLoading");
        }
        if ((mhmVar.G & SemanticState.Hidden) == 0) {
            sb.append(" compiledModuleCacheSize");
        }
        if ((mhmVar.G & SemanticState.LiveRegion) == 0) {
            sb.append(" compiledModuleDiskCacheSize");
        }
        if (mhmVar.m == null) {
            sb.append(" diskCachePath");
        }
        if ((mhmVar.G & SemanticState.ReadOnly) == 0) {
            sb.append(" diskCacheAppVersion");
        }
        if ((mhmVar.G & SemanticState.Modal) == 0) {
            sb.append(" useLogJsSpanBinding");
        }
        if ((mhmVar.G & SemanticState.Obscured) == 0) {
            sb.append(" pumpMessageLoop");
        }
        if ((mhmVar.G & SemanticState.Multiline) == 0) {
            sb.append(" idleMessageMicroseconds");
        }
        if ((mhmVar.G & 16384) == 0) {
            sb.append(" enableAsyncInit");
        }
        if ((mhmVar.G & 32768) == 0) {
            sb.append(" controllerDisposeLifecycleFix");
        }
        if ((mhmVar.G & 65536) == 0) {
            sb.append(" controllerBackgroundDispose");
        }
        if ((mhmVar.G & 131072) == 0) {
            sb.append(" enableMultiLanguageStackTraceError");
        }
        if ((mhmVar.G & 262144) == 0) {
            sb.append(" enableControllerDisposalEarlyExit");
        }
        if ((mhmVar.G & 524288) == 0) {
            sb.append(" enableSwapProtoKernel");
        }
        if ((mhmVar.G & 1048576) == 0) {
            sb.append(" asyncCallingThreadDispose");
        }
        if ((mhmVar.G & 2097152) == 0) {
            sb.append(" executeCommandCallbackDispatch");
        }
        if ((mhmVar.G & 4194304) == 0) {
            sb.append(" executeJsFunctionCommandAsync");
        }
        if ((mhmVar.G & 8388608) == 0) {
            sb.append(" executeJsFunctionCommandAsyncAllCalls");
        }
        if ((mhmVar.G & 16777216) == 0) {
            sb.append(" blocksEnableSignalsCallbackDispatch");
        }
        if ((mhmVar.G & 33554432) == 0) {
            sb.append(" enableThreadSafeControllerExecutor");
        }
        if ((mhmVar.G & 67108864) == 0) {
            sb.append(" useScopedCommandResolver");
        }
        if ((mhmVar.G & 134217728) == 0) {
            sb.append(" enableControllerStateHolderDeadlockFix");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static atoo h(alol alolVar, Context context) {
        int i = adba.a;
        aihf aihfVarCreateBuilder = atoo.a.createBuilder();
        String strAe = ahno.ae(alolVar.name());
        aihfVarCreateBuilder.copyOnWrite();
        atoo atooVar = (atoo) aihfVarCreateBuilder.instance;
        strAe.getClass();
        atooVar.b |= 1;
        atooVar.c = strAe;
        String strB = txz.b(context);
        aihfVarCreateBuilder.copyOnWrite();
        atoo atooVar2 = (atoo) aihfVarCreateBuilder.instance;
        strB.getClass();
        atooVar2.b |= 2;
        atooVar2.d = strB;
        aihfVarCreateBuilder.copyOnWrite();
        atoo atooVar3 = (atoo) aihfVarCreateBuilder.instance;
        atooVar3.b |= 4;
        atooVar3.e = "Android";
        aihfVarCreateBuilder.copyOnWrite();
        atoo atooVar4 = (atoo) aihfVarCreateBuilder.instance;
        String str = Build.VERSION.RELEASE;
        str.getClass();
        atooVar4.b |= 8;
        atooVar4.f = str;
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        aihfVarCreateBuilder.copyOnWrite();
        atoo atooVar5 = (atoo) aihfVarCreateBuilder.instance;
        strValueOf.getClass();
        atooVar5.b |= 16;
        atooVar5.g = strValueOf;
        atoo atooVar6 = (atoo) aihfVarCreateBuilder.build();
        atooVar6.getClass();
        return atooVar6;
    }

    public static ThemeStore i(awmd awmdVar, vxz vxzVar) {
        int i = adba.a;
        meg.a();
        ajet ajetVarA = ajet.a(((wkn) awmdVar.io()).a().Q);
        if (ajetVarA == null) {
            ajetVarA = ajet.USER_INTERFACE_THEME_UNKNOWN;
        }
        ThemeStore themeStoreCreate = ThemeStore.create(ajetVarA.d);
        themeStoreCreate.getClass();
        themeStoreCreate.setEnablePreparsedTheme(vxzVar.l(367, 45739998L, false));
        if (vxzVar.l(185, 45624631L, false)) {
            NativeThemeProviderWrapper.nativeUpdateStore(themeStoreCreate);
        }
        return themeStoreCreate;
    }

    public static nzw j(aunn aunnVar, boolean z, adce adceVar) {
        nzw nzwVar = (z && adceVar.e() == 1) ? (nzw) aunnVar.io() : nzw.a;
        nzwVar.getClass();
        return nzwVar;
    }

    public static opq k(Context context) {
        int i = adgg.a;
        return new opq(context);
    }

    public static ExecutorService l(ahey aheyVar, Optional optional) {
        int i = adgg.a;
        optional.isPresent();
        fvu fvuVarD = fle.d();
        ahex ahexVarA = aheyVar;
        if (fvuVarD instanceof fle) {
            ahexVarA = MoreExecutors.a(((fle) fvuVarD).a);
        }
        ahexVarA.getClass();
        return ahexVarA;
    }

    public static void m(ComponentConfig componentConfig) {
        int i = adgg.a;
        componentConfig.getClass();
    }

    public static oxn n(vxz vxzVar) {
        int i = adgg.a;
        return new oxn(vxzVar.l(194, 45629355L, false));
    }

    public static aga o(oui ouiVar, Set set) {
        int i = adgg.a;
        aga agaVar = new aga(1);
        agaVar.d(aszv.d.a, new otj(ouiVar));
        agqr it = ((agqj) set).iterator();
        while (it.hasNext()) {
            opd opdVar = (opd) it.next();
            agaVar.d(opdVar.c().a, opdVar);
        }
        return agaVar;
    }

    public static aga p(Set set) {
        int i = adgg.a;
        return qnl.aG(set);
    }

    public static mew q(vxz vxzVar, vxz vxzVar2, vxz vxzVar3) {
        int i = adgg.a;
        ainf ainfVar = new ainf();
        ainfVar.aR();
        ainfVar.bO(8, 1);
        ainfVar.bK(19, true);
        ainfVar.aR();
        ainfVar.bO(10, 64);
        ainfVar.bK(40, true);
        boolean zL = vxzVar2.l(17, 45822394L, false);
        ainfVar.aR();
        ainfVar.bO(11, 2);
        ainfVar.bK(43, zL);
        boolean zL2 = vxzVar2.l(18, 45824199L, false);
        ainfVar.aR();
        ainfVar.bO(11, 4);
        ainfVar.bK(44, zL2);
        boolean zL3 = vxzVar.l(185, 45624631L, false);
        ainfVar.aR();
        ainfVar.bO(8, 2);
        ainfVar.bK(20, zL3);
        float fA = (float) vxzVar2.a(0, 45699883L, 0.0d);
        ainfVar.aR();
        ainfVar.bO(8, 4);
        ainfVar.bP(108, fA);
        boolean zL4 = vxzVar.l(284, 45685769L, false);
        ainfVar.aR();
        ainfVar.bO(8, 8);
        ainfVar.bK(21, zL4);
        boolean zL5 = vxzVar2.l(2, 45720106L, false);
        ainfVar.aR();
        ainfVar.bO(8, 16);
        ainfVar.bK(22, zL5);
        boolean zL6 = vxzVar2.l(3, 45740046L, false);
        ainfVar.aR();
        ainfVar.bO(8, 64);
        ainfVar.bK(24, zL6);
        boolean zL7 = vxzVar2.l(4, 45743504L, false);
        ainfVar.aR();
        ainfVar.bO(8, SemanticState.Focused);
        ainfVar.bK(25, zL7);
        boolean zL8 = vxzVar2.l(5, 45772145L, false);
        ainfVar.aR();
        ainfVar.bO(9, 2);
        ainfVar.bK(27, zL8);
        boolean zL9 = vxzVar2.l(8, 45778178L, false);
        ainfVar.aR();
        ainfVar.bO(9, 8);
        ainfVar.bK(29, zL9);
        boolean zL10 = vxzVar2.l(11, 45790638L, false);
        ainfVar.aR();
        ainfVar.bO(9, SemanticState.Focused);
        ainfVar.bK(33, zL10);
        boolean zL11 = vxzVar.l(411, 45770086L, false);
        ainfVar.aR();
        ainfVar.bO(9, 32);
        ainfVar.bK(31, zL11);
        boolean zL12 = vxzVar.l(400, 45765642L, false);
        ainfVar.aR();
        ainfVar.bO(9, 64);
        ainfVar.bK(32, zL12);
        boolean zL13 = vxzVar2.l(10, 45790279L, false);
        ainfVar.aR();
        ainfVar.bO(10, 1);
        ainfVar.bK(34, zL13);
        boolean zL14 = vxzVar.l(450, 45795830L, false);
        ainfVar.aR();
        ainfVar.bO(10, 2);
        ainfVar.bK(35, zL14);
        boolean zL15 = vxzVar2.l(34, 45841828L, false);
        ainfVar.aR();
        ainfVar.bO(13, 16);
        ainfVar.bK(62, zL15);
        boolean zL16 = vxzVar2.l(12, 45806875L, false);
        ainfVar.aR();
        ainfVar.bO(10, 4);
        ainfVar.bK(36, zL16);
        boolean zL17 = vxzVar2.l(37, 45843346L, false);
        ainfVar.aR();
        ainfVar.bO(13, 64);
        ainfVar.bK(64, zL17);
        boolean zL18 = vxzVar.l(466, 45807601L, false);
        ainfVar.aR();
        ainfVar.bO(10, 8);
        ainfVar.bK(37, zL18);
        boolean zL19 = vxzVar.l(194, 45629355L, false);
        ainfVar.aR();
        ainfVar.bO(13, 8);
        ainfVar.bK(61, zL19);
        boolean zL20 = vxzVar.l(444, 45790478L, false);
        ainfVar.aR();
        ainfVar.bO(10, 16);
        ainfVar.bK(38, zL20);
        boolean zL21 = vxzVar2.l(13, 45811311L, false);
        ainfVar.aR();
        ainfVar.bO(10, 32);
        ainfVar.bK(39, zL21);
        boolean zL22 = vxzVar2.l(14, 45818634L, false);
        ainfVar.aR();
        ainfVar.bO(10, SemanticState.Focused);
        ainfVar.bK(41, zL22);
        boolean zL23 = vxzVar2.l(19, 45826879L, false);
        ainfVar.aR();
        ainfVar.bO(11, 1);
        ainfVar.bK(42, zL23);
        boolean zL24 = vxzVar2.l(20, 45830408L, false);
        ainfVar.aR();
        ainfVar.bO(11, 8);
        ainfVar.bK(45, zL24);
        boolean zL25 = vxzVar2.l(22, 45832220L, false);
        ainfVar.aR();
        ainfVar.bO(11, 16);
        ainfVar.bK(46, zL25);
        boolean zL26 = vxzVar2.l(21, 45831655L, false);
        ainfVar.aR();
        ainfVar.bO(11, 32);
        ainfVar.bK(47, zL26);
        boolean zL27 = vxzVar.l(505, 45832282L, false);
        ainfVar.aR();
        ainfVar.bO(11, 64);
        ainfVar.bK(48, zL27);
        boolean zL28 = vxzVar2.l(23, 45833518L, false);
        ainfVar.aR();
        ainfVar.bO(11, SemanticState.Focused);
        ainfVar.bK(49, zL28);
        boolean zL29 = vxzVar2.l(38, 45843354L, false);
        ainfVar.aR();
        ainfVar.bO(13, 32);
        ainfVar.bK(63, zL29);
        boolean zL30 = vxzVar2.l(24, 45835482L, false);
        ainfVar.aR();
        ainfVar.bO(12, 1);
        ainfVar.bK(50, zL30);
        boolean zL31 = vxzVar.l(515, 45836297L, false);
        ainfVar.aR();
        ainfVar.bO(12, 4);
        ainfVar.bK(52, zL31);
        boolean zL32 = vxzVar2.l(26, 45837831L, false);
        ainfVar.aR();
        ainfVar.bO(12, 8);
        ainfVar.bK(53, zL32);
        boolean zL33 = vxzVar2.l(25, 45837359L, false);
        ainfVar.aR();
        ainfVar.bO(12, 2);
        ainfVar.bK(51, zL33);
        boolean zL34 = vxzVar2.l(27, 45839101L, false);
        ainfVar.aR();
        ainfVar.bO(12, 16);
        ainfVar.bK(54, zL34);
        boolean zL35 = vxzVar2.l(28, 45839103L, false);
        ainfVar.aR();
        ainfVar.bO(12, 32);
        ainfVar.bK(55, zL35);
        boolean zL36 = vxzVar2.l(73, 45858098L, false);
        ainfVar.aR();
        ainfVar.bO(18, 4);
        ainfVar.bK(100, zL36);
        boolean zL37 = vxzVar2.l(74, 45858101L, false);
        ainfVar.aR();
        ainfVar.bO(18, 8);
        ainfVar.bK(101, zL37);
        boolean zL38 = vxzVar2.l(40, 45843830L, false);
        ainfVar.aR();
        ainfVar.bO(13, 4);
        ainfVar.bK(60, zL38);
        boolean zL39 = vxzVar2.l(31, 45840890L, false);
        ainfVar.aR();
        ainfVar.bO(12, 64);
        ainfVar.bK(56, zL39);
        boolean zL40 = vxzVar2.l(32, 45841180L, false);
        ainfVar.aR();
        ainfVar.bO(12, SemanticState.Focused);
        ainfVar.bK(57, zL40);
        boolean zL41 = vxzVar2.l(33, 45841734L, false);
        ainfVar.aR();
        ainfVar.bO(13, 1);
        ainfVar.bK(58, zL41);
        boolean zL42 = vxzVar2.l(35, 45842371L, false);
        ainfVar.aR();
        ainfVar.bO(13, 2);
        ainfVar.bK(59, zL42);
        boolean zL43 = vxzVar2.l(36, 45842461L, false);
        ainfVar.aR();
        ainfVar.bO(13, SemanticState.Focused);
        ainfVar.bK(65, zL43);
        boolean zL44 = vxzVar2.l(41, 45844134L, false);
        ainfVar.aR();
        ainfVar.bO(14, 1);
        ainfVar.bK(66, zL44);
        boolean zL45 = vxzVar2.l(42, 45844511L, false);
        ainfVar.aR();
        ainfVar.bO(14, 2);
        ainfVar.bK(67, zL45);
        boolean zL46 = vxzVar2.l(44, 45845576L, false);
        ainfVar.aR();
        ainfVar.bO(14, 4);
        ainfVar.bK(68, zL46);
        boolean zL47 = vxzVar2.l(43, 45845392L, false);
        ainfVar.aR();
        ainfVar.bO(14, 8);
        ainfVar.bK(69, zL47);
        boolean zL48 = vxzVar2.l(47, 45846538L, false);
        ainfVar.aR();
        ainfVar.bO(14, 16);
        ainfVar.bK(70, zL48);
        boolean zL49 = vxzVar2.l(45, 45845665L, false);
        ainfVar.aR();
        ainfVar.bO(14, 32);
        ainfVar.bK(71, zL49);
        boolean zL50 = vxzVar3.l(410, 45834423L, false);
        ainfVar.aR();
        ainfVar.bO(14, 64);
        ainfVar.bK(72, zL50);
        boolean zL51 = vxzVar2.l(48, 45846779L, false);
        ainfVar.aR();
        ainfVar.bO(14, SemanticState.Focused);
        ainfVar.bK(73, zL51);
        boolean zL52 = vxzVar2.l(49, 45846780L, false);
        ainfVar.aR();
        ainfVar.bO(15, 1);
        ainfVar.bK(74, zL52);
        boolean zL53 = vxzVar2.l(52, 45847566L, false);
        ainfVar.aR();
        ainfVar.bO(15, 2);
        ainfVar.bK(75, zL53);
        boolean zL54 = vxzVar2.l(39, 45843506L, false);
        ainfVar.aR();
        ainfVar.bO(15, 4);
        ainfVar.bK(76, zL54);
        boolean zL55 = vxzVar2.l(51, 45847090L, false);
        ainfVar.aR();
        ainfVar.bO(15, 8);
        ainfVar.bK(77, zL55);
        boolean zL56 = vxzVar2.l(56, 45848929L, false);
        ainfVar.aR();
        ainfVar.bO(15, 16);
        ainfVar.bK(78, zL56);
        boolean zL57 = vxzVar2.l(54, 45848711L, false);
        ainfVar.aR();
        ainfVar.bO(15, 32);
        ainfVar.bK(79, zL57);
        boolean zL58 = vxzVar2.l(55, 45848718L, false);
        ainfVar.aR();
        ainfVar.bO(15, 64);
        ainfVar.bK(80, zL58);
        boolean zL59 = vxzVar2.l(46, 45846197L, false);
        ainfVar.aR();
        ainfVar.bO(15, SemanticState.Focused);
        ainfVar.bK(81, zL59);
        boolean zL60 = vxzVar2.l(57, 45849140L, false);
        ainfVar.aR();
        ainfVar.bO(16, 1);
        ainfVar.bK(82, zL60);
        boolean zL61 = vxzVar2.l(59, 45849861L, false);
        ainfVar.aR();
        ainfVar.bO(16, 2);
        ainfVar.bK(83, zL61);
        boolean zL62 = vxzVar2.l(29, 45839327L, false);
        ainfVar.aR();
        ainfVar.bO(16, 4);
        ainfVar.bK(84, zL62);
        boolean zL63 = vxzVar2.l(50, 45846784L, false);
        ainfVar.aR();
        ainfVar.bO(16, 8);
        ainfVar.bK(85, zL63);
        boolean zL64 = vxzVar2.l(60, 45850422L, false);
        ainfVar.aR();
        ainfVar.bO(16, SemanticState.Focused);
        ainfVar.bK(89, zL64);
        boolean zL65 = vxzVar2.l(61, 45850542L, false);
        ainfVar.aR();
        ainfVar.bO(16, 32);
        ainfVar.bK(87, zL65);
        boolean zL66 = vxzVar2.l(63, 45851910L, false);
        ainfVar.aR();
        ainfVar.bO(16, 64);
        ainfVar.bK(88, zL66);
        boolean zL67 = vxzVar2.l(66, 45855103L, false);
        ainfVar.aR();
        ainfVar.bO(17, 1);
        ainfVar.bK(90, zL67);
        boolean zL68 = vxzVar2.l(62, 45851721L, false);
        ainfVar.aR();
        ainfVar.bO(17, 2);
        ainfVar.bK(91, zL68);
        boolean zL69 = vxzVar2.l(71, 45856328L, false);
        ainfVar.aR();
        ainfVar.bO(17, 4);
        ainfVar.bK(92, zL69);
        boolean zL70 = vxzVar2.l(67, 45855180L, false);
        ainfVar.aR();
        ainfVar.bO(17, 8);
        ainfVar.bK(93, zL70);
        boolean zL71 = vxzVar2.l(64, 45853579L, false);
        ainfVar.aR();
        ainfVar.bO(17, 16);
        ainfVar.bK(94, zL71);
        boolean zL72 = vxzVar2.l(69, 45855278L, false);
        ainfVar.aR();
        ainfVar.bO(17, 32);
        ainfVar.bK(95, zL72);
        boolean zL73 = vxzVar2.l(58, 45849201L, false);
        ainfVar.aR();
        ainfVar.bO(17, 64);
        ainfVar.bK(96, zL73);
        boolean zL74 = vxzVar2.l(75, 45858231L, false);
        ainfVar.aR();
        ainfVar.bO(18, 1);
        ainfVar.bK(98, zL74);
        boolean zL75 = vxzVar2.l(65, 45854585L, false);
        ainfVar.aR();
        ainfVar.bO(18, 2);
        ainfVar.bK(99, zL75);
        boolean zL76 = vxzVar2.l(72, 45857418L, false);
        ainfVar.aR();
        ainfVar.bO(18, 16);
        ainfVar.bK(102, zL76);
        boolean zL77 = vxzVar2.l(78, 45859731L, false);
        ainfVar.aR();
        ainfVar.bO(18, 32);
        ainfVar.bK(103, zL77);
        boolean zL78 = vxzVar.l(546, 45859368L, false);
        ainfVar.aR();
        ainfVar.bO(18, 64);
        ainfVar.bK(104, zL78);
        boolean zL79 = vxzVar2.l(77, 45859454L, false);
        ainfVar.aR();
        ainfVar.bO(18, SemanticState.Focused);
        ainfVar.bK(105, zL79);
        if (ainfVar.d) {
            ainfVar.bG();
        } else {
            ainfVar.d = true;
        }
        return new mew(ainfVar.b, (char[]) null);
    }

    public static ElementsServices r(Activity activity, Context context, nry nryVar, ExecutorService executorService, mew mewVar, oui ouiVar, aga agaVar, aga agaVar2, aga agaVar3, ComponentConfig componentConfig, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, aunn aunnVar, adgf adgfVar, aunn aunnVar2, kjc kjcVar, Map map, aber aberVar, Optional optional, nrr nrrVar) {
        FlagServices.c(mewVar);
        awmdVar2.getClass();
        adav adavVar = new adav(awmdVar2, 2);
        adav adavVar2 = new adav(awmdVar, 3);
        awmdVar4.getClass();
        int i = 4;
        oow oowVarAH = qnl.aH(adavVar, adavVar2, executorService, context, osf.a(activity, executorService, new adav(awmdVar4, i)), nryVar);
        oowVarAH.e(ouiVar);
        oowVarAH.g(agaVar);
        oowVarAH.b(map);
        oowVarAH.f(agaVar2);
        oowVarAH.d(agaVar3);
        oowVarAH.c(componentConfig);
        awmdVar3.getClass();
        oowVarAH.n = new adav(awmdVar3, 5);
        oowVarAH.o = new adav(awmdVar4, i);
        oowVarAH.q = new adav(awmdVar5, 6);
        oowVarAH.w = adgfVar;
        aunnVar2.getClass();
        oowVarAH.u = new adav(aunnVar2, 7);
        oowVarAH.z = kjcVar;
        oowVarAH.y = aberVar;
        optional.isPresent();
        oowVarAH.p = (agfr) optional.orElse(null);
        oowVarAH.m = nrrVar;
        aunnVar.getClass();
        oowVarAH.r = new adav(aunnVar, 8);
        return oowVarAH.a();
    }

    public static kjc s() {
        int i = adgg.a;
        return new kjc(new ovg(), (byte[]) null);
    }

    public static kjc t(Set set) {
        int i = adgg.a;
        kjc kjcVar = new kjc((short[]) null);
        if (set != null) {
            agqr it = ((agpr) set).iterator();
            while (it.hasNext()) {
                otz otzVar = (otz) it.next();
                int i2 = otzVar.a().a;
                if (((aga) kjcVar.a).d(i2, otzVar) != null) {
                    throw new IllegalStateException("Duplicate registration of CustomImageSource: " + i2);
                }
            }
        }
        return kjcVar;
    }

    public static owu u(mew mewVar, nxl nxlVar, oui ouiVar, kjc kjcVar) {
        int i = adgg.a;
        if (Memory.peekByte(mewVar.c + 33) == 0) {
            return new owu(nxlVar, ouiVar, kjcVar, new HashMap());
        }
        int i2 = oxj.e;
        return new oxj(nxlVar, ouiVar, kjcVar, new HashMap());
    }

    public static syn v(org orgVar, qnl qnlVar, Set set, kjc kjcVar) {
        int i = adgg.a;
        if (set == null) {
            throw new NullPointerException("Null fetcherFactories");
        }
        if (kjcVar != null) {
            return new syn(orgVar, qnlVar, set, kjcVar);
        }
        throw new NullPointerException("Null dataSourceDelegateFactory");
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
