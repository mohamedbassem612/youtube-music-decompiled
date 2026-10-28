package defpackage;

import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aakp implements agek {
    public final AtomicBoolean a = new AtomicBoolean(false);
    final zwa b;
    final /* synthetic */ aakq c;

    public aakp(aakq aakqVar, zwa zwaVar) {
        this.c = aakqVar;
        this.b = zwaVar;
    }

    @Override // defpackage.agek
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        HashMap map = new HashMap();
        int i = 3;
        Collection.EL.stream((agkz) obj).filter(new aaep(5)).map(new aakc(i)).forEach(new aaer(map, i));
        if (!this.a.get() && !map.isEmpty()) {
            aakq aakqVar = this.c;
            synchronized (aakqVar) {
                if (aakqVar.c.e().equals(this.b)) {
                    Map map2 = aakqVar.e;
                    map2.clear();
                    map2.putAll(map);
                }
            }
        }
        return Boolean.TRUE;
    }
}
