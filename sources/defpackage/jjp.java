package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jjp extends adks implements jju {
    public adbm d;
    public qcb e = null;
    public final List a = new ArrayList();
    public final ahgb f = new ahgb();
    public final Map b = new HashMap();
    public agke c = agpi.a;

    @Override // defpackage.adkz
    public final int a() {
        return this.a.size();
    }

    public final int b(jjv jjvVar) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return -1;
            }
            if (jjvVar == list.get(i)) {
                return i;
            }
            String str = jjvVar.a.c;
            String str2 = ((jjv) list.get(i)).a.c;
            if (!str.isEmpty() && str.equals(str2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        return this.a.get(i);
    }

    public final void g(jjv jjvVar) {
        this.f.S(jjvVar);
        Map map = this.b;
        if (map.get(jjvVar) != null) {
            ((adhg) map.get(jjvVar)).a = true;
        }
    }

    @Override // defpackage.jju
    public final void hW(jjv jjvVar) {
        boolean z = jjvVar.b;
        ahgb ahgbVar = this.f;
        if (!z) {
            ahgbVar.U(jjvVar);
            return;
        }
        ahgbVar.T(jjvVar);
        qcb qcbVar = this.e;
        if (qcbVar != null) {
            ((jjm) qcbVar.a).n(true);
        }
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}
