package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzd extends fze {
    public fzd() {
        this.a.add(fzp.BITWISE_AND);
        this.a.add(fzp.BITWISE_LEFT_SHIFT);
        this.a.add(fzp.BITWISE_NOT);
        this.a.add(fzp.BITWISE_OR);
        this.a.add(fzp.BITWISE_RIGHT_SHIFT);
        this.a.add(fzp.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(fzp.BITWISE_XOR);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fzp fzpVar = fzp.ADD;
        switch (fxw.d(str).ordinal()) {
            case 4:
                fxw.h(fzp.BITWISE_AND, 2, list);
                return new fyr(Double.valueOf(fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue()) & fxw.b(kwqVar.v((fyy) list.get(1)).h().doubleValue())));
            case 5:
                fxw.h(fzp.BITWISE_LEFT_SHIFT, 2, list);
                return new fyr(Double.valueOf(fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue()) << ((int) (fxw.c(kwqVar.v((fyy) list.get(1)).h().doubleValue()) & 31))));
            case 6:
                fxw.h(fzp.BITWISE_NOT, 1, list);
                return new fyr(Double.valueOf(~fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue())));
            case 7:
                fxw.h(fzp.BITWISE_OR, 2, list);
                return new fyr(Double.valueOf(fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue()) | fxw.b(kwqVar.v((fyy) list.get(1)).h().doubleValue())));
            case 8:
                fxw.h(fzp.BITWISE_RIGHT_SHIFT, 2, list);
                return new fyr(Double.valueOf(fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue()) >> ((int) (fxw.c(kwqVar.v((fyy) list.get(1)).h().doubleValue()) & 31))));
            case 9:
                fxw.h(fzp.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new fyr(Double.valueOf(fxw.c(kwqVar.v((fyy) list.get(0)).h().doubleValue()) >>> ((int) (fxw.c(kwqVar.v((fyy) list.get(1)).h().doubleValue()) & 31))));
            case 10:
                fxw.h(fzp.BITWISE_XOR, 2, list);
                return new fyr(Double.valueOf(fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue()) ^ fxw.b(kwqVar.v((fyy) list.get(1)).h().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
