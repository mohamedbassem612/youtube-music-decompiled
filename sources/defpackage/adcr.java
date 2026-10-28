package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adcr extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    awmd a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsr c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    assm q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    axlj r;

    public adcr() {
        super("Suspense");
    }

    public static void aE(fhd fhdVar, adcw adcwVar, String str, aigj aigjVar) {
        if (fhdVar.c != null) {
            fhdVar.z(new aero(0, new Object[]{adcwVar, str, aigjVar}), "updateState:Suspense.updateCurrentElement");
        }
    }

    private static final adcq aF(fhd fhdVar) {
        return (adcq) fhdVar.i().c;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        String strN;
        adel adelVarM;
        boolean z;
        aqhl aqhlVarAs;
        aqhl aqhlVar;
        String str;
        aigj aigjVarAJ;
        agkj agkjVarAt;
        awmd awmdVar;
        aigj aigjVar;
        String str2;
        assm assmVar;
        axlj axljVar;
        HashMap map;
        adcw adcwVar;
        aigj aigjVar2;
        agqs agqsVarListIterator;
        aijp aijpVar;
        int i;
        aqhp aqhpVar;
        aqhp aqhpVar2;
        aijp aijpVar2;
        aqhl aqhlVar2;
        aqhp aqhpVar3;
        adcq adcqVarAF = aF(fhdVar);
        assm assmVar2 = this.q;
        nsl nslVar = this.b;
        mlf mlfVar = (mlf) fhdVar.k(mlf.class);
        axlj axljVar2 = this.r;
        boolean z2 = this.e;
        boolean z3 = this.d;
        boolean z4 = this.f;
        nuc nucVar = this.g;
        awmd awmdVar2 = this.a;
        boolean zV = acfz.V(assmVar2);
        aijp aijpVar3 = null;
        avmm avmmVar = null;
        if (!zV) {
            aqhl aqhlVar3 = assmVar2.c;
            if (aqhlVar3 == null) {
                aqhlVar3 = aqhl.a;
            }
            if ((aqhlVar3.b & 8) != 0) {
                strN = aecm.N(assmVar2, zV);
                adelVarM = aecm.M(strN, mlfVar);
                if (zV) {
                    aqhlVarAs = acfz.as(strN, assmVar2, adelVarM, axljVar2, z2, z3);
                    z = z2;
                } else {
                    z = z2;
                    aqhlVarAs = assmVar2.c;
                    if (aqhlVarAs == null) {
                        aqhlVarAs = aqhl.a;
                    }
                }
                if (aqhlVarAs == null) {
                    if (zV) {
                        str = aqhlVarAs.e;
                    } else {
                        aqhlVar = assmVar2.c;
                        if (aqhlVar == null) {
                            aqhlVar = aqhl.a;
                        }
                        str = aqhlVar.h;
                    }
                    aigjVarAJ = aecm.aJ(aqhlVarAs, axljVar2, adelVarM, z4);
                    if (aigjVarAJ == null) {
                        nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "Invalid Suspense parameters (dataKey or dataEntries).", new Object[0]);
                        axljVar2.x(str);
                    } else {
                        if (!zV) {
                            if (adelVarM != null) {
                                aqhlVar2 = assmVar2.c;
                                if (aqhlVar2 == null) {
                                    aqhlVar2 = aqhl.a;
                                }
                                aqhpVar3 = aqhlVar2.l;
                                if (aqhpVar3 == null) {
                                    aqhpVar3 = aqhp.a;
                                }
                                aijpVar3 = aqhpVar3.d;
                                if (aijpVar3 == null) {
                                    aijpVar3 = aijp.a;
                                }
                            } else {
                                aqhlVar2 = assmVar2.c;
                                if (aqhlVar2 == null) {
                                    aqhlVar2 = aqhl.a;
                                }
                                aqhpVar3 = aqhlVar2.l;
                                if (aqhpVar3 == null) {
                                    aqhpVar3 = aqhp.a;
                                }
                                aijpVar3 = aqhpVar3.d;
                                if (aijpVar3 == null) {
                                    aijpVar3 = aijp.a;
                                }
                            }
                        }
                        avmm avmmVar2 = new avmm();
                        if (zV) {
                            agkjVarAt = acfz.at(assmVar2, adelVarM, axljVar2, z3);
                        } else {
                            agkjVarAt = agpn.b;
                        }
                        if (zV) {
                            agke agkeVarN = agke.n(agkjVarAt.values());
                            agkeVarN.getClass();
                            awmdVar = awmdVar2;
                            map = new HashMap();
                            aigjVar = aigjVarAJ;
                            agqsVarListIterator = agkeVarN.listIterator(0);
                            agqsVarListIterator.getClass();
                            while (agqsVarListIterator.hasNext()) {
                                E next = agqsVarListIterator.next();
                                next.getClass();
                                for (aqhs aqhsVar : ((aqhl) next).g) {
                                    agqsVarListIterator = agqsVarListIterator;
                                    strN = strN;
                                    i = aqhsVar.c;
                                    assmVar2 = assmVar2;
                                    if (i != 2) {
                                        if (i == 2) {
                                            aqhpVar = (aqhp) aqhsVar.d;
                                        } else {
                                            aqhpVar = aqhp.a;
                                        }
                                        String str3 = aqhpVar.c;
                                        axlj axljVar3 = axljVar2;
                                        if (aqhsVar.c == 2) {
                                            aqhpVar2 = (aqhp) aqhsVar.d;
                                        } else {
                                            aqhpVar2 = aqhp.a;
                                        }
                                        aijpVar2 = aqhpVar2.d;
                                        if (aijpVar2 == null) {
                                            aijpVar2 = aijp.a;
                                        }
                                        map.put(str3, aijpVar2);
                                        axljVar2 = axljVar3;
                                    }
                                }
                            }
                            str2 = strN;
                            assmVar = assmVar2;
                            axljVar = axljVar2;
                            if (adelVarM != null) {
                                for (adej adejVar : adelVarM.j) {
                                    String str4 = adejVar.c;
                                    aijpVar = adejVar.d;
                                    if (aijpVar == null) {
                                        aijpVar = aijp.a;
                                    }
                                    map.put(str4, aijpVar);
                                }
                            }
                        } else {
                            awmdVar = awmdVar2;
                            aigjVar = aigjVarAJ;
                            str2 = strN;
                            assmVar = assmVar2;
                            axljVar = axljVar2;
                            map = new HashMap();
                        }
                        agkj agkjVar = agkjVarAt;
                        assm assmVar3 = assmVar;
                        axlj axljVar4 = axljVar;
                        adcwVar = new adcw(fhdVar, assmVar3, axljVar4, nucVar, awmdVar, nslVar, str2, str, zV, agkjVar, map, aijpVar3, z, z4);
                        avmmVar = avmmVar2;
                        aigjVar2 = aigjVar;
                    }
                    adcqVarAF.a = avmmVar;
                    adcqVarAF.b = aigjVar2;
                    adcqVarAF.c = adcwVar;
                }
                nucVar.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "SuspenseType missing active config.", new Object[0]);
            } else {
                nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "SuspenseType missing componentKey.", new Object[0]);
            }
        } else if (acfz.W(assmVar2)) {
            strN = aecm.N(assmVar2, zV);
            adelVarM = aecm.M(strN, mlfVar);
            if (zV) {
                aqhlVarAs = acfz.as(strN, assmVar2, adelVarM, axljVar2, z2, z3);
                z = z2;
            } else {
                z = z2;
                aqhlVarAs = assmVar2.c;
                if (aqhlVarAs == null) {
                    aqhlVarAs = aqhl.a;
                }
            }
            if (aqhlVarAs == null) {
                if (zV) {
                    str = aqhlVarAs.e;
                } else {
                    aqhlVar = assmVar2.c;
                    if (aqhlVar == null) {
                        aqhlVar = aqhl.a;
                    }
                    str = aqhlVar.h;
                }
                aigjVarAJ = aecm.aJ(aqhlVarAs, axljVar2, adelVarM, z4);
                if (aigjVarAJ == null) {
                    nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "Invalid Suspense parameters (dataKey or dataEntries).", new Object[0]);
                    axljVar2.x(str);
                } else {
                    if (!zV) {
                        if (adelVarM != null || (adelVarM.c & 4) == 0) {
                            aqhlVar2 = assmVar2.c;
                            if (aqhlVar2 == null) {
                                aqhlVar2 = aqhl.a;
                            }
                            aqhpVar3 = aqhlVar2.l;
                            if (aqhpVar3 == null) {
                                aqhpVar3 = aqhp.a;
                            }
                            aijpVar3 = aqhpVar3.d;
                            if (aijpVar3 == null) {
                                aijpVar3 = aijp.a;
                            }
                        } else {
                            aijpVar3 = adelVarM.g;
                            if (aijpVar3 == null) {
                                aijpVar3 = aijp.a;
                            }
                        }
                    }
                    avmm avmmVar3 = new avmm();
                    if (zV) {
                        agkjVarAt = acfz.at(assmVar2, adelVarM, axljVar2, z3);
                    } else {
                        agkjVarAt = agpn.b;
                    }
                    if (zV) {
                        agke agkeVarN2 = agke.n(agkjVarAt.values());
                        agkeVarN2.getClass();
                        awmdVar = awmdVar2;
                        map = new HashMap();
                        aigjVar = aigjVarAJ;
                        agqsVarListIterator = agkeVarN2.listIterator(0);
                        agqsVarListIterator.getClass();
                        while (agqsVarListIterator.hasNext()) {
                            E next2 = agqsVarListIterator.next();
                            next2.getClass();
                            while (r14.hasNext()) {
                                agqsVarListIterator = agqsVarListIterator;
                                strN = strN;
                                i = aqhsVar.c;
                                assmVar2 = assmVar2;
                                if (i != 2) {
                                    if (i == 2) {
                                        aqhpVar = (aqhp) aqhsVar.d;
                                    } else {
                                        aqhpVar = aqhp.a;
                                    }
                                    String str5 = aqhpVar.c;
                                    axlj axljVar5 = axljVar2;
                                    if (aqhsVar.c == 2) {
                                        aqhpVar2 = (aqhp) aqhsVar.d;
                                    } else {
                                        aqhpVar2 = aqhp.a;
                                    }
                                    aijpVar2 = aqhpVar2.d;
                                    if (aijpVar2 == null) {
                                        aijpVar2 = aijp.a;
                                    }
                                    map.put(str5, aijpVar2);
                                    axljVar2 = axljVar5;
                                }
                            }
                        }
                        str2 = strN;
                        assmVar = assmVar2;
                        axljVar = axljVar2;
                        if (adelVarM != null && adelVarM.j.size() > 0) {
                            while (r1.hasNext()) {
                                String str6 = adejVar.c;
                                aijpVar = adejVar.d;
                                if (aijpVar == null) {
                                    aijpVar = aijp.a;
                                }
                                map.put(str6, aijpVar);
                            }
                        }
                    } else {
                        awmdVar = awmdVar2;
                        aigjVar = aigjVarAJ;
                        str2 = strN;
                        assmVar = assmVar2;
                        axljVar = axljVar2;
                        map = new HashMap();
                    }
                    agkj agkjVar2 = agkjVarAt;
                    assm assmVar4 = assmVar;
                    axlj axljVar6 = axljVar;
                    adcwVar = new adcw(fhdVar, assmVar4, axljVar6, nucVar, awmdVar, nslVar, str2, str, zV, agkjVar2, map, aijpVar3, z, z4);
                    avmmVar = avmmVar3;
                    aigjVar2 = aigjVar;
                }
                adcqVarAF.a = avmmVar;
                adcqVarAF.b = aigjVar2;
                adcqVarAF.c = adcwVar;
            }
            nucVar.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "SuspenseType missing active config.", new Object[0]);
        } else {
            nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "SuspenseType missing config keys for multi-config.", new Object[0]);
        }
        aigjVar2 = null;
        adcwVar = null;
        adcqVarAF.a = avmmVar;
        adcqVarAF.b = aigjVar2;
        adcqVarAF.c = adcwVar;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0165  */
    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        aqhl aqhlVarAs;
        String str;
        int i;
        Object adrtVar;
        Object obj;
        int i2;
        int i3;
        adcq adcqVarAF = aF(fhdVar);
        assm assmVar = this.q;
        mlf mlfVar = (mlf) fhdVar.k(mlf.class);
        axlj axljVar = this.r;
        nsr nsrVar = this.c;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.f;
        avmm avmmVar = adcqVarAF.a;
        aigj aigjVar = adcqVarAF.b;
        adcw adcwVar = adcqVarAF.c;
        boolean z4 = adcwVar != null && adcwVar.g;
        if (aecm.O(assmVar, z4)) {
            adcwVar.a = fhdVar;
            String strN = aecm.N(assmVar, z4);
            adel adelVarM = aecm.M(strN, mlfVar);
            if (z4) {
                aqhlVarAs = acfz.as(strN, assmVar, adelVarM, axljVar, z, z2);
            } else {
                aqhlVarAs = assmVar.c;
                if (aqhlVarAs == null) {
                    aqhlVarAs = aqhl.a;
                }
            }
            if (aqhlVarAs != null) {
                if (z4) {
                    str = aqhlVarAs.e;
                } else {
                    aqhl aqhlVar = assmVar.c;
                    if (aqhlVar == null) {
                        aqhlVar = aqhl.a;
                    }
                    str = aqhlVar.h;
                }
                adcwVar.h(strN, str);
                byte[] bArr = null;
                if (z4) {
                    i = 0;
                    Iterable$EL.forEach(adcwVar.h.values(), new aalb(adcwVar, adcwVar.c(), 4, bArr));
                } else {
                    i = 0;
                }
                int i4 = ((adelVarM == null || (adelVarM.c & 8) == 0) && acfz.U(aqhlVarAs)) ? 1 : i;
                aigj aigjVarAJ = aecm.aJ(aqhlVarAs, axljVar, adelVarM, z3);
                if (!Objects.equals(aigjVar, aigjVarAJ)) {
                    aE(fhdVar, adcwVar, axljVar.w(str), aigjVarAJ);
                } else if (z4) {
                    efi efiVar = new efi(adcwVar, str, 11);
                    axljVar.getClass();
                    String str2 = (aqhlVarAs.b & 8) != 0 ? aqhlVarAs.h : aqhlVarAs.e;
                    str2.getClass();
                    if (aqhlVarAs.c != 5) {
                        adrtVar = adru.a;
                    } else if (aqhlVarAs.g.isEmpty()) {
                        adrtVar = new adrt(null);
                    } else {
                        aiie aiieVar = aqhlVarAs.g;
                        aiieVar.getClass();
                        Iterator<E> it = aiieVar.iterator();
                        int i5 = i;
                        Object obj2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (i5 != 0) {
                                    obj = obj2;
                                    break;
                                }
                                break;
                            } else {
                                Object next = it.next();
                                if (((aqhs) next).c == 1) {
                                    if (i5 == 0) {
                                        obj2 = next;
                                        i5 = 1;
                                    }
                                }
                            }
                            obj = null;
                            break;
                        }
                        aqhs aqhsVar = (aqhs) obj;
                        if (aqhsVar == null) {
                            adrtVar = adru.a;
                        } else {
                            int iAS = a.aS((aqhsVar.c == 1 ? (aoij) aqhsVar.d : aoij.a).c);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            int i6 = iAS - 1;
                            if (i6 == 0 || i6 == 2) {
                                i4 = 1;
                            }
                            int i7 = aqhsVar.f;
                            aqhr aqhrVarA = aqhr.a(i7);
                            if (aqhrVarA == null) {
                                aqhrVarA = aqhr.FETCH_BEHAVIOR_UNSPECIFIED;
                            }
                            if (aqhrVarA != aqhr.FETCH_BEHAVIOR_FORCE_FETCH) {
                                aqhr[] aqhrVarArr = new aqhr[2];
                                aqhr aqhrVar = aqhr.FETCH_BEHAVIOR_UNSPECIFIED;
                                aqhrVarArr[i] = aqhrVar;
                                i2 = 1;
                                aqhrVarArr[1] = aqhr.FETCH_BEHAVIOR_ONLY_IF_NEEDED;
                                aqhr aqhrVarA2 = aqhr.a(i7);
                                if (aqhrVarA2 != null) {
                                    aqhrVar = aqhrVarA2;
                                }
                                if (!atqq.aU(aqhrVarArr, aqhrVar) || axljVar.u(str2, "suspense_content_data_key") != null) {
                                    i3 = i;
                                }
                                if (i4 != 0 || i3 == 0) {
                                    adrtVar = adru.a;
                                } else {
                                    adrtVar = new adrt(aqhsVar);
                                }
                            } else {
                                i2 = 1;
                            }
                            i3 = i2;
                            if (i4 != 0) {
                                adrtVar = adru.a;
                            } else {
                                adrtVar = adru.a;
                            }
                        }
                    }
                    Objects.checkIndex(i, 3);
                    if (!(adrtVar instanceof adru)) {
                        if (!(adrtVar instanceof adrt)) {
                            throw new awmj();
                        }
                        aqhs aqhsVar2 = ((adrt) adrtVar).a;
                        if (aqhsVar2 != null) {
                            acfz.aq(axljVar, aqhlVarAs, aqhsVar2);
                        }
                        efiVar.invoke();
                    }
                } else if (Objects.equals(axljVar.w(str), "suspense_placeholder_data_key")) {
                    adcwVar.d(str, null);
                }
                if (adcwVar != null) {
                    if (z3) {
                        adcwVar.k();
                        adcwVar.i(adelVarM, avmmVar, nsrVar);
                    } else {
                        adcwVar.i(adelVarM, avmmVar, nsrVar);
                        adcwVar.k();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        String strC;
        boolean z;
        avmm avmmVar;
        adcq adcqVarAF = aF(fhdVar);
        assm assmVar = this.q;
        mlf mlfVar = (mlf) fhdVar.k(mlf.class);
        axlj axljVar = this.r;
        boolean z2 = this.e;
        avmm avmmVar2 = adcqVarAF.a;
        adcw adcwVar = adcqVarAF.c;
        boolean zV = acfz.V(assmVar);
        if (aecm.O(assmVar, zV)) {
            String strN = aecm.N(assmVar, zV);
            if (!zV) {
                strC = strN;
            } else if (z2) {
                strC = axljVar.v(strN);
                if (strC == null) {
                    strC = strN;
                }
            } else if (adcwVar == null || adcwVar.c() == null) {
                strC = strN;
            } else {
                strC = adcwVar.c();
            }
            if (mlfVar != null) {
                aihf aihfVarCreateBuilder = adel.a.createBuilder();
                if (strC != null) {
                    String strW = axljVar.w(strC);
                    if (strW != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        adel adelVar = (adel) aihfVarCreateBuilder.instance;
                        adelVar.c |= 1;
                        adelVar.d = strW;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    adel adelVar2 = (adel) aihfVarCreateBuilder.instance;
                    adelVar2.c |= 8;
                    adelVar2.h = strC;
                    agke agkeVarR = axljVar.r(strC);
                    int size = agkeVarR.size();
                    int i = 0;
                    while (i < size) {
                        String str = (String) agkeVarR.get(i);
                        aigj aigjVar = (aigj) axljVar.u(strC, str);
                        if (aigjVar != null) {
                            aihf aihfVarCreateBuilder2 = adek.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            adek adekVar = (adek) aihfVarCreateBuilder2.instance;
                            str.getClass();
                            adekVar.b |= 1;
                            adekVar.c = str;
                            aihfVarCreateBuilder2.copyOnWrite();
                            adek adekVar2 = (adek) aihfVarCreateBuilder2.instance;
                            adekVar2.b |= 2;
                            adekVar2.d = aigjVar;
                            aihfVarCreateBuilder.copyOnWrite();
                            adel adelVar3 = (adel) aihfVarCreateBuilder.instance;
                            adek adekVar3 = (adek) aihfVarCreateBuilder2.build();
                            adekVar3.getClass();
                            aiie aiieVar = adelVar3.e;
                            if (!aiieVar.c()) {
                                adelVar3.e = aihn.mutableCopy(aiieVar);
                            }
                            adelVar3.e.add(adekVar3);
                        }
                        i++;
                        z2 = z2;
                        avmmVar2 = avmmVar2;
                    }
                    z = z2;
                    avmmVar = avmmVar2;
                    aqhn aqhnVarT = axljVar.t(strC);
                    if (aqhnVarT != null) {
                        if (zV) {
                            aihfVarCreateBuilder.copyOnWrite();
                            adel adelVar4 = (adel) aihfVarCreateBuilder.instance;
                            adelVar4.f = aqhnVarT;
                            adelVar4.c |= 2;
                        } else {
                            aqhl aqhlVar = assmVar.c;
                            if (aqhlVar == null) {
                                aqhlVar = aqhl.a;
                            }
                            if (!aqhnVarT.equals(aqhlVar.c == 5 ? (aqhn) aqhlVar.d : aqhn.a)) {
                                aihfVarCreateBuilder.copyOnWrite();
                                adel adelVar5 = (adel) aihfVarCreateBuilder.instance;
                                adelVar5.f = aqhnVarT;
                                adelVar5.c |= 2;
                            }
                        }
                    }
                } else {
                    z = z2;
                    avmmVar = avmmVar2;
                }
                aijp aijpVarB = adcwVar != null ? adcwVar.b() : null;
                if (!zV && aijpVarB != null) {
                    aqhl aqhlVar2 = assmVar.c;
                    if (aqhlVar2 == null) {
                        aqhlVar2 = aqhl.a;
                    }
                    aqhp aqhpVar = aqhlVar2.l;
                    if (aqhpVar == null) {
                        aqhpVar = aqhp.a;
                    }
                    aijp aijpVar = aqhpVar.d;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    aijp aijpVar2 = aikz.a;
                    if (aiky.a(aijpVarB, aijpVar) != 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        adel adelVar6 = (adel) aihfVarCreateBuilder.instance;
                        adelVar6.g = aijpVarB;
                        adelVar6.c |= 4;
                    } else if (zV) {
                        adcwVar.n(aihfVarCreateBuilder);
                    }
                } else if (zV && adcwVar != null) {
                    adcwVar.n(aihfVarCreateBuilder);
                }
                aihh aihhVar = (aihh) mqt.a.createBuilder();
                aihhVar.e(adel.b, (adel) aihfVarCreateBuilder.build());
                mlfVar.e(strN, (mqt) aihhVar.build());
            } else {
                z = z2;
                avmmVar = avmmVar2;
            }
            if (adcwVar != null) {
                if (z) {
                    adcwVar.f(strN);
                } else {
                    adcwVar.e();
                }
            } else if (zV) {
                for (aqhl aqhlVar3 : assmVar.d) {
                    if (z) {
                        String str2 = aqhlVar3.e;
                        axljVar.b.remove(str2);
                        axljVar.a.remove(str2);
                        axljVar.c.remove(strN);
                    } else {
                        axljVar.x(aqhlVar3.e);
                    }
                }
            } else {
                axljVar.x(strN);
            }
            avmmVar.b();
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        adcq adcqVar = (adcq) fkyVar;
        adcq adcqVar2 = (adcq) fkyVar2;
        adcqVar2.a = adcqVar.a;
        adcqVar2.b = adcqVar.b;
        adcqVar2.c = adcqVar.c;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        adcq adcqVarAF = aF(fhdVar);
        nsl nslVar = this.b;
        ntr ntrVar = (ntr) fhdVar.k(ntr.class);
        nth nthVar = (nth) fhdVar.k(nth.class);
        avmm avmmVar = (avmm) fhdVar.k(avmm.class);
        aigj aigjVar = adcqVarAF.b;
        if (aigjVar == null) {
            aigjVar = aigj.d;
        }
        return ntrVar.b(fhdVar, nslVar, aigjVar.G(), nthVar, avmmVar);
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (adcr) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new adcq();
    }
}
