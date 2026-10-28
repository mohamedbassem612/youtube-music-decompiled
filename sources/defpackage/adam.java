package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adam {
    public final Object a;
    private final Object b;
    private final Object c;
    private volatile Object d;
    private volatile Object e;

    public adam(String str, Object obj, lck lckVar) {
        this.d = null;
        this.e = null;
        this.a = str;
        this.c = obj;
        this.b = lckVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final boolean a(nzs nzsVar) {
        if (this.d == null || this.e == null) {
            synchronized (this.b) {
                if (this.d == null) {
                    Object obj = this.c;
                    HashMap map = new HashMap();
                    if (obj != null && !((String) obj).isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) obj);
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                Object obj2 = jSONObject.get(next);
                                if (obj2 instanceof Double) {
                                    map.put(ahno.ae(next), Float.valueOf(((Double) obj2).floatValue()));
                                } else if (obj2 instanceof Integer) {
                                    map.put(ahno.ae(next), Float.valueOf(((Integer) obj2).floatValue()));
                                }
                            }
                        } catch (JSONException e) {
                            zvp.b(zvn.b, zvm.x, "Error parsing ElementsPerformanceMetricSubSampleRateJsonConfig", e);
                        }
                    }
                    this.d = map;
                }
                if (this.e == null) {
                    this.e = new HashMap();
                }
            }
        }
        String strAe = ahno.ae(nzsVar.x);
        Float f = this.d != null ? (Float) this.d.get(strAe) : null;
        boolean z = true;
        if (f == null || f.floatValue() > 1.0f) {
            return true;
        }
        if (f.floatValue() == 0.0f) {
            return false;
        }
        Float fValueOf = this.e != null ? (Float) this.e.get(strAe) : null;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(((Random) this.a).nextFloat());
        }
        float fFloatValue = fValueOf.floatValue() + f.floatValue();
        Float fValueOf2 = Float.valueOf(fFloatValue);
        fValueOf2.getClass();
        if (fFloatValue >= 1.0f) {
            fValueOf2.getClass();
            fValueOf2 = Float.valueOf(fFloatValue - 1.0f);
        } else {
            z = false;
        }
        if (this.e == null) {
            return z;
        }
        this.e.put(strAe, fValueOf2);
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lck] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, lck] */
    public final Object b(Object obj) {
        Object obj2 = this.d;
        if (obj != null) {
            return obj;
        }
        if (ksy.a != null) {
            if (!a.x()) {
                try {
                    for (adam adamVar : lcl.a) {
                        if (a.x()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            ?? r2 = adamVar.b;
                            if (r2 != 0) {
                                objA = r2.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        adamVar.e = objA;
                    }
                } catch (SecurityException unused2) {
                }
                ?? r4 = this.b;
                if (r4 != 0) {
                    try {
                        return r4.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                boolean z = ksy.a.a;
                return this.c;
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                return obj3;
            }
        }
        return this.c;
    }

    public adam(String str, Random random) {
        this.b = new Object();
        this.c = str;
        this.a = random;
    }
}
