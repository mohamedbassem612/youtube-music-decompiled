package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aacn implements aacl {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/autooffline/DefaultAutoOfflineController");
    private final twf b;
    private final aacm c;
    private final aaeg d;
    private final abxv e;
    private final xow f;
    protected final mbc m;

    public aacn(mbc mbcVar, twf twfVar, xow xowVar, aacm aacmVar, abxv abxvVar, aaeg aaegVar) {
        this.m = mbcVar;
        this.b = twfVar;
        this.f = xowVar;
        this.c = aacmVar;
        this.e = abxvVar;
        this.d = aaegVar;
    }

    private static int a(mbc mbcVar, Collection collection) {
        Iterator it = collection.iterator();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        while (it.hasNext()) {
            aamt aamtVar = (aamt) it.next();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int epochMilli = (int) ((mbcVar.f().toEpochMilli() - aamtVar.h) / 1000);
            if (epochMilli >= 0 && epochMilli < i) {
                i = epochMilli;
            }
        }
        return i;
    }

    @Override // defpackage.aacl
    public synchronized int b(String str, aaqn aaqnVar) {
        taq.c();
        try {
            allr allrVar = (allr) ((wnh) this.f.c).c(d(aaqnVar));
            allrVar.e.size();
            e(allrVar, str, aaqnVar);
        } catch (wno e) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/autooffline/DefaultAutoOfflineController", "runAutoOffline", 96, "DefaultAutoOfflineController.java")).w("[Offline] AutoOfflineService request failed: %s", e.getMessage());
            return 1;
        }
        return 0;
    }

    protected wog d(aaqn aaqnVar) {
        int i;
        alls allsVar;
        wog wogVarG = this.f.g();
        wogVarG.m();
        boolean z = this.d.a;
        aaqq aaqqVarJ = aaqnVar.j();
        if (z) {
            for (aamq aamqVar : aaqqVarJ.f()) {
                if (aamqVar.d == 1) {
                    try {
                        i = Integer.parseInt(aamqVar.b.substring(24));
                    } catch (NumberFormatException e) {
                        ((agrc) ((agrc) ((agrc) aamq.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/model/OfflineVideoList", "getAutoOfflineVideoListCheckListType", '_', "OfflineVideoList.java")).t("Auto offline video list list type parse failed.");
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    int iA = a(this.m, aaqnVar.j().c(aamqVar.b));
                    int iAV = a.aV(i);
                    ahno.F(iAV != 1);
                    aihf aihfVarCreateBuilder = alls.a.createBuilder();
                    if (iAV != 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        alls allsVar2 = (alls) aihfVarCreateBuilder.instance;
                        allsVar2.c = iAV - 1;
                        allsVar2.b |= 1;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    alls allsVar3 = (alls) aihfVarCreateBuilder.instance;
                    allsVar3.b |= 8;
                    allsVar3.d = iA;
                    allsVar = (alls) aihfVarCreateBuilder.build();
                } else {
                    allsVar = null;
                }
                if (allsVar != null) {
                    wogVarG.a.add(allsVar);
                }
            }
        }
        i(wogVarG, aaqnVar);
        return wogVarG;
    }

    protected void e(allr allrVar, String str, aaqn aaqnVar) {
        HashSet hashSet = new HashSet();
        for (allo alloVar : allrVar.e) {
            if ((alloVar.b & 1) != 0 && this.d.a) {
                allt alltVar = alloVar.c;
                if (alltVar == null) {
                    alltVar = allt.a;
                }
                k(aaqnVar, alltVar.toBuilder(), hashSet);
            }
            int i = alloVar.b;
        }
        for (aaok aaokVar : aaqnVar.j().b()) {
            String str2 = ((aamq) aaokVar.b).b;
            if (aaokVar.c == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE && !hashSet.contains(str2)) {
                aaqq aaqqVarJ = aaqnVar.j();
                aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                aoenVar.b |= 2;
                aoenVar.d = str2;
                aihfVarCreateBuilder.copyOnWrite();
                aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                aoenVar2.e = 5;
                aoenVar2.b |= 4;
                aaqqVarJ.d(str2, (aoen) aihfVarCreateBuilder.build());
            }
        }
        m(allrVar, str);
    }

    protected void i(wog wogVar, aaqn aaqnVar) {
        wogVar.c = this.e.a();
        n(wogVar);
        wogVar.e = a(this.m, aaqnVar.l().h());
        twf twfVar = this.b;
        wogVar.D = twfVar.b() ? 1.0f : twfVar.a();
        wogVar.E = (int) l();
    }

    protected void k(aaqn aaqnVar, aihf aihfVar, Set set) {
        int iAV = a.aV(((allt) aihfVar.instance).c);
        if (iAV == 0) {
            iAV = 1;
        }
        String strA = aamq.a(iAV);
        if (aaqnVar.j().a(strA) == null) {
            int iAV2 = a.aV(((allt) aihfVar.instance).c);
            if (iAV2 == 0) {
                iAV2 = 1;
            }
            aaqnVar.j().g(new aamq(aamq.a(iAV2), 0, 1), aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE);
        }
        ArrayList arrayList = new ArrayList();
        for (aohc aohcVar : DesugarCollections.unmodifiableList(((allt) aihfVar.instance).b)) {
            if ((aohcVar.b & 1) != 0) {
                aohb aohbVar = aohcVar.c;
                if (aohbVar == null) {
                    aohbVar = aohb.a;
                }
                arrayList.add(aamo.b(aohbVar));
            }
        }
        aaqnVar.j().h(strA, arrayList);
        set.add(strA);
    }

    protected final long l() {
        Calendar calendar = Calendar.getInstance();
        return (this.m.f().toEpochMilli() + ((long) (calendar.get(15) + calendar.get(16)))) / 1000;
    }

    protected final void m(allr allrVar, String str) {
        int i = allrVar.c;
        aacm aacmVar = this.c;
        if (i <= 0) {
            aacmVar.a(str);
        } else {
            int i2 = allrVar.d;
            aacmVar.f(str, i);
        }
    }

    protected final void n(wog wogVar) {
        wogVar.d = this.e.d();
    }
}
