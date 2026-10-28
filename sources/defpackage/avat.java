package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avat {
    public static final auyn a = new auyn("internal:health-checking-config");
    public static final avah b = new avah("internal:health-check-consumer-listener", null);
    public static final avah c = new avah("internal:disable-subchannel-reconnect", Boolean.FALSE);
    public static final auyn d = new auyn("internal:has-health-check-producer-listener");
    public static final auyn e = new auyn("io.grpc.IS_PETIOLE_POLICY");

    public Status a(avap avapVar) {
        throw null;
    }

    public abstract void b(Status status);

    public abstract void c();
}
