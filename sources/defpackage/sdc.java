package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sdc {
    private static final agkz a = agkz.r(aixo.SLOT_TYPE_MINI_APP_IN_PLAYER, aixo.SLOT_TYPE_IN_PLAYER_ORGANIC_OVERLAY, aixo.SLOT_TYPE_SEQUENCE_ITEM_AD_SELECTION);

    public static void a(aiuc aiucVar, skn sknVar) {
        sknVar.l(aiucVar.c);
        aixg aixgVarA = aixg.a(aiucVar.d);
        if (aixgVarA == null) {
            aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
        }
        sknVar.a = aixgVarA;
        aiua aiuaVar = aiucVar.e;
        if (aiuaVar == null) {
            aiuaVar = aiua.a;
        }
        sknVar.b(aiuaVar);
    }

    public static boolean b(aivt aivtVar) {
        agkz agkzVar = a;
        aivs aivsVar = aivtVar.c;
        if (aivsVar == null) {
            aivsVar = aivs.a;
        }
        aixo aixoVarA = aixo.a(aivsVar.d);
        if (aixoVarA == null) {
            aixoVarA = aixo.SLOT_TYPE_UNSPECIFIED;
        }
        if (agkzVar.contains(aixoVarA)) {
            return true;
        }
        return aivtVar.i;
    }
}
