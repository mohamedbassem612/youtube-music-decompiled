package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class thf extends RequestFinishedInfo.Listener {
    public String a;
    private final tfx b;
    private final awmd c;

    public thf(tfx tfxVar, Executor executor, awmd awmdVar) {
        super(executor);
        this.b = tfxVar;
        this.c = awmdVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    public static tfv a(RequestFinishedInfo requestFinishedInfo, String str, awmd awmdVar) {
        String str2;
        Integer num;
        String str3;
        Long l;
        Long receivedByteCount;
        Long l2;
        Long totalTimeMs;
        Long ttfbMs;
        int i;
        Integer numValueOf;
        Integer num2;
        CronetException exception;
        ArrayList arrayList;
        Integer num3;
        List list;
        String url = requestFinishedInfo.getUrl();
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        String str4 = str == null ? null : str;
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        int i2 = 0;
        if (responseInfo != null) {
            Integer numValueOf2 = Integer.valueOf(responseInfo.getHttpStatusCode());
            String negotiatedProtocol = responseInfo.getNegotiatedProtocol();
            Map allHeaders = responseInfo.getAllHeaders();
            if (allHeaders == null || (list = (List) allHeaders.get("Content-Type")) == null || list.isEmpty()) {
                num = numValueOf2;
                str3 = negotiatedProtocol;
                str2 = null;
            } else {
                str2 = (String) list.get(0);
                num = numValueOf2;
                str3 = negotiatedProtocol;
            }
        } else {
            str2 = null;
            num = null;
            str3 = null;
        }
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics != null) {
            receivedByteCount = metrics.getReceivedByteCount();
            Long sentByteCount = metrics.getSentByteCount();
            Long lValueOf = metrics.getRequestStart() == null ? null : Long.valueOf(metrics.getRequestStart().getTime());
            ttfbMs = metrics.getTtfbMs();
            Long l3 = lValueOf;
            totalTimeMs = metrics.getTotalTimeMs();
            l = sentByteCount;
            l2 = l3;
        } else {
            l = null;
            receivedByteCount = null;
            l2 = null;
            totalTimeMs = null;
            ttfbMs = null;
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        if (finishedReason == 0) {
            i = 2;
        } else if (finishedReason != 1) {
            i = finishedReason != 2 ? 1 : 4;
        } else {
            i = 3;
        }
        if (requestFinishedInfo.getException() != null) {
            exception = requestFinishedInfo.getException();
            CronetException exception2 = requestFinishedInfo.getException();
            if (exception2 instanceof CallbackException) {
                i2 = 2;
            } else if (exception2 instanceof NetworkException) {
                switch (((NetworkException) exception2).getErrorCode()) {
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case 9:
                        i2 = 11;
                        break;
                    case 10:
                        i2 = 12;
                        break;
                    case 11:
                        i2 = 13;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            Integer numValueOf3 = requestFinishedInfo.getException() instanceof QuicException ? Integer.valueOf(((QuicException) requestFinishedInfo.getException()).getQuicDetailedErrorCode()) : null;
            if (((vxz) awmdVar.io()).l(61, 45740038L, false)) {
                CronetException exception3 = requestFinishedInfo.getException();
                if (exception3 instanceof NetworkException) {
                    numValueOf = Integer.valueOf(((NetworkException) exception3).getCronetInternalErrorCode());
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            num2 = numValueOf3;
        } else {
            numValueOf = null;
            num2 = null;
            exception = null;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            Collection annotations = requestFinishedInfo.getAnnotations();
            arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                num3 = numValueOf;
                if (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (next instanceof the) {
                        Collection collection = ((the) next).a;
                        if (collection != null) {
                            arrayList.addAll(collection);
                        }
                    } else {
                        arrayList.add(next);
                    }
                    it = it2;
                    numValueOf = num3;
                }
            }
        } else {
            arrayList = null;
            num3 = numValueOf;
        }
        return new tfv(url, str2, receivedByteCount, l, l2, ttfbMs, totalTimeMs, num, str3, i, i2, num2, arrayList, exception, str4, num3);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.b.a(a(requestFinishedInfo, this.a, this.c));
    }
}
