package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzg extends fze {
    public fzg() {
        this.a.add(fzp.APPLY);
        this.a.add(fzp.BLOCK);
        this.a.add(fzp.BREAK);
        this.a.add(fzp.CASE);
        this.a.add(fzp.DEFAULT);
        this.a.add(fzp.CONTINUE);
        this.a.add(fzp.DEFINE_FUNCTION);
        this.a.add(fzp.FN);
        this.a.add(fzp.IF);
        this.a.add(fzp.QUOTE);
        this.a.add(fzp.RETURN);
        this.a.add(fzp.SWITCH);
        this.a.add(fzp.TERNARY);
    }

    private static fyy c(kwq kwqVar, List list) {
        fxw.j(fzp.FN, 2, list);
        fyy fyyVarV = kwqVar.v((fyy) list.get(0));
        fyy fyyVarV2 = kwqVar.v((fyy) list.get(1));
        if (!(fyyVarV2 instanceof fyo)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", fyyVarV2.getClass().getCanonicalName()));
        }
        List listM = ((fyo) fyyVarV2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new fyx(fyyVarV.i(), listM, arrayList, kwqVar);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        if (iOrdinal == 2) {
            fxw.h(fzp.APPLY, 3, list);
            fyy fyyVarV = kwqVar.v((fyy) list.get(0));
            String strI = kwqVar.v((fyy) list.get(1)).i();
            fyy fyyVarV2 = kwqVar.v((fyy) list.get(2));
            if (!(fyyVarV2 instanceof fyo)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", fyyVarV2.getClass().getCanonicalName()));
            }
            if (strI.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return fyyVarV.gR(strI, kwqVar, ((fyo) fyyVarV2).m());
        }
        if (iOrdinal == 15) {
            fxw.h(fzp.BREAK, 0, list);
            return fyy.h;
        }
        if (iOrdinal == 25) {
            return c(kwqVar, list);
        }
        if (iOrdinal == 41) {
            fxw.j(fzp.IF, 2, list);
            fyy fyyVarV3 = kwqVar.v((fyy) list.get(0));
            fyy fyyVarV4 = kwqVar.v((fyy) list.get(1));
            fyy fyyVarV5 = list.size() > 2 ? kwqVar.v((fyy) list.get(2)) : null;
            fyy fyyVar = fyy.f;
            fyy fyyVarW = fyyVarV3.g().booleanValue() ? kwqVar.w((fyo) fyyVarV4) : fyyVarV5 != null ? kwqVar.w((fyo) fyyVarV5) : fyyVar;
            return true != (fyyVarW instanceof fyq) ? fyyVar : fyyVarW;
        }
        if (iOrdinal == 54) {
            return new fyo(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return fyy.j;
            }
            fxw.h(fzp.RETURN, 1, list);
            return new fyq("return", kwqVar.v((fyy) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                fxw.j(fzp.DEFINE_FUNCTION, 2, list);
                fyy fyyVarC = c(kwqVar, list);
                String str2 = ((fys) fyyVarC).d;
                if (str2 == null) {
                    kwqVar.A("", fyyVarC);
                    return fyyVarC;
                }
                kwqVar.A(str2, fyyVarC);
                return fyyVarC;
            }
            if (iOrdinal == 60) {
                fxw.h(fzp.SWITCH, 3, list);
                fyy fyyVarV6 = kwqVar.v((fyy) list.get(0));
                fyy fyyVarV7 = kwqVar.v((fyy) list.get(1));
                fyy fyyVarV8 = kwqVar.v((fyy) list.get(2));
                if (!(fyyVarV7 instanceof fyo)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(fyyVarV8 instanceof fyo)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                fyo fyoVar = (fyo) fyyVarV7;
                fyo fyoVar2 = (fyo) fyyVarV8;
                boolean z = false;
                for (int i = 0; i < fyoVar.c(); i++) {
                    if (z || fyyVarV6.equals(kwqVar.v(fyoVar.e(i)))) {
                        fyy fyyVarV9 = kwqVar.v(fyoVar2.e(i));
                        if (fyyVarV9 instanceof fyq) {
                            return ((fyq) fyyVarV9).b.equals("break") ? fyy.f : fyyVarV9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (fyoVar.c() + 1 == fyoVar2.c()) {
                    fyy fyyVarV10 = kwqVar.v(fyoVar2.e(fyoVar.c()));
                    if (fyyVarV10 instanceof fyq) {
                        String str3 = ((fyq) fyyVarV10).b;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return fyyVarV10;
                        }
                    }
                }
                return fyy.f;
            }
            if (iOrdinal == 61) {
                fxw.h(fzp.TERNARY, 3, list);
                return kwqVar.v((fyy) list.get(0)).g().booleanValue() ? kwqVar.v((fyy) list.get(1)) : kwqVar.v((fyy) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return kwqVar.F().w(new fyo(list));
                case 12:
                    fxw.h(fzp.BREAK, 0, list);
                    return fyy.i;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return fyy.f;
        }
        fyy fyyVarV11 = kwqVar.v((fyy) list.get(0));
        return fyyVarV11 instanceof fyo ? kwqVar.w((fyo) fyyVarV11) : fyy.f;
    }
}
