package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhs extends dhx {
    public final Map a;
    public final Handler b;
    public final Map c;
    final /* synthetic */ dht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhs(dht dhtVar, Messenger messenger, int i, String str) {
        super(dhtVar, messenger, i, str);
        this.d = dhtVar;
        this.a = new afv();
        this.b = new Handler(Looper.getMainLooper());
        if (i < 4) {
            this.c = new afv();
        } else {
            this.c = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.dhx
    public final Bundle a(dhq dhqVar) {
        Map map = this.c;
        if (map.isEmpty()) {
            return super.a(dhqVar);
        }
        ArrayList arrayList = new ArrayList();
        List<dhg> list = dhqVar.b;
        for (dhg dhgVar : list) {
            if (map.containsKey(dhgVar.p())) {
                dhf dhfVar = new dhf(dhgVar);
                dhfVar.h(false);
                arrayList.add(dhfVar.a());
            } else {
                arrayList.add(dhgVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (dhqVar == null) {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        arrayList2.addAll(list);
        azs.D(arrayList, arrayList2);
        return super.a(new dhq(arrayList2, dhqVar.c));
    }

    @Override // defpackage.dhx
    public final void b() {
        this.a.clear();
        super.b();
    }

    public final void c(String str) {
        if (this.c.remove(str) != null) {
            d();
        }
    }

    final void d() {
        dhq dhqVar = this.d.d.c.j;
        if (dhqVar != null) {
            dic.f(this.e, 5, 0, 0, a(dhqVar), null);
        }
    }

    @Override // defpackage.dhx
    public final boolean e(String str, String str2, dho dhoVar, int i) {
        Map map = this.a;
        dhn dhnVar = (dhn) map.get(str);
        if (dhnVar != null) {
            this.j.put(i, dhnVar);
            return true;
        }
        boolean zE = super.e(str, str2, dhoVar, i);
        if (zE) {
            map.put(str, (dhn) this.j.get(i));
        }
        return zE;
    }

    @Override // defpackage.dhx
    public final boolean f(int i) {
        dhn dhnVar = (dhn) this.j.get(i);
        if (dhnVar != null) {
            Map map = this.a;
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() == dhnVar) {
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        for (Map.Entry entry2 : this.c.entrySet()) {
            if (((Integer) entry2.getValue()).intValue() == i) {
                c((String) entry2.getKey());
                break;
            }
        }
        return super.f(i);
    }
}
