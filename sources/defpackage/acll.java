package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acll implements aclm {
    private final aclm a;
    private final adif b;

    public acll(aclm aclmVar, adif adifVar) {
        aclmVar.getClass();
        this.a = aclmVar;
        this.b = adifVar;
    }

    @Override // defpackage.aclm
    public final void a(agkz agkzVar) {
        agkzVar.getClass();
        try {
            this.a.a(agkzVar);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        if (agkzVar.isEmpty()) {
            return;
        }
        try {
            aihf aihfVarCreateBuilder = apgg.a.createBuilder();
            List<String> listAi = atqq.ai(agkzVar);
            ArrayList arrayList = new ArrayList(atqq.N(listAi, 10));
            for (String str : listAi) {
                aihf aihfVarCreateBuilder2 = apfo.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                acfz.bo(str, aihfVarCreateBuilder2);
                arrayList.add(acfz.bn(aihfVarCreateBuilder2));
            }
            aihf aihfVarCreateBuilder3 = aoiv.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((aoiv) aihfVarCreateBuilder3.instance).b);
            listUnmodifiableList.getClass();
            new aikl(listUnmodifiableList);
            aihfVarCreateBuilder3.copyOnWrite();
            aoiv aoivVar = (aoiv) aihfVarCreateBuilder3.instance;
            aiie aiieVar = aoivVar.b;
            if (!aiieVar.c()) {
                aoivVar.b = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(arrayList, aoivVar.b);
            aihn aihnVarBuild = aihfVarCreateBuilder3.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
            apggVar.c = (aoiv) aihnVarBuild;
            apggVar.b = 13;
            aihfVarCreateBuilder.getClass();
            xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } catch (Throwable th2) {
            atqp.i(th2);
        }
    }

    @Override // defpackage.aclm
    public final void b(ajwo ajwoVar, String str) {
        ajwoVar.getClass();
        try {
            this.a.b(ajwoVar, str);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        try {
            aihf aihfVarCreateBuilder = apgg.a.createBuilder();
            aihf aihfVarCreateBuilder2 = aoja.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            aoja aojaVar = (aoja) aihfVarCreateBuilder2.instance;
            aojaVar.b |= 1;
            aojaVar.c = str;
            String strH = adif.h(ajwoVar);
            if (strH != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                aoja aojaVar2 = (aoja) aihfVarCreateBuilder2.instance;
                aojaVar2.b |= 2;
                aojaVar2.d = strH;
            }
            aihn aihnVarBuild = aihfVarCreateBuilder2.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
            apggVar.c = (aoja) aihnVarBuild;
            apggVar.b = 9;
            aihfVarCreateBuilder.getClass();
            xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } catch (Throwable th2) {
            atqp.i(th2);
        }
    }

    @Override // defpackage.aclm
    public final void c(ajwo ajwoVar, alvt alvtVar) {
        alvtVar.getClass();
        try {
            this.a.c(ajwoVar, alvtVar);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        try {
            aihf aihfVarCreateBuilder = apgg.a.createBuilder();
            aihf aihfVarCreateBuilder2 = aojb.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            String strH = adif.h(ajwoVar);
            if (strH != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                aojb aojbVar = (aojb) aihfVarCreateBuilder2.instance;
                aojbVar.b |= 1;
                aojbVar.c = strH;
            }
            aihn aihnVarBuild = aihfVarCreateBuilder2.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
            apggVar.c = (aojb) aihnVarBuild;
            apggVar.b = 6;
            aihfVarCreateBuilder.getClass();
            xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } catch (Throwable th2) {
            atqp.i(th2);
        }
    }

    @Override // defpackage.aclm
    public final void d(List list, alqi alqiVar) {
        try {
            this.a.d(list, alqiVar);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        boolean z = alqiVar != null;
        if (list.isEmpty()) {
            return;
        }
        try {
            aihf aihfVarCreateBuilder = apgg.a.createBuilder();
            List listAi = atqq.ai(list);
            ArrayList<String> arrayList = new ArrayList();
            Iterator it = listAi.iterator();
            while (it.hasNext()) {
                String strH = adif.h((ajwo) it.next());
                if (strH != null) {
                    arrayList.add(strH);
                }
            }
            ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
            for (String str : arrayList) {
                aihf aihfVarCreateBuilder2 = apfo.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                acfz.bo(str, aihfVarCreateBuilder2);
                arrayList2.add(acfz.bn(aihfVarCreateBuilder2));
            }
            aihf aihfVarCreateBuilder3 = aoje.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((aoje) aihfVarCreateBuilder3.instance).c);
            listUnmodifiableList.getClass();
            new aikl(listUnmodifiableList);
            aihfVarCreateBuilder3.copyOnWrite();
            aoje aojeVar = (aoje) aihfVarCreateBuilder3.instance;
            aiie aiieVar = aojeVar.c;
            if (!aiieVar.c()) {
                aojeVar.c = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(arrayList2, aojeVar.c);
            aihfVarCreateBuilder3.copyOnWrite();
            aoje aojeVar2 = (aoje) aihfVarCreateBuilder3.instance;
            aojeVar2.b |= 1;
            aojeVar2.d = z;
            int size = list.size();
            aihfVarCreateBuilder3.copyOnWrite();
            aoje aojeVar3 = (aoje) aihfVarCreateBuilder3.instance;
            aojeVar3.b |= 2;
            aojeVar3.e = size;
            aihn aihnVarBuild = aihfVarCreateBuilder3.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
            apggVar.c = (aoje) aihnVarBuild;
            apggVar.b = 3;
            aihfVarCreateBuilder.getClass();
            xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } catch (Throwable th2) {
            atqp.i(th2);
        }
    }

    @Override // defpackage.aclm
    public final void e(aclq aclqVar) {
        try {
            this.a.e(aclqVar);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        ajwo ajwoVar = ((acqk) aclqVar).a;
        if (ajwoVar != null) {
            try {
                aihf aihfVarCreateBuilder = apgg.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aojg.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                String strH = adif.h(ajwoVar);
                if (strH != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aojg aojgVar = (aojg) aihfVarCreateBuilder2.instance;
                    aojgVar.b |= 1;
                    aojgVar.c = strH;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
                apggVar.c = (aojg) aihnVarBuild;
                apggVar.b = 7;
                aihfVarCreateBuilder.getClass();
                xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } catch (Throwable th2) {
                atqp.i(th2);
            }
        }
    }

    @Override // defpackage.aclm
    public final void f(aclq aclqVar, int i) {
        int i2;
        try {
            this.a.f(aclqVar, i);
        } catch (Throwable th) {
            atqp.i(th);
        }
        adif adifVar = this.b;
        ajwo ajwoVar = ((acqk) aclqVar).a;
        if (ajwoVar != null) {
            try {
                aihf aihfVarCreateBuilder = apgg.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aojh.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                if (i != 0) {
                    i2 = 3;
                    if (i != 1) {
                        if (i != 2) {
                            i2 = i != 3 ? 6 : 5;
                        } else {
                            i2 = 4;
                        }
                    }
                } else {
                    i2 = 2;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                aojh aojhVar = (aojh) aihfVarCreateBuilder2.instance;
                aojhVar.c = i2 - 1;
                aojhVar.b |= 1;
                String strH = adif.h(ajwoVar);
                if (strH != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aojh aojhVar2 = (aojh) aihfVarCreateBuilder2.instance;
                    aojhVar2.b |= 2;
                    aojhVar2.d = strH;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
                apggVar.c = (aojh) aihnVarBuild;
                apggVar.b = 10;
                aihfVarCreateBuilder.getClass();
                xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } catch (Throwable th2) {
                atqp.i(th2);
            }
        }
    }

    @Override // defpackage.aclm
    public final boolean h(aclq aclqVar, int i) {
        Object objI;
        try {
            objI = Boolean.valueOf(this.a.h(aclqVar, i));
        } catch (Throwable th) {
            objI = atqp.i(th);
        }
        boolean z = objI instanceof awmm;
        Object obj = Boolean.FALSE;
        if (true == z) {
            objI = obj;
        }
        boolean zBooleanValue = ((Boolean) objI).booleanValue();
        adif adifVar = this.b;
        ajwo ajwoVar = ((acqk) aclqVar).a;
        if (ajwoVar != null) {
            try {
                aihf aihfVarCreateBuilder = apgg.a.createBuilder();
                aihf aihfVarCreateBuilder2 = aoji.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                aoji aojiVar = (aoji) aihfVarCreateBuilder2.instance;
                aojiVar.b |= 1;
                aojiVar.c = i;
                String strH = adif.h(ajwoVar);
                if (strH != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    aoji aojiVar2 = (aoji) aihfVarCreateBuilder2.instance;
                    aojiVar2.b |= 2;
                    aojiVar2.d = strH;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                aihnVarBuild.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                apgg apggVar = (apgg) aihfVarCreateBuilder.instance;
                apggVar.c = (aoji) aihnVarBuild;
                apggVar.b = 11;
                aihfVarCreateBuilder.getClass();
                xff xffVarA = ((xeu) adifVar.a).a(aihfVarCreateBuilder, alot.REELS_ADS_EVENTS);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } catch (Throwable th2) {
                atqp.i(th2);
            }
        }
        return zBooleanValue;
    }

    @Override // defpackage.aclm
    public final /* synthetic */ void g() {
    }
}
