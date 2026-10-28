package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cfg extends AudioDeviceCallback {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ cfj a;

    public cfg(cfj cfjVar) {
        this.a = cfjVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        cfj cfjVar = this.a;
        bwp.aq(cfjVar.b, new bkn(cfjVar, 11));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        bwp.aq(this.a.b, new blq(this, audioDeviceInfoArr, 19, (short[]) null));
    }
}
