package com.google.protos.youtube.elements;

import defpackage.aihf;
import defpackage.aihl;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aika;
import defpackage.asod;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class DirectUpdatePropertiesOuterClass$DirectUpdateProperties extends aihn implements aiis {
    public static final DirectUpdatePropertiesOuterClass$DirectUpdateProperties a;
    public static final aihl b;
    private byte c = 2;

    static {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
        a = directUpdatePropertiesOuterClass$DirectUpdateProperties;
        aihn.registerDefaultInstance(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        b = aihn.newSingularGeneratedExtension(asod.a, directUpdatePropertiesOuterClass$DirectUpdateProperties, directUpdatePropertiesOuterClass$DirectUpdateProperties, null, 402418170, aika.MESSAGE, DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class);
    }

    private DirectUpdatePropertiesOuterClass$DirectUpdateProperties() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new DirectUpdatePropertiesOuterClass$DirectUpdateProperties();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class);
            default:
                return null;
        }
    }
}
