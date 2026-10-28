package defpackage;

import android.content.res.Configuration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vup implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vup(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                return ((vut) obj).b;
            case 1:
                return ((vuz) obj).s();
            case 2:
                return vus.a((vun) obj, null);
            case 3:
                return Integer.valueOf(true != ((Boolean) obj).booleanValue() ? 1 : 2);
            case 4:
                return Boolean.valueOf(((agev) obj).g());
            case 5:
                return (vuz) ((agev) obj).c();
            case 6:
                return (vob) ((agev) obj).c();
            case 7:
                Configuration configuration = (Configuration) obj;
                return Boolean.valueOf(configuration.screenWidthDp > configuration.screenHeightDp);
            case 8:
                return Boolean.valueOf(((vob) obj).D());
            case 9:
                return ((vob) ((agev) obj).c()).r();
            case 10:
                return Boolean.valueOf(((Configuration) obj).orientation == 2);
            case 11:
                return ((vob) ((agev) obj).c()).j() == 3 ? vux.b : vux.a;
            case 12:
                return (vob) ((agev) obj).c();
            case 13:
                return ((vob) obj).t();
            case 14:
                return Boolean.valueOf(((akub) obj) == akub.LANDSCAPE_PANEL_OPEN_STYLE_HORIZONTAL);
            case 15:
                return ajvu.a;
            case 16:
                return ajbd.a;
            case 17:
                akjw akjwVar = ((alik) obj).x;
                if (akjwVar == null) {
                    akjwVar = akjw.a;
                }
                return Boolean.valueOf(akjwVar.c);
            case 18:
                akjw akjwVar2 = ((alik) obj).x;
                if (akjwVar2 == null) {
                    akjwVar2 = akjw.a;
                }
                return akjwVar2.b;
            case 19:
                return agev.h(((weo) obj).c);
            default:
                weh wehVar = (weh) obj;
                wehVar.getClass();
                return new agfa(wehVar);
        }
    }
}
