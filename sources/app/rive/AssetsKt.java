package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.aie;
import defpackage.awqk;
import defpackage.awql;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AssetsKt {
    private static final String AUDIO_TAG = "Rive/Audio";
    private static final String FONT_TAG = "Rive/Font";
    private static final String IMAGE_TAG = "Rive/Image";

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcquiredWorkerReference acquireForAsset(CommandQueue commandQueue, String str) {
        commandQueue.acquire(str);
        return new AcquiredWorkerReference(commandQueue);
    }

    private static final Result rememberAsset(CommandQueue commandQueue, byte[] bArr, awql awqlVar, String str, ahk ahkVar, int i, int i2) {
        ahkVar.F();
        ahkVar.F();
        ahkVar.z();
        int i3 = (i & 896) ^ 384;
        Result.Loading loading = Result.Loading.INSTANCE;
        boolean zV = ((i3 > 256 && ahkVar.v()) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && ahkVar.v()) || (i & 6) == 4) | ahkVar.v() | ((((i & 7168) ^ 3072) > 2048 && ahkVar.t()) || (i & 3072) == 2048);
        Object objC = ahkVar.c();
        if (zV || objC == ahj.a) {
            if ((i2 & 8) != 0) {
                str = null;
            }
            AssetsKt$rememberAsset$1$1 assetsKt$rememberAsset$1$1 = new AssetsKt$rememberAsset$1$1(awqlVar, commandQueue, bArr, str, null);
            ahkVar.D();
            objC = assetsKt$rememberAsset$1$1;
        }
        Result result = (Result) aie.d(loading, (awqk) objC, ahkVar).e();
        ahkVar.f();
        return result;
    }

    public static final Result rememberAudio(CommandQueue commandQueue, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        bArr.getClass();
        AudioAsset.Companion companion = AudioAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberAudio$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, null, ahkVar, CommandQueue.$stable | (i & 14) | (i & 112), 8);
    }

    public static final Result rememberFont(CommandQueue commandQueue, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        bArr.getClass();
        FontAsset.Companion companion = FontAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberFont$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, null, ahkVar, CommandQueue.$stable | (i & 14) | (i & 112), 8);
    }

    public static final Result rememberImage(CommandQueue commandQueue, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        bArr.getClass();
        ImageAsset.Companion companion = ImageAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberImage$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, null, ahkVar, CommandQueue.$stable | (i & 14) | (i & 112), 8);
    }

    public static final Result rememberRegisteredAudio(CommandQueue commandQueue, String str, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        str.getClass();
        bArr.getClass();
        AudioAsset.Companion companion = AudioAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberRegisteredAudio$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, str, ahkVar, CommandQueue.$stable | (i & 14) | ((i >> 3) & 112) | ((i << 6) & 7168), 0);
    }

    public static final Result rememberRegisteredFont(CommandQueue commandQueue, String str, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        str.getClass();
        bArr.getClass();
        FontAsset.Companion companion = FontAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberRegisteredFont$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, str, ahkVar, CommandQueue.$stable | (i & 14) | ((i >> 3) & 112) | ((i << 6) & 7168), 0);
    }

    public static final Result rememberRegisteredImage(CommandQueue commandQueue, String str, byte[] bArr, ahk ahkVar, int i) {
        commandQueue.getClass();
        str.getClass();
        bArr.getClass();
        ImageAsset.Companion companion = ImageAsset.Companion;
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            objC = new AssetsKt$rememberRegisteredImage$1$1(companion);
            ahkVar.D();
        }
        return rememberAsset(commandQueue, bArr, (awql) objC, str, ahkVar, CommandQueue.$stable | (i & 14) | ((i >> 3) & 112) | ((i << 6) & 7168), 0);
    }
}
