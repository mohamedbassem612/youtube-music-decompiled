package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.cardboard.sdk.R;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meo implements ntr {
    static final Map a;
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final agkz d;
    private final nuc e;
    private final nso f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final agev l;
    private final boolean m;
    private final boolean n;
    private final boolean o;

    static {
        HashMap map = new HashMap();
        map.put(192475008, "AnimatedVectorType");
        map.put(160982084, "CellType");
        map.put(158796298, "CollectionType");
        map.put(158796327, "ContainerType");
        map.put(191923252, "EditableTextType");
        map.put(158796345, "ImageType");
        map.put(158796380, "TextType");
        map.put(193805739, "ExpandableTextType");
        map.put(197633010, "ScrollableContainerType");
        a = agkj.h(map);
    }

    public meo(Map map, Map map2, Set set, nuc nucVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, agev agevVar8, agev agevVar9) {
        Boolean bool = Boolean.FALSE;
        this.g = ((Boolean) agevVar2.e(bool)).booleanValue();
        this.m = ((Boolean) agevVar7.e(bool)).booleanValue();
        this.n = ((Boolean) agevVar8.e(bool)).booleanValue();
        this.o = ((Boolean) agevVar9.e(bool)).booleanValue();
        agqs agqsVarListIterator = ((agke) ((agpn) map).values()).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            ntv ntvVar = (ntv) agqsVarListIterator.next();
            this.b.put(ntvVar.b().a, ntvVar);
        }
        agix<onp> agixVarA = agix.a(((agpn) map2).values(), set);
        HashSet hashSet = new HashSet();
        agkx agkxVar = new agkx();
        Iterator it = agixVarA.iterator();
        while (it.hasNext()) {
            int iA = ((aigw) ((onp) it.next()).b).a();
            Integer numValueOf = Integer.valueOf(iA);
            if (!hashSet.add(numValueOf)) {
                agkxVar.c(numValueOf);
                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                aslh aslhVar = aslh.LOG_TYPE_CONFIGURATION_ERROR;
                aihfVarCreateBuilder.copyOnWrite();
                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                asncVar.d = aslhVar.I;
                asncVar.b |= 2;
                aihfVarCreateBuilder.cC(iA);
                nucVar.b((asnc) aihfVarCreateBuilder.build(), "Multiple type converters found and removed for extension.", new Object[0]);
            }
        }
        this.d = agkxVar.g();
        for (onp onpVar : agixVarA) {
            int iA2 = ((aigw) onpVar.b).a();
            if (!this.d.contains(Integer.valueOf(iA2))) {
                this.c.put(iA2, onpVar);
            }
        }
        Boolean bool2 = Boolean.FALSE;
        this.h = ((Boolean) agevVar3.e(bool2)).booleanValue();
        this.e = nucVar;
        this.f = (nso) agevVar.e(nxy.a);
        this.j = ((agfa) agevVar).a instanceof nxz;
        this.i = ((Boolean) agevVar4.e(bool2)).booleanValue();
        int i = nyu.a;
        meg.a();
        this.l = agevVar6;
        this.k = ((Integer) agevVar5.e(0)).intValue();
    }

    public static void c(agke agkeVar, nsl nslVar) {
        adfx adfxVarI = nslVar.i();
        if (adfxVarI == null || agkeVar.isEmpty()) {
            return;
        }
        adfxVarI.e(agkeVar);
    }

    private final int e(nff nffVar) {
        if (this.j) {
            return ksy.aD(nffVar);
        }
        int[] iArrAG = ksy.aG(nffVar);
        if (iArrAG.length == 0) {
            return 0;
        }
        return iArrAG[0];
    }

    private final List f(fhd fhdVar, nsl nslVar, nay nayVar, nth nthVar, List list, boolean z) {
        kjc kjcVar;
        fgy fgyVarD;
        int iG = nayVar.g();
        if (iG == 0) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(iG, null));
        ArrayList arrayList2 = new ArrayList(iG);
        int i = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            arrayList2.add(Integer.valueOf(i2));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        meo meoVar = this;
        kjc kjcVar2 = new kjc(meoVar.i);
        while (i < iG) {
            int iIntValue = ((Integer) arrayList2.get(i)).intValue();
            nay nayVarH = nayVar.h(iIntValue);
            if (z) {
                nyf nyfVarAE = nyh.aE(fhdVar);
                kjcVar = kjcVar2;
                nyfVarAE.d(new aebk(meoVar, nayVarH, nthVar, iIntValue, kjcVar, 1));
                nyfVarAE.e(nslVar);
                if (nslVar.x != null) {
                    nyfVarAE.c(Boolean.FALSE);
                }
                fgyVarD = nyfVarAE.a();
            } else {
                kjcVar = kjcVar2;
                fgyVarD = d(fhdVar, nslVar, nayVarH, nthVar, list, iIntValue, kjcVar2, false);
            }
            arrayList.set(((Integer) arrayList2.get(i)).intValue(), fgyVarD);
            i++;
            meoVar = this;
            kjcVar2 = kjcVar;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, nvn] */
    @Override // defpackage.ntr
    public final fgy a(fhd fhdVar, nsl nslVar, nay nayVar, nth nthVar, avmm avmmVar) {
        mlf mlfVar;
        String strF = nslVar.f("null");
        StringBuilder sb = new StringBuilder("Elements.toComponent:eml=");
        sb.append(strF);
        sb.append(":rooteml=");
        String str = nslVar.o;
        sb.append(str);
        String string = sb.toString();
        if (string.length() > 127) {
            string.substring(0, 127);
        }
        fhdVar.j.set(str);
        if (this.k == 2) {
            ((agfa) this.l).a.a();
        }
        if (this.g && nslVar.v == null) {
            throw new IllegalStateException("Element tree missing id in debug mode.");
        }
        nwy nwyVar = nwy.a;
        nwy nwyVar2 = nslVar.h;
        nwy nwyVar3 = nwyVar2 != null ? nwyVar2 : nwyVar;
        ArrayList arrayList = new ArrayList();
        fgy fgyVarD = d(fhdVar, nslVar, nayVar, nthVar, arrayList, 0, new kjc(this.i), true);
        meh mehVar = new meh(fhdVar, new mei());
        mei meiVar = mehVar.a;
        meiVar.c = fgyVarD.l();
        BitSet bitSet = mehVar.d;
        bitSet.set(1);
        meiVar.d = this;
        bitSet.set(2);
        meiVar.f = nwyVar3;
        bitSet.set(3);
        meiVar.a = avmmVar;
        bitSet.set(0);
        if (this.n && (mlfVar = (mlf) fhdVar.l(mlf.class)) != null) {
            meiVar.e = mlfVar;
        }
        if (nthVar != null) {
            meiVar.b = nthVar;
        }
        if (nayVar.l() && !nayVar.k().equals("deprecated_option_force_clip_bounds")) {
            mehVar.z(nayVar.k());
        }
        c(agke.n(arrayList), nslVar);
        return mehVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, nvn] */
    @Override // defpackage.ntr
    public final fgy b(fhd fhdVar, nsl nslVar, byte[] bArr, nth nthVar, avmm avmmVar) {
        nsl nslVarA;
        asrl asrlVarC;
        if (this.k == 1) {
            ((agfa) this.l).a.a();
        }
        if (nslVar == null) {
            nslVar = nsl.a;
        }
        nsk nskVar = new nsk(nslVar);
        nskVar.d = avmmVar;
        boolean z = this.g;
        if (z) {
            nskVar.m = Integer.toString(System.identityHashCode(bArr));
            nslVarA = nskVar.a();
        } else {
            nslVarA = nskVar.a();
        }
        nsl nslVar2 = nslVarA;
        try {
            nay nayVarA = this.f.a(bArr, z);
            fgy fgyVarA = a(fhdVar, nslVar2, nayVarA, nthVar, avmmVar);
            if (!this.g || (asrlVarC = npi.c(nayVarA, null, null, null, this.f)) == null) {
                return fgyVarA;
            }
            npg npgVar = new npg(null, null);
            npgVar.c(asrlVarC);
            int i = fmd.b;
            fmc fmcVar = new fmc(fhdVar, new fmd());
            fmcVar.c(fgyVarA);
            fmcVar.N(npgVar);
            return fmcVar.a();
        } catch (IOException e) {
            this.e.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, e, "Failed to parse Element.", new Object[0]);
            return fqp.aE(fhdVar).a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x020a A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x020e A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0223 A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0227 A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x023a A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x023d A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:122:0x024c A[Catch: aiik -> 0x0271, TryCatch #1 {aiik -> 0x0271, blocks: (B:81:0x0180, B:83:0x0186, B:85:0x019a, B:86:0x019c, B:88:0x01af, B:90:0x01b6, B:92:0x01be, B:94:0x01c2, B:95:0x01c4, B:97:0x01d7, B:99:0x01db, B:100:0x01dd, B:102:0x01ee, B:104:0x01f5, B:106:0x01ff, B:129:0x0267, B:103:0x01f1, B:107:0x020a, B:109:0x020e, B:110:0x0210, B:112:0x0223, B:114:0x0227, B:115:0x0229, B:117:0x023a, B:119:0x0241, B:120:0x0244, B:122:0x024c, B:125:0x025e, B:126:0x0261, B:118:0x023d, B:89:0x01b2), top: B:368:0x0180 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0264  */
    /* JADX WARN: Code duplicated, block: B:154:0x02fe A[Catch: RuntimeException -> 0x0372, TryCatch #6 {RuntimeException -> 0x0372, blocks: (B:142:0x02ac, B:144:0x02b2, B:146:0x02c0, B:148:0x02d0, B:150:0x02db, B:152:0x02e8, B:153:0x02f8, B:175:0x036f, B:154:0x02fe, B:156:0x0308, B:157:0x0315, B:159:0x031b, B:163:0x032f, B:166:0x033d, B:168:0x0344, B:170:0x0352, B:171:0x0362, B:172:0x0367), top: B:371:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0308 A[Catch: RuntimeException -> 0x0372, TryCatch #6 {RuntimeException -> 0x0372, blocks: (B:142:0x02ac, B:144:0x02b2, B:146:0x02c0, B:148:0x02d0, B:150:0x02db, B:152:0x02e8, B:153:0x02f8, B:175:0x036f, B:154:0x02fe, B:156:0x0308, B:157:0x0315, B:159:0x031b, B:163:0x032f, B:166:0x033d, B:168:0x0344, B:170:0x0352, B:171:0x0362, B:172:0x0367), top: B:371:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:159:0x031b A[Catch: RuntimeException -> 0x0372, TryCatch #6 {RuntimeException -> 0x0372, blocks: (B:142:0x02ac, B:144:0x02b2, B:146:0x02c0, B:148:0x02d0, B:150:0x02db, B:152:0x02e8, B:153:0x02f8, B:175:0x036f, B:154:0x02fe, B:156:0x0308, B:157:0x0315, B:159:0x031b, B:163:0x032f, B:166:0x033d, B:168:0x0344, B:170:0x0352, B:171:0x0362, B:172:0x0367), top: B:371:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:161:0x032a  */
    /* JADX WARN: Code duplicated, block: B:162:0x032d  */
    /* JADX WARN: Code duplicated, block: B:173:0x036c A[EDGE_INSN: B:173:0x036c->B:174:0x036d BREAK  A[LOOP:1: B:157:0x0315->B:172:0x0367], PHI: r7
      0x036c: PHI (r7v42 ??) = (r7v41 ??), (r7v47 ??), (r7v50 ??) binds: [B:143:0x02b0, B:155:0x0306, B:394:0x036c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x03f9 A[PHI: r7
      0x03f9: PHI (r7v4 ??) = (r7v3 ??), (r7v3 ??), (r7v3 ??), (r7v3 ??), (r7v31 ??) binds: [B:181:0x0385, B:182:0x0387, B:184:0x038f, B:186:0x0397, B:203:0x03e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:389:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [meo] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [meo] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [meo] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [meo] */
    /* JADX WARN: Type inference failed for: r1v6, types: [nuc] */
    /* JADX WARN: Type inference failed for: r1v7, types: [meo] */
    /* JADX WARN: Type inference failed for: r1v8, types: [nuc] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, nvp] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, nvp] */
    /* JADX WARN: Type inference failed for: r32v1, types: [nsl] */
    /* JADX WARN: Type inference failed for: r32v2, types: [nsl] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v29, types: [nsl] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v36, types: [nsl] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v8, types: [met, nff] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v19, types: [nuc] */
    /* JADX WARN: Type inference failed for: r4v24, types: [nuc] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, mlc] */
    /* JADX WARN: Type inference failed for: r6v33, types: [nff] */
    /* JADX WARN: Type inference failed for: r6v40, types: [nah] */
    /* JADX WARN: Type inference failed for: r7v104 */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109 */
    /* JADX WARN: Type inference failed for: r7v110 */
    /* JADX WARN: Type inference failed for: r7v111 */
    /* JADX WARN: Type inference failed for: r7v112 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30, types: [aiix] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [mep] */
    /* JADX WARN: Type inference failed for: r7v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [int] */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v87, types: [java.lang.String] */
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
    public final fgy d(fhd fhdVar, nsl nslVar, nay nayVar, final nth nthVar, List list, int i, kjc kjcVar, boolean z) {
        String strG;
        List list2;
        ?? r7;
        nth nthVar2;
        int i2;
        nsl nslVarA;
        nsl nslVarA2;
        ?? r1;
        ?? r3;
        fgy fgyVar;
        ?? r2;
        nsl nslVarA3;
        mip mipVar;
        ntq ntqVar;
        final String str;
        asnu asnuVarAH;
        mzq mzqVar;
        String str2;
        ?? r6;
        long j;
        long j2;
        int iAS;
        ?? r8;
        int iPeekByte;
        asop asopVar;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        asop asopVar2;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        asmg asmgVar;
        int i3;
        int iAS2;
        String str3;
        String strA;
        ?? r4 = this;
        fhd fhdVar2 = fhdVar;
        nds ndsVarI = nayVar.m() ? nayVar.i() : nnb.a;
        mep mepVar = nce.Y;
        if (ndsVarI.e(mepVar)) {
            nce nceVar = (nce) ndsVarI.d(mepVar);
            if (ahno.aa(nceVar.g())) {
                strG = null;
            } else {
                strG = nceVar.g();
            }
        } else {
            strG = null;
        }
        nsk nskVar = new nsk(nslVar);
        nskVar.l = null;
        nskVar.k(r4.g && z);
        nskVar.j(null);
        nff nffVarJ = nayVar.n() ? nayVar.j() : null;
        if (strG != null) {
            fpr.b(fhdVar2, strG);
            nskVar.h = strG;
        } else {
            String strF = nslVar.f("");
            if (strF != null && !strF.isEmpty()) {
                fpr.b(fhdVar2, strF);
            }
        }
        StringBuilder sb = new StringBuilder(nslVar.e(""));
        int iE = nffVarJ != null ? r4.e(nffVarJ) : 0;
        mep mepVar2 = mzq.J;
        if (iE != mepVar2.a && iE != mzt.K.a) {
            Map map = a;
            Integer numValueOf = Integer.valueOf(iE);
            if (map.containsKey(numValueOf)) {
                sb.append((String) map.get(numValueOf));
            } else {
                sb.append(iE);
            }
            sb.append('|');
        }
        nskVar.f = sb;
        ?? sb2 = new StringBuilder(nslVar.n);
        if (sb2.length() > 0) {
            sb2.append(',');
        }
        nff nffVarJ2 = nayVar.j();
        String strK = nayVar.k();
        if (ahno.aa(strK)) {
            ?? r13 = kjcVar.a;
            if (r13 == 0) {
                strK = Integer.toString(i);
            } else {
                if (nffVarJ2 != null) {
                    mep mepVar3 = mzt.K;
                    if (nffVarJ2.e(mepVar3) || nffVarJ2.e(mepVar2)) {
                        if (nffVarJ2.e(mepVar3)) {
                            mzt mztVar = (mzt) nffVarJ2.d(mepVar3);
                            if (mztVar.p()) {
                                strA = mztVar.j();
                            } else {
                                strA = null;
                            }
                        } else {
                            nfi nfiVar = (nfi) ((mzq) nffVarJ2.d(mepVar2)).i().d(nfi.al);
                            if (nfiVar.b()) {
                                strA = nfiVar.a();
                            } else {
                                strA = null;
                            }
                        }
                        if (strA == null) {
                            strA = null;
                        } else {
                            int iLastIndexOf = strA.lastIndexOf(R.styleable.AppCompatTheme_windowMinWidthMajor);
                            if (iLastIndexOf != -1) {
                                strA = strA.substring(0, iLastIndexOf);
                            }
                        }
                    } else {
                        strA = null;
                    }
                } else {
                    strA = null;
                }
                if (strA != null) {
                    int iIntValue = ((Integer) j$.util.Map.EL.compute(r13, strA, new itl(2))).intValue();
                    if (iIntValue == 1) {
                        strK = strA;
                    } else {
                        strK = strA + '-' + iIntValue;
                    }
                } else {
                    strK = Integer.toString(i);
                }
            }
        }
        sb2.append(strK);
        nskVar.g = sb2.toString();
        if (r4.m && nayVar.n()) {
            ?? J = nayVar.j();
            sb2 = mzt.K;
            boolean zE = J.e(sb2);
            boolean zE2 = J.e(mepVar2);
            if (zE) {
                mzt mztVar2 = (mzt) J.d(sb2);
                try {
                    sb2 = mztVar2.o();
                    if (sb2 != 0) {
                        asow asowVar = ((asmv) aihn.parseFrom(asmv.a, mztVar2.k(), ExtensionRegistryLite.getGeneratedRegistry())).c;
                        if (asowVar == null) {
                            asowVar = asow.a;
                        }
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(asma.b);
                        asowVar.c(aihlVarCheckIsLite3);
                        Object objK2 = asowVar.j.k(aihlVarCheckIsLite3.d);
                        asma asmaVar = (asma) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
                        if ((asmaVar.c & 16) != 0) {
                            asop asopVar3 = asmaVar.f;
                            if (asopVar3 == null) {
                                asopVar3 = asop.a;
                            }
                            aihl aihlVar2 = asot.b;
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                            asopVar3.c(aihlVarCheckIsLite4);
                            if (!asopVar3.j.n(aihlVarCheckIsLite4.d)) {
                                asopVar = asmaVar.f;
                                if (asopVar == null) {
                                    asopVar = asop.a;
                                }
                                aihlVar = asmg.b;
                                aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                asopVar.c(aihlVarCheckIsLite);
                                if (asopVar.j.n(aihlVarCheckIsLite.d)) {
                                    sb2 = 0;
                                    break;
                                }
                                asopVar2 = asmaVar.f;
                                if (asopVar2 == null) {
                                    asopVar2 = asop.a;
                                }
                                aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                asopVar2.c(aihlVarCheckIsLite2);
                                objK = asopVar2.j.k(aihlVarCheckIsLite2.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite2.b;
                                } else {
                                    objC = aihlVarCheckIsLite2.c(objK);
                                }
                                asmgVar = (asmg) objC;
                                i3 = 0;
                                while (true) {
                                    if (i3 < asmgVar.c.size()) {
                                        sb2 = 0;
                                        break;
                                    }
                                    asmh asmhVar = (asmh) asmgVar.c.get(i3);
                                    iAS2 = a.aS(asmhVar.e);
                                    if (iAS2 == 0 && iAS2 == 2) {
                                        sb2 = asmhVar.c;
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                asop asopVar4 = asmaVar.f;
                                if (asopVar4 == null) {
                                    asopVar4 = asop.a;
                                }
                                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar2);
                                asopVar4.c(aihlVarCheckIsLite5);
                                Object objK3 = asopVar4.j.k(aihlVarCheckIsLite5.d);
                                asot asotVar = (asot) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                                if (asotVar.c.size() <= 0) {
                                    asopVar = asmaVar.f;
                                    if (asopVar == null) {
                                        asopVar = asop.a;
                                    }
                                    aihlVar = asmg.b;
                                    aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                    asopVar.c(aihlVarCheckIsLite);
                                    if (asopVar.j.n(aihlVarCheckIsLite.d)) {
                                        asopVar2 = asmaVar.f;
                                        if (asopVar2 == null) {
                                            asopVar2 = asop.a;
                                        }
                                        aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                        asopVar2.c(aihlVarCheckIsLite2);
                                        objK = asopVar2.j.k(aihlVarCheckIsLite2.d);
                                        if (objK == null) {
                                            objC = aihlVarCheckIsLite2.b;
                                        } else {
                                            objC = aihlVarCheckIsLite2.c(objK);
                                        }
                                        asmgVar = (asmg) objC;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < asmgVar.c.size()) {
                                                sb2 = 0;
                                                break;
                                            }
                                            asmh asmhVar2 = (asmh) asmgVar.c.get(i3);
                                            iAS2 = a.aS(asmhVar2.e);
                                            if (iAS2 == 0) {
                                            }
                                            i3++;
                                        }
                                    } else {
                                        sb2 = 0;
                                        break;
                                    }
                                } else {
                                    str3 = ((asos) asotVar.c.get(0)).b;
                                }
                            }
                        } else {
                            sb2 = 0;
                            break;
                        }
                        if (sb2 != 0) {
                            sb2 = str3;
                            nskVar.q = sb2;
                        }
                    }
                    sb2 = str3;
                    nskVar.p = mztVar2.j();
                } catch (aiik e) {
                    throw new nud("Failed to parse Element proto.", e);
                }
            } else if (zE2 && (sb2 = (mzqVar = (mzq) J.d(mzq.J)).c()) != 0) {
                mew mewVarI = mzqVar.i();
                mep mepVar4 = nfi.al;
                sb2 = mewVarI.e(mepVar4);
                if (sb2 != 0) {
                    nfi nfiVar2 = (nfi) mzqVar.i().d(mepVar4);
                    if (nfiVar2.b()) {
                        nskVar.p = nfiVar2.a();
                    }
                    try {
                        ?? B = mzqVar.b();
                        if (B == 0) {
                            str2 = null;
                            sb2 = B;
                            break;
                        }
                        mew mewVarH = mzqVar.h();
                        mep mepVar5 = nev.aj;
                        long j3 = 8;
                        if (!mewVarH.e(mepVar5)) {
                            B = mzqVar.h().e(mepVar5);
                            if (B != 0) {
                                str2 = null;
                                sb2 = B;
                                break;
                            }
                            r6 = (nah) mzqVar.h().d(nah.O);
                            B = 0;
                            while (true) {
                                if (B < r6.a()) {
                                    str2 = null;
                                    sb2 = B;
                                    break;
                                }
                                mes mesVarB = r6.b(B);
                                j = j3;
                                long j4 = ((njw) mesVarB).c;
                                if (true != njw.a) {
                                    j2 = 24;
                                } else {
                                    j2 = 20;
                                }
                                iAS = a.aS(Memory.peekInt(j4 + j2, false));
                                if (iAS == 0) {
                                }
                                j3 = j;
                                B++;
                            }
                        } else {
                            nev nevVar = (nev) mzqVar.h().d(mepVar5);
                            if (nevVar.a() <= 0) {
                                B = mzqVar.h().e(mepVar5);
                                if (B != 0) {
                                    str2 = null;
                                    sb2 = B;
                                    break;
                                }
                                r6 = (nah) mzqVar.h().d(nah.O);
                                B = 0;
                                while (true) {
                                    if (B < r6.a()) {
                                        str2 = null;
                                        sb2 = B;
                                        break;
                                    }
                                    mes mesVarB2 = r6.b(B);
                                    j = j3;
                                    long j5 = ((njw) mesVarB2).c;
                                    if (true != njw.a) {
                                        j2 = 24;
                                    } else {
                                        j2 = 20;
                                    }
                                    iAS = a.aS(Memory.peekInt(j5 + j2, false));
                                    if (iAS == 0 && iAS == 2) {
                                        ?? r9 = B;
                                        if (((njw) mesVarB2).e == null && (Memory.peekByte(((mew) mesVarB2).c + j) & 1) != 0) {
                                            r9 = B;
                                            njw njwVar = (njw) mesVarB2;
                                            njwVar.e = ((mew) mesVarB2).cq(njw.d.b);
                                            r9 = njwVar;
                                        }
                                        r9 = B;
                                        str2 = ((njw) mesVarB2).e;
                                        sb2 = r9;
                                        break;
                                    }
                                    j3 = j;
                                    B++;
                                }
                            } else {
                                mes mesVarB3 = nevVar.b();
                                String str4 = ((noe) mesVarB3).e;
                                if (str4 == null && (iPeekByte = Memory.peekByte(((mew) mesVarB3).c + 8) & 1) != 0) {
                                    r8 = str4;
                                    r8 = iPeekByte;
                                    String strCq = ((mew) mesVarB3).cq(noe.d.b);
                                    ((noe) mesVarB3).e = strCq;
                                    r8 = strCq;
                                }
                                r8 = str4;
                                r8 = iPeekByte;
                                r8 = str4;
                                str2 = ((noe) mesVarB3).e;
                                sb2 = r8;
                            }
                        }
                        if (str2 != null) {
                            nskVar.q = str2;
                        }
                    } catch (RuntimeException e2) {
                        throw new nud("Cannot read theme key from model.", e2);
                    }
                }
            }
        }
        nskVar.d(nslVar.z + 1);
        if (nslVar.i() == null || nffVarJ == null || nffVarJ.e(mzt.K) || nffVarJ.e(mzq.J)) {
            list2 = list;
            r7 = sb2;
        } else {
            nds ndsVarI2 = nayVar.m() ? nayVar.i() : nnb.a;
            WeakReference weakReference = nslVar.q;
            asnu asnuVar = weakReference == null ? null : (asnu) weakReference.get();
            nuc nucVar = r4.e;
            agke agkeVarAF = ksy.aF(ndsVarI2, 255496645);
            ?? IsEmpty = agkeVarAF.isEmpty();
            if (IsEmpty == 0) {
                try {
                    asnw asnwVar = asnw.a;
                    IsEmpty = aihn.getParserForClass(asnw.class);
                    asnuVarAH = ksy.aH((asnw) qnl.bt(agkeVarAF, IsEmpty, ExtensionRegistryLite.getGeneratedRegistry()), asnuVar, nslVar, strG);
                    sb2 = IsEmpty;
                } catch (aiik e3) {
                    if (nucVar != null) {
                        IsEmpty = "Failed to parse LoggingProperties";
                        nucVar.f(aslh.LOG_TYPE_WIRE_FORMAT_ERROR, nslVar, e3, "Failed to parse LoggingProperties", new Object[0]);
                    }
                    asnuVarAH = null;
                    sb2 = IsEmpty;
                }
            } else {
                asnuVarAH = null;
                sb2 = IsEmpty;
            }
            if (asnuVarAH != null) {
                list2 = list;
                list2.add(asnuVarAH);
                nskVar.j(asnuVarAH);
                nskVar.i = new WeakReference(asnuVarAH);
                r7 = sb2;
            } else {
                list2 = list;
                r7 = sb2;
            }
        }
        boolean z2 = r4.g;
        if (z2) {
            String strE = npi.e(nayVar.m() ? nayVar.i() : nnb.a);
            if (strE == null) {
                Log.w("Elements", "Found an Element with missing debugger id.");
            } else {
                nskVar.l = strE;
            }
        }
        nsl nslVarA4 = nskVar.a();
        boolean z3 = r4.h;
        if (!nayVar.n()) {
            r4.e.c(r4.o ? aslh.LOG_LEVEL_WARN : aslh.LOG_TYPE_MISSING_FIELD, nslVarA4, "Element missing type extension", new Object[0]);
            return fqp.aE(fhdVar2).a;
        }
        ?? J2 = nayVar.j();
        if (!z2 || (str = nslVarA4.u) == null) {
            nthVar2 = nthVar;
        } else {
            nthVar2 = nthVar == null ? new nth() { // from class: npc
                @Override // defpackage.nth
                public final ntg a(ntq ntqVar2) {
                    return new npe(ntqVar2, str);
                }
            } : new nth() { // from class: npd
                @Override // defpackage.nth
                public final ntg a(ntq ntqVar2) {
                    return nthVar.a(new npe(ntqVar2, str));
                }
            };
        }
        int iE2 = r4.e(J2);
        if (iE2 == 0) {
            r4.e.c(r4.o ? aslh.LOG_LEVEL_WARN : aslh.LOG_TYPE_MISSING_FIELD, nslVarA4, "Element missing type extension", new Object[0]);
            return fqp.aE(fhdVar2).a;
        }
        try {
            agkz agkzVar = mer.a;
            Integer numValueOf2 = Integer.valueOf(iE2);
            try {
                try {
                    try {
                        if (agkzVar.contains(numValueOf2)) {
                            try {
                                int iE3 = r4.e(J2);
                                ntv ntvVar = (ntv) r4.b.get(iE3);
                                r2 = r4;
                                if (ntvVar != null) {
                                    if (nayVar.n() && iE3 == 158796298) {
                                        nsk nskVar2 = new nsk(nslVarA4);
                                        nskVar2.n = new AtomicReference();
                                        nslVarA = nskVar2.a();
                                        i2 = 158796298;
                                    } else {
                                        i2 = iE3;
                                        nslVarA = nslVarA4;
                                    }
                                    if (nslVarA.E && nayVar.n() && i2 == 158796298) {
                                        nsk nskVar3 = new nsk(nslVarA);
                                        nskVar3.e(false);
                                        nslVarA2 = nskVar3.a();
                                    } else {
                                        nslVarA2 = nslVarA;
                                    }
                                    fgy fgyVarA = ntvVar.a(fhdVar, nslVarA, nayVar, r4.f(fhdVar2, nslVarA2, nayVar, nthVar2, list2, ntvVar.c()), nthVar2, z3);
                                    fhdVar2 = fhdVar;
                                    r1 = r4;
                                    r3 = nslVarA4;
                                    fgyVar = fgyVarA;
                                } else {
                                    r3 = nslVarA4;
                                    fgyVar = null;
                                    r1 = r2;
                                }
                            } catch (aiik e4) {
                                e = e4;
                                fhdVar2 = fhdVar;
                                J2 = nslVarA4;
                                r4 = r4;
                                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                aslh aslhVar = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                aihfVarCreateBuilder.copyOnWrite();
                                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                                asncVar.d = aslhVar.I;
                                asncVar.b |= 2;
                                aihfVarCreateBuilder.cC(iE2);
                                r4.e.g((asnc) aihfVarCreateBuilder.build(), J2, e, "Error while converting.", new Object[0]);
                                return fqp.aE(fhdVar2).a;
                            } catch (nud e5) {
                                e = e5;
                                fhdVar2 = fhdVar;
                                J2 = nslVarA4;
                                r4 = r4;
                                aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
                                aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_ERROR;
                                aihfVarCreateBuilder2.copyOnWrite();
                                asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
                                asncVar2.d = aslhVar2.I;
                                asncVar2.b |= 2;
                                aihfVarCreateBuilder2.cC(iE2);
                                r4.e.g((asnc) aihfVarCreateBuilder2.build(), J2, e, "ElementsException was thrown in flat while converting.", new Object[0]);
                                return fqp.aE(fhdVar2).a;
                            }
                        } else {
                            int iE4 = r4.e(J2);
                            onp onpVar = (onp) r4.c.get(iE4);
                            if (onpVar == null) {
                                fhdVar2 = fhdVar;
                                r2 = r4;
                                r3 = nslVarA4;
                                fgyVar = null;
                                r1 = r2;
                            } else {
                                aiix parserForType = ((aihl) onpVar.b).c.getParserForType();
                                ByteBuffer byteBuffer = (ByteBuffer) ksy.aF(J2, iE4).get(0);
                                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                aigm aigmVarU = aigm.U(byteBuffer);
                                ?? F = parserForType.f(aigmVarU, generatedRegistry);
                                try {
                                    aigmVarU.z(0);
                                    if (nslVarA4.E && nayVar.n() && iE4 == 158796298) {
                                        nsk nskVar4 = new nsk(nslVarA4);
                                        nskVar4.e(false);
                                        nslVarA3 = nskVar4.a();
                                    } else {
                                        nslVarA3 = nslVarA4;
                                    }
                                    r4 = this;
                                    fhdVar2 = fhdVar;
                                    J2 = nslVarA4;
                                    try {
                                        List listF = r4.f(fhdVar2, J2, nayVar, nthVar2, list, false);
                                        try {
                                            String strK2 = nayVar.k();
                                            nds ndsVarI3 = nayVar.m() ? nayVar.i() : nnb.a;
                                            if (ndsVarI3.e(mzl.I)) {
                                                agke agkeVarC = nslVarA3.c();
                                                if (agkeVarC == null) {
                                                    agkeVarC = agpi.a;
                                                }
                                                mipVar = new mip(agkeVarC);
                                            } else {
                                                mipVar = null;
                                            }
                                            asnu asnuVarD = nslVarA3.d();
                                            adfx adfxVarI = nslVarA3.i();
                                            try {
                                                mkn mknVar = new mkn(asnuVarD, adfxVarI, false, false, (Optional) onpVar.e, (Optional) onpVar.f, (Optional) onpVar.h, (Optional) onpVar.g, (Optional) onpVar.c);
                                                if (nthVar2 != null) {
                                                    ntg ntgVarA = nthVar2.a(mknVar);
                                                    nsk nskVar5 = new nsk(nslVarA3);
                                                    nskVar5.k = ntgVarA;
                                                    nslVarA3 = nskVar5.a();
                                                    ntqVar = ntgVarA;
                                                } else {
                                                    ntqVar = mknVar;
                                                }
                                                fhd fhdVar3 = fhdVar;
                                                nsl nslVar2 = nslVarA3;
                                                try {
                                                    fgv fgvVarA = onpVar.d.a(fhdVar3, nslVar2, F, strK2, listF);
                                                    mknVar.a = fgvVarA;
                                                    if (strK2 != null) {
                                                        fgvVarA.z(strK2);
                                                    }
                                                    if (z3) {
                                                        onpVar.a.b(mknVar);
                                                    }
                                                    fhdVar3 = fhdVar;
                                                    nds ndsVar = ndsVarI3;
                                                    ntq ntqVar2 = ntqVar;
                                                    onpVar.a.a(fhdVar3, nslVar2, strK2, ndsVar, ntqVar2, mipVar);
                                                    fhdVar2 = fhdVar3;
                                                    String str5 = nslVar2.v;
                                                    if (str5 != null && nslVar2.w) {
                                                        ntqVar2.t(com.google.android.apps.youtube.music.R.id.elements_tree_debug_id, str5);
                                                    }
                                                    mep mepVar6 = mwo.B;
                                                    if (ndsVar.e(mepVar6)) {
                                                        mow.b((mwo) ndsVar.d(mepVar6), ntqVar2);
                                                    }
                                                    fgy fgyVarB = ntqVar2.b(fhdVar2);
                                                    mknVar.a = null;
                                                    fgyVar = fgyVarB;
                                                    r1 = r4;
                                                    r3 = J2;
                                                } catch (aiik e6) {
                                                    e = e6;
                                                    fhdVar2 = fhdVar3;
                                                    aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                                                    aslh aslhVar3 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                                    aihfVarCreateBuilder3.copyOnWrite();
                                                    asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                                                    asncVar3.d = aslhVar3.I;
                                                    asncVar3.b |= 2;
                                                    aihfVarCreateBuilder3.cC(iE2);
                                                    r4.e.g((asnc) aihfVarCreateBuilder3.build(), J2, e, "Error while converting.", new Object[0]);
                                                    return fqp.aE(fhdVar2).a;
                                                } catch (nud e7) {
                                                    e = e7;
                                                    fhdVar2 = fhdVar3;
                                                    aihf aihfVarCreateBuilder4 = asnc.a.createBuilder();
                                                    aslh aslhVar4 = aslh.LOG_TYPE_INTERNAL_ERROR;
                                                    aihfVarCreateBuilder4.copyOnWrite();
                                                    asnc asncVar4 = (asnc) aihfVarCreateBuilder4.instance;
                                                    asncVar4.d = aslhVar4.I;
                                                    asncVar4.b |= 2;
                                                    aihfVarCreateBuilder4.cC(iE2);
                                                    r4.e.g((asnc) aihfVarCreateBuilder4.build(), J2, e, "ElementsException was thrown in flat while converting.", new Object[0]);
                                                    return fqp.aE(fhdVar2).a;
                                                }
                                            } catch (aiik e8) {
                                                e = e8;
                                                fhdVar2 = fhdVar;
                                            } catch (nud e9) {
                                                e = e9;
                                                fhdVar2 = fhdVar;
                                            }
                                        } catch (aiik e10) {
                                            e = e10;
                                            fhdVar2 = fhdVar;
                                            r4 = r4;
                                            J2 = J2;
                                            aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
                                            aslh aslhVar5 = aslh.LOG_TYPE_WIRE_FORMAT_ERROR;
                                            aihfVarCreateBuilder5.copyOnWrite();
                                            asnc asncVar5 = (asnc) aihfVarCreateBuilder5.instance;
                                            asncVar5.d = aslhVar5.I;
                                            asncVar5.b |= 2;
                                            aihfVarCreateBuilder5.cC(iE2);
                                            r4.e.g((asnc) aihfVarCreateBuilder5.build(), J2, e, "Error while converting.", new Object[0]);
                                            return fqp.aE(fhdVar2).a;
                                        } catch (nud e11) {
                                            e = e11;
                                            fhdVar2 = fhdVar;
                                            r4 = r4;
                                            J2 = J2;
                                            aihf aihfVarCreateBuilder6 = asnc.a.createBuilder();
                                            aslh aslhVar6 = aslh.LOG_TYPE_INTERNAL_ERROR;
                                            aihfVarCreateBuilder6.copyOnWrite();
                                            asnc asncVar6 = (asnc) aihfVarCreateBuilder6.instance;
                                            asncVar6.d = aslhVar6.I;
                                            asncVar6.b |= 2;
                                            aihfVarCreateBuilder6.cC(iE2);
                                            r4.e.g((asnc) aihfVarCreateBuilder6.build(), J2, e, "ElementsException was thrown in flat while converting.", new Object[0]);
                                            return fqp.aE(fhdVar2).a;
                                        }
                                    } catch (aiik e12) {
                                        e = e12;
                                        r4 = r4;
                                        J2 = J2;
                                    } catch (nud e13) {
                                        e = e13;
                                        r4 = r4;
                                        J2 = J2;
                                    }
                                } catch (aiik e14) {
                                    throw e14;
                                }
                            }
                        }
                        if (fgyVar != null) {
                            return fgyVar;
                        }
                        if (r1.d.contains(numValueOf2)) {
                            aihf aihfVarCreateBuilder7 = asnc.a.createBuilder();
                            aslh aslhVar7 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                            aihfVarCreateBuilder7.copyOnWrite();
                            asnc asncVar7 = (asnc) aihfVarCreateBuilder7.instance;
                            asncVar7.d = aslhVar7.I;
                            asncVar7.b |= 2;
                            aihfVarCreateBuilder7.cC(iE2);
                            r1.e.d((asnc) aihfVarCreateBuilder7.build(), r3, "Component was not found because it was removed due to duplicate converter bindings.", new Object[0]);
                        } else {
                            aihf aihfVarCreateBuilder8 = asnc.a.createBuilder();
                            aslh aslhVar8 = aslh.LOG_TYPE_UNKNOWN_EXTENSION;
                            aihfVarCreateBuilder8.copyOnWrite();
                            asnc asncVar8 = (asnc) aihfVarCreateBuilder8.instance;
                            asncVar8.d = aslhVar8.I;
                            asncVar8.b |= 2;
                            aihfVarCreateBuilder8.cC(iE2);
                            r1.e.d((asnc) aihfVarCreateBuilder8.build(), r3, "Component was not found", new Object[0]);
                        }
                        return fqp.aE(fhdVar2).a;
                    } catch (nud e15) {
                        e = e15;
                        fhdVar2 = fhdVar;
                        r4 = r7;
                    }
                } catch (aiik e16) {
                    e = e16;
                    fhdVar2 = fhdVar;
                    r4 = r7;
                }
            } catch (aiik e17) {
                e = e17;
            } catch (nud e18) {
                e = e18;
            }
        } catch (aiik e19) {
            e = e19;
        } catch (nud e20) {
            e = e20;
        }
    }
}
