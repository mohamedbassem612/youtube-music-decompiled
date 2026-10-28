package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class dhz {
    final dic d;
    dhh f;
    dhh g;
    long h;
    final ArrayList e = new ArrayList();
    public final Map i = new HashMap();
    public final Object j = new Object();
    private final dik a = new dik(new cqc(this, 13));

    public dhz(dic dicVar) {
        this.d = dicVar;
    }

    public IBinder a(Intent intent) {
        if (intent.getAction().equals("android.media.MediaRouteProviderService")) {
            dic dicVar = this.d;
            dicVar.d();
            if (dicVar.c != null) {
                return dicVar.a.getBinder();
            }
        }
        return null;
    }

    public dhx b(Messenger messenger, int i, String str) {
        return new dhx(this, messenger, i, str);
    }

    public void d(dhq dhqVar) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dhx dhxVar = (dhx) arrayList.get(i);
            dic.f(dhxVar.e, 5, 0, 0, dhxVar.a(dhqVar), null);
        }
    }

    final int f(Messenger messenger) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((dhx) arrayList.get(i)).e.getBinder() == messenger.getBinder()) {
                return i;
            }
        }
        return -1;
    }

    public final dhx g(Messenger messenger) {
        int iF = f(messenger);
        if (iF >= 0) {
            return (dhx) this.e.get(iF);
        }
        return null;
    }

    public final dhx h(int i) {
        dhx dhxVar = (dhx) this.e.remove(i);
        i();
        return dhxVar;
    }

    public final void i() {
        Map map = this.i;
        if (map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.e);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str = ((dhx) arrayList2.get(i)).g;
            arrayList.add(new vy(null, null));
        }
        synchronized (this.j) {
            for (Map.Entry entry : map.entrySet()) {
                ((Executor) entry.getValue()).execute(new dhr((axo) entry.getKey(), arrayList, 2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    public final void j() {
        heg hegVar;
        boolean z;
        dik dikVar = this.a;
        dikVar.b();
        dhh dhhVar = this.g;
        if (dhhVar != null) {
            dikVar.a(dhhVar.b(), this.h);
            if (this.g.d()) {
                boolean zB = this.g.b();
                long j = this.h;
                if (!zB || dikVar.a - j >= 30000) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            hegVar = new heg(this.g.a());
        } else {
            hegVar = null;
            z = false;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dhx dhxVar = (dhx) arrayList.get(i);
            dhh dhhVar2 = dhxVar.h;
            if (dhhVar2 != null && (!dhhVar2.a().d() || dhhVar2.b())) {
                dikVar.a(dhhVar2.b(), dhxVar.i);
                if (hegVar == null) {
                    hegVar = new heg(dhhVar2.a());
                } else {
                    hegVar.n(dhhVar2.a());
                }
            }
        }
        dhh dhhVar3 = hegVar != null ? new dhh(hegVar.k(), dikVar.c(), z) : null;
        if (Objects.equals(this.f, dhhVar3)) {
            return;
        }
        this.f = dhhVar3;
        dhp dhpVar = this.d.c;
        if (dhpVar != null) {
            dhpVar.gA(dhhVar3);
        }
    }

    public void c(Context context) {
    }

    public dhq e(dhq dhqVar, String str) {
        return dhqVar;
    }
}
