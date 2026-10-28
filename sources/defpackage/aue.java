package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aue extends auu {
    public CharSequence b;
    private avc d;
    private Boolean e;
    public final List a = new ArrayList();
    private final List c = new ArrayList();

    public aue(avc avcVar) {
        if (TextUtils.isEmpty(avcVar.a)) {
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        this.d = avcVar;
    }

    @Override // defpackage.auu
    protected final String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.auu
    public final void b(Bundle bundle) {
        super.b(bundle);
        List list = this.a;
        list.clear();
        avc avcVarC = null;
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.messagingUser")) {
            avcVarC = aua.c(bundle, "android.messagingUser");
        }
        if (avcVarC != null) {
            this.d = avcVarC;
        } else if (bundle.containsKey("android.messagingStyleUser")) {
            this.d = avc.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            avb avbVar = new avb();
            avbVar.a = bundle.getString("android.selfDisplayName");
            this.d = new avc(avbVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.b = charSequence;
        if (charSequence == null) {
            this.b = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(aud.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.c.addAll(aud.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.auu
    public final void f(dep depVar) {
        atr atrVar = this.h;
        boolean zBooleanValue = false;
        if (atrVar == null || atrVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.e != null) {
            Boolean bool = this.e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.b != null) {
            zBooleanValue = true;
        }
        e(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        avc avcVar = this.d;
        Notification.MessagingStyle messagingStyleA = i >= 28 ? aua.a(ats.b(avcVar)) : aty.b(avcVar.a);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aty.a(messagingStyleA, ((aud) it.next()).a());
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            atz.a(messagingStyleA, ((aud) it2.next()).a());
        }
        if (this.e.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            aty.c(messagingStyleA, this.b);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            aua.b(messagingStyleA, this.e.booleanValue());
        }
        messagingStyleA.setBuilder((Notification.Builder) depVar.c);
    }

    @Override // defpackage.auu
    public final void i(Bundle bundle) {
        super.i(bundle);
        if (Build.VERSION.SDK_INT < 28) {
            bundle.putCharSequence("android.selfDisplayName", this.d.a);
            bundle.putBundle("android.messagingStyleUser", this.d.a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.b);
            if (this.b != null && this.e.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.b);
            }
            List list = this.a;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("android.messages", aud.c(list));
            }
            List list2 = this.c;
            if (!list2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", aud.c(list2));
            }
            Boolean bool = this.e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }
    }

    public aue() {
    }
}
