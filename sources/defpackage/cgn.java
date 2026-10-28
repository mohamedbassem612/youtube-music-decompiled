package defpackage;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgn {
    public final Handler a;
    public final AudioTrack$StreamEventCallback b;
    final /* synthetic */ cgo c;

    public cgn(cgo cgoVar) {
        this.c = cgoVar;
        Handler handlerH = bwp.H(null);
        this.a = handlerH;
        cgm cgmVar = new cgm(this);
        this.b = cgmVar;
        cgoVar.d.registerStreamEventCallback(new cck(handlerH, 2), cgmVar);
    }
}
