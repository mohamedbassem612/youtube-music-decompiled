package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzi extends fze {
    public fzi() {
        this.a.add(fzp.AND);
        this.a.add(fzp.NOT);
        this.a.add(fzp.OR);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        if (iOrdinal == 1) {
            fxw.h(fzp.AND, 2, list);
            fyy fyyVarV = kwqVar.v((fyy) list.get(0));
            return fyyVarV.g().booleanValue() ? kwqVar.v((fyy) list.get(1)) : fyyVarV;
        }
        if (iOrdinal == 47) {
            fxw.h(fzp.NOT, 1, list);
            return new fyp(Boolean.valueOf(!kwqVar.v((fyy) list.get(0)).g().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        fxw.h(fzp.OR, 2, list);
        fyy fyyVarV2 = kwqVar.v((fyy) list.get(0));
        return !fyyVarV2.g().booleanValue() ? kwqVar.v((fyy) list.get(1)) : fyyVarV2;
    }
}
