package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class akdo extends aihn implements aiis {
    public static final akdo a;
    public static final aihl b;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    private byte f = 2;

    static {
        akdo akdoVar = new akdo();
        a = akdoVar;
        aihn.registerDefaultInstance(akdo.class, akdoVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), akdoVar, akdoVar, null, 285132689, aika.MESSAGE, akdo.class);
    }

    private akdo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new akdo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdo.class);
            default:
                return null;
        }
    }
}
