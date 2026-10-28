package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxq {
    public static final /* synthetic */ int a = 0;
    private static final String b = "dxq";
    private final int c;

    public /* synthetic */ dxq(byte[] bArr) {
        this.c = 3;
    }

    public final dwy a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        dwq dwqVar;
        dwp dwpVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new dwy(awno.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iD = yi.d(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iD;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iD));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        List<SidecarDisplayFeature> listE = yi.e(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listE) {
            sidecarDisplayFeature.getClass();
            b.getClass();
            Object objB = new dwk(sidecarDisplayFeature, this.c).a("Type must be either TYPE_FOLD or TYPE_HINGE", new akl(12)).a("Feature bounds must not be 0", new akl(13)).a("TYPE_FOLD must have 0 area", new akl(14)).a("Feature be pinned to either left or top", new akl(15)).b();
            dwr dwrVar = null;
            if (objB != null) {
                int type = ((SidecarDisplayFeature) objB).getType();
                if (type == 1) {
                    dwqVar = dwq.a;
                } else if (type == 2) {
                    dwqVar = dwq.b;
                }
                int iD2 = yi.d(sidecarDeviceState2);
                if (iD2 == 2) {
                    dwpVar = dwp.b;
                } else if (iD2 == 3) {
                    dwpVar = dwp.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                dwrVar = new dwr(new dwd(rect), dwqVar, dwpVar);
            }
            if (dwrVar != null) {
                arrayList.add(dwrVar);
            }
        }
        return new dwy(arrayList);
    }

    public dxq() {
        throw null;
    }
}
