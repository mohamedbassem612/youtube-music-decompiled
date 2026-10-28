package com.google.android.apps.youtube.proto;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aiow;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FormatInitializationMetadataOuterClass$FormatInitializationMetadata extends aihn implements aiis {
    public static final FormatInitializationMetadataOuterClass$FormatInitializationMetadata a;
    public int b;
    public FormatIdOuterClass$FormatId d;
    public long e;
    public aiow g;
    public aiow h;
    public long i;
    public int j;
    private byte k = 2;
    public String c = "";
    public String f = "";

    static {
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata = new FormatInitializationMetadataOuterClass$FormatInitializationMetadata();
        a = formatInitializationMetadataOuterClass$FormatInitializationMetadata;
        aihn.registerDefaultInstance(FormatInitializationMetadataOuterClass$FormatInitializationMetadata.class, formatInitializationMetadataOuterClass$FormatInitializationMetadata);
    }

    private FormatInitializationMetadataOuterClass$FormatInitializationMetadata() {
    }

    public static FormatInitializationMetadataOuterClass$FormatInitializationMetadata getDefaultInstance() {
        return a;
    }

    public static FormatInitializationMetadataOuterClass$FormatInitializationMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (FormatInitializationMetadataOuterClass$FormatInitializationMetadata) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\tဂ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new FormatInitializationMetadataOuterClass$FormatInitializationMetadata();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(FormatInitializationMetadataOuterClass$FormatInitializationMetadata.class);
            default:
                return null;
        }
    }
}
