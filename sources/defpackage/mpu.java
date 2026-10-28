package defpackage;

import android.util.Pair;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpu implements nvr {
    private static final String a = "mpu";
    private static final AtomicInteger b = new AtomicInteger();
    private final nuc c;
    private final Map d;
    private final Map e;
    private final boolean f;
    private final boolean g;

    public mpu(Map map, Map map2, nuc nucVar, agev agevVar, agev agevVar2) {
        Boolean bool = Boolean.FALSE;
        this.f = ((Boolean) agevVar.e(bool)).booleanValue();
        this.g = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.c = nucVar;
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(Integer.valueOf(((mnm) entry.getValue()).a().a), (mnm) entry.getValue());
        }
        agkh agkhVar2 = new agkh(4);
        if (!map2.isEmpty()) {
            agqr it2 = ((agpk) ((agpn) map2).entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                agkhVar2.e(Integer.valueOf(albl.b.a()), (Pair) entry2.getValue());
            }
        }
        this.d = agkhVar.d(true);
        this.e = agkhVar2.d(true);
    }

    @Override // defpackage.nvr
    public final mep a() {
        return ndd.ac;
    }

    public final void b(nsl nslVar, ndd nddVar, ntq ntqVar) {
        mnl mnlVarE;
        if (nddVar.g() != 0) {
            AtomicReference atomicReference = nslVar.A;
            if (atomicReference == null) {
                this.c.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "scrollStrategyListenerHolder is unavailable.", new Object[0]);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < nddVar.g(); i++) {
                ncz nczVarH = nddVar.h(i);
                int[] iArrAG = ksy.aG(nczVarH);
                int length = iArrAG.length;
                if (length != 0) {
                    if (length > 1) {
                        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                        aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                        aihfVarCreateBuilder.copyOnWrite();
                        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                        asncVar.d = aslhVar.I;
                        asncVar.b |= 2;
                        List listQ = ahng.Q(iArrAG);
                        aihfVarCreateBuilder.copyOnWrite();
                        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
                        asncVar2.a();
                        aifs.addAll(listQ, asncVar2.h);
                        this.c.d((asnc) aihfVarCreateBuilder.build(), nslVar, "Multiple extensions found in intersection observer (default to first extension).", new Object[0]);
                    }
                    int i2 = iArrAG[0];
                    agkz agkzVar = mer.a;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (agkzVar.contains(numValueOf)) {
                        mnm mnmVar = (mnm) this.d.get(numValueOf);
                        if (mnmVar == null) {
                            throw new nud(a.bR(i2, "Unknown Flatbuffer extension: "));
                        }
                        met metVarD = nczVarH.d(mnmVar.a());
                        nrt nrtVarD = nrv.d();
                        nrtVarD.f = ntqVar;
                        nrtVarD.b(nslVar);
                        nrtVarD.g = nslVar.x;
                        mnlVarE = mnmVar.b(metVarD, nrtVarD.a());
                    } else {
                        Pair pair = (Pair) this.e.get(numValueOf);
                        if (pair != null) {
                            try {
                                try {
                                    abfv abfvVar = (abfv) pair.first;
                                    ByteBuffer byteBuffer = (ByteBuffer) aguu.C(ksy.aF(nczVarH, i2).iterator());
                                    aiix aiixVar = (aiix) pair.second;
                                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                    aigm aigmVarU = aigm.U(byteBuffer);
                                    Object objF = aiixVar.f(aigmVarU, generatedRegistry);
                                    try {
                                        aigmVarU.z(0);
                                        nrt nrtVarD2 = nrv.d();
                                        nrtVarD2.f = ntqVar;
                                        nrtVarD2.b(nslVar);
                                        nrtVarD2.g = nslVar.x;
                                        mnlVarE = abfvVar.e(objF, nrtVarD2.a());
                                    } catch (aiik e) {
                                        throw e;
                                    }
                                } catch (aiik e2) {
                                    e = e2;
                                    Throwable th = e;
                                    aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                                    aslh aslhVar2 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    asnc asncVar3 = (asnc) aihfVarCreateBuilder2.instance;
                                    asncVar3.d = aslhVar2.I;
                                    asncVar3.b |= 2;
                                    aihfVarCreateBuilder2.cC(i2);
                                    this.c.g((asnc) aihfVarCreateBuilder2.build(), nslVar, th, "Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter.", new Object[0]);
                                    mnlVarE = null;
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                Throwable th2 = e;
                                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                                aslh aslhVar3 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                aihfVarCreateBuilder3.copyOnWrite();
                                asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
                                asncVar4.d = aslhVar3.I;
                                asncVar4.b |= 2;
                                aihfVarCreateBuilder3.cC(i2);
                                this.c.g((asnc) aihfVarCreateBuilder3.build(), nslVar, th2, "Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter.", new Object[0]);
                                mnlVarE = null;
                            } catch (NoSuchElementException e4) {
                                e = e4;
                                Throwable th3 = e;
                                aihf aihfVarCreateBuilder4 = asnc.a.createBuilder();
                                aslh aslhVar4 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                aihfVarCreateBuilder4.copyOnWrite();
                                asnc asncVar5 = (asnc) aihfVarCreateBuilder4.instance;
                                asncVar5.d = aslhVar4.I;
                                asncVar5.b |= 2;
                                aihfVarCreateBuilder4.cC(i2);
                                this.c.g((asnc) aihfVarCreateBuilder4.build(), nslVar, th3, "Failed to resolve Intersection Property Extension in IntersectionPropertiesConverter.", new Object[0]);
                                mnlVarE = null;
                            }
                        } else {
                            mnlVarE = null;
                        }
                    }
                    if (mnlVarE != null) {
                        arrayList.add(mnlVarE);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String str = a + b.incrementAndGet();
            nuc nucVar = this.c;
            boolean z = this.f;
            boolean z2 = this.g;
            mpt mptVar = new mpt(atomicReference, arrayList, str, nucVar, nslVar, 333384171, z, z2);
            if (z2) {
                ntqVar.a().H(str);
            }
            ntqVar.s(mptVar);
            ntqVar.l(mptVar);
            ntqVar.j(mptVar);
        }
    }

    @Override // defpackage.nvs
    public final /* bridge */ /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        b(nslVar, (ndd) obj, ntqVar);
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void d(ntq ntqVar) {
    }
}
