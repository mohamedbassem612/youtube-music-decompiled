package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbf implements acbd {
    private static final Pattern a = Pattern.compile("X-TIMESTAMP-MAP=LOCAL:\\S+,MPEGTS:(\\d+)", 2);
    private final twi b;

    public acbf(twi twiVar) {
        this.b = twiVar;
    }

    @Override // defpackage.acbd
    public final void a(acbg acbgVar, bwb bwbVar, long j, int i) throws yxm {
        throw new yxm(6, null);
    }

    @Override // defpackage.acbd
    public final void b(acbg acbgVar, bwb bwbVar, long j, int i) {
        bwb bwbVar2;
        long j2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!"WEBVTT".equals(bwbVar.z())) {
                throw new bsz("Missing WEBVTT header", null, true, 1);
            }
            String strZ = bwbVar.z();
            long j3 = 0;
            while (true) {
                if (strZ == null) {
                    bwbVar2 = bwbVar;
                } else {
                    if (strZ.isEmpty()) {
                        break;
                    }
                    bwbVar2 = bwbVar;
                    if (strZ.startsWith("X-TIMESTAMP-MAP")) {
                        Matcher matcher = a.matcher(strZ);
                        String strGroup = matcher.matches() ? matcher.group(1) : null;
                        j3 = (long) ((strGroup != null ? Long.parseLong(strGroup) : 0L) * 11.1111111d);
                    }
                }
                strZ = bwbVar2.z();
            }
            while (true) {
                aawx aawxVarC = ddg.c(bwbVar, Collections.EMPTY_LIST);
                if (aawxVarC == null) {
                    break;
                } else {
                    arrayList2.add(new aawx(aawxVarC.c, aawxVarC.a + j3, aawxVarC.b + j3));
                }
            }
            acbgVar.b(j3 / 1000);
            long size = arrayList2.size();
            int i2 = 0;
            aawx aawxVar = (aawx) arrayList2.get(0);
            long jMax = aawxVar.a;
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                long j4 = i2;
                if (j4 >= size) {
                    break;
                }
                int i3 = i2;
                long j5 = aawxVar.b;
                long j6 = size - 1;
                String strConcat = "".concat(String.valueOf(String.valueOf(((bus) aawxVar.c).u)));
                if (j4 < j6) {
                    int i4 = i3 + 1;
                    long j7 = j5;
                    while (true) {
                        if (i4 >= size) {
                            j2 = size;
                            break;
                        }
                        aawx aawxVar2 = (aawx) arrayList2.get(i4);
                        j2 = size;
                        long j8 = aawxVar2.a;
                        if (j8 > j7) {
                            break;
                        }
                        if (j8 > jMax) {
                            j7 = j8;
                        }
                        if (j8 <= jMax && aawxVar2.b >= j7) {
                            strConcat = strConcat.concat("\n").concat(String.valueOf(String.valueOf(((bus) aawxVar2.c).u)));
                        }
                        i4++;
                        size = j2;
                    }
                    j5 = j7;
                } else {
                    j2 = size;
                }
                String str = strConcat;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long j9 = jMax / 1000;
                arrayList3.add(new acci(0, j9, str, str, accf.a));
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                arrayList.add(new acbl(j9, j5 / 1000, arrayList3, this.b));
                if (j4 == j6) {
                    break;
                }
                arrayList3 = new ArrayList();
                jMax = j5;
                i2 = i3;
                while (jMax >= aawxVar.b) {
                    i2++;
                    if (i2 >= j2) {
                        break;
                    }
                    aawxVar = (aawx) arrayList2.get(i2);
                    jMax = Math.max(jMax, aawxVar.a);
                }
                size = j2;
            }
            if (arrayList.isEmpty()) {
                acbgVar.a(acbn.a(this.b, j));
            } else {
                acbgVar.a(arrayList);
            }
        } catch (bsz unused) {
            acbgVar.a(acbn.a(null, j));
        }
    }
}
