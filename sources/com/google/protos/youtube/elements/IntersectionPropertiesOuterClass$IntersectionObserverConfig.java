package com.google.protos.youtube.elements;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihm;
import defpackage.aihn;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class IntersectionPropertiesOuterClass$IntersectionObserverConfig extends aihi implements aihj {
    public static final IntersectionPropertiesOuterClass$IntersectionObserverConfig a;
    private byte b = 2;

    static {
        IntersectionPropertiesOuterClass$IntersectionObserverConfig intersectionPropertiesOuterClass$IntersectionObserverConfig = new IntersectionPropertiesOuterClass$IntersectionObserverConfig();
        a = intersectionPropertiesOuterClass$IntersectionObserverConfig;
        aihn.registerDefaultInstance(IntersectionPropertiesOuterClass$IntersectionObserverConfig.class, intersectionPropertiesOuterClass$IntersectionObserverConfig);
    }

    private IntersectionPropertiesOuterClass$IntersectionObserverConfig() {
    }

    public static IntersectionPropertiesOuterClass$IntersectionObserverConfig getDefaultInstance() {
        return a;
    }

    public static IntersectionPropertiesOuterClass$IntersectionObserverConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (IntersectionPropertiesOuterClass$IntersectionObserverConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new IntersectionPropertiesOuterClass$IntersectionObserverConfig();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(IntersectionPropertiesOuterClass$IntersectionObserverConfig.class);
            default:
                return null;
        }
    }
}
