package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepx implements rbi {
    public final Map a = new ConcurrentHashMap();
    public final vxz b;
    private final awmd c;
    private final zvl d;

    public aepx(awmd awmdVar, vxz vxzVar, zvl zvlVar) {
        this.c = awmdVar;
        this.b = vxzVar;
        this.d = zvlVar;
    }

    private final void c() {
        ((ahud) this.c.io()).Y(aepw.c);
    }

    @Override // defpackage.rbi
    public final void a(UUID uuid, anck anckVar) {
        if (this.b.l(185, 45691693L, false)) {
            Map map = this.a;
            if (map.size() < 5) {
                if (anckVar.equals((anck) map.put(uuid, anckVar))) {
                    return;
                }
                c();
            } else {
                zvl zvlVar = this.d;
                zvj zvjVarA = zvk.a();
                zvjVarA.d("Max active services reached, not adding further services.");
                zvjVarA.j = 41;
                zvlVar.a(zvjVarA.a());
            }
        }
    }

    @Override // defpackage.rbi
    public final void b(UUID uuid) {
        if (!this.b.l(185, 45691693L, false) || ((anck) this.a.remove(uuid)) == null) {
            return;
        }
        c();
    }
}
