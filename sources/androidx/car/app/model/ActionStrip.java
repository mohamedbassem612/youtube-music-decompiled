package androidx.car.app.model;

import defpackage.aad;
import defpackage.yf;
import defpackage.zs;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ActionStrip {
    private final List mActions;

    ActionStrip(zs zsVar) {
        Object obj = zsVar.a;
        this.mActions = aad.b(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List getActions() {
        return aad.a(this.mActions);
    }

    public Action getFirstActionOfType(int i) {
        for (Object obj : this.mActions) {
            if (obj instanceof Action) {
                Action action = (Action) obj;
                if (action.getType() == i) {
                    return action;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + ']';
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
