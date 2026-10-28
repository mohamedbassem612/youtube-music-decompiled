package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import defpackage.aad;
import defpackage.acz;
import defpackage.adm;
import defpackage.adn;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SignInTemplate implements acz {
    private final List mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final adn mSignInMethod;
    private final CarText mTitle;

    SignInTemplate(adm admVar) {
        boolean z = admVar.a;
        this.mIsLoading = false;
        Action action = admVar.c;
        this.mHeaderAction = null;
        CarText carText = admVar.d;
        this.mTitle = null;
        CarText carText2 = admVar.e;
        this.mInstructions = null;
        CarText carText3 = admVar.f;
        this.mAdditionalText = null;
        ActionStrip actionStrip = admVar.g;
        this.mActionStrip = null;
        List list = admVar.h;
        this.mActionList = aad.b(null);
        adn adnVar = admVar.b;
        this.mSignInMethod = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignInTemplate) {
            SignInTemplate signInTemplate = (SignInTemplate) obj;
            if (this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod)) {
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

    public CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getInstructions() {
        return this.mInstructions;
    }

    public adn getSignInMethod() {
        adn adnVar = this.mSignInMethod;
        adnVar.getClass();
        return adnVar;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SignInTemplate";
    }

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }
}
