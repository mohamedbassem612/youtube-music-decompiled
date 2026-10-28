package com.google.android.libraries.youtube.composition.common.types;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StatusOr {
    private final Status status;
    private final Object value;

    private StatusOr(Status status, Object obj) {
        this.status = status;
        this.value = obj;
    }

    public static StatusOr fromStatus(Status status) {
        return new StatusOr(status, null);
    }

    public static StatusOr fromValue(Object obj) {
        return new StatusOr(Status.OK, obj);
    }

    public boolean ok() {
        return this.value != null;
    }
}
