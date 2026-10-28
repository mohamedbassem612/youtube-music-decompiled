package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* JADX INFO: compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_SHARED_ARRAY_BUFFER = 2;
        public static final int TYPE_STRING = 0;
    }

    byte[] getAsArrayBuffer();

    InvocationHandler getAsSharedArrayBuffer();

    String getAsString();

    int getType();
}
