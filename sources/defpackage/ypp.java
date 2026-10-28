package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ypp {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    private Object j;
    private Object k;

    public ypp(ypq ypqVar) {
        this.h = Optional.empty();
        this.c = ypqVar.a;
        this.j = ypqVar.b;
        this.d = ypqVar.c;
        this.k = ypqVar.d;
        this.i = ypqVar.j;
        this.a = ypqVar.e;
        this.e = ypqVar.f;
        this.f = ypqVar.g;
        this.g = ypqVar.h;
        this.h = ypqVar.i;
        this.b = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ywn] */
    public final ypq a() {
        ?? r7;
        if (this.b != 1 || (r7 = this.e) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" forceRequestIdempotent");
            }
            if (this.e == null) {
                sb.append(" qoeLogger");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj = this.c;
        Object obj2 = this.j;
        Object obj3 = this.d;
        Object obj4 = this.k;
        Object obj5 = this.i;
        return new ypq((Long) obj, (Long) obj2, (Long) obj3, (Long) obj4, (xxj) obj5, this.a, r7, (cuz) this.f, (wgs) this.g, (Optional) this.h);
    }

    public final void b(long j) {
        if (j != -9223372036854775807L) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            f(j / 1000);
        }
    }

    public final void c(long j) {
        if (j != -9223372036854775807L) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            g(j / 1000);
        }
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void e(long j) {
        this.d = Long.valueOf(j);
    }

    public final void f(long j) {
        this.j = Long.valueOf(j);
    }

    public final void g(long j) {
        this.c = Long.valueOf(j);
    }

    public final void h(long j) {
        this.k = Long.valueOf(j);
    }

    public final void i(ywn ywnVar) {
        if (ywnVar == null) {
            throw new NullPointerException("Null qoeLogger");
        }
        this.e = ywnVar;
    }

    public final void j(tok tokVar) {
        this.h = Optional.of(tokVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, sya] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, sxz] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Set] */
    public final wlo k() {
        Object obj;
        ?? r3;
        ?? r4;
        ?? r5;
        ?? r6;
        ?? r7;
        Object obj2;
        if (this.b == 1 && (obj = this.h) != null && (r3 = this.j) != 0 && (r4 = this.d) != 0 && (r5 = this.g) != 0 && (r6 = this.f) != 0 && (r7 = this.k) != 0 && (obj2 = this.e) != null) {
            Object objD = this.i;
            Object obj3 = this.c;
            boolean z = this.a;
            if (objD == null) {
                objD = ((wlp) obj2).d();
            }
            return ((wlp) obj2).c((wlu) obj, r3, r4, r5, r6, r7, (wlt) objD, (ainp) obj3, z);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" innerTubeServiceRequest");
        }
        if (this.j == null) {
            sb.append(" defaultInstance");
        }
        if (this.d == null) {
            sb.append(" serviceListener");
        }
        if (this.g == null) {
            sb.append(" reqContextSetter");
        }
        if (this.f == null) {
            sb.append(" respContextGetter");
        }
        if (this.k == null) {
            sb.append(" nestedRespGetters");
        }
        if (this.e == null) {
            sb.append(" factory");
        }
        if (this.b == 0) {
            sb.append(" retainFut");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null defaultInstance");
        }
        this.j = messageLite;
    }

    public final void m(Set set) {
        if (set == null) {
            throw new NullPointerException("Null nestedRespGetters");
        }
        this.k = set;
    }

    public final void n(xxj... xxjVarArr) {
        int length = xxjVarArr.length;
        this.i = new xxj(xxjVarArr[0].a);
    }

    public ypp() {
        this.h = Optional.empty();
    }

    public ypp(byte[] bArr) {
    }
}
