package defpackage;

import app.rive.semantics.SemanticState;
import com.google.net.util.proto2api.Status$StatusProto;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mhb extends nud {
    private final agfr a;

    public mhb(String str, agfr agfrVar) {
        super(str);
        this.a = agfrVar;
    }

    public static mhb a(Status$StatusProto status$StatusProto) throws Throwable {
        Throwable mgzVar;
        String str = status$StatusProto.e;
        aiov aiovVar = status$StatusProto.g;
        if (aiovVar == null) {
            aiovVar = aiov.a;
        }
        aihl aihlVar = asjd.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        aiovVar.c(aihlVarCheckIsLite);
        Object objK = aiovVar.j.k(aihlVarCheckIsLite.d);
        asjd asjdVar = (asjd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        mha mhaVar = new mha();
        mgy mgyVar = new mgy(str, mhaVar);
        aihf builder = status$StatusProto.toBuilder();
        aiov aiovVar2 = status$StatusProto.g;
        if (aiovVar2 == null) {
            aiovVar2 = aiov.a;
        }
        aihh aihhVar = (aihh) aiovVar2.toBuilder();
        aihf builder2 = asjdVar.toBuilder();
        aihf aihfVarCreateBuilder = asjc.a.createBuilder();
        asiz asizVar = asiz.a;
        aihf aihfVarCreateBuilder2 = asizVar.createBuilder();
        int i = 1;
        aihf aihfVarB = aext.b(mgyVar, true);
        aihfVarCreateBuilder2.copyOnWrite();
        asiz asizVar2 = (asiz) aihfVarCreateBuilder2.instance;
        ahag ahagVar = (ahag) aihfVarB.build();
        ahagVar.getClass();
        asizVar2.c = ahagVar;
        asizVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        asjc asjcVar = (asjc) aihfVarCreateBuilder.instance;
        asiz asizVar3 = (asiz) aihfVarCreateBuilder2.build();
        asizVar3.getClass();
        asjcVar.c = asizVar3;
        asjcVar.b = 2;
        builder2.copyOnWrite();
        asjd asjdVar2 = (asjd) builder2.instance;
        asjc asjcVar2 = (asjc) aihfVarCreateBuilder.build();
        asjcVar2.getClass();
        asjdVar2.a();
        asjdVar2.c.add(asjcVar2);
        aihhVar.e(aihlVar, (asjd) builder2.build());
        builder.copyOnWrite();
        Status$StatusProto status$StatusProto2 = (Status$StatusProto) builder.instance;
        aiov aiovVar3 = (aiov) aihhVar.build();
        aiovVar3.getClass();
        status$StatusProto2.g = aiovVar3;
        status$StatusProto2.b |= 16;
        mhaVar.a = (Status$StatusProto) builder.build();
        aihf builder3 = asjdVar.toBuilder();
        ArrayList arrayList = new ArrayList();
        int size = asjdVar.c.size();
        while (true) {
            size--;
            Throwable th = null;
            if (size >= 0) {
                asjc asjcVar3 = (asjc) asjdVar.c.get(size);
                int i2 = asjcVar3.b;
                int iC = atqn.C(i2);
                int i3 = iC - 1;
                if (iC == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    asja asjaVar = i2 == 1 ? (asja) asjcVar3.c : asja.a;
                    aihf builder4 = asjcVar3.toBuilder();
                    aihf builder5 = asjaVar.toBuilder();
                    String strC = c(asjaVar.d, arrayList);
                    builder5.copyOnWrite();
                    asja asjaVar2 = (asja) builder5.instance;
                    strC.getClass();
                    asjaVar2.b |= 2;
                    asjaVar2.d = strC;
                    builder4.copyOnWrite();
                    asjc asjcVar4 = (asjc) builder4.instance;
                    asja asjaVar3 = (asja) builder5.build();
                    asjaVar3.getClass();
                    asjcVar4.c = asjaVar3;
                    asjcVar4.b = 1;
                    builder3.cy(size, builder4);
                    arrayList.add(asjaVar.d);
                } else if (i3 == 1) {
                    asiz asizVar4 = i2 == 2 ? (asiz) asjcVar3.c : asizVar;
                    ahag ahagVar2 = asizVar4.c;
                    if (ahagVar2 == null) {
                        ahagVar2 = ahag.a;
                    }
                    ahad ahadVar = ahagVar2.e;
                    if (ahadVar == null) {
                        ahadVar = ahad.a;
                    }
                    aihf builder6 = ahadVar.toBuilder();
                    ahag ahagVar3 = asizVar4.c;
                    if (ahagVar3 == null) {
                        ahagVar3 = ahag.a;
                    }
                    ahad ahadVar2 = ahagVar3.e;
                    if (ahadVar2 == null) {
                        ahadVar2 = ahad.a;
                    }
                    String strC2 = c(ahadVar2.d, arrayList);
                    builder6.copyOnWrite();
                    ahad ahadVar3 = (ahad) builder6.instance;
                    strC2.getClass();
                    ahadVar3.b |= 2;
                    ahadVar3.d = strC2;
                    aihf builder7 = asjcVar3.toBuilder();
                    aihf builder8 = (asjcVar3.b == 2 ? (asiz) asjcVar3.c : asizVar).toBuilder();
                    ahag ahagVar4 = (asjcVar3.b == 2 ? (asiz) asjcVar3.c : asizVar).c;
                    if (ahagVar4 == null) {
                        ahagVar4 = ahag.a;
                    }
                    aihf builder9 = ahagVar4.toBuilder();
                    builder9.copyOnWrite();
                    ahag ahagVar5 = (ahag) builder9.instance;
                    ahad ahadVar4 = (ahad) builder6.build();
                    ahadVar4.getClass();
                    ahagVar5.e = ahadVar4;
                    ahagVar5.b |= 1;
                    builder8.copyOnWrite();
                    asiz asizVar5 = (asiz) builder8.instance;
                    ahag ahagVar6 = (ahag) builder9.build();
                    ahagVar6.getClass();
                    asizVar5.c = ahagVar6;
                    asizVar5.b |= 1;
                    builder7.copyOnWrite();
                    asjc asjcVar5 = (asjc) builder7.instance;
                    asiz asizVar6 = (asiz) builder8.build();
                    asizVar6.getClass();
                    asjcVar5.c = asizVar6;
                    asjcVar5.b = 2;
                    builder3.cy(size, builder7);
                    ahag ahagVar7 = asizVar4.c;
                    if (ahagVar7 == null) {
                        ahagVar7 = ahag.a;
                    }
                    ahad ahadVar5 = ahagVar7.e;
                    if (ahadVar5 == null) {
                        ahadVar5 = ahad.a;
                    }
                    arrayList.add(ahadVar5.d);
                }
            } else {
                Iterator it = ((asjd) builder3.build()).c.iterator();
                while (true) {
                    Throwable th2 = th;
                    while (true) {
                        if (!it.hasNext()) {
                            mgyVar.initCause(th2);
                            return mgyVar;
                        }
                        asjc asjcVar6 = (asjc) it.next();
                        int i4 = asjcVar6.b;
                        int iC2 = atqn.C(i4);
                        int i5 = iC2 - 1;
                        if (iC2 == 0) {
                            throw th;
                        }
                        int i6 = 0;
                        if (i5 == 0) {
                            int i7 = i;
                            asja asjaVar4 = i4 == i7 ? (asja) asjcVar6.c : asja.a;
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[i7];
                            objArr[0] = asjaVar4.d;
                            mgzVar = new mgz(String.format(locale, "<JavaScript> %s", objArr), mhaVar);
                            aiie aiieVar = asjaVar4.e;
                            int size2 = aiieVar.size();
                            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
                            while (i6 < size2) {
                                asjb asjbVar = (asjb) aiieVar.get(i6);
                                stackTraceElementArr[i6] = new StackTraceElement("", asjbVar.b, asjbVar.c, asjbVar.d);
                                i6++;
                            }
                            mgzVar.setStackTrace(stackTraceElementArr);
                            mgzVar.initCause(th2);
                        } else if (i5 == i) {
                            asiz asizVar7 = i4 == 2 ? (asiz) asjcVar6.c : asizVar;
                            ahag ahagVar8 = asizVar7.c;
                            if (ahagVar8 == null) {
                                ahagVar8 = ahag.a;
                            }
                            ahad ahadVar6 = ahagVar8.e;
                            if (ahadVar6 == null) {
                                ahadVar6 = ahad.a;
                            }
                            mgzVar = new mgy(ahadVar6.d, mhaVar);
                            ahag ahagVar9 = asizVar7.c;
                            if (ahagVar9 == null) {
                                ahagVar9 = ahag.a;
                            }
                            ahad ahadVar7 = ahagVar9.e;
                            if (ahadVar7 == null) {
                                ahadVar7 = ahad.a;
                            }
                            mgzVar.setStackTrace(d(ahadVar7));
                            ahag ahagVar10 = asizVar7.c;
                            if (ahagVar10 == null) {
                                ahagVar10 = ahag.a;
                            }
                            Throwable th3 = mgzVar;
                            for (ahad ahadVar8 : ahagVar10.f) {
                                mgy mgyVar2 = new mgy(ahadVar8.d, mhaVar);
                                mgyVar2.setStackTrace(d(ahadVar8));
                                th3.initCause(mgyVar2);
                                th3 = mgyVar2;
                            }
                            th3.initCause(th2);
                        } else if (i5 == 2) {
                            mgx mgxVar = new mgx(mhaVar);
                            aiie aiieVar2 = (asjcVar6.b == 3 ? (asix) asjcVar6.c : asix.a).b;
                            int size3 = aiieVar2.size();
                            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[size3];
                            while (i6 < size3) {
                                asiy asiyVar = (asiy) aiieVar2.get(i6);
                                stackTraceElementArr2[i6] = new StackTraceElement("", asiyVar.b, asiyVar.c, asiyVar.d);
                                i6++;
                                th = th;
                            }
                            mgxVar.setStackTrace(stackTraceElementArr2);
                            mgxVar.initCause(th2);
                            i = 1;
                            th2 = mgxVar;
                        } else if (i5 == 3) {
                            th2 = new Throwable("<Empty stack>", th2);
                        }
                        i = 1;
                        th = th;
                        th2 = mgzVar;
                    }
                }
            }
        }
    }

    private static String c(String str, List list) {
        if (str.length() <= 256) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).contains(str)) {
                return String.format(Locale.US, "%s... (trimmed)", str.substring(0, SemanticState.Hidden));
            }
        }
        return str;
    }

    private static StackTraceElement[] d(ahad ahadVar) {
        return (StackTraceElement[]) Collection.EL.stream(ahadVar.f).map(new ixa(16)).toArray(new hhv(8));
    }

    public final Status$StatusProto b() {
        return ((mha) this.a).io();
    }
}
