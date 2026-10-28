package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asoa extends aihn implements aiis {
    public static final asoa a;
    public static final aihl b;
    public int c;
    public CommandOuterClass$Command e;
    private byte f = 2;
    public String d = "";

    static {
        asoa asoaVar = new asoa();
        a = asoaVar;
        aihn.registerDefaultInstance(asoa.class, asoaVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asoaVar, asoaVar, null, 325347951, aika.MESSAGE, asoa.class);
    }

    private asoa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new asoa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asoa.class);
            default:
                return null;
        }
    }
}
