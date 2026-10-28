package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gai implements Runnable {
    final /* synthetic */ gaj a;

    public gai(gaj gajVar) {
        this.a = gajVar;
    }

    /* JADX WARN: Code duplicated, block: B:206:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:221:0x0447 A[Catch: aiik -> 0x049f, all -> 0x04bb, TryCatch #6 {all -> 0x04bb, blocks: (B:13:0x0027, B:15:0x0035, B:17:0x0038, B:18:0x0046, B:20:0x004a, B:21:0x004c, B:23:0x0054, B:25:0x0058, B:26:0x005a, B:28:0x0062, B:30:0x006b, B:32:0x0071, B:34:0x0075, B:36:0x0079, B:37:0x007b, B:39:0x0088, B:41:0x008c, B:42:0x008e, B:44:0x009a, B:49:0x00b0, B:50:0x00b8, B:220:0x0435, B:221:0x0447, B:223:0x044d, B:225:0x0455, B:226:0x0457, B:66:0x0107, B:72:0x0112, B:73:0x011a, B:146:0x0273, B:237:0x04a5, B:150:0x027a, B:152:0x0282, B:153:0x0284, B:155:0x0298, B:157:0x029b, B:159:0x02bf, B:161:0x02c5, B:163:0x02d4, B:165:0x02d8, B:166:0x02da, B:168:0x02eb, B:170:0x02f1, B:172:0x02f5, B:173:0x02f7, B:175:0x02ff, B:177:0x032a, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:186:0x0347, B:189:0x035f, B:192:0x037a, B:195:0x0390, B:198:0x03a6, B:200:0x03c8, B:202:0x03d2, B:203:0x03dd, B:207:0x03f1, B:209:0x03fc, B:210:0x0401, B:212:0x0408, B:213:0x040d, B:215:0x0419, B:217:0x0425, B:218:0x0430, B:227:0x0461, B:228:0x0475, B:229:0x0489), top: B:261:0x0027, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x044d A[Catch: aiik -> 0x049f, all -> 0x04bb, TryCatch #6 {all -> 0x04bb, blocks: (B:13:0x0027, B:15:0x0035, B:17:0x0038, B:18:0x0046, B:20:0x004a, B:21:0x004c, B:23:0x0054, B:25:0x0058, B:26:0x005a, B:28:0x0062, B:30:0x006b, B:32:0x0071, B:34:0x0075, B:36:0x0079, B:37:0x007b, B:39:0x0088, B:41:0x008c, B:42:0x008e, B:44:0x009a, B:49:0x00b0, B:50:0x00b8, B:220:0x0435, B:221:0x0447, B:223:0x044d, B:225:0x0455, B:226:0x0457, B:66:0x0107, B:72:0x0112, B:73:0x011a, B:146:0x0273, B:237:0x04a5, B:150:0x027a, B:152:0x0282, B:153:0x0284, B:155:0x0298, B:157:0x029b, B:159:0x02bf, B:161:0x02c5, B:163:0x02d4, B:165:0x02d8, B:166:0x02da, B:168:0x02eb, B:170:0x02f1, B:172:0x02f5, B:173:0x02f7, B:175:0x02ff, B:177:0x032a, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:186:0x0347, B:189:0x035f, B:192:0x037a, B:195:0x0390, B:198:0x03a6, B:200:0x03c8, B:202:0x03d2, B:203:0x03dd, B:207:0x03f1, B:209:0x03fc, B:210:0x0401, B:212:0x0408, B:213:0x040d, B:215:0x0419, B:217:0x0425, B:218:0x0430, B:227:0x0461, B:228:0x0475, B:229:0x0489), top: B:261:0x0027, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0455 A[Catch: aiik -> 0x049f, all -> 0x04bb, TryCatch #6 {all -> 0x04bb, blocks: (B:13:0x0027, B:15:0x0035, B:17:0x0038, B:18:0x0046, B:20:0x004a, B:21:0x004c, B:23:0x0054, B:25:0x0058, B:26:0x005a, B:28:0x0062, B:30:0x006b, B:32:0x0071, B:34:0x0075, B:36:0x0079, B:37:0x007b, B:39:0x0088, B:41:0x008c, B:42:0x008e, B:44:0x009a, B:49:0x00b0, B:50:0x00b8, B:220:0x0435, B:221:0x0447, B:223:0x044d, B:225:0x0455, B:226:0x0457, B:66:0x0107, B:72:0x0112, B:73:0x011a, B:146:0x0273, B:237:0x04a5, B:150:0x027a, B:152:0x0282, B:153:0x0284, B:155:0x0298, B:157:0x029b, B:159:0x02bf, B:161:0x02c5, B:163:0x02d4, B:165:0x02d8, B:166:0x02da, B:168:0x02eb, B:170:0x02f1, B:172:0x02f5, B:173:0x02f7, B:175:0x02ff, B:177:0x032a, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:186:0x0347, B:189:0x035f, B:192:0x037a, B:195:0x0390, B:198:0x03a6, B:200:0x03c8, B:202:0x03d2, B:203:0x03dd, B:207:0x03f1, B:209:0x03fc, B:210:0x0401, B:212:0x0408, B:213:0x040d, B:215:0x0419, B:217:0x0425, B:218:0x0430, B:227:0x0461, B:228:0x0475, B:229:0x0489), top: B:261:0x0027, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0461 A[Catch: aiik -> 0x049f, all -> 0x04bb, TryCatch #6 {all -> 0x04bb, blocks: (B:13:0x0027, B:15:0x0035, B:17:0x0038, B:18:0x0046, B:20:0x004a, B:21:0x004c, B:23:0x0054, B:25:0x0058, B:26:0x005a, B:28:0x0062, B:30:0x006b, B:32:0x0071, B:34:0x0075, B:36:0x0079, B:37:0x007b, B:39:0x0088, B:41:0x008c, B:42:0x008e, B:44:0x009a, B:49:0x00b0, B:50:0x00b8, B:220:0x0435, B:221:0x0447, B:223:0x044d, B:225:0x0455, B:226:0x0457, B:66:0x0107, B:72:0x0112, B:73:0x011a, B:146:0x0273, B:237:0x04a5, B:150:0x027a, B:152:0x0282, B:153:0x0284, B:155:0x0298, B:157:0x029b, B:159:0x02bf, B:161:0x02c5, B:163:0x02d4, B:165:0x02d8, B:166:0x02da, B:168:0x02eb, B:170:0x02f1, B:172:0x02f5, B:173:0x02f7, B:175:0x02ff, B:177:0x032a, B:179:0x0330, B:181:0x0336, B:183:0x033c, B:186:0x0347, B:189:0x035f, B:192:0x037a, B:195:0x0390, B:198:0x03a6, B:200:0x03c8, B:202:0x03d2, B:203:0x03dd, B:207:0x03f1, B:209:0x03fc, B:210:0x0401, B:212:0x0408, B:213:0x040d, B:215:0x0419, B:217:0x0425, B:218:0x0430, B:227:0x0461, B:228:0x0475, B:229:0x0489), top: B:261:0x0027, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139 A[PHI: r16
      0x0139: PHI (r16v10 long) = 
      (r16v7 long)
      (r16v7 long)
      (r16v7 long)
      (r16v7 long)
      (r16v7 long)
      (r16v13 long)
      (r16v13 long)
      (r16v13 long)
      (r16v13 long)
      (r16v13 long)
      (r16v14 long)
     binds: [B:154:0x0296, B:156:0x0299, B:162:0x02d2, B:169:0x02ef, B:160:0x02c3, B:104:0x019f, B:127:0x021e, B:119:0x01e9, B:114:0x01d8, B:109:0x01c4, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gaj gajVar;
        String str;
        String str2;
        aiik aiikVar;
        CountDownLatch countDownLatch;
        long j;
        boolean zCommit;
        aepb aepbVarN;
        Object obj;
        gaj gajVar2 = this.a;
        synchronized (gajVar2.i) {
            if (gajVar2.j) {
                return;
            }
            gajVar2.j = true;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                aepb aepbVarN2 = gajVar2.n();
                if (aepbVarN2 != null) {
                    Object obj2 = aepbVarN2.c;
                    str2 = ((gcz) obj2).c;
                    str = ((gcz) obj2).d;
                } else {
                    str = null;
                    str2 = null;
                }
                try {
                    try {
                        kws kwsVarAa = ixt.aa(gajVar2.a, gajVar2.f, str2, str, gajVar2.e);
                        byte[] bArr = kwsVarAa.b;
                        try {
                            if (bArr == null || bArr.length == 0) {
                                gajVar2.e.e(5009, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
                            } else {
                                try {
                                    gcx gcxVar = (gcx) aihn.parseFrom(gcx.a, aigj.v(bArr), ExtensionRegistryLite.a);
                                    gcz gczVar = gcxVar.b;
                                    if (gczVar == null) {
                                        try {
                                            gczVar = gcz.a;
                                        } catch (aiik e) {
                                            aiikVar = e;
                                            gajVar2.e.e(4002, System.currentTimeMillis() - jCurrentTimeMillis, aiikVar, null, null);
                                        }
                                    }
                                    if (gczVar.c.isEmpty()) {
                                        gajVar2.e.e(5010, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
                                    } else {
                                        gcz gczVar2 = gcxVar.b;
                                        if (gczVar2 == null) {
                                            gczVar2 = gcz.a;
                                        }
                                        if (gczVar2.d.isEmpty() || gcxVar.d.G().length == 0) {
                                            gajVar2.e.e(5010, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
                                        } else {
                                            aepb aepbVarN3 = gajVar2.n();
                                            if (aepbVarN3 != null && (obj = aepbVarN3.c) != null) {
                                                gcz gczVar3 = gcxVar.b;
                                                if (gczVar3 == null) {
                                                    gczVar3 = gcz.a;
                                                }
                                                if (gczVar3.c.equals(((gcz) obj).c)) {
                                                    gcz gczVar4 = gcxVar.b;
                                                    if (gczVar4 == null) {
                                                        gczVar4 = gcz.a;
                                                    }
                                                    if (gczVar4.d.equals(((gcz) obj).d)) {
                                                        gajVar2.e.e(5010, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
                                                    }
                                                }
                                            }
                                            qcb qcbVar = gajVar2.l;
                                            int i = kwsVarAa.c;
                                            if (!((Boolean) jwp.a.d()).booleanValue()) {
                                                j = jCurrentTimeMillis;
                                                kwq kwqVar = gajVar2.b;
                                                gcz gczVar5 = gcxVar.b;
                                                if (gczVar5 == null) {
                                                    gczVar5 = gcz.a;
                                                }
                                                String str3 = gczVar5.c;
                                                byte[] bArrG = gcxVar.c.G();
                                                byte[] bArrG2 = gcxVar.d.G();
                                                if (TextUtils.isEmpty(str3) || bArrG2.length == 0) {
                                                    zCommit = false;
                                                } else {
                                                    Object obj3 = kwqVar.b;
                                                    ixt.X((File) obj3);
                                                    ((File) obj3).mkdirs();
                                                    ixt.W(str3, (File) obj3).mkdirs();
                                                    File fileV = ixt.V(str3, "pcam.jar", (File) obj3);
                                                    if ((bArrG.length <= 0 || ixt.Y(fileV, bArrG)) && ixt.Y(ixt.V(str3, "pcbc", (File) obj3), bArrG2)) {
                                                        gcz gczVar6 = gcxVar.b;
                                                        if (gczVar6 == null) {
                                                            gczVar6 = gcz.a;
                                                        }
                                                        File fileV2 = ixt.V(gczVar6.c, "pcam.jar", (File) obj3);
                                                        if (!fileV2.exists() || qcbVar.G(fileV2)) {
                                                            gcz gczVar7 = gcxVar.b;
                                                            if (gczVar7 == null) {
                                                                gczVar7 = gcz.a;
                                                            }
                                                            String str4 = gczVar7.c;
                                                            if (TextUtils.isEmpty(str4)) {
                                                                zCommit = false;
                                                            } else {
                                                                File fileV3 = ixt.V(str4, "pcam.jar", (File) obj3);
                                                                File fileV4 = ixt.V(str4, "pcbc", (File) obj3);
                                                                File fileV5 = ixt.V(str4, "pcam.jar", kwqVar.a());
                                                                File fileV6 = ixt.V(str4, "pcbc", kwqVar.a());
                                                                if ((!fileV3.exists() || fileV3.renameTo(fileV5)) && fileV4.exists() && fileV4.renameTo(fileV6)) {
                                                                    gcz gczVar8 = gcz.a;
                                                                    aihf aihfVarCreateBuilder = gczVar8.createBuilder();
                                                                    gcz gczVar9 = gcxVar.b;
                                                                    if (gczVar9 == null) {
                                                                        gczVar9 = gczVar8;
                                                                    }
                                                                    String str5 = gczVar9.c;
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    gcz gczVar10 = (gcz) aihfVarCreateBuilder.instance;
                                                                    str5.getClass();
                                                                    gczVar10.b |= 1;
                                                                    gczVar10.c = str5;
                                                                    gcz gczVar11 = gcxVar.b;
                                                                    if (gczVar11 == null) {
                                                                        gczVar11 = gczVar8;
                                                                    }
                                                                    String str6 = gczVar11.d;
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    gcz gczVar12 = (gcz) aihfVarCreateBuilder.instance;
                                                                    str6.getClass();
                                                                    gczVar12.b |= 2;
                                                                    gczVar12.d = str6;
                                                                    gcz gczVar13 = gcxVar.b;
                                                                    if (gczVar13 == null) {
                                                                        gczVar13 = gczVar8;
                                                                    }
                                                                    long j2 = gczVar13.f;
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    gcz gczVar14 = (gcz) aihfVarCreateBuilder.instance;
                                                                    gczVar14.b |= 8;
                                                                    gczVar14.f = j2;
                                                                    gcz gczVar15 = gcxVar.b;
                                                                    if (gczVar15 == null) {
                                                                        gczVar15 = gczVar8;
                                                                    }
                                                                    long j3 = gczVar15.g;
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    gcz gczVar16 = (gcz) aihfVarCreateBuilder.instance;
                                                                    gczVar16.b |= 16;
                                                                    gczVar16.g = j3;
                                                                    gcz gczVar17 = gcxVar.b;
                                                                    if (gczVar17 != null) {
                                                                        gczVar8 = gczVar17;
                                                                    }
                                                                    long j4 = gczVar8.e;
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    gcz gczVar18 = (gcz) aihfVarCreateBuilder.instance;
                                                                    gczVar18.b |= 4;
                                                                    gczVar18.e = j4;
                                                                    gcz gczVar19 = (gcz) aihfVarCreateBuilder.build();
                                                                    gcz gczVarE = kwqVar.e(1);
                                                                    SharedPreferences.Editor editorEdit = kwqVar.c.edit();
                                                                    if (gczVarE != null && !gczVar19.c.equals(gczVarE.c)) {
                                                                        editorEdit.putString(kwqVar.c(), kwq.b(gczVarE));
                                                                    }
                                                                    editorEdit.putString(kwqVar.d(), kwq.b(gczVar19));
                                                                    if (editorEdit.commit()) {
                                                                        zCommit = true;
                                                                    } else {
                                                                        zCommit = false;
                                                                    }
                                                                } else {
                                                                    zCommit = false;
                                                                }
                                                            }
                                                            HashSet hashSet = new HashSet();
                                                            gcz gczVarE2 = kwqVar.e(1);
                                                            if (gczVarE2 != null) {
                                                                hashSet.add(gczVarE2.c);
                                                            }
                                                            gcz gczVarE3 = kwqVar.e(2);
                                                            if (gczVarE3 != null) {
                                                                hashSet.add(gczVarE3.c);
                                                            }
                                                            for (File file : kwqVar.a().listFiles()) {
                                                                String name = file.getName();
                                                                if (!hashSet.contains(name)) {
                                                                    ixt.X(ixt.W(name, kwqVar.a()));
                                                                }
                                                            }
                                                        } else {
                                                            zCommit = false;
                                                        }
                                                    } else {
                                                        zCommit = false;
                                                    }
                                                }
                                                if (zCommit) {
                                                    aepbVarN = gajVar2.n();
                                                    if (aepbVarN != null) {
                                                        if (gajVar2.d.b(aepbVarN)) {
                                                            gajVar2.k = true;
                                                        }
                                                        gajVar2.h = System.currentTimeMillis() / 1000;
                                                    }
                                                    countDownLatch = gajVar2.g;
                                                    countDownLatch.countDown();
                                                    gajVar = this.a;
                                                    synchronized (gajVar.i) {
                                                        gajVar.j = false;
                                                    }
                                                }
                                            } else if (i == 3) {
                                                kwt kwtVar = gajVar2.c;
                                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                synchronized (kwt.a) {
                                                    try {
                                                        gcz gczVar20 = gcxVar.b;
                                                        if (gczVar20 == null) {
                                                            gczVar20 = gcz.a;
                                                        }
                                                        if (ixt.Y(new File(kwtVar.a(gczVar20.c), "pcbc"), gcxVar.d.G())) {
                                                            String strB = kwt.b(gcxVar);
                                                            SharedPreferences.Editor editorEdit2 = kwtVar.c.edit();
                                                            editorEdit2.putString(kwtVar.d(), strB);
                                                            zCommit = editorEdit2.commit();
                                                            if (zCommit) {
                                                                kwtVar.e(5015, jCurrentTimeMillis2);
                                                            } else {
                                                                kwtVar.e(4021, jCurrentTimeMillis2);
                                                            }
                                                            j = jCurrentTimeMillis;
                                                        } else {
                                                            kwtVar.e(4020, jCurrentTimeMillis2);
                                                            j = jCurrentTimeMillis;
                                                            zCommit = false;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                if (zCommit) {
                                                    aepbVarN = gajVar2.n();
                                                    if (aepbVarN != null) {
                                                        if (gajVar2.d.b(aepbVarN)) {
                                                            gajVar2.k = true;
                                                        }
                                                        gajVar2.h = System.currentTimeMillis() / 1000;
                                                    }
                                                    countDownLatch = gajVar2.g;
                                                    countDownLatch.countDown();
                                                    gajVar = this.a;
                                                    synchronized (gajVar.i) {
                                                        gajVar.j = false;
                                                    }
                                                }
                                            } else if (i == 4) {
                                                kwt kwtVar2 = gajVar2.c;
                                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                try {
                                                    synchronized (kwt.a) {
                                                        try {
                                                            gcz gczVarG = kwtVar2.g(1);
                                                            gcz gczVar21 = gcxVar.b;
                                                            if (gczVar21 == null) {
                                                                gczVar21 = gcz.a;
                                                            }
                                                            String str7 = gczVar21.c;
                                                            if (gczVarG == null || !gczVarG.c.equals(str7)) {
                                                                j = jCurrentTimeMillis;
                                                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                                File fileA = kwtVar2.a(str7);
                                                                if (fileA.exists()) {
                                                                    kwtVar2.f(4023, jCurrentTimeMillis4, a.ca(true != fileA.isFile() ? "0" : "1", true != fileA.isDirectory() ? "0" : "1", "d:", ",f:"));
                                                                    kwtVar2.e(4015, jCurrentTimeMillis4);
                                                                } else {
                                                                    if (!fileA.mkdirs()) {
                                                                        kwtVar2.f(4024, jCurrentTimeMillis4, "cw:".concat(true != fileA.canWrite() ? "0" : "1"));
                                                                        kwtVar2.e(4015, jCurrentTimeMillis4);
                                                                    }
                                                                    zCommit = false;
                                                                }
                                                                File fileA2 = kwtVar2.a(str7);
                                                                File file2 = new File(fileA2, "pcam.jar");
                                                                File file3 = new File(fileA2, "pcbc");
                                                                if (!ixt.Y(file2, gcxVar.c.G())) {
                                                                    kwtVar2.e(4016, jCurrentTimeMillis3);
                                                                } else if (!ixt.Y(file3, gcxVar.d.G())) {
                                                                    kwtVar2.e(4017, jCurrentTimeMillis3);
                                                                } else if (qcbVar.G(file2)) {
                                                                    String strB2 = kwt.b(gcxVar);
                                                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                                    SharedPreferences sharedPreferences = kwtVar2.c;
                                                                    String string = sharedPreferences.getString(kwtVar2.d(), null);
                                                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                                                    editorEdit3.putString(kwtVar2.d(), strB2);
                                                                    if (string != null) {
                                                                        editorEdit3.putString(kwtVar2.c(), string);
                                                                    }
                                                                    if (editorEdit3.commit()) {
                                                                        HashSet hashSet2 = new HashSet();
                                                                        gcz gczVarG2 = kwtVar2.g(1);
                                                                        if (gczVarG2 != null) {
                                                                            hashSet2.add(gczVarG2.c);
                                                                        }
                                                                        gcz gczVarG3 = kwtVar2.g(2);
                                                                        if (gczVarG3 != null) {
                                                                            hashSet2.add(gczVarG3.c);
                                                                        }
                                                                        for (File file4 : new File(kwtVar2.b.getDir("pccache", 0), kwtVar2.d).listFiles()) {
                                                                            if (!hashSet2.contains(file4.getName())) {
                                                                                ixt.X(file4);
                                                                            }
                                                                        }
                                                                        kwtVar2.e(5014, jCurrentTimeMillis3);
                                                                        zCommit = true;
                                                                    } else {
                                                                        kwtVar2.e(4019, jCurrentTimeMillis5);
                                                                    }
                                                                } else {
                                                                    kwtVar2.e(4018, jCurrentTimeMillis3);
                                                                    ixt.X(fileA2);
                                                                }
                                                                zCommit = false;
                                                            } else {
                                                                kwtVar2.e(4014, jCurrentTimeMillis3);
                                                                j = jCurrentTimeMillis;
                                                                zCommit = false;
                                                            }
                                                            if (zCommit) {
                                                                aepbVarN = gajVar2.n();
                                                                if (aepbVarN != null) {
                                                                    if (gajVar2.d.b(aepbVarN)) {
                                                                        gajVar2.k = true;
                                                                    }
                                                                    gajVar2.h = System.currentTimeMillis() / 1000;
                                                                }
                                                                countDownLatch = gajVar2.g;
                                                                countDownLatch.countDown();
                                                                gajVar = this.a;
                                                                synchronized (gajVar.i) {
                                                                    gajVar.j = false;
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } else {
                                                j = jCurrentTimeMillis;
                                            }
                                            gajVar2.e.e(4009, System.currentTimeMillis() - j, null, null, null);
                                        }
                                    }
                                } catch (NullPointerException unused) {
                                    gajVar2.e.e(2030, System.currentTimeMillis() - jCurrentTimeMillis, null, null, null);
                                }
                            }
                            countDownLatch = gajVar2.g;
                        } catch (aiik e2) {
                            e = e2;
                            aiikVar = e;
                            gajVar2.e.e(4002, System.currentTimeMillis() - jCurrentTimeMillis, aiikVar, null, null);
                            countDownLatch = gajVar2.g;
                            countDownLatch.countDown();
                            gajVar = this.a;
                            synchronized (gajVar.i) {
                                gajVar.j = false;
                            }
                        }
                    } catch (aiik e3) {
                        e = e3;
                    }
                    countDownLatch.countDown();
                } catch (Throwable th4) {
                    gajVar2.g.countDown();
                    throw th4;
                }
            } catch (Exception e4) {
                this.a.e.e(2023, -1L, e4, null, null);
            }
            gajVar = this.a;
            synchronized (gajVar.i) {
                gajVar.j = false;
            }
        }
    }
}
