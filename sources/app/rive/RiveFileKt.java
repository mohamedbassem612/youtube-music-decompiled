package app.rive;

import app.rive.core.CommandQueue;
import defpackage.ahj;
import defpackage.ahk;
import defpackage.aie;
import defpackage.awqk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFileKt {
    private static final String FILE_TAG = "Rive/File";

    public static final Result rememberRiveFile(RiveFileSource riveFileSource, CommandQueue commandQueue, ahk ahkVar, int i) {
        riveFileSource.getClass();
        commandQueue.getClass();
        ahkVar.F();
        ahkVar.z();
        int i2 = (i & 14) ^ 6;
        Result.Loading loading = Result.Loading.INSTANCE;
        boolean z = ((i2 > 4 && ahkVar.v()) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ahkVar.v()) || (i & 48) == 32);
        Object objC = ahkVar.c();
        if (z || objC == ahj.a) {
            objC = new RiveFileKt$rememberRiveFile$1$1(riveFileSource, commandQueue, null);
            ahkVar.D();
        }
        Result result = (Result) aie.d(loading, (awqk) objC, ahkVar).e();
        ahkVar.f();
        return result;
    }
}
