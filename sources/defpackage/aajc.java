package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aajc {
    public static int a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("index_update_trigger")) {
            return 1;
        }
        return a.bc(bundle.getInt("index_update_trigger"));
    }

    public static int b(aodp aodpVar) {
        int iOrdinal = aodpVar.ordinal();
        if (iOrdinal == 1) {
            return 48;
        }
        if (iOrdinal == 2) {
            return SemanticState.Focused;
        }
        if (iOrdinal != 3) {
            return -1;
        }
        return SemanticState.Hidden;
    }

    public static String c(aodp aodpVar) {
        return Integer.toString(b(aodpVar));
    }

    public static String d(String str, String str2) {
        return String.format(Locale.US, "%s:%s:thumb", str, str2);
    }

    public static String e(String str, String str2) {
        return String.format(Locale.US, "%s:%s:master", str, str2);
    }

    public static String f(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajvq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            return ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajvq.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        ajwo ajwoVar2 = ((ajvq) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).d;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
        ajwoVar2.c(aihlVarCheckIsLite4);
        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
        return ((arij) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).d;
    }

    public static String g(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajvq.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            return ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).h;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajvq.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        ajwo ajwoVar2 = ((ajvq) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).d;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
        ajwoVar2.c(aihlVarCheckIsLite4);
        Object objK3 = ajwoVar2.j.k(aihlVarCheckIsLite4.d);
        return ((arij) (objK3 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK3))).h;
    }

    public static boolean h(ajwo ajwoVar, ajwo ajwoVar2) {
        if (ajwoVar == null || ajwoVar2 == null || !ajwoVar.c.equals(ajwoVar2.c)) {
            return false;
        }
        return f(ajwoVar).equals(f(ajwoVar2)) && g(ajwoVar).equals(g(ajwoVar2));
    }

    public static final auzk i(aosi aosiVar) {
        aosiVar.getClass();
        return new auzk(false, aosiVar);
    }

    public static boolean j(Bundle bundle, grj grjVar) {
        if (bundle == null) {
            return false;
        }
        return TextUtils.equals(bundle.getString("identity_aware_tag"), grjVar.y());
    }
}
