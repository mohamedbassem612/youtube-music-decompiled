package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class znf {
    public static final znf a = new znf("");
    public static final znf b;
    public static final znf c;
    public static final znf d;
    public static final znf e;
    public static final znf f;
    public static final znf g;
    public static final znf h;
    public static final znf i;
    public static final znf j;
    public static final Map k;
    public final String l;
    private final awmi m = new awmp(new pbm(this, 16));

    static {
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        agvp.R(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER, aihfVarCreateBuilder);
        znf znfVar = new znf(zls.b(agvp.Q(aihfVarCreateBuilder)));
        b = znfVar;
        znf znfVar2 = new znf("__LOCAL_CONTENT_PARENT_ROOT_ID__");
        c = znfVar2;
        znf znfVar3 = new znf("__OFFLINE_ROOT_ID__");
        d = znfVar3;
        znf znfVar4 = new znf("__OFFLINE_CHILDREN_ROOT_ID__");
        e = znfVar4;
        znf znfVar5 = new znf("__SIDELOADED_ROOT_ID__");
        f = znfVar5;
        znf znfVar6 = new znf("__SETTINGS_ROOT_ID__");
        g = znfVar6;
        znf znfVar7 = new znf("sideloaded_playlists_parent");
        h = znfVar7;
        znf znfVar8 = new znf("sideloaded_albums_parent");
        i = znfVar8;
        znf znfVar9 = new znf("sideloaded_artists_parent");
        j = znfVar9;
        k = atqq.y(new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER, znfVar), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED, znfVar3), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN, znfVar4), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT, znfVar2), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS, znfVar6), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED, znfVar5), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ALBUMS, znfVar8), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ARTISTS, znfVar9), new awml(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_PLAYLISTS, znfVar7));
    }

    public znf(String str) {
        this.l = str;
    }

    public final ajwo a() {
        anfb anfbVarC = c();
        if (anfbVarC == null) {
            return null;
        }
        if (1 != (anfbVarC.b & 1)) {
            anfbVarC = null;
        }
        if (anfbVarC == null) {
            return null;
        }
        ajwo ajwoVar = anfbVarC.e;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    public final amzw b() {
        amzw amzwVarA;
        anfb anfbVarC = c();
        if (anfbVarC == null) {
            return null;
        }
        if (anfbVarC.c != 2) {
            anfbVarC = null;
        }
        if (anfbVarC != null) {
            return (anfbVarC.c != 2 || (amzwVarA = amzw.a(((Integer) anfbVarC.d).intValue())) == null) ? amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED : amzwVarA;
        }
        return null;
    }

    public final anfb c() {
        Object obj = ((awmn) this.m.a()).a;
        if (true == (obj instanceof awmm)) {
            obj = null;
        }
        return (anfb) obj;
    }

    public final boolean d() {
        return awrc.c(this, a);
    }

    public final boolean e() {
        return g() == 3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof znf) && awrc.c(this.l, ((znf) obj).l);
        }
        return true;
    }

    public final boolean f() {
        return g() == 2;
    }

    public final int g() {
        anfb anfbVarC = c();
        if (anfbVarC != null) {
            if ((anfbVarC.b & 2) == 0) {
                anfbVarC = null;
            }
            if (anfbVarC != null) {
                int iBc = a.bc(anfbVarC.f);
                if (iBc == 0) {
                    return 1;
                }
                return iBc;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        int iG = g();
        amzw amzwVarB = b();
        StringBuilder sb = new StringBuilder("MediaId(value=");
        sb.append(this.l);
        sb.append(", containerType=");
        sb.append((Object) (iG != 0 ? Integer.toString(iG - 1) : "null"));
        sb.append(", localContainerType=");
        sb.append(amzwVarB);
        sb.append(')');
        return sb.toString();
    }
}
