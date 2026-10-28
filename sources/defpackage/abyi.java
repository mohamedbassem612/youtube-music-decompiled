package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abyi implements abyj {
    private static final String a = twu.b("MedialibPlayerSettingsApplier");
    private final ytv b;
    private final abnc c;
    private final abmt d;

    public abyi(ytv ytvVar, abnc abncVar, abmt abmtVar) {
        ytvVar.getClass();
        abncVar.getClass();
        abmtVar.getClass();
        this.b = ytvVar;
        this.c = abncVar;
        this.d = abmtVar;
    }

    @Override // defpackage.abyj
    public final void a(String str, wjf wjfVar, Set set) {
        wiu wiuVarF;
        wiu wiuVarF2;
        String str2 = a;
        Objects.toString(set);
        twu.d(str2, 4, "updating medialib player settings to: ".concat(set.toString()), null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            abxp abxpVar = (abxp) it.next();
            int iAy = a.ay(abxpVar);
            if (iAy == 0) {
                this.b.z(((abxk) abxpVar).b);
            } else {
                if (iAy == 1) {
                    abxo abxoVar = (abxo) abxpVar;
                    Objects.toString(abxoVar);
                    j$.util.Objects.checkIndex(0, 4);
                    if (abxoVar != null) {
                        if (abxoVar instanceof abxl) {
                            abxl abxlVar = (abxl) abxoVar;
                            this.b.A(abxlVar.a, abxlVar.d, aguu.V(abxlVar.b), str);
                        } else if (abxoVar instanceof abxm) {
                            this.b.B(((abxm) abxoVar).a, str);
                        } else if (!(abxoVar instanceof abxn)) {
                        }
                    }
                    throw new awmj();
                }
                if (iAy == 2) {
                    abxj abxjVar = (abxj) abxpVar;
                    if (wjfVar == null || (wiuVarF2 = wjfVar.f()) == null) {
                        wiuVarF2 = wiu.c;
                    }
                    Objects.toString(abxjVar);
                    this.b.y(abxjVar.d, wiuVarF2);
                } else {
                    if (iAy != 3) {
                        throw new awmj();
                    }
                    abxi abxiVar = (abxi) abxpVar;
                    if (this.d.Y()) {
                        Objects.toString(abxiVar);
                        if (wjfVar == null || (wiuVarF = wjfVar.f()) == null) {
                            wiuVarF = wiu.c;
                        }
                        this.b.C(acfz.b(wiuVarF, this.c, abxiVar));
                    }
                }
            }
        }
    }
}
