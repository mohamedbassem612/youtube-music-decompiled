package defpackage;

import android.text.Spanned;
import com.youtube.android.libraries.elements.StatusOr;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibr implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ibr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v55, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v57, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        boolean z;
        wjf wjfVarA;
        Object obj2;
        aouj aoujVarAb;
        alay alayVar;
        alay alayVar2;
        int i = 13;
        aima aimaVar = null;
        switch (this.$cid) {
            case 0:
                aaxh aaxhVar = (aaxh) obj;
                ibs ibsVar = (ibs) this.a;
                if (ibsVar.b && aaxhVar.a) {
                    taf.j(((jij) ibsVar.a.io()).p(aaxhVar.c), new hou(14));
                    return;
                }
                return;
            case 1:
                aayy aayyVar = (aayy) obj;
                ibs ibsVar2 = (ibs) this.a;
                if (ibsVar2.b) {
                    taf.j(((jij) ibsVar2.a.io()).q(aayyVar.a), new hou(i));
                    return;
                }
                return;
            case 2:
                aayt aaytVar = (aayt) obj;
                if (aaytVar.a.a(abnv.f) && (wjfVarA = aaytVar.a()) != null) {
                    alvw alvwVar = wjfVarA.u().g;
                    if (alvwVar == null) {
                        alvwVar = alvw.a;
                    }
                    anzw anzwVarA = anzw.a(alvwVar.p);
                    if (anzwVarA == null) {
                        anzwVarA = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
                    }
                    z = igs.c(anzwVarA);
                }
                ((ibs) this.a).b = z;
                return;
            case 3:
                ((ict) this.a).g();
                return;
            case 4:
                this.a.invoke(obj);
                return;
            case 5:
                this.a.invoke(obj);
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue) {
                    ((idr) obj3).s();
                    return;
                } else {
                    ((idr) obj3).u();
                    return;
                }
            case 7:
                ((idr) this.a).u();
                return;
            case 8:
                idr idrVar = (idr) this.a;
                if (idrVar.D.l(183, 45682757L, false)) {
                    return;
                }
                idrVar.l.c();
                return;
            case 9:
                agrx agrxVar = agso.a;
                isw iswVar = new isw();
                agke agkeVar = agpi.a;
                iswVar.e(agkeVar);
                iswVar.d(agkeVar);
                ArrayList arrayList = new ArrayList();
                Object obj4 = this.a;
                idr idrVar2 = (idr) obj4;
                arrayList.addAll(idrVar2.o);
                iswVar.e(arrayList);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(idrVar2.p);
                iswVar.d(arrayList2);
                Object obj5 = iswVar.a;
                if (obj5 != null && (obj2 = iswVar.b) != null) {
                    idrVar2.u = idrVar2.k.submit(afwl.i(new hhy(obj4, new ieh((agke) obj5, (agke) obj2), 5)));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (iswVar.a == null) {
                    sb.append(" watchNextResponsesWithPlaylistPanel");
                }
                if (iswVar.b == null) {
                    sb.append(" musicQueueResponses");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 10:
                aayw aaywVar = (aayw) obj;
                wgi wgiVar = aaywVar.d;
                if (wgiVar == null || (aoujVarAb = fhz.ab(wgiVar.a)) == null) {
                    return;
                }
                if ((aoujVarAb.c & 2) != 0) {
                    alayVar = aoujVarAb.f;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                } else {
                    alayVar = null;
                }
                Spanned spannedK = ackj.k(null, alayVar, null, false);
                if ((aoujVarAb.c & 262144) != 0) {
                    alayVar2 = aoujVarAb.m;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
                String string = spannedK == null ? null : spannedK.toString();
                idr idrVar3 = (idr) this.a;
                idrVar3.w = string;
                idrVar3.x = spannedK2 != null ? spannedK2.toString() : null;
                byte[] bArrD = wgiVar.d();
                idrVar3.n.clear();
                idrVar3.a(bArrD);
                if (idrVar3.F.n()) {
                    return;
                }
                idrVar3.z = aaywVar.e;
                return;
            case 11:
                ((idr) this.a).z = ((abnl) ((Optional) obj).get()).b;
                return;
            case 12:
                ibh ibhVar = (ibh) obj;
                ((idr) this.a).l.e(ibhVar);
                agrx agrxVar2 = agso.a;
                int i2 = ibhVar.g;
                return;
            case 13:
                agrx agrxVar3 = agso.a;
                Object obj6 = this.a;
                Runnable runnableI = afwl.i(new hqa(obj6, (aimm) obj, i));
                idr idrVar4 = (idr) obj6;
                idrVar4.v = idrVar4.k.submit(runnableI);
                return;
            case 14:
                Object obj7 = this.a;
                idr idrVar5 = (idr) obj7;
                acdq acdqVar = idrVar5.h;
                if (!ibg.c(acdqVar)) {
                    ibg ibgVar = idrVar5.m;
                    aihf aihfVarCreateBuilder = aima.a.createBuilder();
                    long epochMilli = ibgVar.b.f().toEpochMilli();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar2 = (aima) aihfVarCreateBuilder.instance;
                    aimaVar2.b |= 1;
                    aimaVar2.c = epochMilli;
                    String string2 = acdqVar.u().toString();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar3 = (aima) aihfVarCreateBuilder.instance;
                    string2.getClass();
                    aimaVar3.b |= 2;
                    aimaVar3.d = string2;
                    String string3 = acdqVar.t().toString();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar4 = (aima) aihfVarCreateBuilder.instance;
                    string3.getClass();
                    aimaVar4.b |= 4;
                    aimaVar4.e = string3;
                    String string4 = acdqVar.s().toString();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar5 = (aima) aihfVarCreateBuilder.instance;
                    string4.getClass();
                    aimaVar5.b |= 8;
                    aimaVar5.f = string4;
                    long jN = acdqVar.n();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar6 = (aima) aihfVarCreateBuilder.instance;
                    aimaVar6.b |= 16;
                    aimaVar6.g = jN;
                    aqmh aqmhVarL = acdqVar.L().l();
                    aihfVarCreateBuilder.copyOnWrite();
                    aima aimaVar7 = (aima) aihfVarCreateBuilder.instance;
                    aqmhVarL.getClass();
                    aimaVar7.h = aqmhVarL;
                    aimaVar7.b |= 32;
                    aimaVar = (aima) aihfVarCreateBuilder.build();
                }
                if (aimaVar != null) {
                    idrVar5.t = idrVar5.k.submit(afwl.i(new hhy(obj7, aimaVar, 4)));
                    return;
                }
                return;
            case 15:
                idr idrVar6 = (idr) this.a;
                if (idrVar6.w()) {
                    avnr.b((AtomicReference) idrVar6.q);
                }
                if (idrVar6.v()) {
                    idrVar6.r.cancel(false);
                }
                idrVar6.t();
                return;
            case 16:
                wgi wgiVar2 = ((aayw) obj).d;
                if (wgiVar2 != null) {
                    ((idy) this.a).b(wgiVar2.a);
                    return;
                }
                return;
            case 17:
                icw icwVar = (icw) obj;
                int iA = icwVar.a();
                Object obj8 = this.a;
                if (iA != 2) {
                    if (icwVar.a() == 1) {
                        ((idy) obj8).b(icwVar.a);
                        return;
                    }
                    return;
                }
                alss alssVar = icwVar.b;
                if (alssVar != null) {
                    idy idyVar = (idy) obj8;
                    StatusOr statusOrA = idyVar.a(alssVar.toByteArray());
                    if (statusOrA.hasValue) {
                        idr idrVar7 = idyVar.c;
                        byte[] bArr = (byte[]) statusOrA.value;
                        bArr.getClass();
                        idrVar7.q(aigj.v(bArr));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                this.a.invoke(obj);
                return;
            case 19:
                this.a.invoke(obj);
                return;
            default:
                this.a.invoke(obj);
                return;
        }
    }
}
