package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asnz extends aihn implements aiis {
    public static final asnz a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        asnz asnzVar = new asnz();
        a = asnzVar;
        aihn.registerDefaultInstance(asnz.class, asnzVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asnzVar, asnzVar, null, 170382656, aika.MESSAGE, asnz.class);
    }

    private asnz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", CommandOuterClass$Command.class});
            case 3:
                return new asnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnz.class);
            default:
                return null;
        }
    }
}
