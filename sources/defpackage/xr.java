package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class xr extends ContextWrapper {
    public final qv a;
    public final xv b;
    public VirtualDisplay c;
    public int d;
    private final ahgb e;

    protected xr(final boc bocVar, final xv xvVar) {
        super(null);
        ahgb ahgbVar = new ahgb((byte[]) null, (byte[]) null);
        this.e = ahgbVar;
        this.c = null;
        final int i = 0;
        this.d = 0;
        this.b = xvVar;
        ahgbVar.al(ww.class, "app", new zb() { // from class: xm
            @Override // defpackage.zb
            public final za a() {
                boc bocVar2 = bocVar;
                bocVar2.getClass();
                return new ww(this.a, xvVar, bocVar2);
            }
        });
        final int i2 = 1;
        ahgbVar.al(adq.class, "navigation", new zb() { // from class: xp
            @Override // defpackage.zb
            public final za a() {
                int i3 = i2;
                if (i3 == 0) {
                    return yp.a((xr) bocVar);
                }
                if (i3 == 1) {
                    Object obj = bocVar;
                    obj.getClass();
                    return new adq((boc) obj);
                }
                Object obj2 = bocVar;
                if (i3 != 2) {
                    obj2.getClass();
                    return new ze((boc) obj2);
                }
                obj2.getClass();
                return new aet((boc) obj2);
            }
        });
        ahgbVar.al(yb.class, "screen", new zb(this) { // from class: xo
            public final /* synthetic */ xr a;

            {
                this.a = this;
            }

            @Override // defpackage.zb
            public final za a() {
                int i3 = i2;
                Object obj = bocVar;
                return i3 != 0 ? new yb(this.a, (boc) obj) : yi.a(this.a, (xv) obj);
            }
        });
        ahgbVar.al(yg.class, "constraints", new xn());
        ahgbVar.al(yq.class, "hardware", new zb(this) { // from class: xo
            public final /* synthetic */ xr a;

            {
                this.a = this;
            }

            @Override // defpackage.zb
            public final za a() {
                int i3 = i;
                Object obj = xvVar;
                return i3 != 0 ? new yb(this.a, (boc) obj) : yi.a(this.a, (xv) obj);
            }
        });
        ahgbVar.al(zc.class, null, new zb() { // from class: xp
            @Override // defpackage.zb
            public final za a() {
                int i3 = i;
                if (i3 == 0) {
                    return yp.a((xr) this);
                }
                if (i3 == 1) {
                    Object obj = this;
                    obj.getClass();
                    return new adq((boc) obj);
                }
                Object obj2 = this;
                if (i3 != 2) {
                    obj2.getClass();
                    return new ze((boc) obj2);
                }
                obj2.getClass();
                return new aet((boc) obj2);
            }
        });
        final int i3 = 2;
        ahgbVar.al(aet.class, "suggestion", new zb() { // from class: xp
            @Override // defpackage.zb
            public final za a() {
                int i4 = i3;
                if (i4 == 0) {
                    return yp.a((xr) bocVar);
                }
                if (i4 == 1) {
                    Object obj = bocVar;
                    obj.getClass();
                    return new adq((boc) obj);
                }
                Object obj2 = bocVar;
                if (i4 != 2) {
                    obj2.getClass();
                    return new ze((boc) obj2);
                }
                obj2.getClass();
                return new aet((boc) obj2);
            }
        });
        final int i4 = 3;
        ahgbVar.al(ze.class, "media_playback", new zb() { // from class: xp
            @Override // defpackage.zb
            public final za a() {
                int i5 = i4;
                if (i5 == 0) {
                    return yp.a((xr) bocVar);
                }
                if (i5 == 1) {
                    Object obj = bocVar;
                    obj.getClass();
                    return new adq((boc) obj);
                }
                Object obj2 = bocVar;
                if (i5 != 2) {
                    obj2.getClass();
                    return new ze((boc) obj2);
                }
                obj2.getClass();
                return new aet((boc) obj2);
            }
        });
        this.a = new qv(new mc(this, 17, null));
        bocVar.b(new xq(this, xvVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final Object a(Class cls) {
        ahgb ahgbVar = this.e;
        RuntimeException runtimeException = (RuntimeException) ahgbVar.d.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        ?? r0 = ahgbVar.c;
        za zaVar = (za) r0.get(cls);
        if (zaVar != null) {
            return zaVar;
        }
        zb zbVar = (zb) ahgbVar.a.get(cls);
        if (zbVar == null) {
            throw new IllegalArgumentException(a.bV(cls, "The class '", "' does not correspond to a car service"));
        }
        try {
            za zaVarA = zbVar.a();
            r0.put(cls, zaVarA);
            return zaVarA;
        } catch (RuntimeException e) {
            ahgbVar.d.put(cls, e);
            throw e;
        }
    }

    public final void b(Context context, Configuration configuration) {
        afi.a();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            systemService.getClass();
            VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.c = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        c(configuration);
    }

    public final void c(Configuration configuration) {
        afi.a();
        Resources resources = getResources();
        configuration.getClass();
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }
}
