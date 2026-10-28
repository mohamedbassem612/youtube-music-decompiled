package defpackage;

import android.app.Service;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gmn extends Service implements aupi {
    private volatile auoz a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final auoz componentManager() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new auoz(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            BluetoothA2dpService bluetoothA2dpService = (BluetoothA2dpService) this;
            ght ghtVar = ((gkf) generatedComponent()).b;
            bluetoothA2dpService.d = aupm.b(ghtVar.FK);
            bluetoothA2dpService.e = aupm.b(ghtVar.cF);
            bluetoothA2dpService.f = aupm.b(ghtVar.FH);
            bluetoothA2dpService.g = aupm.b(ghtVar.T);
            bluetoothA2dpService.h = aupm.b(ghtVar.B);
            bluetoothA2dpService.i = (hix) ghtVar.Gb.io();
        }
        super.onCreate();
    }
}
