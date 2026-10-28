package androidx.car.app.media;

import android.os.RemoteException;
import defpackage.yf;
import defpackage.zd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(zd zdVar) {
        this.mCallback = new CarAudioCallbackStub(zdVar);
    }

    static CarAudioCallbackDelegate create(zd zdVar) {
        return new CarAudioCallbackDelegate(zdVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            iCarAudioCallback.getClass();
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: compiled from: PG */
    @yf
    class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final zd mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            zd zdVar = this.mCarAudioCallback;
            zdVar.getClass();
            zdVar.a();
        }

        public CarAudioCallbackStub(zd zdVar) {
            this.mCarAudioCallback = zdVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
