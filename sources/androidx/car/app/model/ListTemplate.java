package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import defpackage.aad;
import defpackage.aax;
import defpackage.abc;
import defpackage.abd;
import defpackage.abg;
import defpackage.abh;
import defpackage.acz;
import defpackage.yf;
import defpackage.zq;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class ListTemplate implements acz {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    public ListTemplate(abg abgVar) {
        this.mIsLoading = abgVar.a;
        this.mTitle = abgVar.d;
        this.mHeaderAction = abgVar.e;
        this.mSingleList = abgVar.b;
        this.mSectionedLists = aad.b(abgVar.c);
        this.mActionStrip = abgVar.f;
        this.mActions = aad.b(abgVar.g);
        this.mHeader = abgVar.h;
    }

    public static List getTruncatedCopy(List list) {
        abh abhVar = new abh();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SectionedItemList sectionedItemList = (SectionedItemList) it.next();
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), abhVar), sectionedItemList.getHeader().toCharSequence()));
            if (abhVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, abh abhVar) {
        abd abdVar = new abd(itemList);
        abdVar.a.clear();
        for (abc abcVar : itemList.getItems()) {
            if (!(abcVar instanceof ConversationItem)) {
                if (!abhVar.b(1)) {
                    break;
                }
                abdVar.b(abcVar);
                abhVar.a();
            } else {
                ConversationItem conversationItem = (ConversationItem) abcVar;
                if (!abhVar.b(2)) {
                    break;
                }
                zq zqVar = new zq(conversationItem);
                int iMin = Math.min(abhVar.a(), 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                zqVar.f = conversationItem.getMessages().subList(size - iMin2, size);
                abdVar.b(new ConversationItem(zqVar));
                abhVar.a -= iMin2;
            }
        }
        return abdVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListTemplate) {
            ListTemplate listTemplate = (ListTemplate) obj;
            if (this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader)) {
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
        return this.mActions;
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

    public List getSectionedLists() {
        return aad.a(this.mSectionedLists);
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public abg toBuilder() {
        return new abg(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mSectionedLists = Collections.EMPTY_LIST;
        this.mActionStrip = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
