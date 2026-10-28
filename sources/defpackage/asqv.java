package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asqv extends aihn implements aiis {
    public static final asqv a;
    public static final aihl b;
    public int c;
    public float e;
    public CommandOuterClass$Command f;
    private byte g = 2;
    public String d = "";

    static {
        asqv asqvVar = new asqv();
        a = asqvVar;
        aihn.registerDefaultInstance(asqv.class, asqvVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asqvVar, asqvVar, null, 315252720, aika.MESSAGE, asqv.class);
    }

    private asqv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ခ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new asqv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqv.class);
            default:
                return null;
        }
    }
}
