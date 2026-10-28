package defpackage;

import android.os.StrictMode;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qfx implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ qfy a;
    private final Thread.UncaughtExceptionHandler b;

    public qfx(qfy qfyVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = qfyVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aunn, java.lang.Object] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        ahub ahubVarB;
        qgk qgkVarB;
        ahub ahubVarB2;
        int i;
        aihf aihfVarCreateBuilder;
        boolean z;
        Iterator it;
        ahae ahaeVar;
        try {
            try {
                qfy qfyVar = this.a;
                String name = thread.getName();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                qiu qiuVar = qfyVar.f;
                aihf aihfVarA = qiuVar.a(qfyVar.a);
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                boolean z2 = true;
                aihf aihfVarC = aext.c(th, true);
                Iterator it2 = ((Set) qiuVar.b.io()).iterator();
                while (it2.hasNext()) {
                    qgb qgbVar = (qgb) it2.next();
                    ahad ahadVar = ((ahag) aihfVarC.instance).e;
                    if (ahadVar == null) {
                        ahadVar = ahad.a;
                    }
                    if ((ahadVar.b & 2) != 0) {
                        String str = ahadVar.d;
                        z = z2;
                        String strA = qgbVar.a();
                        if (!str.equals(strA)) {
                            aihf builder = ahadVar.toBuilder();
                            builder.copyOnWrite();
                            ahad ahadVar2 = (ahad) builder.instance;
                            strA.getClass();
                            ahadVar2.b |= 2;
                            ahadVar2.d = strA;
                            ahad ahadVar3 = (ahad) builder.build();
                            aihfVarC.copyOnWrite();
                            ahag ahagVar = (ahag) aihfVarC.instance;
                            ahadVar3.getClass();
                            ahagVar.e = ahadVar3;
                            ahagVar.b |= 1;
                        }
                    } else {
                        z = z2;
                    }
                    ahag ahagVar2 = (ahag) aihfVarC.instance;
                    int i2 = ahagVar2.c;
                    if (i2 == 4) {
                        ahae ahaeVar2 = i2 == 4 ? (ahae) ahagVar2.d : ahae.a;
                        aihf builder2 = null;
                        int i3 = 0;
                        while (i3 < ahaeVar2.b.size()) {
                            ahaf ahafVar = (ahaf) ahaeVar2.b.get(i3);
                            ahad ahadVar4 = ahafVar.c;
                            if (ahadVar4 == null) {
                                ahadVar4 = ahad.a;
                            }
                            Iterator it3 = it2;
                            if ((ahadVar4.b & 2) != 0) {
                                String str2 = ahadVar4.d;
                                ahaeVar = ahaeVar2;
                                String strA2 = qgbVar.a();
                                if (!str2.equals(strA2)) {
                                    if (builder2 == null) {
                                        builder2 = ahaeVar.toBuilder();
                                    }
                                    aihf builder3 = ahafVar.toBuilder();
                                    aihf builder4 = ahadVar4.toBuilder();
                                    builder4.copyOnWrite();
                                    ahad ahadVar5 = (ahad) builder4.instance;
                                    strA2.getClass();
                                    ahadVar5.b |= 2;
                                    ahadVar5.d = strA2;
                                    ahad ahadVar6 = (ahad) builder4.build();
                                    builder3.copyOnWrite();
                                    ahaf ahafVar2 = (ahaf) builder3.instance;
                                    ahadVar6.getClass();
                                    ahafVar2.c = ahadVar6;
                                    ahafVar2.b |= 1;
                                    ahaf ahafVar3 = (ahaf) builder3.build();
                                    builder2.copyOnWrite();
                                    ahae ahaeVar3 = (ahae) builder2.instance;
                                    ahafVar3.getClass();
                                    ahaeVar3.a();
                                    ahaeVar3.b.set(i3, ahafVar3);
                                }
                                i3++;
                                it2 = it3;
                                ahaeVar2 = ahaeVar;
                                qgbVar = qgbVar;
                            } else {
                                ahaeVar = ahaeVar2;
                            }
                            i3++;
                            it2 = it3;
                            ahaeVar2 = ahaeVar;
                            qgbVar = qgbVar;
                        }
                        it = it2;
                        if (builder2 != null) {
                            ahae ahaeVar4 = (ahae) builder2.build();
                            aihfVarC.copyOnWrite();
                            ahag ahagVar3 = (ahag) aihfVarC.instance;
                            ahaeVar4.getClass();
                            ahagVar3.d = ahaeVar4;
                            ahagVar3.c = 4;
                        }
                    } else {
                        it = it2;
                        for (int i4 = 0; i4 < ((ahag) aihfVarC.instance).f.size(); i4++) {
                            ahad ahadVar7 = (ahad) ((ahag) aihfVarC.instance).f.get(i4);
                            if ((ahadVar7.b & 2) != 0) {
                                String str3 = ahadVar7.d;
                                String strA3 = qgbVar.a();
                                if (!str3.equals(strA3)) {
                                    aihf builder5 = ahadVar7.toBuilder();
                                    builder5.copyOnWrite();
                                    ahad ahadVar8 = (ahad) builder5.instance;
                                    strA3.getClass();
                                    ahadVar8.b |= 2;
                                    ahadVar8.d = strA3;
                                    ahad ahadVar9 = (ahad) builder5.build();
                                    aihfVarC.copyOnWrite();
                                    ahag ahagVar4 = (ahag) aihfVarC.instance;
                                    ahadVar9.getClass();
                                    ahagVar4.a();
                                    ahagVar4.f.set(i4, ahadVar9);
                                }
                            }
                        }
                    }
                    z2 = z;
                    it2 = it;
                }
                aihfVarA.copyOnWrite();
                axhq axhqVar = (axhq) aihfVarA.instance;
                axhq axhqVar2 = axhq.a;
                name.getClass();
                axhqVar.b |= 8;
                axhqVar.f = name;
                int iP = a.P(th.getClass());
                aihfVarA.copyOnWrite();
                axhq axhqVar3 = (axhq) aihfVarA.instance;
                axhqVar3.g = iP - 1;
                axhqVar3.b |= 16;
                aihfVarA.copyOnWrite();
                axhq axhqVar4 = (axhq) aihfVarA.instance;
                name2.getClass();
                axhqVar4.b |= SemanticState.Focused;
                axhqVar4.h = name2;
                ahag ahagVar5 = (ahag) aihfVarC.build();
                aihfVarA.copyOnWrite();
                axhq axhqVar5 = (axhq) aihfVarA.instance;
                ahagVar5.getClass();
                axhqVar5.i = ahagVar5;
                axhqVar5.b |= SemanticState.Hidden;
                WeakHashMap weakHashMap = aftt.a;
                qga qgaVar = (qga) qfyVar.d.io();
                if (qgaVar.b && (ahubVarB2 = aftt.b(th)) != null) {
                    agke agkeVar = ((afvy) ahubVarB2.a).a;
                    int i5 = qgaVar.c;
                    int i6 = qgaVar.d;
                    int i7 = qgaVar.e;
                    List listT = aguu.t(agkeVar);
                    int iMin = Math.min(((agpi) agkeVar).d, i6);
                    aguu.ag(iMin, "initialArraySize");
                    ArrayList arrayList = new ArrayList(iMin);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    int length = 0;
                    while (true) {
                        if (i8 >= listT.size()) {
                            i = 0;
                            aihfVarCreateBuilder = null;
                            break;
                        }
                        int i9 = i8 + 1;
                        if (i9 > i6) {
                            aihfVarCreateBuilder = axho.a.createBuilder();
                            int size = listT.size() - i8;
                            aihfVarCreateBuilder.copyOnWrite();
                            axho axhoVar = (axho) aihfVarCreateBuilder.instance;
                            axhoVar.b |= 1;
                            axhoVar.c = size;
                        } else {
                            int i10 = i6;
                            String str4 = (String) listT.get(i8);
                            List list = listT;
                            if (Math.min(str4.length(), i5) + length > i7) {
                                aihfVarCreateBuilder = axho.a.createBuilder();
                                int size2 = list.size() - i8;
                                aihfVarCreateBuilder.copyOnWrite();
                                axho axhoVar2 = (axho) aihfVarCreateBuilder.instance;
                                axhoVar2.b |= 2;
                                axhoVar2.d = size2;
                            } else {
                                int i11 = i7;
                                if (str4.length() > i5) {
                                    arrayList.add(str4.substring(0, i5));
                                    arrayList2.add(Integer.valueOf(i8));
                                    arrayList3.add(Integer.valueOf(str4.length() - i5));
                                    length += i5;
                                } else {
                                    arrayList.add(str4);
                                    length += str4.length();
                                }
                                i8 = i9;
                                i7 = i11;
                                listT = list;
                                i6 = i10;
                            }
                        }
                        i = 0;
                        break;
                    }
                    if (!arrayList2.isEmpty()) {
                        if (aihfVarCreateBuilder == null) {
                            aihfVarCreateBuilder = axho.a.createBuilder();
                        }
                        int size3 = arrayList2.size();
                        for (int i12 = i; i12 < size3; i12++) {
                            int size4 = (arrayList.size() - ((Integer) arrayList2.get(i12)).intValue()) - 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            axho axhoVar3 = (axho) aihfVarCreateBuilder.instance;
                            axho axhoVar4 = axho.a;
                            aihv aihvVar = axhoVar3.e;
                            if (!aihvVar.c()) {
                                axhoVar3.e = aihn.mutableCopy(aihvVar);
                            }
                            axhoVar3.e.h(size4);
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        axho axhoVar5 = (axho) aihfVarCreateBuilder.instance;
                        axho axhoVar6 = axho.a;
                        aihv aihvVar2 = axhoVar5.f;
                        if (!aihvVar2.c()) {
                            axhoVar5.f = aihn.mutableCopy(aihvVar2);
                        }
                        aifs.addAll(arrayList3, axhoVar5.f);
                    }
                    aihf aihfVarCreateBuilder2 = axhp.a.createBuilder();
                    List listT2 = aguu.t(arrayList);
                    aihfVarCreateBuilder2.copyOnWrite();
                    axhp axhpVar = (axhp) aihfVarCreateBuilder2.instance;
                    aiie aiieVar = axhpVar.c;
                    if (!aiieVar.c()) {
                        axhpVar.c = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(listT2, axhpVar.c);
                    if (aihfVarCreateBuilder != null) {
                        axho axhoVar7 = (axho) aihfVarCreateBuilder.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        axhp axhpVar2 = (axhp) aihfVarCreateBuilder2.instance;
                        axhoVar7.getClass();
                        axhpVar2.d = axhoVar7;
                        axhpVar2.b |= 1;
                    }
                    axhp axhpVar3 = (axhp) aihfVarCreateBuilder2.build();
                    aihfVarA.copyOnWrite();
                    axhq axhqVar6 = (axhq) aihfVarA.instance;
                    axhpVar3.getClass();
                    axhqVar6.k = axhpVar3;
                    axhqVar6.b |= SemanticState.ReadOnly;
                }
                axhq axhqVar7 = (axhq) aihfVarA.build();
                agev agevVarH = (!((Boolean) qfyVar.h.a.io()).booleanValue() || (ahubVarB = aftt.b(th)) == null || (qgkVarB = qgk.b(((afvy) ahubVarB.a).b)) == null) ? agdf.a : agev.h(qgkVarB.a());
                qfyVar.m(axhqVar7, (qgi) agevVarH.f());
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", 180, "CrashMetricServiceImpl.java")).t("Failed to record crash.");
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
