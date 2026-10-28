package androidx.car.app.model;

import defpackage.aad;
import defpackage.abi;
import defpackage.acz;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class LongMessageTemplate implements acz {
    private final List mActionList;
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final CarText mMessage;
    private final CarText mTitle;

    LongMessageTemplate(abi abiVar) {
        Object obj = abiVar.a;
        this.mTitle = null;
        Object obj2 = abiVar.b;
        this.mMessage = null;
        Object obj3 = abiVar.c;
        this.mActionStrip = null;
        Object obj4 = abiVar.d;
        this.mHeaderAction = null;
        Object obj5 = abiVar.e;
        this.mActionList = aad.b(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LongMessageTemplate) {
            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
            if (Objects.equals(this.mTitle, longMessageTemplate.mTitle) && Objects.equals(this.mMessage, longMessageTemplate.mMessage) && Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && Objects.equals(this.mActionList, longMessageTemplate.mActionList) && Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip)) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List getActions() {
        return aad.a(this.mActionList);
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        carText.getClass();
        return carText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mMessage, this.mHeaderAction, this.mActionList, this.mActionStrip);
    }

    public String toString() {
        return "LongMessageTemplate";
    }

    private LongMessageTemplate() {
        this.mTitle = null;
        this.mMessage = null;
        this.mActionStrip = null;
        this.mHeaderAction = null;
        this.mActionList = Collections.EMPTY_LIST;
    }
}
