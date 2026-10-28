package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.bumptech.glide.GeneratedAppGlideModule;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class erj implements ComponentCallbacks2 {
    private static volatile erj k;
    private static volatile boolean l;
    public final ewn a;
    public final esc b;
    public final fdf c;
    public final List d = new ArrayList();
    public boolean e;
    public ese f;
    public ese g;
    public final ewv h;
    public final aerj i;
    public final gzj j;
    private final exk m;
    private ese n;
    private final boolean o;
    private final ffm p;

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    public erj(Context context, aerj aerjVar, exk exkVar, ewn ewnVar, ewv ewvVar, fdf fdfVar, gzj gzjVar, int i, erh erhVar, Map map, List list, List list2, fdn fdnVar, dov dovVar) {
        ese eseVar = ese.NORMAL;
        this.n = eseVar;
        this.g = eseVar;
        this.p = new ffl(new ffm() { // from class: erg
            @Override // defpackage.ffm
            public final Object a() {
                return new eri(this.a);
            }
        });
        this.i = aerjVar;
        this.a = ewnVar;
        this.h = ewvVar;
        this.m = exkVar;
        this.c = fdfVar;
        this.j = gzjVar;
        eru eruVar = (eru) ((esd) dovVar.a.get(eru.class));
        if (eruVar != null) {
            this.f = eruVar.a;
        }
        this.o = dovVar.m(err.class);
        this.b = new esc(context, ewvVar, new esl(this, list2, fdnVar), erhVar, map, list, aerjVar, dovVar, i);
    }

    public static erj b(Context context) {
        boolean z;
        List list;
        if (k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleG = g(context.getApplicationContext());
            synchronized (erj.class) {
                if (k == null) {
                    if (l) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    l = true;
                    try {
                        esb esbVar = new esb();
                        Context applicationContext = context.getApplicationContext();
                        List list2 = Collections.EMPTY_LIST;
                        if (generatedAppGlideModuleG == null || generatedAppGlideModuleG.d()) {
                            ArrayList arrayList = new ArrayList();
                            try {
                                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), SemanticState.Focused);
                                if (applicationInfo != null && applicationInfo.metaData != null) {
                                    for (String str : applicationInfo.metaData.keySet()) {
                                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                            arrayList.add(fdr.c(str));
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                if (Log.isLoggable("ManifestParser", 6)) {
                                    Log.e("ManifestParser", "Failed to parse glide modules", e);
                                }
                            }
                            list = arrayList;
                        } else {
                            list = list2;
                        }
                        if (generatedAppGlideModuleG != null && !generatedAppGlideModuleG.b().isEmpty()) {
                            Set setB = generatedAppGlideModuleG.b();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (setB.contains(((fdp) it.next()).getClass())) {
                                    it.remove();
                                }
                            }
                        }
                        esbVar.j = generatedAppGlideModuleG != null ? generatedAppGlideModuleG.a() : null;
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((fdp) it2.next()).c(applicationContext, esbVar);
                        }
                        if (generatedAppGlideModuleG != null) {
                            generatedAppGlideModuleG.c(applicationContext, esbVar);
                        }
                        if (esbVar.d == null) {
                            esbVar.d = exs.d().a();
                        }
                        if (esbVar.e == null) {
                            esbVar.e = exs.c().a();
                        }
                        if (esbVar.k == null) {
                            esbVar.k = exs.b().a();
                        }
                        if (esbVar.f == null) {
                            long j = exs.a;
                            exp expVar = new exp(false, true);
                            expVar.b = exs.a;
                            expVar.a = "source-unlimited";
                            esbVar.f = expVar.a();
                        }
                        if (esbVar.o == null) {
                            esbVar.o = new fjf(new exl(applicationContext));
                        }
                        if (esbVar.r == null) {
                            esbVar.r = new gzj();
                        }
                        if (esbVar.b == null) {
                            int i = esbVar.o.b;
                            if (i > 0) {
                                esbVar.b = new eww(i);
                            } else {
                                esbVar.b = new ewo();
                            }
                        }
                        if (esbVar.n == null) {
                            esbVar.n = new ewv(esbVar.o.a);
                        }
                        if (esbVar.c == null) {
                            esbVar.c = new exj(esbVar.o.c);
                        }
                        if (esbVar.g == null) {
                            esbVar.g = new exh(applicationContext);
                        }
                        if (esbVar.q == null) {
                            esbVar.q = new aerj(esbVar.c, esbVar.g, esbVar.e, esbVar.d, esbVar.f, esbVar.k, esbVar.l);
                        }
                        List list3 = esbVar.m;
                        if (list3 == null) {
                            esbVar.m = Collections.EMPTY_LIST;
                        } else {
                            esbVar.m = DesugarCollections.unmodifiableList(list3);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        z = false;
                                        try {
                                            erj erjVar = new erj(applicationContext, esbVar.q, esbVar.c, esbVar.b, esbVar.n, new fdf(esbVar.j), esbVar.r, esbVar.h, esbVar.i, esbVar.a, esbVar.m, list, generatedAppGlideModuleG, new dov(esbVar.p));
                                            applicationContext.registerComponentCallbacks(erjVar);
                                            if (erjVar.f != null) {
                                                Context applicationContext2 = erjVar.a().getApplicationContext();
                                                if ((applicationContext2 instanceof Application) || !Log.isLoggable("Glide", 5)) {
                                                    ((Application) applicationContext2).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) erjVar.p.a());
                                                } else {
                                                    Log.w("Glide", enb.b(applicationContext2, "Glide requires an Application Context. You passed: ", ". This will disable setting memory category in background."));
                                                }
                                            }
                                            k = erjVar;
                                            l = false;
                                        } catch (Throwable th) {
                                            th = th;
                                            l = z;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = false;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = false;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z = false;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z = false;
                        l = z;
                        throw th;
                    }
                }
            }
        }
        return k;
    }

    public static esq d(Context context) {
        if (context != null) {
            return b(context).c.a(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e) {
            h(e);
            return null;
        } catch (InstantiationException e2) {
            h(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            h(e3);
            return null;
        } catch (InvocationTargetException e4) {
            h(e4);
            return null;
        }
    }

    private static void h(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final ese c(ese eseVar) {
        ffs.g();
        exk exkVar = this.m;
        float f = eseVar.e;
        exkVar.e(f);
        this.a.e(f);
        ese eseVar2 = this.n;
        this.n = eseVar;
        return eseVar2;
    }

    public final void e() {
        ffs.g();
        ((ffo) this.m).j(0L);
        this.a.c();
        this.h.b();
    }

    public final jqs f() {
        return this.b.b();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ffs.g();
        List<esq> list = this.d;
        synchronized (list) {
            for (esq esqVar : list) {
            }
        }
        Object obj = this.m;
        if (i >= 40) {
            ((ffo) obj).j(0L);
        } else if (i >= 20 || i == 15) {
            ffo ffoVar = (ffo) obj;
            ffoVar.j(ffoVar.f() / 2);
        }
        this.a.f(i);
        this.h.d(i);
        if (this.o) {
            if (i < 20) {
                return;
            }
        } else if (i <= 20) {
            return;
        }
        ese eseVar = this.f;
        if (eseVar == null || this.e) {
            return;
        }
        this.e = true;
        this.g = c(eseVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
