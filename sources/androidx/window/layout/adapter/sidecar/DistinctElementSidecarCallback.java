package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.awrc;
import defpackage.dxq;
import defpackage.yi;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    private SidecarDeviceState b;
    private final SidecarInterface.SidecarCallback d;
    private final Object a = new Object();
    private final Map c = new WeakHashMap();

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback) {
        int i = dxq.a;
        this.d = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.a) {
                SidecarDeviceState sidecarDeviceState2 = this.b;
                if (awrc.c(sidecarDeviceState2, sidecarDeviceState) || (sidecarDeviceState2 != null && yi.d(sidecarDeviceState2) == yi.d(sidecarDeviceState))) {
                    return;
                }
                this.b = sidecarDeviceState;
                this.d.onDeviceStateChanged(sidecarDeviceState);
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.a) {
            Map map = this.c;
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) map.get(iBinder);
            if (!awrc.c(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                    List listE = yi.e(sidecarWindowLayoutInfo2);
                    List listE2 = yi.e(sidecarWindowLayoutInfo);
                    if (listE != listE2) {
                        if (listE.size() == listE2.size()) {
                            int size = listE.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) listE.get(i);
                                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) listE2.get(i);
                                    if (!awrc.c(sidecarDisplayFeature, sidecarDisplayFeature2) && (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType() || !awrc.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback, byte[] bArr) {
        this.d = sidecarCallback;
    }
}
