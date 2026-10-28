package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzo extends fze {
    public fzo() {
        this.a.add(fzp.ASSIGN);
        this.a.add(fzp.CONST);
        this.a.add(fzp.CREATE_ARRAY);
        this.a.add(fzp.CREATE_OBJECT);
        this.a.add(fzp.EXPRESSION_LIST);
        this.a.add(fzp.GET);
        this.a.add(fzp.GET_INDEX);
        this.a.add(fzp.GET_PROPERTY);
        this.a.add(fzp.NULL);
        this.a.add(fzp.SET_PROPERTY);
        this.a.add(fzp.TYPEOF);
        this.a.add(fzp.UNDEFINED);
        this.a.add(fzp.VAR);
    }

    @Override // defpackage.fze
    public final fyy a(String str, kwq kwqVar, List list) {
        fyy fyyVarV;
        fyy fyyVarV2;
        String str2;
        fzp fzpVar = fzp.ADD;
        int iOrdinal = fxw.d(str).ordinal();
        int i = 0;
        if (iOrdinal != 3) {
            if (iOrdinal == 14) {
                fxw.j(fzp.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    fyy fyyVarV3 = kwqVar.v((fyy) list.get(i2));
                    if (!(fyyVarV3 instanceof fzb)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", fyyVarV3.getClass().getCanonicalName()));
                    }
                    kwqVar.z(fyyVarV3.i(), kwqVar.v((fyy) list.get(i2 + 1)));
                }
                return fyy.f;
            }
            if (iOrdinal == 24) {
                fxw.j(fzp.EXPRESSION_LIST, 1, list);
                fyy fyyVarV4 = fyy.f;
                while (i < list.size()) {
                    fyyVarV4 = kwqVar.v((fyy) list.get(i));
                    if (fyyVarV4 instanceof fyq) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return fyyVarV4;
            }
            if (iOrdinal == 33) {
                fxw.h(fzp.GET, 1, list);
                fyy fyyVarV5 = kwqVar.v((fyy) list.get(0));
                if (fyyVarV5 instanceof fzb) {
                    return kwqVar.x(fyyVarV5.i());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", fyyVarV5.getClass().getCanonicalName()));
            }
            if (iOrdinal == 49) {
                fxw.h(fzp.NULL, 0, list);
                return fyy.g;
            }
            if (iOrdinal == 58) {
                fxw.h(fzp.SET_PROPERTY, 3, list);
                fyy fyyVarV6 = kwqVar.v((fyy) list.get(0));
                fyy fyyVarV7 = kwqVar.v((fyy) list.get(1));
                fyyVarV2 = kwqVar.v((fyy) list.get(2));
                if (fyyVarV6 == fyy.f || fyyVarV6 == fyy.g) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", fyyVarV7.i(), fyyVarV6.i()));
                }
                if ((fyyVarV6 instanceof fyo) && (fyyVarV7 instanceof fyr)) {
                    ((fyo) fyyVarV6).q(fyyVarV7.h().intValue(), fyyVarV2);
                } else if (fyyVarV6 instanceof fyu) {
                    ((fyu) fyyVarV6).r(fyyVarV7.i(), fyyVarV2);
                }
            } else {
                if (iOrdinal == 17) {
                    if (list.isEmpty()) {
                        return new fyo();
                    }
                    fyo fyoVar = new fyo();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fyy fyyVarV8 = kwqVar.v((fyy) it.next());
                        if (fyyVarV8 instanceof fyq) {
                            throw new IllegalStateException("Failed to evaluate array element");
                        }
                        fyoVar.q(i, fyyVarV8);
                        i++;
                    }
                    return fyoVar;
                }
                if (iOrdinal == 18) {
                    if (list.isEmpty()) {
                        return new fyv();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                    }
                    fyv fyvVar = new fyv();
                    while (i < list.size() - 1) {
                        fyy fyyVarV9 = kwqVar.v((fyy) list.get(i));
                        fyy fyyVarV10 = kwqVar.v((fyy) list.get(i + 1));
                        if ((fyyVarV9 instanceof fyq) || (fyyVarV10 instanceof fyq)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        fyvVar.r(fyyVarV9.i(), fyyVarV10);
                        i += 2;
                    }
                    return fyvVar;
                }
                if (iOrdinal == 35 || iOrdinal == 36) {
                    fxw.h(fzp.GET_PROPERTY, 2, list);
                    fyy fyyVarV11 = kwqVar.v((fyy) list.get(0));
                    fyy fyyVarV12 = kwqVar.v((fyy) list.get(1));
                    if ((fyyVarV11 instanceof fyo) && fxw.m(fyyVarV12)) {
                        return ((fyo) fyyVarV11).e(fyyVarV12.h().intValue());
                    }
                    if (fyyVarV11 instanceof fyu) {
                        return ((fyu) fyyVarV11).f(fyyVarV12.i());
                    }
                    if (fyyVarV11 instanceof fzb) {
                        if ("length".equals(fyyVarV12.i())) {
                            fyyVarV = new fyr(Double.valueOf(fyyVarV11.i().length()));
                        } else if (fxw.m(fyyVarV12) && fyyVarV12.h().doubleValue() < fyyVarV11.i().length()) {
                            fyyVarV2 = new fzb(String.valueOf(fyyVarV11.i().charAt(fyyVarV12.h().intValue())));
                        }
                    }
                    return fyy.f;
                }
                switch (iOrdinal) {
                    case 62:
                        fxw.h(fzp.TYPEOF, 1, list);
                        fyy fyyVarV13 = kwqVar.v((fyy) list.get(0));
                        if (fyyVarV13 instanceof fzc) {
                            str2 = "undefined";
                        } else if (fyyVarV13 instanceof fyp) {
                            str2 = "boolean";
                        } else if (fyyVarV13 instanceof fyr) {
                            str2 = "number";
                        } else if (fyyVarV13 instanceof fzb) {
                            str2 = "string";
                        } else if (fyyVarV13 instanceof fyx) {
                            str2 = "function";
                        } else {
                            if ((fyyVarV13 instanceof fyz) || (fyyVarV13 instanceof fyq)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", fyyVarV13));
                            }
                            str2 = "object";
                        }
                        fyyVarV = new fzb(str2);
                        break;
                    case 63:
                        fxw.h(fzp.UNDEFINED, 0, list);
                        return fyy.f;
                    case 64:
                        fxw.j(fzp.VAR, 1, list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            fyy fyyVarV14 = kwqVar.v((fyy) it2.next());
                            if (!(fyyVarV14 instanceof fzb)) {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", fyyVarV14.getClass().getCanonicalName()));
                            }
                            kwqVar.y(fyyVarV14.i(), fyy.f);
                        }
                        return fyy.f;
                    default:
                        return super.b(str);
                }
            }
            return fyyVarV2;
        }
        fxw.h(fzp.ASSIGN, 2, list);
        fyy fyyVarV15 = kwqVar.v((fyy) list.get(0));
        if (!(fyyVarV15 instanceof fzb)) {
            throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", fyyVarV15.getClass().getCanonicalName()));
        }
        if (!kwqVar.B(fyyVarV15.i())) {
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", fyyVarV15.i()));
        }
        fyyVarV = kwqVar.v((fyy) list.get(1));
        kwqVar.A(fyyVarV15.i(), fyyVarV);
        return fyyVarV;
    }
}
