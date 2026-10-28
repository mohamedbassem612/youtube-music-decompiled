package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSControllerLifecycleDispatcher {
    public abstract void dispatchEagerInit(JSControllerInitializer jSControllerInitializer);

    public abstract void dispatchNotifyModelUpdate(JSControllerModelUpdateNotifier jSControllerModelUpdateNotifier);
}
