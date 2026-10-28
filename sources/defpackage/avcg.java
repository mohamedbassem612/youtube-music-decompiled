package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avcg extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;

    public avcg(Status status) {
        super(Status.d(status), status.p);
        this.a = status;
    }
}
