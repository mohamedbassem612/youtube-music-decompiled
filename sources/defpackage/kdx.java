package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdx extends kdp {
    public static final khn a = new khn("MediaRouterProxy", (String) null);
    public final dij b;
    public final kbn c;
    public final Map d = new HashMap();
    public kdz e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public dim j;

    public kdx(Context context, dij dijVar, kbn kbnVar, kgw kgwVar) {
        this.b = dijVar;
        this.c = kbnVar;
        if (a.aM()) {
            Build.TYPE.equals("user");
            this.e = new kdz(kbnVar);
            Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
            intent.setPackage(context.getPackageName());
            this.f = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
            this.g = true;
            this.h = true;
            kgwVar.a(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED", "com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK"}).o(new kbr(this, 2));
        }
    }

    @Override // defpackage.kdq
    public final Bundle b(String str) {
        for (dii diiVar : dij.i()) {
            if (diiVar.d.equals(str)) {
                return diiVar.s;
            }
        }
        return null;
    }

    @Override // defpackage.kdq
    public final String c() {
        return dij.j().d;
    }

    @Override // defpackage.kdq
    public final void d(Bundle bundle, int i) {
        did didVar = did.a;
        did didVar2 = bundle != null ? new did(bundle, null) : null;
        if (didVar2 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(didVar2, i);
            } else {
                new afkg(Looper.getMainLooper(), (byte[]) null).post(new kdw(this, didVar2, i, 0));
            }
        }
    }

    @Override // defpackage.kdq
    public final void e(String str) {
        dij.c();
        Iterator it = dij.a().h().iterator();
        while (it.hasNext()) {
            String str2 = ((dif) it.next()).d;
            if (str2.equals(str)) {
                khn.e();
                dij.c();
                if (((dgp) dij.a().k.get(str2)) != null) {
                    throw null;
                }
            }
        }
        dii diiVarJ = dij.j();
        if (diiVarJ.i || !diiVarJ.d.equals(str)) {
            return;
        }
        khn.e();
        dij.o(0);
    }

    @Override // defpackage.kdq
    public final void f(Bundle bundle, kds kdsVar) {
        did didVar = did.a;
        did didVar2 = bundle != null ? new did(bundle, null) : null;
        if (didVar2 != null) {
            Map map = this.d;
            if (!map.containsKey(didVar2)) {
                map.put(didVar2, new HashSet());
            }
            ((Set) map.get(didVar2)).add(new kdt(kdsVar, this, this.e));
        }
    }

    @Override // defpackage.kdq
    public final void g() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.b.q((azs) it2.next());
            }
        }
        map.clear();
    }

    @Override // defpackage.kdq
    public final void h(Bundle bundle) {
        did didVar = did.a;
        byte[] bArr = null;
        did didVar2 = bundle != null ? new did(bundle, null) : null;
        if (didVar2 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(didVar2);
            } else {
                new afkg(Looper.getMainLooper(), (byte[]) null).post(new ihq((Object) this, (Object) didVar2, 5, bArr));
            }
        }
    }

    @Override // defpackage.kdq
    public final void i() {
        dij.f().i(true);
    }

    @Override // defpackage.kdq
    public final void j(String str) {
        khn.e();
        for (dii diiVar : dij.i()) {
            if (diiVar.d.equals(str)) {
                khn.e();
                diiVar.i(true);
                return;
            }
        }
    }

    @Override // defpackage.kdq
    public final void k(int i) {
        dij.o(i);
    }

    @Override // defpackage.kdq
    public final boolean l() {
        dij.c();
        dii diiVar = dij.a().s;
        return diiVar != null && dij.j().d.equals(diiVar.d);
    }

    @Override // defpackage.kdq
    public final boolean m() {
        return dij.j().d.equals(dij.f().d);
    }

    @Override // defpackage.kdq
    public final boolean n(Bundle bundle, int i) {
        did didVarA = did.a(bundle);
        if (didVarA == null) {
            return false;
        }
        return dij.k(didVarA, i);
    }

    public final void o(did didVar, int i) {
        Set set = (Set) this.d.get(didVar);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.b.p(didVar, (azs) it.next(), i);
            }
        }
    }

    public final void p(did didVar) {
        Set set = (Set) this.d.get(didVar);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.b.q((azs) it.next());
            }
        }
    }
}
