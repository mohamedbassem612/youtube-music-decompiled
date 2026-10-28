package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jeo implements adlz {
    private final /* synthetic */ int $cid;
    private final Object a;

    public jeo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public static Optional b(adly adlyVar) {
        Object objC = adlyVar.c("hiddenItemsList");
        return objC instanceof tbk ? Optional.of((tbk) objC) : Optional.empty();
    }

    public static ixn c(adly adlyVar) {
        Object objC = adlyVar.c("shelfDivider");
        if (objC instanceof ixn) {
            return (ixn) objC;
        }
        return null;
    }

    public static jal d(adly adlyVar) {
        Object objC = adlyVar.c("layoutManagerStateContainer");
        if (objC instanceof jal) {
            return (jal) objC;
        }
        return null;
    }

    public static void e(adly adlyVar, View view) {
        ailj ailjVarG = g(adlyVar);
        if (ailjVarG != null) {
            jle.b(ailjVarG, view);
        }
    }

    public static boolean f(adly adlyVar) {
        return g(adlyVar) != null;
    }

    private static ailj g(adly adlyVar) {
        Object objC = adlyVar.c("margin_override");
        if (objC instanceof ailj) {
            return (ailj) objC;
        }
        return null;
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        switch (this.$cid) {
            case 0:
                adlyVar.f("hiddenItemsList", this.a);
                break;
            case 1:
                adlyVar.f("shelfDivider", this.a);
                break;
            case 2:
                adlyVar.f("layoutManagerStateContainer", this.a);
                break;
            case 3:
                adlyVar.f("margin_override", this.a);
                break;
            case 4:
                adlyVar.f("logClientVe", Boolean.TRUE);
                adlyVar.f("parentTrackingParams", this.a);
                break;
            case 5:
                adlyVar.f("sharedToggleMenuItemMutations", this.a);
                break;
            case 6:
                adlyVar.f("commentGhostCardAnimController", this.a);
                break;
            case 7:
                adlyVar.f("commentThreadMutator", this.a);
                break;
            default:
                adlyVar.f("horizontalShelfColumnCountSupplier", this.a);
                break;
        }
    }
}
