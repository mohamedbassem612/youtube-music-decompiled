package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzl extends fze {
    public fzl() {
        this.a.add(fzp.FOR_IN);
        this.a.add(fzp.FOR_IN_CONST);
        this.a.add(fzp.FOR_IN_LET);
        this.a.add(fzp.FOR_LET);
        this.a.add(fzp.FOR_OF);
        this.a.add(fzp.FOR_OF_CONST);
        this.a.add(fzp.FOR_OF_LET);
        this.a.add(fzp.WHILE);
    }

    private static fyy c(fzk fzkVar, Iterator it, fyy fyyVar) {
        if (it != null) {
            while (it.hasNext()) {
                fyy fyyVarW = fzkVar.a((fyy) it.next()).w((fyo) fyyVar);
                if (fyyVarW instanceof fyq) {
                    fyq fyqVar = (fyq) fyyVarW;
                    String str = fyqVar.b;
                    if ("break".equals(str)) {
                        return fyy.f;
                    }
                    if ("return".equals(str)) {
                        return fyqVar;
                    }
                }
            }
        }
        return fyy.f;
    }

    private static fyy d(fzk fzkVar, fyy fyyVar, fyy fyyVar2) {
        return c(fzkVar, fyyVar.l(), fyyVar2);
    }

    private static fyy e(fzk fzkVar, fyy fyyVar, fyy fyyVar2) {
        if (fyyVar instanceof Iterable) {
            return c(fzkVar, ((Iterable) fyyVar).iterator(), fyyVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0296  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9 A[SYNTHETIC] */
    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fyy fyyVarW;
        fyq fyqVar;
        String str2;
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        if (iOrdinal == 65) {
            fxw.h(fzp.WHILE, 4, list);
            fyy fyyVar = (fyy) list.get(0);
            fyy fyyVar2 = (fyy) list.get(1);
            fyy fyyVar3 = (fyy) list.get(2);
            fyy fyyVarV = kwqVar.v((fyy) list.get(3));
            if (!kwqVar.v(fyyVar3).g().booleanValue()) {
                while (kwqVar.v(fyyVar).g().booleanValue()) {
                    fyyVarW = kwqVar.w((fyo) fyyVarV);
                    if (fyyVarW instanceof fyq) {
                        fyqVar = (fyq) fyyVarW;
                        str2 = fyqVar.b;
                        if ("break".equals(str2)) {
                            return fyy.f;
                        }
                        if ("return".equals(str2)) {
                        }
                    }
                    kwqVar.v(fyyVar2);
                }
                return fyy.f;
            }
            fyy fyyVarW2 = kwqVar.w((fyo) fyyVarV);
            if (!(fyyVarW2 instanceof fyq)) {
                while (kwqVar.v(fyyVar).g().booleanValue()) {
                    fyyVarW = kwqVar.w((fyo) fyyVarV);
                    if (fyyVarW instanceof fyq) {
                        fyqVar = (fyq) fyyVarW;
                        str2 = fyqVar.b;
                        if ("break".equals(str2)) {
                            return fyy.f;
                        }
                        if ("return".equals(str2)) {
                        }
                    }
                    kwqVar.v(fyyVar2);
                }
                return fyy.f;
            }
            fyqVar = (fyq) fyyVarW2;
            String str3 = fyqVar.b;
            if ("break".equals(str3)) {
                return fyy.f;
            }
            if (!"return".equals(str3)) {
                while (kwqVar.v(fyyVar).g().booleanValue()) {
                    fyyVarW = kwqVar.w((fyo) fyyVarV);
                    if (fyyVarW instanceof fyq) {
                        fyqVar = (fyq) fyyVarW;
                        str2 = fyqVar.b;
                        if ("break".equals(str2)) {
                            return fyy.f;
                        }
                        if ("return".equals(str2)) {
                        }
                    }
                    kwqVar.v(fyyVar2);
                }
                return fyy.f;
            }
            return fyqVar;
        }
        switch (iOrdinal) {
            case 26:
                fxw.h(fzp.FOR_IN, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new fzj(kwqVar, ((fyy) list.get(0)).i(), 2), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            case 27:
                fxw.h(fzp.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new fzj(kwqVar, ((fyy) list.get(0)).i(), 1), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            case 28:
                fxw.h(fzp.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new fzj(kwqVar, ((fyy) list.get(0)).i(), 0), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            case 29:
                fxw.h(fzp.FOR_LET, 4, list);
                fyy fyyVarV2 = kwqVar.v((fyy) list.get(0));
                if (!(fyyVarV2 instanceof fyo)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                fyo fyoVar = (fyo) fyyVarV2;
                fyy fyyVar4 = (fyy) list.get(1);
                fyy fyyVar5 = (fyy) list.get(2);
                fyy fyyVarV3 = kwqVar.v((fyy) list.get(3));
                kwq kwqVarF = kwqVar.F();
                for (int i = 0; i < fyoVar.c(); i++) {
                    String strI = fyoVar.e(i).i();
                    kwqVarF.A(strI, kwqVar.x(strI));
                }
                while (kwqVar.v(fyyVar4).g().booleanValue()) {
                    fyy fyyVarW3 = kwqVar.w((fyo) fyyVarV3);
                    if (fyyVarW3 instanceof fyq) {
                        fyq fyqVar2 = (fyq) fyyVarW3;
                        String str4 = fyqVar2.b;
                        if ("break".equals(str4)) {
                            return fyy.f;
                        }
                        if ("return".equals(str4)) {
                            return fyqVar2;
                        }
                    }
                    kwq kwqVarF2 = kwqVar.F();
                    for (int i2 = 0; i2 < fyoVar.c(); i2++) {
                        String strI2 = fyoVar.e(i2).i();
                        kwqVarF2.A(strI2, kwqVarF.x(strI2));
                    }
                    kwqVarF2.v(fyyVar5);
                    kwqVarF = kwqVarF2;
                }
                return fyy.f;
            case 30:
                fxw.h(fzp.FOR_OF, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new fzj(kwqVar, ((fyy) list.get(0)).i(), 2), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            case 31:
                fxw.h(fzp.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new fzj(kwqVar, ((fyy) list.get(0)).i(), 1), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            case 32:
                fxw.h(fzp.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof fzb)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new fzj(kwqVar, ((fyy) list.get(0)).i(), 0), kwqVar.v((fyy) list.get(1)), kwqVar.v((fyy) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
