package com.google.protos.youtube.elements;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihm;
import defpackage.aihn;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class TransactionContextOuterClass$TransactionContext extends aihi implements aihj {
    public static final TransactionContextOuterClass$TransactionContext a;
    private byte b = 2;

    static {
        TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext = new TransactionContextOuterClass$TransactionContext();
        a = transactionContextOuterClass$TransactionContext;
        aihn.registerDefaultInstance(TransactionContextOuterClass$TransactionContext.class, transactionContextOuterClass$TransactionContext);
    }

    private TransactionContextOuterClass$TransactionContext() {
    }

    public static TransactionContextOuterClass$TransactionContext getDefaultInstance() {
        return a;
    }

    public static TransactionContextOuterClass$TransactionContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TransactionContextOuterClass$TransactionContext) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new TransactionContextOuterClass$TransactionContext();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(TransactionContextOuterClass$TransactionContext.class);
            default:
                return null;
        }
    }
}
