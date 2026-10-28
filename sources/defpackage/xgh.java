package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/interaction/DefaultStatelessInteractionLogger");

    public static ajwo a(xgt xgtVar, ajwo ajwoVar) {
        aihf builder;
        if (ajwoVar == null) {
            return null;
        }
        if (xgtVar == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/logging/interaction/DefaultStatelessInteractionLogger", "setNavigationEndpointParentScreen", 35, "DefaultStatelessInteractionLogger.java")).t("Failed to set parent screen");
            return ajwoVar;
        }
        aihl aihlVar = aoaq.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            builder = ((aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
        } else {
            builder = aoar.a.createBuilder();
        }
        if (((aoar) builder.instance).c.isEmpty()) {
            String str = xgtVar.a;
            builder.copyOnWrite();
            aoar aoarVar = (aoar) builder.instance;
            str.getClass();
            aoarVar.b |= 1;
            aoarVar.c = str;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihhVar.e(aihlVar, (aoar) builder.build());
        return (ajwo) aihhVar.build();
    }
}
