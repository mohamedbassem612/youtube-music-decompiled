package app.rive;

import defpackage.ahj;
import defpackage.ahk;
import defpackage.ahr;
import defpackage.ahs;
import defpackage.aie;
import defpackage.awqg;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ArtboardKt {
    private static final String ARTBOARD_TAG = "Rive/Artboard";

    public static final Artboard rememberArtboard(RiveFile riveFile, String str, ahk ahkVar, int i, int i2) {
        riveFile.getClass();
        boolean z = (((i & 14) ^ 6) > 4 && ahkVar.t()) || (i & 6) == 4;
        if ((i2 & 2) != 0) {
            str = null;
        }
        boolean z2 = z | ((((i & 112) ^ 48) > 32 && ahkVar.t()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z2 || objC == ahj.a) {
            objC = Artboard.Companion.fromFile(riveFile, str);
            ahkVar.D();
        }
        final Artboard artboard = (Artboard) objC;
        boolean zV = ahkVar.v();
        Object objC2 = ahkVar.c();
        if (zV || objC2 == ahj.a) {
            objC2 = new awqg() { // from class: app.rive.ArtboardKt$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return ArtboardKt.rememberArtboard$lambda$1$0(artboard, (ahs) obj);
                }
            };
            ahkVar.D();
        }
        ahs.b(ahkVar);
        return artboard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahr rememberArtboard$lambda$1$0(final Artboard artboard, ahs ahsVar) {
        ahsVar.getClass();
        return new ahr() { // from class: app.rive.ArtboardKt$rememberArtboard$lambda$1$0$$inlined$onDispose$1
            public void dispose() {
                artboard.close();
            }
        };
    }

    public static final Result rememberArtboardResult(RiveFile riveFile, String str, ahk ahkVar, int i, int i2) {
        riveFile.getClass();
        ahkVar.F();
        ahkVar.z();
        int i3 = (i & 14) ^ 6;
        Result.Loading loading = Result.Loading.INSTANCE;
        boolean z = ((i3 > 4 && ahkVar.t()) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ahkVar.t()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z || objC == ahj.a) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            ArtboardKt$rememberArtboardResult$1$1 artboardKt$rememberArtboardResult$1$1 = new ArtboardKt$rememberArtboardResult$1$1(riveFile, str, null);
            ahkVar.D();
            objC = artboardKt$rememberArtboardResult$1$1;
        }
        Result result = (Result) aie.d(loading, (awqk) objC, ahkVar).e();
        ahkVar.f();
        return result;
    }
}
