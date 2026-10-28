package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avev implements Runnable {
    public final /* synthetic */ avey a;
    public final atxy b;

    public avev(avey aveyVar, atxy atxyVar) {
        this.a = aveyVar;
        atxyVar.getClass();
        this.b = atxyVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0255 A[Catch: RuntimeException -> 0x02b2, all -> 0x0333, IOException -> 0x0335, TryCatch #1 {RuntimeException -> 0x02b2, blocks: (B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1), top: B:196:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0261  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e A[Catch: RuntimeException -> 0x02b2, all -> 0x0333, IOException -> 0x0335, TryCatch #1 {RuntimeException -> 0x02b2, blocks: (B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1), top: B:196:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0276 A[Catch: RuntimeException -> 0x02b2, all -> 0x0333, IOException -> 0x0335, TryCatch #1 {RuntimeException -> 0x02b2, blocks: (B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1), top: B:196:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0286 A[Catch: RuntimeException -> 0x02b2, all -> 0x0333, IOException -> 0x0335, TryCatch #1 {RuntimeException -> 0x02b2, blocks: (B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1), top: B:196:0x0203 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x029b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e7 A[Catch: all -> 0x0333, IOException -> 0x0335, TryCatch #2 {IOException -> 0x0335, blocks: (B:153:0x02d4, B:155:0x02e7, B:157:0x02eb, B:162:0x0315, B:158:0x02f1, B:100:0x01f2, B:101:0x01f7, B:103:0x01fd, B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1, B:145:0x02b3, B:148:0x02c9, B:159:0x02fc), top: B:198:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02eb A[Catch: all -> 0x0333, IOException -> 0x0335, TryCatch #2 {IOException -> 0x0335, blocks: (B:153:0x02d4, B:155:0x02e7, B:157:0x02eb, B:162:0x0315, B:158:0x02f1, B:100:0x01f2, B:101:0x01f7, B:103:0x01fd, B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1, B:145:0x02b3, B:148:0x02c9, B:159:0x02fc), top: B:198:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f1 A[Catch: all -> 0x0333, IOException -> 0x0335, TryCatch #2 {IOException -> 0x0335, blocks: (B:153:0x02d4, B:155:0x02e7, B:157:0x02eb, B:162:0x0315, B:158:0x02f1, B:100:0x01f2, B:101:0x01f7, B:103:0x01fd, B:104:0x0203, B:105:0x020b, B:107:0x0211, B:108:0x0227, B:110:0x022f, B:112:0x0235, B:113:0x0239, B:115:0x023f, B:117:0x024d, B:119:0x0255, B:124:0x0263, B:126:0x026e, B:128:0x0276, B:130:0x027c, B:131:0x0280, B:133:0x0286, B:137:0x0295, B:142:0x029f, B:143:0x02b1, B:145:0x02b3, B:148:0x02c9, B:159:0x02fc), top: B:198:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0314 A[PHI: r20
      0x0314: PHI (r20v11 boolean) = (r20v10 boolean), (r20v13 boolean), (r20v15 boolean) binds: [B:160:0x0312, B:159:0x02fc, B:154:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0357 A[PHI: r20
      0x0357: PHI (r20v8 boolean) = (r20v6 boolean), (r20v6 boolean), (r20v20 boolean) binds: [B:181:0x034d, B:183:0x0355, B:166:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x0373  */
    /* JADX WARN: Code duplicated, block: B:223:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:? A[LOOP:5: B:131:0x0280->B:235:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[Catch: all -> 0x0337, IOException -> 0x033c, TryCatch #14 {all -> 0x0337, blocks: (B:6:0x0027, B:11:0x003d, B:14:0x0046, B:16:0x004e, B:17:0x0059, B:18:0x006f, B:19:0x0073, B:20:0x008e, B:22:0x0094, B:23:0x00a8, B:28:0x00db, B:30:0x00df, B:32:0x00e9, B:53:0x011f, B:55:0x0129, B:57:0x012d, B:59:0x0133, B:64:0x0148, B:66:0x014e, B:67:0x0154, B:68:0x015d, B:70:0x0163, B:72:0x0171, B:63:0x013b, B:36:0x00f4, B:39:0x00fe, B:41:0x0104, B:49:0x0117, B:50:0x0118, B:27:0x00b4, B:9:0x0037), top: B:202:0x0027 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [csd, java.lang.Runnable] */
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
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        avbr avbrVar;
        avcf avcfVarB;
        avbp avbpVarA;
        avew avewVarA;
        avbp avbpVar;
        Status status;
        Double dH;
        List listN;
        Map mapO;
        Iterator it;
        int iIntValue;
        boolean z2;
        avex avexVar;
        avbr csdVar = "serviceConfig";
        Logger logger = avey.b;
        if (logger.isLoggable(Level.FINER)) {
            logger.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.a.j)));
        }
        boolean z3 = true;
        byte[] bArr = null;
        Object[] objArr = 0;
        try {
            try {
                try {
                    avey aveyVar = this.a;
                    String str = aveyVar.j;
                    int i = aveyVar.k;
                    InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(str, i);
                    avbz avbzVarA = !(inetSocketAddressCreateUnresolved instanceof InetSocketAddress) ? null : avik.a(inetSocketAddressCreateUnresolved);
                    auzm auzmVar = avbzVarA != null ? new auzm(avbzVarA) : null;
                    if (auzmVar != null) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", a.co(auzmVar, "Using proxy address "));
                        }
                        List list = Collections.EMPTY_LIST;
                        avbrVar = new avbr(new avcf(null, Collections.singletonList(auzmVar)), auyo.a, null);
                        z = false;
                    } else {
                        List list2 = Collections.EMPTY_LIST;
                        auyo auyoVar = auyo.a;
                        try {
                            int i2 = aveyVar.r;
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                            ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new auzm(new InetSocketAddress((InetAddress) it2.next(), i)));
                            }
                            avcfVarB = new avcf(null, DesugarCollections.unmodifiableList(arrayList));
                        } catch (Exception e) {
                            avey.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (Throwable) e);
                            avcfVarB = avcf.b(Status.m.withDescription("Unable to resolve host ".concat(String.valueOf(aveyVar.j))).c(e));
                        }
                        try {
                            try {
                                if (avey.f) {
                                    List<String> listA = Collections.EMPTY_LIST;
                                    boolean z4 = avey.d;
                                    boolean z5 = avey.e;
                                    String str2 = aveyVar.j;
                                    if (!z4) {
                                        avewVarA = null;
                                    } else if (!"localhost".equalsIgnoreCase(str2)) {
                                        if (!str2.contains(":")) {
                                            boolean z6 = true;
                                            for (int i3 = 0; i3 < str2.length(); i3++) {
                                                char cCharAt = str2.charAt(i3);
                                                if (cCharAt != '.') {
                                                    z6 &= cCharAt >= '0' && cCharAt <= '9';
                                                }
                                            }
                                            if (!z6) {
                                                avewVarA = (avew) aveyVar.i.get();
                                                if (avewVarA == null) {
                                                    avewVarA = avexVar.a();
                                                }
                                            }
                                        }
                                        avewVarA = null;
                                    } else if (z5) {
                                        avewVarA = (avew) aveyVar.i.get();
                                        if (avewVarA == null && (avexVar = avey.g) != null) {
                                            avewVarA = avexVar.a();
                                        }
                                    } else {
                                        avewVarA = null;
                                    }
                                    if (avewVarA != null) {
                                        try {
                                            listA = avewVarA.a();
                                        } catch (Exception e2) {
                                            avey.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e2);
                                        }
                                    }
                                    if (listA.isEmpty()) {
                                        z = false;
                                        avey.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{aveyVar.j});
                                    } else {
                                        Random random = aveyVar.h;
                                        String strE = avey.e();
                                        try {
                                            ArrayList<Map> arrayList2 = new ArrayList();
                                            for (String str3 : listA) {
                                                if (str3.startsWith("grpc_config=")) {
                                                    String strSubstring = str3.substring(12);
                                                    Logger logger2 = avgf.a;
                                                    ahwu ahwuVar = new ahwu(new StringReader(strSubstring));
                                                    try {
                                                        Object objA = avgf.a(ahwuVar);
                                                        try {
                                                            ahwuVar.close();
                                                        } catch (IOException e3) {
                                                            avgf.a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e3);
                                                        }
                                                        if (!(objA instanceof List)) {
                                                            throw new ClassCastException("wrong type ".concat(String.valueOf(String.valueOf(objA))));
                                                        }
                                                        List list3 = (List) objA;
                                                        avjt.p(list3);
                                                        arrayList2.addAll(list3);
                                                    } catch (Throwable th) {
                                                        try {
                                                            ahwuVar.close();
                                                            throw th;
                                                        } catch (IOException e4) {
                                                            avgf.a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e4);
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    z = false;
                                                    try {
                                                        try {
                                                            avey.b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str3});
                                                        } catch (IOException e5) {
                                                            e = e5;
                                                            avbpVar = new avbp(Status.c.withDescription("failed to parse TXT records").c(e));
                                                            if (avbpVar != null) {
                                                                status = avbpVar.a;
                                                                if (status != null) {
                                                                    avbpVarA = new avbp(status);
                                                                } else {
                                                                    avbpVarA = aveyVar.n.a((Map) avbpVar.b);
                                                                }
                                                            } else {
                                                                avbpVarA = null;
                                                            }
                                                            avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                                                            this.a.m.execute(new aves((Object) this, (Object) avbrVar, 3, bArr));
                                                            if (!avbrVar.a.d()) {
                                                                z3 = z;
                                                            }
                                                            avey aveyVar2 = this.a;
                                                            csdVar = new csd(this, z3, 17, null);
                                                            aveyVar2.m.execute(csdVar);
                                                        }
                                                    } catch (RuntimeException e6) {
                                                        e = e6;
                                                        avbpVar = new avbp(Status.c.withDescription("failed to parse TXT records").c(e));
                                                        if (avbpVar != null) {
                                                            status = avbpVar.a;
                                                            if (status != null) {
                                                                avbpVarA = new avbp(status);
                                                            } else {
                                                                avbpVarA = aveyVar.n.a((Map) avbpVar.b);
                                                            }
                                                        } else {
                                                            avbpVarA = null;
                                                        }
                                                        avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                                                        this.a.m.execute(new aves((Object) this, (Object) avbrVar, 3, bArr));
                                                        if (!avbrVar.a.d()) {
                                                            z3 = z;
                                                        }
                                                        avey aveyVar3 = this.a;
                                                        csdVar = new csd(this, z3, 17, null);
                                                        aveyVar3.m.execute(csdVar);
                                                    }
                                                }
                                            }
                                            z = false;
                                            Map map = null;
                                            for (Map map2 : arrayList2) {
                                                try {
                                                    for (Map.Entry entry : map2.entrySet()) {
                                                        aguu.ai(avey.c.contains(entry.getKey()), "Bad key: %s", entry);
                                                    }
                                                    List listN2 = avjt.n(map2, "clientLanguage");
                                                    if (listN2 == null || listN2.isEmpty()) {
                                                        dH = avjt.h(map2, "percentage");
                                                        if (dH == null) {
                                                            listN = avjt.n(map2, "clientHostname");
                                                            if (listN != null && !listN.isEmpty()) {
                                                                it = listN.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        map = null;
                                                                    } else if (((String) it.next()).equals(strE)) {
                                                                    }
                                                                }
                                                            }
                                                            mapO = avjt.o(map2, "serviceConfig");
                                                            if (mapO != null) {
                                                                throw new agfz(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                            }
                                                            map = mapO;
                                                        } else {
                                                            iIntValue = dH.intValue();
                                                            if (iIntValue >= 0 || iIntValue > 100) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            aguu.ai(z2, "Bad percentage: %s", dH);
                                                            if (random.nextInt(100) < iIntValue) {
                                                                listN = avjt.n(map2, "clientHostname");
                                                                if (listN != null) {
                                                                    it = listN.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            map = null;
                                                                        } else if (((String) it.next()).equals(strE)) {
                                                                        }
                                                                    }
                                                                }
                                                                mapO = avjt.o(map2, "serviceConfig");
                                                                if (mapO != null) {
                                                                    throw new agfz(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                }
                                                                map = mapO;
                                                            } else {
                                                                map = null;
                                                            }
                                                        }
                                                    } else {
                                                        Iterator it3 = listN2.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if ("java".equalsIgnoreCase((String) it3.next())) {
                                                                    dH = avjt.h(map2, "percentage");
                                                                    if (dH == null) {
                                                                        listN = avjt.n(map2, "clientHostname");
                                                                        if (listN != null) {
                                                                            it = listN.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    if (((String) it.next()).equals(strE)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        mapO = avjt.o(map2, "serviceConfig");
                                                                        if (mapO != null) {
                                                                            throw new agfz(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                        }
                                                                        map = mapO;
                                                                    } else {
                                                                        iIntValue = dH.intValue();
                                                                        if (iIntValue >= 0) {
                                                                            z2 = false;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        aguu.ai(z2, "Bad percentage: %s", dH);
                                                                        if (random.nextInt(100) < iIntValue) {
                                                                            listN = avjt.n(map2, "clientHostname");
                                                                            if (listN != null) {
                                                                                it = listN.iterator();
                                                                                while (true) {
                                                                                    if (it.hasNext()) {
                                                                                        if (((String) it.next()).equals(strE)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            mapO = avjt.o(map2, "serviceConfig");
                                                                            if (mapO != null) {
                                                                                throw new agfz(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                            }
                                                                            map = mapO;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            map = null;
                                                        }
                                                    }
                                                    if (map != null) {
                                                        break;
                                                    }
                                                } catch (RuntimeException e7) {
                                                    avbpVar = new avbp(Status.c.withDescription("failed to pick service config choice").c(e7));
                                                }
                                            }
                                            avbpVar = map == null ? null : new avbp(map);
                                        } catch (IOException e8) {
                                            e = e8;
                                            z = false;
                                            avbpVar = new avbp(Status.c.withDescription("failed to parse TXT records").c(e));
                                            if (avbpVar != null) {
                                                status = avbpVar.a;
                                                if (status != null) {
                                                    avbpVarA = new avbp(status);
                                                } else {
                                                    avbpVarA = aveyVar.n.a((Map) avbpVar.b);
                                                }
                                            } else {
                                                avbpVarA = null;
                                            }
                                            avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                                            this.a.m.execute(new aves((Object) this, (Object) avbrVar, 3, bArr));
                                            if (!avbrVar.a.d()) {
                                                z3 = z;
                                            }
                                            avey aveyVar4 = this.a;
                                            csdVar = new csd(this, z3, 17, null);
                                            aveyVar4.m.execute(csdVar);
                                        } catch (RuntimeException e9) {
                                            e = e9;
                                            z = false;
                                            avbpVar = new avbp(Status.c.withDescription("failed to parse TXT records").c(e));
                                            if (avbpVar != null) {
                                                status = avbpVar.a;
                                                if (status != null) {
                                                    avbpVarA = new avbp(status);
                                                } else {
                                                    avbpVarA = aveyVar.n.a((Map) avbpVar.b);
                                                }
                                            } else {
                                                avbpVarA = null;
                                            }
                                            avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                                            this.a.m.execute(new aves((Object) this, (Object) avbrVar, 3, bArr));
                                            if (!avbrVar.a.d()) {
                                                z3 = z;
                                            }
                                            avey aveyVar5 = this.a;
                                            csdVar = new csd(this, z3, 17, null);
                                            aveyVar5.m.execute(csdVar);
                                        }
                                        if (avbpVar != null) {
                                            status = avbpVar.a;
                                            if (status != null) {
                                                avbpVarA = new avbp(status);
                                            } else {
                                                avbpVarA = aveyVar.n.a((Map) avbpVar.b);
                                            }
                                        }
                                        avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                                    }
                                } else {
                                    z = false;
                                }
                                avbpVarA = null;
                                avbrVar = new avbr(avcfVarB, auyoVar, avbpVarA);
                            } catch (IOException e10) {
                                e = e10;
                                avbrVar = null;
                                this.a.m.execute(new aves((Object) this, (Object) e, 4, (char[]) (objArr == true ? 1 : 0)));
                                if (avbrVar != null || !avbrVar.a.d()) {
                                    z3 = z;
                                }
                                avey aveyVar6 = this.a;
                                csdVar = new csd(this, z3, 17, null);
                                aveyVar6.m.execute(csdVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            csdVar = 0;
                            if (csdVar != 0) {
                                z3 = z;
                            } else {
                                z3 = z;
                            }
                            this.a.m.execute(new csd(this, z3, 17, null));
                            throw th;
                        }
                    }
                    try {
                        this.a.m.execute(new aves((Object) this, (Object) avbrVar, 3, bArr));
                        if (!avbrVar.a.d()) {
                            z3 = z;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        this.a.m.execute(new aves((Object) this, (Object) e, 4, (char[]) (objArr == true ? 1 : 0)));
                        if (avbrVar != null) {
                        }
                        avey aveyVar7 = this.a;
                        csdVar = new csd(this, z3, 17, null);
                        aveyVar7.m.execute(csdVar);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (csdVar != 0 || !csdVar.a.d()) {
                        z3 = z;
                    }
                    this.a.m.execute(new csd(this, z3, 17, null));
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        } catch (IOException e12) {
            e = e12;
            z = false;
        }
        avey aveyVar8 = this.a;
        csdVar = new csd(this, z3, 17, null);
        aveyVar8.m.execute(csdVar);
    }
}
