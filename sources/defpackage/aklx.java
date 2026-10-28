package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aklx extends aihn implements aiis {
    public static final aklx a;
    public static final aihl b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        aklx aklxVar = new aklx();
        a = aklxVar;
        aihn.registerDefaultInstance(aklx.class, aklxVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aklxVar, aklxVar, null, 427304386, aika.MESSAGE, aklx.class);
    }

    private aklx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new aklx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklx.class);
            default:
                return null;
        }
    }
}
