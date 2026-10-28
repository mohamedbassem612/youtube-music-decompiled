package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auyq {
    public static final auyq a;
    public final auzi b;
    public final Executor c;
    public final String d = null;
    public final List e;
    public final Integer f;
    public final Integer g;
    private final Object[][] h;
    private final Boolean i;

    static {
        avcl avclVar = new avcl(null);
        avclVar.f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        avclVar.a = Collections.EMPTY_LIST;
        a = new auyq(avclVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public auyq(avcl avclVar) {
        this.b = (auzi) avclVar.b;
        this.c = avclVar.g;
        this.h = (Object[][]) avclVar.f;
        this.e = avclVar.a;
        this.i = (Boolean) avclVar.e;
        this.f = (Integer) avclVar.d;
        this.g = (Integer) avclVar.c;
    }

    public static avcl f(auyq auyqVar) {
        avcl avclVar = new avcl(null);
        avclVar.b = auyqVar.b;
        avclVar.g = auyqVar.c;
        avclVar.f = auyqVar.h;
        avclVar.a = auyqVar.e;
        avclVar.e = auyqVar.i;
        avclVar.d = auyqVar.f;
        avclVar.c = auyqVar.g;
        return avclVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final auyq a(int i) {
        ahno.I((i ^ (-1)) >>> 31, "invalid maxsize %s", i);
        avcl avclVarF = f(this);
        avclVarF.d = Integer.valueOf(i);
        return new auyq(avclVarF);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final auyq b(int i) {
        ahno.I((i ^ (-1)) >>> 31, "invalid maxsize %s", i);
        avcl avclVarF = f(this);
        avclVarF.c = Integer.valueOf(i);
        return new auyq(avclVarF);
    }

    public final auyq c(auyp auypVar, Object obj) {
        Object[][] objArr;
        int length;
        auypVar.getClass();
        obj.getClass();
        avcl avclVarF = f(this);
        int i = 0;
        while (true) {
            objArr = this.h;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (auypVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        avclVarF.f = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, avclVarF.f, 0, length);
        if (i == -1) {
            ((Object[][]) avclVarF.f)[length] = new Object[]{auypVar, obj};
        } else {
            ((Object[][]) avclVarF.f)[i] = new Object[]{auypVar, obj};
        }
        return new auyq(avclVarF);
    }

    public final Object d(auyp auypVar) {
        auypVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i >= objArr.length) {
                return auypVar.a;
            }
            if (auypVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.i);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("deadline", this.b);
        ageuVarAc.b("authority", null);
        ageuVarAc.b("callCredentials", null);
        Executor executor = this.c;
        ageuVarAc.b("executor", executor != null ? executor.getClass() : null);
        ageuVarAc.b("compressorName", null);
        ageuVarAc.b("customOptions", Arrays.deepToString(this.h));
        ageuVarAc.g("waitForReady", e());
        ageuVarAc.b("maxInboundMessageSize", this.f);
        ageuVarAc.b("maxOutboundMessageSize", this.g);
        ageuVarAc.b("onReadyThreshold", null);
        ageuVarAc.b("streamTracerFactories", this.e);
        return ageuVarAc.toString();
    }
}
