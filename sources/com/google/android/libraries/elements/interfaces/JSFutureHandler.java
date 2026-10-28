package com.google.android.libraries.elements.interfaces;

import com.google.net.util.proto2api.Status$StatusProto;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSFutureHandler {
    public abstract Status onError(Status$StatusProto status$StatusProto);

    public abstract Status onSuccess();
}
