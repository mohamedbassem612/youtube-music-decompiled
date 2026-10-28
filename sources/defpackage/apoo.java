package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apoo extends aihn implements aiis {
    public static final apoo a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apoo apooVar = new apoo();
        a = apooVar;
        aihn.registerDefaultInstance(apoo.class, apooVar);
    }

    private apoo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001 \u0001\u0000Ӱ\uef29콒 \u0000\u0000 Ӱм\u0000Ջм\u0000ݫм\u0000णм\u0000遡м\u0000\ue9db⫩м\u0000履⭎м\u0000\uf649㊈м\u0000\uf73e㍽м\u0000ﬧ㠑м\u0000\uf707㥚м\u0000\ue162㥴м\u0000\ue4a3㱾м\u0000\uf225㵔м\u0000\ue8b0㻿м\u0000\uea01䆵м\u0000\ue0a6䎫м\u0000\uf492䤳м\u0000\ue539丘м\u0000\ue275凔м\u0000\ueb7a怋м\u0000\uf152拄м\u0000\uecd7斿м\u0000\ue989柫м\u0000ﵬ橈м\u0000\uf662欣м\u0000﹐稬м\u0000\uf696竅м\u0000\ue3a4篸м\u0000\uf509졓м\u0000\uf572챵м\u0000\uef29콒м\u0000", new Object[]{"c", "b", ajsw.class, amos.class, apnp.class, anjl.class, ajal.class, ajrj.class, ajta.class, ajzb.class, akxy.class, ajan.class, aplk.class, aqyj.class, aonb.class, aiwr.class, apnb.class, apus.class, ajmz.class, akrn.class, aqkr.class, akvv.class, aojz.class, aqau.class, akyi.class, anwz.class, alec.class, aqub.class, aoal.class, alha.class, anrs.class, akyv.class, amhx.class, apns.class});
            case 3:
                return new apoo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apoo.class);
            default:
                return null;
        }
    }
}
