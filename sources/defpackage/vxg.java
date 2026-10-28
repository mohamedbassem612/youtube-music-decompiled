package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxg {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/innertube/commands/CommandUtil");
    static final List a = agke.r(aoaq.b, appx.b);

    public static aigj a(ajwo ajwoVar) {
        return (ajwoVar == null || (ajwoVar.b & 1) == 0) ? aigj.d : ajwoVar.c;
    }

    public static ajwo b(byte[] bArr) {
        if (bArr != null) {
            try {
                return (ajwo) aihn.parseFrom(ajwo.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
            }
        }
        return ajwo.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(ajwo ajwoVar) {
        int iA;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aonj.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aitq.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aitq.b);
                ajwoVar.c(aihlVarCheckIsLite3);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                return objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK);
            }
        }
        agqs agqsVarListIterator = ((agke) a).listIterator(0);
        aihh aihhVar = null;
        while (agqsVarListIterator.hasNext()) {
            aigw aigwVar = (aigw) agqsVarListIterator.next();
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aigwVar);
            ajwoVar.c(aihlVarCheckIsLite4);
            if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                if (aihhVar == null) {
                    aihhVar = (aihh) ajwoVar.toBuilder();
                }
                aihhVar.d(aigwVar);
            }
        }
        ajwo ajwoVar2 = aihhVar != null ? (ajwo) aihhVar.build() : ajwoVar;
        if (!ajwoVar2.equals(ajwo.a)) {
            try {
                iA = aext.A(ajwoVar2);
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/innertube/commands/CommandUtil", "getCommandFieldNumber", 68, "CommandUtil.java")).w("%s", e);
                iA = -1;
            }
            if (iA != -1) {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ExtensionRegistryLite.getGeneratedRegistry().a(ajwo.a, iA));
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                return objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2);
            }
        }
        return null;
    }
}
