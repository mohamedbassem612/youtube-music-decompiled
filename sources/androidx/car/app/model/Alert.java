package androidx.car.app.model;

import defpackage.aad;
import defpackage.yf;
import defpackage.zt;
import defpackage.zv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final List mActions;
    private final zv mCallbackDelegate;
    private final long mDuration;
    private final CarIcon mIcon;
    private final int mId;
    private final CarText mSubtitle;
    private final CarText mTitle;

    Alert(zt ztVar) {
        int i = ztVar.a;
        this.mId = 0;
        CarText carText = ztVar.b;
        this.mTitle = null;
        CarText carText2 = ztVar.c;
        this.mSubtitle = null;
        CarIcon carIcon = ztVar.d;
        this.mIcon = null;
        List list = ztVar.e;
        this.mActions = aad.b(null);
        long j = ztVar.f;
        this.mDuration = 0L;
        zv zvVar = ztVar.g;
        this.mCallbackDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
        }
        return true;
    }

    public List getActions() {
        return this.mActions;
    }

    public zv getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + ']';
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}
