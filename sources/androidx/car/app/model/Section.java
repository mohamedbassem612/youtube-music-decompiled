package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import defpackage.abt;
import defpackage.acl;
import defpackage.aer;
import defpackage.yf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public abstract class Section {
    private final aer mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final abt mOnItemVisibilityChangedDelegate;
    private final SectionHeader mSectionHeader;
    private final CarText mTitle;

    protected Section(acl aclVar) {
        List list = aclVar.d;
        this.mItemsDelegate = new ListDelegateImpl(DesugarCollections.unmodifiableList(null));
        CarText carText = aclVar.e;
        this.mTitle = null;
        SectionHeader sectionHeader = aclVar.f;
        this.mSectionHeader = null;
        CarText carText2 = aclVar.g;
        this.mNoItemsMessage = null;
        abt abtVar = aclVar.h;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mSectionHeader, section.mSectionHeader) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            return Objects.equals(Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null));
        }
        return false;
    }

    public aer getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public abt getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    protected Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
