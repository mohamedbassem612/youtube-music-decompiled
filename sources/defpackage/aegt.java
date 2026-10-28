package defpackage;

import android.util.Base64OutputStream;
import android.webkit.CookieManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aegt implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aegt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [agwu, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        axoz axozVar;
        twp twpVarE;
        axoz axozVar2;
        axoz axozVar3;
        ListenableFuture listenableFutureA;
        axoz axozVar4;
        axoz axozVar5;
        int i = 0;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                dvo dvoVar = (dvo) this.a;
                CookieManager cookieManagerA = dvoVar.a();
                cookieManagerA.removeAllCookies(null);
                cookieManagerA.flush();
                dvoVar.b().deleteAllData();
                return null;
            case 1:
                Object obj = this.a;
                aecj aecjVar = (aecj) obj;
                return tuk.g(aecjVar.b, aecjVar.c).g(avla.e).p().al(new acym(obj, 8), new acrr(11));
            case 2:
                ?? r12 = ((axlj) this.a).b;
                if (!((Optional) r12.io()).isPresent()) {
                    return null;
                }
                elq elqVar = (elq) ((Optional) r12.io()).get();
                if (dvy.e.d()) {
                    return elqVar.a.getAllProfileNames();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            case 3:
                taq.c();
                return tym.d(((aekz) this.a).g.getPackageManager());
            case 4:
                return Boolean.valueOf(((aeog) this.a).f());
            case 5:
                ?? r13 = this.a;
                int size = r13.size();
                while (i < size) {
                    aciz acizVar = (aciz) ahng.v((ListenableFuture) r13.get(i));
                    i++;
                    if (acizVar != null) {
                        return acizVar;
                    }
                }
                return null;
            case 6:
                return ((abhh) this.a).q();
            case 7:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ahng.v((ListenableFuture) it.next());
                }
                return null;
            case 8:
                Object obj2 = this.a;
                File file = (File) obj2;
                if (!file.exists()) {
                    return null;
                }
                agwu agwuVar = agyo.a;
                final ahha ahhaVar = new ahha(agwuVar, agwuVar);
                final agkz agkzVarN = agkz.n(new agqj(obj2));
                agqr it2 = agkzVarN.iterator();
                while (it2.hasNext()) {
                    ahhaVar.a.b(it2.next());
                }
                boolean zDelete = true;
                for (File file2 : new Iterable() { // from class: agwv
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        ahub ahubVar = new ahub(ahhaVar.b);
                        agqr it3 = agkzVarN.iterator();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        arrayDeque2.add(it3);
                        return new agww(ahubVar, arrayDeque2, arrayDeque);
                    }
                }) {
                    if (!file.equals(file2) && file2.exists()) {
                        file2.setWritable(true, true);
                        zDelete &= file2.delete();
                    }
                }
                if (zDelete && file.setWritable(false, false) && file.list().length == 0) {
                    return null;
                }
                file.setWritable(true, true);
                throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(obj2))));
            case 9:
                ?? r14 = this.a;
                syn synVar = afnp.m;
                if ((r14 instanceof Collection) && r14.isEmpty()) {
                    z = true;
                } else {
                    ListIterator listIterator = ((awoa) r14).listIterator(0);
                    while (listIterator.hasNext()) {
                        Object objV = ahng.v((ListenableFuture) listIterator.next());
                        objV.getClass();
                        if (!((Boolean) objV).booleanValue()) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return this.a.keySet();
            case 11:
                Object obj3 = this.a;
                synchronized (obj3) {
                    ahrg ahrgVar = (ahrg) ((ahqz) obj3).a.a();
                    List listA = ahrgVar.a();
                    ahrgVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        ahrh ahrhVar = (ahrh) listA.get(i2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", ahrhVar.a);
                        jSONObject.put("dates", new JSONArray((Collection) ahrhVar.b));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            base64OutputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                return string;
            case 12:
                Object obj4 = this.a;
                try {
                    synchronized (obj4) {
                        break;
                    }
                    ((atzd) obj4).c();
                    try {
                        HttpURLConnection httpURLConnection = ((atzd) obj4).a;
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        httpURLConnection.connect();
                        System.currentTimeMillis();
                        while (true) {
                            int i3 = 0;
                            while (true) {
                                if (((atzd) obj4).d()) {
                                    ((atzd) obj4).c();
                                    int i4 = 0;
                                    while (i4 < 65536 && ((atzd) obj4).d()) {
                                        try {
                                            atzb atzbVar = ((atzd) obj4).b;
                                            byte[] bArr = ((atzd) obj4).c;
                                            int iA = atzbVar.a(bArr, i4, 65536 - i4);
                                            ((atzd) obj4).d += (long) iA;
                                            i4 += iA;
                                            try {
                                                outputStream.write(bArr, i4 - iA, iA);
                                            } catch (IOException unused) {
                                                twpVarE = ((atzd) obj4).e();
                                                synchronized (obj4) {
                                                    try {
                                                        axozVar = new axoz(twpVarE);
                                                        return axozVar;
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                            }
                                        } catch (IOException e) {
                                            throw new atzm(atzl.REQUEST_BODY_READ_ERROR, null, e);
                                        }
                                    }
                                    i3 += i4;
                                    if (i3 >= ((atzd) obj4).e) {
                                        synchronized (obj4) {
                                            try {
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    twpVarE = ((atzd) obj4).e();
                                }
                                synchronized (obj4) {
                                    break;
                                }
                                axozVar = new axoz(twpVarE);
                                return axozVar;
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        throw new atzm(atzl.BAD_URL, null, e2);
                    } catch (IOException e3) {
                        try {
                            twpVarE = ((atzd) obj4).e();
                        } catch (atzm unused2) {
                            throw new atzm(atzl.CONNECTION_ERROR, null, e3);
                        }
                    }
                } catch (atzm e4) {
                    synchronized (obj4) {
                        axozVar = new axoz(e4);
                    }
                }
                break;
            case 13:
                Object obj5 = this.a;
                try {
                    synchronized (obj5) {
                        ((atzg) obj5).c();
                        Random random = new Random();
                        StringBuilder sb = new StringBuilder();
                        for (int i5 = 0; i5 < 70; i5++) {
                            sb.append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(36)));
                        }
                        String string2 = sb.toString();
                        atzc atzcVar = new atzc();
                        atzc atzcVar2 = new atzc();
                        atzc atzcVar3 = ((atzg) obj5).c;
                        for (String str : atzcVar3.c()) {
                            if (ahno.ae(str).startsWith("content-")) {
                                atzcVar.d(str, atzcVar3.a(str));
                            } else {
                                atzcVar2.d(str, atzcVar3.a(str));
                            }
                        }
                        atzf atzfVar = new atzf(string2, ((atzg) obj5).d, atzcVar, ((atzg) obj5).e, ((atzg) obj5).f);
                        atzcVar2.d("X-Goog-Upload-Protocol", "multipart");
                        atzcVar2.d("Content-Type", "multipart/related; boundary=".concat(string2));
                        atzk atzkVarA = atxy.a(((atzg) obj5).a, ((atzg) obj5).b, atzcVar2, atzfVar);
                        synchronized (obj5) {
                            ((atzg) obj5).h = atzkVarA;
                            listenableFutureA = atzkVarA.a();
                            break;
                        }
                        try {
                            axoz axozVar6 = (axoz) listenableFutureA.get();
                            if (axozVar6.d()) {
                                Object obj6 = axozVar6.b;
                                if (((atzm) obj6).a != atzl.CANCELED) {
                                    throw ((Throwable) obj6);
                                }
                                ((atzg) obj5).c();
                            }
                            axozVar3 = new axoz((twp) axozVar6.a);
                            axozVar2 = axozVar3;
                            synchronized (obj5) {
                            }
                        } catch (InterruptedException e5) {
                            e = e5;
                            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                        } catch (ExecutionException e6) {
                            e = e6;
                            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                        }
                        break;
                    }
                } catch (atzm e7) {
                    axozVar3 = new axoz(e7);
                } catch (Throwable th7) {
                    axozVar2 = new axoz(new atzm(atzl.UNKNOWN, null, th7));
                }
                return axozVar2;
            default:
                Object obj7 = this.a;
                try {
                    axozVar5 = new axoz(((atzi) obj7).a == null ? ((atzi) obj7).d() : ((atzi) obj7).c(true));
                    break;
                } catch (atzm e8) {
                    axozVar5 = new axoz(e8);
                } catch (Throwable th8) {
                    axozVar4 = new axoz(new atzm(atzl.UNKNOWN, null, th8));
                }
                axozVar4 = axozVar5;
                synchronized (obj7) {
                    break;
                }
                return axozVar4;
        }
    }
}
