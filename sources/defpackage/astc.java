package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class astc extends aihn implements aiis {
    public static final astc a;
    public static final aihl b;
    public int c;
    public asmv d;
    public asmv e;
    public asmv g;
    private byte i = 2;
    public aiie f = emptyProtobufList();
    public String h = "";

    static {
        astc astcVar = new astc();
        a = astcVar;
        aihn.registerDefaultInstance(astc.class, astcVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), astcVar, astcVar, null, 352829283, aika.MESSAGE, astc.class);
    }

    private astc() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0003\u0007ᐉ\u0002", new Object[]{"c", "d", "e", "f", asmv.class, "h", "g"});
            case 3:
                return new astc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(astc.class);
            default:
                return null;
        }
    }
}
