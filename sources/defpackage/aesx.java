package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aesx {
    public final Context a;
    public final mbc b;
    public final Executor c;
    public final awmd d;
    public final awmd e;
    public final Object f;
    public boolean g;
    public ajdp h;
    public long i;
    public boolean j;
    public final PowerManager k;
    public final vxz l;
    private final awmd m;

    public aesx(Context context, mbc mbcVar, Executor executor, vxz vxzVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        context.getClass();
        mbcVar.getClass();
        executor.getClass();
        vxzVar.getClass();
        awmdVar.getClass();
        awmdVar3.getClass();
        this.a = context;
        this.b = mbcVar;
        this.c = executor;
        this.l = vxzVar;
        this.d = awmdVar;
        this.m = awmdVar2;
        this.e = awmdVar3;
        this.f = new Object();
        this.k = (PowerManager) context.getSystemService("power");
    }

    public final ajdp a(Context context, int i) {
        int i2;
        awml awmlVar;
        aqlg aqlgVar;
        try {
            i2 = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            i2 = -1;
        }
        PowerManager powerManager = this.k;
        if (powerManager != null) {
            switch (powerManager.getCurrentThermalStatus()) {
                case 0:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_NONE;
                    break;
                case 1:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_LIGHT;
                    break;
                case 2:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_MODERATE;
                    break;
                case 3:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_SEVERE;
                    break;
                case 4:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_CRITICAL;
                    break;
                case 5:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_EMERGENCY;
                    break;
                case 6:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_SHUTDOWN;
                    break;
                default:
                    aqlgVar = aqlg.ANDROID_THERMAL_STATUS_UNKNOWN;
                    break;
            }
            awmlVar = new awml(aqlgVar, powerManager.isPowerSaveMode() ? aqij.LOW_POWER_MODE_ENABLED : aqij.LOW_POWER_MODE_DISABLED);
        } else {
            awmlVar = new awml(aqlg.ANDROID_THERMAL_STATUS_UNKNOWN, aqij.LOW_POWER_MODE_UNKNOWN);
        }
        Object obj = awmlVar.b;
        aqlg aqlgVar2 = (aqlg) awmlVar.a;
        aqij aqijVar = (aqij) obj;
        aihf aihfVarCreateBuilder = ajdp.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar.c = i - 1;
        ajdpVar.b |= 1;
        int iL = ((tfq) this.m.io()).l();
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar2 = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar2.e = iL - 1;
        ajdpVar2.b |= 4;
        boolean z = !((aepv) this.d.io()).b();
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar3 = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar3.b |= 32;
        ajdpVar3.h = z;
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar4 = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar4.b |= 8;
        ajdpVar4.f = i2;
        aqlgVar2.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar5 = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar5.d = aqlgVar2.i;
        ajdpVar5.b |= 2;
        aqijVar.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        ajdp ajdpVar6 = (ajdp) aihfVarCreateBuilder.instance;
        ajdpVar6.g = aqijVar.d;
        ajdpVar6.b |= 16;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (ajdp) aihnVarBuild;
    }
}
