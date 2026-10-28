package org.chromium.support_lib_boundary;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    Set getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
