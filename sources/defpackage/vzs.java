package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.MissingResourceHandler;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.SecurityVerifier;
import com.youtube.android.libraries.elements.StatusOr;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vzs implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vzs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v60, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r14v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        ArrayList arrayList;
        int i = 5;
        z = false;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                agke agkeVar = (agke) obj;
                HashMap map = new HashMap();
                int size = agkeVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ohp ohpVar = (ohp) agkeVar.get(i2);
                    int iAV = a.aV(ohpVar.g);
                    if (iAV != 0 && iAV == 2) {
                        map.put(ohpVar.c, ((vzt) this.a).k.H(ohpVar));
                    }
                }
                return map;
            case 1:
                vob vobVar = (vob) obj;
                vua vuaVar = ((vqs) this.a).i.d.a;
                return (vuaVar.b.getResources().getConfiguration().orientation == 2 && vobVar != null && vobVar.t() == akub.LANDSCAPE_PANEL_OPEN_STYLE_HORIZONTAL) ? new vty(vuaVar) : new vtz(vuaVar, vobVar);
            case 2:
                agke agkeVar2 = (agke) obj;
                ArrayList arrayList2 = new ArrayList();
                int size2 = agkeVar2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    vzz vzzVar = (vzz) agkeVar2.get(i3);
                    Iterator it = vzzVar.e(asjj.b).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        z2 = z2;
                        for (asjk asjkVar : ((asjj) it.next()).c) {
                            Object obj2 = this.a;
                            ((afip) obj2).d.put(asjkVar.b, new wjr(vzzVar, asjkVar));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        arrayList2.add(vzzVar);
                        vzw vzwVar = (vzw) vzzVar.a.io();
                        String strD = vzzVar.d();
                        asjm asjmVar = vzzVar.c().e;
                        if (asjmVar == null) {
                            asjmVar = asjm.a;
                        }
                        aplx aplxVar = asjmVar.b;
                        if (aplxVar == null) {
                            aplxVar = aplx.a;
                        }
                        aihf builder = aplxVar.toBuilder();
                        akju akjuVar = akju.a;
                        aihf aihfVarCreateBuilder = akjuVar.createBuilder();
                        int i4 = vzzVar.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        akju akjuVar2 = (akju) aihfVarCreateBuilder.instance;
                        akjuVar2.d = i4 - 1;
                        akjuVar2.b |= 4;
                        long jH = vzzVar.h();
                        aihfVarCreateBuilder.copyOnWrite();
                        akju akjuVar3 = (akju) aihfVarCreateBuilder.instance;
                        akjuVar3.b |= 1;
                        akjuVar3.c = jH;
                        akju akjuVar4 = (akju) aihfVarCreateBuilder.build();
                        builder.copyOnWrite();
                        aplx aplxVar2 = (aplx) builder.instance;
                        akjuVar4.getClass();
                        akju akjuVar5 = aplxVar2.c;
                        if (akjuVar5 == null || akjuVar5 == akjuVar) {
                            aplxVar2.c = akjuVar4;
                        } else {
                            aihf aihfVarCreateBuilder2 = akjuVar.createBuilder(akjuVar5);
                            aihfVarCreateBuilder2.mergeFrom((aihn) akjuVar4);
                            aplxVar2.c = (akju) aihfVarCreateBuilder2.buildPartial();
                        }
                        aplxVar2.b |= 1;
                        aplx aplxVar3 = (aplx) builder.build();
                        ConcurrentHashMap concurrentHashMap = vzwVar.a;
                        akju akjuVar6 = aplxVar3.c;
                        if (akjuVar6 != null) {
                            akjuVar = akjuVar6;
                        }
                        int iAV2 = a.aV(akjuVar.d);
                        if (iAV2 == 0) {
                            iAV2 = 1;
                        }
                        concurrentHashMap.put(new vzv(strD, iAV2), aplxVar3);
                    }
                }
                return agke.n(arrayList2);
            case 3:
                ResourceLoader resourceLoader = (ResourceLoader) obj;
                afip afipVar = (afip) this.a;
                resourceLoader.registerMissingResourceHandler((MissingResourceHandler) afipVar.a.io());
                resourceLoader.registerVerifier("datapush", StatusOr.fromValue((SecurityVerifier) afipVar.f.io()));
                return null;
            case 4:
                alys alysVar = (alys) obj;
                Object obj3 = this.a;
                if (alysVar == null || alysVar.c.size() == 0) {
                    return null;
                }
                synchronized (((wma) obj3).c) {
                    mbc mbcVar = ((wma) obj3).a;
                    long epochSecond = mbcVar.f().minusSeconds(alysVar.d).getEpochSecond();
                    if (mbcVar.f().getEpochSecond() < alysVar.d || epochSecond < 0) {
                        twu.d(twu.a, 5, "InnerTube token write time is invalid. Ignoring tokens from disk.", null);
                        return null;
                    }
                    for (alyq alyqVar : alysVar.c) {
                        if (alyqVar.c > epochSecond) {
                            final int i5 = alyqVar.b;
                            Map map2 = ((wma) obj3).b;
                            if (!Collection.EL.stream(map2.keySet()).anyMatch(new Predicate() { // from class: wmw
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* JADX INFO: renamed from: negate */
                                public final /* synthetic */ Predicate mo841negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj4) {
                                    return ((alyq) obj4).b == i5;
                                }
                            })) {
                                map2.put(alyqVar, Long.valueOf(mbcVar.b() + Duration.ofSeconds(((long) alyqVar.c) - epochSecond).toMillis()));
                            }
                        }
                    }
                    return null;
                }
            case 5:
                ((wma) this.a).c((Exception) obj);
                return null;
            case 6:
                atox atoxVar = (atox) obj;
                int i6 = xfn.m;
                long j = atoxVar.c;
                Object obj4 = this.a;
                if (j == -1) {
                    aihf aihfVar = (aihf) obj4;
                    aihfVar.copyOnWrite();
                    alan alanVar = (alan) aihfVar.instance;
                    alan alanVar2 = alan.a;
                    alanVar.b |= 4;
                    alanVar.e = 0L;
                    aihf builder2 = atoxVar.toBuilder();
                    builder2.copyOnWrite();
                    atox atoxVar2 = (atox) builder2.instance;
                    atoxVar2.b |= 1;
                    atoxVar2.c = 1L;
                    return (atox) builder2.build();
                }
                aihf aihfVar2 = (aihf) obj4;
                aihfVar2.copyOnWrite();
                alan alanVar3 = (alan) aihfVar2.instance;
                alan alanVar4 = alan.a;
                alanVar3.b |= 4;
                alanVar3.e = j;
                aihf builder3 = atoxVar.toBuilder();
                builder3.copyOnWrite();
                atox atoxVar3 = (atox) builder3.instance;
                atoxVar3.b |= 1;
                atoxVar3.c = j + 1;
                return (atox) builder3.build();
            case 7:
                aihf builder4 = ((atpi) obj).toBuilder();
                long jLongValue = ((Long) ((Optional) this.a).get()).longValue();
                builder4.copyOnWrite();
                atpi atpiVar = (atpi) builder4.instance;
                atpiVar.b |= 2;
                atpiVar.d = jLongValue;
                return (atpi) builder4.build();
            case 8:
                return this.a;
            case 9:
                aagn aagnVarA = ((aaew) ((aady) this.a).h.io()).b.a();
                if (!aagnVarA.l) {
                    ArrayList arrayList3 = new ArrayList();
                    synchronized (aagnVarA.k) {
                        tbn tbnVar = new tbn(aagnVarA.m);
                        while (tbnVar.hasNext()) {
                            arrayList3.add(((aagl) tbnVar.next()).e());
                        }
                        break;
                    }
                    return arrayList3;
                }
                synchronized (aagnVarA.k) {
                    tbo tboVar = aagnVarA.m;
                    Iterator it2 = tboVar.a.values().iterator();
                    int size3 = 0;
                    while (it2.hasNext()) {
                        size3 += ((LinkedList) it2.next()).size();
                    }
                    arrayList = new ArrayList(size3);
                    tbn tbnVar2 = new tbn(tboVar);
                    while (tbnVar2.hasNext()) {
                        arrayList.add((aagl) tbnVar2.next());
                    }
                    break;
                }
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                int size4 = arrayList.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add(((aagl) arrayList.get(i7)).e());
                }
                return arrayList4;
            case 10:
                return ((aaew) ((aady) this.a).h.io()).l();
            case 11:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aihf aihfVarCreateBuilder3 = atpt.a.createBuilder();
                String strK = this.a.e().k();
                if (!TextUtils.isEmpty(strK)) {
                    String strY = tym.y("offline_auto_offline_time_%s", strK);
                    aihf aihfVarCreateBuilder4 = atps.a.createBuilder();
                    long j2 = sharedPreferences.getLong(strY, 0L);
                    aihfVarCreateBuilder4.copyOnWrite();
                    atps atpsVar = (atps) aihfVarCreateBuilder4.instance;
                    atpsVar.b |= 1;
                    atpsVar.c = j2;
                    aihfVarCreateBuilder3.cP(strK, (atps) aihfVarCreateBuilder4.build());
                }
                return (atpt) aihfVarCreateBuilder3.build();
            case 12:
                agke agkeVar3 = (agke) obj;
                if (agkeVar3 == null || agkeVar3.isEmpty()) {
                    return agpn.b;
                }
                final abib abibVar = (abib) this.a;
                final long epochMilli = abibVar.b.a().toEpochMilli();
                return (Map) Collection.EL.stream(agkeVar3).collect(Collectors.partitioningBy(new Predicate() { // from class: abia
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public final /* synthetic */ Predicate mo841negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj5) {
                        return epochMilli - ((aret) obj5).getLastUpdatedClientTimestampMs().longValue() > Duration.ofSeconds(abibVar.g.c(20, 45702258L, 86400L)).toMillis();
                    }
                }, aghu.a));
            case 13:
                Object obj5 = this.a;
                abib abibVar2 = (abib) obj5;
                abibVar2.e = abibVar2.f.i(aret.class).ag(new abhb(obj5, i), new abeq(11));
                return null;
            case 14:
                Boolean bool = (Boolean) ((atpv) obj).d.get(this.a);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 15:
                Integer num = (Integer) obj;
                int i8 = adba.a;
                apjn apjnVar = ((vxu) this.a).c().k;
                if (apjnVar == null) {
                    apjnVar = apjn.a;
                }
                apjk apjkVar = apjnVar.p;
                if (apjkVar == null) {
                    apjkVar = apjk.a;
                }
                for (apjl apjlVar : apjkVar.b) {
                    if (apjlVar.b == num.intValue()) {
                        aslz aslzVar = apjlVar.c;
                        return aslzVar == null ? aslz.a : aslzVar;
                    }
                }
                return null;
            case 16:
                return Pair.create(this.a, obj);
            case 17:
                try {
                    afiw afiwVar = (afiw) ((afiu) obj).d.get(Integer.valueOf(((affd) this.a).a));
                    if (afiwVar == null) {
                        throw new IllegalArgumentException();
                    }
                    int iAS = a.aS(afiwVar.e);
                    if (iAS != 0 && iAS == 2) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } catch (IllegalArgumentException e) {
                    throw new afig(e);
                }
            case 18:
                try {
                    afiw afiwVar2 = (afiw) ((afiu) obj).d.get(Integer.valueOf(((affd) this.a).a));
                    if (afiwVar2 != null) {
                        return abhh.t(afiwVar2);
                    }
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e2) {
                    throw new afig(e2);
                }
            case 19:
                aihf builder5 = ((afiu) obj).toBuilder();
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((afiu) builder5.instance).d);
                int i9 = ((affd) this.a).a;
                Integer numValueOf = Integer.valueOf(i9);
                if (!mapUnmodifiableMap.containsKey(numValueOf)) {
                    throw new IllegalArgumentException();
                }
                aihf builder6 = ((afiw) mapUnmodifiableMap.get(numValueOf)).toBuilder();
                builder6.copyOnWrite();
                afiw afiwVar3 = (afiw) builder6.instance;
                afiwVar3.e = 1;
                afiwVar3.b |= 4;
                builder5.aj(i9, (afiw) builder6.build());
                return (afiu) builder5.build();
            default:
                return ((AtomicReference) this.a).get();
        }
    }
}
