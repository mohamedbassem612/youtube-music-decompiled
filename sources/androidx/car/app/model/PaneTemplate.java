package androidx.car.app.model;

import defpackage.aax;
import defpackage.aby;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class PaneTemplate implements acz {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Banner mBanner;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    PaneTemplate(aby abyVar) {
        CarText carText = abyVar.a;
        this.mTitle = null;
        Pane pane = abyVar.b;
        this.mPane = null;
        Action action = abyVar.c;
        this.mHeaderAction = null;
        ActionStrip actionStrip = abyVar.d;
        this.mActionStrip = null;
        Header header = abyVar.e;
        this.mHeader = null;
        Banner banner = abyVar.f;
        this.mBanner = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaneTemplate) {
            PaneTemplate paneTemplate = (PaneTemplate) obj;
            if (Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader) && Objects.equals(this.mBanner, paneTemplate.mBanner)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        aax aaxVar = new aax();
        CarText carText = this.mTitle;
        if (carText != null) {
            aaxVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            aaxVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                aaxVar.b((Action) it.next());
            }
        }
        return aaxVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        pane.getClass();
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader, this.mBanner);
    }

    public String toString() {
        return "PaneTemplate";
    }

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
        this.mBanner = null;
    }
}
