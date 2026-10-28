package androidx.car.app.dialer;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import defpackage.aad;
import defpackage.acz;
import defpackage.yf;
import defpackage.yh;
import defpackage.yi;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class InCallTemplate implements acz {
    private static final int MAX_TEXTS_SIZE = 2;
    private final List mActions;
    private final Header mHeader;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final List mTexts;
    private final CarText mTitle;

    private InCallTemplate(yh yhVar) {
        Header header = yhVar.c;
        this.mHeader = null;
        CarIcon carIcon = yhVar.d;
        this.mIcon = null;
        CarText carText = yhVar.e;
        this.mTitle = null;
        List list = yhVar.a;
        this.mTexts = null;
        List list2 = yhVar.b;
        this.mActions = aad.b(null);
        boolean z = yhVar.f;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InCallTemplate) {
            InCallTemplate inCallTemplate = (InCallTemplate) obj;
            if (Objects.equals(this.mHeader, inCallTemplate.mHeader) && Objects.equals(this.mIcon, inCallTemplate.mIcon) && Objects.equals(this.mTitle, inCallTemplate.mTitle) && Objects.equals(this.mTexts, inCallTemplate.mTexts) && Objects.equals(this.mActions, inCallTemplate.mActions) && this.mIsLoading == inCallTemplate.mIsLoading) {
                return true;
            }
        }
        return false;
    }

    public List getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public List getTexts() {
        return this.mTexts;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mIcon, this.mTitle, this.mTexts, this.mActions, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "InCallTemplate";
    }

    private InCallTemplate() {
        this.mHeader = null;
        this.mIcon = null;
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mIsLoading = false;
    }

    /* synthetic */ InCallTemplate(yh yhVar, yi yiVar) {
        this(yhVar);
    }
}
