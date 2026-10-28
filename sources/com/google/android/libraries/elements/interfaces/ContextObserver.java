package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ContextObserver {
    public abstract Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);
}
