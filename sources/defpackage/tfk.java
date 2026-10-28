package defpackage;

import android.content.res.Configuration;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tfk implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tfk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        switch (this.$cid) {
            case 0:
                return Boolean.valueOf(((tfl) obj).a);
            case 1:
                return Integer.valueOf(((tfl) obj).e);
            case 2:
                return ((omj) obj).T();
            case 3:
                return Boolean.valueOf(tth.k((ttg) obj));
            case 4:
                return Boolean.valueOf(twm.w((Configuration) obj));
            case 5:
                return Boolean.valueOf(((Configuration) obj).orientation == 2);
            case 6:
                return (vob) ((agev) obj).c();
            case 7:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return Optional.empty();
                }
                weh wehVar = ((weo) optional.get()).c;
                if (wehVar instanceof ajwk) {
                    ajwk ajwkVar = (ajwk) wehVar;
                    if (ajwkVar.g()) {
                        return Optional.of(ajwkVar.getCommand());
                    }
                } else if (wehVar instanceof weu) {
                    try {
                        ajwl ajwlVar = (ajwl) aihn.parseFrom(ajwl.a, ((weu) wehVar).a, ExtensionRegistryLite.getGeneratedRegistry());
                        if ((ajwlVar.b & 2) != 0) {
                            ajwo ajwoVar = ajwlVar.d;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            return Optional.of(ajwoVar);
                        }
                    } catch (aiik unused) {
                        return Optional.empty();
                    }
                }
                return Optional.empty();
            case 8:
                return (vob) ((agev) obj).c();
            case 9:
                return (aktz) ((agev) obj).a(new qmd(5)).e(aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return new agfa(bool);
            case 11:
                return Boolean.valueOf(((agev) obj).g());
            case 12:
                return ((vuz) obj).q();
            case 13:
                return ((vuz) obj).u();
            case 14:
                return ((vuz) obj).t();
            case 15:
                return (avlh) obj;
            case 16:
                return new vtl(0, ((Integer) obj).intValue());
            case 17:
                return (avlh) obj;
            case 18:
                return agev.i((Integer) obj);
            case 19:
                return (vob) ((agev) obj).c();
            default:
                return (vus) ((agev) obj).c();
        }
    }
}
