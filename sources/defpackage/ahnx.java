package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahnx implements les {
    final /* synthetic */ lay a;

    public ahnx(lay layVar) {
        this.a = layVar;
    }

    @Override // defpackage.les
    public final int a(String str) {
        kzl kzlVar = new kzl();
        lay layVar = this.a;
        layVar.i(new lan(layVar, str, kzlVar));
        Integer num = (Integer) kzl.d(kzlVar.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.les
    public final long b() {
        return this.a.a();
    }

    @Override // defpackage.les
    public final String c() {
        return this.a.d();
    }

    @Override // defpackage.les
    public final String d() {
        kzl kzlVar = new kzl();
        lay layVar = this.a;
        layVar.i(new lak(layVar, kzlVar));
        return kzlVar.c(500L);
    }

    @Override // defpackage.les
    public final String e() {
        kzl kzlVar = new kzl();
        lay layVar = this.a;
        layVar.i(new laj(layVar, kzlVar));
        return kzlVar.c(500L);
    }

    @Override // defpackage.les
    public final String f() {
        return this.a.e();
    }

    @Override // defpackage.les
    public final List g(String str, String str2) {
        kzl kzlVar = new kzl();
        lay layVar = this.a;
        layVar.i(new kzz(layVar, str, str2, kzlVar));
        List list = (List) kzl.d(kzlVar.b(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // defpackage.les
    public final Map h(String str, String str2, boolean z) {
        kzl kzlVar = new kzl();
        lay layVar = this.a;
        layVar.i(new lal(layVar, str, str2, z, kzlVar));
        Bundle bundleB = kzlVar.b(5000L);
        if (bundleB == null || bundleB.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleB.size());
        for (String str3 : bundleB.keySet()) {
            Object obj = bundleB.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // defpackage.les
    public final void i(String str) {
        this.a.g(str);
    }

    @Override // defpackage.les
    public final void j(String str, String str2, Bundle bundle) {
        lay layVar = this.a;
        layVar.i(new kzy(layVar, str, str2, bundle));
    }

    @Override // defpackage.les
    public final void k(String str) {
        this.a.h(str);
    }

    @Override // defpackage.les
    public final void l(String str, String str2, Bundle bundle) {
        this.a.j(str, str2, bundle, true);
    }

    @Override // defpackage.les
    public final void m(Bundle bundle) {
        lay layVar = this.a;
        layVar.i(new kzx(layVar, bundle));
    }
}
