package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alul extends aihn implements aiis {
    public static final alul a;
    public int b;
    public alop c;
    public alay e;
    private CommandOuterClass$Command f;
    private byte g = 2;
    public aiie d = emptyProtobufList();

    static {
        alul alulVar = new alul();
        a = alulVar;
        aihn.registerDefaultInstance(alul.class, alulVar);
    }

    private alul() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0007ᐉ\u0002", new Object[]{"b", "c", "d", apji.class, "e", "f"});
            case 3:
                return new alul();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alul.class);
            default:
                return null;
        }
    }
}
