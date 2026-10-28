package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class und {
    final Map a;
    private long b;
    private final Object c;

    public und(ere ereVar) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = ereVar;
    }

    public static int c(InputStream inputStream) {
        return o(inputStream) | (o(inputStream) << 8) | (o(inputStream) << 16) | (o(inputStream) << 24);
    }

    public static long d(InputStream inputStream) {
        return (((long) o(inputStream)) & 255) | ((((long) o(inputStream)) & 255) << 8) | ((((long) o(inputStream)) & 255) << 16) | ((((long) o(inputStream)) & 255) << 24) | ((((long) o(inputStream)) & 255) << 32) | ((((long) o(inputStream)) & 255) << 40) | ((((long) o(inputStream)) & 255) << 48) | ((((long) o(inputStream)) & 255) << 56);
    }

    public static String g(era eraVar) {
        return new String(m(eraVar, d(eraVar)), "UTF-8");
    }

    static void k(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void l(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        yno.J(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] m(era eraVar, long j) throws IOException {
        long jA = eraVar.a();
        if (j >= 0 && j <= jA) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(eraVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException(a.cr(jA, j, "streamToBytes length=", ", maxLength="));
    }

    private static int o(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void p(String str, eqz eqzVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            this.b += eqzVar.a - ((eqz) map.get(str)).a;
        } else {
            this.b += eqzVar.a;
        }
        map.put(str, eqzVar);
    }

    private final void q(String str) {
        eqz eqzVar = (eqz) this.a.remove(str);
        if (eqzVar != null) {
            this.b -= eqzVar.a;
        }
    }

    private static final String r(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final vfb a(Uri uri) {
        return (vfb) ((HashMap) this.a).get(uri);
    }

    public final vfb b(Uri uri, float f, boolean z, boolean z2, Duration duration) {
        HashMap map = (HashMap) this.a;
        if (!map.containsKey(uri)) {
            long j = this.b + 1;
            this.b = j;
            vfp vfpVar = (vfp) this.c;
            vet vetVar = vfpVar.c;
            map.put(uri, new vfb(vfpVar.b, Long.toString(j), uri, z2, vfpVar.e, f, z, vfpVar.d, vfpVar.f, duration));
        }
        return (vfb) map.get(uri);
    }

    public final synchronized epx e(String str) {
        eqz eqzVar = (eqz) this.a.get(str);
        if (eqzVar == null) {
            return null;
        }
        File fileF = f(str);
        try {
            era eraVar = new era(new BufferedInputStream(new FileInputStream(fileF)), fileF.length());
            try {
                String str2 = eqz.a(eraVar).b;
                if (!TextUtils.equals(str, str2)) {
                    eqw.a("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, str2);
                    q(str);
                    eraVar.close();
                    return null;
                }
                byte[] bArrM = m(eraVar, eraVar.a());
                epx epxVar = new epx();
                epxVar.a = bArrM;
                epxVar.b = eqzVar.c;
                epxVar.c = eqzVar.d;
                epxVar.d = eqzVar.e;
                epxVar.e = eqzVar.f;
                epxVar.f = eqzVar.g;
                List<eqc> list = eqzVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (eqc eqcVar : list) {
                    treeMap.put(eqcVar.a, eqcVar.b);
                }
                epxVar.g = treeMap;
                epxVar.h = DesugarCollections.unmodifiableList(list);
                eraVar.close();
                return epxVar;
            } catch (Throwable th) {
                eraVar.close();
                throw th;
            }
        } catch (IOException e) {
            eqw.a("%s: %s", fileF.getAbsolutePath(), e.toString());
            j(str);
            return null;
        }
    }

    public final File f(String str) {
        return new File(((ere) this.c).a(), r(str));
    }

    public final synchronized void h() {
        File fileA = ((ere) this.c).a();
        if (fileA.exists()) {
            File[] fileArrListFiles = fileA.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        era eraVar = new era(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            eqz eqzVarA = eqz.a(eraVar);
                            eqzVarA.a = length;
                            p(eqzVarA.b, eqzVarA);
                            eraVar.close();
                        } catch (Throwable th) {
                            eraVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileA.mkdirs()) {
            eqw.b("Unable to create cache dir %s", fileA.getAbsolutePath());
        }
    }

    public final synchronized void i(String str, epx epxVar) {
        File file;
        List list;
        long j;
        long j2 = this.b;
        int length = epxVar.a.length;
        if (j2 + ((long) length) <= 5242880 || length <= 4718592.0f) {
            File fileF = f(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileF));
                String str2 = epxVar.b;
                long j3 = epxVar.c;
                long j4 = epxVar.d;
                long j5 = epxVar.e;
                long j6 = epxVar.f;
                List list2 = epxVar.h;
                if (list2 == null) {
                    Map map = epxVar.g;
                    file = fileF;
                    try {
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            arrayList.add(new eqc((String) entry.getKey(), (String) entry.getValue()));
                            it = it;
                            j6 = j6;
                        }
                        list = arrayList;
                        j = j6;
                    } catch (IOException unused) {
                        if (!file.delete()) {
                            eqw.a("Could not clean up file %s", file.getAbsolutePath());
                        }
                        if (!((ere) this.c).a().exists()) {
                            eqw.a("Re-initializing cache after external clearing.", new Object[0]);
                            this.a.clear();
                            this.b = 0L;
                            h();
                            return;
                        }
                    }
                } else {
                    file = fileF;
                    list = list2;
                    j = j6;
                }
                eqz eqzVar = new eqz(str, str2, j3, j4, j5, j, list);
                try {
                    k(bufferedOutputStream, 538247942);
                    l(bufferedOutputStream, eqzVar.b);
                    String str3 = eqzVar.c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    l(bufferedOutputStream, str3);
                    yno.J(bufferedOutputStream, eqzVar.d);
                    yno.J(bufferedOutputStream, eqzVar.e);
                    yno.J(bufferedOutputStream, eqzVar.f);
                    yno.J(bufferedOutputStream, eqzVar.g);
                    List<eqc> list3 = eqzVar.h;
                    if (list3 != null) {
                        k(bufferedOutputStream, list3.size());
                        for (eqc eqcVar : list3) {
                            l(bufferedOutputStream, eqcVar.a);
                            l(bufferedOutputStream, eqcVar.b);
                        }
                    } else {
                        k(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(epxVar.a);
                    bufferedOutputStream.close();
                    eqzVar.a = file.length();
                    p(str, eqzVar);
                    if (this.b >= 5242880) {
                        String str4 = eqw.a;
                        SystemClock.elapsedRealtime();
                        Iterator it2 = this.a.entrySet().iterator();
                        while (it2.hasNext()) {
                            eqz eqzVar2 = (eqz) ((Map.Entry) it2.next()).getValue();
                            String str5 = eqzVar2.b;
                            if (f(str5).delete()) {
                                this.b -= eqzVar2.a;
                            } else {
                                eqw.a("Could not delete cache entry for key=%s, filename=%s", str5, r(str5));
                            }
                            it2.remove();
                            if (this.b < 4718592.0f) {
                                break;
                            }
                        }
                    }
                } catch (IOException e) {
                    eqw.a("%s", e.toString());
                    bufferedOutputStream.close();
                    eqw.a("Failed to write header for %s", file.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused2) {
                file = fileF;
            }
        }
    }

    public final synchronized void j(String str) {
        boolean zDelete = f(str).delete();
        q(str);
        if (!zDelete) {
            eqw.a("Could not delete cache entry for key=%s, filename=%s", str, r(str));
        }
    }

    public final synchronized void n(String str) {
        epx epxVarE = e(str);
        if (epxVarE != null) {
            epxVarE.f = 0L;
            epxVarE.e = 0L;
            i(str, epxVarE);
        }
    }

    public und(vfp vfpVar) {
        this.b = 0L;
        this.c = vfpVar;
        this.a = new HashMap();
    }
}
