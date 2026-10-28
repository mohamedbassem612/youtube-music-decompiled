package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cbl extends AudioDeviceCallback {
    final /* synthetic */ cbm a;

    public cbl(cbm cbmVar) {
        this.a = cbmVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        cbm cbmVar = this.a;
        cbmVar.c.d(Boolean.valueOf(cbmVar.c()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        cbm cbmVar = this.a;
        cbmVar.c.d(Boolean.valueOf(cbmVar.c()));
    }
}
