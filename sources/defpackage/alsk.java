package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsk extends aihn implements aiis {
    public static final alsk a;
    private int b;
    private amqm c;
    private angn d;
    private byte e = 2;

    static {
        alsk alskVar = new alsk();
        a = alskVar;
        aihn.registerDefaultInstance(alsk.class, alskVar);
    }

    private alsk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\ue592᯦\ue55b㟮\u0002\u0000\u0000\u0002\ue592᯦ᐉ\u0001\ue55b㟮ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new alsk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsk.class);
            default:
                return null;
        }
    }
}
