package androidx.car.app.model;

import defpackage.aad;
import defpackage.abx;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Pane {
    private final List mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List mRows;

    Pane(abx abxVar) {
        Object obj = abxVar.c;
        this.mRows = aad.b(null);
        List list = abxVar.a;
        this.mActionList = aad.b(null);
        Object obj2 = abxVar.d;
        this.mImage = null;
        boolean z = abxVar.b;
        this.mIsLoading = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pane) {
            Pane pane = (Pane) obj;
            if (this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage)) {
                return true;
            }
        }
        return false;
    }

    public List getActions() {
        return aad.a(this.mActionList);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public List getRows() {
        return aad.a(this.mRows);
    }

    public int hashCode() {
        return Objects.hash(this.mRows, this.mActionList, Boolean.valueOf(this.mIsLoading), this.mImage);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ rows: ");
        List list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append(']');
        return sb.toString();
    }

    private Pane() {
        this.mRows = Collections.EMPTY_LIST;
        this.mActionList = Collections.EMPTY_LIST;
        this.mIsLoading = false;
        this.mImage = null;
    }
}
