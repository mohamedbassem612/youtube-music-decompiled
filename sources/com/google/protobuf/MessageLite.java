package com.google.protobuf;

import defpackage.aigj;
import defpackage.aigs;
import defpackage.aiir;
import defpackage.aiis;
import defpackage.aiix;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface MessageLite extends aiis {
    aiix getParserForType();

    int getSerializedSize();

    aiir newBuilderForType();

    aiir toBuilder();

    byte[] toByteArray();

    aigj toByteString();

    void writeTo(aigs aigsVar);

    void writeTo(OutputStream outputStream);
}
