package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzm extends fze {
    public fzm() {
        this.a.add(fzp.ADD);
        this.a.add(fzp.DIVIDE);
        this.a.add(fzp.MODULUS);
        this.a.add(fzp.MULTIPLY);
        this.a.add(fzp.NEGATE);
        this.a.add(fzp.POST_DECREMENT);
        this.a.add(fzp.POST_INCREMENT);
        this.a.add(fzp.PRE_DECREMENT);
        this.a.add(fzp.PRE_INCREMENT);
        this.a.add(fzp.SUBTRACT);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fyy fzbVar;
        fyr fyrVar;
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        if (iOrdinal == 0) {
            fxw.h(fzp.ADD, 2, list);
            fyy fyyVarV = kwqVar.v((fyy) list.get(0));
            fyy fyyVarV2 = kwqVar.v((fyy) list.get(1));
            if ((fyyVarV instanceof fyu) || (fyyVarV instanceof fzb) || (fyyVarV2 instanceof fyu) || (fyyVarV2 instanceof fzb)) {
                fzbVar = new fzb(String.valueOf(fyyVarV.i()).concat(String.valueOf(fyyVarV2.i())));
            } else {
                fzbVar = new fyr(Double.valueOf(fyyVarV.h().doubleValue() + fyyVarV2.h().doubleValue()));
            }
        } else {
            if (iOrdinal != 21) {
                if (iOrdinal == 59) {
                    fxw.h(fzp.SUBTRACT, 2, list);
                    fyrVar = new fyr(Double.valueOf(kwqVar.v((fyy) list.get(0)).h().doubleValue() + new fyr(Double.valueOf(-kwqVar.v((fyy) list.get(1)).h().doubleValue())).a.doubleValue()));
                } else {
                    if (iOrdinal == 52 || iOrdinal == 53) {
                        fxw.i(str, 2, list);
                        fyy fyyVarV3 = kwqVar.v((fyy) list.get(0));
                        kwqVar.v((fyy) list.get(1));
                        return fyyVarV3;
                    }
                    if (iOrdinal == 55 || iOrdinal == 56) {
                        fxw.i(str, 1, list);
                        return kwqVar.v((fyy) list.get(0));
                    }
                    switch (iOrdinal) {
                        case 44:
                            fxw.h(fzp.MODULUS, 2, list);
                            fzbVar = new fyr(Double.valueOf(kwqVar.v((fyy) list.get(0)).h().doubleValue() % kwqVar.v((fyy) list.get(1)).h().doubleValue()));
                            break;
                        case 45:
                            fxw.h(fzp.MULTIPLY, 2, list);
                            fzbVar = new fyr(Double.valueOf(kwqVar.v((fyy) list.get(0)).h().doubleValue() * kwqVar.v((fyy) list.get(1)).h().doubleValue()));
                            break;
                        case 46:
                            fxw.h(fzp.NEGATE, 1, list);
                            fyrVar = new fyr(Double.valueOf(-kwqVar.v((fyy) list.get(0)).h().doubleValue()));
                            break;
                        default:
                            return super.b(str);
                    }
                }
                return fyrVar;
            }
            fxw.h(fzp.DIVIDE, 2, list);
            fzbVar = new fyr(Double.valueOf(kwqVar.v((fyy) list.get(0)).h().doubleValue() / kwqVar.v((fyy) list.get(1)).h().doubleValue()));
        }
        return fzbVar;
    }
}
