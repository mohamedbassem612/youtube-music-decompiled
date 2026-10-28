package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asll extends aihn implements aiis {
    public static final asll a;
    public static final aihl b;
    public int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private asli g;
    private byte h = 2;

    static {
        asll asllVar = new asll();
        a = asllVar;
        aihn.registerDefaultInstance(asll.class, asllVar);
        b = aihn.newSingularGeneratedExtension(asow.a, asllVar, asllVar, null, 158796298, aika.MESSAGE, asll.class);
    }

    private asll() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u000b\u0012\u0004\u0000\u0000\u0004\u000bᐉ\t\u000eᐉ\u000b\u000fᐉ\f\u0012ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new asll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asll.class);
            default:
                return null;
        }
    }
}
