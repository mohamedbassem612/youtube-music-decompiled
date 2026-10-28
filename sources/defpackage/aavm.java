package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavm extends AudioDeviceCallback {
    final /* synthetic */ isi a;

    public aavm(isi isiVar) {
        this.a = isiVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [axsp, java.lang.Object] */
    private final void a() {
        isi isiVar = this.a;
        ((abnc) isiVar.b).t.c.kk(((hed) isiVar.a).z());
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a();
    }
}
