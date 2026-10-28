package defpackage;

import android.speech.tts.TextToSpeech;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgs implements nwg {
    public static final AtomicInteger a = new AtomicInteger();
    final aunn b;
    public final nuc c;

    public mgs(aunn aunnVar, nuc nucVar) {
        this.b = aunnVar;
        this.c = nucVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return aqkw.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        final aqkw aqkwVar = (aqkw) obj;
        int iAS = a.aS(aqkwVar.j);
        boolean z = false;
        if (iAS != 0 && iAS == 3) {
            z = true;
        }
        aunn aunnVar = this.b;
        acyw acywVar = (acyw) aunnVar.io();
        boolean z2 = acywVar.d;
        acywVar.d = z;
        if (z2 != z) {
            for (mgr mgrVar : acywVar.c) {
                if (z) {
                    acywVar.a.j(mgrVar);
                    ((tsl) ((agfa) acywVar.b).a).d(mgrVar);
                } else {
                    ((tsl) ((agfa) acywVar.b).a).e(mgrVar);
                    acywVar.a.i(mgrVar);
                }
            }
        }
        if (z) {
            acyw acywVar2 = (acyw) aunnVar.io();
            int i = aqkwVar.k;
            ((tsl) ((agfa) acywVar2.b).a).c = tsc.a;
        }
        final nsl nslVar = nwfVar.f;
        return ((acyw) aunnVar.io()).a().c(avlb.h(new Callable() { // from class: mgq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                mgs mgsVar = this.a;
                aqkw aqkwVar2 = aqkwVar;
                int i2 = 1;
                if (!aqkwVar2.d) {
                    mgsVar.e(true);
                    return avlb.e();
                }
                int iIncrementAndGet = mgs.a.incrementAndGet();
                acyw acywVar3 = (acyw) mgsVar.b.io();
                int i3 = 0;
                mgsVar.e(false);
                if ((aqkwVar2.c & 2) != 0) {
                    int iAx = acfz.ax(aqkwVar2.h);
                    if (iAx == 0) {
                        iAx = 2;
                    }
                    acywVar3.c(acfz.aw(iAx));
                } else {
                    acywVar3.c(0);
                }
                avlb avlbVarG = avlb.g(new xdj(mgsVar, "TextToSpeechController" + (aqkwVar2.e.size() - 1), iIncrementAndGet, acywVar3, nslVar, 1));
                if (acywVar3.d) {
                    tsl tslVar = (tsl) ((agfa) acywVar3.b).a;
                    tslVar.f(false);
                    Iterator it = tslVar.e.iterator();
                    while (it.hasNext()) {
                        ((aeiv) it.next()).m(tslVar.i);
                    }
                } else {
                    tsr tsrVar = acywVar3.a;
                    tsrVar.h(false);
                    Iterator it2 = tsrVar.h.iterator();
                    while (it2.hasNext()) {
                        ((aeiv) it2.next()).m(tsrVar.i);
                    }
                }
                String str = "";
                int i4 = 0;
                while (i4 < aqkwVar2.e.size()) {
                    String strBR = a.bR(i4, "TextToSpeechController");
                    if (aqkwVar2.g.size() > i4) {
                        String str2 = (String) aqkwVar2.g.get(i4);
                        if (!str.equals(str2)) {
                            Locale locale = new Locale(str2);
                            tsr tsrVar2 = acywVar3.a;
                            TextToSpeech textToSpeech = tsrVar2.b;
                            if (textToSpeech != null) {
                                taf.j(ahno.ap(new tsn(textToSpeech, locale, i2, null), tsrVar2.f), new iul(19));
                            }
                            String languageTag = locale.toLanguageTag();
                            if (languageTag.isEmpty() || languageTag.equals("und")) {
                                languageTag = "en-US";
                            }
                            acywVar3.e = languageTag;
                            str = str2;
                        }
                    }
                    final String str3 = (String) aqkwVar2.e.get(i4);
                    final int i5 = (aqkwVar2.i.size() <= i4 || !aqkwVar2.i.g(i4)) ? 2 : 3;
                    if (!acywVar3.d) {
                        acywVar3.a.g(str3, 1, i5, strBR);
                    } else if (str3 != null) {
                        Object obj2 = ((agfa) acywVar3.b).a;
                        final String str4 = acywVar3.e;
                        str4.getClass();
                        final tsl tslVar2 = (tsl) obj2;
                        ape.f(new aqk() { // from class: tse
                            public final /* synthetic */ String b = "S3TextToSpeechController";

                            @Override // defpackage.aqk
                            public final Object a(aqi aqiVar) {
                                String str5;
                                String str6;
                                int i6;
                                tsl tslVar3 = tslVar2;
                                aqiVar.a(new szq(tslVar3, 12), tslVar3.d);
                                String str7 = this.b;
                                synchronized (tslVar3) {
                                    tslVar3.h(false);
                                    tslVar3.f = aqiVar;
                                    tslVar3.g = str7;
                                    str5 = str3;
                                    str6 = str4;
                                    i6 = i5;
                                }
                                tslVar3.d.execute(afwl.i(new cdf(tslVar3, str5, str6, i6, aqiVar, 3)));
                                return "S3TextToSpeechController.speak";
                            }
                        });
                    }
                    if (aqkwVar2.f.size() > i4) {
                        aigu aiguVar = (aigu) aqkwVar2.f.get(i4);
                        final long jRound = Math.round((aiguVar.b * 1000) + ((long) (aiguVar.c / 1000)));
                        if (acywVar3.d) {
                            Object obj3 = ((agfa) acywVar3.b).a;
                            if (jRound <= 0) {
                                ahng.n(Boolean.TRUE);
                            } else {
                                final tsl tslVar3 = (tsl) obj3;
                                ape.f(new aqk() { // from class: tsf
                                    public final /* synthetic */ String c = "S3TextToSpeechController";

                                    @Override // defpackage.aqk
                                    public final Object a(aqi aqiVar) {
                                        long j;
                                        tsl tslVar4 = tslVar3;
                                        aqiVar.a(new szq(tslVar4, 10), tslVar4.d);
                                        String str5 = this.c;
                                        synchronized (tslVar4) {
                                            tslVar4.h(false);
                                            tslVar4.f = aqiVar;
                                            tslVar4.g = str5;
                                            tslVar4.j.ab(new tsd(new prq(16), 2));
                                            j = jRound;
                                        }
                                        tslVar4.b.schedule(new sxk(tslVar4, aqiVar, 14, null), j, TimeUnit.MILLISECONDS);
                                        return "S3TextToSpeechController.speakSilence";
                                    }
                                });
                            }
                        } else {
                            tsr tsrVar3 = acywVar3.a;
                            TextToSpeech textToSpeech2 = tsrVar3.b;
                            if (textToSpeech2 != null) {
                                taf.j(ahno.ap(new acql(textToSpeech2, jRound, strBR, 1), tsrVar3.f), new tsq(i3));
                            }
                        }
                    }
                    i4++;
                }
                return avlbVarG;
            }
        }));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return nrb.a(this, mewVar, nwfVar);
    }

    public final void e(boolean z) {
        ((acyw) this.b.io()).d(z);
    }
}
