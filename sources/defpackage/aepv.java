package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepv {
    private final mbc A;
    private final tfq B;
    private final aepy C;
    private final aepx D;
    private final vxz E;
    private final ahnz F;
    private final Context d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final int i;
    private final String j;
    private final String k;
    private final Optional l;
    private final Optional m;
    private final int n;
    private final String o;
    private final int p;
    private int r;
    private int s;
    private volatile boolean t;
    private final Optional v;
    private String w;
    private String x;
    private final Optional y;
    private final tqj z;
    public boolean a = true;
    private int q = 0;
    public int b = 1;
    public int c = 2;
    private volatile long u = -1;

    public aepv(Context context, tfq tfqVar, Optional optional, aepy aepyVar, aepx aepxVar, vxz vxzVar, ahnz ahnzVar, Optional optional2, tqj tqjVar, mbc mbcVar) {
        long j;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            j = 0;
        } else {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem / 1024;
        }
        int i = Build.VERSION.SDK_INT;
        String str = Build.VERSION.INCREMENTAL;
        String str2 = Build.FINGERPRINT;
        String property = System.getProperty("os.arch");
        this.p = txz.a(context);
        this.d = context;
        this.e = displayMetrics.densityDpi;
        this.f = displayMetrics.heightPixels;
        this.g = displayMetrics.widthPixels;
        this.h = j;
        this.i = i;
        this.j = str;
        this.k = str2;
        this.o = property;
        this.B = tfqVar;
        this.n = fnc.a();
        if (Build.VERSION.SDK_INT >= 31) {
            this.l = Optional.of(Build.SOC_MANUFACTURER);
            this.m = Optional.of(Build.SOC_MODEL);
        } else {
            this.l = Optional.empty();
            this.m = Optional.empty();
        }
        this.v = optional;
        this.C = aepyVar;
        this.D = aepxVar;
        this.E = vxzVar;
        this.F = ahnzVar;
        this.y = optional2;
        this.z = tqjVar;
        this.A = mbcVar;
    }

    private final void i() {
        int i = tqr.a;
        if (!this.z.k(1073830490)) {
            this.t = j();
            return;
        }
        long jB = this.A.b();
        if (this.u < 0 || jB - this.u >= 500) {
            synchronized (this) {
                long jB2 = this.A.b();
                if (this.u < 0 || jB2 - this.u >= 500) {
                    this.t = j();
                    this.u = jB2;
                }
            }
        }
    }

    private final boolean j() {
        int i = tqr.a;
        boolean zK = this.z.k(1073811007);
        Context context = this.d;
        return !zK ? qel.d(context) : aewo.i(context);
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra != 5 && intExtra != 2) {
            this.b = 2;
        } else if (intExtra2 == 1) {
            this.b = 4;
        } else if (intExtra2 == 2) {
            this.b = 3;
        } else if (intExtra2 == 4) {
            this.b = 5;
        } else {
            this.b = 1;
        }
        int iBg = a.bg(intent.getIntExtra("health", 1));
        this.c = iBg != 0 ? iBg : 2;
    }

    public final boolean b() {
        i();
        return this.t;
    }

    public final void c() {
        this.y.isPresent();
    }

    public final void d(aihf aihfVar) {
        aepx aepxVar = this.D;
        ancp ancpVar = null;
        if (aepxVar.b.l(185, 45691693L, false)) {
            agkj agkjVarH = agkj.h(aepxVar.a);
            if (!agkjVarH.isEmpty()) {
                aihf aihfVarCreateBuilder = ancp.a.createBuilder();
                agke agkeVar = (agke) agyz.b(agkjVarH).a(new itl(10)).collect(aghu.a);
                aihfVarCreateBuilder.copyOnWrite();
                ancp ancpVar2 = (ancp) aihfVarCreateBuilder.instance;
                aiie aiieVar = ancpVar2.b;
                if (!aiieVar.c()) {
                    ancpVar2.b = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(agkeVar, ancpVar2.b);
                ancpVar = (ancp) aihfVarCreateBuilder.build();
            }
        }
        if (ancpVar != null) {
            aihfVar.copyOnWrite();
            aqie aqieVar = (aqie) aihfVar.instance;
            aqie aqieVar2 = aqie.a;
            aqieVar.l = ancpVar;
            aqieVar.b |= 1048576;
        }
    }

    public final void e(aihf aihfVar) {
        akgr akgrVarA = this.C.a();
        if (akgrVarA != null) {
            aihfVar.copyOnWrite();
            aqie aqieVar = (aqie) aihfVar.instance;
            aqie aqieVar2 = aqie.a;
            aqieVar.k = akgrVarA;
            aqieVar.b |= 262144;
        }
    }

    public final void f(aihf aihfVar) {
        NetworkInfo networkInfoD = this.B.d();
        if (networkInfoD == null) {
            this.r = 0;
            this.s = NetworkInfo.State.DISCONNECTED.ordinal();
        } else {
            this.r = networkInfoD.getType();
            this.s = networkInfoD.getState().ordinal();
        }
        WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
        if (windowManager != null) {
            this.q = windowManager.getDefaultDisplay().getRotation();
        }
        i();
        Optional optional = this.v;
        optional.isPresent();
        vbz vbzVar = ((vca) optional.get()).a;
        if (vbzVar != null) {
            this.w = vbzVar.f;
            this.x = vbzVar.e;
        }
        aqie aqieVar = ((aqih) aihfVar.instance).e;
        if (aqieVar == null) {
            aqieVar = aqie.a;
        }
        aihf builder = aqieVar.toBuilder();
        boolean z = this.a;
        builder.copyOnWrite();
        aqie aqieVar2 = (aqie) builder.instance;
        aqieVar2.b |= 1;
        aqieVar2.c = z;
        int i = this.q;
        builder.copyOnWrite();
        aqie aqieVar3 = (aqie) builder.instance;
        aqieVar3.b |= 2;
        aqieVar3.d = i;
        int i2 = this.r;
        builder.copyOnWrite();
        aqie aqieVar4 = (aqie) builder.instance;
        aqieVar4.b |= 4;
        aqieVar4.e = i2;
        int i3 = this.s;
        builder.copyOnWrite();
        aqie aqieVar5 = (aqie) builder.instance;
        aqieVar5.b |= 8;
        aqieVar5.f = i3;
        int i4 = this.b;
        builder.copyOnWrite();
        aqie aqieVar6 = (aqie) builder.instance;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        aqieVar6.g = i5;
        aqieVar6.b |= 16;
        boolean z2 = this.t;
        builder.copyOnWrite();
        aqie aqieVar7 = (aqie) builder.instance;
        aqieVar7.b |= 32;
        aqieVar7.h = z2;
        String str = this.w;
        if (str != null) {
            builder.copyOnWrite();
            aqie aqieVar8 = (aqie) builder.instance;
            aqieVar8.b |= 65536;
            aqieVar8.i = str;
        }
        String str2 = this.x;
        if (str2 != null) {
            builder.copyOnWrite();
            aqie aqieVar9 = (aqie) builder.instance;
            aqieVar9.b |= 131072;
            aqieVar9.j = str2;
        }
        e(builder);
        d(builder);
        this.E.l(46, 45685617L, false);
        Object obj = this.F.a;
        if (obj != null) {
            builder.copyOnWrite();
            aqie aqieVar10 = (aqie) builder.instance;
            aqieVar10.m = (anhh) obj;
            aqieVar10.b |= 4194304;
        }
        c();
        aihfVar.copyOnWrite();
        aqih aqihVar = (aqih) aihfVar.instance;
        aqie aqieVar11 = (aqie) builder.build();
        aqieVar11.getClass();
        aqihVar.e = aqieVar11;
        aqihVar.b |= 4;
    }

    public final void g(aihf aihfVar) {
        aqif aqifVar = ((aqih) aihfVar.instance).d;
        if (aqifVar == null) {
            aqifVar = aqif.a;
        }
        aihf builder = aqifVar.toBuilder();
        h(builder);
        aihfVar.copyOnWrite();
        aqih aqihVar = (aqih) aihfVar.instance;
        aqif aqifVar2 = (aqif) builder.build();
        aqifVar2.getClass();
        aqihVar.d = aqifVar2;
        aqihVar.b |= 2;
    }

    public final void h(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqif aqifVar = (aqif) aihfVar.instance;
        aqif aqifVar2 = aqif.a;
        aqifVar.b |= 1;
        aqifVar.c = this.e;
        aihfVar.copyOnWrite();
        aqif aqifVar3 = (aqif) aihfVar.instance;
        aqifVar3.b |= 2;
        aqifVar3.d = this.f;
        aihfVar.copyOnWrite();
        aqif aqifVar4 = (aqif) aihfVar.instance;
        aqifVar4.b |= 4;
        aqifVar4.e = this.g;
        aihfVar.copyOnWrite();
        aqif aqifVar5 = (aqif) aihfVar.instance;
        aqifVar5.b |= 8;
        aqifVar5.f = this.h;
        aihfVar.copyOnWrite();
        aqif aqifVar6 = (aqif) aihfVar.instance;
        aqifVar6.b |= 16;
        aqifVar6.g = this.i;
        aihfVar.copyOnWrite();
        aqif aqifVar7 = (aqif) aihfVar.instance;
        String str = this.j;
        str.getClass();
        aqifVar7.b |= 32;
        aqifVar7.h = str;
        aihfVar.copyOnWrite();
        aqif aqifVar8 = (aqif) aihfVar.instance;
        String str2 = this.k;
        str2.getClass();
        aqifVar8.b |= SemanticState.LiveRegion;
        aqifVar8.k = str2;
        aihfVar.copyOnWrite();
        aqif aqifVar9 = (aqif) aihfVar.instance;
        String str3 = this.o;
        str3.getClass();
        aqifVar9.b |= 64;
        aqifVar9.i = str3;
        aihfVar.copyOnWrite();
        aqif aqifVar10 = (aqif) aihfVar.instance;
        aqifVar10.b |= SemanticState.Focused;
        aqifVar10.j = this.p;
        int iG = tym.G();
        aihfVar.copyOnWrite();
        aqif aqifVar11 = (aqif) aihfVar.instance;
        aqifVar11.b |= SemanticState.Obscured;
        aqifVar11.n = iG;
        aihfVar.copyOnWrite();
        aqif aqifVar12 = (aqif) aihfVar.instance;
        int i = aqifVar12.b;
        int i2 = this.n;
        aqifVar12.b = i | SemanticState.Multiline;
        aqifVar12.o = i2;
        int iMin = (int) Math.min(2147483647L, Math.max(Build.VERSION.SDK_INT >= 31 ? Build.VERSION.MEDIA_PERFORMANCE_CLASS : 0, auqt.a.io().a()));
        aihfVar.copyOnWrite();
        aqif aqifVar13 = (aqif) aihfVar.instance;
        aqifVar13.b |= 65536;
        aqifVar13.p = iMin;
        Optional optional = this.l;
        if (optional.isPresent()) {
            Object obj = optional.get();
            aihfVar.copyOnWrite();
            aqif aqifVar14 = (aqif) aihfVar.instance;
            aqifVar14.b |= SemanticState.ReadOnly;
            aqifVar14.l = (String) obj;
        }
        Optional optional2 = this.m;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            aihfVar.copyOnWrite();
            aqif aqifVar15 = (aqif) aihfVar.instance;
            aqifVar15.b |= SemanticState.Modal;
            aqifVar15.m = (String) obj2;
        }
    }
}
