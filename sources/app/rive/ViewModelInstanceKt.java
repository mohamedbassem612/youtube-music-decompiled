package app.rive;

import app.rive.core.CommandQueue;
import com.google.cardboard.sdk.R;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.aie;
import defpackage.awmj;
import defpackage.awqg;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelInstanceKt {
    public static final String VM_INSTANCE_TAG = "Rive/VMI";

    public static final void checkOpen(ViewModelInstanceSource viewModelInstanceSource) {
        viewModelInstanceSource.getClass();
        int iSwitchDispatch = ViewModelInstanceKt$$ExternalSyntheticTypeSwitchClass1.switchDispatch(viewModelInstanceSource, 0);
        if (iSwitchDispatch == 0) {
            checkOpen(((ViewModelInstanceSource.Blank) viewModelInstanceSource).m348unboximpl());
            return;
        }
        if (iSwitchDispatch == 1) {
            checkOpen(((ViewModelInstanceSource.Default) viewModelInstanceSource).m355unboximpl());
            return;
        }
        if (iSwitchDispatch == 2) {
            checkOpen(((ViewModelInstanceSource.Named) viewModelInstanceSource).getVmSource());
        } else if (iSwitchDispatch == 3) {
            ((ViewModelInstanceSource.Reference) viewModelInstanceSource).getParentInstance().checkOpen$third_party_java_android_libs_rive_rive_android();
        } else {
            if (iSwitchDispatch != 4) {
                throw new awmj();
            }
            ((ViewModelInstanceSource.ReferenceListItem) viewModelInstanceSource).getParentInstance().checkOpen$third_party_java_android_libs_rive_rive_android();
        }
    }

    public static final ViewModelInstance rememberViewModelInstance(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, ahk ahkVar, int i, int i2) {
        riveFile.getClass();
        if ((i2 & 2) != 0) {
            viewModelInstanceSource = null;
        }
        int i3 = i & 14;
        ahkVar.A();
        if (viewModelInstanceSource == null) {
            Artboard artboardRememberArtboard = ArtboardKt.rememberArtboard(riveFile, null, ahkVar, i3, 2);
            ViewModelSource.DefaultForArtboard.m357constructorimpl(artboardRememberArtboard);
            viewModelInstanceSource = ViewModelSource.DefaultForArtboard.m356boximpl(artboardRememberArtboard).defaultInstance();
        }
        ahkVar.h();
        boolean z = true;
        if (((i3 ^ 6) <= 4 || !ahkVar.t()) && (i & 6) != 4) {
            z = false;
        }
        boolean zT = z | ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = ViewModelInstance.Companion.fromFile(riveFile, viewModelInstanceSource);
            ahkVar.D();
        }
        final ViewModelInstance viewModelInstance = (ViewModelInstance) objC;
        boolean zV = ahkVar.v();
        Object objC2 = ahkVar.c();
        if (zV || objC2 == ahj.a) {
            objC2 = new awqg() { // from class: app.rive.ViewModelInstanceKt$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return ViewModelInstanceKt.rememberViewModelInstance$lambda$1$0(viewModelInstance, (ahs) obj);
                }
            };
            ahkVar.D();
        }
        ahs.b(ahkVar);
        return viewModelInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr rememberViewModelInstance$lambda$1$0(final ViewModelInstance viewModelInstance, ahs ahsVar) {
        ahsVar.getClass();
        return new ahr() { // from class: app.rive.ViewModelInstanceKt$rememberViewModelInstance$lambda$1$0$$inlined$onDispose$1
            public void dispose() {
                viewModelInstance.close();
            }
        };
    }

    public static final Result rememberViewModelInstanceResult(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, ahk ahkVar, int i, int i2) {
        Result error;
        riveFile.getClass();
        ahkVar.A();
        if ((i2 & 2) != 0) {
            viewModelInstanceSource = null;
        }
        int i3 = i & 14;
        if (viewModelInstanceSource != null) {
            ahkVar.A();
            error = rememberViewModelInstanceResultFromSource(riveFile, viewModelInstanceSource, ahkVar, i & R.styleable.AppCompatTheme_windowNoTitle);
            ahkVar.h();
        } else {
            ahkVar.A();
            ahkVar.h();
            Result resultRememberArtboardResult = ArtboardKt.rememberArtboardResult(riveFile, null, ahkVar, i3, 2);
            int iSwitchDispatch = ViewModelInstanceKt$$ExternalSyntheticTypeSwitchClass2.switchDispatch(resultRememberArtboardResult, 0);
            if (iSwitchDispatch == 0) {
                ahkVar.A();
                ahkVar.h();
                error = Result.Loading.INSTANCE;
            } else if (iSwitchDispatch == 1) {
                ahkVar.A();
                ahkVar.h();
                error = new Result.Error(((Result.Error) resultRememberArtboardResult).getThrowable());
            } else {
                if (iSwitchDispatch != 2) {
                    ahkVar.A();
                    ahkVar.h();
                    throw new awmj();
                }
                ahkVar.A();
                Result.Success success = (Result.Success) resultRememberArtboardResult;
                boolean zT = ahkVar.t();
                Object objC = ahkVar.c();
                if (zT || objC == ahj.a) {
                    Artboard artboard = (Artboard) success.getValue();
                    ViewModelSource.DefaultForArtboard.m357constructorimpl(artboard);
                    objC = ViewModelSource.DefaultForArtboard.m356boximpl(artboard).defaultInstance();
                    ahkVar.D();
                }
                error = rememberViewModelInstanceResultFromSource(riveFile, (ViewModelInstanceSource) objC, ahkVar, i3);
                ahkVar.h();
            }
        }
        ahkVar.h();
        return error;
    }

    private static final Result rememberViewModelInstanceResultFromSource(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, ahk ahkVar, int i) {
        ahkVar.F();
        ahkVar.z();
        int i2 = (i & 14) ^ 6;
        Result.Loading loading = Result.Loading.INSTANCE;
        boolean z = ((i2 > 4 && ahkVar.t()) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ahkVar.v()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z || objC == ahj.a) {
            objC = new ViewModelInstanceKt$rememberViewModelInstanceResultFromSource$1$1(riveFile, viewModelInstanceSource, null);
            ahkVar.D();
        }
        Result result = (Result) aie.d(loading, (awqk) objC, ahkVar).e();
        ahkVar.f();
        return result;
    }

    /* JADX INFO: renamed from: requireCompatibleWith-gj6um3I, reason: not valid java name */
    public static final void m340requireCompatibleWithgj6um3I(ViewModelInstanceSource viewModelInstanceSource, CommandQueue commandQueue, long j) {
        viewModelInstanceSource.getClass();
        commandQueue.getClass();
        int iSwitchDispatch = ViewModelInstanceKt$$ExternalSyntheticTypeSwitchClass1.switchDispatch(viewModelInstanceSource, 0);
        if (iSwitchDispatch == 0) {
            m341requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Blank) viewModelInstanceSource).m348unboximpl(), commandQueue, j);
            return;
        }
        if (iSwitchDispatch == 1) {
            m341requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Default) viewModelInstanceSource).m355unboximpl(), commandQueue, j);
            return;
        }
        if (iSwitchDispatch == 2) {
            m341requireCompatibleWithgj6um3I(((ViewModelInstanceSource.Named) viewModelInstanceSource).getVmSource(), commandQueue, j);
        } else if (iSwitchDispatch == 3) {
            ((ViewModelInstanceSource.Reference) viewModelInstanceSource).getParentInstance().requireOwnedBy$third_party_java_android_libs_rive_rive_android(commandQueue);
        } else {
            if (iSwitchDispatch != 4) {
                throw new awmj();
            }
            ((ViewModelInstanceSource.ReferenceListItem) viewModelInstanceSource).getParentInstance().requireOwnedBy$third_party_java_android_libs_rive_rive_android(commandQueue);
        }
    }

    public static final void checkOpen(ViewModelSource viewModelSource) {
        viewModelSource.getClass();
        if (viewModelSource instanceof ViewModelSource.DefaultForArtboard) {
            ((ViewModelSource.DefaultForArtboard) viewModelSource).m362unboximpl().checkOpen$third_party_java_android_libs_rive_rive_android();
        }
    }

    /* JADX INFO: renamed from: requireCompatibleWith-gj6um3I, reason: not valid java name */
    public static final void m341requireCompatibleWithgj6um3I(ViewModelSource viewModelSource, CommandQueue commandQueue, long j) {
        viewModelSource.getClass();
        commandQueue.getClass();
        if (viewModelSource instanceof ViewModelSource.DefaultForArtboard) {
            ((ViewModelSource.DefaultForArtboard) viewModelSource).m362unboximpl().m271x52af7cd7(commandQueue, j);
        }
    }
}
