package androidx.car.app.model;

import defpackage.acn;
import defpackage.aco;
import defpackage.acz;
import defpackage.yf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class SectionedItemTemplate implements acz {
    public static final int ALPHABETICAL_INDEXING_DISABLED = 0;
    public static final int ALPHABETICAL_INDEXING_TITLE_AS_IS = 1;
    public static final int ALPHABETICAL_INDEXING_TITLE_IGNORE_ARTICLES_AND_SYMBOLS = 2;
    public static final int SCROLL_STATE_PRESERVE_INDEX = 1;
    public static final int SCROLL_STATE_RESET_TO_TOP = 0;
    private final List mActions;
    private final int mAlphabeticalIndexingStrategy;
    private final Header mHeader;

    @Deprecated
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final int mScrollStatePersistenceStrategy;
    private final SearchHeader mSearchHeader;
    private final List mSections;

    private SectionedItemTemplate(acn acnVar) {
        List list = acnVar.a;
        this.mSections = DesugarCollections.unmodifiableList(null);
        List list2 = acnVar.b;
        this.mActions = DesugarCollections.unmodifiableList(null);
        Header header = acnVar.c;
        this.mHeader = null;
        SearchHeader searchHeader = acnVar.d;
        this.mSearchHeader = null;
        boolean z = acnVar.e;
        this.mIsLoading = false;
        boolean z2 = acnVar.f;
        this.mIsAlphabeticalIndexingAllowed = false;
        int i = acnVar.g;
        this.mAlphabeticalIndexingStrategy = 0;
        int i2 = acnVar.h;
        this.mScrollStatePersistenceStrategy = 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof SectionedItemTemplate)) {
                return false;
            }
            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
            if (!Objects.equals(this.mSections, sectionedItemTemplate.mSections) || !Objects.equals(this.mActions, sectionedItemTemplate.mActions) || !Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) || !Objects.equals(this.mSearchHeader, sectionedItemTemplate.mSearchHeader) || this.mIsLoading != sectionedItemTemplate.mIsLoading || this.mIsAlphabeticalIndexingAllowed != sectionedItemTemplate.mIsAlphabeticalIndexingAllowed || this.mScrollStatePersistenceStrategy != sectionedItemTemplate.mScrollStatePersistenceStrategy) {
                return false;
            }
        }
        return true;
    }

    public List getActions() {
        return this.mActions;
    }

    public int getAlphabeticalIndexingStrategy() {
        int i = this.mAlphabeticalIndexingStrategy;
        if (i == 0) {
            return !this.mIsAlphabeticalIndexingAllowed ? 0 : 2;
        }
        return i;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int getScrollStatePersistenceStrategy() {
        return this.mScrollStatePersistenceStrategy;
    }

    public SearchHeader getSearchHeader() {
        return this.mSearchHeader;
    }

    public List getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, this.mSearchHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed), Integer.valueOf(this.mScrollStatePersistenceStrategy));
    }

    @Deprecated
    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate() {
        this.mSections = Collections.EMPTY_LIST;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
        this.mSearchHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    /* synthetic */ SectionedItemTemplate(acn acnVar, aco acoVar) {
        this(acnVar);
    }
}
