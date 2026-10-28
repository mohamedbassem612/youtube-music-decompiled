package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alcy extends aihn implements aiis {
    public static final alcy a;
    public CommandOuterClass$Command b;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    private int e;
    private byte f = 2;

    static {
        alcy alcyVar = new alcy();
        a = alcyVar;
        aihn.registerDefaultInstance(alcy.class, alcyVar);
    }

    private alcy() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new alcy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcy.class);
            default:
                return null;
        }
    }
}
