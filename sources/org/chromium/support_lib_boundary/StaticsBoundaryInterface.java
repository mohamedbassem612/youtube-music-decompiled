package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface StaticsBoundaryInterface {
    InvocationHandler createSharedArrayBuffer(String str, long j);

    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context context, ValueCallback valueCallback);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int i);

    void setDefaultTrafficStatsUid(int i);

    void setSafeBrowsingAllowlist(Set set, ValueCallback valueCallback);

    void setSafeBrowsingWhitelist(List list, ValueCallback valueCallback);
}
