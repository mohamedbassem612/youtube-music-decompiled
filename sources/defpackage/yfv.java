package defpackage;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfv extends aihn implements aiis {
    public static final yfv a;
    public int b;
    public int c;
    public long e;
    public FormatInitializationMetadataOuterClass$FormatInitializationMetadata h;
    private byte i = 2;
    public String d = "";
    public aiie f = emptyProtobufList();
    public String g = "";

    static {
        yfv yfvVar = new yfv();
        a = yfvVar;
        aihn.registerDefaultInstance(yfv.class, yfvVar);
    }

    private yfv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0005\u001b\u0006ဈ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", yez.class, "g", "h"});
            case 3:
                return new yfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(yfv.class);
            default:
                return null;
        }
    }
}
