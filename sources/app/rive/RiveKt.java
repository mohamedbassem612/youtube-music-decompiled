package app.rive;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import app.rive.core.ArtboardHandle;
import app.rive.core.CommandQueue;
import app.rive.core.RebuggerWrapperKt;
import app.rive.core.RenderingDefaults;
import app.rive.core.RiveSurface;
import app.rive.core.StateMachineHandle;
import app.rive.semantics.AccessibilityKt;
import app.rive.semantics.SemanticAccessibilityFocusTransition;
import app.rive.semantics.SemanticActionType;
import app.rive.semantics.SemanticState;
import app.rive.semantics.SemanticTreeModel;
import defpackage.a;
import defpackage.aao;
import defpackage.aaq;
import defpackage.acq;
import defpackage.ahf;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahm;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.ahz;
import defpackage.aia;
import defpackage.aib;
import defpackage.aid;
import defpackage.aie;
import defpackage.aii;
import defpackage.aik;
import defpackage.ail;
import defpackage.ais;
import defpackage.aiu;
import defpackage.ajm;
import defpackage.ajs;
import defpackage.ajt;
import defpackage.akj;
import defpackage.ako;
import defpackage.akq;
import defpackage.aks;
import defpackage.akt;
import defpackage.aku;
import defpackage.akv;
import defpackage.akw;
import defpackage.akx;
import defpackage.ala;
import defpackage.alc;
import defpackage.amj;
import defpackage.amo;
import defpackage.amp;
import defpackage.amq;
import defpackage.amr;
import defpackage.ams;
import defpackage.amv;
import defpackage.ane;
import defpackage.aod;
import defpackage.aog;
import defpackage.aoq;
import defpackage.apf;
import defpackage.apj;
import defpackage.apt;
import defpackage.apv;
import defpackage.apw;
import defpackage.apx;
import defpackage.atqq;
import defpackage.awmj;
import defpackage.awml;
import defpackage.awmy;
import defpackage.awnp;
import defpackage.awoq;
import defpackage.awou;
import defpackage.awox;
import defpackage.awpj;
import defpackage.awqg;
import defpackage.awqk;
import defpackage.awqy;
import defpackage.awrc;
import defpackage.awsf;
import defpackage.awum;
import defpackage.awuq;
import defpackage.awut;
import defpackage.awvi;
import defpackage.awwd;
import defpackage.awwf;
import defpackage.axat;
import defpackage.axds;
import defpackage.bog;
import defpackage.bpq;
import defpackage.dl;
import defpackage.dow;
import defpackage.doy;
import defpackage.hmy;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveKt {
    private static final String DRAW_TAG = "Rive/UI/Draw";
    private static final String GENERAL_TAG = "Rive/UI";
    private static final String STATE_MACHINE_TAG = "Rive/UI/SM";

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiveFocusDirection.values().length];
            try {
                iArr[RiveFocusDirection.Next.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiveFocusDirection.Previous.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void BindViewModelInstancesEffect(CommandQueue commandQueue, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Function0 function0, ahk ahkVar, int i) {
        int i2;
        int i3 = i & 6;
        ahk ahkVarC = ahkVar.C();
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Focused : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ahkVarC.v() ? SemanticState.Multiline : 16384;
        }
        if (ahkVarC.y()) {
            long jM318getStateMachineHandlea86gHUU = stateMachine.m318getStateMachineHandlea86gHUU();
            boolean zS = ((i2 & 112) == 32 || ((i2 & 64) != 0 && ahkVarC.v())) | ((i2 & 896) == 256 || ((i2 & SemanticState.LiveRegion) != 0 && ahkVarC.v())) | ((i2 & 7168) == 2048 || ((i2 & SemanticState.Obscured) != 0 && ahkVarC.v())) | ahkVarC.s();
            boolean z = (i2 & 57344) == 16384;
            Object objC = ahkVarC.c();
            if ((zS | z) || objC == ahj.a) {
                RiveKt$BindViewModelInstancesEffect$1$1 riveKt$BindViewModelInstancesEffect$1$1 = new RiveKt$BindViewModelInstancesEffect$1$1(stateMachine, viewModelInstance, map, function0, jM318getStateMachineHandlea86gHUU, null);
                ahkVarC.D();
                objC = riveKt$BindViewModelInstancesEffect$1$1;
            }
            CommandQueue.Companion companion = CommandQueue.Companion;
            ahs.c(ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy BindViewModelInstancesEffect$lambda$1(CommandQueue commandQueue, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Function0 function0, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        BindViewModelInstancesEffect(commandQueue, stateMachine, viewModelInstance, map, function0, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }

    private static final void DrawRiveFramesEffect(CommandQueue commandQueue, bog bogVar, RiveSurface riveSurface, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, int i2, int i3, int i4, boolean z2, boolean z3, ahk ahkVar, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i5 & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z4 = true;
        if (i9 == 0) {
            i7 = (true != ((i5 & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= true != ((i5 & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        int i10 = i5 & 384;
        int i11 = SemanticState.Focused;
        if (i10 == 0) {
            i7 |= true != ((i5 & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 128 : 256;
        }
        if ((i5 & 3072) == 0) {
            i7 |= true != ((i5 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : 2048;
        }
        if ((i5 & 24576) == 0) {
            i7 |= true != ((i5 & 32768) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((i5 & 196608) == 0) {
            i7 |= true != ((262144 & i5) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 65536 : 131072;
        }
        if ((1572864 & i5) == 0) {
            i7 |= true != ((2097152 & i5) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 524288 : 1048576;
        }
        if ((12582912 & i5) == 0) {
            i7 |= true != ((16777216 & i5) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 4194304 : 8388608;
        }
        if ((100663296 & i5) == 0) {
            i7 |= true != ahkVarC.r() ? 33554432 : 67108864;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= true != ahkVarC.u() ? 268435456 : 536870912;
        }
        if ((i6 & 6) == 0) {
            i8 = (true != ((i6 & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= true != ahkVarC.r() ? 16 : 32;
        }
        if ((i6 & 384) == 0) {
            if (true == ahkVarC.r()) {
                i11 = 256;
            }
            i8 |= i11;
        }
        if ((i6 & 3072) == 0) {
            i8 |= true != ahkVarC.r() ? SemanticState.ReadOnly : 2048;
        }
        if ((i6 & 24576) == 0) {
            i8 |= true != ahkVarC.u() ? SemanticState.Multiline : 16384;
        }
        if ((i6 & 196608) == 0) {
            i8 |= true != ahkVarC.u() ? 65536 : 131072;
        }
        if (ahkVarC.y()) {
            long jM269getArtboardHandlenSTdbJo = artboard.m269getArtboardHandlenSTdbJo();
            long jM318getStateMachineHandlea86gHUU = stateMachine.m318getStateMachineHandlea86gHUU();
            Object[] objArr = {commandQueue, bogVar, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, Integer.valueOf(i), Boolean.valueOf(z), riveFrameRate, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            boolean z5 = (i7 & 896) == 256 || ((i7 & SemanticState.LiveRegion) != 0 && ahkVarC.v());
            boolean z6 = (1879048192 & i7) == 536870912;
            boolean zS = z5 | z6 | ((57344 & i7) == 16384 || ((32768 & i7) != 0 && ahkVarC.v())) | ((458752 & i8) == 131072) | ((i7 & 14) == 4 || ((i7 & 8) != 0 && ahkVarC.v())) | ahkVarC.s();
            boolean z7 = (57344 & i8) == 16384;
            boolean zS2 = zS | z7 | ((i8 & 896) == 256) | ((i8 & 7168) == 2048) | ((29360128 & i7) == 8388608 || ((16777216 & i7) != 0 && ahkVarC.v())) | ahkVarC.s();
            boolean z8 = (234881024 & i7) == 67108864;
            boolean z9 = (i7 & 112) == 32 || ((i7 & 64) != 0 && ahkVarC.v());
            boolean z10 = zS2 | z8;
            if ((i8 & 14) != 4 && ((i8 & 8) == 0 || !ahkVarC.v())) {
                z4 = false;
            }
            Object objC = ahkVarC.c();
            if ((z10 | z9 | z4) || objC == ahj.a) {
                RiveKt$DrawRiveFramesEffect$1$1 riveKt$DrawRiveFramesEffect$1$1 = new RiveKt$DrawRiveFramesEffect$1$1(riveSurface, z, bogVar, z3, commandQueue, jM318getStateMachineHandlea86gHUU, z2, i3, i4, stateMachine, fit, jM269getArtboardHandlenSTdbJo, i, riveFrameRate, null);
                ahkVarC.D();
                objC = riveKt$DrawRiveFramesEffect$1$1;
            }
            ahs.d(objArr, ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy DrawRiveFramesEffect$lambda$1(CommandQueue commandQueue, bog bogVar, RiveSurface riveSurface, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6, ahk ahkVar, int i7) {
        int i8 = i5 | 1;
        int i9 = i6 & 306783378;
        int i10 = 306783378 & i8;
        int i11 = i10 << 1;
        int i12 = i6 & 613566756;
        int i13 = 613566756 & i8;
        DrawRiveFramesEffect(commandQueue, bogVar, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, i, z, riveFrameRate, i2, i3, i4, z2, z3, ahkVar, (i8 & (-920350135)) | i10 | (i13 >> 1) | (i11 & i13), (i6 & (-920350135)) | i9 | (i12 >> 1) | ((i9 << 1) & i12));
        return awmy.a;
    }

    public static final void Rive(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, Map map, ahk ahkVar, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        Fit fitDefaultFit;
        awqg awqgVar2;
        RiveFrameRate riveFrameRate2;
        Artboard artboard2;
        RiveSemanticsMode riveSemanticsMode2;
        int i7;
        Fit fit2;
        ViewModelInstance viewModelInstance2;
        RiveFocusMode riveFocusMode2;
        akq akqVar2;
        RivePointerInputMode rivePointerInputMode2;
        StateMachine stateMachine2;
        riveFile.getClass();
        map.getClass();
        int i8 = i2 & 6;
        ahk ahkVarC = ahkVar.C();
        if (i8 == 0) {
            i5 = (true != ahkVarC.t() ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= true != ahkVarC.t() ? 16 : 32;
        }
        int i10 = i4 & 4;
        boolean z3 = i10 == 0;
        if (i10 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= true != ahkVarC.u() ? SemanticState.Focused : SemanticState.Hidden;
        }
        int i11 = i4 & 8;
        int i12 = SemanticState.Modal;
        if (i11 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= true != ((i2 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : 2048;
        }
        int i13 = i4 & 16;
        if (i13 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= true != ((32768 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        int i14 = i4 & 32;
        if (i14 != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= true != ((i2 & 262144) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            int i15 = 524288;
            if ((i4 & 64) == 0) {
                if ((2097152 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) {
                    i15 = 1048576;
                }
            }
            i5 |= i15;
        }
        int i16 = i4 & SemanticState.Focused;
        if (i16 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= true != ahkVarC.r() ? 4194304 : 8388608;
        }
        int i17 = i4 & SemanticState.Hidden;
        if (i17 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (rivePointerInputMode != null) {
                rivePointerInputMode.ordinal();
            }
            i5 |= true != ahkVarC.r() ? 33554432 : 67108864;
        }
        int i18 = i4 & SemanticState.LiveRegion;
        if (i18 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= true != ((i2 & 1073741824) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 268435456 : 536870912;
        }
        int i19 = i4 & SemanticState.ReadOnly;
        if (i19 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (riveSemanticsMode != null) {
                riveSemanticsMode.ordinal();
            }
            i6 = i3 | (true != ahkVarC.r() ? 2 : 4);
        } else {
            i6 = i3;
        }
        int i20 = i4 & SemanticState.Modal;
        if (i20 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            if (riveFocusMode != null) {
                riveFocusMode.ordinal();
            }
            i6 |= true != ahkVarC.r() ? 16 : 32;
        }
        int i21 = i6;
        int i22 = i4 & SemanticState.Obscured;
        if (i22 != 0) {
            i21 |= 384;
        } else if ((i3 & 384) == 0) {
            i21 |= true != ahkVarC.v() ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i3 & 3072) == 0) {
            if (true != ((i3 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v())) {
                i12 = SemanticState.ReadOnly;
            }
            i21 |= i12;
        }
        if (ahkVarC.y()) {
            int i23 = i4 & 64;
            ahkVarC.k();
            if ((i2 & 1) == 0 || ahkVarC.o()) {
                akq akqVar3 = i9 != 0 ? akq.c : akqVar;
                z2 = (!z3) | z;
                Artboard artboard3 = i11 != 0 ? null : artboard;
                StateMachine stateMachine3 = i13 != 0 ? null : stateMachine;
                ViewModelInstance viewModelInstance3 = i14 != 0 ? null : viewModelInstance;
                if (i23 != 0) {
                    i5 &= -3670017;
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                } else {
                    fitDefaultFit = fit;
                }
                int i24 = i16 != 0 ? 0 : i;
                RivePointerInputMode rivePointerInputMode3 = i17 != 0 ? RivePointerInputMode.Consume : rivePointerInputMode;
                RiveFrameRate riveFrameRate3 = i18 != 0 ? RiveFrameRate.Unbounded.INSTANCE : riveFrameRate;
                RiveSemanticsMode riveSemanticsMode3 = i19 != 0 ? RiveSemanticsMode.Off : riveSemanticsMode;
                RiveFocusMode riveFocusMode3 = i20 != 0 ? RiveFocusMode.Off : riveFocusMode;
                awqgVar2 = i22 != 0 ? null : awqgVar;
                riveFrameRate2 = riveFrameRate3;
                artboard2 = artboard3;
                riveSemanticsMode2 = riveSemanticsMode3;
                i7 = i24;
                fit2 = fitDefaultFit;
                viewModelInstance2 = viewModelInstance3;
                riveFocusMode2 = riveFocusMode3;
                akqVar2 = akqVar3;
                rivePointerInputMode2 = rivePointerInputMode3;
                stateMachine2 = stateMachine3;
            } else {
                ahkVarC.j();
                if (i23 != 0) {
                    i5 &= -3670017;
                }
                akqVar2 = akqVar;
                z2 = z;
                artboard2 = artboard;
                stateMachine2 = stateMachine;
                viewModelInstance2 = viewModelInstance;
                fit2 = fit;
                i7 = i;
                rivePointerInputMode2 = rivePointerInputMode;
                riveFrameRate2 = riveFrameRate;
                riveSemanticsMode2 = riveSemanticsMode;
                riveFocusMode2 = riveFocusMode;
                awqgVar2 = awqgVar;
            }
            ahkVarC.e();
            RiveImpl(riveFile, akqVar2, z2, artboard2, stateMachine2, viewModelInstance2, fit2, i7, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, riveFocusMode2, awqgVar2, map, ahkVarC, (i5 & 1022) | (Artboard.$stable << 9) | (i5 & 7168) | (StateMachine.$stable << 12) | (57344 & i5) | (ViewModelInstance.$stable << 15) | (458752 & i5) | (Fit.$stable << 18) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), i21 & 8190);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy Rive$lambda$0(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, int i2, int i3, int i4, ahk ahkVar, int i5) {
        int i6 = i2 | 1;
        int i7 = i3 & 306783378;
        int i8 = 306783378 & i6;
        int i9 = i8 << 1;
        int i10 = i3 & 613566756;
        int i11 = 613566756 & i6;
        Rive(riveFile, akqVar, z, artboard, stateMachine, viewModelInstance, fit, i, rivePointerInputMode, riveFrameRate, riveSemanticsMode, riveFocusMode, awqgVar, ahkVar, (i6 & (-920350135)) | i8 | (i11 >> 1) | (i9 & i11), (i3 & (-920350135)) | i7 | (i10 >> 1) | ((i7 << 1) & i10), i4);
        return awmy.a;
    }

    static final awmy Rive$lambda$1(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, Map map, int i2, int i3, int i4, ahk ahkVar, int i5) {
        int i6 = i2 | 1;
        int i7 = i3 & 306783378;
        int i8 = 306783378 & i6;
        int i9 = i8 << 1;
        int i10 = i3 & 613566756;
        int i11 = 613566756 & i6;
        Rive(riveFile, akqVar, z, artboard, stateMachine, viewModelInstance, fit, i, rivePointerInputMode, riveFrameRate, riveSemanticsMode, riveFocusMode, awqgVar, map, ahkVar, (i6 & (-920350135)) | i8 | (i11 >> 1) | (i9 & i11), (i3 & (-920350135)) | i7 | (i10 >> 1) | ((i7 << 1) & i10), i4);
        return awmy.a;
    }

    private static final void RiveImpl(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, Map map, ahk ahkVar, int i2, int i3) {
        int i4;
        int i5;
        ahk ahkVar2;
        StateMachine stateMachine2;
        Artboard artboard2;
        int i6 = i2 & 6;
        ahk ahkVarC = ahkVar.C();
        if (i6 == 0) {
            i4 = (true != ahkVarC.t() ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ahkVarC.t() ? 16 : 32;
        }
        int i7 = i2 & 384;
        int i8 = SemanticState.Focused;
        if (i7 == 0) {
            i4 |= true != ahkVarC.u() ? 128 : 256;
        }
        int i9 = i2 & 3072;
        int i10 = SemanticState.ReadOnly;
        if (i9 == 0) {
            i4 |= true != ((i2 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != ((32768 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != ((262144 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != ((2097152 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != ahkVarC.r() ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            rivePointerInputMode.ordinal();
            i4 |= true != ahkVarC.r() ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != ((i2 & 1073741824) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            riveSemanticsMode.ordinal();
            i5 = (true != ahkVarC.r() ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            riveFocusMode.ordinal();
            i5 |= true == ahkVarC.r() ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (true == ahkVarC.v()) {
                i8 = 256;
            }
            i5 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (true == ((i3 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v())) {
                i10 = 2048;
            }
            i5 |= i10;
        }
        if (ahkVarC.y()) {
            Map mapD = atqq.D(map);
            validateRiveResourceArguments(riveFile, artboard, stateMachine, viewModelInstance, mapD);
            Object objC = ahkVarC.c();
            Object obj = ahj.a;
            if (objC == obj) {
                objC = new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt.RiveImpl$lambda$0$0();
                    }
                };
                ahkVarC.D();
            }
            RiveLog.INSTANCE.getLogger().v(GENERAL_TAG, (Function0) objC);
            int i11 = bpq.a;
            bog bogVar = (bog) ahkVarC.w();
            boolean zRememberRiveSemanticsEnabled = AccessibilityKt.rememberRiveSemanticsEnabled(riveSemanticsMode, ahkVarC, i5 & 14);
            boolean zRememberRiveFocusEnabled = RiveFocusModeKt.rememberRiveFocusEnabled(riveFocusMode, ahkVarC, (i5 >> 3) & 14);
            CommandQueue riveWorker = riveFile.getRiveWorker();
            int i12 = i4 >> 6;
            ReadyResources readyResourcesRememberReadyResources = rememberReadyResources(riveFile, artboard, stateMachine, ahkVarC, (i4 & 14) | (Artboard.$stable << 3) | (i12 & 112) | (StateMachine.$stable << 6) | (i12 & 896));
            ahkVarC.z();
            awml[] awmlVarArr = new awml[14];
            int i13 = i5;
            awmlVarArr[0] = new awml("file", riveFile);
            Boolean boolValueOf = Boolean.valueOf(z);
            awmlVarArr[1] = new awml("playing", boolValueOf);
            int i14 = i4;
            awmlVarArr[2] = new awml("frameRate", riveFrameRate);
            awmlVarArr[3] = new awml("artboard", artboard);
            awmlVarArr[4] = new awml("artboardHandle", (readyResourcesRememberReadyResources == null || (artboard2 = readyResourcesRememberReadyResources.getArtboard()) == null) ? null : ArtboardHandle.m370boximpl(artboard2.m269getArtboardHandlenSTdbJo()));
            awmlVarArr[5] = new awml("stateMachine", stateMachine);
            awmlVarArr[6] = new awml("stateMachineHandle", (readyResourcesRememberReadyResources == null || (stateMachine2 = readyResourcesRememberReadyResources.getStateMachine()) == null) ? null : StateMachineHandle.m564boximpl(stateMachine2.m318getStateMachineHandlea86gHUU()));
            awmlVarArr[7] = new awml("viewModelInstance", viewModelInstance);
            awmlVarArr[8] = new awml("globalViewModelInstances", mapD);
            awmlVarArr[9] = new awml("fit", fit);
            awmlVarArr[10] = new awml("backgroundColor", Integer.valueOf(i));
            awmlVarArr[11] = new awml("semantics", riveSemanticsMode);
            awmlVarArr[12] = new awml("semanticsEnabled", Boolean.valueOf(zRememberRiveSemanticsEnabled));
            awmlVarArr[13] = new awml("lifecycleOwner", bogVar);
            RebuggerWrapperKt.RebuggerWrapper(atqq.y(awmlVarArr), ahkVarC, 0);
            RiveSurfaceState riveSurfaceStateRememberRiveSurfaceState = rememberRiveSurfaceState(ahkVarC, 0);
            Object objC2 = ahkVarC.c();
            if (objC2 == obj) {
                objC2 = new aib(0);
                ahkVarC.D();
            }
            final ahz ahzVar = (ahz) objC2;
            final ais aisVarK = ahs.k(boolValueOf, ahkVarC);
            boolean zT = ahkVarC.t();
            Object objC3 = ahkVarC.c();
            if (zT || objC3 == obj) {
                objC3 = new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt.RiveImpl$lambda$5$0(aisVarK, ahzVar);
                    }
                };
                ahkVarC.D();
            }
            Function0 function0 = (Function0) objC3;
            int i15 = i12 & 57344;
            int i16 = i14 >> 9;
            RiveSurfaceHost(riveWorker, riveSurfaceStateRememberRiveSurfaceState, readyResourcesRememberReadyResources, akqVar, fit, rivePointerInputMode, riveFrameRate, z, zRememberRiveFocusEnabled, awqgVar, function0, ahkVarC, CommandQueue.$stable | ((Artboard.$stable | StateMachine.$stable) << 6) | ((i14 << 6) & 7168) | (Fit.$stable << 12) | i15 | (i16 & 458752) | (3670016 & i16) | ((i14 << 15) & 29360128) | ((i13 << 21) & 1879048192), 0);
            ahkVar2 = ahkVarC;
            if (readyResourcesRememberReadyResources != null) {
                ahkVar2.A();
                RiveResourceEffects(riveWorker, readyResourcesRememberReadyResources, viewModelInstance, mapD, fit, i, z, riveFrameRate, bogVar, riveSurfaceStateRememberRiveSurfaceState.getSurface(), riveSurfaceStateRememberRiveSurfaceState.getWidth(), riveSurfaceStateRememberRiveSurfaceState.getHeight(), ahzVar.a(), function0, riveSurfaceStateRememberRiveSurfaceState.getTextureView(), zRememberRiveSemanticsEnabled, zRememberRiveFocusEnabled, ahkVar2, CommandQueue.$stable | ((Artboard.$stable | StateMachine.$stable) << 3) | (ViewModelInstance.$stable << 6) | (i16 & 896) | (Fit.$stable << 12) | i15 | (i12 & 458752) | ((i14 << 12) & 3670016) | (i12 & 29360128) | (RiveSurface.$stable << 27), RiveTextureView.$stable << 12);
                ahkVar2.h();
            } else {
                ahkVar2.A();
                ahkVar2.h();
            }
            ahkVar2.f();
        } else {
            ahkVar2 = ahkVarC;
            ahkVar2.j();
        }
        ail ailVarB = ahkVar2.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RiveImpl$lambda$0$0() {
        return "Rive Recomposing";
    }

    private static final boolean RiveImpl$lambda$4(ais aisVar) {
        return ((Boolean) aisVar.e()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveImpl$lambda$5$0(ais aisVar, ahz ahzVar) {
        if (!RiveImpl$lambda$4(aisVar)) {
            ahzVar.c(ahzVar.a() + 1);
        }
        return awmy.a;
    }

    static final awmy RiveImpl$lambda$6(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, Map map, int i2, int i3, ahk ahkVar, int i4) {
        int i5 = i2 | 1;
        int i6 = i3 & 306783378;
        int i7 = 306783378 & i5;
        int i8 = i7 << 1;
        int i9 = i3 & 613566756;
        int i10 = 613566756 & i5;
        RiveImpl(riveFile, akqVar, z, artboard, stateMachine, viewModelInstance, fit, i, rivePointerInputMode, riveFrameRate, riveSemanticsMode, riveFocusMode, awqgVar, map, ahkVar, (i5 & (-920350135)) | i7 | (i10 >> 1) | (i8 & i10), (i3 & (-920350135)) | i6 | (i9 >> 1) | ((i6 << 1) & i9));
        return awmy.a;
    }

    private static final void RiveResourceEffects(CommandQueue commandQueue, ReadyResources readyResources, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, bog bogVar, RiveSurface riveSurface, int i2, int i3, int i4, Function0 function0, RiveTextureView riveTextureView, boolean z2, boolean z3, ahk ahkVar, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i5 & 6;
        ahk ahkVarC = ahkVar.C();
        if (i9 == 0) {
            i7 = (true != ((i5 & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= true != ((i5 & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            i7 |= true != ((i5 & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i5 & 3072) == 0) {
            i7 |= true != ((i5 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        if ((i5 & 24576) == 0) {
            i7 |= true != ((i5 & 32768) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((i5 & 196608) == 0) {
            i7 |= true != ahkVarC.r() ? 65536 : 131072;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= true != ahkVarC.u() ? 524288 : 1048576;
        }
        if ((12582912 & i5) == 0) {
            i7 |= true != ((16777216 & i5) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 4194304 : 8388608;
        }
        if ((100663296 & i5) == 0) {
            i7 |= true != ((134217728 & i5) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 33554432 : 67108864;
        }
        if ((805306368 & i5) == 0) {
            i7 |= true != ((i5 & 1073741824) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 268435456 : 536870912;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (true == ahkVarC.r() ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= true == ahkVarC.r() ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= true != ahkVarC.r() ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i6 & 3072) == 0) {
            i8 |= true != ahkVarC.v() ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        if ((i6 & 24576) == 0) {
            i8 |= true != ((i6 & 32768) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((i6 & 196608) == 0) {
            i8 |= true != ahkVarC.u() ? 65536 : 131072;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= true != ahkVarC.u() ? 524288 : 1048576;
        }
        if (ahkVarC.y()) {
            Artboard artboard = readyResources.getArtboard();
            StateMachine stateMachine = readyResources.getStateMachine();
            int i10 = i7 & 14;
            BindViewModelInstancesEffect(commandQueue, stateMachine, viewModelInstance, map, function0, ahkVarC, CommandQueue.$stable | i10 | (StateMachine.$stable << 3) | (ViewModelInstance.$stable << 6) | (i7 & 896) | (i7 & 7168) | ((i8 << 3) & 57344));
            int i11 = i8 >> 9;
            RiveSemanticsEffects(stateMachine, riveTextureView, z2, function0, ahkVarC, StateMachine.$stable | (RiveTextureView.$stable << 3) | (i11 & 112) | (i11 & 896) | (i8 & 7168));
            int i12 = i7 >> 6;
            UnsettleOnPresentationChangeEffect(commandQueue, stateMachine, fit, i, ahkVarC, (i12 & 7168) | CommandQueue.$stable | i10 | (StateMachine.$stable << 3) | (Fit.$stable << 6) | (i12 & 896));
            UnsettleOnPlaybackStartEffect(commandQueue, stateMachine, z, ahkVarC, CommandQueue.$stable | i10 | (StateMachine.$stable << 3) | ((i7 >> 12) & 896));
            int i13 = i8 << 15;
            UpdateArtboardLayoutEffect(commandQueue, artboard, stateMachine, fit, riveSurface, i2, i3, ahkVarC, CommandQueue.$stable | i10 | (Artboard.$stable << 3) | (StateMachine.$stable << 6) | (Fit.$stable << 9) | ((i7 >> 3) & 7168) | (RiveSurface.$stable << 12) | ((i7 >> 15) & 57344) | (i13 & 458752) | (i13 & 3670016));
            int i14 = CommandQueue.$stable | i10;
            int i15 = i7 >> 21;
            int i16 = i7 << 9;
            int i17 = i8 >> 3;
            int i18 = i8 << 6;
            DrawRiveFramesEffect(commandQueue, bogVar, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, i, z, riveFrameRate, i4, i2, i3, z2, z3, ahkVarC, i14 | (i15 & 112) | (RiveSurface.$stable << 6) | (i15 & 896) | (Artboard.$stable << 9) | (StateMachine.$stable << 12) | (ViewModelInstance.$stable << 15) | (i16 & 458752) | (3670016 & i16) | (Fit.$stable << 21) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), (i15 & 14) | (i17 & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i17) | (i17 & 458752));
            ahkVarC = ahkVarC;
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy RiveResourceEffects$lambda$0(CommandQueue commandQueue, ReadyResources readyResources, ViewModelInstance viewModelInstance, Map map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, bog bogVar, RiveSurface riveSurface, int i2, int i3, int i4, Function0 function0, RiveTextureView riveTextureView, boolean z2, boolean z3, int i5, int i6, ahk ahkVar, int i7) {
        int i8 = i5 | 1;
        int i9 = i6 & 306783378;
        int i10 = 306783378 & i8;
        int i11 = i10 << 1;
        int i12 = i6 & 613566756;
        int i13 = 613566756 & i8;
        RiveResourceEffects(commandQueue, readyResources, viewModelInstance, map, fit, i, z, riveFrameRate, bogVar, riveSurface, i2, i3, i4, function0, riveTextureView, z2, z3, ahkVar, (i8 & (-920350135)) | i10 | (i13 >> 1) | (i11 & i13), (i6 & (-920350135)) | i9 | (i12 >> 1) | ((i9 << 1) & i12));
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f6  */
    private static final void RiveSemanticsEffects(final StateMachine stateMachine, final RiveTextureView riveTextureView, final boolean z, final Function0 function0, ahk ahkVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        Object objC;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj;
        final SemanticTreeModel semanticTreeModel;
        boolean zT;
        Object objC2;
        boolean zV;
        Object objC3;
        int i4 = i & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z8 = true;
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ahkVarC.u() ? SemanticState.Focused : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ahkVarC.v() ? SemanticState.ReadOnly : 2048;
        }
        int i5 = i2;
        if (ahkVarC.y()) {
            int i6 = i5 & 14;
            boolean z9 = i6 == 4 || ((i5 & 8) != 0 && ahkVarC.t());
            Object objC4 = ahkVarC.c();
            if (z9 || objC4 == ahj.a) {
                objC4 = stateMachine.getSemanticTree();
                ahkVarC.D();
            }
            boolean z10 = (i5 & 896) == 256;
            SemanticTreeModel semanticTreeModel2 = (SemanticTreeModel) objC4;
            if (i6 != 4) {
                if ((i5 & 8) == 0 || !ahkVarC.v()) {
                    z2 = false;
                }
                z3 = z2 | z10;
                objC = ahkVarC.c();
                if (z3 || objC == ahj.a) {
                    objC = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda23
                        @Override // defpackage.awqg
                        public final Object invoke(Object obj2) {
                            return RiveKt.RiveSemanticsEffects$lambda$1$0(z, stateMachine, (ahs) obj2);
                        }
                    };
                    ahkVarC.D();
                }
                ahs.a(ahkVarC);
                i3 = i5 & 112;
                if (i3 != 32 || ((i5 & 64) != 0 && ahkVarC.v())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zV2 = z4 | z10 | ahkVarC.v();
                if (i6 != 4 || ((i5 & 8) != 0 && ahkVarC.v())) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zV2 | z5;
                if ((i5 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Object objC5 = ahkVarC.c();
                if ((!z6 && !z7) || objC5 == ahj.a) {
                    semanticTreeModel = semanticTreeModel2;
                    obj = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda24
                        @Override // defpackage.awqg
                        public final Object invoke(Object obj2) {
                            return RiveKt.RiveSemanticsEffects$lambda$2$0(riveTextureView, z, semanticTreeModel, stateMachine, function0, (ahs) obj2);
                        }
                    };
                    ahkVarC.D();
                } else {
                    obj = objC5;
                    semanticTreeModel = semanticTreeModel2;
                }
                zT = ahkVarC.t() | ahkVarC.t() | ahkVarC.t() | ahkVarC.t();
                objC2 = ahkVarC.c();
                if (zT || objC2 == ahj.a) {
                    objC2 = new ahs();
                    ahkVarC.D();
                }
                if (i3 != 32 && ((i5 & 64) == 0 || !ahkVarC.v())) {
                    z8 = false;
                }
                zV = z8 | z10 | ahkVarC.v();
                objC3 = ahkVarC.c();
                if (zV || objC3 == ahj.a) {
                    objC3 = new RiveKt$RiveSemanticsEffects$3$1(riveTextureView, z, semanticTreeModel, null);
                    ahkVarC.D();
                }
                ahs.e(ahkVarC);
            } else {
                i6 = 4;
            }
            z2 = true;
            z3 = z2 | z10;
            objC = ahkVarC.c();
            if (z3) {
                objC = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda23
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveKt.RiveSemanticsEffects$lambda$1$0(z, stateMachine, (ahs) obj2);
                    }
                };
                ahkVarC.D();
            } else {
                objC = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda23
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveKt.RiveSemanticsEffects$lambda$1$0(z, stateMachine, (ahs) obj2);
                    }
                };
                ahkVarC.D();
            }
            ahs.a(ahkVarC);
            i3 = i5 & 112;
            if (i3 != 32) {
                z4 = true;
            } else {
                z4 = true;
            }
            boolean zV3 = z4 | z10 | ahkVarC.v();
            if (i6 != 4) {
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = zV3 | z5;
            if ((i5 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object objC6 = ahkVarC.c();
            if (!z6 && !z7) {
                semanticTreeModel = semanticTreeModel2;
                obj = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda24
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0(riveTextureView, z, semanticTreeModel, stateMachine, function0, (ahs) obj2);
                    }
                };
                ahkVarC.D();
            } else {
                semanticTreeModel = semanticTreeModel2;
                obj = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda24
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0(riveTextureView, z, semanticTreeModel, stateMachine, function0, (ahs) obj2);
                    }
                };
                ahkVarC.D();
            }
            zT = ahkVarC.t() | ahkVarC.t() | ahkVarC.t() | ahkVarC.t();
            objC2 = ahkVarC.c();
            if (zT) {
                objC2 = new ahs();
                ahkVarC.D();
            } else {
                objC2 = new ahs();
                ahkVarC.D();
            }
            if (i3 != 32) {
                z8 = false;
            }
            zV = z8 | z10 | ahkVarC.v();
            objC3 = ahkVarC.c();
            if (zV) {
                objC3 = new RiveKt$RiveSemanticsEffects$3$1(riveTextureView, z, semanticTreeModel, null);
                ahkVarC.D();
            } else {
                objC3 = new RiveKt$RiveSemanticsEffects$3$1(riveTextureView, z, semanticTreeModel, null);
                ahkVarC.D();
            }
            ahs.e(ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr RiveSemanticsEffects$lambda$1$0(final boolean z, final StateMachine stateMachine, ahs ahsVar) {
        ahsVar.getClass();
        if (z) {
            stateMachine.enableSemantics();
        }
        return new ahr() { // from class: app.rive.RiveKt$RiveSemanticsEffects$lambda$1$0$$inlined$onDispose$1
            public void dispose() {
                if (z) {
                    stateMachine.clearSemanticFocusForLifecycleCleanup$third_party_java_android_libs_rive_rive_android();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr RiveSemanticsEffects$lambda$2$0(final RiveTextureView riveTextureView, boolean z, SemanticTreeModel semanticTreeModel, final StateMachine stateMachine, final Function0 function0, ahs ahsVar) {
        ahsVar.getClass();
        if (riveTextureView != null) {
            if (z) {
                riveTextureView.installSemantics(semanticTreeModel, new awqk() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda4
                    @Override // defpackage.awqk
                    public final Object invoke(Object obj, Object obj2) {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0$1(stateMachine, function0, ((Integer) obj).intValue(), (SemanticActionType) obj2);
                    }
                }, new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda5
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0$2((SemanticAccessibilityFocusTransition) obj);
                    }
                }, new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda6
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj) {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0$3(stateMachine, function0, ((Integer) obj).intValue());
                    }
                }, new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt.RiveSemanticsEffects$lambda$2$0$4(stateMachine, function0);
                    }
                });
                return new ahr() { // from class: app.rive.RiveKt$RiveSemanticsEffects$lambda$2$0$$inlined$onDispose$2
                    public void dispose() {
                        riveTextureView.clearSemantics();
                    }
                };
            }
            riveTextureView.clearSemantics();
        }
        return new ahr() { // from class: app.rive.RiveKt$RiveSemanticsEffects$lambda$2$0$$inlined$onDispose$1
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSemanticsEffects$lambda$2$0$1(StateMachine stateMachine, Function0 function0, int i, SemanticActionType semanticActionType) {
        semanticActionType.getClass();
        stateMachine.fireSemanticAction(i, semanticActionType);
        function0.invoke();
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSemanticsEffects$lambda$2$0$2(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition) {
        semanticAccessibilityFocusTransition.getClass();
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSemanticsEffects$lambda$2$0$3(StateMachine stateMachine, Function0 function0, int i) {
        stateMachine.requestSemanticFocus(i);
        function0.invoke();
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSemanticsEffects$lambda$2$0$4(StateMachine stateMachine, Function0 function0) {
        stateMachine.clearSemanticFocusForLifecycleCleanup$third_party_java_android_libs_rive_rive_android();
        function0.invoke();
        return awmy.a;
    }

    static final awmy RiveSemanticsEffects$lambda$4(StateMachine stateMachine, RiveTextureView riveTextureView, boolean z, Function0 function0, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        RiveSemanticsEffects(stateMachine, riveTextureView, z, function0, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }

    /* JADX WARN: Type inference failed for: r12v15, types: [awou, java.lang.Object] */
    private static final void RiveSurfaceHost(final CommandQueue commandQueue, final RiveSurfaceState riveSurfaceState, ReadyResources readyResources, akq akqVar, Fit fit, RivePointerInputMode rivePointerInputMode, final RiveFrameRate riveFrameRate, final boolean z, boolean z2, awqg awqgVar, Function0 function0, ahk ahkVar, int i, int i2) {
        int i3;
        ais aisVarC;
        ais aisVarC2;
        ais aisVarC3;
        StateMachine stateMachine;
        StateMachine stateMachine2;
        Object obj;
        int i4;
        StateMachine stateMachine3;
        int i5 = i & 6;
        ahk ahkVarC = ahkVar.C();
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ahkVarC.v() ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i & 3072) == 0) {
            i3 |= true != ahkVarC.t() ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        if ((i & 24576) == 0) {
            i3 |= true != ((32768 & i) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((196608 & i) == 0) {
            rivePointerInputMode.ordinal();
            i3 |= true != ahkVarC.r() ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((i & 2097152) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != ahkVarC.u() ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != ahkVarC.u() ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != ahkVarC.v() ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            ahkVarC.v();
        }
        if (ahkVarC.y()) {
            final RiveSurface surface = riveSurfaceState.getSurface();
            int width = riveSurfaceState.getWidth();
            int height = riveSurfaceState.getHeight();
            axat settled$third_party_java_android_libs_rive_rive_android = (readyResources == null || (stateMachine3 = readyResources.getStateMachine()) == null) ? null : stateMachine3.getSettled$third_party_java_android_libs_rive_rive_android();
            ahkVarC.A();
            if (settled$third_party_java_android_libs_rive_rive_android == null) {
                ahkVarC.h();
                aisVarC = null;
            } else {
                aisVarC = aie.c(settled$third_party_java_android_libs_rive_rive_android, ahkVarC);
                ahkVarC.h();
            }
            final boolean zBooleanValue = aisVarC != null ? ((Boolean) aisVarC.e()).booleanValue() : true;
            boolean zV = ahkVarC.v();
            Object objC = ahkVarC.c();
            if (zV || objC == ahj.a) {
                objC = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda13
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj2) {
                        return RiveKt.RiveSurfaceHost$lambda$0$0(surface, (ahs) obj2);
                    }
                };
                ahkVarC.D();
            }
            ahs.b(ahkVarC);
            final ais aisVarK = ahs.k(awqgVar, ahkVarC);
            Object objC2 = ahkVarC.c();
            Object obj2 = ahj.a;
            if (objC2 == obj2) {
                aid aidVar = new aid(Boolean.FALSE, aii.c);
                ahkVarC.D();
                objC2 = aidVar;
            }
            final aia aiaVar = (aia) objC2;
            final RiveTextureView textureView = riveSurfaceState.getTextureView();
            boolean zV2 = ahkVarC.v() | ahkVarC.v();
            Object objC3 = ahkVarC.c();
            if (zV2 || objC3 == obj2) {
                objC3 = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda15
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj3) {
                        return RiveKt.RiveSurfaceHost$lambda$5$0(riveSurfaceState, textureView, (ahs) obj3);
                    }
                };
                ahkVarC.D();
            }
            ahs.b(ahkVarC);
            final ais aisVarK2 = ahs.k(function0, ahkVarC);
            Function0 function1 = new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RiveKt.RiveSurfaceHost$lambda$7();
                }
            };
            Object objC4 = ahkVarC.c();
            if (objC4 == obj2) {
                ?? Invoke = function1.invoke();
                if (Invoke.get(awwd.d) != null) {
                    awwf awwfVar = new awwf(null);
                    awwfVar.L(new awum(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
                    objC4 = awrc.K(awwfVar);
                } else {
                    objC4 = new aik(ahkVarC.d(), Invoke);
                }
                ahkVarC.D();
            }
            awut awutVar = (awut) objC4;
            ahm ahmVar = aoq.a;
            final akv akvVar = (akv) ahkVarC.w();
            final StateMachine stateMachine4 = readyResources != null ? readyResources.getStateMachine() : null;
            boolean zT = ahkVarC.t() | ahkVarC.t() | ahkVarC.t();
            Object objC5 = ahkVarC.c();
            if (zT || objC5 == obj2) {
                objC5 = stateMachine4 == null ? null : new RiveFocusSession(awutVar, new RiveKt$RiveSurfaceHost$focusSession$1$1(stateMachine4), new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda17
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(RiveKt.RiveSurfaceHost$lambda$8$0(akvVar, (RiveFocusDirection) obj3));
                    }
                }, new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt.RiveSurfaceHost$lambda$8$1(stateMachine4);
                    }
                }, new Function0() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RiveKt.RiveSurfaceHost$lambda$8$2(aisVarK2);
                    }
                });
                ahkVarC.D();
            }
            final RiveFocusSession riveFocusSession = (RiveFocusSession) objC5;
            boolean zT2 = ahkVarC.t();
            Object objC6 = ahkVarC.c();
            if (zT2 || objC6 == obj2) {
                objC6 = stateMachine4 != null ? commandQueue.m462xdf4bf704(stateMachine4.m318getStateMachineHandlea86gHUU()) : null;
                ahkVarC.D();
            }
            axat axatVar = (axat) objC6;
            ahkVarC.A();
            if (axatVar == null) {
                ahkVarC.h();
                aisVarC2 = null;
            } else {
                aisVarC2 = aie.c(axatVar, ahkVarC);
                ahkVarC.h();
            }
            final boolean z3 = z2 && !awrc.c(aisVarC2 != null ? (Boolean) aisVarC2.e() : null, Boolean.FALSE);
            boolean zU = ahkVarC.u() | ahkVarC.v() | ahkVarC.v();
            Object objC7 = ahkVarC.c();
            if (zU || objC7 == obj2) {
                objC7 = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda20
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj3) {
                        return RiveKt.RiveSurfaceHost$lambda$10$0(z3, riveFocusSession, riveSurfaceState, (ahs) obj3);
                    }
                };
                ahkVarC.D();
            }
            RiveFocusSession.Companion companion = RiveFocusSession.Companion;
            ahs.a(ahkVarC);
            axat focusState = stateMachine4 != null ? stateMachine4.getFocusState() : null;
            ahkVarC.A();
            if (focusState == null) {
                ahkVarC.h();
                aisVarC3 = null;
            } else {
                aisVarC3 = aie.c(focusState, ahkVarC);
                ahkVarC.h();
            }
            RiveFocusState riveFocusState = aisVarC3 != null ? (RiveFocusState) aisVarC3.e() : null;
            boolean zU2 = ahkVarC.u() | ahkVarC.v() | ahkVarC.v();
            Object objC8 = ahkVarC.c();
            if (zU2 || objC8 == obj2) {
                stateMachine = null;
                objC8 = new RiveKt$RiveSurfaceHost$4$1(z3, riveFocusState, riveFocusSession, null);
                ahkVarC.D();
            } else {
                stateMachine = null;
            }
            ahs.e(ahkVarC);
            akq akqVarRiveFocus = riveFocus(akqVar, riveFocusSession, z3, riveSurfaceState);
            if (readyResources != null) {
                obj = obj2;
                stateMachine2 = readyResources.getStateMachine();
                i4 = 8388608;
            } else {
                stateMachine2 = stateMachine;
                obj = obj2;
                i4 = 8388608;
            }
            akq akqVarRivePointerInput = rivePointerInput(akqVarRiveFocus, commandQueue, stateMachine2, fit, width, height, rivePointerInputMode, function0);
            Object objC9 = ahkVarC.c();
            if (objC9 == obj) {
                objC9 = RiveKt$RiveSurfaceHost$6$1.INSTANCE;
                ahkVarC.D();
            }
            ane aneVar = (ane) objC9;
            int iM = RiveKt$$ExternalSyntheticBackport0.m(ahkVarC.a());
            ajm ajmVarG = ahkVarC.G();
            akq akqVarA = aao.a(ahkVarC, akqVarRivePointerInput);
            if (!(ahkVarC.E() instanceof ahf)) {
                dl.j();
            }
            ahkVarC.m();
            if (ahkVarC.p()) {
                ahkVarC.x();
            } else {
                ahkVarC.n();
            }
            aiu.a(ahkVarC, aneVar);
            aiu.a(ahkVarC, ajmVarG);
            aiu.a(ahkVarC, Integer.valueOf(iM));
            ahkVarC.q();
            aiu.a(ahkVarC, akqVarA);
            boolean zV3 = ahkVarC.v() | ((i6 & 14) == 4 || ((i6 & 8) != 0 && ahkVarC.v())) | ahkVarC.t();
            Object objC10 = ahkVarC.c();
            if (zV3 || objC10 == obj) {
                objC10 = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda21
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj3) {
                        return RiveKt.RiveSurfaceHost$lambda$12$0$0(riveSurfaceState, commandQueue, aiaVar, aisVarK, (Context) obj3);
                    }
                };
                ahkVarC.D();
            }
            final awqg awqgVar2 = (awqg) objC10;
            boolean zU3 = ((i6 & 3670016) == 1048576 || ((i6 & 2097152) != 0 && ahkVarC.v())) | ((i6 & 29360128) == i4) | ahkVarC.u();
            Object objC11 = ahkVarC.c();
            if (zU3 || objC11 == obj) {
                objC11 = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda22
                    @Override // defpackage.awqg
                    public final Object invoke(Object obj3) {
                        return RiveKt.RiveSurfaceHost$lambda$12$1$0(riveFrameRate, z, zBooleanValue, (RiveTextureView) obj3);
                    }
                };
                ahkVarC.D();
            }
            awqg awqgVar3 = (awqg) objC11;
            ahk ahkVarC2 = ahkVarC.C();
            int i7 = true != ahkVarC2.v() ? 2 : 4;
            int i8 = true != ahkVarC2.v() ? SemanticState.Focused : SemanticState.Hidden;
            if (ahkVarC2.y()) {
                int i9 = i7 | 48 | i8;
                awqg awqgVar4 = apt.a;
                ahk ahkVarC3 = ahkVarC2.C();
                int i10 = (i9 & 14) | 3120 | ((i9 << 6) & 57344) | 384;
                if (ahkVarC3.y()) {
                    int iAk = a.ak(ahkVarC3.a());
                    akq akqVarA2 = aao.a(ahkVarC3, aaq.a(apv.a).then(apx.a).then(apw.a));
                    apf apfVar = (apf) ahkVarC3.w();
                    apj apjVar = (apj) ahkVarC3.w();
                    ajm ajmVarG2 = ahkVarC3.G();
                    int i11 = bpq.a;
                    bog bogVar = (bog) ahkVarC3.w();
                    int i12 = doy.a;
                    dow dowVar = (dow) ahkVarC3.w();
                    ahkVarC3.A();
                    final int iAk2 = a.ak(ahkVarC3.a());
                    ahm ahmVar2 = aog.a;
                    final Context context = (Context) ahkVarC3.w();
                    final dl dlVarH = ahkVarC3.H();
                    int i13 = ajt.a;
                    final ajs ajsVar = (ajs) ahkVarC3.w();
                    final View view = (View) ahkVarC3.w();
                    boolean zV4 = ahkVarC3.v() | ((((i10 & 14) ^ 6) > 4 && ahkVarC3.t()) || (i10 & 6) == 4) | ahkVarC3.v() | ahkVarC3.v() | ahkVarC3.r() | ahkVarC3.v();
                    Object objC12 = ahkVarC3.c();
                    if (zV4 || objC12 == obj) {
                        objC12 = new Function0() { // from class: aps
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                View view2 = view;
                                view2.getClass();
                                awqg awqgVar5 = awqgVar2;
                                Context context2 = context;
                                return new apq(context2, dlVarH, (View) awqgVar5.invoke(context2), new acw(), ajsVar, iAk2).j;
                            }
                        };
                        ahkVarC3.D();
                    }
                    if (!(ahkVarC3.E() instanceof aod)) {
                        dl.j();
                    }
                    ahkVarC3.l();
                    if (ahkVarC3.p()) {
                        ahkVarC3.x();
                    } else {
                        ahkVarC3.n();
                    }
                    aiu.a(ahkVarC3, ajmVarG2);
                    aiu.a(ahkVarC3, akqVarA2);
                    aiu.a(ahkVarC3, apfVar);
                    aiu.a(ahkVarC3, bogVar);
                    aiu.a(ahkVarC3, dowVar);
                    aiu.a(ahkVarC3, apjVar);
                    aiu.a(ahkVarC3, Integer.valueOf(iAk));
                    aiu.a(ahkVarC3, awqgVar3);
                    aiu.a(ahkVarC3, awqgVar4);
                    ahkVarC3.g();
                    ahkVarC3.h();
                } else {
                    ahkVarC3.j();
                }
                ail ailVarB = ahkVarC3.b();
                if (ailVarB != null) {
                    ailVarB.a();
                }
            } else {
                ahkVarC2 = ahkVarC2;
                ahkVarC2.j();
            }
            ail ailVarB2 = ahkVarC2.b();
            if (ailVarB2 != null) {
                ailVarB2.a();
            }
            ahkVarC.g();
        } else {
            ahkVarC.j();
        }
        ail ailVarB3 = ahkVarC.b();
        if (ailVarB3 != null) {
            ailVarB3.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr RiveSurfaceHost$lambda$0$0(final RiveSurface riveSurface, ahs ahsVar) {
        ahsVar.getClass();
        return riveSurface == null ? new ahr() { // from class: app.rive.RiveKt$RiveSurfaceHost$lambda$0$0$$inlined$onDispose$1
            public void dispose() {
            }
        } : new ahr() { // from class: app.rive.RiveKt$RiveSurfaceHost$lambda$0$0$$inlined$onDispose$2
            public void dispose() {
                riveSurface.close();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awqg RiveSurfaceHost$lambda$1(ais aisVar) {
        return (awqg) aisVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr RiveSurfaceHost$lambda$10$0(boolean z, final RiveFocusSession riveFocusSession, RiveSurfaceState riveSurfaceState, ahs ahsVar) {
        ahsVar.getClass();
        if (!z) {
            riveSurfaceState.setFocused(false);
        } else if (riveFocusSession != null) {
            RiveFocusSession.onSurfaceFocusChanged$default(riveFocusSession, riveSurfaceState.getFocused(), null, 2, null);
        }
        return new ahr() { // from class: app.rive.RiveKt$RiveSurfaceHost$lambda$10$0$$inlined$onDispose$1
            public void dispose() {
                RiveFocusSession riveFocusSession2 = riveFocusSession;
                if (riveFocusSession2 != null) {
                    riveFocusSession2.dispose();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RiveTextureView RiveSurfaceHost$lambda$12$0$0(RiveSurfaceState riveSurfaceState, CommandQueue commandQueue, aia aiaVar, ais aisVar, Context context) {
        context.getClass();
        RiveTextureView riveTextureView = new RiveTextureView(context);
        riveTextureView.setOpaque(false);
        riveTextureView.setSurfaceTextureListener(new RiveKt$RiveSurfaceHost$5$1$1$1$1(riveSurfaceState, commandQueue, aiaVar, riveTextureView, aisVar));
        riveSurfaceState.setTextureView(riveTextureView);
        return riveTextureView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSurfaceHost$lambda$12$1$0(RiveFrameRate riveFrameRate, boolean z, boolean z2, RiveTextureView riveTextureView) {
        riveTextureView.getClass();
        boolean z3 = false;
        if (z && !z2) {
            z3 = true;
        }
        RiveFrameRateHintKt.applyRequestedFrameRateHint(riveTextureView, riveFrameRate, z3);
        return awmy.a;
    }

    static final awmy RiveSurfaceHost$lambda$14(CommandQueue commandQueue, RiveSurfaceState riveSurfaceState, ReadyResources readyResources, akq akqVar, Fit fit, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, boolean z, boolean z2, awqg awqgVar, Function0 function0, int i, int i2, ahk ahkVar, int i3) {
        int i4 = i | 1;
        int i5 = i2 & 306783378;
        int i6 = 306783378 & i4;
        int i7 = i6 << 1;
        int i8 = i2 & 613566756;
        int i9 = 613566756 & i4;
        RiveSurfaceHost(commandQueue, riveSurfaceState, readyResources, akqVar, fit, rivePointerInputMode, riveFrameRate, z, z2, awqgVar, function0, ahkVar, (i4 & (-920350135)) | i6 | (i9 >> 1) | (i7 & i9), (i2 & (-920350135)) | i5 | (i8 >> 1) | ((i5 << 1) & i8));
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RiveSurfaceHost$lambda$3(aia aiaVar) {
        return ((Boolean) aiaVar.e()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveSurfaceHost$lambda$4(aia aiaVar, boolean z) {
        aiaVar.f(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr RiveSurfaceHost$lambda$5$0(final RiveSurfaceState riveSurfaceState, final RiveTextureView riveTextureView, ahs ahsVar) {
        ahsVar.getClass();
        return new ahr() { // from class: app.rive.RiveKt$RiveSurfaceHost$lambda$5$0$$inlined$onDispose$1
            public void dispose() {
                if (riveSurfaceState.getTextureView() == riveTextureView) {
                    riveSurfaceState.setTextureView(null);
                }
            }
        };
    }

    private static final Function0 RiveSurfaceHost$lambda$6(ais aisVar) {
        return (Function0) aisVar.e();
    }

    static final awou RiveSurfaceHost$lambda$7() {
        awuq awuqVar = awvi.a;
        return axds.a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RiveSurfaceHost$lambda$8$0(akv akvVar, RiveFocusDirection riveFocusDirection) {
        riveFocusDirection.getClass();
        RiveFocusDirection riveFocusDirection2 = RiveFocusDirection.Next;
        int iOrdinal = riveFocusDirection.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return akvVar.a();
        }
        throw new awmj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSurfaceHost$lambda$8$1(StateMachine stateMachine) {
        try {
            stateMachine.clearFocus();
        } catch (RiveResourceClosedException unused) {
        }
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy RiveSurfaceHost$lambda$8$2(ais aisVar) {
        RiveSurfaceHost$lambda$6(aisVar).invoke();
        return awmy.a;
    }

    private static final void UnsettleOnPlaybackStartEffect(CommandQueue commandQueue, StateMachine stateMachine, boolean z, ahk ahkVar, int i) {
        int i2;
        int i3 = i & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z2 = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ahkVarC.u() ? SemanticState.Focused : 256;
        }
        if (ahkVarC.y()) {
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !ahkVarC.v())) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objC = ahkVarC.c();
            if (z4 || objC == ahj.a) {
                objC = new RiveKt$UnsettleOnPlaybackStartEffect$1$1(z, stateMachine, null);
                ahkVarC.D();
            }
            CommandQueue.Companion companion = CommandQueue.Companion;
            ahs.e(ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy UnsettleOnPlaybackStartEffect$lambda$1(CommandQueue commandQueue, StateMachine stateMachine, boolean z, int i, ahk ahkVar, int i2) {
        int i3 = i | 1;
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        UnsettleOnPlaybackStartEffect(commandQueue, stateMachine, z, ahkVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 << 1) & i5));
        return awmy.a;
    }

    private static final void UnsettleOnPresentationChangeEffect(CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, ahk ahkVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z = true;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Focused : SemanticState.Hidden;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != ahkVarC.r() ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        if (ahkVarC.y()) {
            long jM318getStateMachineHandlea86gHUU = stateMachine.m318getStateMachineHandlea86gHUU();
            boolean zS = ahkVarC.s();
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !ahkVarC.v())) {
                z = false;
            }
            boolean z2 = zS | z;
            Object objC = ahkVarC.c();
            if (z2 || objC == ahj.a) {
                objC = new RiveKt$UnsettleOnPresentationChangeEffect$1$1(stateMachine, jM318getStateMachineHandlea86gHUU, null);
                ahkVarC.D();
            }
            CommandQueue.Companion companion = CommandQueue.Companion;
            ahs.c(ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy UnsettleOnPresentationChangeEffect$lambda$1(CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, int i2, ahk ahkVar, int i3) {
        int i4 = i2 | 1;
        int i5 = 306783378 & i4;
        int i6 = 613566756 & i4;
        UnsettleOnPresentationChangeEffect(commandQueue, stateMachine, fit, i, ahkVar, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
        return awmy.a;
    }

    private static final void UpdateArtboardLayoutEffect(CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, Fit fit, RiveSurface riveSurface, int i, int i2, ahk ahkVar, int i3) {
        int i4;
        int i5 = i3 & 6;
        ahk ahkVarC = ahkVar.C();
        boolean z = true;
        if (i5 == 0) {
            i4 = (true != ((i3 & 8) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != ((i3 & 64) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != ((i3 & SemanticState.LiveRegion) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Focused : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != ((i3 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != ((i3 & 32768) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != ahkVarC.r() ? 65536 : 131072;
        }
        if ((i3 & 1572864) == 0) {
            i4 |= true != ahkVarC.r() ? 524288 : 1048576;
        }
        if (ahkVarC.y()) {
            Object[] objArr = {commandQueue, artboard, stateMachine, fit, riveSurface, Integer.valueOf(i), Integer.valueOf(i2)};
            boolean z2 = ((57344 & i4) == 16384 || ((32768 & i4) != 0 && ahkVarC.v())) | ((i4 & 7168) == 2048 || ((i4 & SemanticState.Obscured) != 0 && ahkVarC.v()));
            boolean z3 = (458752 & i4) == 131072;
            boolean z4 = (3670016 & i4) == 1048576;
            boolean z5 = (i4 & 112) == 32 || ((i4 & 64) != 0 && ahkVarC.v());
            boolean z6 = z2 | z3 | z4;
            if ((i4 & 896) != 256 && ((i4 & SemanticState.LiveRegion) == 0 || !ahkVarC.v())) {
                z = false;
            }
            Object objC = ahkVarC.c();
            if ((z6 | z5 | z) || objC == ahj.a) {
                RiveKt$UpdateArtboardLayoutEffect$1$1 riveKt$UpdateArtboardLayoutEffect$1$1 = new RiveKt$UpdateArtboardLayoutEffect$1$1(riveSurface, fit, stateMachine, artboard, i, i2, null);
                ahkVarC.D();
                objC = riveKt$UpdateArtboardLayoutEffect$1$1;
            }
            ahs.d(objArr, ahkVarC);
        } else {
            ahkVarC.j();
        }
        ail ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }

    static final awmy UpdateArtboardLayoutEffect$lambda$1(CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, Fit fit, RiveSurface riveSurface, int i, int i2, int i3, ahk ahkVar, int i4) {
        int i5 = i3 | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        UpdateArtboardLayoutEffect(commandQueue, artboard, stateMachine, fit, riveSurface, i, i2, ahkVar, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
        return awmy.a;
    }

    private static final ReadyResources rememberReadyResources(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ahk ahkVar, int i) {
        Artboard artboard2;
        StateMachine stateMachine2;
        ahkVar.A();
        ReadyResources readyResources = null;
        Result success = artboard != null ? new Result.Success(artboard) : null;
        ahkVar.A();
        if (success == null) {
            success = ArtboardKt.rememberArtboardResult(riveFile, null, ahkVar, i & 14, 2);
        }
        ahkVar.h();
        Result.Success success2 = success instanceof Result.Success ? (Result.Success) success : null;
        if (success2 != null && (artboard2 = (Artboard) success2.getValue()) != null) {
            Result success3 = stateMachine != null ? new Result.Success(stateMachine) : null;
            if (success3 == null) {
                ahkVar.A();
                success3 = StateMachineKt.rememberStateMachineResult(artboard2, null, ahkVar, Artboard.$stable, 2);
            } else {
                ahkVar.A();
            }
            ahkVar.h();
            Result.Success success4 = success3 instanceof Result.Success ? (Result.Success) success3 : null;
            if (success4 != null && (stateMachine2 = (StateMachine) success4.getValue()) != null) {
                readyResources = new ReadyResources(artboard2, stateMachine2);
            }
        }
        ahkVar.h();
        return readyResources;
    }

    private static final RiveSurfaceState rememberRiveSurfaceState(ahk ahkVar, int i) {
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new RiveSurfaceState();
            ahkVar.D();
        }
        return (RiveSurfaceState) objC;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aky] */
    private static final akq riveFocus(akq akqVar, final RiveFocusSession riveFocusSession, boolean z, final RiveSurfaceState riveSurfaceState) {
        if (riveFocusSession == null) {
            return akqVar;
        }
        if (true != z) {
            riveFocusSession = null;
        }
        if (riveFocusSession == null) {
            return akqVar;
        }
        final awqg awqgVar = new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda11
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveKt.riveFocus$lambda$1(riveSurfaceState, (akw) obj);
            }
        };
        return aaq.a(aaq.a(akqVar.then(new akx(new awqy() { // from class: aky
            public final boolean equals(Object obj) {
                if ((obj instanceof aky) && (obj instanceof awqy)) {
                    return awrc.c(awqgVar, ((awqy) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // defpackage.awqy
            public final awmf getFunctionDelegate() {
                return awqgVar;
            }

            public final int hashCode() {
                return awqgVar.hashCode();
            }
        }))).then(new aks(new awqg() { // from class: app.rive.RiveKt$$ExternalSyntheticLambda12
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return RiveKt.riveFocus$lambda$2(riveSurfaceState, riveFocusSession, (alc) obj);
            }
        })).then(new amj(new awqg() { // from class: app.rive.RiveKt.riveFocus.3
            @Override // defpackage.awqg
            public /* synthetic */ Object invoke(Object obj) {
                throw null;
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m309invokeZmokQxo(KeyEvent keyEvent) {
                int i;
                keyEvent.getClass();
                int action = keyEvent.getAction();
                boolean zOnTraversalKey = false;
                if (action != 0) {
                    i = 1;
                    if (action != 1) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
                if (hmy.j(i, 2) && a.aB(acq.a(keyEvent.getKeyCode()), acq.a(61))) {
                    zOnTraversalKey = riveFocusSession.onTraversalKey(keyEvent.isShiftPressed() ? RiveFocusDirection.Previous : RiveFocusDirection.Next);
                }
                return Boolean.valueOf(zOnTraversalKey);
            }
        })).then(new amv(riveSurfaceState.getFocusRequester(), new PointerInputEventHandler() { // from class: app.rive.RiveKt.riveFocus.4

            /* JADX INFO: renamed from: app.rive.RiveKt$riveFocus$4$1, reason: invalid class name */
            /* JADX INFO: compiled from: PG */
            final class AnonymousClass1 extends awpj implements awqk {
                final /* synthetic */ RiveSurfaceState $surfaceState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(RiveSurfaceState riveSurfaceState, awoq awoqVar) {
                    super(2, awoqVar);
                    this.$surfaceState = riveSurfaceState;
                }

                @Override // defpackage.awpe
                public final awoq create(Object obj, awoq awoqVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$surfaceState, awoqVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.awqk
                public final Object invoke(amo amoVar, awoq awoqVar) {
                    return ((AnonymousClass1) create(amoVar, awoqVar)).invokeSuspend(awmy.a);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:14:0x0037  */
                /* JADX WARN: Code duplicated, block: B:16:0x0043  */
                /* JADX WARN: Code duplicated, block: B:18:0x0047  */
                /* JADX WARN: Code duplicated, block: B:20:0x004d  */
                /* JADX WARN: Code duplicated, block: B:21:0x0055  */
                /* JADX WARN: Code duplicated, block: B:23:0x005a  */
                /* JADX WARN: Code duplicated, block: B:26:0x007d  */
                /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:2: B:29:0x008f->B:30:0x0091, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:32:0x0096  */
                /* JADX WARN: Code duplicated, block: B:34:0x009c  */
                /* JADX WARN: Code duplicated, block: B:38:0x008f A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:39:0x008b A[SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:0x0091
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // defpackage.awpe
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        awox r0 = defpackage.awox.a
                        int r1 = r8.label
                        r2 = 1
                        if (r1 == 0) goto L19
                        if (r1 != r2) goto L11
                        java.lang.Object r1 = r8.L$0
                        amo r1 = (defpackage.amo) r1
                        defpackage.atqp.j(r9)
                        goto L2c
                    L11:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L19:
                        defpackage.atqp.j(r9)
                        java.lang.Object r9 = r8.L$0
                        amo r9 = (defpackage.amo) r9
                        r1 = r9
                    L21:
                        r8.L$0 = r1
                        r8.label = r2
                        java.lang.Object r9 = r1.a()
                        if (r9 != r0) goto L2c
                        return r0
                    L2c:
                        amp r9 = (defpackage.amp) r9
                        int r9 = r9.a
                        r9 = 3
                        boolean r9 = defpackage.hmy.j(r9, r2)
                        if (r9 == 0) goto L21
                        app.rive.RiveSurfaceState r9 = r8.$surfaceState
                        akz r9 = r9.getFocusRequester()
                        akz r3 = defpackage.akz.a
                        java.lang.String r4 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
                        if (r9 == r3) goto L9c
                        akz r3 = defpackage.akz.b
                        if (r9 == r3) goto L96
                        aiz r9 = r9.c
                        int r3 = r9.b
                        if (r3 != 0) goto L55
                        java.io.PrintStream r9 = java.lang.System.out
                        java.lang.String r3 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
                        r9.println(r3)
                        goto L21
                    L55:
                        java.lang.Object[] r9 = r9.a
                        r4 = 0
                    L58:
                        if (r4 >= r3) goto L21
                        r5 = r9[r4]
                        alb r5 = (defpackage.alb) r5
                        r5.a()
                        java.lang.String r6 = "visitChildren called on an unattached node"
                        defpackage.amw.b(r6)
                        aiz r6 = new aiz
                        r7 = 16
                        akp[] r7 = new defpackage.akp[r7]
                        r6.<init>(r7)
                        r5.a()
                        akp r5 = r5.a()
                        defpackage.amw.c(r6, r5)
                    L79:
                        int r5 = r6.b
                        if (r5 == 0) goto L93
                        int r5 = r5 + (-1)
                        java.lang.Object r5 = r6.b(r5)
                        akp r5 = (defpackage.akp) r5
                        int r7 = r5.b
                        r7 = r7 & 1024(0x400, float:1.435E-42)
                        if (r7 != 0) goto L8f
                        defpackage.amw.c(r6, r5)
                        goto L79
                    L8f:
                        if (r5 == 0) goto L79
                        r5 = 0
                        goto L8f
                    L93:
                        int r4 = r4 + 1
                        goto L58
                    L96:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        r8.<init>(r4)
                        throw r8
                    L9c:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        r8.<init>(r4)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.rive.RiveKt.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public final Object invoke(ams amsVar, awoq awoqVar) {
                new AnonymousClass1(riveSurfaceState, null);
                Object objA = amsVar.a();
                return objA != awox.a ? awmy.a : objA;
            }
        })).then(new ala(riveSurfaceState.getFocusRequester())));
    }

    static final awmy riveFocus$lambda$1(RiveSurfaceState riveSurfaceState, akw akwVar) {
        akwVar.getClass();
        akwVar.a();
        akwVar.b();
        return awmy.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy riveFocus$lambda$1$0(RiveSurfaceState riveSurfaceState, aku akuVar) {
        akuVar.getClass();
        riveSurfaceState.m316setEntryDirectionRvHMakY(new akt());
        return awmy.a;
    }

    static final awmy riveFocus$lambda$2(RiveSurfaceState riveSurfaceState, RiveFocusSession riveFocusSession, alc alcVar) {
        alcVar.getClass();
        akt aktVarM315getEntryDirection6Ue6xsY = riveSurfaceState.m315getEntryDirection6Ue6xsY();
        RiveFocusDirection riveFocusDirection = null;
        riveSurfaceState.m316setEntryDirectionRvHMakY(null);
        riveSurfaceState.setFocused(alcVar.a());
        boolean zA = alcVar.a();
        if (aktVarM315getEntryDirection6Ue6xsY != null) {
            if (hmy.j(7, 1)) {
                riveFocusDirection = RiveFocusDirection.Next;
            } else if (hmy.j(7, 2)) {
                riveFocusDirection = RiveFocusDirection.Previous;
            }
        }
        riveFocusSession.onSurfaceFocusChanged(zA, riveFocusDirection);
        return awmy.a;
    }

    private static final akq rivePointerInput(akq akqVar, CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, int i2, RivePointerInputMode rivePointerInputMode, Function0 function0) {
        return stateMachine != null ? akqVar.then(new ako(rivePointerInputMode, stateMachine, commandQueue, function0, stateMachine.m318getStateMachineHandlea86gHUU(), fit, i, i2) { // from class: app.rive.RiveKt.rivePointerInput.1
            private final amr pointerInputFilter;

            {
                this.pointerInputFilter = new amr(stateMachine, commandQueue, function0, j, fit, i, i2) { // from class: app.rive.RiveKt$rivePointerInput$1$pointerInputFilter$1
                    final /* synthetic */ StateMachine $activeStateMachine;
                    final /* synthetic */ Fit $fit;
                    final /* synthetic */ Function0 $requestPausedFrame;
                    final /* synthetic */ CommandQueue $riveWorker;
                    final /* synthetic */ long $stateMachineHandle;
                    final /* synthetic */ int $surfaceHeight;
                    final /* synthetic */ int $surfaceWidth;
                    private final boolean shareWithSiblings;

                    {
                        this.$activeStateMachine = stateMachine;
                        this.$riveWorker = commandQueue;
                        this.$requestPausedFrame = function0;
                        this.$stateMachineHandle = j;
                        this.$fit = fit;
                        this.$surfaceWidth = i;
                        this.$surfaceHeight = i2;
                        this.shareWithSiblings = this.$pointerInputMode == RivePointerInputMode.PassThrough;
                    }

                    @Override // defpackage.amr
                    public boolean getShareWithSiblings() {
                        return this.shareWithSiblings;
                    }

                    @Override // defpackage.amr
                    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
                    public void mo109onPointerEventH0pRuoY(amp ampVar, amq amqVar, long j) {
                        ampVar.getClass();
                        amqVar.getClass();
                        Function0 function1 = this.$requestPausedFrame;
                        StateMachine stateMachine2 = this.$activeStateMachine;
                        if (amqVar == amq.b) {
                            stateMachine2.unsettle$third_party_java_android_libs_rive_rive_android();
                            boolean zJ = hmy.j(3, 3);
                            CommandQueue commandQueue2 = this.$riveWorker;
                            if (zJ) {
                                atqq.H(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$1(commandQueue2));
                            } else if (hmy.j(3, 2)) {
                                atqq.aL(new awsf[]{new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$2(commandQueue2), new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$3(commandQueue2)});
                            } else if (hmy.j(3, 1)) {
                                atqq.H(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$4(commandQueue2));
                            } else if (!hmy.j(3, 5)) {
                                return;
                            } else {
                                atqq.H(new RiveKt$rivePointerInput$1$pointerInputFilter$1$onPointerEvent$1$pointerFunctions$5(commandQueue2));
                            }
                            function1.invoke();
                        }
                    }

                    @Override // defpackage.amr
                    public void onCancel() {
                    }
                };
            }

            @Override // defpackage.akq
            public /* synthetic */ boolean all(awqg awqgVar) {
                return ((Boolean) awqgVar.invoke(this)).booleanValue();
            }

            public /* synthetic */ boolean any(awqg awqgVar) {
                return ((Boolean) awqgVar.invoke(this)).booleanValue();
            }

            @Override // defpackage.akq
            public /* synthetic */ Object foldIn(Object obj, awqk awqkVar) {
                return awqkVar.invoke(obj, this);
            }

            public /* synthetic */ Object foldOut(Object obj, awqk awqkVar) {
                return awqkVar.invoke(this, obj);
            }

            public amr getPointerInputFilter() {
                return this.pointerInputFilter;
            }

            @Override // defpackage.akq
            public /* synthetic */ akq then(akq akqVar2) {
                return akqVar2 != akq.c ? new akj(this, akqVar2) : this;
            }
        }) : akqVar;
    }

    public static final void validateRiveResourceArguments(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map) {
        riveFile.getClass();
        map.getClass();
        riveFile.checkOpen$third_party_java_android_libs_rive_rive_android();
        if (artboard != null) {
            artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        if (stateMachine != null) {
            stateMachine.checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        if (viewModelInstance != null) {
            viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ViewModelInstance) it.next()).checkOpen$third_party_java_android_libs_rive_rive_android();
        }
        if (artboard != null) {
            artboard.requireFromFile$third_party_java_android_libs_rive_rive_android(riveFile);
        }
        if (stateMachine != null) {
            if (artboard == null) {
                throw new RiveIncompatibleResourceException("StateMachine " + StateMachineHandle.m569toStringimpl(stateMachine.m318getStateMachineHandlea86gHUU()) + " requires its originating Artboard");
            }
            stateMachine.requireFromArtboard$third_party_java_android_libs_rive_rive_android(artboard);
        }
        if (viewModelInstance != null) {
            viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(riveFile.getRiveWorker());
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).requireOwnedBy$third_party_java_android_libs_rive_rive_android(riveFile.getRiveWorker());
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0195  */
    /* JADX WARN: Code duplicated, block: B:167:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:169:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:173:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:176:0x01df  */
    /* JADX WARN: Code duplicated, block: B:178:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:179:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:182:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:184:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:185:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:187:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:188:0x0202  */
    /* JADX WARN: Code duplicated, block: B:190:0x0206  */
    /* JADX WARN: Code duplicated, block: B:191:0x0209  */
    /* JADX WARN: Code duplicated, block: B:193:0x020d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0210  */
    /* JADX WARN: Code duplicated, block: B:196:0x0214  */
    /* JADX WARN: Code duplicated, block: B:197:0x0217  */
    /* JADX WARN: Code duplicated, block: B:199:0x021b  */
    /* JADX WARN: Code duplicated, block: B:200:0x021f  */
    /* JADX WARN: Code duplicated, block: B:203:0x027e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0287  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    public static final void Rive(RiveFile riveFile, akq akqVar, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, RiveFocusMode riveFocusMode, awqg awqgVar, ahk ahkVar, int i2, int i3, int i4) {
        int i5;
        int i6;
        ail ailVarB;
        int i7;
        akq akqVar2;
        boolean z2;
        Artboard artboard2;
        StateMachine stateMachine2;
        ViewModelInstance viewModelInstance2;
        Fit fitDefaultFit;
        int i8;
        RivePointerInputMode rivePointerInputMode2;
        RiveFrameRate riveFrameRate2;
        RiveSemanticsMode riveSemanticsMode2;
        RiveFocusMode riveFocusMode2;
        awqg awqgVar2;
        RiveFrameRate riveFrameRate3;
        Artboard artboard3;
        RiveFocusMode riveFocusMode3;
        StateMachine stateMachine3;
        int i9;
        Fit fit2;
        RivePointerInputMode rivePointerInputMode3;
        akq akqVar3;
        RiveSemanticsMode riveSemanticsMode3;
        ViewModelInstance viewModelInstance3;
        riveFile.getClass();
        int i10 = i2 & 6;
        ahk ahkVarC = ahkVar.C();
        if (i10 == 0) {
            i5 = (true != ahkVarC.t() ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i4 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= true != ahkVarC.t() ? 16 : 32;
        }
        int i12 = i4 & 4;
        boolean z3 = i12 == 0;
        if (i12 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= true != ahkVarC.u() ? SemanticState.Focused : SemanticState.Hidden;
        }
        int i13 = i4 & 8;
        if (i13 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= true != ((i2 & SemanticState.Obscured) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.ReadOnly : SemanticState.Modal;
        }
        int i14 = i4 & 16;
        if (i14 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= true != ((32768 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) ? SemanticState.Multiline : 16384;
        }
        int i15 = i4 & 32;
        if (i15 != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= true != ((i2 & 262144) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            int i16 = 524288;
            if ((i4 & 64) == 0) {
                if ((2097152 & i2) == 0 ? ahkVarC.t() : ahkVarC.v()) {
                    i16 = 1048576;
                }
            }
            i5 |= i16;
        }
        int i17 = i4 & SemanticState.Focused;
        if (i17 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= true != ahkVarC.r() ? 4194304 : 8388608;
        }
        int i18 = i4 & SemanticState.Hidden;
        if (i18 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (rivePointerInputMode != null) {
                rivePointerInputMode.ordinal();
            }
            i5 |= true != ahkVarC.r() ? 33554432 : 67108864;
        }
        int i19 = i4 & SemanticState.LiveRegion;
        if (i19 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= true != ((i2 & 1073741824) == 0 ? ahkVarC.t() : ahkVarC.v()) ? 268435456 : 536870912;
        }
        int i20 = i4 & SemanticState.ReadOnly;
        if (i20 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (riveSemanticsMode != null) {
                riveSemanticsMode.ordinal();
            }
            i6 = i3 | (true != ahkVarC.r() ? 2 : 4);
        } else {
            i6 = i3;
        }
        int i21 = i4 & SemanticState.Modal;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            if (riveFocusMode != null) {
                riveFocusMode.ordinal();
            }
            i6 |= true != ahkVarC.r() ? 16 : 32;
        }
        int i22 = i6;
        int i23 = i4 & SemanticState.Obscured;
        if (i23 == 0) {
            if ((i3 & 384) == 0) {
                i22 |= true != ahkVarC.v() ? SemanticState.Focused : SemanticState.Hidden;
            }
            if (ahkVarC.y()) {
                i7 = i4 & 64;
                ahkVarC.k();
                if ((i2 & 1) != 0 || ahkVarC.o()) {
                    if (i11 != 0) {
                        akqVar2 = akq.c;
                    } else {
                        akqVar2 = akqVar;
                    }
                    z2 = (!z3) | z;
                    if (i13 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i14 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i15 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if (i7 != 0) {
                        i5 &= -3670017;
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                    } else {
                        fitDefaultFit = fit;
                    }
                    if (i17 != 0) {
                        i8 = 0;
                    } else {
                        i8 = i;
                    }
                    if (i18 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i19 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i20 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        riveFocusMode2 = RiveFocusMode.Off;
                    } else {
                        riveFocusMode2 = riveFocusMode;
                    }
                    if (i23 != 0) {
                        awqgVar2 = null;
                    } else {
                        awqgVar2 = awqgVar;
                    }
                    riveFrameRate3 = riveFrameRate2;
                    artboard3 = artboard2;
                    riveFocusMode3 = riveFocusMode2;
                    stateMachine3 = stateMachine2;
                    i9 = i8;
                    fit2 = fitDefaultFit;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    akqVar3 = akqVar2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    ahkVarC.j();
                    if (i7 != 0) {
                        i5 &= -3670017;
                    }
                    akqVar3 = akqVar;
                    z2 = z;
                    artboard3 = artboard;
                    stateMachine3 = stateMachine;
                    viewModelInstance3 = viewModelInstance;
                    fit2 = fit;
                    i9 = i;
                    rivePointerInputMode3 = rivePointerInputMode;
                    riveFrameRate3 = riveFrameRate;
                    riveSemanticsMode3 = riveSemanticsMode;
                    riveFocusMode3 = riveFocusMode;
                    awqgVar2 = awqgVar;
                }
                ahkVarC.e();
                RiveImpl(riveFile, akqVar3, z2, artboard3, stateMachine3, viewModelInstance3, fit2, i9, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, riveFocusMode3, awqgVar2, awnp.a, ahkVarC, (i5 & 1022) | (Artboard.$stable << 9) | (i5 & 7168) | (StateMachine.$stable << 12) | (57344 & i5) | (ViewModelInstance.$stable << 15) | (458752 & i5) | (Fit.$stable << 18) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i22 & 14) | 3072 | (i22 & 112) | (i22 & 896));
            } else {
                ahkVarC.j();
            }
            ailVarB = ahkVarC.b();
            if (ailVarB != null) {
                ailVarB.a();
            }
        }
        i22 |= 384;
        if (ahkVarC.y()) {
            i7 = i4 & 64;
            ahkVarC.k();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    akqVar2 = akq.c;
                } else {
                    akqVar2 = akqVar;
                }
                z2 = (!z3) | z;
                if (i13 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i14 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i15 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i7 != 0) {
                    i5 &= -3670017;
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                } else {
                    fitDefaultFit = fit;
                }
                if (i17 != 0) {
                    i8 = 0;
                } else {
                    i8 = i;
                }
                if (i18 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i19 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i20 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    riveFocusMode2 = RiveFocusMode.Off;
                } else {
                    riveFocusMode2 = riveFocusMode;
                }
                if (i23 != 0) {
                    awqgVar2 = null;
                } else {
                    awqgVar2 = awqgVar;
                }
                riveFrameRate3 = riveFrameRate2;
                artboard3 = artboard2;
                riveFocusMode3 = riveFocusMode2;
                stateMachine3 = stateMachine2;
                i9 = i8;
                fit2 = fitDefaultFit;
                rivePointerInputMode3 = rivePointerInputMode2;
                akqVar3 = akqVar2;
                riveSemanticsMode3 = riveSemanticsMode2;
                viewModelInstance3 = viewModelInstance2;
            } else {
                if (i11 != 0) {
                    akqVar2 = akq.c;
                } else {
                    akqVar2 = akqVar;
                }
                z2 = (!z3) | z;
                if (i13 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i14 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i15 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if (i7 != 0) {
                    i5 &= -3670017;
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                } else {
                    fitDefaultFit = fit;
                }
                if (i17 != 0) {
                    i8 = 0;
                } else {
                    i8 = i;
                }
                if (i18 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i19 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i20 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    riveFocusMode2 = RiveFocusMode.Off;
                } else {
                    riveFocusMode2 = riveFocusMode;
                }
                if (i23 != 0) {
                    awqgVar2 = null;
                } else {
                    awqgVar2 = awqgVar;
                }
                riveFrameRate3 = riveFrameRate2;
                artboard3 = artboard2;
                riveFocusMode3 = riveFocusMode2;
                stateMachine3 = stateMachine2;
                i9 = i8;
                fit2 = fitDefaultFit;
                rivePointerInputMode3 = rivePointerInputMode2;
                akqVar3 = akqVar2;
                riveSemanticsMode3 = riveSemanticsMode2;
                viewModelInstance3 = viewModelInstance2;
            }
            ahkVarC.e();
            RiveImpl(riveFile, akqVar3, z2, artboard3, stateMachine3, viewModelInstance3, fit2, i9, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, riveFocusMode3, awqgVar2, awnp.a, ahkVarC, (i5 & 1022) | (Artboard.$stable << 9) | (i5 & 7168) | (StateMachine.$stable << 12) | (57344 & i5) | (ViewModelInstance.$stable << 15) | (458752 & i5) | (Fit.$stable << 18) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i22 & 14) | 3072 | (i22 & 112) | (i22 & 896));
        } else {
            ahkVarC.j();
        }
        ailVarB = ahkVarC.b();
        if (ailVarB != null) {
            ailVarB.a();
        }
    }
}
