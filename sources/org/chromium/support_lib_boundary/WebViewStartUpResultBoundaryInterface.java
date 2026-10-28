package org.chromium.support_lib_boundary;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List getAsyncStartUpLocations();

    List getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
