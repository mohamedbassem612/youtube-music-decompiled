package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import app.rive.semantics.SemanticState;
import j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepm extends aeph {
    private final awmd a;
    private final mbc b;
    private final tbt c;
    private final awmd d;
    private final awmd e;
    private final PowerManager f;
    private final ActivityManager g;
    private final Object h = new Object();
    private final Object i = new Object();
    private final aepl j;
    private ajbl k;
    private aepl l;
    private aepj m;
    private aepi n;
    private boolean o;
    private long p;
    private final awmd q;
    private final vxz r;

    public aepm(Context context, awmd awmdVar, mbc mbcVar, tbt tbtVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, vxz vxzVar) {
        aepk aepkVar = new aepk();
        this.j = aepkVar;
        this.l = aepkVar;
        this.a = awmdVar;
        this.b = mbcVar;
        this.c = tbtVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.q = awmdVar4;
        this.f = (PowerManager) context.getSystemService("power");
        this.g = (ActivityManager) context.getSystemService("activity");
        this.r = vxzVar;
    }

    private final float h() {
        float fA = ((twf) this.e.io()).a();
        if (fA != -1.0f) {
            return 1000000.0f * fA;
        }
        return -1.0f;
    }

    private final ajbl i(Context context, float f) {
        ActivityManager activityManager;
        aihf aihfVarCreateBuilder = ajbl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajbl ajblVar = (ajbl) aihfVarCreateBuilder.instance;
        ajblVar.b |= 1;
        ajblVar.c = (int) f;
        int i = ((aepv) this.a.io()).c;
        aihfVarCreateBuilder.copyOnWrite();
        ajbl ajblVar2 = (ajbl) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ajblVar2.h = i2;
        ajblVar2.b |= 32;
        int iL = ((tfq) this.d.io()).l();
        aihfVarCreateBuilder.copyOnWrite();
        ajbl ajblVar3 = (ajbl) aihfVarCreateBuilder.instance;
        ajblVar3.d = iL - 1;
        ajblVar3.b |= 2;
        try {
            int i3 = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            int i4 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode");
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar4 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar4.b |= 4;
            ajblVar4.e = i3;
            int i5 = i4 != 1 ? 3 : 2;
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar5 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar5.f = i5 - 1;
            ajblVar5.b |= 8;
        } catch (Settings.SettingNotFoundException unused) {
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar6 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar6.b |= 4;
            ajblVar6.e = -1;
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar7 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar7.f = 0;
            ajblVar7.b |= 8;
        }
        PowerManager powerManager = this.f;
        if (powerManager != null) {
            aqij aqijVar = powerManager.isPowerSaveMode() ? aqij.LOW_POWER_MODE_ENABLED : aqij.LOW_POWER_MODE_DISABLED;
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar8 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar8.g = aqijVar.d;
            ajblVar8.b |= 16;
        } else {
            aqij aqijVar2 = aqij.LOW_POWER_MODE_UNKNOWN;
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar9 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar9.g = aqijVar2.d;
            ajblVar9.b |= 16;
        }
        if (this.r.l(145, 45632960L, false) && (activityManager = this.g) != null && Build.VERSION.SDK_INT >= 28) {
            boolean zIsBackgroundRestricted = activityManager.isBackgroundRestricted();
            aihfVarCreateBuilder.copyOnWrite();
            ajbl ajblVar10 = (ajbl) aihfVarCreateBuilder.instance;
            ajblVar10.b |= 64;
            ajblVar10.i = zIsBackgroundRestricted;
        }
        return (ajbl) aihfVarCreateBuilder.build();
    }

    private final void j() {
        synchronized (this.h) {
            this.k = null;
        }
    }

    private final boolean k() {
        int iA;
        boolean z = false;
        if (this.o) {
            synchronized (this.i) {
                if (!this.l.b()) {
                    this.l = this.j;
                } else if (((aepv) this.a.io()).b != 2) {
                    j();
                } else {
                    float fH = h();
                    if (fH == -1.0f) {
                        j();
                    } else {
                        synchronized (this.h) {
                            ajbl ajblVar = this.k;
                            if (ajblVar != null) {
                                float f = ajblVar.c - fH;
                                synchronized (this.i) {
                                    try {
                                        iA = this.l.a();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (f < iA) {
                                }
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // defpackage.aeph, defpackage.aepp
    public final void a() {
        if (k()) {
            this.c.c(new aeqi(null));
        }
    }

    @Override // defpackage.aeph, defpackage.aepp
    public final void b() {
        synchronized (this.i) {
            aepi aepiVar = this.n;
            if (aepiVar != null) {
                aepiVar.b = aepiVar.a.b();
                this.l = this.n;
            } else {
                this.l = this.j;
            }
        }
        j();
    }

    @Override // defpackage.aeph, defpackage.aepp
    public final void c() {
        synchronized (this.i) {
            aepj aepjVar = this.m;
            if (aepjVar != null) {
                this.l = aepjVar;
            } else {
                this.l = this.j;
            }
        }
        j();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0092 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0012, B:10:0x0016, B:11:0x0018, B:13:0x001c, B:15:0x0020, B:16:0x0022, B:18:0x002b, B:20:0x0037, B:21:0x0039, B:27:0x0055, B:29:0x0057, B:31:0x0062, B:33:0x0066, B:36:0x006e, B:37:0x0070, B:39:0x0074, B:40:0x0076, B:42:0x007a, B:44:0x0082, B:45:0x0084, B:47:0x0088, B:48:0x008a, B:50:0x0095, B:52:0x00a3, B:56:0x00ab, B:57:0x00ad, B:53:0x00a6, B:49:0x0092, B:22:0x0044, B:25:0x0051, B:59:0x00af), top: B:65:0x0003 }] */
    @Override // defpackage.aepp
    public final void e(aqiz aqizVar) {
        boolean zB;
        synchronized (this.i) {
            aepl aeplVar = this.j;
            this.l = aeplVar;
            this.o = false;
            if (aqizVar != null && (aqizVar.b & SemanticState.LiveRegion) != 0) {
                aqio aqioVar = aqizVar.i;
                if (aqioVar == null) {
                    aqioVar = aqio.a;
                }
                if (aqioVar.c) {
                    aqio aqioVar2 = aqizVar.i;
                    if (aqioVar2 == null) {
                        aqioVar2 = aqio.a;
                    }
                    float f = aqioVar2.f;
                    if (f == 0.0d) {
                        szb szbVar = (szb) this.q.io();
                        aqio aqioVar3 = aqizVar.i;
                        if (aqioVar3 == null) {
                            aqioVar3 = aqio.a;
                        }
                        zB = szbVar.b(aqioVar3.d, szc.a);
                        this.o = zB;
                    } else {
                        zB = ThreadLocalRandom.current().nextFloat() <= f;
                        this.o = zB;
                    }
                    if (zB) {
                        this.m = new aepj();
                        aqio aqioVar4 = aqizVar.i;
                        if (((aqioVar4 == null ? aqio.a : aqioVar4).b & 4) == 0) {
                            this.n = null;
                        } else {
                            if (aqioVar4 == null) {
                                aqioVar4 = aqio.a;
                            }
                            aqin aqinVar = aqioVar4.e;
                            if (aqinVar == null) {
                                aqinVar = aqin.a;
                            }
                            if (aqinVar.b) {
                                awmd awmdVar = this.a;
                                aqio aqioVar5 = aqizVar.i;
                                if (aqioVar5 == null) {
                                    aqioVar5 = aqio.a;
                                }
                                aqin aqinVar2 = aqioVar5.e;
                                if (aqinVar2 == null) {
                                    aqinVar2 = aqin.a;
                                }
                                this.n = new aepi(awmdVar, aqinVar2, this.b);
                            } else {
                                this.n = null;
                            }
                        }
                        aepl aeplVar2 = ((aepv) this.a.io()).b() ? this.m : this.n;
                        if (aeplVar2 != null) {
                            aeplVar = aeplVar2;
                        }
                        this.l = aeplVar;
                    }
                }
            }
        }
    }

    @Override // defpackage.aepp
    public final boolean f() {
        return this.o;
    }

    @Override // defpackage.aepp
    public final boolean g(Context context, aihf aihfVar) {
        boolean z = false;
        if (k()) {
            long jB = this.b.b();
            ajbl ajblVarI = i(context, h());
            synchronized (this.h) {
                ajbl ajblVar = this.k;
                if (ajblVar != null) {
                    aihf aihfVarCreateBuilder = ajbk.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ajbk ajbkVar = (ajbk) aihfVarCreateBuilder.instance;
                    ajbkVar.d = ajblVar;
                    ajbkVar.b |= 2;
                    aihfVarCreateBuilder.copyOnWrite();
                    ajbk ajbkVar2 = (ajbk) aihfVarCreateBuilder.instance;
                    ajblVarI.getClass();
                    ajbkVar2.e = ajblVarI;
                    ajbkVar2.b |= 4;
                    long j = jB - this.p;
                    aihfVarCreateBuilder.copyOnWrite();
                    ajbk ajbkVar3 = (ajbk) aihfVarCreateBuilder.instance;
                    ajbkVar3.b |= 1;
                    ajbkVar3.c = j;
                    aihfVar.copyOnWrite();
                    aqih aqihVar = (aqih) aihfVar.instance;
                    ajbk ajbkVar4 = (ajbk) aihfVarCreateBuilder.build();
                    aqih aqihVar2 = aqih.a;
                    ajbkVar4.getClass();
                    aqihVar.h = ajbkVar4;
                    aqihVar.b |= SemanticState.LiveRegion;
                    z = true;
                }
                this.k = ajblVarI;
                this.p = jB;
            }
        }
        return z;
    }
}
