package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eqk implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private epx mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private eqo mErrorListener;
    private final eqv mEventLog;
    private final Object mLock;
    private final int mMethod;
    private eqi mRequestCompleteListener;
    private eqn mRequestQueue;
    private boolean mResponseDelivered;
    private eqr mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public eqk(int i, String str, eqo eqoVar) {
        int i2 = eqv.a;
        this.mEventLog = null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = eqoVar;
        setRetryPolicy(new eqa());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    private byte[] encodeParameters(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: ".concat(String.valueOf(str)), e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        int i = eqv.a;
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(eqk eqkVar) {
        int iOrdinal;
        int iOrdinal2;
        eqj priority = getPriority();
        eqj priority2 = eqkVar.getPriority();
        if (priority == priority2) {
            iOrdinal = this.mSequence.intValue();
            iOrdinal2 = eqkVar.mSequence.intValue();
        } else {
            iOrdinal = priority2.ordinal();
            iOrdinal2 = priority.ordinal();
        }
        return iOrdinal - iOrdinal2;
    }

    public void deliverError(equ equVar) {
        eqo eqoVar;
        synchronized (this.mLock) {
            eqoVar = this.mErrorListener;
        }
        if (eqoVar != null) {
            eqoVar.onErrorResponse(equVar);
        }
    }

    protected abstract void deliverResponse(Object obj);

    public void finish(String str) {
        eqn eqnVar = this.mRequestQueue;
        if (eqnVar != null) {
            Set set = eqnVar.a;
            synchronized (set) {
                set.remove(this);
            }
            List list = eqnVar.f;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((eqm) it.next()).a();
                }
            }
            eqnVar.b();
        }
        int i = eqv.a;
    }

    public byte[] getBody() {
        Map params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=".concat(String.valueOf(getParamsEncoding()));
    }

    public epx getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public eqo getErrorListener() {
        eqo eqoVar;
        synchronized (this.mLock) {
            eqoVar = this.mErrorListener;
        }
        return eqoVar;
    }

    public Map getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    protected Map getParams() {
        return null;
    }

    protected String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    protected Map getPostParams() {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public eqj getPriority() {
        return eqj.b;
    }

    public eqr getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().b();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        eqi eqiVar;
        synchronized (this.mLock) {
            eqiVar = this.mRequestCompleteListener;
        }
        if (eqiVar != null) {
            eqiVar.a(this);
        }
    }

    public void notifyListenerResponseReceived(eqq eqqVar) {
        eqi eqiVar;
        synchronized (this.mLock) {
            eqiVar = this.mRequestCompleteListener;
        }
        if (eqiVar != null) {
            eqiVar.b(this, eqqVar);
        }
    }

    protected abstract eqq parseNetworkResponse(eqf eqfVar);

    public void sendEvent(int i) {
        eqn eqnVar = this.mRequestQueue;
        if (eqnVar != null) {
            eqnVar.b();
        }
    }

    public eqk setCacheEntry(epx epxVar) {
        this.mCacheEntry = epxVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(eqi eqiVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = eqiVar;
        }
    }

    public eqk setRequestQueue(eqn eqnVar) {
        this.mRequestQueue = eqnVar;
        return this;
    }

    public eqk setRetryPolicy(eqr eqrVar) {
        this.mRetryPolicy = eqrVar;
        return this;
    }

    public final eqk setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final eqk setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final eqk setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    public final eqk setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    public eqk setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(getTrafficStatsTag()));
        return (true != isCanceled() ? "[ ] " : "[X] ") + getUrl() + ' ' + "0x".concat(strValueOf) + ' ' + String.valueOf(getPriority()) + ' ' + this.mSequence;
    }

    protected equ parseNetworkError(equ equVar) {
        return equVar;
    }

    @Deprecated
    public eqk(String str, eqo eqoVar) {
        this(-1, str, eqoVar);
    }
}
