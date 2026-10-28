package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asov extends aihi implements aihj {
    public static final asov a;
    public static final aihl b;
    private byte c = 2;

    static {
        asov asovVar = new asov();
        a = asovVar;
        aihn.registerDefaultInstance(asov.class, asovVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asovVar, asovVar, null, 194114827, aika.MESSAGE, asov.class);
    }

    private asov() {
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
                return new asov();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asov.class);
            default:
                return null;
        }
    }
}
