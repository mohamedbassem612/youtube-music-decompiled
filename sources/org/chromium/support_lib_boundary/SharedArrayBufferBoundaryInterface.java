package org.chromium.support_lib_boundary;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface SharedArrayBufferBoundaryInterface {
    long getSize();

    ByteBuffer mapAndCreateByteBuffer();
}
