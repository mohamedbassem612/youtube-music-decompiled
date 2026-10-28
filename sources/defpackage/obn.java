package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obn implements obk, obi, obr {
    private static final gct n;
    public final Context a;
    public final boolean b;
    public final long c;
    public final double d;
    public final String e;
    public final long f;
    public final int l;
    private final obc o;
    private final ExecutorService p;
    private final String q;
    private final long r;
    private final axnp u;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Object h = new Object();
    public final Object i = new Object();
    private final Object s = new Object();
    public final aihf m = fxa.a.createBuilder();
    public final List j = new ArrayList();
    public boolean k = false;
    private final HashMap t = new HashMap();

    static {
        aihf aihfVarCreateBuilder = gct.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        gct gctVar = (gct) aihfVarCreateBuilder.instance;
        gctVar.c = 15;
        gctVar.b |= 1;
        n = (gct) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    public obn(Context context, obc obcVar, ExecutorService executorService, axnp axnpVar, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.a = context;
        this.o = obcVar;
        this.p = executorService;
        this.u = axnpVar;
        this.q = str;
        this.c = j;
        this.r = j2;
        this.d = d;
        this.e = str2;
        this.l = i;
        this.f = j3;
        this.b = (random.nextDouble() > d ? 1 : (random.nextDouble() == d ? 0 : -1)) >>> 31;
    }

    @Override // defpackage.obi
    public final ListenableFuture a() {
        ahfo ahfoVar = new ahfo(Executors.callable(new Runnable() { // from class: obl
            @Override // java.lang.Runnable
            public final void run() {
                obn obnVar = this.a;
                if (!obnVar.b || obnVar.g.getAndSet(true)) {
                    return;
                }
                Context context = obnVar.a;
                String str = obnVar.e;
                int i = obnVar.l;
                double d = obnVar.d;
                long j = obnVar.f;
                Locale locale = Locale.getDefault();
                int iAY = a.aY(i == 1 ? aiif.a() : i - 2);
                int i2 = 2;
                if (iAY == 0) {
                    iAY = 2;
                }
                aihf aihfVarCreateBuilder = fxa.a.createBuilder();
                long j2 = Build.VERSION.SDK_INT;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar = (fxa) aihfVarCreateBuilder.instance;
                fxaVar.b |= 1;
                fxaVar.d = j2;
                String str2 = Build.MODEL;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar2 = (fxa) aihfVarCreateBuilder.instance;
                str2.getClass();
                fxaVar2.b |= 2;
                fxaVar2.e = str2;
                String language = locale.getLanguage();
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar3 = (fxa) aihfVarCreateBuilder.instance;
                language.getClass();
                fxaVar3.b |= 4;
                fxaVar3.f = language;
                String country = locale.getCountry();
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar4 = (fxa) aihfVarCreateBuilder.instance;
                country.getClass();
                fxaVar4.b |= 8;
                fxaVar4.g = country;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar5 = (fxa) aihfVarCreateBuilder.instance;
                str.getClass();
                fxaVar5.b |= SemanticState.Focused;
                fxaVar5.k = str;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar6 = (fxa) aihfVarCreateBuilder.instance;
                fxaVar6.o = iAY == 1 ? aiif.a() : iAY - 2;
                fxaVar6.b |= SemanticState.Modal;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar7 = (fxa) aihfVarCreateBuilder.instance;
                fxaVar7.p = 1;
                fxaVar7.b |= SemanticState.Obscured;
                String packageName = context.getPackageName();
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar8 = (fxa) aihfVarCreateBuilder.instance;
                packageName.getClass();
                fxaVar8.b |= 32;
                fxaVar8.i = packageName;
                aihfVarCreateBuilder.copyOnWrite();
                fxa fxaVar9 = (fxa) aihfVarCreateBuilder.instance;
                fxaVar9.b |= SemanticState.ReadOnly;
                fxaVar9.n = j;
                if (d > 0.0d) {
                    long jRound = Math.round(1.0d / d);
                    aihfVarCreateBuilder.copyOnWrite();
                    fxa fxaVar10 = (fxa) aihfVarCreateBuilder.instance;
                    fxaVar10.b |= SemanticState.LiveRegion;
                    fxaVar10.m = jRound;
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j3 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    aihfVarCreateBuilder.copyOnWrite();
                    fxa fxaVar11 = (fxa) aihfVarCreateBuilder.instance;
                    fxaVar11.b |= 64;
                    fxaVar11.j = j3;
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i2 = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i2 = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i2 = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                            i2 = 6;
                        }
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    fxa fxaVar12 = (fxa) aihfVarCreateBuilder.instance;
                    fxaVar12.h = i2 - 1;
                    fxaVar12.b |= 16;
                } catch (RuntimeException unused2) {
                }
                fxa fxaVar13 = (fxa) aihfVarCreateBuilder.build();
                synchronized (obnVar.h) {
                    obnVar.m.mergeFrom((aihn) fxaVar13);
                }
            }
        }, null));
        this.p.execute(ahfoVar);
        return ahfoVar;
    }

    @Override // defpackage.obk
    public final void b(int i, long j, Throwable th, String str) {
        long jLongValue;
        Long lValueOf;
        if (this.b) {
            synchronized (this.i) {
                List list = this.j;
                synchronized (this.s) {
                    try {
                        HashMap map = this.t;
                        Integer numValueOf = Integer.valueOf(i);
                        Long l = (Long) map.get(numValueOf);
                        if (l == null) {
                            l = 0L;
                        }
                        jLongValue = 1 + l.longValue();
                        lValueOf = Long.valueOf(jLongValue);
                        map.put(numValueOf, lValueOf);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lValueOf.getClass();
                list.add(new obm(i, j, th, str, jLongValue));
                if (!this.k) {
                    this.k = true;
                    this.o.b(new mga(this, 17), this.r);
                }
            }
        }
    }

    @Override // defpackage.obr
    public final void c(obq obqVar) {
        synchronized (this.h) {
            aihf aihfVar = this.m;
            String strC = obqVar.c();
            aihfVar.copyOnWrite();
            fxa fxaVar = (fxa) aihfVar.instance;
            fxa fxaVar2 = fxa.a;
            strC.getClass();
            fxaVar.b |= SemanticState.Hidden;
            fxaVar.l = strC;
        }
    }

    public final void d(fxa fxaVar) {
        try {
            aihf aihfVarCreateBuilder = gcv.a.createBuilder();
            gct gctVar = n;
            aihfVarCreateBuilder.copyOnWrite();
            gcv gcvVar = (gcv) aihfVarCreateBuilder.instance;
            gctVar.getClass();
            gcvVar.d = gctVar;
            int i = 1;
            gcvVar.b |= 1;
            aihf aihfVarCreateBuilder2 = gcu.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            gcu gcuVar = (gcu) aihfVarCreateBuilder2.instance;
            fxaVar.getClass();
            gcuVar.c = fxaVar;
            gcuVar.b |= 1;
            gcu gcuVar2 = (gcu) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            gcv gcvVar2 = (gcv) aihfVarCreateBuilder.instance;
            gcuVar2.getClass();
            aiie aiieVar = gcvVar2.c;
            if (!aiieVar.c()) {
                gcvVar2.c = aihn.mutableCopy(aiieVar);
            }
            gcvVar2.c.add(gcuVar2);
            ape.f(new qzb(this.u, this.q, ((gcv) aihfVarCreateBuilder.build()).toByteArray(), i));
        } catch (RuntimeException unused) {
        }
    }
}
