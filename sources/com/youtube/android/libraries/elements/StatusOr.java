package com.youtube.android.libraries.elements;

import defpackage.avcg;
import defpackage.vx;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class StatusOr {
    public final boolean hasValue;
    public final Status status;
    public final Object value;

    private StatusOr(Status status, Object obj, boolean z) {
        this.status = status;
        this.value = obj;
        this.hasValue = z;
    }

    public static StatusOr fromStatus(Status status) {
        if (status.e()) {
            throw new IllegalArgumentException("StatusOr with status OK must have a value. Please use fromValue(T value) instead.");
        }
        return new StatusOr(status, null, false);
    }

    public static StatusOr fromValue(Object obj) {
        return new StatusOr(Status.OK, obj, true);
    }

    public final Object a(vx vxVar) {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw ((RuntimeException) vxVar.a(new avcg(this.status)));
    }
}
