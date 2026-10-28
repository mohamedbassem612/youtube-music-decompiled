package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avkc {
    public static final avby b;
    public static final avby c;
    public static final avby d;
    public static final avby e;
    public final avbj a;

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    static {
        avby avbyVar;
        avbi avbiVarA = avbi.a();
        b = avbiVarA.d("grpc.subchannel.disconnections", aguu.s("grpc.target"), aguu.s("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"));
        c = avbiVarA.d("grpc.subchannel.connection_attempts_succeeded", aguu.s("grpc.target"), aguu.s("grpc.lb.backend_service", "grpc.lb.locality"));
        d = avbiVarA.d("grpc.subchannel.connection_attempts_failed", aguu.s("grpc.target"), aguu.s("grpc.lb.backend_service", "grpc.lb.locality"));
        ArrayList arrayListS = aguu.s("grpc.target");
        ArrayList arrayListS2 = aguu.s("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality");
        ahno.G(!ahno.aa("grpc.subchannel.open_connections"), "missing metric name");
        synchronized (avbiVarA.a) {
            ?? r5 = avbiVarA.c;
            if (r5.contains("grpc.subchannel.open_connections")) {
                throw new IllegalStateException(a.bT("grpc.subchannel.open_connections", "Metric with name ", " already exists"));
            }
            int i = avbiVarA.b;
            if (i + 1 == ((avby[]) avbiVarA.d).length) {
                avbiVarA.b();
            }
            avbyVar = new avby(i, "grpc.subchannel.open_connections", arrayListS, arrayListS2);
            ((avby[]) avbiVarA.d)[i] = avbyVar;
            r5.add("grpc.subchannel.open_connections");
            avbiVarA.b++;
        }
        e = avbyVar;
    }

    public avkc(avbj avbjVar) {
        this.a = avbjVar;
    }
}
