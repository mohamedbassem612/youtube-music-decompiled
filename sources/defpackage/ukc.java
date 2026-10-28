package defpackage;

import android.view.View;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ukc extends ept {
    public final uwb a;
    public final ulp b;
    public final una c;
    public final awmd d;
    public final View e;
    public final ulx f;
    public final Optional g;
    public final umt h;
    public final ufs i;
    public final umi j;

    public ukc(uwb uwbVar, ulp ulpVar, una unaVar, awmd awmdVar, View view, umi umiVar, ulx ulxVar, Optional optional, umt umtVar, ufs ufsVar) {
        this.a = uwbVar;
        this.b = ulpVar;
        this.c = unaVar;
        this.d = awmdVar;
        this.e = view;
        this.j = umiVar;
        this.f = ulxVar;
        this.g = optional;
        this.h = umtVar;
        this.i = ufsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ukc)) {
            return false;
        }
        ukc ukcVar = (ukc) obj;
        return Objects.equals(this.a, ukcVar.a) && Objects.equals(this.b, ukcVar.b) && Objects.equals(this.c, ukcVar.c) && Objects.equals(this.d, ukcVar.d) && Objects.equals(this.e, ukcVar.e) && Objects.equals(this.j, ukcVar.j) && Objects.equals(this.f, ukcVar.f) && Objects.equals(this.g, ukcVar.g) && Objects.equals(this.h, ukcVar.h) && Objects.equals(this.i, ukcVar.i);
    }

    public final int hashCode() {
        return (((((((((((((((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.f)) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d, this.e, this.j, this.f, this.g, this.h, this.i};
        String[] strArrSplit = "editorToolbar;editViewModel;guidelineController;shortsTooltipControllerProvider;editorFragmentRootView;timelinePanelCallback;shortsPlayerViewConfig;bottomBarContentViewProviderOptional;filtersViewControllerConfig;creationFlow".split(";");
        StringBuilder sb = new StringBuilder("ukc[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
