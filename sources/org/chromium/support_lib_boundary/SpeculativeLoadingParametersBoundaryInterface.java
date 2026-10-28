package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface SpeculativeLoadingParametersBoundaryInterface {

    /* JADX INFO: renamed from: org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class CC {
        public static Integer $default$getVariationsId(SpeculativeLoadingParametersBoundaryInterface speculativeLoadingParametersBoundaryInterface) {
            return null;
        }
    }

    Map getAdditionalHeaders();

    InvocationHandler getNoVarySearchData();

    Integer getVariationsId();

    boolean isJavaScriptEnabled();
}
