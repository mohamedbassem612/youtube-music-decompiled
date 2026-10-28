package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzf extends fze {
    public fzf() {
        this.a.add(fzp.EQUALS);
        this.a.add(fzp.GREATER_THAN);
        this.a.add(fzp.GREATER_THAN_EQUALS);
        this.a.add(fzp.IDENTITY_EQUALS);
        this.a.add(fzp.IDENTITY_NOT_EQUALS);
        this.a.add(fzp.LESS_THAN);
        this.a.add(fzp.LESS_THAN_EQUALS);
        this.a.add(fzp.NOT_EQUALS);
    }

    private static boolean c(fyy fyyVar, fyy fyyVar2) {
        if (fyyVar.getClass().equals(fyyVar2.getClass())) {
            if (!(fyyVar instanceof fzc) && !(fyyVar instanceof fyw)) {
                if (fyyVar instanceof fyr) {
                    if (Double.isNaN(fyyVar.h().doubleValue()) || Double.isNaN(fyyVar2.h().doubleValue()) || fyyVar.h().doubleValue() != fyyVar2.h().doubleValue()) {
                        return false;
                    }
                } else {
                    if (fyyVar instanceof fzb) {
                        return fyyVar.i().equals(fyyVar2.i());
                    }
                    if (fyyVar instanceof fyp) {
                        return fyyVar.g().equals(fyyVar2.g());
                    }
                    if (fyyVar != fyyVar2) {
                        return false;
                    }
                }
            }
        } else if ((!(fyyVar instanceof fzc) && !(fyyVar instanceof fyw)) || (!(fyyVar2 instanceof fzc) && !(fyyVar2 instanceof fyw))) {
            boolean z = fyyVar instanceof fyr;
            if (z && (fyyVar2 instanceof fzb)) {
                return c(fyyVar, new fyr(fyyVar2.h()));
            }
            boolean z2 = fyyVar instanceof fzb;
            if (z2 && (fyyVar2 instanceof fyr)) {
                return c(new fyr(fyyVar.h()), fyyVar2);
            }
            if (fyyVar instanceof fyp) {
                return c(new fyr(fyyVar.h()), fyyVar2);
            }
            if (fyyVar2 instanceof fyp) {
                return c(fyyVar, new fyr(fyyVar2.h()));
            }
            if ((z2 || z) && (fyyVar2 instanceof fyu)) {
                return c(fyyVar, new fzb(fyyVar2.i()));
            }
            if (!(fyyVar instanceof fyu)) {
                return false;
            }
            if ((fyyVar2 instanceof fzb) || (fyyVar2 instanceof fyr)) {
                return c(new fzb(fyyVar.i()), fyyVar2);
            }
            return false;
        }
        return true;
    }

    private static boolean d(fyy fyyVar, fyy fyyVar2) {
        if (fyyVar instanceof fyu) {
            fyyVar = new fzb(fyyVar.i());
        }
        if (fyyVar2 instanceof fyu) {
            fyyVar2 = new fzb(fyyVar2.i());
        }
        if (!(fyyVar instanceof fzb) || !(fyyVar2 instanceof fzb)) {
            double dDoubleValue = fyyVar.h().doubleValue();
            double dDoubleValue2 = fyyVar2.h().doubleValue();
            if (!Double.isNaN(dDoubleValue) && !Double.isNaN(dDoubleValue2) && ((dDoubleValue != 0.0d || dDoubleValue2 != 0.0d) && ((dDoubleValue != 0.0d || dDoubleValue2 != 0.0d) && Double.compare(dDoubleValue, dDoubleValue2) < 0))) {
                return true;
            }
        } else if (fyyVar.i().compareTo(fyyVar2.i()) < 0) {
            return true;
        }
        return false;
    }

    private static boolean e(fyy fyyVar, fyy fyyVar2) {
        if (fyyVar instanceof fyu) {
            fyyVar = new fzb(fyyVar.i());
        }
        if (fyyVar2 instanceof fyu) {
            fyyVar2 = new fzb(fyyVar2.i());
        }
        return (((fyyVar instanceof fzb) && (fyyVar2 instanceof fzb)) || !(Double.isNaN(fyyVar.h().doubleValue()) || Double.isNaN(fyyVar2.h().doubleValue()))) && !d(fyyVar2, fyyVar);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        boolean zC;
        boolean zC2;
        fxw.h(fxw.d(str), 2, list);
        fyy fyyVarV = kwqVar.v((fyy) list.get(0));
        fyy fyyVarV2 = kwqVar.v((fyy) list.get(1));
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(fyyVarV, fyyVarV2);
            } else if (iOrdinal == 42) {
                zC = d(fyyVarV, fyyVarV2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(fyyVarV2, fyyVarV);
                        break;
                    case 38:
                        zC = e(fyyVarV2, fyyVarV);
                        break;
                    case 39:
                        zC = fxw.n(fyyVarV, fyyVarV2);
                        break;
                    case 40:
                        zC2 = fxw.n(fyyVarV, fyyVarV2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(fyyVarV, fyyVarV2);
            }
            zC = !zC2;
        } else {
            zC = c(fyyVarV, fyyVarV2);
        }
        return zC ? fyy.k : fyy.l;
    }
}
