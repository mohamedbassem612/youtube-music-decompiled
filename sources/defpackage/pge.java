package defpackage;

import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pge implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pge(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75, types: [acip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, rmd] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, ulj] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Exception {
        long jO;
        boolean z;
        CuePointDataProviderWrapper cuePointDataProviderWrapperA;
        acga acgaVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                ((pgh) this.a).c.d((dpt) obj, this.b);
                return awmy.a;
            case 1:
                dpb dpbVarA = ((dpt) obj).a((String) this.b);
                try {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        dpbVarA.i(i, (String) it.next());
                        i++;
                    }
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "thread_id");
                    int iM3 = ape.m(dpbVarA, "last_updated_version");
                    int iM4 = ape.m(dpbVarA, "read_state");
                    int iM5 = ape.m(dpbVarA, "deletion_status");
                    int iM6 = ape.m(dpbVarA, "count_behavior");
                    int iM7 = ape.m(dpbVarA, "system_tray_behavior");
                    int iM8 = ape.m(dpbVarA, "modified_timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        long jB = dpbVarA.b(iM);
                        String strD = dpbVarA.d(iM2);
                        long jB2 = dpbVarA.b(iM3);
                        int i2 = iM2;
                        int i3 = iM3;
                        int iB = aiep.b((int) dpbVarA.b(iM4));
                        if (iB == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.ReadState', but it was NULL.");
                        }
                        aidu aiduVarA = aidu.a((int) dpbVarA.b(iM5));
                        if (aiduVarA == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.DeletionStatus', but it was NULL.");
                        }
                        int iAS = a.aS((int) dpbVarA.b(iM6));
                        if (iAS == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.CountBehavior', but it was NULL.");
                        }
                        int iAS2 = a.aS((int) dpbVarA.b(iM7));
                        if (iAS2 == 0) {
                            throw new IllegalStateException("Expected NON-NULL 'com.google.notifications.frontend.data.common.SystemTrayBehavior', but it was NULL.");
                        }
                        arrayList.add(new pgc(jB, strD, jB2, iB, aiduVarA, iAS, iAS2, dpbVarA.b(iM8)));
                        iM2 = i2;
                        iM3 = i3;
                    }
                    dpbVarA.close();
                    return arrayList;
                } catch (Throwable th) {
                    dpbVarA.close();
                    throw th;
                }
            case 2:
                ((ptg) this.b).b.c((dpt) obj, this.a);
                return awmy.a;
            case 3:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dma dmaVar = ((pvk) this.b).a;
                ?? r0 = this.a;
                dpb dpbVarA2 = dptVar.a("INSERT OR ABORT INTO `gnp_accounts` (`id`,`account_specific_id`,`account_type`,`obfuscated_gaia_id`,`actual_account_name`,`actual_account_oid`,`registration_status`,`registration_id`,`sync_sources`,`representative_target_id`,`sync_version`,`last_registration_time_ms`,`last_registration_request_hash`,`first_registration_version`,`internal_target_id`,`fitbit_decoded_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    int i4 = ((agpi) r0).d;
                    Long[] lArr = new Long[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        Object obj2 = r0.get(i5);
                        if (obj2 != null) {
                            dmaVar.b(dpbVarA2, obj2);
                            dpbVarA2.l();
                            dpbVarA2.j();
                            jO = ape.o(dptVar);
                        } else {
                            jO = -1;
                        }
                        lArr[i5] = Long.valueOf(jO);
                    }
                    JniZero.j(dpbVarA2, null);
                    return lArr;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        JniZero.j(dpbVarA2, th2);
                        throw th3;
                    }
                }
            case 4:
                return Integer.valueOf(((pvk) this.b).b.c((dpt) obj, this.a));
            case 5:
                return Integer.valueOf(((pvk) this.b).b.c((dpt) obj, this.a));
            case 6:
                return ((pvk) this.b).a.c((dpt) obj, this.a);
            case 7:
                dpb dpbVarA3 = ((dpt) obj).a("DELETE FROM gnp_experiments WHERE experiment_source = ? AND experiment_type = ? AND insertion_time <= ? ");
                Object obj3 = this.b;
                Object obj4 = this.a;
                try {
                    dpbVarA3.g(1, qnl.al(3));
                    dpbVarA3.g(2, qnl.ai((ptj) obj3));
                    dpbVarA3.g(3, ((Instant) obj4).toEpochMilli());
                    dpbVarA3.l();
                    return awmy.a;
                } finally {
                    dpbVarA3.close();
                }
            case 8:
                return ((pvu) this.b).b.c((dpt) obj, this.a);
            case 9:
                ((afig) obj).getClass();
                return afxd.f(((tld) this.b).a.a((rlt) this.a)).g(new onn(new prq(9), 18), MoreExecutors.directExecutor());
            case 10:
                Object obj5 = this.a;
                teq teqVar = (teq) this.b;
                awro.t(teqVar.a, teqVar.b, 0, new tiy(teqVar, (tew) obj5, (awoq) null, 1), 2);
                return awmy.a;
            case 11:
                Optional optional = (Optional) obj;
                optional.getClass();
                ugn ugnVar = (ugn) awrc.f(optional);
                if (ugnVar != null) {
                    z = false;
                } else {
                    ugnVar = null;
                    z = true;
                }
                String str = ugnVar != null ? ugnVar.a : null;
                Object obj6 = this.b;
                ((umy) this.a).a = umw.a(new umw(str, !z, 65), obj6 != null ? ((tss) obj6).c() : false);
                return awmy.a;
            case 12:
                augj augjVar = (augj) obj;
                augjVar.getClass();
                jrq jrqVar = (jrq) augjVar.toBuilder();
                jrqVar.getClass();
                aikl<augi> aiklVarD = atqo.D(jrqVar);
                ArrayList arrayList2 = new ArrayList(atqq.N(aiklVarD, 10));
                for (augi augiVar : aiklVarD) {
                    Object obj7 = this.b;
                    Object obj8 = this.a;
                    if (augiVar.c != ((augy) obj8).e) {
                        obj7 = augiVar;
                    }
                    arrayList2.add(obj7);
                }
                atqo.D(jrqVar);
                atqo.F(jrqVar);
                atqo.D(jrqVar);
                jrqVar.i(arrayList2);
                return atqo.E(jrqVar);
            case 13:
                uvq uvqVar = (uvq) obj;
                uvqVar.getClass();
                ?? r2 = ((abix) this.b).d;
                Duration durationC = ahng.C(r2.k().f());
                Duration durationC2 = ahng.C(r2.k().g());
                Object obj9 = this.a;
                obj9.getClass();
                return uvq.a(uvqVar, durationC, durationC2, ((Boolean) obj9).booleanValue(), 0, 8);
            case 14:
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    twu.d("AddedSoundCmpListener", 6, "Failed to refresh GSSV metadata", th4);
                }
                ((vdv) this.a).f.u(((ugn) this.b).a);
                return awmy.a;
            case 15:
                Throwable th5 = (Throwable) obj;
                if (th5 != null) {
                    twu.d("AddedSoundCmpListener", 6, "Failed to update music controller with resolved source", th5);
                }
                ((vdv) this.a).f.u(((ugn) this.b).a);
                return awmy.a;
            case 16:
                zrh zrhVar = (zrh) obj;
                zrhVar.getClass();
                dd ddVar = zrhVar.b;
                ddVar.J(new dc(ddVar, (String) this.b), false);
                zrhVar.d = true;
                ddVar.J(new db(ddVar, (String) this.a), false);
                zrhVar.d = false;
                return awmy.a;
            case 17:
                aciz acizVar = ((aaxm) obj).a;
                if (acizVar != null) {
                    CuePointDataProviderWrapper.Holder holder = (CuePointDataProviderWrapper.Holder) ((ConcurrentHashMap) ((abfv) this.b).b).get(this.a.au());
                    if (holder != null && (cuePointDataProviderWrapperA = holder.a()) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = acizVar.a.iterator();
                        while (it2.hasNext()) {
                            ?? r5 = ((ijt) it2.next()).a;
                            r5.getClass();
                            atqq.aA(arrayList3, r5);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            String str2 = ((aciw) it3.next()).m;
                            if (str2 != null) {
                                arrayList4.add(str2);
                            }
                        }
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            cuePointDataProviderWrapperA.a((String) it4.next(), CuePointDataProviderWrapper.CuePointStatus.DELETED, null);
                        }
                        Iterator it5 = acizVar.b.iterator();
                        while (it5.hasNext()) {
                            ?? r3 = ((ijt) it5.next()).a;
                            r3.getClass();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj10 : r3) {
                                aciw aciwVar = (aciw) obj10;
                                if (aciwVar.k != null && aciwVar.m != null && aciwVar.h != null) {
                                    arrayList5.add(obj10);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj11 : arrayList5) {
                                String str3 = ((aciw) obj11).m;
                                str3.getClass();
                                Object arrayList6 = linkedHashMap.get(str3);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                    linkedHashMap.put(str3, arrayList6);
                                }
                                ((List) arrayList6).add(obj11);
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                String str4 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                aigj aigjVar = ((aciw) atqq.X(list)).k;
                                aigjVar.getClass();
                                ArrayList arrayList7 = new ArrayList(atqq.N(list, 10));
                                Iterator it6 = list.iterator();
                                while (it6.hasNext()) {
                                    String str5 = ((aciw) it6.next()).h;
                                    str5.getClass();
                                    arrayList7.add(str5);
                                }
                                cuePointDataProviderWrapperA.a(str4, CuePointDataProviderWrapper.CuePointStatus.OK, new CuePointDataProviderWrapper.AdConfigData(aigjVar, arrayList7));
                            }
                        }
                    }
                }
                return awmy.a;
            case 18:
                aenn aennVar = (aenn) obj;
                aennVar.getClass();
                aennVar.d = (String) this.a;
                aennVar.h = 3832;
                abec abecVar = ((abek) this.b).f;
                if (abecVar != null) {
                    String str6 = abecVar.a;
                    if (str6 != null) {
                        aennVar.f = str6;
                    }
                    xhc xhcVar = abecVar.b;
                    if (xhcVar != null) {
                        aennVar.i = Integer.valueOf(xhcVar.a);
                    }
                }
                return awmy.a;
            case 19:
                abii.a((abii) this.b, "Error in playerStateEventSink subscription for cpn: ".concat(String.valueOf(this.a)), (Throwable) obj, null, 4);
                return awmy.a;
            default:
                int i6 = ((aazn) obj).a;
                if (i6 == 2 || i6 == 8 || i6 == 7) {
                    Object obj12 = this.a;
                    abii abiiVar = (abii) this.b;
                    xsc xscVar = (xsc) abiiVar.a.io();
                    obj12.getClass();
                    wjj wjjVarU = xscVar.u((String) obj12);
                    if (wjjVarU != null && wjjVarU.a) {
                        acfx acfxVar = (acfx) abiiVar.e.remove(obj12);
                        if (acfxVar != null && (acgaVar = abiiVar.g) != null) {
                            acgaVar.n(acfxVar);
                        }
                        avmn avmnVar = (avmn) abiiVar.f.remove(obj12);
                        if (avmnVar != null) {
                            avmnVar.dispose();
                        }
                    }
                }
                return awmy.a;
        }
    }

    public /* synthetic */ pge(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
