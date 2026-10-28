package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfk extends aihn implements aiis {
    public static final ajfk a;
    public static final aihl b;
    public ajmm c;
    private int e;
    private byte f = 2;
    public String d = "";

    static {
        ajfk ajfkVar = new ajfk();
        a = ajfkVar;
        aihn.registerDefaultInstance(ajfk.class, ajfkVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), ajfkVar, ajfkVar, null, 303917309, aika.MESSAGE, ajfk.class);
    }

    private ajfk() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new ajfk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfk.class);
            default:
                return null;
        }
    }
}
