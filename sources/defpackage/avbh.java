package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avbh {
    public final avbg a;
    public final String b;
    public final String c;
    public final avbf d;
    private final avbf e;
    private final boolean f;

    public avbh(avbg avbgVar, String str, avbf avbfVar, avbf avbfVar2, boolean z) {
        new AtomicReferenceArray(2);
        avbgVar.getClass();
        this.a = avbgVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        avbfVar.getClass();
        this.e = avbfVar;
        avbfVar2.getClass();
        this.d = avbfVar2;
        this.f = z;
    }

    public static String b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + '/' + str2;
    }

    public static aeg c() {
        aeg aegVar = new aeg((byte[]) null);
        aegVar.c = null;
        aegVar.b = null;
        return aegVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream a(Object obj) {
        return new avkj(obj, ((avkk) this.e).b);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("fullMethodName", this.b);
        ageuVarAc.b("type", this.a);
        ageuVarAc.g("idempotent", false);
        ageuVarAc.g("safe", false);
        ageuVarAc.g("sampledToLocalTracing", this.f);
        ageuVarAc.b("requestMarshaller", this.e);
        ageuVarAc.b("responseMarshaller", this.d);
        ageuVarAc.b("schemaDescriptor", null);
        ageuVarAc.a = true;
        return ageuVarAc.toString();
    }
}
