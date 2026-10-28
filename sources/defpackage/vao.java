package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vao {
    private static final String b;
    private static final String c;
    private static final Set d;
    public final aaok a;
    private final awmi e;

    static {
        String strC = xsc.C("editor_asset_item_selected_entity");
        strC.getClass();
        b = strC;
        String strC2 = xsc.C("editor_filter_item_selected_entity");
        strC2.getClass();
        c = strC2;
        d = atqq.aS(new String[]{"editor_asset_item_selected_entity", "editor_filter_item_selected_entity", strC, strC2});
    }

    public vao(aaok aaokVar) {
        aaokVar.getClass();
        this.a = aaokVar;
        this.e = new awmp(new pbm(this, 10));
    }

    public final boolean a(agkz agkzVar) {
        if (agkzVar == null || agkzVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = agkzVar.iterator();
        while (it.hasNext()) {
            if (((uxc) it.next()).f) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(agkz agkzVar, vbd vbdVar) {
        int iOrdinal = vbdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return agkzVar != null && agkzVar.contains(uxc.GET_ASSET_FILTER_PICKER_EDITOR);
            }
            if (iOrdinal != 2) {
                return false;
            }
        }
        return a(agkzVar);
    }

    public final boolean c() {
        return ((Boolean) this.e.a()).booleanValue();
    }

    public final boolean d(vbd vbdVar) {
        return vbdVar == vbd.b && c();
    }

    public final boolean e(ufs ufsVar) {
        ufsVar.getClass();
        if (!c()) {
            return false;
        }
        switch (ufsVar) {
            case CREATION_FLOW_UNKNOWN:
            case CREATION_FLOW_IMMERSIVE_LIVE:
            case CREATION_FLOW_PRODUCT_STICKER:
            case CREATION_FLOW_COMMON:
            case CREATION_FLOW_RECOMPOSITION:
            case UNRECOGNIZED:
                return false;
            case CREATION_FLOW_SHORTS:
            case CREATION_FLOW_IMAGE_POSTS:
            case CREATION_FLOW_VIDEO_THUMBNAIL:
            case CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL:
                return true;
            default:
                throw new awmj();
        }
    }

    public final boolean f(String... strArr) {
        for (String str : strArr) {
            if (atqq.ay(d, str)) {
                return this.a.M();
            }
        }
        return this.a.L();
    }
}
