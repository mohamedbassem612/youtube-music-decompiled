package defpackage;

import io.grpc.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avbs {
    public final boolean a;
    public final int b;
    public final int c;
    public final Object d;

    public avbs(int i, int i2, float[] fArr) {
        boolean z = true;
        ahno.G(i > 0, "Input channel count must be positive.");
        ahno.G(i2 > 0, "Output channel count must be positive.");
        ahno.G(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.c = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(a.bP(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.d = fArr;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                if (c(i4, i5) != 0.0f) {
                    z = false;
                }
            }
        }
        this.a = z;
    }

    public final avbp a(Map map) {
        avbp avbpVar;
        Object obj;
        avjg avjgVar;
        avhk avhkVar;
        Map mapO;
        try {
            avbp avbpVarB = ((avav) this.d).b(map);
            avhi avhiVar = null;
            if (avbpVarB == null) {
                obj = null;
            } else {
                Status status = avbpVarB.a;
                if (status != null) {
                    return new avbp(status);
                }
                obj = avbpVarB.b;
            }
            boolean z = this.a;
            int i = this.b;
            int i2 = this.c;
            if (!z || map == null || (mapO = avjt.o(map, "retryThrottling")) == null) {
                avjgVar = null;
            } else {
                float fFloatValue = avjt.h(mapO, "maxTokens").floatValue();
                float fFloatValue2 = avjt.h(mapO, "tokenRatio").floatValue();
                ahno.P(fFloatValue > 0.0f, "maxToken should be greater than zero");
                ahno.P(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                avjgVar = new avjg(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapO2 = map == null ? null : avjt.o(map, "healthCheckConfig");
            List<Map> listM = avjt.m(map, "methodConfig");
            if (listM == null) {
                avhkVar = new avhk(null, map2, map3, avjgVar, obj, mapO2);
            } else {
                Map map4 = mapO2;
                boolean z2 = true;
                for (Map map5 : listM) {
                    avhi avhiVar2 = new avhi(map5, z, i, i2);
                    List<Map> listM2 = avjt.m(map5, "name");
                    if (listM2 == null || listM2.isEmpty()) {
                        z2 = z2;
                    } else {
                        for (Map map6 : listM2) {
                            String strK = avjt.k(map6, "service");
                            boolean z3 = z2;
                            String strK2 = avjt.k(map6, "method");
                            if (ahno.aa(strK)) {
                                ahno.K(ahno.aa(strK2), "missing service name for method %s", strK2);
                                ahno.K(avhiVar == null ? z3 : false, "Duplicate default method config in service config %s", map);
                                avhiVar = avhiVar2;
                            } else if (ahno.aa(strK2)) {
                                ahno.K(!map3.containsKey(strK), "Duplicate service %s", strK);
                                map3.put(strK, avhiVar2);
                            } else {
                                String strB = avbh.b(strK, strK2);
                                ahno.K(!map2.containsKey(strB), "Duplicate method name %s", strB);
                                map2.put(strB, avhiVar2);
                            }
                            z2 = z3;
                        }
                    }
                }
                avhkVar = new avhk(avhiVar, map2, map3, avjgVar, obj, map4);
            }
            return new avbp(avhkVar);
        } catch (RuntimeException e) {
            avbpVar = new avbp(Status.c.withDescription("failed to parse service config").c(e));
            return avbpVar;
        } catch (Throwable th) {
            avbpVar = new avbp(Status.l.withDescription("Unexpected error parsing service config").c(th));
            return avbpVar;
        }
    }

    public final boolean b() {
        int i = this.c;
        return i == 2 || i == 3;
    }

    public final float c(int i, int i2) {
        return ((float[]) this.d)[(i * this.b) + i2];
    }

    public avbs(boolean z, int i, acer acerVar, int i2) {
        this.a = z;
        this.c = i;
        this.d = acerVar;
        this.b = i2;
    }

    public avbs(boolean z, int i, int i2, avav avavVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        avavVar.getClass();
        this.d = avavVar;
    }

    public avbs(int i, int i2, boolean z, int i3) {
        this.d = new AtomicInteger(i2);
        this.a = z;
        this.c = i;
        this.b = i3;
    }
}
