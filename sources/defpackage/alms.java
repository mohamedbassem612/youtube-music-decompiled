package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alms extends aihn implements aiis {
    public static final alms a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aptc i;
    private byte j = 2;
    public String d = "";
    public aihv e = emptyIntList();
    public aiie f = emptyProtobufList();
    public int g = 1;
    public String h = "";

    static {
        alms almsVar = new alms();
        a = almsVar;
        aihn.registerDefaultInstance(alms.class, almsVar);
    }

    private alms() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0004\u0016\u0006᠌\u0002\u0007ဈ\u0003\t\u001b\nᐉ\u0004", new Object[]{"b", "c", "d", "e", "g", apsb.f, "h", "f", almr.class, "i"});
            case 3:
                return new alms();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alms.class);
            default:
                return null;
        }
    }
}
