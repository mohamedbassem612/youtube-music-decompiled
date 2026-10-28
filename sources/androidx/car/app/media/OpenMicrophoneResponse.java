package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import defpackage.yf;
import defpackage.zg;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    OpenMicrophoneResponse(zg zgVar) {
        Object obj = zgVar.a;
        this.mCarAudioCallbackDelegate = null;
        Object obj2 = zgVar.b;
        this.mCarMicrophoneDescriptor = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
