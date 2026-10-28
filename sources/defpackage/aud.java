package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aud {
    private final CharSequence a;
    private final long b;
    private final avc c;
    private final Bundle d = new Bundle();
    private String e;
    private Uri f;

    public aud(CharSequence charSequence, long j, avc avcVar) {
        this.a = charSequence;
        this.b = j;
        this.c = avcVar;
    }

    static List b(Parcelable[] parcelableArr) {
        String str;
        String str2;
        avc avcVar;
        String str3 = "sender";
        String str4 = "sender_person";
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        int i = 0;
        while (i < parcelableArr.length) {
            Parcelable parcelable = parcelableArr[i];
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                aud audVar = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            avcVar = avc.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey(str4) && Build.VERSION.SDK_INT >= 28) {
                            avcVar = ats.c(fd$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable(str4)));
                        } else if (bundle.containsKey(str3)) {
                            avb avbVar = new avb();
                            avbVar.a = bundle.getCharSequence(str3);
                            avcVar = new avc(avbVar);
                        } else {
                            avcVar = null;
                        }
                        str = str3;
                        str2 = str4;
                        try {
                            aud audVar2 = new aud(bundle.getCharSequence("text"), bundle.getLong("time"), avcVar);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                audVar2.d(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                audVar2.d.putAll(bundle.getBundle("extras"));
                            }
                            audVar = audVar2;
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        str = str3;
                        str2 = str4;
                    }
                } catch (ClassCastException unused2) {
                }
                if (audVar != null) {
                    arrayList.add(audVar);
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i++;
            str3 = str;
            str4 = str2;
        }
        return arrayList;
    }

    static Bundle[] c(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aud audVar = (aud) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = audVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", audVar.b);
            avc avcVar = audVar.c;
            if (avcVar != null) {
                bundle.putCharSequence("sender", avcVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", ats.b(avcVar));
                } else {
                    bundle.putBundle("person", avcVar.a());
                }
            }
            String str = audVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = audVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", audVar.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    final Notification.MessagingStyle.Message a() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        avc avcVar = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            messageA = auc.a(charSequence, this.b, avcVar != null ? ats.b(avcVar) : null);
        } else {
            messageA = aub.a(charSequence, this.b, avcVar != null ? avcVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            aub.b(messageA, str, this.f);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            auc.b(messageA, this.d);
        }
        return messageA;
    }

    public final void d(String str, Uri uri) {
        this.e = str;
        this.f = uri;
    }
}
