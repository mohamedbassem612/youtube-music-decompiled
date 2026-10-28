package defpackage;

import android.content.pm.FeatureInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axje {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public axje(FeatureInfo[] featureInfoArr) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        for (FeatureInfo featureInfo : featureInfoArr) {
            if (featureInfo != null && featureInfo.name != null) {
                String str = featureInfo.name;
                if ("android.hardware.type.automotive".equals(str)) {
                    z = true;
                } else if (!"android.hardware.type.pc".equals(str)) {
                    if ("android.hardware.sensor.hinge_angle".equals(str)) {
                        z2 = true;
                    } else if ("android.software.xr.api.openxr".equals(str)) {
                        z3 = true;
                    } else if (!z4 && "android.software.vulkan.deqp.level".equals(str)) {
                        i = featureInfo.version;
                        z4 = true;
                    }
                }
            }
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }
}
