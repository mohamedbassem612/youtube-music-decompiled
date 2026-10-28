package androidx.car.app.model;

import defpackage.aad;
import defpackage.aax;
import defpackage.yf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Header {
    private final Background mBackground;
    private final List mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarIcon mStartHeaderImage;
    private final CarText mSubtitle;
    private final CarText mTitle;

    public Header(aax aaxVar) {
        this.mTitle = aaxVar.c;
        CarText carText = aaxVar.d;
        this.mSubtitle = null;
        this.mStartHeaderAction = aaxVar.b;
        this.mEndHeaderActions = aad.b(aaxVar.a);
        Background background = aaxVar.e;
        this.mBackground = null;
        CarIcon carIcon = aaxVar.f;
        this.mStartHeaderImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Header) {
            Header header = (Header) obj;
            if (Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mSubtitle, header.mSubtitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction) && Objects.equals(this.mBackground, header.mBackground) && Objects.equals(this.mStartHeaderImage, header.mStartHeaderImage)) {
                return true;
            }
        }
        return false;
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public List getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarIcon getStartHeaderImage() {
        return this.mStartHeaderImage;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mEndHeaderActions, this.mStartHeaderAction, this.mBackground, this.mStartHeaderImage);
    }

    public String toString() {
        return "Header: " + this.mTitle + ", Subtitle: " + this.mSubtitle + ", Background: " + this.mBackground + ", StartHeaderImage: " + this.mStartHeaderImage;
    }

    private Header() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
        this.mBackground = null;
        this.mStartHeaderImage = null;
    }
}
