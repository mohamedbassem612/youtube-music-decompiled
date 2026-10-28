package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aspx extends aihn implements aiis {
    public static final aspx a;
    public boolean b;
    private int c;
    private askp d;
    private aspz e;
    private askp f;
    private CommandOuterClass$Command g;
    private ajnc h;
    private asqa i;
    private apji j;
    private askp k;
    private apji l;
    private apji m;
    private byte n = 2;

    static {
        aspx aspxVar = new aspx();
        a = aspxVar;
        aihn.registerDefaultInstance(aspx.class, aspxVar);
    }

    private aspx() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\t#\u000b\u0000\u0000\n\tဇ\f\u000eᐉ\u0006\u0010ᐉ\u0004\u0012ᐉ\u0001\u0013ᐉ\u0011\u0019ᐉ\u0012\u001dᐉ\u0014\u001eᐉ\u0015!ᐉ\u0018\"ᐉ\u0019#ᐉ\n", new Object[]{"c", "b", "f", "e", "d", "h", "i", "j", "k", "l", "m", "g"});
            case 3:
                return new aspx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aspx.class);
            default:
                return null;
        }
    }
}
