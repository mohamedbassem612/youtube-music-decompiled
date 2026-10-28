package com.google.protos.youtube.elements;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihl;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aika;
import defpackage.atqf;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class IntersectionPropertiesOuterClass$IntersectionCriteria extends aihn implements aiis {
    public static final IntersectionPropertiesOuterClass$IntersectionCriteria a;
    public static final aihl b;
    public float c;
    private int d;

    static {
        IntersectionPropertiesOuterClass$IntersectionCriteria intersectionPropertiesOuterClass$IntersectionCriteria = new IntersectionPropertiesOuterClass$IntersectionCriteria();
        a = intersectionPropertiesOuterClass$IntersectionCriteria;
        aihn.registerDefaultInstance(IntersectionPropertiesOuterClass$IntersectionCriteria.class, intersectionPropertiesOuterClass$IntersectionCriteria);
        b = aihn.newSingularGeneratedExtension(atqf.a, getDefaultInstance(), getDefaultInstance(), null, 3, aika.MESSAGE, IntersectionPropertiesOuterClass$IntersectionCriteria.class);
    }

    private IntersectionPropertiesOuterClass$IntersectionCriteria() {
    }

    public static IntersectionPropertiesOuterClass$IntersectionCriteria getDefaultInstance() {
        return a;
    }

    public static IntersectionPropertiesOuterClass$IntersectionCriteria parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (IntersectionPropertiesOuterClass$IntersectionCriteria) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new IntersectionPropertiesOuterClass$IntersectionCriteria();
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
        return aihn.getParserForClass(IntersectionPropertiesOuterClass$IntersectionCriteria.class);
    }
}
