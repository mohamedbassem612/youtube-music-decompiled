package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.ErrorPolicy;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.ProcessState;
import com.google.android.libraries.elements.interfaces.ResourceCheck;
import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourceMetadata;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import com.google.android.libraries.elements.interfaces.ResourceSource;
import com.google.android.libraries.elements.interfaces.ResourceStatus;
import com.google.android.libraries.elements.interfaces.ResourceType;
import com.google.android.libraries.elements.interfaces.StatusInResponse;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczb implements wlc {
    public final nuc a;
    public final xit b;
    public final agfr c;
    public final Set d = DesugarCollections.synchronizedSet(new HashSet());
    public final aunn e;
    public final aunn f;
    public final avmb g;
    public boolean h;
    public boolean i;
    public final vxz j;
    public final vxz k;
    private final aunn l;
    private final tre m;
    private final agfr n;
    private final avmb o;
    private final Executor p;
    private final acyn q;
    private final boolean r;
    private final xil s;
    private final adam t;
    private final aess u;

    public aczb(nuc nucVar, aunn aunnVar, aunn aunnVar2, vxz vxzVar, tre treVar, vxz vxzVar2, adam adamVar, xil xilVar, xit xitVar, tqj tqjVar, aunn aunnVar3, abxu abxuVar, aess aessVar, acyn acynVar) {
        new AtomicBoolean(false);
        this.a = nucVar;
        this.l = aunnVar;
        this.e = aunnVar2;
        this.k = vxzVar;
        this.m = treVar;
        this.t = adamVar;
        this.s = xilVar;
        this.b = xitVar;
        xitVar.getClass();
        agfr agfrVarAl = aguu.al(new yyp(xitVar, 16));
        this.c = agfrVarAl;
        int i = tqr.a;
        if (!tqjVar.k(1073814459)) {
        }
        this.r = tqjVar.k(1073815716);
        this.j = vxzVar2;
        this.n = aguu.al(new yyp(this, 17));
        this.u = aessVar;
        this.q = acynVar;
        this.f = aunnVar3;
        this.g = (avmb) abxuVar.x().c;
        this.o = (avmb) abxuVar.x().d;
        this.p = (Executor) abxuVar.u().d;
    }

    static asnb g(Status status) {
        aihf aihfVarCreateBuilder = asnb.a.createBuilder();
        int iValue = status.getCode().value();
        aihfVarCreateBuilder.copyOnWrite();
        asnb asnbVar = (asnb) aihfVarCreateBuilder.instance;
        asnbVar.b |= 1;
        asnbVar.c = iValue;
        if (!ahno.aa(status.getDescription())) {
            String description = status.getDescription();
            aihfVarCreateBuilder.copyOnWrite();
            asnb asnbVar2 = (asnb) aihfVarCreateBuilder.instance;
            description.getClass();
            asnbVar2.b |= 2;
            asnbVar2.d = description;
        }
        return (asnb) aihfVarCreateBuilder.build();
    }

    public static final akso l(albe albeVar) {
        aihl aihlVar = akso.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        albeVar.c(aihlVarCheckIsLite);
        if (!albeVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        albeVar.c(aihlVarCheckIsLite2);
        Object objK = albeVar.j.k(aihlVarCheckIsLite2.d);
        return (akso) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    private final void m(boolean z) {
        if (z) {
            agev agevVarA = this.s.a(nzs.FUT_PROCESSING.x);
            if (agevVarA.g()) {
                xit xitVar = this.b;
                xitVar.s(71, xitVar.f(), (String) this.c.io(), (amix) agevVarA.c());
            }
        }
    }

    private final void n(boolean z) {
        this.n.io();
        if (z) {
            this.s.b(nzs.FUT_PROCESSING.x);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Type inference failed for: r5v50, types: [acxk, java.lang.Object] */
    private final void o(akso aksoVar, final agfr agfrVar) {
        int i;
        StatusInResponse statusInResponse;
        asnc asncVar;
        Instant instantA;
        if ((aksoVar.c & 1) != 0) {
            aksp akspVar = aksoVar.e;
            if (akspVar == null) {
                akspVar = aksp.a;
            }
            aijp aijpVar = akspVar.b;
            if (aijpVar == null) {
                aijpVar = aijp.a;
            }
            aess aessVar = this.u;
            Instant instantAx = ahng.ax(aijpVar);
            Duration duration = (Duration) aessVar.e;
            if (duration.isZero() || (instantA = aessVar.c.a()) == null) {
                asncVar = null;
            } else {
                Duration durationBetween = Duration.between(instantAx, instantA);
                if (!a.y(duration) || durationBetween.compareTo(duration) > 0) {
                    aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                    aslh aslhVar = aslh.LOG_TYPE_ELEMENTS_RESPONSE_AGE_WARNING;
                    aihfVarCreateBuilder.copyOnWrite();
                    asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                    asncVar2.d = aslhVar.I;
                    asncVar2.b |= 2;
                    int days = (int) durationBetween.toDays();
                    aihfVarCreateBuilder.copyOnWrite();
                    asnc asncVar3 = (asnc) aihfVarCreateBuilder.instance;
                    asncVar3.b |= SemanticState.Multiline;
                    asncVar3.q = days;
                    asncVar = (asnc) aihfVarCreateBuilder.build();
                } else {
                    asncVar = null;
                }
            }
            if (asncVar != null) {
                this.a.e(asncVar, new Throwable(), "", new Object[0]);
            }
        }
        afwt.i(wln.b, Integer.valueOf(aksoVar.getSerializedSize()));
        afwt.i(wln.f, Integer.valueOf(aksoVar.d.size()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<arhn> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<aqld> arrayList5 = new ArrayList();
        ArrayList<ajoc> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        final TreeSet treeSet = new TreeSet();
        int i2 = 1;
        HashSet hashSet = new HashSet();
        Iterator it = aksoVar.d.iterator();
        while (true) {
            i2 = i2;
            if (!it.hasNext()) {
                break;
            }
            aksn aksnVar = (aksn) it.next();
            aihl aihlVar = aqkd.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            aksnVar.c(aihlVarCheckIsLite);
            if (aksnVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                aksnVar.c(aihlVarCheckIsLite2);
                Object objK = aksnVar.j.k(aihlVarCheckIsLite2.d);
                arrayList.add((aqkd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            } else {
                aihl aihlVar2 = albd.b;
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                aksnVar.c(aihlVarCheckIsLite3);
                if (aksnVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                    aksnVar.c(aihlVarCheckIsLite4);
                    Object objK2 = aksnVar.j.k(aihlVarCheckIsLite4.d);
                    arrayList2.add((albd) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
                } else {
                    aihl aihlVar3 = arhn.b;
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar3);
                    aksnVar.c(aihlVarCheckIsLite5);
                    if (aksnVar.j.n(aihlVarCheckIsLite5.d)) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
                        aksnVar.c(aihlVarCheckIsLite6);
                        Object objK3 = aksnVar.j.k(aihlVarCheckIsLite6.d);
                        arrayList3.add((arhn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
                    } else {
                        aihl aihlVar4 = amgq.b;
                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar4);
                        aksnVar.c(aihlVarCheckIsLite7);
                        if (aksnVar.j.n(aihlVarCheckIsLite7.d)) {
                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar4);
                            aksnVar.c(aihlVarCheckIsLite8);
                            Object objK4 = aksnVar.j.k(aihlVarCheckIsLite8.d);
                            arrayList4.add((amgq) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4)));
                        } else {
                            aihl aihlVar5 = aqld.b;
                            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar5);
                            aksnVar.c(aihlVarCheckIsLite9);
                            if (aksnVar.j.n(aihlVarCheckIsLite9.d)) {
                                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar5);
                                aksnVar.c(aihlVarCheckIsLite10);
                                Object objK5 = aksnVar.j.k(aihlVarCheckIsLite10.d);
                                arrayList5.add((aqld) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5)));
                            } else {
                                aihl aihlVar6 = ajoc.b;
                                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aihlVar6);
                                aksnVar.c(aihlVarCheckIsLite11);
                                if (aksnVar.j.n(aihlVarCheckIsLite11.d)) {
                                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aihlVar6);
                                    aksnVar.c(aihlVarCheckIsLite12);
                                    Object objK6 = aksnVar.j.k(aihlVarCheckIsLite12.d);
                                    arrayList6.add((ajoc) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6)));
                                } else {
                                    aihl aihlVar7 = apkq.b;
                                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(aihlVar7);
                                    aksnVar.c(aihlVarCheckIsLite13);
                                    if (aksnVar.j.n(aihlVarCheckIsLite13.d)) {
                                        aihl aihlVarCheckIsLite14 = aihn.checkIsLite(aihlVar7);
                                        aksnVar.c(aihlVarCheckIsLite14);
                                        Object objK7 = aksnVar.j.k(aihlVarCheckIsLite14.d);
                                        apkq apkqVar = (apkq) (objK7 == null ? aihlVarCheckIsLite14.b : aihlVarCheckIsLite14.c(objK7));
                                        ArrayList arrayList8 = new ArrayList();
                                        for (apkp apkpVar : apkqVar.c) {
                                            String str = apkpVar.b;
                                            Iterator it2 = it;
                                            ArrayList arrayList9 = arrayList;
                                            int iBt = a.bt(apkpVar.c);
                                            if (iBt == 0) {
                                                iBt = i2;
                                            }
                                            ArrayList arrayList10 = arrayList2;
                                            if (iBt == 3) {
                                                statusInResponse = StatusInResponse.ATTACHED;
                                            } else if (iBt == 2) {
                                                statusInResponse = StatusInResponse.OMITTED;
                                            } else if (iBt == 4) {
                                                statusInResponse = StatusInResponse.OMITTED_BY_SRS_HISTORY;
                                            } else if (iBt == 5) {
                                                statusInResponse = StatusInResponse.OMITTED_BY_EML_MOBSERVE;
                                            } else {
                                                statusInResponse = iBt == 6 ? StatusInResponse.OMITTED_BY_STREAM : StatusInResponse.UNKNOWN;
                                            }
                                            arrayList8.add(new ResourceStatus(str, statusInResponse, apkqVar.e));
                                            if (k()) {
                                                int iBt2 = a.bt(apkpVar.c);
                                                if (iBt2 == 0) {
                                                    iBt2 = i2;
                                                }
                                                if ((iBt2 == 2 || iBt2 == 4) && !this.d.contains(str)) {
                                                    treeSet.add(str);
                                                }
                                            }
                                            if (k()) {
                                                int iBt3 = a.bt(apkpVar.c);
                                                if (iBt3 == 0) {
                                                    iBt3 = i2;
                                                }
                                                if ((iBt3 == 2 || iBt3 == 4 || iBt3 == 5) && !this.d.contains(str) && this.i) {
                                                    hashSet.add(str);
                                                }
                                            }
                                            it = it2;
                                            arrayList = arrayList9;
                                            arrayList2 = arrayList10;
                                        }
                                        ((ResourceLoader) agfrVar.io()).updateResourceStatus(new ResourceCheck(apkqVar.d, arrayList8));
                                        it = it;
                                        arrayList = arrayList;
                                    } else {
                                        Iterator it3 = it;
                                        ArrayList arrayList11 = arrayList;
                                        ArrayList arrayList12 = arrayList2;
                                        aihl aihlVar8 = aoye.b;
                                        aihl aihlVarCheckIsLite15 = aihn.checkIsLite(aihlVar8);
                                        aksnVar.c(aihlVarCheckIsLite15);
                                        if (aksnVar.j.n(aihlVarCheckIsLite15.d)) {
                                            aihl aihlVarCheckIsLite16 = aihn.checkIsLite(aihlVar8);
                                            aksnVar.c(aihlVarCheckIsLite16);
                                            Object objK8 = aksnVar.j.k(aihlVarCheckIsLite16.d);
                                            arrayList7.add((aoye) (objK8 == null ? aihlVarCheckIsLite16.b : aihlVarCheckIsLite16.c(objK8)));
                                        }
                                        it = it3;
                                        arrayList = arrayList11;
                                        arrayList2 = arrayList12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ArrayList<aqkd> arrayList13 = arrayList;
        ArrayList<albd> arrayList14 = arrayList2;
        if (!arrayList13.isEmpty() || !arrayList14.isEmpty() || !arrayList3.isEmpty() || !arrayList4.isEmpty() || !arrayList5.isEmpty() || !arrayList6.isEmpty() || !treeSet.isEmpty() || !hashSet.isEmpty()) {
            ArrayList arrayList15 = new ArrayList();
            for (aqkd aqkdVar : arrayList13) {
                if (!this.d.contains(aqkdVar.f)) {
                    boolean z = this.r;
                    ArrayList arrayList16 = new ArrayList(aqkdVar.h);
                    String str2 = aqkdVar.f;
                    int iAS = a.aS(aqkdVar.i);
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(str2, (iAS == 0 || iAS != 3) ? ResourceType.EKO_TEMPLATE : ResourceType.WASM_TEMPLATE, (aqkdVar.c & 2) != 0 ? Long.valueOf(aqkdVar.g) : null, arrayList16, null, false, ResourceSource.RESPONSE_INLINE), q(aqkdVar.d == 2 ? (aigj) aqkdVar.e : aigj.d, z)));
                }
            }
            for (albd albdVar : arrayList14) {
                if (!this.d.contains(albdVar.d)) {
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(albdVar.d, ResourceType.FRAGMENT, (albdVar.c & 4) != 0 ? Long.valueOf(albdVar.g) : null, new ArrayList(albdVar.f), null, false, ResourceSource.RESPONSE_INLINE), q(albdVar.e, this.r)));
                }
            }
            for (arhn arhnVar : arrayList3) {
                if (!this.d.contains(arhnVar.d)) {
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(arhnVar.d, ResourceType.WASM_FRAGMENT, (arhnVar.c & 4) != 0 ? Long.valueOf(arhnVar.g) : null, new ArrayList(arhnVar.f), null, false, ResourceSource.RESPONSE_INLINE), q(arhnVar.e, this.r)));
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                amgq amgqVar = (amgq) it4.next();
                int i3 = 0;
                for (amgp amgpVar : amgqVar.c) {
                    if (!this.d.contains(amgpVar.c)) {
                        Iterator it5 = it4;
                        arrayList15.add(new ResourceEntry(new ResourceMetadata(amgpVar.c, ResourceType.JAVASCRIPT_MODULE, (amgpVar.b & 4) != 0 ? Long.valueOf(amgpVar.f) : null, new ArrayList(amgpVar.e), amgqVar.e, amgqVar.f, ResourceSource.RESPONSE_INLINE), q(amgpVar.d, this.r)));
                        hashSet = hashSet;
                        i3 = i2;
                        it4 = it5;
                    }
                }
                Iterator it6 = it4;
                HashSet hashSet2 = hashSet;
                if (i3 != 0 && !this.d.contains(amgqVar.e)) {
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(amgqVar.e, ResourceType.CERTIFICATE, null, new ArrayList(), null, false, ResourceSource.RESPONSE_INLINE), q(amgqVar.d, this.r)));
                }
                hashSet = hashSet2;
                it4 = it6;
            }
            final HashSet hashSet3 = hashSet;
            for (aqld aqldVar : arrayList5) {
                if (!this.d.contains(aqldVar.d)) {
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(aqldVar.d, ResourceType.THEME, (aqldVar.c & 2) != 0 ? Long.valueOf(aqldVar.e) : null, new ArrayList(), null, false, ResourceSource.RESPONSE_INLINE), q(aqldVar.f, this.r)));
                }
            }
            for (ajoc ajocVar : arrayList6) {
                if (!this.d.contains(ajocVar.d)) {
                    arrayList15.add(new ResourceEntry(new ResourceMetadata(ajocVar.d, ResourceType.CAPABILITIES, (ajocVar.c & 4) != 0 ? Long.valueOf(ajocVar.f) : null, new ArrayList(), null, false, ResourceSource.RESPONSE_INLINE), q(ajocVar.e, this.r)));
                }
            }
            if ((this.i || !arrayList15.isEmpty() || !treeSet.isEmpty()) && (!this.i || !arrayList15.isEmpty() || !hashSet3.isEmpty())) {
                int size = this.i ? hashSet3.size() : treeSet.size();
                vxz vxzVar = this.k;
                if (vxzVar.l(207, 45643411L, false)) {
                    nuc nucVar = this.a;
                    aslh aslhVar2 = aslh.LOG_TYPE_RESOURCE_WARNING;
                    nsl nslVar = nsl.a;
                    Throwable th = new Throwable();
                    Integer numValueOf = Integer.valueOf(arrayList13.size());
                    Integer numValueOf2 = Integer.valueOf(arrayList4.size());
                    Integer numValueOf3 = Integer.valueOf(arrayList5.size());
                    Integer numValueOf4 = Integer.valueOf(arrayList6.size());
                    Integer numValueOf5 = Integer.valueOf(size);
                    Integer numValueOf6 = Integer.valueOf(arrayList15.size());
                    Object[] objArr = new Object[6];
                    objArr[0] = numValueOf;
                    objArr[i2] = numValueOf2;
                    objArr[2] = numValueOf3;
                    objArr[3] = numValueOf4;
                    objArr[4] = numValueOf5;
                    objArr[5] = numValueOf6;
                    nucVar.f(aslhVar2, nslVar, th, "Elements context gathering for parsing logic: templateUpdates: %d, jsUpdates: %d, themeUpdates: %d, capabilitiesUpdates: %d, omittedResourceIds: %d, resourceEntries: %d", objArr);
                }
                if (this.h && !vxzVar.l(105, 45413859L, false)) {
                    i(treeSet, (ResourceLoader) agfrVar.io());
                }
                if (!arrayList15.isEmpty()) {
                    Status statusHandleResources = ((ResourceLoader) agfrVar.io()).handleResources(arrayList15);
                    if (!statusHandleResources.e()) {
                        nuc nucVar2 = this.a;
                        aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                        aslh aslhVar3 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                        aihfVarCreateBuilder2.copyOnWrite();
                        asnc asncVar4 = (asnc) aihfVarCreateBuilder2.instance;
                        asncVar4.d = aslhVar3.I;
                        asncVar4.b |= 2;
                        asnb asnbVarG = g(statusHandleResources);
                        aihfVarCreateBuilder2.copyOnWrite();
                        asnc asncVar5 = (asnc) aihfVarCreateBuilder2.instance;
                        asnbVarG.getClass();
                        asncVar5.j = asnbVarG;
                        asncVar5.b |= 64;
                        nucVar2.b((asnc) aihfVarCreateBuilder2.build(), "SRS failed to handle resources!", new Object[0]);
                    }
                }
                final ResourcePreloader preloader = ((ResourceLoader) agfrVar.io()).getPreloader();
                if (preloader == null) {
                    nuc nucVar3 = this.a;
                    aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                    aslh aslhVar4 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                    aihfVarCreateBuilder3.copyOnWrite();
                    asnc asncVar6 = (asnc) aihfVarCreateBuilder3.instance;
                    asncVar6.d = aslhVar4.I;
                    asncVar6.b |= 2;
                    nucVar3.b((asnc) aihfVarCreateBuilder3.build(), "SRS preloader is null", new Object[0]);
                } else {
                    if (this.i && !vxzVar.l(105, 45413859L, false)) {
                        if (vxzVar.l(494, 45827565L, false)) {
                            this.m.h.d().E(new mgd(this, preloader, hashSet3, 14, (char[]) null));
                        } else {
                            h(preloader, hashSet3);
                        }
                    }
                    Runnable runnable = new Runnable() { // from class: acza
                        @Override // java.lang.Runnable
                        public final void run() {
                            aczb aczbVar = this.a;
                            if (aczbVar.h && aczbVar.k.l(105, 45413859L, false)) {
                                aczbVar.i(treeSet, (ResourceLoader) agfrVar.io());
                            }
                            ResourcePreloader resourcePreloader = preloader;
                            if (aczbVar.i && aczbVar.k.l(105, 45413859L, false)) {
                                aczbVar.h(resourcePreloader, hashSet3);
                            }
                            Status statusLoadAll = resourcePreloader.loadAll();
                            if (statusLoadAll.e()) {
                                return;
                            }
                            nuc nucVar4 = aczbVar.a;
                            aihf aihfVarCreateBuilder4 = asnc.a.createBuilder();
                            aslh aslhVar5 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                            aihfVarCreateBuilder4.copyOnWrite();
                            asnc asncVar7 = (asnc) aihfVarCreateBuilder4.instance;
                            asncVar7.d = aslhVar5.I;
                            asncVar7.b |= 2;
                            asnb asnbVarG2 = aczb.g(statusLoadAll);
                            aihfVarCreateBuilder4.copyOnWrite();
                            asnc asncVar8 = (asnc) aihfVarCreateBuilder4.instance;
                            asnbVarG2.getClass();
                            asncVar8.j = asnbVarG2;
                            asncVar8.b |= 64;
                            nucVar4.b((asnc) aihfVarCreateBuilder4.build(), "SRS failed to load all resources asynchronously!", new Object[0]);
                        }
                    };
                    if (vxzVar.l(494, 45827565L, false)) {
                        this.m.h.d().r(this.o).E(new vtu(runnable, 18));
                    } else {
                        this.p.execute(runnable);
                    }
                }
            }
        }
        if (arrayList7.isEmpty()) {
            return;
        }
        JSController controller = ((JSEnvironment) this.l.io()).getController();
        if (controller == null) {
            nuc nucVar4 = this.a;
            aihf aihfVarCreateBuilder4 = asnc.a.createBuilder();
            aslh aslhVar5 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder4.copyOnWrite();
            asnc asncVar7 = (asnc) aihfVarCreateBuilder4.instance;
            asncVar7.d = aslhVar5.I;
            asncVar7.b |= 2;
            nucVar4.b((asnc) aihfVarCreateBuilder4.build(), "Elements attemped to execute preload instructions, but the JS Controller is null.", new Object[0]);
            return;
        }
        int size2 = arrayList7.size();
        int i4 = 0;
        while (i4 < size2) {
            Iterator it7 = ((aoye) arrayList7.get(i4)).c.iterator();
            while (true) {
                i = i4 + 1;
                if (it7.hasNext()) {
                    Status statusExecutePreloadInstruction = controller.executePreloadInstruction(q((aigj) it7.next(), this.r));
                    if (!statusExecutePreloadInstruction.e()) {
                        nuc nucVar5 = this.a;
                        aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
                        aslh aslhVar6 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
                        aihfVarCreateBuilder5.copyOnWrite();
                        asnc asncVar8 = (asnc) aihfVarCreateBuilder5.instance;
                        asncVar8.d = aslhVar6.I;
                        asncVar8.b |= 2;
                        asnb asnbVarG2 = g(statusExecutePreloadInstruction);
                        aihfVarCreateBuilder5.copyOnWrite();
                        asnc asncVar9 = (asnc) aihfVarCreateBuilder5.instance;
                        asnbVarG2.getClass();
                        asncVar9.j = asnbVarG2;
                        asncVar9.b |= 64;
                        nucVar5.b((asnc) aihfVarCreateBuilder5.build(), "Elements failed to execute preload instruction (part of a JS experiment).", new Object[0]);
                        return;
                    }
                }
            }
            i4 = i;
        }
    }

    private final boolean p() {
        return this.j.l(30, 45400787L, false) && this.t.a(nzs.FUT_PROCESSING);
    }

    private static byte[] q(aigj aigjVar, boolean z) {
        if (z) {
            byte[] bArrA = acxu.a(aigjVar);
            if (bArrA.length == aigjVar.d()) {
                return bArrA;
            }
        }
        return aigjVar.G();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [acxk, java.lang.Object] */
    @Override // defpackage.wlc
    public final wlf a(zwa zwaVar, albe albeVar) {
        Object obj;
        asnc asncVarA;
        wlf wlfVarT;
        Instant instantA;
        wlf wlfVar;
        afuu afuuVarC = afwt.c(94, "fut elements");
        try {
            boolean zP = p();
            n(zP);
            try {
                akso aksoVarL = l(albeVar);
                if (aksoVarL == null) {
                    wlfVar = wlf.a;
                } else {
                    acyn acynVar = this.q;
                    tqj tqjVar = acynVar.c;
                    int i = tqr.a;
                    int i2 = 0;
                    if (tqjVar.k(1073840074)) {
                        if (acynVar.b.compareAndSet(false, true)) {
                            acynVar.a.c(new ablh(20)).af(new acym(acynVar, i2));
                        }
                        obj = acynVar.d;
                    } else {
                        obj = ((aehn) acynVar.e.io()).a;
                    }
                    asnc asncVar = null;
                    if (!((agkz) obj).isEmpty()) {
                        Iterator it = aksoVarL.d.iterator();
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                asncVarA = null;
                                break;
                            }
                            aksn aksnVar = (aksn) it.next();
                            aihl aihlVar = aqkd.b;
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                            aksnVar.c(aihlVarCheckIsLite);
                            if (aksnVar.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                aksnVar.c(aihlVarCheckIsLite2);
                                Object objK = aksnVar.j.k(aihlVarCheckIsLite2.d);
                                String str = ((aqkd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).f;
                                if (((agkz) obj).contains(str)) {
                                    asncVarA = acyn.a(str);
                                    break;
                                }
                            } else {
                                aihl aihlVar2 = albd.b;
                                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                                aksnVar.c(aihlVarCheckIsLite3);
                                if (aksnVar.j.n(aihlVarCheckIsLite3.d)) {
                                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                                    aksnVar.c(aihlVarCheckIsLite4);
                                    Object objK2 = aksnVar.j.k(aihlVarCheckIsLite4.d);
                                    String str2 = ((albd) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).d;
                                    if (((agkz) obj).contains(str2)) {
                                        asncVarA = acyn.a(str2);
                                        break;
                                    }
                                } else {
                                    aihl aihlVar3 = arhn.b;
                                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar3);
                                    aksnVar.c(aihlVarCheckIsLite5);
                                    if (aksnVar.j.n(aihlVarCheckIsLite5.d)) {
                                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
                                        aksnVar.c(aihlVarCheckIsLite6);
                                        Object objK3 = aksnVar.j.k(aihlVarCheckIsLite6.d);
                                        String str3 = ((arhn) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).d;
                                        if (((agkz) obj).contains(str3)) {
                                            asncVarA = acyn.a(str3);
                                            break;
                                        }
                                    } else {
                                        aihl aihlVar4 = aqld.b;
                                        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar4);
                                        aksnVar.c(aihlVarCheckIsLite7);
                                        if (aksnVar.j.n(aihlVarCheckIsLite7.d)) {
                                            aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar4);
                                            aksnVar.c(aihlVarCheckIsLite8);
                                            Object objK4 = aksnVar.j.k(aihlVarCheckIsLite8.d);
                                            String str4 = ((aqld) (objK4 == null ? aihlVarCheckIsLite8.b : aihlVarCheckIsLite8.c(objK4))).d;
                                            if (((agkz) obj).contains(str4)) {
                                                asncVarA = acyn.a(str4);
                                                break;
                                            }
                                        } else {
                                            aihl aihlVar5 = ajoc.b;
                                            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar5);
                                            aksnVar.c(aihlVarCheckIsLite9);
                                            if (aksnVar.j.n(aihlVarCheckIsLite9.d)) {
                                                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar5);
                                                aksnVar.c(aihlVarCheckIsLite10);
                                                Object objK5 = aksnVar.j.k(aihlVarCheckIsLite10.d);
                                                String str5 = ((ajoc) (objK5 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK5))).d;
                                                if (((agkz) obj).contains(str5)) {
                                                    asncVarA = acyn.a(str5);
                                                    break;
                                                }
                                            } else {
                                                aihl aihlVar6 = amgq.b;
                                                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aihlVar6);
                                                aksnVar.c(aihlVarCheckIsLite11);
                                                if (aksnVar.j.n(aihlVarCheckIsLite11.d)) {
                                                    aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aihlVar6);
                                                    aksnVar.c(aihlVarCheckIsLite12);
                                                    Object objK6 = aksnVar.j.k(aihlVarCheckIsLite12.d);
                                                    Iterator it2 = ((amgq) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6))).c.iterator();
                                                    while (it2.hasNext()) {
                                                        String str6 = ((amgp) it2.next()).c;
                                                        if (((agkz) obj).contains(str6)) {
                                                            asncVarA = acyn.a(str6);
                                                            break loop0;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        asncVarA = null;
                        break;
                    }
                    if (asncVarA != null) {
                        this.a.b(asncVarA, "", new Object[0]);
                        wlfVarT = wlf.t("ElementsUpdate contains blocklisted resources.");
                    } else if ((aksoVarL.c & 1) != 0) {
                        aksp akspVar = aksoVarL.e;
                        if (akspVar == null) {
                            akspVar = aksp.a;
                        }
                        aijp aijpVar = akspVar.b;
                        if (aijpVar == null) {
                            aijpVar = aijp.a;
                        }
                        Instant instantAx = ahng.ax(aijpVar);
                        aess aessVar = this.u;
                        Object obj2 = aessVar.d;
                        if (!((Duration) obj2).isZero() && (instantA = aessVar.c.a()) != null) {
                            Duration durationBetween = Duration.between(instantAx, instantA);
                            if (durationBetween.compareTo((Duration) obj2) > 0 && (durationBetween.minus((Duration) obj2).compareTo((Duration) aessVar.f) > 0 || aessVar.a > ((Random) aessVar.b).nextInt(100))) {
                                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                aslh aslhVar = aslh.LOG_TYPE_ELEMENTS_RESPONSE_AGE_ERROR;
                                aihfVarCreateBuilder.copyOnWrite();
                                asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                                asncVar2.d = aslhVar.I;
                                asncVar2.b |= 2;
                                int days = (int) durationBetween.toDays();
                                aihfVarCreateBuilder.copyOnWrite();
                                asnc asncVar3 = (asnc) aihfVarCreateBuilder.instance;
                                asncVar3.b |= SemanticState.Multiline;
                                asncVar3.q = days;
                                asncVar = (asnc) aihfVarCreateBuilder.build();
                            }
                        }
                        if (asncVar != null) {
                            this.a.b(asncVar, "", new Object[0]);
                            wlfVarT = wlf.t("ElementsUpdate age is in violation of the Elements Resource SLA.");
                        } else {
                            wlfVarT = wlf.a;
                        }
                    } else {
                        wlfVarT = wlf.a;
                    }
                    if (wlfVarT.b == null) {
                        o(aksoVarL, new zaz(this, 19));
                        m(zP);
                    }
                    wlfVar = wlfVarT;
                }
                afuuVarC.close();
                return wlfVar;
            } catch (IOException e) {
                throw new nud("Failed to process FrameworkUpdateTransport", e);
            }
        } catch (Throwable th) {
            try {
                afuuVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wlc
    public final ListenableFuture b(Executor executor, zwa zwaVar, albe albeVar) {
        return ahcs.e(f(), afwl.a(new aaat(this, albeVar, 16, null)), executor);
    }

    @Override // defpackage.wlc
    public final void c(zwa zwaVar, albe albeVar) {
        j(albeVar, new yyp(this, 18));
    }

    @Override // defpackage.wlc
    public final boolean d(albe albeVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akso.b);
        albeVar.c(aihlVarCheckIsLite);
        return albeVar.j.n(aihlVarCheckIsLite.d);
    }

    @Deprecated
    public final ResourceLoader e() {
        return ((adak) this.e.io()).a();
    }

    public final ListenableFuture f() {
        return ((adak) this.e.io()).c();
    }

    public final void h(ResourcePreloader resourcePreloader, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        Status statusEnsureLoaded = resourcePreloader.ensureLoaded(hashSet, ProcessState.PARTIALLY_PROCESSED, ErrorPolicy.CONTINUE_ON_ERROR, null);
        if (statusEnsureLoaded.e()) {
            return;
        }
        nuc nucVar = this.a;
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        asnb asnbVarG = g(statusEnsureLoaded);
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        asnbVarG.getClass();
        asncVar2.j = asnbVarG;
        asncVar2.b |= 64;
        nucVar.b((asnc) aihfVarCreateBuilder.build(), "ELMCache: Failed to ensure resources are loaded.", new Object[0]);
    }

    public final void i(TreeSet treeSet, ResourceLoader resourceLoader) {
        if (treeSet.isEmpty()) {
            return;
        }
        vxz vxzVar = this.k;
        if (vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45421774L, false)) {
            return;
        }
        Status statusHandleOmittedResources = resourceLoader.handleOmittedResources(treeSet, vxzVar.l(199, 45634377L, false));
        if (statusHandleOmittedResources.e()) {
            return;
        }
        nuc nucVar = this.a;
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        asnb asnbVarG = g(statusHandleOmittedResources);
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        asnbVarG.getClass();
        asncVar2.j = asnbVarG;
        asncVar2.b |= 64;
        nucVar.b((asnc) aihfVarCreateBuilder.build(), "ELMCache: Failed to handle omitted resources.", new Object[0]);
    }

    public final void j(albe albeVar, agfr agfrVar) {
        afuu afuuVarD = afwt.d(93, "fut elements", afux.a, true);
        try {
            boolean zP = p();
            n(zP);
            try {
                akso aksoVarL = l(albeVar);
                if (aksoVarL != null) {
                    o(aksoVarL, agfrVar);
                    m(zP);
                }
                afuuVarD.close();
            } catch (IOException e) {
                throw new nud("Failed to process FrameworkUpdateTransport", e);
            }
        } catch (Throwable th) {
            try {
                afuuVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean k() {
        return ((adak) this.e.io()).e.get();
    }
}
