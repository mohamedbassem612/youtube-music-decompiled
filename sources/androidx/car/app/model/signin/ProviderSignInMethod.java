package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import defpackage.abn;
import defpackage.adn;
import defpackage.yf;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ProviderSignInMethod implements adn {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        action.getClass();
        if (action.getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        abn onClickDelegate = action.getOnClickDelegate();
        onClickDelegate.getClass();
        if (!onClickDelegate.isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        Action action = this.mAction;
        action.getClass();
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + ']';
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
