package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pwi implements pwh {
    private static final agsn a = agsn.h("GnpSdk");
    private final Context b;

    public pwi(Context context) {
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.pwh
    public final boolean a(String str) throws Exception {
        str.getClass();
        try {
            Context context = this.b;
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.getClass();
            if (auud.a.io().a()) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.auth.accounts", 0);
                if (providerInfoResolveContentProvider == null) {
                    throw new pwg("Failed to resolve ContentProvider for accounts");
                }
                if (!kmm.a(context).b(providerInfoResolveContentProvider.packageName)) {
                    throw new pwg("ContentProvider for accounts is not signed by Google");
                }
            }
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new pwg("Failed to get ContentProviderClient for accounts from GmsCore");
                }
                try {
                    Set setAw = null;
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", null);
                    if (bundleCall == null) {
                        throw new IllegalStateException("Received null bundle when fetching device accounts via GMS Core.");
                    }
                    if (awk.c()) {
                        Account[] accountArr = (Account[]) bundleCall.getParcelableArray("accounts", Account.class);
                        if (accountArr != null) {
                            setAw = atqq.aS(accountArr);
                        }
                    } else {
                        Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                        if (parcelableArray != null) {
                            ArrayList arrayList = new ArrayList(parcelableArray.length);
                            for (Parcelable parcelable : parcelableArray) {
                                parcelable.getClass();
                                arrayList.add((Account) parcelable);
                            }
                            setAw = atqq.aw(arrayList);
                        }
                    }
                    if (setAw == null) {
                        setAw = awnq.a;
                    }
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    ArrayList arrayList2 = new ArrayList(atqq.N(setAw, 10));
                    Iterator it = setAw.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Account) it.next()).name);
                    }
                    return atqq.aw(arrayList2).contains(str);
                } catch (Exception e) {
                    throw new pwg(e);
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
                throw th;
            }
        } catch (pwg e2) {
            ((agsj) ((agsj) a.c()).j(e2)).t("HasCorrespondingAccountOnDevice fell back to true");
            return true;
        }
    }
}
