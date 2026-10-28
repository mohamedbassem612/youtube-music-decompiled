package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqd extends Thread {
    public volatile boolean a = false;
    private final BlockingQueue b;
    private final und c;
    private final elq d;
    private final kyr e;

    public eqd(BlockingQueue blockingQueue, kyr kyrVar, und undVar, elq elqVar) {
        this.b = blockingQueue;
        this.e = kyrVar;
        this.c = undVar;
        this.d = elqVar;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x037b A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0384 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x038a A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x03a3 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e1 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x03e9 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x03f1 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x03f7 A[Catch: Exception -> 0x045a, equ -> 0x045c, all -> 0x0489, TryCatch #13 {Exception -> 0x045a, blocks: (B:187:0x0364, B:188:0x0367, B:197:0x0377, B:199:0x037b, B:229:0x03fe, B:230:0x040b, B:231:0x040e, B:233:0x042b, B:234:0x043f, B:200:0x0384, B:203:0x038a, B:205:0x03a3, B:213:0x03bf, B:214:0x03c4, B:219:0x03cd, B:221:0x03d3, B:222:0x03db, B:223:0x03e0, B:224:0x03e1, B:225:0x03e9, B:226:0x03f1, B:228:0x03f7, B:235:0x0440, B:236:0x0445, B:237:0x0446, B:238:0x0459, B:148:0x02da, B:150:0x02e3, B:152:0x02e9, B:153:0x02f3, B:155:0x0302, B:157:0x0306, B:158:0x0316, B:115:0x0243, B:121:0x0263, B:124:0x026b, B:136:0x028d, B:138:0x029a, B:140:0x02a2, B:142:0x02aa, B:147:0x02d2, B:160:0x0324, B:161:0x0329, B:123:0x0269, B:130:0x0278, B:133:0x0280, B:134:0x0288, B:132:0x027e, B:135:0x0289), top: B:282:0x0377 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x0364 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [elq] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [erb] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [elq] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [eqk] */
    /* JADX WARN: Type inference failed for: r3v47, types: [elq] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a() throws Throwable {
        ?? r18;
        ?? r1;
        ?? r19;
        ?? r2;
        ?? r4;
        int i;
        ?? r11;
        ?? r5;
        String str;
        equ eqgVar;
        int i2;
        String str2;
        int timeoutMs;
        Map map;
        erb erbVar;
        ?? r110;
        byte[] bArr;
        eqf eqfVar;
        Object obj;
        byte[] byteArray;
        byte[] bArrB;
        ?? r111;
        ?? r3 = (eqk) this.b.take();
        SystemClock.elapsedRealtime();
        char c = 3;
        r3.sendEvent(3);
        ?? r6 = 4;
        r6 = 4;
        boolean z = true;
        z = true;
        try {
            try {
                r3.addMarker("network-queue-take");
                try {
                    if (r3.isCanceled()) {
                        r3.finish("network-discard-cancelled");
                        r3.notifyListenerResponseNotUsable();
                        r2 = 4;
                    } else {
                        TrafficStats.setThreadStatsTag(r3.getTrafficStatsTag());
                        kyr kyrVar = this.e;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        while (true) {
                            List list = Collections.EMPTY_LIST;
                            try {
                                epx cacheEntry = r3.getCacheEntry();
                                if (cacheEntry == null) {
                                    map = Collections.EMPTY_MAP;
                                    c = c;
                                } else {
                                    HashMap map2 = new HashMap();
                                    String str3 = cacheEntry.b;
                                    if (str3 != null) {
                                        map2.put("If-None-Match", str3);
                                    }
                                    long j = cacheEntry.d;
                                    if (j > 0) {
                                        map2.put("If-Modified-Since", a.bG("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j)));
                                    }
                                    map = map2;
                                }
                                try {
                                    Object obj2 = kyrVar.a;
                                    String url = r3.getUrl();
                                    HashMap map3 = new HashMap();
                                    map3.putAll(map);
                                    map3.putAll(r3.getHeaders());
                                    URL url2 = new URL(url);
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
                                    httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                                    int timeoutMs2 = r3.getTimeoutMs();
                                    httpURLConnection.setConnectTimeout(timeoutMs2);
                                    httpURLConnection.setReadTimeout(timeoutMs2);
                                    httpURLConnection.setUseCaches(false);
                                    httpURLConnection.setDoInput(z);
                                    url2.getProtocol();
                                    try {
                                        for (String str4 : map3.keySet()) {
                                            httpURLConnection.setRequestProperty(str4, (String) map3.get(str4));
                                        }
                                        try {
                                            switch (r3.getMethod()) {
                                                case -1:
                                                    byte[] postBody = r3.getPostBody();
                                                    if (postBody != null) {
                                                        httpURLConnection.setRequestMethod("POST");
                                                        a.bI(httpURLConnection, r3, postBody);
                                                    }
                                                    break;
                                                case 0:
                                                    httpURLConnection.setRequestMethod("GET");
                                                    break;
                                                case 1:
                                                    httpURLConnection.setRequestMethod("POST");
                                                    a.bJ(httpURLConnection, r3);
                                                    break;
                                                case 2:
                                                    httpURLConnection.setRequestMethod("PUT");
                                                    a.bJ(httpURLConnection, r3);
                                                    break;
                                                case 3:
                                                    httpURLConnection.setRequestMethod("DELETE");
                                                    break;
                                                case 4:
                                                    httpURLConnection.setRequestMethod("HEAD");
                                                    break;
                                                case 5:
                                                    httpURLConnection.setRequestMethod("OPTIONS");
                                                    break;
                                                case 6:
                                                    httpURLConnection.setRequestMethod("TRACE");
                                                    break;
                                                case 7:
                                                    httpURLConnection.setRequestMethod("PATCH");
                                                    a.bJ(httpURLConnection, r3);
                                                    break;
                                                default:
                                                    boolean z2 = z ? 1 : 0;
                                                    throw new IllegalStateException("Unknown method type.");
                                            }
                                            int responseCode = httpURLConnection.getResponseCode();
                                            if (responseCode == -1) {
                                                boolean z3 = z ? 1 : 0;
                                                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                                            }
                                            if (r3.getMethod() == r6 || ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                                                r18 = r6;
                                                i = 2;
                                                try {
                                                    erbVar = new erb(responseCode, a.bH(httpURLConnection.getHeaderFields()), -1, (InputStream) null);
                                                    try {
                                                        try {
                                                            httpURLConnection.disconnect();
                                                            r110 = r18;
                                                        } catch (IOException e) {
                                                            e = e;
                                                            z = z ? 1 : 0;
                                                            r4 = 0;
                                                            r11 = r4;
                                                            r5 = r4;
                                                            r18 = r18;
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (e instanceof SocketTimeoutException) {
                                                                            str = "socket";
                                                                            eqgVar = new eqt();
                                                                        } else {
                                                                            if (e instanceof MalformedURLException) {
                                                                                throw new RuntimeException("Bad URL ".concat(String.valueOf(r3.getUrl())), e);
                                                                            }
                                                                            if (r11 != 0) {
                                                                                i2 = r11.a;
                                                                                Integer numValueOf = Integer.valueOf(i2);
                                                                                String url3 = r3.getUrl();
                                                                                Object[] objArr = new Object[i];
                                                                                objArr[0] = numValueOf;
                                                                                objArr[z ? 1 : 0] = url3;
                                                                                eqw.b("Unexpected response code %d for %s", objArr);
                                                                                if (r5 != 0) {
                                                                                    List listA = r11.a();
                                                                                    SystemClock.elapsedRealtime();
                                                                                    new eqf((byte[]) r5, false, listA);
                                                                                    if (i2 != 401 || i2 == 403) {
                                                                                        str = "auth";
                                                                                        eqgVar = new epw();
                                                                                    } else {
                                                                                        if (i2 >= 400 && i2 <= 499) {
                                                                                            throw new epz();
                                                                                        }
                                                                                        if (i2 < 500 || i2 > 599 || !r3.shouldRetryServerErrors()) {
                                                                                            throw new eqs();
                                                                                        }
                                                                                        str = "server";
                                                                                        eqgVar = new eqs();
                                                                                    }
                                                                                } else {
                                                                                    str = "network";
                                                                                    eqgVar = new eqe();
                                                                                }
                                                                            } else {
                                                                                if (!r3.shouldRetryConnectionErrors()) {
                                                                                    throw new eqg(e);
                                                                                }
                                                                                str = "connection";
                                                                                eqgVar = new eqg();
                                                                            }
                                                                        }
                                                                        equ equVar = eqgVar;
                                                                        str2 = str;
                                                                        eqr retryPolicy = r3.getRetryPolicy();
                                                                        timeoutMs = r3.getTimeoutMs();
                                                                        try {
                                                                            retryPolicy.c(equVar);
                                                                            Integer numValueOf2 = Integer.valueOf(timeoutMs);
                                                                            Object[] objArr2 = new Object[2];
                                                                            objArr2[0] = str2;
                                                                            objArr2[z ? 1 : 0] = numValueOf2;
                                                                            r3.addMarker(String.format("%s-retry [timeout=%s]", objArr2));
                                                                            c = c;
                                                                            r6 = r18 == true ? 1 : 0;
                                                                            z = z ? 1 : 0;
                                                                        } catch (equ e2) {
                                                                            Integer numValueOf3 = Integer.valueOf(timeoutMs);
                                                                            Object[] objArr3 = new Object[2];
                                                                            objArr3[0] = str2;
                                                                            objArr3[z ? 1 : 0] = numValueOf3;
                                                                            r3.addMarker(String.format("%s-timeout-giveup [timeout=%s]", objArr3));
                                                                            throw e2;
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        Object[] objArr4 = new Object[z];
                                                                        objArr4[0] = e.toString();
                                                                        eqw.c(e, "Unhandled exception %s", objArr4);
                                                                        equ equVar2 = new equ(e);
                                                                        SystemClock.elapsedRealtime();
                                                                        this.d.d(r3, equVar2);
                                                                        r3.notifyListenerResponseNotUsable();
                                                                        r19 = r18;
                                                                        r2 = r19;
                                                                        r3.sendEvent(r2);
                                                                    }
                                                                } catch (equ e4) {
                                                                    e = e4;
                                                                    try {
                                                                        SystemClock.elapsedRealtime();
                                                                        this.d.d(r3, r3.parseNetworkError(e));
                                                                        r3.notifyListenerResponseNotUsable();
                                                                        r19 = r18;
                                                                        r2 = r19;
                                                                        r3.sendEvent(r2);
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        r1 = 4;
                                                                        r3.sendEvent(r1);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                r1 = r18;
                                                                r3.sendEvent(r1);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        z = z;
                                                        Object[] objArr5 = new Object[z];
                                                        objArr5[0] = e.toString();
                                                        eqw.c(e, "Unhandled exception %s", objArr5);
                                                        equ equVar3 = new equ(e);
                                                        SystemClock.elapsedRealtime();
                                                        this.d.d(r3, equVar3);
                                                        r3.notifyListenerResponseNotUsable();
                                                        r19 = r18;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z = z ? 1 : 0;
                                                    r6 = 0;
                                                    z = false;
                                                    r4 = r6;
                                                    r18 = r18;
                                                    if (!z) {
                                                        try {
                                                            httpURLConnection.disconnect();
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            r11 = r4;
                                                            r5 = r4;
                                                            r18 = r18;
                                                            if (e instanceof SocketTimeoutException) {
                                                                str = "socket";
                                                                eqgVar = new eqt();
                                                            } else {
                                                                if (e instanceof MalformedURLException) {
                                                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(r3.getUrl())), e);
                                                                }
                                                                if (r11 != 0) {
                                                                    i2 = r11.a;
                                                                    Integer numValueOf4 = Integer.valueOf(i2);
                                                                    String url4 = r3.getUrl();
                                                                    Object[] objArr6 = new Object[i];
                                                                    objArr6[0] = numValueOf4;
                                                                    objArr6[z ? 1 : 0] = url4;
                                                                    eqw.b("Unexpected response code %d for %s", objArr6);
                                                                    if (r5 != 0) {
                                                                        List listA2 = r11.a();
                                                                        SystemClock.elapsedRealtime();
                                                                        new eqf((byte[]) r5, false, listA2);
                                                                        if (i2 != 401) {
                                                                            str = "auth";
                                                                            eqgVar = new epw();
                                                                        } else {
                                                                            str = "auth";
                                                                            eqgVar = new epw();
                                                                        }
                                                                    } else {
                                                                        str = "network";
                                                                        eqgVar = new eqe();
                                                                    }
                                                                } else {
                                                                    if (!r3.shouldRetryConnectionErrors()) {
                                                                        throw new eqg(e);
                                                                    }
                                                                    str = "connection";
                                                                    eqgVar = new eqg();
                                                                }
                                                            }
                                                            equ equVar4 = eqgVar;
                                                            str2 = str;
                                                            eqr retryPolicy2 = r3.getRetryPolicy();
                                                            timeoutMs = r3.getTimeoutMs();
                                                            retryPolicy2.c(equVar4);
                                                            Integer numValueOf5 = Integer.valueOf(timeoutMs);
                                                            Object[] objArr7 = new Object[2];
                                                            objArr7[0] = str2;
                                                            objArr7[z ? 1 : 0] = numValueOf5;
                                                            r3.addMarker(String.format("%s-retry [timeout=%s]", objArr7));
                                                            c = c;
                                                            r6 = r18 == true ? 1 : 0;
                                                            z = z ? 1 : 0;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                try {
                                                    r111 = r6;
                                                    try {
                                                        i = 2;
                                                        try {
                                                            erbVar = new erb(responseCode, a.bH(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new erc(httpURLConnection));
                                                            r110 = r111;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z = z ? 1 : 0;
                                                            r4 = 0;
                                                            r18 = r111;
                                                            if (!z) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        i = 2;
                                                        z = z ? 1 : 0;
                                                        r4 = 0;
                                                        r18 = r111;
                                                        if (!z) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    r111 = r6;
                                                }
                                            }
                                            try {
                                                int i3 = erbVar.a;
                                                List listA3 = erbVar.a();
                                                if (i3 == 304) {
                                                    SystemClock.elapsedRealtime();
                                                    epx cacheEntry2 = r3.getCacheEntry();
                                                    if (cacheEntry2 == null) {
                                                        eqfVar = new eqf((byte[]) null, z, listA3);
                                                    } else {
                                                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                                                        if (!listA3.isEmpty()) {
                                                            Iterator it = listA3.iterator();
                                                            while (it.hasNext()) {
                                                                treeSet.add(((eqc) it.next()).a);
                                                            }
                                                        }
                                                        ArrayList arrayList = new ArrayList(listA3);
                                                        List list2 = cacheEntry2.h;
                                                        if (list2 != null) {
                                                            if (!list2.isEmpty()) {
                                                                for (eqc eqcVar : cacheEntry2.h) {
                                                                    if (!treeSet.contains(eqcVar.a)) {
                                                                        arrayList.add(eqcVar);
                                                                    }
                                                                }
                                                            }
                                                        } else if (!cacheEntry2.g.isEmpty()) {
                                                            for (Map.Entry entry : cacheEntry2.g.entrySet()) {
                                                                if (!treeSet.contains(entry.getKey())) {
                                                                    arrayList.add(new eqc((String) entry.getKey(), (String) entry.getValue()));
                                                                }
                                                            }
                                                        }
                                                        eqfVar = new eqf(cacheEntry2.a, z, arrayList);
                                                    }
                                                    boolean z4 = z ? 1 : 0;
                                                } else {
                                                    Object obj3 = erbVar.c;
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    try {
                                                        if (obj3 != null) {
                                                            int i4 = erbVar.b;
                                                            Object obj4 = kyrVar.b;
                                                            erd erdVar = new erd((eqy) obj4, i4);
                                                            try {
                                                                bArrB = ((eqy) obj4).b(SemanticState.ReadOnly);
                                                                while (true) {
                                                                    try {
                                                                        int i5 = ((InputStream) obj3).read(bArrB);
                                                                        if (i5 != -1) {
                                                                            erdVar.write(bArrB, 0, i5);
                                                                        } else {
                                                                            byteArray = erdVar.toByteArray();
                                                                            try {
                                                                                ((InputStream) obj3).close();
                                                                            } catch (IOException unused) {
                                                                                String str5 = eqw.a;
                                                                            }
                                                                            ((eqy) obj4).a(bArrB);
                                                                            erdVar.close();
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        try {
                                                                            ((InputStream) obj3).close();
                                                                        } catch (IOException unused2) {
                                                                            String str6 = eqw.a;
                                                                        }
                                                                        ((eqy) obj4).a(bArrB);
                                                                        erdVar.close();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                bArrB = null;
                                                            }
                                                        } else {
                                                            byteArray = new byte[0];
                                                        }
                                                        try {
                                                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                                            String str7 = eqw.a;
                                                            if (jElapsedRealtime2 > 3000) {
                                                                Long lValueOf = Long.valueOf(jElapsedRealtime2);
                                                                Object objValueOf = byteArray != null ? Integer.valueOf(byteArray.length) : "null";
                                                                Integer numValueOf6 = Integer.valueOf(i3);
                                                                Integer numValueOf7 = Integer.valueOf(r3.getRetryPolicy().a());
                                                                ?? r12 = new Object[5];
                                                                r12[0] = r3;
                                                                r12[z ? 1 : 0] = lValueOf;
                                                                r12[i] = objValueOf;
                                                                r12[c] = numValueOf6;
                                                                r12[r110 == true ? 1 : 0] = numValueOf7;
                                                                eqw.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", r12);
                                                            }
                                                            if (i3 < 200 || i3 > 299) {
                                                                throw new IOException();
                                                            }
                                                            SystemClock.elapsedRealtime();
                                                            eqfVar = new eqf(byteArray, false, listA3);
                                                        } catch (IOException e7) {
                                                            e = e7;
                                                            bArr = byteArray;
                                                            r11 = erbVar;
                                                            r5 = bArr;
                                                            r18 = r110;
                                                            if (e instanceof SocketTimeoutException) {
                                                                str = "socket";
                                                                eqgVar = new eqt();
                                                            } else {
                                                                if (e instanceof MalformedURLException) {
                                                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(r3.getUrl())), e);
                                                                }
                                                                if (r11 != 0) {
                                                                    i2 = r11.a;
                                                                    Integer numValueOf8 = Integer.valueOf(i2);
                                                                    String url5 = r3.getUrl();
                                                                    Object[] objArr8 = new Object[i];
                                                                    objArr8[0] = numValueOf8;
                                                                    objArr8[z ? 1 : 0] = url5;
                                                                    eqw.b("Unexpected response code %d for %s", objArr8);
                                                                    if (r5 != 0) {
                                                                        List listA4 = r11.a();
                                                                        SystemClock.elapsedRealtime();
                                                                        new eqf((byte[]) r5, false, listA4);
                                                                        if (i2 != 401) {
                                                                            str = "auth";
                                                                            eqgVar = new epw();
                                                                        } else {
                                                                            str = "auth";
                                                                            eqgVar = new epw();
                                                                        }
                                                                    } else {
                                                                        str = "network";
                                                                        eqgVar = new eqe();
                                                                    }
                                                                } else {
                                                                    if (!r3.shouldRetryConnectionErrors()) {
                                                                        throw new eqg(e);
                                                                    }
                                                                    str = "connection";
                                                                    eqgVar = new eqg();
                                                                }
                                                            }
                                                            equ equVar5 = eqgVar;
                                                            str2 = str;
                                                            eqr retryPolicy3 = r3.getRetryPolicy();
                                                            timeoutMs = r3.getTimeoutMs();
                                                            retryPolicy3.c(equVar5);
                                                            Integer numValueOf9 = Integer.valueOf(timeoutMs);
                                                            Object[] objArr9 = new Object[2];
                                                            objArr9[0] = str2;
                                                            objArr9[z ? 1 : 0] = numValueOf9;
                                                            r3.addMarker(String.format("%s-retry [timeout=%s]", objArr9));
                                                            c = c;
                                                            r6 = r18 == true ? 1 : 0;
                                                            z = z ? 1 : 0;
                                                        }
                                                    } catch (IOException e8) {
                                                        e = e8;
                                                        bArr = null;
                                                        r11 = erbVar;
                                                        r5 = bArr;
                                                        r18 = r110;
                                                        if (e instanceof SocketTimeoutException) {
                                                            str = "socket";
                                                            eqgVar = new eqt();
                                                        } else {
                                                            if (e instanceof MalformedURLException) {
                                                                throw new RuntimeException("Bad URL ".concat(String.valueOf(r3.getUrl())), e);
                                                            }
                                                            if (r11 != 0) {
                                                                i2 = r11.a;
                                                                Integer numValueOf10 = Integer.valueOf(i2);
                                                                String url6 = r3.getUrl();
                                                                Object[] objArr10 = new Object[i];
                                                                objArr10[0] = numValueOf10;
                                                                objArr10[z ? 1 : 0] = url6;
                                                                eqw.b("Unexpected response code %d for %s", objArr10);
                                                                if (r5 != 0) {
                                                                    List listA5 = r11.a();
                                                                    SystemClock.elapsedRealtime();
                                                                    new eqf((byte[]) r5, false, listA5);
                                                                    if (i2 != 401) {
                                                                        str = "auth";
                                                                        eqgVar = new epw();
                                                                    } else {
                                                                        str = "auth";
                                                                        eqgVar = new epw();
                                                                    }
                                                                } else {
                                                                    str = "network";
                                                                    eqgVar = new eqe();
                                                                }
                                                            } else {
                                                                if (!r3.shouldRetryConnectionErrors()) {
                                                                    throw new eqg(e);
                                                                }
                                                                str = "connection";
                                                                eqgVar = new eqg();
                                                            }
                                                        }
                                                        equ equVar6 = eqgVar;
                                                        str2 = str;
                                                        eqr retryPolicy4 = r3.getRetryPolicy();
                                                        timeoutMs = r3.getTimeoutMs();
                                                        retryPolicy4.c(equVar6);
                                                        Integer numValueOf11 = Integer.valueOf(timeoutMs);
                                                        Object[] objArr11 = new Object[2];
                                                        objArr11[0] = str2;
                                                        objArr11[z ? 1 : 0] = numValueOf11;
                                                        r3.addMarker(String.format("%s-retry [timeout=%s]", objArr11));
                                                        c = c;
                                                        r6 = r18 == true ? 1 : 0;
                                                        z = z ? 1 : 0;
                                                    }
                                                }
                                            } catch (IOException e9) {
                                                e = e9;
                                                z = z ? 1 : 0;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        r18 = r6;
                                        z = z ? 1 : 0;
                                        r6 = 0;
                                        i = 2;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r18 = r6;
                                    z = z ? 1 : 0;
                                    r4 = 0;
                                    i = 2;
                                    r11 = r4;
                                    r5 = r4;
                                    r18 = r18;
                                    if (e instanceof SocketTimeoutException) {
                                        str = "socket";
                                        eqgVar = new eqt();
                                    } else {
                                        if (e instanceof MalformedURLException) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(r3.getUrl())), e);
                                        }
                                        if (r11 != 0) {
                                            i2 = r11.a;
                                            Integer numValueOf12 = Integer.valueOf(i2);
                                            String url7 = r3.getUrl();
                                            Object[] objArr12 = new Object[i];
                                            objArr12[0] = numValueOf12;
                                            objArr12[z ? 1 : 0] = url7;
                                            eqw.b("Unexpected response code %d for %s", objArr12);
                                            if (r5 != 0) {
                                                List listA6 = r11.a();
                                                SystemClock.elapsedRealtime();
                                                new eqf((byte[]) r5, false, listA6);
                                                if (i2 != 401) {
                                                    str = "auth";
                                                    eqgVar = new epw();
                                                } else {
                                                    str = "auth";
                                                    eqgVar = new epw();
                                                }
                                            } else {
                                                str = "network";
                                                eqgVar = new eqe();
                                            }
                                        } else {
                                            if (!r3.shouldRetryConnectionErrors()) {
                                                throw new eqg(e);
                                            }
                                            str = "connection";
                                            eqgVar = new eqg();
                                        }
                                    }
                                    equ equVar7 = eqgVar;
                                    str2 = str;
                                    eqr retryPolicy5 = r3.getRetryPolicy();
                                    timeoutMs = r3.getTimeoutMs();
                                    retryPolicy5.c(equVar7);
                                    Integer numValueOf13 = Integer.valueOf(timeoutMs);
                                    Object[] objArr13 = new Object[2];
                                    objArr13[0] = str2;
                                    objArr13[z ? 1 : 0] = numValueOf13;
                                    r3.addMarker(String.format("%s-retry [timeout=%s]", objArr13));
                                    c = c;
                                    r6 = r18 == true ? 1 : 0;
                                    z = z ? 1 : 0;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                c = c;
                            }
                            Integer numValueOf14 = Integer.valueOf(timeoutMs);
                            Object[] objArr14 = new Object[2];
                            objArr14[0] = str2;
                            objArr14[z ? 1 : 0] = numValueOf14;
                            r3.addMarker(String.format("%s-retry [timeout=%s]", objArr14));
                            c = c;
                            r6 = r18 == true ? 1 : 0;
                            z = z ? 1 : 0;
                        }
                        r3.addMarker("network-http-complete");
                        if (eqfVar.a && r3.hasHadResponseDelivered()) {
                            r3.finish("not-modified");
                            r3.notifyListenerResponseNotUsable();
                            r19 = r110;
                        } else {
                            eqq networkResponse = r3.parseNetworkResponse(eqfVar);
                            r3.addMarker("network-parse-complete");
                            if (r3.shouldCache() && (obj = networkResponse.c) != null) {
                                this.c.i(r3.getCacheKey(), (epx) obj);
                                r3.addMarker("network-cache-written");
                            }
                            r3.markDelivered();
                            this.d.e(r3, networkResponse, null);
                            r3.notifyListenerResponseReceived(networkResponse);
                            r19 = r110;
                        }
                        r2 = r19;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    r1 = 4;
                    r3.sendEvent(r1);
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                r18 = r6;
            }
        } catch (equ e12) {
            e = e12;
            r18 = 4;
        } catch (Exception e13) {
            e = e13;
            r18 = 4;
        }
        r3.sendEvent(r2);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                eqw.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
