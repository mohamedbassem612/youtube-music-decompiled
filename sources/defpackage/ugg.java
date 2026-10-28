package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ugg extends AudioDeviceCallback {
    final /* synthetic */ ugh a;

    public ugg(ugh ughVar) {
        this.a = ughVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        this.a.a.kk(ugh.c(audioDeviceInfoArr, ugd.a));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        this.a.a.kk(ugh.c(audioDeviceInfoArr, ugd.b));
    }
}
