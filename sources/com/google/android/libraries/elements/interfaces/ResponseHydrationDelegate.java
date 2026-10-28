package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseHydrationDelegate {
    public abstract void onHydrationErrorWithIdentifiers(ArrayList arrayList, String str);

    public abstract void onHydrationErrorWithStatus(Status status, String str);
}
