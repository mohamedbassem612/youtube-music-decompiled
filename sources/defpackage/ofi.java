package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ofi implements Application.ActivityLifecycleCallbacks {
    public final roq c;
    private final ogc g;
    public final nrm b = new nrm();
    private final Map d = new HashMap();
    public final Map a = new HashMap();
    private final Map e = new HashMap();
    private final Set f = new HashSet();

    public ofi(oml omlVar, roq roqVar) {
        this.c = roqVar;
        this.g = new ogc(omlVar);
        Application applicationA = omlVar.a();
        if (applicationA != null) {
            applicationA.registerActivityLifecycleCallbacks(this);
        }
    }

    private final void c(String str) {
        this.f.add(str);
        ofn ofnVar = (ofn) this.d.remove(str);
        if (ofnVar != null) {
            this.g.f(ofnVar);
        }
        this.e.remove(str);
    }

    public final ofg a(String str, ogj ogjVar) {
        ogh oghVar = (ogh) this.a.get(str);
        if (oghVar == null) {
            return null;
        }
        int iOrdinal = ogjVar.ordinal();
        if (iOrdinal == 10 || iOrdinal == 11) {
            this.g.b(oghVar, ogjVar);
            oghVar.v();
        } else if (iOrdinal != 17) {
            if (iOrdinal != 18) {
                switch (iOrdinal) {
                    case 0:
                        oghVar.j = false;
                        ogc ogcVar = this.g;
                        oghVar.q = ogcVar.a() > 0.0d;
                        oghVar.b = System.currentTimeMillis();
                        ogcVar.b(oghVar, ogjVar);
                        oghVar.s(ogj.START);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        this.g.b(oghVar, ogjVar);
                        oghVar.s(ogjVar);
                        break;
                    case 4:
                        this.g.b(oghVar, ogjVar);
                        oghVar.s(ogj.COMPLETE);
                        break;
                    case 5:
                        this.g.b(oghVar, ogjVar);
                        oghVar.j = false;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        this.g.b(oghVar, ogjVar);
                        oghVar.j = true;
                        break;
                    default:
                        this.g.b(oghVar, ogjVar);
                        break;
                }
            } else {
                this.g.b(oghVar, ogjVar);
                oghVar.l = false;
            }
        } else {
            this.g.b(oghVar, ogjVar);
            oghVar.l = true;
        }
        ofg ofgVarN = oghVar.n(ogjVar);
        if (!ogjVar.v) {
            oghVar.r(ogjVar);
        }
        if (ogjVar.c() && !ogjVar.equals(ogj.COMPLETE)) {
            oghVar.u(ogjVar.w + 1);
        }
        return ofgVarN;
    }

    public final void b(String str) {
        Map map = this.d;
        if ((map.containsKey(str) ? (ofn) map.get(str) : (ofn) this.e.get(str)) != null) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        Map map = this.d;
        for (String str : map.keySet()) {
            ofn ofnVar = (ofn) map.get(str);
            if (!ofnVar.i() || ofnVar.j(activity)) {
                arrayList.add(str);
            }
        }
        Map map2 = this.e;
        for (String str2 : map2.keySet()) {
            ofn ofnVar2 = (ofn) map2.get(str2);
            if (!ofnVar2.i() || ofnVar2.j(activity)) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str3 = (String) arrayList.get(i);
            b(str3);
            c(str3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.d;
        for (String str : map.keySet()) {
            if (((ofn) map.get(str)).i()) {
                throw null;
            }
            arrayList.add(str);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            b(str2);
            c(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str3 = (String) arrayList2.get(i2);
            ofn ofnVar = (ofn) map.get(str3);
            if (ofnVar != null) {
                this.e.put(str3, ofnVar);
                map.remove(str3);
                this.g.f(ofnVar);
            }
        }
        for (ogh oghVar : this.a.values()) {
            if (oghVar.i() && oghVar.j(activity)) {
                oghVar.a = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.e;
        for (String str : map.keySet()) {
            ofn ofnVar = (ofn) map.get(str);
            if (!ofnVar.i()) {
                arrayList.add(str);
            } else if (ofnVar.j(activity)) {
                ofnVar.a = false;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            b(str2);
            c(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str3 = (String) arrayList2.get(i2);
            ofn ofnVar2 = (ofn) map.get(str3);
            map.remove(str3);
            this.d.put(str3, ofnVar2);
            ogc ogcVar = this.g;
            ogcVar.e(ofnVar2);
            Set set = ogcVar.b;
            boolean zIsEmpty = set.isEmpty();
            set.add(ofnVar2);
            if (zIsEmpty) {
                ogcVar.g();
            }
        }
        for (ogh oghVar : this.a.values()) {
            if (oghVar.i() && oghVar.j(activity)) {
                oghVar.a = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
