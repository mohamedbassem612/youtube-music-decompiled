package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xme extends xmf {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/mdx/browserchannel/UnauthorizedErrorException");
    public final ydd a;

    public xme(ydd yddVar) {
        super(401);
        this.a = yddVar;
    }

    public static xme a(String str) {
        try {
            return new xme((ydd) Enum.valueOf(ydd.class, new JSONObject(str).getString("unauthorizedError")));
        } catch (Exception unused) {
            ((agrc) ((agrc) c.c().i(agso.a, "MDX.browserchannel")).k("com/google/android/libraries/youtube/mdx/browserchannel/UnauthorizedErrorException", "parseFromResponse", 34, "UnauthorizedErrorException.java")).t("failed to parse error enum, assuming bad lounge token");
            return new xme(ydd.a);
        }
    }
}
