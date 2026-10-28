package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lbl extends lbm {
    final /* synthetic */ lbo a;
    private final lht h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbl(lbo lboVar, String str, int i, lht lhtVar) {
        super(str, i);
        this.a = lboVar;
        this.h = lhtVar;
    }

    @Override // defpackage.lbm
    public final int a() {
        return this.h.c;
    }

    @Override // defpackage.lbm
    public final boolean b() {
        return (this.h.b & 8) != 0;
    }

    @Override // defpackage.lbm
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:111:0x0244  */
    /* JADX WARN: Code duplicated, block: B:113:0x024e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0256  */
    /* JADX WARN: Code duplicated, block: B:124:0x0289  */
    /* JADX WARN: Code duplicated, block: B:126:0x0293  */
    /* JADX WARN: Code duplicated, block: B:129:0x029b  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:157:0x033d A[EDGE_INSN: B:157:0x033d->B:160:0x037a BREAK  A[LOOP:1: B:65:0x0155->B:70:0x017e]] */
    /* JADX WARN: Code duplicated, block: B:158:0x035b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e A[LOOP:1: B:65:0x0155->B:70:0x017e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0205  */
    final boolean d(Long l, Long l2, lin linVar, long j, lca lcaVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        afv afvVar;
        Iterator it2;
        Iterator it3;
        Boolean bool;
        lhu lhuVar;
        boolean z2;
        String str;
        Object obj;
        lhv lhvVar;
        Boolean boolH;
        lhv lhvVar2;
        Boolean boolG;
        int i;
        String str2;
        lhv lhvVar3;
        Boolean boolI;
        lhx lhxVar;
        lip lipVar;
        int i2;
        int i3;
        Long lValueOf;
        int i4;
        Double dValueOf;
        lhu lhuVar2;
        String string;
        ausi.c();
        lbo lboVar = this.a;
        lbt lbtVarG = lboVar.G();
        String str3 = this.b;
        boolean zF = lbtVarG.F(str3, lcl.aD);
        lht lhtVar = this.h;
        long j2 = lhtVar.i ? lcaVar.e : j;
        if (lboVar.aT().i(2)) {
            lboVar.aT().k.d("Evaluating filter. audience, filter, event", Integer.valueOf(this.c), (lhtVar.b & 1) != 0 ? Integer.valueOf(lhtVar.c) : null, lboVar.I().c(lhtVar.d));
            lcx lcxVar = lboVar.aT().k;
            lfx lfxVarU = lboVar.u();
            if (lhtVar == null) {
                string = "null";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("\nevent_filter {\n");
                if ((lhtVar.b & 1) != 0) {
                    lfx.aa(sb, 0, "filter_id", Integer.valueOf(lhtVar.c));
                }
                lfx.aa(sb, 0, "event_name", lfxVarU.I().c(lhtVar.d));
                String strS = lfx.S(lhtVar.g, lhtVar.h, lhtVar.i);
                if (!strS.isEmpty()) {
                    lfx.aa(sb, 0, "filter_type", strS);
                }
                if ((lhtVar.b & 8) != 0) {
                    lhv lhvVar4 = lhtVar.f;
                    if (lhvVar4 == null) {
                        lhvVar4 = lhv.a;
                    }
                    lfx.ae(sb, 1, "event_count_filter", lhvVar4);
                }
                if (lhtVar.e.size() > 0) {
                    sb.append("  filters {\n");
                    Iterator it4 = lhtVar.e.iterator();
                    while (it4.hasNext()) {
                        lfxVarU.A(sb, 2, (lhu) it4.next());
                    }
                }
                lfx.P(sb, 1);
                sb.append("}\n}\n");
                string = sb.toString();
            }
            lcxVar.b("Filter definition", string);
        }
        int i5 = lhtVar.b;
        if ((i5 & 1) == 0 || lhtVar.c > 256) {
            lboVar.aT().f.c("Invalid event filter ID. appId, id", lcz.a(str3), String.valueOf((lhtVar.b & 1) != 0 ? Integer.valueOf(lhtVar.c) : null));
        } else {
            boolean z3 = lhtVar.g || lhtVar.h || lhtVar.i;
            if (z && !z3) {
                lboVar.aT().k.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.c), (lhtVar.b & 1) != 0 ? Integer.valueOf(lhtVar.c) : null);
                return true;
            }
            String str4 = linVar.d;
            if ((i5 & 8) != 0) {
                lhv lhvVar5 = lhtVar.f;
                if (lhvVar5 == null) {
                    lhvVar5 = lhv.a;
                }
                Boolean boolH2 = h(j2, lhvVar5);
                if (boolH2 != null) {
                    if (boolH2.booleanValue()) {
                        hashSet = new HashSet();
                        it = lhtVar.e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                afvVar = new afv();
                                it2 = linVar.c.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        it3 = lhtVar.e.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            lhuVar = (lhu) it3.next();
                                            if ((lhuVar.b & 4) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            str = lhuVar.f;
                                            if (str.isEmpty()) {
                                                lboVar.aT().f.b("Event has empty param name. event", lboVar.I().c(str4));
                                            } else {
                                                obj = afvVar.get(str);
                                                if (obj instanceof Long) {
                                                    if ((lhuVar.b & 2) != 0) {
                                                        long jLongValue = ((Long) obj).longValue();
                                                        lhvVar = lhuVar.d;
                                                        if (lhvVar == null) {
                                                            lhvVar = lhv.a;
                                                        }
                                                        boolH = h(jLongValue, lhvVar);
                                                        if (boolH != null) {
                                                            if (boolH.booleanValue() == z2) {
                                                                bool = Boolean.FALSE;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        lboVar.aT().f.c("No number filter for long param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                    }
                                                } else if (obj instanceof Double) {
                                                    if ((lhuVar.b & 2) != 0) {
                                                        double dDoubleValue = ((Double) obj).doubleValue();
                                                        lhvVar2 = lhuVar.d;
                                                        if (lhvVar2 == null) {
                                                            lhvVar2 = lhv.a;
                                                        }
                                                        boolG = g(dDoubleValue, lhvVar2);
                                                        if (boolG != null) {
                                                            if (boolG.booleanValue() == z2) {
                                                                bool = Boolean.FALSE;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        lboVar.aT().f.c("No number filter for double param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                    }
                                                } else if (obj instanceof String) {
                                                    i = lhuVar.b;
                                                    if ((i & 1) != 0) {
                                                        String str5 = (String) obj;
                                                        lhxVar = lhuVar.c;
                                                        if (lhxVar == null) {
                                                            lhxVar = lhx.a;
                                                        }
                                                        boolI = f(str5, lhxVar, lboVar.aT());
                                                    } else if ((i & 2) != 0) {
                                                        str2 = (String) obj;
                                                        if (lfx.F(str2)) {
                                                            lhvVar3 = lhuVar.d;
                                                            if (lhvVar3 == null) {
                                                                lhvVar3 = lhv.a;
                                                            }
                                                            boolI = i(str2, lhvVar3);
                                                        } else {
                                                            lboVar.aT().f.c("Invalid param value for number filter. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                        }
                                                    } else {
                                                        lboVar.aT().f.c("No filter for String param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                    }
                                                    if (boolI == null) {
                                                        if (boolI.booleanValue() == z2) {
                                                            bool = Boolean.FALSE;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    if (obj == null) {
                                                        lboVar.aT().k.c("Missing param for filter. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    lboVar.aT().f.c("Unknown param type. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                }
                                            }
                                        }
                                    } else {
                                        lipVar = (lip) it2.next();
                                        if (!hashSet.contains(lipVar.c)) {
                                            i2 = lipVar.b;
                                            i3 = i2 & 4;
                                            if (i3 != 0) {
                                                String str6 = lipVar.c;
                                                if (i3 != 0) {
                                                    lValueOf = Long.valueOf(lipVar.e);
                                                } else {
                                                    lValueOf = null;
                                                }
                                                afvVar.put(str6, lValueOf);
                                            } else {
                                                i4 = i2 & 16;
                                                if (i4 != 0) {
                                                    String str7 = lipVar.c;
                                                    if (i4 != 0) {
                                                        dValueOf = Double.valueOf(lipVar.g);
                                                    } else {
                                                        dValueOf = null;
                                                    }
                                                    afvVar.put(str7, dValueOf);
                                                } else if ((i2 & 2) != 0) {
                                                    afvVar.put(lipVar.c, lipVar.d);
                                                } else {
                                                    lboVar.aT().f.c("Unknown value for param. event, param", lboVar.I().c(str4), lboVar.I().d(lipVar.c));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                lhuVar2 = (lhu) it.next();
                                if (lhuVar2.f.isEmpty()) {
                                    lboVar.aT().f.b("null or empty param name in filter. event", lboVar.I().c(str4));
                                } else {
                                    hashSet.add(lhuVar2.f);
                                }
                            }
                            bool = null;
                            break;
                        }
                    }
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                    break;
                }
            } else {
                hashSet = new HashSet();
                it = lhtVar.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        afvVar = new afv();
                        it2 = linVar.c.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = lhtVar.e.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    lhuVar = (lhu) it3.next();
                                    if ((lhuVar.b & 4) == 0 && lhuVar.e) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    str = lhuVar.f;
                                    if (str.isEmpty()) {
                                        lboVar.aT().f.b("Event has empty param name. event", lboVar.I().c(str4));
                                    } else {
                                        obj = afvVar.get(str);
                                        if (obj instanceof Long) {
                                            if ((lhuVar.b & 2) != 0) {
                                                long jLongValue2 = ((Long) obj).longValue();
                                                lhvVar = lhuVar.d;
                                                if (lhvVar == null) {
                                                    lhvVar = lhv.a;
                                                }
                                                boolH = h(jLongValue2, lhvVar);
                                                if (boolH != null) {
                                                    if (boolH.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                lboVar.aT().f.c("No number filter for long param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                            }
                                        } else if (obj instanceof Double) {
                                            if ((lhuVar.b & 2) != 0) {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                lhvVar2 = lhuVar.d;
                                                if (lhvVar2 == null) {
                                                    lhvVar2 = lhv.a;
                                                }
                                                boolG = g(dDoubleValue2, lhvVar2);
                                                if (boolG != null) {
                                                    if (boolG.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                lboVar.aT().f.c("No number filter for double param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                            }
                                        } else if (obj instanceof String) {
                                            i = lhuVar.b;
                                            if ((i & 1) != 0) {
                                                String str8 = (String) obj;
                                                lhxVar = lhuVar.c;
                                                if (lhxVar == null) {
                                                    lhxVar = lhx.a;
                                                }
                                                boolI = f(str8, lhxVar, lboVar.aT());
                                            } else if ((i & 2) != 0) {
                                                str2 = (String) obj;
                                                if (lfx.F(str2)) {
                                                    lhvVar3 = lhuVar.d;
                                                    if (lhvVar3 == null) {
                                                        lhvVar3 = lhv.a;
                                                    }
                                                    boolI = i(str2, lhvVar3);
                                                } else {
                                                    lboVar.aT().f.c("Invalid param value for number filter. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                }
                                            } else {
                                                lboVar.aT().f.c("No filter for String param. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                            }
                                            if (boolI == null) {
                                                if (boolI.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            if (obj == null) {
                                                lboVar.aT().k.c("Missing param for filter. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            lboVar.aT().f.c("Unknown param type. event, param", lboVar.I().c(str4), lboVar.I().d(str));
                                        }
                                    }
                                }
                            } else {
                                lipVar = (lip) it2.next();
                                if (!hashSet.contains(lipVar.c)) {
                                    i2 = lipVar.b;
                                    i3 = i2 & 4;
                                    if (i3 != 0) {
                                        String str9 = lipVar.c;
                                        if (i3 != 0) {
                                            lValueOf = Long.valueOf(lipVar.e);
                                        } else {
                                            lValueOf = null;
                                        }
                                        afvVar.put(str9, lValueOf);
                                    } else {
                                        i4 = i2 & 16;
                                        if (i4 != 0) {
                                            String str10 = lipVar.c;
                                            if (i4 != 0) {
                                                dValueOf = Double.valueOf(lipVar.g);
                                            } else {
                                                dValueOf = null;
                                            }
                                            afvVar.put(str10, dValueOf);
                                        } else if ((i2 & 2) != 0) {
                                            afvVar.put(lipVar.c, lipVar.d);
                                        } else {
                                            lboVar.aT().f.c("Unknown value for param. event, param", lboVar.I().c(str4), lboVar.I().d(lipVar.c));
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        lhuVar2 = (lhu) it.next();
                        if (lhuVar2.f.isEmpty()) {
                            lboVar.aT().f.b("null or empty param name in filter. event", lboVar.I().c(str4));
                        } else {
                            hashSet.add(lhuVar2.f);
                        }
                    }
                    bool = null;
                    break;
                }
            }
            lboVar.aT().k.b("Event filter result", bool != null ? bool : "null");
            if (bool != null) {
                Boolean bool2 = Boolean.TRUE;
                this.d = bool2;
                if (!bool.booleanValue()) {
                    return true;
                }
                this.e = bool2;
                if (!z3 || (linVar.b & 2) == 0) {
                    return true;
                }
                Long lValueOf2 = Long.valueOf(linVar.e);
                if (lhtVar.h) {
                    if (zF && (lhtVar.b & 8) != 0) {
                        lValueOf2 = l;
                    }
                    this.g = lValueOf2;
                    return true;
                }
                if (zF && (lhtVar.b & 8) != 0) {
                    lValueOf2 = l2;
                }
                this.f = lValueOf2;
                return true;
            }
        }
        return false;
    }
}
