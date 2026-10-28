package com.google.android.apps.youtube.proto;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.jqw;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ClientAbrStateOuterClass$LicenseConstraint extends aihn implements aiis {
    public static final ClientAbrStateOuterClass$LicenseConstraint a;
    public aiie b = emptyProtobufList();

    static {
        ClientAbrStateOuterClass$LicenseConstraint clientAbrStateOuterClass$LicenseConstraint = new ClientAbrStateOuterClass$LicenseConstraint();
        a = clientAbrStateOuterClass$LicenseConstraint;
        aihn.registerDefaultInstance(ClientAbrStateOuterClass$LicenseConstraint.class, clientAbrStateOuterClass$LicenseConstraint);
    }

    private ClientAbrStateOuterClass$LicenseConstraint() {
        aigj aigjVar = aigj.d;
    }

    public static ClientAbrStateOuterClass$LicenseConstraint getDefaultInstance() {
        return a;
    }

    public static ClientAbrStateOuterClass$LicenseConstraint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientAbrStateOuterClass$LicenseConstraint) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", jqw.class});
        }
        if (iOrdinal == 3) {
            return new ClientAbrStateOuterClass$LicenseConstraint();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ClientAbrStateOuterClass$LicenseConstraint.class);
    }
}
