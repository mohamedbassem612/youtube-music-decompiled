package androidx.car.app.model;

import defpackage.aad;
import defpackage.aax;
import defpackage.abj;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class MessageTemplate implements acz {
    private final List mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    MessageTemplate(abj abjVar) {
        boolean z = abjVar.a;
        this.mIsLoading = false;
        CarText carText = abjVar.b;
        this.mTitle = null;
        CarText carText2 = abjVar.c;
        this.mMessage = null;
        CarText carText3 = abjVar.d;
        this.mDebugMessage = null;
        CarIcon carIcon = abjVar.e;
        this.mIcon = null;
        Action action = abjVar.f;
        this.mHeaderAction = null;
        ActionStrip actionStrip = abjVar.g;
        this.mActionStrip = null;
        List list = abjVar.h;
        this.mActionList = aad.b(null);
        Header header = abjVar.i;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageTemplate) {
            MessageTemplate messageTemplate = (MessageTemplate) obj;
            if (this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List getActions() {
        return aad.a(this.mActionList);
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
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

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        carText.getClass();
        return carText;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
