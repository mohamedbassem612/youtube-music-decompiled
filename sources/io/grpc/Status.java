package io.grpc;

import defpackage.a;
import defpackage.ageu;
import defpackage.agfv;
import defpackage.ahno;
import defpackage.avbb;
import defpackage.avbc;
import defpackage.avbd;
import defpackage.avcd;
import defpackage.avce;
import defpackage.avcg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class Status {
    public static final Status OK;
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final avbb n;
    public static final avbb o;
    private static final avbd q;
    public final Throwable p;
    private final Code r;
    private final String s;

    /* JADX INFO: compiled from: PG */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        public final Status a() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        OK = Code.OK.a();
        b = Code.CANCELLED.a();
        c = Code.UNKNOWN.a();
        d = Code.INVALID_ARGUMENT.a();
        e = Code.DEADLINE_EXCEEDED.a();
        f = Code.NOT_FOUND.a();
        Code.ALREADY_EXISTS.a();
        Code.PERMISSION_DENIED.a();
        g = Code.UNAUTHENTICATED.a();
        h = Code.RESOURCE_EXHAUSTED.a();
        i = Code.FAILED_PRECONDITION.a();
        j = Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        k = Code.UNIMPLEMENTED.a();
        l = Code.INTERNAL.a();
        m = Code.UNAVAILABLE.a();
        Code.DATA_LOSS.a();
        avcd avcdVar = new avcd();
        int i2 = avbb.c;
        n = new avbc("grpc-status", false, avcdVar);
        avce avceVar = new avce();
        q = avceVar;
        o = new avbc("grpc-message", false, avceVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.r = code;
        this.s = str;
        this.p = th;
    }

    public static Status b(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).getStatus();
            }
            if (cause instanceof avcg) {
                return ((avcg) cause).a;
            }
        }
        return c.c(th);
    }

    public static String d(Status status) {
        String str = status.s;
        if (str == null) {
            return status.r.toString();
        }
        return status.r.toString() + ": " + str;
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return c.withDescription(a.bR(i2, "Unknown code "));
    }

    public final Status a(String str) {
        String str2 = this.s;
        Code code = this.r;
        return str2 == null ? new Status(code, str, this.p) : new Status(code, a.cl(str, (byte) 10, str2), this.p);
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final Status c(Throwable th) {
        return !Objects.equals(this.p, th) ? new Status(this.r, this.s, th) : this;
    }

    public final boolean e() {
        return Code.OK == this.r;
    }

    public Code getCode() {
        return this.r;
    }

    public String getDescription() {
        return this.s;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("code", this.r.name());
        ageuVarAc.b("description", this.s);
        Throwable th = this.p;
        Object objA = th;
        if (th != null) {
            objA = agfv.a(th);
        }
        ageuVarAc.b("cause", objA);
        return ageuVarAc.toString();
    }

    public Status withDescription(String str) {
        return !Objects.equals(this.s, str) ? new Status(this.r, str, this.p) : this;
    }
}
