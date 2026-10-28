package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cgk {
    public final AudioTrack a;
    public final Handler b;
    public AudioRouting.OnRoutingChangedListener c;
    public final qcb d;

    public cgk(AudioTrack audioTrack, qcb qcbVar) {
        this.a = audioTrack;
        this.d = qcbVar;
        Handler handlerH = bwp.H(null);
        this.b = handlerH;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: cgi
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final cgk cgkVar = this.a;
                if (cgkVar.c != null) {
                    azs.F().execute(new Runnable() { // from class: cgj
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
                            if (routedDevice != null) {
                                cgk cgkVar2 = cgkVar;
                                cgkVar2.b.post(new cfv(cgkVar2, routedDevice, 7));
                            }
                        }
                    });
                }
            }
        };
        this.c = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerH);
    }
}
