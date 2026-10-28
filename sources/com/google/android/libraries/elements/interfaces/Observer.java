package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class Observer {
    public abstract Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord);
}
