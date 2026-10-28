package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aipo extends aihn implements aiis {
    public static final aipo a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private askp f;
    private askp g;
    private askp h;
    private CommandOuterClass$Command i;
    private CommandOuterClass$Command j;
    private askp k;
    private apji l;
    private apji m;
    private CommandOuterClass$Command n;
    private byte o = 2;

    static {
        aipo aipoVar = new aipo();
        a = aipoVar;
        aihn.registerDefaultInstance(aipo.class, aipoVar);
    }

    private aipo() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u001d\f\u0000\u0000\f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\u000bᐉ\n\u000eᐉ\u000e\u000fᐉ\u000f\u0013ᐉ\u0012\u0014ᐉ\u0013\u0015ᐉ\u0014\u0018ᐉ\u0018\u001dᐉ\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new aipo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipo.class);
            default:
                return null;
        }
    }
}
