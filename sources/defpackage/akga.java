package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class akga extends aihn implements aiis {
    public static final akga a;
    private int b;
    private askp c;
    private askp d;
    private CommandOuterClass$Command e;
    private byte f = 2;

    static {
        akga akgaVar = new akga();
        a = akgaVar;
        aihn.registerDefaultInstance(akga.class, akgaVar);
    }

    private akga() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0005", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new akga();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akga.class);
            default:
                return null;
        }
    }
}
