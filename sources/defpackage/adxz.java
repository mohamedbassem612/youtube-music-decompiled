package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.stream.IntStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adxz implements adxv, advw {
    public static final atxp a;
    public final advq b;
    public final avmb c;
    public Map d;
    public Map e;
    public Map f;
    public String g;
    public final qa h;
    private final vxz i;

    static {
        aihf aihfVarCreateBuilder = atxp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxp) aihfVarCreateBuilder.instance).b = 0;
        a = (atxp) aihfVarCreateBuilder.build();
    }

    public adxz(avmb avmbVar, vxz vxzVar, advq advqVar, adxd adxdVar) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = null;
        adxx adxxVar = new adxx(this);
        this.h = adxxVar;
        this.b = advqVar;
        this.c = avmbVar;
        this.i = vxzVar;
        View viewA = advqVar.A();
        if (viewA instanceof RecyclerView) {
            ((RecyclerView) viewA).aC(adxxVar);
        }
        if (adxdVar instanceof adxy) {
            adxy adxyVar = (adxy) adxdVar;
            this.d = new HashMap(adxyVar.a);
            this.e = new HashMap(adxyVar.b);
            this.f = new HashMap(adxyVar.c);
        }
    }

    public static void f(Object obj) {
        if (obj instanceof acxm) {
            ((acxm) obj).d();
        } else if (obj instanceof adai) {
            ((adai) obj).d();
        }
    }

    private final atxp g(ambj ambjVar) {
        int i;
        int i2;
        int i3;
        String str;
        int iV = afyd.v(ambjVar.b);
        if (iV == 0) {
            throw null;
        }
        int i4 = iV - 1;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 != 1) {
                aihf aihfVarCreateBuilder = atxp.a.createBuilder();
                int iV2 = afyd.v(ambjVar.b);
                if (iV2 == 1) {
                    str = "INSERT_BY_RELATIVE_POSITION_IN_SECTION_LIST";
                } else if (iV2 != 2) {
                    str = iV2 != 3 ? "null" : "INSERTION_NOT_SET";
                } else {
                    str = "INSERT_BY_POSITION_IN_SECTION_LIST";
                }
                aihfVarCreateBuilder.copyOnWrite();
                ((atxp) aihfVarCreateBuilder.instance).c = "InsertSectionOperation. Unsupported insertion case: ".concat(str);
                aihfVarCreateBuilder.copyOnWrite();
                ((atxp) aihfVarCreateBuilder.instance).b = 3;
                return (atxp) aihfVarCreateBuilder.build();
            }
            if (ambjVar.d.isEmpty()) {
                return a;
            }
            ambd ambdVar = ambjVar.b == 3 ? (ambd) ambjVar.c : ambd.a;
            int iAS = a.aS(ambdVar.c);
            if (iAS == 0) {
                iAS = 1;
            }
            int i6 = iAS - 1;
            if (i6 == 1) {
                boolean zL = this.i.l(72, 45751189L, false);
                advq advqVar = this.b;
                if (zL) {
                    agke agkeVarJ = advqVar.J();
                    if (agkeVarJ.isEmpty() || (i3 = advqVar.F().i(((advc) agkeVarJ.get(0)).a())) == -1) {
                        i3 = 0;
                    }
                    Iterator it = ambjVar.d.iterator();
                    while (it.hasNext()) {
                        advqVar.U((apox) it.next(), i5, i3);
                        i5++;
                        i3++;
                    }
                } else {
                    advqVar.T((apox) ambjVar.d.get(0), 0);
                }
                return a;
            }
            if (i6 != 2) {
                aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                int iAS2 = a.aS(ambdVar.c);
                i2 = iAS2 != 0 ? iAS2 : 1;
                StringBuilder sb = new StringBuilder("InsertSectionOperation. Unsupported fixed insertion position: ");
                sb.append(i2 - 1);
                String string = sb.toString();
                aihfVarCreateBuilder2.copyOnWrite();
                ((atxp) aihfVarCreateBuilder2.instance).c = string;
                aihfVarCreateBuilder2.copyOnWrite();
                ((atxp) aihfVarCreateBuilder2.instance).b = 3;
                return (atxp) aihfVarCreateBuilder2.build();
            }
            boolean zL2 = this.i.l(72, 45751189L, false);
            advq advqVar2 = this.b;
            if (zL2) {
                int iG = advqVar2.F().g();
                int size = advqVar2.J().size();
                Iterator it2 = ambjVar.d.iterator();
                while (it2.hasNext()) {
                    advqVar2.U((apox) it2.next(), size, iG);
                    size++;
                    iG++;
                }
            } else {
                advqVar2.T((apox) ambjVar.d.get(0), advqVar2.J().size());
            }
            return a;
        }
        if (ambjVar.d.isEmpty()) {
            return a;
        }
        ambf ambfVar = ambjVar.b == 2 ? (ambf) ambjVar.c : ambf.a;
        if ((ambfVar.b & 1) == 0) {
            aihf aihfVarCreateBuilder3 = atxp.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ((atxp) aihfVarCreateBuilder3.instance).c = "InsertSectionOperation. InsertByRelativePositionInSectionList.section_target_id is empty.";
            aihfVarCreateBuilder3.copyOnWrite();
            ((atxp) aihfVarCreateBuilder3.instance).b = 3;
            return (atxp) aihfVarCreateBuilder3.build();
        }
        String str2 = ambfVar.c;
        advq advqVar3 = this.b;
        OptionalInt optionalIntH = h(str2, advqVar3);
        String str3 = ambfVar.c;
        agke agkeVarJ2 = advqVar3.J();
        int size2 = agkeVarJ2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                i = -1;
                break;
            }
            advc advcVar = (advc) agkeVarJ2.get(i7);
            if ((advcVar instanceof advp) && str3.equals(((advp) advcVar).q())) {
                i = advqVar3.F().i(advcVar.a());
                break;
            }
            i7++;
        }
        if (optionalIntH.isEmpty() || i == -1) {
            aihf aihfVarCreateBuilder4 = atxp.a.createBuilder();
            String strValueOf = String.valueOf(ambfVar.c);
            aihfVarCreateBuilder4.copyOnWrite();
            ((atxp) aihfVarCreateBuilder4.instance).c = "InsertSectionOperation. Cound not find section with target id: ".concat(strValueOf);
            aihfVarCreateBuilder4.copyOnWrite();
            ((atxp) aihfVarCreateBuilder4.instance).b = 5;
            return (atxp) aihfVarCreateBuilder4.build();
        }
        int iAS3 = a.aS(ambfVar.d);
        if (iAS3 == 0) {
            iAS3 = 1;
        }
        int i8 = iAS3 - 1;
        if (i8 == 1) {
            if (this.i.l(72, 45751189L, false)) {
                int asInt = optionalIntH.getAsInt();
                Iterator it3 = ambjVar.d.iterator();
                while (it3.hasNext()) {
                    advqVar3.U((apox) it3.next(), asInt, i);
                    asInt++;
                    i++;
                }
            } else {
                advqVar3.U((apox) ambjVar.d.get(0), optionalIntH.getAsInt(), i);
            }
            return a;
        }
        if (i8 == 2) {
            int i9 = i + 1;
            if (this.i.l(72, 45751189L, false)) {
                int asInt2 = optionalIntH.getAsInt() + 1;
                Iterator it4 = ambjVar.d.iterator();
                while (it4.hasNext()) {
                    advqVar3.U((apox) it4.next(), asInt2, i9);
                    asInt2++;
                    i9++;
                }
            } else {
                advqVar3.U((apox) ambjVar.d.get(0), optionalIntH.getAsInt() + 1, i9);
            }
            return a;
        }
        aihf aihfVarCreateBuilder5 = atxp.a.createBuilder();
        int iAS4 = a.aS(ambfVar.d);
        i2 = iAS4 != 0 ? iAS4 : 1;
        StringBuilder sb2 = new StringBuilder("InsertSectionOperation. Unsupported relative position: ");
        sb2.append(i2 - 1);
        String string2 = sb2.toString();
        aihfVarCreateBuilder5.copyOnWrite();
        ((atxp) aihfVarCreateBuilder5.instance).c = string2;
        aihfVarCreateBuilder5.copyOnWrite();
        ((atxp) aihfVarCreateBuilder5.instance).b = 3;
        return (atxp) aihfVarCreateBuilder5.build();
    }

    private static final OptionalInt h(String str, advq advqVar) {
        agke agkeVarJ = advqVar.J();
        return IntStream.CC.range(0, agkeVarJ.size()).filter(new aagx(agkeVarJ, 2)).filter(new abft(str, agkeVarJ, 2)).findFirst();
    }

    private static final Optional i(Object obj) {
        if (obj instanceof acxm) {
            akro akroVar = ((acxm) obj).a.c;
            if (akroVar == null) {
                akroVar = akro.a;
            }
            if ((akroVar.b & 16777216) != 0) {
                return Optional.of(akroVar.i);
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.adxv
    public final void a(final apok apokVar, final adxu adxuVar) {
        this.c.e(new Runnable() { // from class: adxw
            /* JADX WARN: Code duplicated, block: B:15:0x0029  */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                String str;
                int iB;
                apok apokVar2 = apokVar;
                adxz adxzVar = this.a;
                atxp atxpVarC = adxzVar.c(apokVar2.c);
                int i = atxpVarC.b;
                adxu adxuVar2 = adxuVar;
                if (i != 0) {
                    adxuVar2.b(atxpVarC);
                    return;
                }
                apou apouVar = apokVar2.d;
                if (apouVar == null) {
                    apouVar = apou.a;
                }
                if ((apouVar.b & 1) == 0) {
                    z = true;
                } else {
                    apms apmsVar = apouVar.e;
                    if (apmsVar == null) {
                        apmsVar = apms.a;
                    }
                    if (apmsVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                atxp atxpVar = adxz.a;
                int i2 = apouVar.c;
                int i3 = 4;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i3 = 1;
                    } else if (i2 != 2) {
                        i3 = i2 != 4 ? 0 : 3;
                    } else {
                        i3 = 2;
                    }
                }
                if (i3 == 0) {
                    throw null;
                }
                int i4 = i3 - 1;
                if (i4 == 0) {
                    apoh apohVar = (i2 == 1 ? (apov) apouVar.d : apov.a).c;
                    if (apohVar == null) {
                        apohVar = apoh.a;
                    }
                    int i5 = apohVar.b;
                    if (i5 == 1) {
                        String str2 = i5 == 1 ? (String) apohVar.c : "";
                        adxzVar.g = str2;
                        int iB2 = adxzVar.b(str2);
                        if (iB2 < 0) {
                            aihf aihfVarCreateBuilder = atxp.a.createBuilder();
                            String strValueOf = String.valueOf(str2);
                            aihfVarCreateBuilder.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder.instance).c = "SectionListScrollToItem. Could not find item with target id: ".concat(strValueOf);
                            aihfVarCreateBuilder.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder.instance).b = 5;
                            atxpVar = (atxp) aihfVarCreateBuilder.build();
                        } else if (z) {
                            adxzVar.b.ar(iB2);
                        } else {
                            adxzVar.b.V(iB2);
                        }
                    } else {
                        aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder2.instance).c = "SectionListScrollToItem. TargetId is empty.";
                        aihfVarCreateBuilder2.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder2.instance).b = 3;
                        atxpVar = (atxp) aihfVarCreateBuilder2.build();
                    }
                } else if (i4 == 1) {
                    apow apowVar = i2 == 2 ? (apow) apouVar.d : apow.a;
                    adxzVar.g = null;
                    int iAS = a.aS(apowVar.c);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i6 = iAS - 1;
                    if (i6 != 0 && i6 != 1) {
                        advq advqVar = adxzVar.b;
                        int iA = advqVar.G().a() - 1;
                        if (iA < 0) {
                            aihf aihfVarCreateBuilder3 = atxp.a.createBuilder();
                            aihfVarCreateBuilder3.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder3.instance).c = "SectionListScrollToPosition. Could not find last item position in section list.";
                            aihfVarCreateBuilder3.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder3.instance).b = 5;
                            atxpVar = (atxp) aihfVarCreateBuilder3.build();
                        } else if (z) {
                            advqVar.ar(iA);
                        } else {
                            advqVar.V(iA);
                        }
                    } else if (z) {
                        adxzVar.b.ar(0);
                    } else {
                        adxzVar.b.V(0);
                    }
                } else if (i4 == 2 && (str = adxzVar.g) != null && (iB = adxzVar.b(str)) >= 0) {
                    adxzVar.b.V(iB);
                }
                if (atxpVar.b != 0) {
                    adxuVar2.b(atxpVar);
                } else {
                    adxuVar2.a();
                }
            }
        });
    }

    public final int b(String str) {
        int i;
        if (!ahno.aa(str)) {
            advq advqVar = this.b;
            agke agkeVarJ = advqVar.J();
            int size = agkeVarJ.size();
            int i2 = 0;
            while (i2 < size) {
                adkz adkzVarA = ((advc) agkeVarJ.get(i2)).a();
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 < adkzVarA.a()) {
                        Optional optionalI = i(adkzVarA.d(i3));
                        if (optionalI.isPresent() && str.equals(optionalI.get())) {
                            return advqVar.F().l(adkzVarA) + i3;
                        }
                        i3++;
                    }
                }
                i2 = i;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x0315  */
    /* JADX WARN: Code duplicated, block: B:116:0x033f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0354  */
    /* JADX WARN: Code duplicated, block: B:122:0x0361 A[LOOP:9: B:117:0x034e->B:122:0x0361, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0370  */
    /* JADX WARN: Code duplicated, block: B:126:0x037f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0382  */
    /* JADX WARN: Code duplicated, block: B:128:0x0385  */
    /* JADX WARN: Code duplicated, block: B:129:0x0388  */
    /* JADX WARN: Code duplicated, block: B:130:0x038b  */
    /* JADX WARN: Code duplicated, block: B:131:0x038e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0391  */
    /* JADX WARN: Code duplicated, block: B:133:0x0394  */
    /* JADX WARN: Code duplicated, block: B:134:0x0397  */
    /* JADX WARN: Code duplicated, block: B:269:0x0676  */
    /* JADX WARN: Code duplicated, block: B:272:0x068b  */
    /* JADX WARN: Code duplicated, block: B:345:0x07f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x082c A[LOOP:15: B:338:0x07c9->B:347:0x082c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x0994 A[LOOP:0: B:3:0x000e->B:385:0x0994, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:395:0x099d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x068e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x07f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0196  */
    /* JADX WARN: Type inference failed for: r6v81, types: [adkz, adlr] */
    public final atxp c(List list) {
        atxp atxpVar;
        Iterator it;
        atxp atxpVar2;
        amgj amgjVar;
        String str;
        atxp atxpVar3;
        Iterator it2;
        boolean z;
        Iterator it3;
        Collection collection;
        String str2;
        Map map;
        adkz adkzVarA;
        adlr adlrVar;
        Object key;
        Object value;
        int i;
        agke agkeVarG;
        Object obj;
        advq advqVar = this.b;
        advqVar.aj();
        atxp atxpVar4 = a;
        Iterator it4 = list.iterator();
        atxp atxpVarG = atxpVar4;
        while (it4.hasNext()) {
            apoj apojVar = (apoj) it4.next();
            int i2 = apojVar.b;
            int iBf = acfz.bf(i2);
            if (iBf == 0) {
                throw null;
            }
            int i3 = 4;
            int i4 = 0;
            switch (iBf - 1) {
                case 0:
                    atxpVar = atxpVar4;
                    it = it4;
                    ambh ambhVar = i2 == 1 ? (ambh) apojVar.c : ambh.a;
                    int i5 = ambhVar.b;
                    if (i5 != 0) {
                        if (i5 == 2) {
                            i3 = 1;
                        } else if (i5 != 3) {
                            i3 = i5 != 4 ? 0 : 3;
                        } else {
                            i3 = 2;
                        }
                    }
                    int i6 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        ambe ambeVar = i5 == 2 ? (ambe) ambhVar.c : ambe.a;
                        aiie aiieVar = ambhVar.d;
                        String str3 = ambeVar.b;
                        Optional optionalE = e(str3);
                        if (optionalE.isEmpty()) {
                            aihf aihfVarCreateBuilder = atxp.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder.instance).b = 5;
                            String strValueOf = String.valueOf(str3);
                            aihfVarCreateBuilder.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder.instance).c = "InsertByPositionInSection. Controller not found for sectionTargetId: ".concat(strValueOf);
                            atxpVar2 = (atxp) aihfVarCreateBuilder.build();
                            atxpVarG = atxpVar2;
                        } else {
                            int iAS = a.aS(ambeVar.c);
                            if (iAS == 0 || iAS != 2) {
                                advj advjVar = (advj) optionalE.get();
                                advjVar.G(advjVar.l.c(aiieVar));
                            } else {
                                ((advj) optionalE.get()).P(aiieVar, 0);
                            }
                            atxpVarG = atxpVar;
                        }
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            aiie aiieVar2 = ambhVar.d;
                            int iM = advqVar.m();
                            if (iM == -1) {
                                aihf aihfVarCreateBuilder2 = atxp.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder2.instance).c = "InsertItemSectionContent: Unable to find last visible item position.";
                                aihfVarCreateBuilder2.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder2.instance).b = 5;
                                atxpVar2 = (atxp) aihfVarCreateBuilder2.build();
                                atxpVarG = atxpVar2;
                            } else {
                                agke agkeVarJ = advqVar.J();
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < agkeVarJ.size()) {
                                        advc advcVar = (advc) agkeVarJ.get(i8);
                                        int iA = advcVar.a().a();
                                        if (advcVar instanceof advj) {
                                            advj advjVar2 = (advj) advcVar;
                                            if (i7 + iA > iM) {
                                                advjVar2.P(aiieVar2, Math.max(iM - i7, -1) + 1);
                                            } else if (i7 > iM) {
                                                aihf aihfVarCreateBuilder3 = apox.a.createBuilder();
                                                aihh aihhVar = (aihh) amgg.a.createBuilder();
                                                aihhVar.i(aiieVar2);
                                                aihfVarCreateBuilder3.copyOnWrite();
                                                apox apoxVar = (apox) aihfVarCreateBuilder3.instance;
                                                amgg amggVar = (amgg) aihhVar.build();
                                                amggVar.getClass();
                                                apoxVar.m = amggVar;
                                                apoxVar.b |= 32;
                                                advqVar.T((apox) aihfVarCreateBuilder3.build(), i8);
                                            } else {
                                                i7 += iA;
                                                i8++;
                                            }
                                        } else if (i7 > iM) {
                                            aihf aihfVarCreateBuilder4 = apox.a.createBuilder();
                                            aihh aihhVar2 = (aihh) amgg.a.createBuilder();
                                            aihhVar2.i(aiieVar2);
                                            aihfVarCreateBuilder4.copyOnWrite();
                                            apox apoxVar2 = (apox) aihfVarCreateBuilder4.instance;
                                            amgg amggVar2 = (amgg) aihhVar2.build();
                                            amggVar2.getClass();
                                            apoxVar2.m = amggVar2;
                                            apoxVar2.b |= 32;
                                            advqVar.T((apox) aihfVarCreateBuilder4.build(), i8);
                                        } else {
                                            i7 += iA;
                                            i8++;
                                        }
                                    } else {
                                        aihf aihfVarCreateBuilder5 = apox.a.createBuilder();
                                        aihh aihhVar3 = (aihh) amgg.a.createBuilder();
                                        aihhVar3.i(aiieVar2);
                                        aihfVarCreateBuilder5.copyOnWrite();
                                        apox apoxVar3 = (apox) aihfVarCreateBuilder5.instance;
                                        amgg amggVar3 = (amgg) aihhVar3.build();
                                        amggVar3.getClass();
                                        apoxVar3.m = amggVar3;
                                        apoxVar3.b |= 32;
                                        advqVar.T((apox) aihfVarCreateBuilder5.build(), agkeVarJ.size());
                                    }
                                }
                            }
                        }
                        atxpVarG = atxpVar;
                    } else {
                        ambg ambgVar = i5 == 3 ? (ambg) ambhVar.c : ambg.a;
                        aiie aiieVar3 = ambhVar.d;
                        String str4 = ambgVar.b;
                        Optional optionalE2 = e(str4);
                        if (optionalE2.isEmpty()) {
                            aihf aihfVarCreateBuilder6 = atxp.a.createBuilder();
                            aihfVarCreateBuilder6.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder6.instance).b = 5;
                            String strValueOf2 = String.valueOf(str4);
                            aihfVarCreateBuilder6.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder6.instance).c = "InsertByRelativePositionInSection. Controller not found for sectionTargetId: ".concat(strValueOf2);
                            atxpVar2 = (atxp) aihfVarCreateBuilder6.build();
                        } else {
                            String str5 = ambgVar.c;
                            adkz adkzVarA2 = ((advj) optionalE2.get()).a();
                            int i9 = 0;
                            while (true) {
                                if (i9 < adkzVarA2.a()) {
                                    Optional optionalI = i(adkzVarA2.d(i9));
                                    if (optionalI.isPresent() && ((String) optionalI.get()).equals(str5)) {
                                        int iAS2 = a.aS(ambgVar.d);
                                        if (iAS2 == 0 || iAS2 != 2) {
                                            ((advj) optionalE2.get()).P(aiieVar3, i9 + 1);
                                        } else {
                                            ((advj) optionalE2.get()).P(aiieVar3, i9);
                                        }
                                        atxpVarG = atxpVar;
                                    } else {
                                        i9++;
                                    }
                                } else {
                                    aihf aihfVarCreateBuilder7 = atxp.a.createBuilder();
                                    aihfVarCreateBuilder7.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder7.instance).b = 5;
                                    String strValueOf3 = String.valueOf(str5);
                                    aihfVarCreateBuilder7.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder7.instance).c = "InsertByRelativePositionInSection. Pivot item not found for itemTargetId: ".concat(strValueOf3);
                                    atxpVar2 = (atxp) aihfVarCreateBuilder7.build();
                                }
                            }
                        }
                        atxpVarG = atxpVar2;
                    }
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 1:
                    apjd apjdVar = i2 == 2 ? (apjd) apojVar.c : apjd.a;
                    int i10 = apjdVar.b;
                    int iBi = acfz.bi(i10);
                    int i11 = iBi - 1;
                    if (iBi == 0) {
                        throw null;
                    }
                    if (i11 == 0) {
                        atxpVar = atxpVar4;
                        it = it4;
                        agke agkeVarJ2 = advqVar.J();
                        HashSet hashSet = new HashSet((apjdVar.b == 1 ? (apja) apjdVar.c : apja.a).c);
                        int size = agkeVarJ2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                if (!(apjdVar.b == 1 ? (apja) apjdVar.c : apja.a).d) {
                                    aihf aihfVarCreateBuilder8 = atxp.a.createBuilder();
                                    String strS = a.S(hashSet);
                                    aihfVarCreateBuilder8.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder8.instance).c = "RemoveItemOperation. Target IDs not found: ".concat(strS);
                                    aihfVarCreateBuilder8.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder8.instance).b = 5;
                                    atxpVar2 = (atxp) aihfVarCreateBuilder8.build();
                                    atxpVarG = atxpVar2;
                                }
                                if (atxpVarG.b == 0) {
                                    advqVar.Q();
                                    return atxpVarG;
                                }
                                atxpVar4 = atxpVar;
                                it4 = it;
                            } else {
                                adkz adkzVarA3 = ((advc) agkeVarJ2.get(i12)).a();
                                if (adkzVarA3 instanceof adlr) {
                                    adlr adlrVar2 = (adlr) adkzVarA3;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < adlrVar2.a()) {
                                            Optional optionalI2 = i(adlrVar2.d(i13));
                                            if (optionalI2.isPresent() && hashSet.contains(optionalI2.get())) {
                                                adlrVar2.remove(i13);
                                                i13--;
                                                hashSet.remove(optionalI2.get());
                                                if (!hashSet.isEmpty()) {
                                                }
                                            }
                                            i13++;
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i12++;
                            }
                            break;
                        }
                    } else if (i11 != 1) {
                        atxpVar = atxpVar4;
                        it = it4;
                    } else {
                        apiz apizVar = i10 == 3 ? (apiz) apjdVar.c : apiz.a;
                        if (apizVar.c.isEmpty()) {
                            atxpVar = atxpVar4;
                            it = it4;
                        } else {
                            HashSet hashSet2 = new HashSet(apizVar.c);
                            int i14 = apizVar.b;
                            String str6 = (i14 & 1) != 0 ? apizVar.d : null;
                            if ((i14 & 2) != 0) {
                                str = apizVar.e;
                                Map map2 = this.f;
                                aihf aihfVarCreateBuilder9 = apoj.a.createBuilder();
                                aihfVarCreateBuilder9.copyOnWrite();
                                apoj apojVar2 = (apoj) aihfVarCreateBuilder9.instance;
                                apjdVar.getClass();
                                apojVar2.c = apjdVar;
                                apojVar2.b = 2;
                                map2.put(str, (apoj) aihfVarCreateBuilder9.build());
                                aihf aihfVarCreateBuilder10 = amgj.a.createBuilder();
                                akrn akrnVar = akrn.a;
                                aihfVarCreateBuilder10.copyOnWrite();
                                amgj amgjVar2 = (amgj) aihfVarCreateBuilder10.instance;
                                akrnVar.getClass();
                                amgjVar2.dP = akrnVar;
                                amgjVar2.i |= SemanticState.LiveRegion;
                                amgjVar = (amgj) aihfVarCreateBuilder10.build();
                            } else {
                                amgjVar = null;
                                str = null;
                            }
                            agke agkeVarJ3 = advqVar.J();
                            HashMap map3 = str != null ? new HashMap() : null;
                            int size2 = agkeVarJ3.size() - 1;
                            boolean z2 = false;
                            while (!z2 && size2 >= 0) {
                                advc advcVar2 = (advc) agkeVarJ3.get(size2);
                                adkz adkzVarA4 = advcVar2.a();
                                if (adkzVarA4 instanceof adlr) {
                                    adlr adlrVar3 = (adlr) adkzVarA4;
                                    HashMap map4 = str != null ? new HashMap() : null;
                                    int iA2 = adlrVar3.a() - 1;
                                    while (true) {
                                        if (iA2 >= 0) {
                                            Object objD = adlrVar3.d(iA2);
                                            Optional optionalI3 = i(objD);
                                            if (str6 == null || !optionalI3.isPresent()) {
                                                atxpVar3 = atxpVar4;
                                            } else {
                                                atxpVar3 = atxpVar4;
                                                z = ((String) optionalI3.get()).equals(str6);
                                            }
                                            if (objD instanceof acxm) {
                                                akro akroVar = ((acxm) objD).a.c;
                                                if (akroVar == null) {
                                                    akroVar = akro.a;
                                                }
                                                it3 = it4;
                                                aqjn aqjnVar = akroVar.l;
                                                if (aqjnVar == null) {
                                                    aqjnVar = aqjn.a;
                                                }
                                                if (aqjnVar.d.size() > 0) {
                                                    aqjn aqjnVar2 = akroVar.l;
                                                    if (aqjnVar2 == null) {
                                                        aqjnVar2 = aqjn.a;
                                                    }
                                                    collection = aqjnVar2.d;
                                                }
                                                if (Collections.disjoint(collection, hashSet2)) {
                                                    if (amgjVar != null || str == null) {
                                                        adlrVar3.remove(iA2);
                                                    } else {
                                                        amgj amgjVar3 = (amgj) amgjVar.toBuilder().build();
                                                        adlrVar3.hM(iA2, amgjVar3);
                                                        map4.put(objD, amgjVar3);
                                                    }
                                                }
                                                iA2--;
                                                atxpVar4 = atxpVar3;
                                                it4 = it3;
                                            } else {
                                                it3 = it4;
                                            }
                                            collection = agpi.a;
                                            if (Collections.disjoint(collection, hashSet2)) {
                                                if (amgjVar != null) {
                                                    adlrVar3.remove(iA2);
                                                } else {
                                                    adlrVar3.remove(iA2);
                                                }
                                            }
                                            iA2--;
                                            atxpVar4 = atxpVar3;
                                            it4 = it3;
                                        } else {
                                            atxpVar3 = atxpVar4;
                                        }
                                    }
                                    it2 = it4;
                                    if (map3 != null && !map4.isEmpty()) {
                                        map3.put(advcVar2, map4);
                                    }
                                    z2 = z;
                                } else {
                                    atxpVar3 = atxpVar4;
                                    it2 = it4;
                                    z2 = false;
                                }
                                size2--;
                                atxpVar4 = atxpVar3;
                                it4 = it2;
                            }
                            atxpVar = atxpVar4;
                            it = it4;
                            if (str != null && !map3.isEmpty()) {
                                this.d.put(str, map3);
                            }
                        }
                    }
                    atxpVarG = atxpVar;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 2:
                    atxpVarG = g(i2 == 6 ? (ambj) apojVar.c : ambj.a);
                    atxpVar = atxpVar4;
                    it = it4;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 3:
                    apjw apjwVar = i2 == 3 ? (apjw) apojVar.c : apjw.a;
                    int i15 = apjwVar.b;
                    if (i15 == 0) {
                        i4 = 3;
                    } else if (i15 == 1) {
                        i4 = 1;
                    } else if (i15 == 2) {
                        i4 = 2;
                    }
                    int i16 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (i16 == 2) {
                                aihf aihfVarCreateBuilder11 = atxp.a.createBuilder();
                                aihfVarCreateBuilder11.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder11.instance).b = 3;
                                aihfVarCreateBuilder11.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder11.instance).c = "Replace case not set";
                                atxpVarG = (atxp) aihfVarCreateBuilder11.build();
                            }
                            atxpVar = atxpVar4;
                            it = it4;
                            atxpVarG = atxpVar;
                            if (atxpVarG.b == 0) {
                                atxpVar4 = atxpVar;
                                it4 = it;
                                break;
                            }
                        } else {
                            apjv apjvVar = i15 == 2 ? (apjv) apjwVar.c : apjv.a;
                            String str7 = apjvVar.c;
                            if (str7.isEmpty()) {
                                aihf aihfVarCreateBuilder12 = atxp.a.createBuilder();
                                aihfVarCreateBuilder12.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder12.instance).b = 3;
                                aihfVarCreateBuilder12.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder12.instance).c = "ReplaceSectionOperation. Target section ID is empty";
                                atxpVarG = (atxp) aihfVarCreateBuilder12.build();
                            } else if ((apjvVar.b & 2) != 0) {
                                OptionalInt optionalIntH = h(str7, advqVar);
                                if (optionalIntH.isEmpty()) {
                                    aihf aihfVarCreateBuilder13 = atxp.a.createBuilder();
                                    String strValueOf4 = String.valueOf(str7);
                                    aihfVarCreateBuilder13.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder13.instance).c = "ReplaceSectionOperation. Target section ID not found: ".concat(strValueOf4);
                                    aihfVarCreateBuilder13.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder13.instance).b = 5;
                                    atxpVarG = (atxp) aihfVarCreateBuilder13.build();
                                } else {
                                    int asInt = optionalIntH.getAsInt();
                                    apox apoxVar4 = apjvVar.d;
                                    if (apoxVar4 == null) {
                                        apoxVar4 = apox.a;
                                    }
                                    advqVar.ae(asInt, apoxVar4);
                                    atxpVar = atxpVar4;
                                    it = it4;
                                    atxpVarG = atxpVar;
                                    if (atxpVarG.b == 0) {
                                        atxpVar4 = atxpVar;
                                        it4 = it;
                                        break;
                                    }
                                }
                            } else {
                                aihf aihfVarCreateBuilder14 = atxp.a.createBuilder();
                                aihfVarCreateBuilder14.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder14.instance).b = 3;
                                aihfVarCreateBuilder14.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder14.instance).c = "ReplaceSectionOperation. New content is missing";
                                atxpVarG = (atxp) aihfVarCreateBuilder14.build();
                            }
                        }
                        advqVar.Q();
                        return atxpVarG;
                    }
                    aihf aihfVarCreateBuilder15 = atxp.a.createBuilder();
                    aihfVarCreateBuilder15.copyOnWrite();
                    ((atxp) aihfVarCreateBuilder15.instance).b = 12;
                    aihfVarCreateBuilder15.copyOnWrite();
                    ((atxp) aihfVarCreateBuilder15.instance).c = "ReplaceByGroupId is not implemented";
                    atxpVarG = (atxp) aihfVarCreateBuilder15.build();
                    atxpVar = atxpVar4;
                    it = it4;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 4:
                    apjf apjfVar = i2 == 4 ? (apjf) apojVar.c : apjf.a;
                    if (apjfVar.b != 1) {
                        agke agkeVarJ4 = advqVar.J();
                        HashSet hashSet3 = new HashSet((apjfVar.b == 2 ? (apja) apjfVar.c : apja.a).c);
                        if (!hashSet3.isEmpty()) {
                            int size3 = agkeVarJ4.size() - 1;
                            while (true) {
                                if (size3 >= 0) {
                                    Object obj2 = agkeVarJ4.get(size3);
                                    String strQ = obj2 instanceof advp ? ((advp) obj2).q() : null;
                                    if (strQ != null && hashSet3.remove(strQ)) {
                                        advqVar.ac(size3);
                                        if (!hashSet3.isEmpty()) {
                                        }
                                    }
                                    size3--;
                                } else if (!(apjfVar.b == 2 ? (apja) apjfVar.c : apja.a).d) {
                                    aihf aihfVarCreateBuilder16 = atxp.a.createBuilder();
                                    String strS2 = a.S(hashSet3);
                                    aihfVarCreateBuilder16.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder16.instance).c = "RemoveSectionOperation. Target IDs not found: ".concat(strS2);
                                    aihfVarCreateBuilder16.copyOnWrite();
                                    ((atxp) aihfVarCreateBuilder16.instance).b = 5;
                                    atxpVarG = (atxp) aihfVarCreateBuilder16.build();
                                    atxpVar = atxpVar4;
                                    it = it4;
                                    if (atxpVarG.b == 0) {
                                        advqVar.Q();
                                        return atxpVarG;
                                    }
                                    atxpVar4 = atxpVar;
                                    it4 = it;
                                }
                            }
                        }
                    }
                    atxpVar = atxpVar4;
                    it = it4;
                    atxpVarG = atxpVar;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 5:
                    String str8 = (i2 == 5 ? (aqrs) apojVar.c : aqrs.a).b;
                    if (this.f.containsKey(str8)) {
                        apoj apojVar3 = (apoj) this.f.get(str8);
                        int i17 = apojVar3.b;
                        if (acfz.bf(i17) == 2) {
                            if (acfz.bi((i17 == 2 ? (apjd) apojVar3.c : apjd.a).b) == 2) {
                                Map map5 = (Map) this.d.get(str8);
                                if (map5 != null && !map5.isEmpty()) {
                                    for (Map.Entry entry : map5.entrySet()) {
                                        adkz adkzVarA5 = ((advc) entry.getKey()).a();
                                        if (adkzVarA5 instanceof adlr) {
                                            adlr adlrVar4 = (adlr) adkzVarA5;
                                            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                                                Object key2 = entry2.getKey();
                                                amgj amgjVar4 = (amgj) entry2.getValue();
                                                for (int i18 = 0; i18 < adlrVar4.a(); i18++) {
                                                    if (adlrVar4.d(i18) == amgjVar4) {
                                                        adlrVar4.hM(i18, key2);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    this.d.remove(str8);
                                    this.f.remove(str8);
                                }
                            } else if (acfz.bf(apojVar3.b) == 7) {
                                map = (Map) this.e.get(str8);
                                if (map != null) {
                                    for (Map.Entry entry3 : map.entrySet()) {
                                        adkzVarA = ((advc) entry3.getKey()).a();
                                        if (adkzVarA instanceof adlr) {
                                            adlrVar = (adlr) adkzVarA;
                                            for (Map.Entry entry4 : ((Map) entry3.getValue()).entrySet()) {
                                                key = entry4.getKey();
                                                value = entry4.getValue();
                                                for (i = 0; i < adlrVar.a(); i++) {
                                                    if (adlrVar.d(i) == value) {
                                                        adlrVar.hM(i, key);
                                                        f(value);
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    this.e.remove(str8);
                                    this.f.remove(str8);
                                }
                            } else {
                                aihf aihfVarCreateBuilder17 = atxp.a.createBuilder();
                                switch (acfz.bf(apojVar3.b)) {
                                    case 1:
                                        str2 = "INSERT_ITEM_SECTION_CONTENT";
                                        break;
                                    case 2:
                                        str2 = "REMOVE_ITEM";
                                        break;
                                    case 3:
                                        str2 = "INSERT_SECTION";
                                        break;
                                    case 4:
                                        str2 = "REPLACE_SECTION";
                                        break;
                                    case 5:
                                        str2 = "REMOVE_SECTION";
                                        break;
                                    case 6:
                                        str2 = "UNDO";
                                        break;
                                    case 7:
                                        str2 = "REPLACE_ITEM_SECTION_CONTENT";
                                        break;
                                    case 8:
                                        str2 = "OPERATION_NOT_SET";
                                        break;
                                    default:
                                        str2 = "null";
                                        break;
                                }
                                aihfVarCreateBuilder17.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder17.instance).c = "UndoOperation. Unsupported undo operation: ".concat(str2);
                                aihfVarCreateBuilder17.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder17.instance).b = 3;
                                atxpVarG = (atxp) aihfVarCreateBuilder17.build();
                            }
                        } else if (acfz.bf(apojVar3.b) == 7) {
                            map = (Map) this.e.get(str8);
                            if (map != null && !map.isEmpty()) {
                                while (r5.hasNext()) {
                                    adkzVarA = ((advc) entry3.getKey()).a();
                                    if (adkzVarA instanceof adlr) {
                                        adlrVar = (adlr) adkzVarA;
                                        while (r6.hasNext()) {
                                            key = entry4.getKey();
                                            value = entry4.getValue();
                                            while (i < adlrVar.a()) {
                                                if (adlrVar.d(i) == value) {
                                                    adlrVar.hM(i, key);
                                                    f(value);
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                this.e.remove(str8);
                                this.f.remove(str8);
                            }
                        } else {
                            aihf aihfVarCreateBuilder18 = atxp.a.createBuilder();
                            switch (acfz.bf(apojVar3.b)) {
                                case 1:
                                    str2 = "INSERT_ITEM_SECTION_CONTENT";
                                    break;
                                case 2:
                                    str2 = "REMOVE_ITEM";
                                    break;
                                case 3:
                                    str2 = "INSERT_SECTION";
                                    break;
                                case 4:
                                    str2 = "REPLACE_SECTION";
                                    break;
                                case 5:
                                    str2 = "REMOVE_SECTION";
                                    break;
                                case 6:
                                    str2 = "UNDO";
                                    break;
                                case 7:
                                    str2 = "REPLACE_ITEM_SECTION_CONTENT";
                                    break;
                                case 8:
                                    str2 = "OPERATION_NOT_SET";
                                    break;
                                default:
                                    str2 = "null";
                                    break;
                            }
                            aihfVarCreateBuilder18.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder18.instance).c = "UndoOperation. Unsupported undo operation: ".concat(str2);
                            aihfVarCreateBuilder18.copyOnWrite();
                            ((atxp) aihfVarCreateBuilder18.instance).b = 3;
                            atxpVarG = (atxp) aihfVarCreateBuilder18.build();
                        }
                        atxpVar = atxpVar4;
                        it = it4;
                        atxpVarG = atxpVar;
                        if (atxpVarG.b == 0) {
                            advqVar.Q();
                            return atxpVarG;
                        }
                        atxpVar4 = atxpVar;
                        it4 = it;
                    } else {
                        aihf aihfVarCreateBuilder19 = atxp.a.createBuilder();
                        String strValueOf5 = String.valueOf(str8);
                        aihfVarCreateBuilder19.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder19.instance).c = "UndoOperation. Invalid undo key: ".concat(strValueOf5);
                        aihfVarCreateBuilder19.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder19.instance).b = 3;
                        atxpVarG = (atxp) aihfVarCreateBuilder19.build();
                    }
                    atxpVar = atxpVar4;
                    it = it4;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                case 6:
                    apjt apjtVar = i2 == 7 ? (apjt) apojVar.c : apjt.a;
                    if ((apjtVar.b & 1) == 0 || apjtVar.c.isEmpty()) {
                        aihf aihfVarCreateBuilder20 = atxp.a.createBuilder();
                        aihfVarCreateBuilder20.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder20.instance).b = 3;
                        aihfVarCreateBuilder20.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder20.instance).c = "ReplaceItemSectionContentOperation. Target ID is empty.";
                        atxpVarG = (atxp) aihfVarCreateBuilder20.build();
                    } else if ((apjtVar.b & 2) != 0) {
                        String str9 = apjtVar.c;
                        amgj amgjVar5 = apjtVar.d;
                        if (amgjVar5 == null) {
                            amgjVar5 = amgj.a;
                        }
                        int i19 = apjtVar.b;
                        String str10 = (i19 & 8) != 0 ? apjtVar.f : null;
                        if ((i19 & 4) == 0 || apjtVar.e.isEmpty()) {
                            agjz agjzVar = new agjz(4);
                            agke agkeVarJ5 = advqVar.J();
                            int size4 = agkeVarJ5.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                advc advcVar3 = (advc) agkeVarJ5.get(i20);
                                if (advcVar3 instanceof advj) {
                                    agjzVar.h((advj) advcVar3);
                                }
                            }
                            agkeVarG = agjzVar.g();
                        } else {
                            String str11 = apjtVar.e;
                            Optional optionalE3 = e(str11);
                            if (optionalE3.isEmpty()) {
                                aihf aihfVarCreateBuilder21 = atxp.a.createBuilder();
                                aihfVarCreateBuilder21.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder21.instance).b = 5;
                                String strValueOf6 = String.valueOf(str11);
                                aihfVarCreateBuilder21.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder21.instance).c = "ReplaceItemSectionContentOperation. Controller not found for sectionTargetId: ".concat(strValueOf6);
                                atxpVarG = (atxp) aihfVarCreateBuilder21.build();
                            } else {
                                agkeVarG = agke.q((advj) optionalE3.get());
                            }
                        }
                        int i21 = 0;
                        while (true) {
                            if (i21 < ((agpi) agkeVarG).d) {
                                advj advjVar3 = (advj) agkeVarG.get(i21);
                                adkz adkzVarA6 = advjVar3.a();
                                int i22 = 0;
                                while (true) {
                                    int i23 = i21 + 1;
                                    if (i22 < adkzVarA6.a()) {
                                        Object objD2 = adkzVarA6.d(i22);
                                        Optional optionalI4 = i(objD2);
                                        if (optionalI4.isPresent() && ((String) optionalI4.get()).equals(str9)) {
                                            List listC = advjVar3.l.c(Collections.singletonList(amgjVar5));
                                            if (listC.isEmpty()) {
                                                obj = null;
                                            } else {
                                                Object obj3 = listC.get(0);
                                                ?? A = advjVar3.a();
                                                if (A instanceof adlr) {
                                                    A.hM(i22, obj3);
                                                    obj = obj3;
                                                } else {
                                                    obj = null;
                                                }
                                            }
                                            if (obj != null) {
                                                if (str10 != null) {
                                                    Map map6 = this.f;
                                                    aihf aihfVarCreateBuilder22 = apoj.a.createBuilder();
                                                    aihfVarCreateBuilder22.copyOnWrite();
                                                    apoj apojVar4 = (apoj) aihfVarCreateBuilder22.instance;
                                                    apjtVar.getClass();
                                                    apojVar4.c = apjtVar;
                                                    apojVar4.b = 7;
                                                    map6.put(str10, (apoj) aihfVarCreateBuilder22.build());
                                                    ((Map) j$.util.Map.EL.computeIfAbsent((Map) j$.util.Map.EL.computeIfAbsent(this.e, str10, new accu(20)), advjVar3, new aegf(1))).put(objD2, obj);
                                                } else {
                                                    f(objD2);
                                                }
                                                atxpVar = atxpVar4;
                                                it = it4;
                                                atxpVarG = atxpVar;
                                                if (atxpVarG.b == 0) {
                                                    advqVar.Q();
                                                    return atxpVarG;
                                                }
                                                atxpVar4 = atxpVar;
                                                it4 = it;
                                            } else {
                                                aihf aihfVarCreateBuilder23 = atxp.a.createBuilder();
                                                aihfVarCreateBuilder23.copyOnWrite();
                                                ((atxp) aihfVarCreateBuilder23.instance).b = 13;
                                                aihfVarCreateBuilder23.copyOnWrite();
                                                ((atxp) aihfVarCreateBuilder23.instance).c = "ReplaceItemSectionContentOperation. Failed to transform replacement content.";
                                                atxpVarG = (atxp) aihfVarCreateBuilder23.build();
                                            }
                                        } else {
                                            i22++;
                                        }
                                    } else {
                                        i21 = i23;
                                    }
                                }
                            } else {
                                aihf aihfVarCreateBuilder24 = atxp.a.createBuilder();
                                aihfVarCreateBuilder24.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder24.instance).b = 5;
                                String strValueOf7 = String.valueOf(str9);
                                aihfVarCreateBuilder24.copyOnWrite();
                                ((atxp) aihfVarCreateBuilder24.instance).c = "ReplaceItemSectionContentOperation. Item not found for targetId: ".concat(strValueOf7);
                                atxpVarG = (atxp) aihfVarCreateBuilder24.build();
                            }
                        }
                    } else {
                        aihf aihfVarCreateBuilder25 = atxp.a.createBuilder();
                        aihfVarCreateBuilder25.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder25.instance).b = 3;
                        aihfVarCreateBuilder25.copyOnWrite();
                        ((atxp) aihfVarCreateBuilder25.instance).c = "ReplaceItemSectionContentOperation. Replacement content is missing.";
                        atxpVarG = (atxp) aihfVarCreateBuilder25.build();
                    }
                    atxpVar = atxpVar4;
                    it = it4;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
                default:
                    atxpVar = atxpVar4;
                    it = it4;
                    if (atxpVarG.b == 0) {
                        advqVar.Q();
                        return atxpVarG;
                    }
                    atxpVar4 = atxpVar;
                    it4 = it;
                    break;
                    break;
            }
        }
        advqVar.Q();
        return atxpVarG;
    }

    public final Optional e(String str) {
        return j$.util.Collection.EL.stream(this.b.J()).filter(new acwb(5)).map(new accu(19)).filter(new aciy(str, 12)).findFirst();
    }

    @Override // defpackage.advw
    public final adxd hq() {
        return new adxy(agkj.h(this.d), agkj.h(this.e), agkj.h(this.f));
    }

    public adxz(avmb avmbVar, vxz vxzVar, advq advqVar) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = null;
        adxx adxxVar = new adxx(this);
        this.h = adxxVar;
        this.b = advqVar;
        this.c = avmbVar;
        this.i = vxzVar;
        View viewA = advqVar.A();
        if (viewA instanceof RecyclerView) {
            ((RecyclerView) viewA).aC(adxxVar);
        }
    }
}
