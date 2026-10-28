package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xxn implements abyj {
    private static final String a = twu.b("MDX.PlayerSettingsApplier");
    private final awmd b;
    private final vxz c;

    public xxn(vxz vxzVar, awmd awmdVar) {
        vxzVar.getClass();
        awmdVar.getClass();
        this.c = vxzVar;
        this.b = awmdVar;
    }

    @Override // defpackage.abyj
    public final void a(String str, wjf wjfVar, Set set) {
        yco ycoVar;
        String str2 = a;
        Objects.toString(set);
        twu.d(str2, 4, "applying settings to MDX player: ".concat(set.toString()), null);
        awmd awmdVar = this.b;
        yco ycoVar2 = ((ycp) awmdVar.io()).e;
        if (ycoVar2 == null) {
            twu.d(str2, 5, "MDX session is null, ignoring settings update.", null);
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abxp abxpVar = (abxp) it.next();
            j$.util.Objects.checkIndex(0, 5);
            if (abxpVar != null) {
                if (!(abxpVar instanceof abxk) && !(abxpVar instanceof abxo) && !(abxpVar instanceof abxi)) {
                    if (abxpVar instanceof abxj) {
                        if (this.c.l(58, 45400591L, false) && (ycoVar = ((ycp) awmdVar.io()).e) != null && ycoVar.as()) {
                            abxj abxjVar = (abxj) abxpVar;
                            Objects.toString(abxjVar);
                            ycoVar2.af(abxjVar.d);
                        }
                    }
                }
            }
            throw new awmj();
        }
    }
}
