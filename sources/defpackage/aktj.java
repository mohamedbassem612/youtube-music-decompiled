package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aktj extends aihn implements aiis {
    public static final aktj a;
    public static final aihl b;
    public int c;
    public aqmh f;
    public boolean g;
    public boolean h;
    private byte i = 2;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        aktj aktjVar = new aktj();
        a = aktjVar;
        aihn.registerDefaultInstance(aktj.class, aktjVar);
        b = aihn.newSingularGeneratedExtension(alba.a, aktjVar, aktjVar, null, 152040444, aika.MESSAGE, aktj.class);
    }

    private aktj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0005ᐉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new aktj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktj.class);
            default:
                return null;
        }
    }
}
