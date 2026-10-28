package androidx.car.app.messaging.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.aad;
import defpackage.abc;
import defpackage.avb;
import defpackage.avc;
import defpackage.azs;
import defpackage.yf;
import defpackage.zi;
import defpackage.zm;
import defpackage.zp;
import defpackage.zq;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class ConversationItem implements abc {
    private final List mActions;
    private final zm mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List mMessages;
    private final avc mSelf;
    private final CarText mTitle;

    public ConversationItem(zq zqVar) {
        String str = zqVar.a;
        str.getClass();
        this.mId = str;
        CarText carText = zqVar.b;
        carText.getClass();
        this.mTitle = carText;
        avc avcVar = zqVar.c;
        validateSender(avcVar);
        this.mSelf = avcVar;
        this.mIcon = zqVar.d;
        this.mIsGroupConversation = zqVar.e;
        List listB = aad.b(zqVar.f);
        listB.getClass();
        this.mMessages = listB;
        azs.h(!listB.isEmpty(), "Message list cannot be empty.");
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            azs.h(((CarMessage) it.next()) != null, "Message list cannot contain null messages");
        }
        zm zmVar = zqVar.g;
        zmVar.getClass();
        this.mConversationCallbackDelegate = zmVar;
        this.mActions = aad.b(zqVar.h);
        boolean z = zqVar.i;
        this.mIndexable = true;
    }

    static avc validateSender(avc avcVar) {
        avcVar.getClass();
        avcVar.a.getClass();
        avcVar.d.getClass();
        return avcVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConversationItem) {
            ConversationItem conversationItem = (ConversationItem) obj;
            if (Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && zi.b(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable) {
                return true;
            }
        }
        return false;
    }

    public List getActions() {
        return this.mActions;
    }

    public zm getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List getMessages() {
        return this.mMessages;
    }

    public avc getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(zi.a(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        avb avbVar = new avb();
        avbVar.a = "";
        this.mSelf = new avc(avbVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new zp());
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
