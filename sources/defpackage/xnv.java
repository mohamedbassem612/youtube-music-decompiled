package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xnv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder");
    static final Pattern b = Pattern.compile("^(.+?): (.+)$", 8);
    public static final DatagramPacket c = i();
    public final ahey d;
    public final tft e;
    public boolean h;
    public final yed i;
    public final xeu j;
    public final mbc k;
    public final xnp m;
    public final xla n;
    public final xof o;
    public final vxz p;
    private final xns r;
    private final awmd s;
    private final boolean v;
    private final boolean w;
    private final aunn x;
    public final Map l = new HashMap();
    private final Set t = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map u = new ConcurrentHashMap();
    private final String q = "YouTube";

    public xnv(xns xnsVar, awmd awmdVar, tft tftVar, xnp xnpVar, yed yedVar, xeu xeuVar, mbc mbcVar, xla xlaVar, vxz vxzVar, aunn aunnVar, ahey aheyVar, xof xofVar) {
        this.d = aheyVar;
        this.r = xnsVar;
        this.s = awmdVar;
        this.e = tftVar;
        this.o = xofVar;
        this.i = yedVar;
        this.j = xeuVar;
        this.k = mbcVar;
        this.v = xlaVar.at();
        this.w = xlaVar.aL();
        this.m = xnpVar;
        this.n = xlaVar;
        this.p = vxzVar;
        this.x = aunnVar;
    }

    private static DatagramPacket i() {
        byte[] bytes = "M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: urn:dial-multiscreen-org:service:dial:1\r\n\r\n".getBytes(StandardCharsets.UTF_8);
        try {
            return new DatagramPacket(bytes, bytes.length, InetAddress.getByAddress(new byte[]{-17, -1, -1, -6}), 1900);
        } catch (UnknownHostException e) {
            throw new IllegalStateException(e);
        }
    }

    private final boolean j(xva xvaVar) {
        int i = xvaVar.a;
        if (i == -2 || i == -1) {
            return true;
        }
        return !this.v && i == 0;
    }

    private static String k(Element element, String str) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && str.equals(nodeItem.getLocalName()) && "urn:schemas-upnp-org:device-1-0".equals(nodeItem.getNamespaceURI())) {
                return nodeItem.getTextContent();
            }
        }
        return null;
    }

    private final int l() {
        yed yedVar = this.i;
        String strA = yedVar.a();
        if (strA.equals("<unknown ssid>")) {
            return 1;
        }
        return strA.equals(yedVar.a()) ? 2 : 3;
    }

    public final xvn a(tgo tgoVar, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : tgoVar.c.b) {
            if ("Application-URL".equalsIgnoreCase((String) entry.getKey())) {
                arrayList.add((String) entry.getValue());
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        if (listUnmodifiableList.size() != 1) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", 827, "DialDeviceFinder.java")).w("Expected one %s header. Found 0 or more", "Application-URL");
            return null;
        }
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", 834, "DialDeviceFinder.java")).t("no body found in response");
            return null;
        }
        try {
            byte[] bArrH = tgnVar.h();
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setNamespaceAware(true);
            Element element = (Element) documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new ByteArrayInputStream(bArrH)).getDocumentElement().getElementsByTagName("device").item(0);
            if (element == null) {
                ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", 858, "DialDeviceFinder.java")).t("No devices found in device description XML.");
                return null;
            }
            String strK = k(element, "friendlyName");
            String strK2 = k(element, "UDN");
            if (strK == null) {
                ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", 871, "DialDeviceFinder.java")).t("Required key friendlyName is missing.");
            } else if (strK2 != null) {
                xvm xvmVarM = xvn.m();
                xvmVarM.b(strK);
                xvmVarM.j = new xwc(strK2);
                String strK3 = k(element, "manufacturer");
                if (strK3 != null) {
                    xvmVarM.c = strK3;
                }
                String strK4 = k(element, "modelName");
                if (strK4 != null) {
                    xvmVarM.d = strK4;
                }
                String strK5 = k(element, "modelNumber");
                if (strK5 != null) {
                    xvmVarM.e = strK5;
                }
                String str = (String) map.get("SERVER");
                if (str != null) {
                    xvmVarM.f = str;
                }
                xvmVarM.c(this.i.a());
                String str2 = (String) listUnmodifiableList.get(0);
                if (str2 != null) {
                    Uri uri = Uri.parse(str2);
                    Uri uriBuild = uri.buildUpon().appendPath(this.q).build();
                    xvmVarM.b = uri;
                    xvmVarM.a = uriBuild;
                }
                xvmVarM.d(3);
                xvmVarM.i = l();
                return xvmVarM.a();
            }
            if (strK2 != null) {
                return null;
            }
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", 874, "DialDeviceFinder.java")).t("Required key UDN is missing.");
            return null;
        } catch (IOException | ParserConfigurationException | SAXException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "parseDeviceDescription", (char) 849, "DialDeviceFinder.java")).t("Error parsing device description");
            return null;
        }
    }

    public final void b() {
        this.t.clear();
        this.f.clear();
    }

    public final void c(xnu xnuVar, boolean z) {
        if (!((xpn) this.x.io()).a()) {
            agrx agrxVar = agso.a;
            xnuVar.b();
            return;
        }
        this.g.add(xnuVar);
        if (this.h) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                xnuVar.a((xvn) it.next());
            }
            return;
        }
        if (z && this.w) {
            final String strA = this.i.a();
            if (!strA.equals("<unknown ssid>")) {
                final xnp xnpVar = this.m;
                ListenableFuture listenableFutureC = xnpVar.g.c();
                agek agekVar = new agek() { // from class: xnn
                    @Override // defpackage.agek
                    public final Object apply(Object obj) {
                        int iAV;
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : DesugarCollections.unmodifiableMap(((atpa) obj).b).entrySet()) {
                            String str = (String) entry.getKey();
                            atoy atoyVar = (atoy) entry.getValue();
                            atoz atozVar = atoyVar.d;
                            if (atozVar == null) {
                                atozVar = atoz.a;
                            }
                            int iAS = a.aS(atozVar.g);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            if (iAS == 3) {
                                atoz atozVar2 = atoyVar.d;
                                if (((atozVar2 == null ? atoz.a : atozVar2).b & 64) != 0) {
                                    if (atozVar2 == null) {
                                        atozVar2 = atoz.a;
                                    }
                                    atpc atpcVar = atozVar2.i;
                                    if (atpcVar == null) {
                                        atpcVar = atpc.a;
                                    }
                                    if (atpcVar.c.equals(strA)) {
                                        atoz atozVar3 = atoyVar.d;
                                        if (atozVar3 == null) {
                                            atozVar3 = atoz.a;
                                        }
                                        atpc atpcVar2 = atozVar3.i;
                                        if (atpcVar2 == null) {
                                            atpcVar2 = atpc.a;
                                        }
                                        if (!atpcVar2.d.isEmpty()) {
                                            xnp xnpVar2 = xnpVar;
                                            if (xnpVar2.f) {
                                                atoz atozVar4 = atoyVar.d;
                                                if (atozVar4 == null) {
                                                    atozVar4 = atoz.a;
                                                }
                                                if (!atozVar4.c.isEmpty()) {
                                                }
                                            }
                                            long epochMilli = xnpVar2.a.f().toEpochMilli();
                                            atoz atozVar5 = atoyVar.d;
                                            if (atozVar5 == null) {
                                                atozVar5 = atoz.a;
                                            }
                                            atpc atpcVar3 = atozVar5.i;
                                            if (atpcVar3 == null) {
                                                atpcVar3 = atpc.a;
                                            }
                                            long j = atpcVar3.f;
                                            if (j >= 0 && j <= epochMilli && j + xnpVar2.b >= epochMilli) {
                                                long j2 = xnpVar2.c;
                                                if (j2 > 0 && epochMilli > j2) {
                                                    int i = 0;
                                                    int i2 = 0;
                                                    for (atpb atpbVar : DesugarCollections.unmodifiableMap(atoyVar.e).values()) {
                                                        if (atpbVar.e >= epochMilli - j2 && (iAV = a.aV(atpbVar.c)) != 0 && iAV == 4) {
                                                            i++;
                                                            int iAS2 = a.aS(atpbVar.d);
                                                            if (iAS2 != 0 && iAS2 == 3) {
                                                                i2++;
                                                            }
                                                        }
                                                    }
                                                    double d = i > 0 ? i2 / i : 1.0d;
                                                    if (i < xnpVar2.d || d >= xnpVar2.e) {
                                                    }
                                                }
                                                xvm xvmVarM = xvn.m();
                                                xvmVarM.j = new xwc(str);
                                                atoz atozVar6 = atoyVar.d;
                                                xvmVarM.c = (atozVar6 == null ? atoz.a : atozVar6).c;
                                                xvmVarM.d = (atozVar6 == null ? atoz.a : atozVar6).d;
                                                if (atozVar6 == null) {
                                                    atozVar6 = atoz.a;
                                                }
                                                xvmVarM.b(atozVar6.f);
                                                atoz atozVar7 = atoyVar.d;
                                                if (atozVar7 == null) {
                                                    atozVar7 = atoz.a;
                                                }
                                                atpc atpcVar4 = atozVar7.i;
                                                if (atpcVar4 == null) {
                                                    atpcVar4 = atpc.a;
                                                }
                                                xvmVarM.c(atpcVar4.c);
                                                atoz atozVar8 = atoyVar.d;
                                                atpc atpcVar5 = (atozVar8 == null ? atoz.a : atozVar8).i;
                                                if (atpcVar5 == null) {
                                                    atpcVar5 = atpc.a;
                                                }
                                                xvmVarM.g = atpcVar5.d;
                                                if (atozVar8 == null) {
                                                    atozVar8 = atoz.a;
                                                }
                                                atpc atpcVar6 = atozVar8.i;
                                                if (atpcVar6 == null) {
                                                    atpcVar6 = atpc.a;
                                                }
                                                xvmVarM.e(atpcVar6.e);
                                                xvmVarM.d(1);
                                                xuz xuzVarA = xva.a();
                                                xuzVarA.e(-2);
                                                atoz atozVar9 = atoyVar.d;
                                                String str2 = (atozVar9 == null ? atoz.a : atozVar9).j;
                                                if (atozVar9 == null) {
                                                    atozVar9 = atoz.a;
                                                }
                                                xuzVarA.b(agkj.k("brand", str2, "model", atozVar9.k));
                                                xvmVarM.f(xuzVarA.a());
                                                arrayList.add(xvmVarM.a());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return arrayList;
                    }
                };
                long j = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), agekVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
                listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                taf.g(ahcrVar, new ixb(xnuVar, 17));
            }
        }
        this.h = true;
        this.d.execute(afwl.i(new syd(this, 19)));
    }

    public final /* synthetic */ void d(ListenableFuture listenableFuture, MulticastSocket multicastSocket) {
        try {
            listenableFuture.get(9400L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "startNewSearch", (char) 995, "DialDeviceFinder.java")).t("Interrupted waiting for reading device response task to complete");
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e2)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "startNewSearch", (char) 999, "DialDeviceFinder.java")).t("Error waiting for reading device response task to complete");
        } catch (TimeoutException e3) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e3)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "startNewSearch", (char) 1002, "DialDeviceFinder.java")).t("Timed out waiting for device response");
            listenableFuture.cancel(true);
        }
        Map map = this.u;
        map.keySet().retainAll(this.t);
        multicastSocket.close();
        b();
        this.h = false;
    }

    public final void e() {
        agrx agrxVar = agso.a;
        Collection.EL.stream(this.g).forEach(new ulo(18));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c3 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x011b A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x012b A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x0191 A[Catch: all -> 0x01a7, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x002c, B:10:0x003a, B:12:0x0044, B:21:0x0082, B:13:0x0050, B:16:0x005a, B:20:0x0067, B:23:0x0087, B:26:0x009a, B:28:0x00c3, B:30:0x00c7, B:59:0x0199, B:31:0x00d1, B:33:0x00e5, B:35:0x00fd, B:37:0x0116, B:43:0x012e, B:46:0x0136, B:48:0x013a, B:50:0x0142, B:53:0x014c, B:55:0x0158, B:56:0x0161, B:57:0x016e, B:58:0x0191, B:39:0x011b, B:41:0x012b, B:24:0x0097), top: B:68:0x0005, inners: #0 }] */
    public final synchronized void f(String str, xvn xvnVar, Map map) {
        xvn xvnVarA;
        xvn xvnVarA2;
        xns xnsVar;
        Uri uri;
        xva xvaVarA;
        boolean z;
        awmd awmdVar;
        String str2;
        String str3;
        String str4;
        ListenableFuture listenableFutureN;
        Uri uri2;
        Uri uriBuild;
        String str5 = (String) map.get("WAKEUP");
        boolean z2 = false;
        if (str5 != null) {
            if (((xpl) this.s.io()).a(3, xod.a(xvnVar.e, xvnVar.f, xvnVar.h))) {
                agrx agrxVar = agso.a;
            } else {
                String str6 = null;
                int i = -1;
                for (String str7 : str5.split(";")) {
                    if (str7.startsWith("MAC=")) {
                        String strSubstring = str7.substring(4);
                        agrx agrxVar2 = agso.a;
                        String str8 = xvnVar.c;
                        xwc xwcVar = xvnVar.n;
                        str6 = strSubstring;
                    } else if (str7.startsWith("Timeout=")) {
                        try {
                            i = Integer.parseInt(str7.substring(8));
                        } catch (NumberFormatException e) {
                            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "decorateScreenWithWakeOnLan", (char) 784, "DialDeviceFinder.java")).t("Unable to parse wake-up timeout value: ");
                        }
                    }
                }
                if (str6 != null) {
                    xvm xvmVar = new xvm(xvnVar);
                    xvmVar.g = str6;
                    xvmVar.e(i);
                    xvnVarA = xvmVar.a();
                }
                xvm xvmVar2 = new xvm(xvnVarA);
                xvmVar2.i = l();
                xvnVarA2 = xvmVar2.a();
                this.u.put(str, xvnVarA2);
                xnsVar = this.r;
                uri = xvnVarA2.a;
                xvaVarA = xnsVar.a(uri, xvnVarA2.p());
                if (j(xvaVarA)) {
                    uri2 = xvnVarA2.b;
                    if (uri2 == null) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        uriBuild = uri2.buildUpon().appendPath("YouTube").build();
                        if (uriBuild.equals(uri)) {
                            z = false;
                        } else {
                            xvm xvmVar3 = new xvm(xvnVarA2);
                            xvmVar3.a = uriBuild;
                            xvnVarA2 = xvmVar3.a();
                            xvaVarA = xnsVar.a(xvnVarA2.a, xvnVarA2.p());
                            z = true;
                        }
                        awmdVar = this.s;
                        str2 = xvnVarA2.e;
                        str3 = xvnVarA2.f;
                        str4 = xvnVarA2.h;
                        if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                            agrx agrxVar3 = agso.a;
                        } else {
                            if (z) {
                                if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                                    agrx agrxVar4 = agso.a;
                                }
                            }
                            if (j(xvaVarA)) {
                                listenableFutureN = ahng.n(Optional.empty());
                            } else {
                                listenableFutureN = ahng.n(Optional.empty());
                            }
                        }
                        z2 = true;
                        if (j(xvaVarA)) {
                            listenableFutureN = ahng.n(Optional.empty());
                        } else {
                            listenableFutureN = ahng.n(Optional.empty());
                        }
                    }
                } else {
                    z = false;
                    awmdVar = this.s;
                    str2 = xvnVarA2.e;
                    str3 = xvnVarA2.f;
                    str4 = xvnVarA2.h;
                    if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                        agrx agrxVar5 = agso.a;
                    } else {
                        if (z) {
                            if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                                agrx agrxVar6 = agso.a;
                            }
                        }
                        if (j(xvaVarA) || z2 || xvaVarA.c) {
                            listenableFutureN = ahng.n(Optional.empty());
                        } else if ("Google Inc.".equals(str2) || "Eureka Dongle".equals(str3)) {
                            ((agrc) ((agrc) a.c().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "shouldIgnoreCastSupportingRoute", 1087, "DialDeviceFinder.java")).t("ignoring cast support route");
                            listenableFutureN = ahng.n(Optional.empty());
                        } else {
                            listenableFutureN = (str3 == null || !this.n.P().contains(str3)) ? ahng.n(Optional.of(xvnVarA2.n(xvaVarA))) : ahng.n(Optional.empty());
                        }
                    }
                    z2 = true;
                    if (j(xvaVarA)) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        listenableFutureN = ahng.n(Optional.empty());
                    }
                }
                taf.g(listenableFutureN, new ixb(this, 18));
            }
            xvnVarA = xvnVar;
            xvm xvmVar4 = new xvm(xvnVarA);
            xvmVar4.i = l();
            xvnVarA2 = xvmVar4.a();
            this.u.put(str, xvnVarA2);
            xnsVar = this.r;
            uri = xvnVarA2.a;
            xvaVarA = xnsVar.a(uri, xvnVarA2.p());
            if (j(xvaVarA)) {
                z = false;
                awmdVar = this.s;
                str2 = xvnVarA2.e;
                str3 = xvnVarA2.f;
                str4 = xvnVarA2.h;
                if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                    agrx agrxVar7 = agso.a;
                } else {
                    if (z) {
                        if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                            agrx agrxVar8 = agso.a;
                        }
                    }
                    if (j(xvaVarA)) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        listenableFutureN = ahng.n(Optional.empty());
                    }
                }
                z2 = true;
                if (j(xvaVarA)) {
                    listenableFutureN = ahng.n(Optional.empty());
                } else {
                    listenableFutureN = ahng.n(Optional.empty());
                }
            } else {
                uri2 = xvnVarA2.b;
                if (uri2 == null) {
                    listenableFutureN = ahng.n(Optional.empty());
                } else {
                    uriBuild = uri2.buildUpon().appendPath("YouTube").build();
                    if (uriBuild.equals(uri)) {
                        xvm xvmVar5 = new xvm(xvnVarA2);
                        xvmVar5.a = uriBuild;
                        xvnVarA2 = xvmVar5.a();
                        xvaVarA = xnsVar.a(xvnVarA2.a, xvnVarA2.p());
                        z = true;
                    } else {
                        z = false;
                    }
                    awmdVar = this.s;
                    str2 = xvnVarA2.e;
                    str3 = xvnVarA2.f;
                    str4 = xvnVarA2.h;
                    if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                        agrx agrxVar9 = agso.a;
                    } else {
                        if (z) {
                            if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                                agrx agrxVar10 = agso.a;
                            }
                        }
                        if (j(xvaVarA)) {
                            listenableFutureN = ahng.n(Optional.empty());
                        } else {
                            listenableFutureN = ahng.n(Optional.empty());
                        }
                    }
                    z2 = true;
                    if (j(xvaVarA)) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        listenableFutureN = ahng.n(Optional.empty());
                    }
                }
            }
            taf.g(listenableFutureN, new ixb(this, 18));
        } else {
            xvnVarA = xvnVar;
            xvm xvmVar6 = new xvm(xvnVarA);
            xvmVar6.i = l();
            xvnVarA2 = xvmVar6.a();
            this.u.put(str, xvnVarA2);
            xnsVar = this.r;
            uri = xvnVarA2.a;
            xvaVarA = xnsVar.a(uri, xvnVarA2.p());
            if (j(xvaVarA)) {
                z = false;
                awmdVar = this.s;
                str2 = xvnVarA2.e;
                str3 = xvnVarA2.f;
                str4 = xvnVarA2.h;
                if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                    agrx agrxVar11 = agso.a;
                } else {
                    if (z) {
                        if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                            agrx agrxVar12 = agso.a;
                        }
                    }
                    if (j(xvaVarA)) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        listenableFutureN = ahng.n(Optional.empty());
                    }
                }
                z2 = true;
                if (j(xvaVarA)) {
                    listenableFutureN = ahng.n(Optional.empty());
                } else {
                    listenableFutureN = ahng.n(Optional.empty());
                }
            } else {
                uri2 = xvnVarA2.b;
                if (uri2 == null) {
                    listenableFutureN = ahng.n(Optional.empty());
                } else {
                    uriBuild = uri2.buildUpon().appendPath("YouTube").build();
                    if (uriBuild.equals(uri)) {
                        xvm xvmVar7 = new xvm(xvnVarA2);
                        xvmVar7.a = uriBuild;
                        xvnVarA2 = xvmVar7.a();
                        xvaVarA = xnsVar.a(xvnVarA2.a, xvnVarA2.p());
                        z = true;
                    } else {
                        z = false;
                    }
                    awmdVar = this.s;
                    str2 = xvnVarA2.e;
                    str3 = xvnVarA2.f;
                    str4 = xvnVarA2.h;
                    if (((xpl) awmdVar.io()).a(2, xod.a(str2, str3, str4))) {
                        agrx agrxVar13 = agso.a;
                    } else {
                        if (z) {
                            if (((xpl) awmdVar.io()).a(4, xod.a(str2, str3, str4))) {
                                agrx agrxVar14 = agso.a;
                            }
                        }
                        if (j(xvaVarA)) {
                            listenableFutureN = ahng.n(Optional.empty());
                        } else {
                            listenableFutureN = ahng.n(Optional.empty());
                        }
                    }
                    z2 = true;
                    if (j(xvaVarA)) {
                        listenableFutureN = ahng.n(Optional.empty());
                    } else {
                        listenableFutureN = ahng.n(Optional.empty());
                    }
                }
            }
            taf.g(listenableFutureN, new ixb(this, 18));
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(DatagramSocket datagramSocket) {
        DatagramPacket datagramPacket;
        ArrayList arrayList;
        boolean z;
        ExecutionException executionException;
        ArrayList arrayList2;
        String str = "DialDeviceFinder.java";
        int i = 2000;
        try {
            datagramSocket.setSoTimeout(2000);
            while (true) {
                long jB = this.k.b();
                char c2 = 1;
                z = true;
                try {
                    datagramSocket.receive(datagramPacket);
                    datagramPacket = datagramPacket;
                    z = true;
                } catch (SocketTimeoutException unused) {
                    z = true;
                } catch (IOException e) {
                    if (!datagramSocket.isClosed()) {
                        ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "readDeviceResponses", (char) 643, "DialDeviceFinder.java")).t("Error receiving m search response packet");
                    }
                    c2 = 0;
                }
                int iB = i - ((int) (this.k.b() - jB));
                if (iB <= 0) {
                    break;
                }
                if (c2 == 0) {
                    arrayList2 = arrayList;
                } else {
                    String str2 = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), StandardCharsets.UTF_8);
                    ArrayList arrayList3 = arrayList;
                    HashMap map = new HashMap();
                    Matcher matcher = b.matcher(str2);
                    while (matcher.find()) {
                        if (matcher.groupCount() == 2) {
                            String strGroup = matcher.group(z ? 1 : 0);
                            String strGroup2 = matcher.group(2);
                            if (strGroup != null && strGroup2 != null) {
                                map.put(strGroup.toUpperCase(Locale.US), strGroup2);
                            }
                        }
                    }
                    ListenableFuture listenableFutureAp = null;
                    if ("urn:dial-multiscreen-org:service:dial:1".equals(map.get("ST"))) {
                        String str3 = (String) map.get("LOCATION");
                        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(Uri.parse(str3).getHost())) {
                            arrayList2 = arrayList3;
                            ((agrc) ((agrc) a.c().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "processDiscoveryResponse", 699, "DialDeviceFinder.java")).w("Ignoring device with unusable LOCATION: %s", str3);
                        } else {
                            Set set = this.t;
                            if (set.contains(str3)) {
                                arrayList2 = arrayList3;
                            } else {
                                set.add(str3);
                                Map map2 = this.u;
                                if (map2.containsKey(str3)) {
                                    f(str3, (xvn) map2.get(str3), map);
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    listenableFutureAp = ahno.ap(new vtq(this, str3, map, 6, (byte[]) null), this.d);
                                }
                            }
                        }
                    } else {
                        arrayList2 = arrayList3;
                    }
                    if (listenableFutureAp != null) {
                        arrayList2.add(listenableFutureAp);
                    }
                }
                arrayList = arrayList2;
                i = iB;
                datagramPacket = datagramPacket;
            }
        } catch (SocketException e2) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(e2)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "readDeviceResponses", (char) 623, "DialDeviceFinder.java")).t("Error setting socket timeout");
        }
        datagramPacket = new DatagramPacket(new byte[SemanticState.ReadOnly], SemanticState.ReadOnly);
        arrayList = new ArrayList();
        mbc mbcVar = this.k;
        long jB2 = mbcVar.b() + 7300;
        agke agkeVarF = ahng.f(arrayList);
        int i2 = ((agpi) agkeVarF).d;
        int i3 = 0;
        while (i3 < i2) {
            ListenableFuture listenableFuture = (ListenableFuture) agkeVarF.get(i3);
            try {
                try {
                    try {
                        listenableFuture.get(Math.max(0L, jB2 - mbcVar.b()), TimeUnit.MILLISECONDS);
                        str = str;
                        z = z ? 1 : 0;
                    } catch (ExecutionException e3) {
                        executionException = e3;
                        ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).j(executionException)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "readDeviceResponses", (char) 673, str)).t("Error waiting for reading device description task to complete");
                    }
                } catch (ExecutionException e4) {
                    executionException = e4;
                }
            } catch (InterruptedException unused2) {
                str = str;
                z = z ? 1 : 0;
                ((agrc) ((agrc) a.b().i(agso.a, "MDX.DialDeviceFinder")).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "readDeviceResponses", 667, str)).t("Read device response task cancelled while waiting for reading device description task to complete");
                listenableFuture.cancel(z);
                Thread.currentThread().interrupt();
            } catch (TimeoutException e5) {
                agru agruVarI = a.b().i(agso.a, "MDX.DialDeviceFinder");
                String str4 = str;
                z = (z ? 1 : 0) == true ? 1 : 0;
                str = str4;
                ((agrc) ((agrc) ((agrc) agruVarI).j(e5)).k("com/google/android/libraries/youtube/mdx/discovery/DialDeviceFinder", "readDeviceResponses", (char) 676, str)).t("Timed out whilst reading device description");
            }
            i3++;
            z = z;
            str = str;
        }
    }

    public final void h(xnu xnuVar) {
        this.g.remove(xnuVar);
    }
}
