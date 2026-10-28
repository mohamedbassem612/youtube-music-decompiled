package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csf {
    public final bvd a;
    public Uri b;
    public crz c;
    public bvq d;
    public crp e;
    public boolean f;
    public aae g;
    public qcb h;
    private final byd i;
    private final cse j;

    public csf(byd bydVar) {
        bvd bvdVar = bvd.a;
        this.i = bydVar;
        this.a = bvdVar;
        this.j = new cse(this, 0);
    }

    public static cnd a(crs crsVar, long j, long j2) {
        cnc cncVar = new cnc(crsVar.a, crsVar.b, j);
        cncVar.d = crsVar.d();
        cncVar.e = crsVar.e();
        cncVar.f = j2;
        cncVar.g = crsVar.c();
        return new cnd(cncVar);
    }

    public final void b() {
        agkj agkjVarD;
        long j;
        ahno.O(this.f);
        Uri uri = this.b;
        uri.getClass();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        qcb qcbVar = this.h;
        qcbVar.getClass();
        crw crwVar = (crw) qcbVar.a;
        ahno.O(crwVar.c);
        if (crwVar.b == null) {
            agkjVarD = agpn.b;
        } else {
            HashMap map = new HashMap();
            Iterator it = crwVar.e.iterator();
            while (it.hasNext()) {
                agke agkeVarA = ((chp) it.next()).a();
                int size = agkeVarA.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) agkeVarA.get(i);
                    if (!map.containsKey(str)) {
                        csi csiVar = (csi) crwVar.d.a.get(str);
                        if (csiVar == null) {
                            j = 0;
                        } else {
                            synchronized (csiVar) {
                                j = csiVar.d;
                                if (j == Long.MIN_VALUE) {
                                    j = 0;
                                }
                            }
                        }
                        map.put(str, Long.valueOf(j));
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add((String) entry.getKey());
                long jLongValue = ((Long) entry.getValue()).longValue();
                if (jLongValue != 0) {
                    arrayList2.add(String.valueOf(jLongValue));
                    z = true;
                } else {
                    arrayList2.add("");
                }
            }
            agkh agkhVar = new agkh(4);
            if (!arrayList.isEmpty()) {
                agkhVar.e("_DASH_pathway", a.R(arrayList));
                if (z) {
                    agkhVar.e("_DASH_throughput", a.R(arrayList2));
                }
            }
            agkjVarD = agkhVar.d(true);
        }
        for (Map.Entry entry2 : new TreeMap(agkjVarD).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        byh byhVar = new byh();
        Uri uriBuild = builderBuildUpon.build();
        uriBuild.getClass();
        byhVar.a = uriBuild;
        crs crsVar = new crs(new yvh(this.i.a(), byhVar.a(), 8, new csc()));
        crp crpVar = this.e;
        crpVar.getClass();
        crpVar.h(crsVar, this.j, 0);
    }

    public final void c(Runnable runnable, long j) {
        bvq bvqVar = this.d;
        bvqVar.getClass();
        bvqVar.e(new cfv(this, runnable, 13, null), j);
    }
}
