package androidx.car.app.media;

import defpackage.yf;
import defpackage.zf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    OpenMicrophoneRequest(zf zfVar) {
        Object obj = zfVar.a;
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
