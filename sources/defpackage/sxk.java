package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sxk implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sxk(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, tul] */
    /* JADX WARN: Type inference failed for: r11v60, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v61, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, tcu] */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        int i = 0;
        OutputStream outputStream = null;
        switch (this.$cid) {
            case 0:
                xeu xeuVar = (xeu) ((sxn) this.a).a.io();
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                ajbn ajbnVar = (ajbn) ((aihf) this.b).build();
                ajbnVar.getClass();
                alouVar.d = ajbnVar;
                alouVar.c = 488;
                xeuVar.b((alou) alosVar.build());
                return;
            case 1:
                File[] fileArrListFiles = ((File) this.b).listFiles();
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (file.isDirectory() && file.getName().startsWith("failovercache-")) {
                        ((vwt) this.a).T(file);
                    }
                    i++;
                }
                return;
            case 2:
                ((tah) this.a).a.execute(this.b);
                return;
            case 3:
                tdc tdcVar = (tdc) this.b;
                List list = tdcVar.b;
                ?? r11 = this.a;
                tdc.b(list, r11);
                Iterator it = tdcVar.c.iterator();
                while (it.hasNext()) {
                    tdc.b(((tda) it.next()).a, r11);
                }
                return;
            case 4:
                Runtime runtime = Runtime.getRuntime();
                runtime.getClass();
                long jMaxMemory = runtime.maxMemory();
                if (jMaxMemory > 0) {
                    if ((runtime.totalMemory() - runtime.freeMemory()) / jMaxMemory >= ((tec) this.b).b) {
                        ((tea) this.a).c.j(tew.c, 13);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                tet tetVarA = teu.a();
                if (tetVarA != null) {
                    ted tedVar = (ted) this.b;
                    int i2 = tedVar.c;
                    if (i2 > 0) {
                        int i3 = tetVarA.d;
                        if (i3 < tedVar.d) {
                            return;
                        }
                        if (i3 < tedVar.e && ((num = tetVarA.e) == null || num.intValue() > i2)) {
                            return;
                        }
                    } else if (tetVarA.d < tedVar.b) {
                        return;
                    }
                    ((tea) this.a).c.j(tew.c, 14);
                    return;
                }
                return;
            case 6:
                ((thf) this.a).onRequestFinished((RequestFinishedInfo) this.b);
                return;
            case 7:
                ((tmb) this.a).b((Exception) this.b);
                return;
            case 8:
                ((tmb) this.a).b((Exception) this.b);
                return;
            case 9:
                ((tmb) this.a).b((Exception) this.b);
                return;
            case 10:
                ((tmb) this.a).b((Exception) this.b);
                return;
            case 11:
                ((tmb) this.a).b((Exception) this.b);
                return;
            case 12:
                Object obj = this.b;
                Object obj2 = this.a;
                tou touVar = (tou) obj2;
                tmr tmrVar = (tmr) touVar.d.remove(obj);
                if (tmrVar != null) {
                    touVar.b.getClass();
                    try {
                        try {
                            tor torVarC = ((tou) obj2).b.c(tol.e((String) obj));
                            if (torVarC == null) {
                                ((agrc) ((agrc) tou.a.b()).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "putInternal", 151, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.put failed -- could not edit cache file");
                                return;
                            }
                            OutputStream outputStreamD = torVarC.d();
                            agfr agfrVar = ((tou) obj2).c;
                            if (((Boolean) agfrVar.io()).booleanValue()) {
                                outputStreamD = new BufferedOutputStream(outputStreamD, SemanticState.Modal);
                            }
                            new tol((String) obj, tmrVar).l(outputStreamD);
                            outputStreamD.write(tmrVar.a.a());
                            if (((Boolean) agfrVar.io()).booleanValue()) {
                                outputStreamD.flush();
                            }
                            torVarC.b();
                            try {
                                outputStreamD.close();
                                return;
                            } catch (IOException e) {
                                ((agrc) ((agrc) ((agrc) tou.a.b()).j(e)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "putInternal", (char) 174, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.put");
                                return;
                            }
                        } catch (IOException e2) {
                            ((agrc) ((agrc) ((agrc) tou.a.b()).j(e2)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "putInternal", 167, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.put");
                            if (0 != 0) {
                                try {
                                    (null == true ? 1 : 0).close();
                                    return;
                                } catch (IOException e3) {
                                    ((agrc) ((agrc) ((agrc) tou.a.b()).j(e3)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "putInternal", (char) 174, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.put");
                                    return;
                                }
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        if (0 == 0) {
                            throw th;
                        }
                        try {
                            outputStream.close();
                            throw th;
                        } catch (IOException e4) {
                            ((agrc) ((agrc) ((agrc) tou.a.b()).j(e4)).k("com/google/android/libraries/youtube/common/network/volley/cache/GlideVolleyDiskCache", "putInternal", (char) 174, "GlideVolleyDiskCache.java")).t("VolleyDiskCache.put");
                            throw th;
                        }
                    }
                }
                return;
            case 13:
                ((aqi) this.a).b(Boolean.valueOf(nsi.d((Context) ((ahgb) this.b).a)));
                return;
            case 14:
                Object obj3 = this.a;
                Object obj4 = this.b;
                synchronized (obj4) {
                    if (((tsl) obj4).f == obj3) {
                        ((aqi) obj3).b(Boolean.TRUE);
                        ((tsl) obj4).f = null;
                        ((tsl) obj4).j.ab(new tsd(new rla(4), i));
                    }
                    break;
                }
                return;
            case 15:
                Object obj5 = this.a;
                Object obj6 = this.b;
                synchronized (obj6) {
                    if (((tsl) obj6).f == obj5) {
                        ((tsl) obj6).a();
                    }
                    break;
                }
                return;
            case 16:
                Object obj7 = this.a;
                Object obj8 = this.b;
                synchronized (obj8) {
                    if (((tsl) obj8).h == obj7) {
                        ((tsl) obj8).b();
                    }
                    break;
                }
                return;
            case 17:
                Object obj9 = this.a;
                Object obj10 = this.b;
                ((tsl) obj10).d.execute(afwl.i(new sxk(obj10, obj9, 16, null == true ? 1 : 0)));
                return;
            case 18:
                ((tun) this.b).f.remove(this.a);
                return;
            case 19:
                ?? r0 = this.a;
                tun tunVar = (tun) this.b;
                tunVar.a(tunVar.f, r0);
                return;
            default:
                ujd ujdVar = (ujd) this.a;
                Integer numValueOf = Integer.valueOf(ujdVar.e.f);
                ?? r12 = this.b;
                r12.put(numValueOf, 1);
                ujb ujbVar = ujdVar.g;
                awrc.ac(awro.r(ujbVar.c, awov.a, 1, new qbj(ujbVar, (Map) r12, (awoq) null, 7)));
                return;
        }
    }

    public /* synthetic */ sxk(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
