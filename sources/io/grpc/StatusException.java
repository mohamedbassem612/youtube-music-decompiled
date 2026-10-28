package io.grpc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    private final Status a;

    public StatusException(Status status) {
        super(Status.d(status), status.p);
        this.a = status;
    }

    public final Status getStatus() {
        return this.a;
    }
}
