package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnn {
    public static final Map a = new ConcurrentHashMap();

    static {
        h(new aboc());
        h(new abod());
        h(new abnj());
        h(new abnu());
    }

    public static int a(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        if (abnmVarC != null) {
            return abnmVarC.i(ajwoVar);
        }
        return -1;
    }

    static jrk b(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        return abnmVarC != null ? abnmVarC.j(ajwoVar) : jrk.a;
    }

    public static abnm c(ajwo ajwoVar) {
        if (ajwoVar != null) {
            for (abnm abnmVar : a.values()) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(abnmVar.c());
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    return abnmVar;
                }
            }
        }
        return null;
    }

    public static ajwo d(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        return abnmVarC != null ? abnmVarC.g(ajwoVar) : ajwoVar;
    }

    public static String e(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        return abnmVarC != null ? abnmVarC.l(ajwoVar) : "";
    }

    public static String f(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        return abnmVarC != null ? abnmVarC.j(ajwoVar).h : "";
    }

    public static String g(ajwo ajwoVar) {
        abnm abnmVarC = c(ajwoVar);
        return abnmVarC != null ? abnmVarC.m(ajwoVar) : "";
    }

    public static void h(abnm abnmVar) {
        a.put(abnmVar.c(), abnmVar);
    }

    public static boolean i(abnl abnlVar, abnl abnlVar2) {
        if (abnlVar == abnlVar2) {
            return true;
        }
        if (abnlVar != null && abnlVar2 != null) {
            ajwo ajwoVar = abnlVar.b;
            ajwo ajwoVar2 = abnlVar2.b;
            if (ajwoVar != null && ajwoVar2 != null) {
                return j(ajwoVar, ajwoVar2);
            }
            if (abnlVar.x() == null && abnlVar2.x() == null && abnlVar.J() == abnlVar2.J() && abnlVar.M() == abnlVar2.M() && TextUtils.equals(abnlVar.u(), abnlVar2.u()) && (TextUtils.equals("", abnlVar.u()) || Math.abs(abnlVar.a() - abnlVar2.a()) <= 1)) {
                return TextUtils.equals(abnlVar.w(), abnlVar2.w());
            }
        }
        return false;
    }

    public static boolean j(ajwo ajwoVar, ajwo ajwoVar2) {
        ajwo ajwoVarD = d(ajwoVar);
        ajwo ajwoVarD2 = d(ajwoVar2);
        abnm abnmVarC = c(ajwoVarD);
        if (abnmVarC != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(abnmVarC.c());
            ajwoVarD2.c(aihlVarCheckIsLite);
            if (ajwoVarD2.j.n(aihlVarCheckIsLite.d)) {
                return abnmVarC.n(ajwoVarD, ajwoVarD2);
            }
        }
        return false;
    }
}
