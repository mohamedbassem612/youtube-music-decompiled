package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aleh extends aihn implements aiis {
    public static final aleh a;
    private int b;
    private askp c;
    private askp d;
    private CommandOuterClass$Command e;
    private apji f;
    private byte g = 2;

    static {
        aleh alehVar = new aleh();
        a = alehVar;
        aihn.registerDefaultInstance(aleh.class, alehVar);
    }

    private aleh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aleh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aleh.class);
            default:
                return null;
        }
    }
}
