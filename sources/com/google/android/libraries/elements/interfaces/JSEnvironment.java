package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.youtube.client.mobile.executor.JsExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSEnvironment {
    public abstract JSModuleBytesProvider getBytesProvider();

    public abstract JSController getController();

    public abstract JsExecutor getExecutor();

    public abstract JSModuleCache getModuleCache();

    public abstract ControllerModuleLoader getModuleLoader();

    public abstract void prewarmEnvironment();
}
