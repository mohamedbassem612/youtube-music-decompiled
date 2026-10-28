package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehd {
    public static final Map a = new HashMap();
    private static final Set b = new HashSet();
    private static final byte[] c = {80, 75, 3, 4};
    private static final byte[] d = {31, -117, 8};

    public static ehs a(Context context, String str, String str2) {
        ehs ehsVarL;
        egy egyVarA = str2 == null ? null : ejx.a.a(str2);
        if (egyVarA != null) {
            return new ehs(egyVarA);
        }
        try {
            axin axinVar = new axin(AndroidInfo.b(context.getAssets().open(str)));
            if (q(axinVar, c).booleanValue()) {
                ehsVarL = m(context, new ZipInputStream(new axim(axinVar)), str2);
            } else {
                ehsVarL = q(axinVar, d).booleanValue() ? l(new GZIPInputStream(new axim(axinVar)), str2) : l(new axim(axinVar), str2);
            }
            return ehsVarL;
        } catch (IOException e) {
            return new ehs((Throwable) e);
        }
    }

    public static ehs b(String str, String str2) {
        axin axinVar = new axin(AndroidInfo.b(new ByteArrayInputStream(str.getBytes())));
        String[] strArr = emz.a;
        return o(new ena(axinVar), str2, true);
    }

    public static ehs c(Context context, int i, String str) {
        ehs ehsVar;
        egy egyVarA = str == null ? null : ejx.a.a(str);
        if (egyVarA != null) {
            return new ehs(egyVarA);
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            inputStreamOpenRawResource.getClass();
            axin axinVar = new axin(new axij(inputStreamOpenRawResource));
            if (q(axinVar, c).booleanValue()) {
                return m(context, new ZipInputStream(new axim(axinVar)), str);
            }
            if (!q(axinVar, d).booleanValue()) {
                axin axinVar2 = new axin(new axij(new axim(axinVar)));
                String[] strArr = emz.a;
                return o(new ena(axinVar2), str, true);
            }
            try {
                axin axinVar3 = new axin(new axij(new GZIPInputStream(new axim(axinVar))));
                String[] strArr2 = emz.a;
                return o(new ena(axinVar3), str, true);
            } catch (IOException e) {
                ehsVar = new ehs((Throwable) e);
                return ehsVar;
            }
        } catch (Resources.NotFoundException e2) {
            ehsVar = new ehs((Throwable) e2);
            return ehsVar;
        }
    }

    public static ehu d(Context context, String str, String str2) {
        return p(str2, new egz(context.getApplicationContext(), str, str2, 0), null);
    }

    public static ehu e(InputStream inputStream, String str) {
        return p(str, new uf(inputStream, str, 3, null), new px(inputStream, 11));
    }

    public static ehu f(String str, String str2) {
        return p(str2, new fzs(str, str2, 1), null);
    }

    public static ehu g(Context context, int i) {
        return h(context, i, k(context, i));
    }

    public static ehu h(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return p(str, new Callable() { // from class: ehb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map map = ehd.a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return ehd.c(context2, i, str);
            }
        }, null);
    }

    public static ehu i(Context context, String str) {
        return j(context, str, "url_".concat(String.valueOf(str)));
    }

    public static ehu j(final Context context, final String str, final String str2) {
        return p(str2, new Callable() { // from class: ehc
            /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Object obj;
                ehs ehsVar;
                ehs ehsVarM;
                elp elpVar;
                Object obj2;
                Pair pair;
                ehs ehsVarM2;
                elp elpVar2;
                elq elqVar;
                Map map = ehd.a;
                elr elrVar = qa.t;
                Context context2 = context;
                elo eloVar = null;
                String message = null;
                eloVar = null;
                if (elrVar == null) {
                    synchronized (elr.class) {
                        elrVar = qa.t;
                        if (elrVar == null) {
                            Context applicationContext = context2.getApplicationContext();
                            elq elqVar2 = qa.u;
                            if (elqVar2 == null) {
                                synchronized (elq.class) {
                                    try {
                                        elqVar = qa.u;
                                        if (elqVar == null) {
                                            elqVar = new elq(new qcb(applicationContext, null), (byte[]) null);
                                            qa.u = elqVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                elqVar2 = elqVar;
                            }
                            elrVar = new elr(elqVar2);
                            qa.t = elrVar;
                        }
                    }
                }
                String str3 = str2;
                String str4 = str;
                if (str3 != null) {
                    Object obj3 = elrVar.a;
                    try {
                        File file = new File(((elq) obj3).a(), elq.c(str4, elp.JSON, false));
                        if (!file.exists()) {
                            file = new File(((elq) obj3).a(), elq.c(str4, elp.ZIP, false));
                            if (!file.exists()) {
                                file = new File(((elq) obj3).a(), elq.c(str4, elp.GZIP, false));
                                if (!file.exists()) {
                                    file = null;
                                }
                            }
                        }
                        if (file != null) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                elpVar2 = elp.ZIP;
                            } else {
                                elpVar2 = file.getAbsolutePath().endsWith(".gz") ? elp.GZIP : elp.JSON;
                            }
                            file.getAbsolutePath();
                            ehp ehpVar = ene.a;
                            pair = new Pair(elpVar2, fileInputStream);
                        } else {
                            pair = null;
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair != null) {
                        elp elpVar3 = (elp) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        elp elpVar4 = elp.JSON;
                        int iOrdinal = elpVar3.ordinal();
                        if (iOrdinal == 1) {
                            ehsVarM2 = ehd.m(context2, new ZipInputStream(inputStream), str3);
                        } else if (iOrdinal != 2) {
                            ehsVarM2 = ehd.l(inputStream, str3);
                        } else {
                            try {
                                ehsVarM2 = ehd.l(new GZIPInputStream(inputStream), str3);
                            } catch (IOException e) {
                                ehsVarM2 = new ehs((Throwable) e);
                            }
                        }
                        obj = ehsVarM2.a;
                        if (obj == null) {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    ehsVar = new ehs(obj);
                } else {
                    ehp ehpVar2 = ene.a;
                    try {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.connect();
                            elo eloVar2 = new elo(httpURLConnection);
                            try {
                                try {
                                    if (eloVar2.a()) {
                                        HttpURLConnection httpURLConnection2 = eloVar2.a;
                                        InputStream inputStream2 = httpURLConnection2.getInputStream();
                                        String contentType = httpURLConnection2.getContentType();
                                        if (contentType == null) {
                                            contentType = "application/json";
                                        }
                                        if (contentType.contains("application/zip") || contentType.contains("application/x-zip") || contentType.contains("application/x-zip-compressed") || str4.split("\\?")[0].endsWith(".lottie")) {
                                            elp elpVar5 = elp.ZIP;
                                            ehsVarM = str3 != null ? ehd.m(context2, new ZipInputStream(new FileInputStream(((elq) elrVar.a).b(str4, inputStream2, elpVar5))), str4) : ehd.m(context2, new ZipInputStream(inputStream2), null);
                                            elpVar = elpVar5;
                                        } else if (contentType.contains("application/gzip") || contentType.contains("application/x-gzip") || str4.split("\\?")[0].endsWith(".tgs")) {
                                            elpVar = elp.GZIP;
                                            ehsVarM = str3 != null ? ehd.l(new GZIPInputStream(new FileInputStream(((elq) elrVar.a).b(str4, inputStream2, elpVar))), str4) : ehd.l(new GZIPInputStream(inputStream2), null);
                                        } else {
                                            elpVar = elp.JSON;
                                            ehsVarM = str3 != null ? ehd.l(new FileInputStream(((elq) elrVar.a).b(str4, inputStream2, elpVar).getAbsolutePath()), str4) : ehd.l(inputStream2, null);
                                        }
                                        if (str3 != null && ehsVarM.a != null) {
                                            File file2 = new File(((elq) elrVar.a).a(), elq.c(str4, elpVar, true));
                                            File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
                                            boolean zRenameTo = file2.renameTo(file3);
                                            file3.toString();
                                            if (!zRenameTo) {
                                                ene.a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + '.');
                                            }
                                        }
                                        Object obj4 = ehsVarM.a;
                                        try {
                                            eloVar2.close();
                                        } catch (IOException e2) {
                                            ene.b("LottieFetchResult close failed ", e2);
                                        }
                                        ehsVar = ehsVarM;
                                    } else {
                                        try {
                                            if (!eloVar2.a()) {
                                                HttpURLConnection httpURLConnection3 = eloVar2.a;
                                                String strValueOf = String.valueOf(httpURLConnection3.getURL());
                                                int responseCode = httpURLConnection3.getResponseCode();
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection3.getErrorStream()));
                                                StringBuilder sb = new StringBuilder();
                                                while (true) {
                                                    try {
                                                        String line = bufferedReader.readLine();
                                                        if (line != null) {
                                                            sb.append(line);
                                                            sb.append('\n');
                                                        } else {
                                                            try {
                                                                break;
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            bufferedReader.close();
                                                        } catch (Exception unused3) {
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                bufferedReader.close();
                                                message = "Unable to fetch " + strValueOf + ". Failed with " + responseCode + '\n' + sb.toString();
                                            }
                                        } catch (IOException e3) {
                                            ene.b("get error failed ", e3);
                                            message = e3.getMessage();
                                        }
                                        ehsVar = new ehs((Throwable) new IllegalArgumentException(message));
                                        try {
                                            eloVar2.close();
                                        } catch (IOException e4) {
                                            ene.b("LottieFetchResult close failed ", e4);
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    eloVar = eloVar2;
                                    ehs ehsVar2 = new ehs((Throwable) e);
                                    if (eloVar != null) {
                                        try {
                                            eloVar.close();
                                        } catch (IOException e6) {
                                            ene.b("LottieFetchResult close failed ", e6);
                                        }
                                    }
                                    ehsVar = ehsVar2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                eloVar = eloVar2;
                                if (eloVar != null) {
                                    try {
                                        eloVar.close();
                                    } catch (IOException e7) {
                                        ene.b("LottieFetchResult close failed ", e7);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                if (str3 != null && (obj2 = ehsVar.a) != null) {
                    ejx.a.b(str3, (egy) obj2);
                }
                return ehsVar;
            }
        }, null);
    }

    public static String k(Context context, int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(i2 != 32 ? "_day_" : "_night_");
        sb.append(i);
        return sb.toString();
    }

    public static ehs l(InputStream inputStream, String str) {
        inputStream.getClass();
        axin axinVar = new axin(new axij(inputStream));
        String[] strArr = emz.a;
        return o(new ena(axinVar), str, true);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026d A[Catch: all -> 0x0287, TryCatch #3 {all -> 0x0287, blocks: (B:2:0x0000, B:8:0x0017, B:9:0x001e, B:12:0x0026, B:14:0x0032, B:58:0x012e, B:15:0x0037, B:17:0x0043, B:18:0x0048, B:20:0x0054, B:21:0x006c, B:24:0x0077, B:26:0x007f, B:28:0x0087, B:30:0x008f, B:32:0x0097, B:34:0x009f, B:35:0x00a4, B:53:0x00f4, B:55:0x00fe, B:56:0x011b, B:52:0x00e7, B:57:0x011f, B:61:0x0136, B:62:0x0144, B:63:0x014c, B:65:0x0152, B:66:0x016d, B:68:0x0173, B:73:0x0185, B:74:0x0196, B:75:0x019e, B:77:0x01a5, B:78:0x01b9, B:80:0x01bf, B:82:0x01d3, B:84:0x01df, B:85:0x01ff, B:87:0x0205, B:88:0x0214, B:90:0x021a, B:92:0x0228, B:94:0x023d, B:97:0x0247, B:98:0x0254, B:100:0x0265, B:102:0x026d, B:103:0x0275, B:6:0x000f, B:105:0x027c), top: B:117:0x0000, inners: #1, #5 }] */
    public static ehs m(Context context, ZipInputStream zipInputStream, String str) {
        egy egyVarA;
        ehn ehnVar;
        try {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            ehs ehsVar = null;
            if (str == null) {
                egyVarA = null;
            } else {
                try {
                    egyVarA = ejx.a.a(str);
                } catch (IOException e) {
                    ehsVar = new ehs((Throwable) e);
                }
            }
            if (egyVarA != null) {
                ehsVar = new ehs(egyVarA);
            } else {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                Object obj = null;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.contains("__MACOSX")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        zipInputStream.closeEntry();
                    } else if (nextEntry.getName().contains(".json")) {
                        axin axinVar = new axin(AndroidInfo.b(zipInputStream));
                        String[] strArr = emz.a;
                        obj = o(new ena(axinVar), null, false).a;
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    } else if (name.contains(".ttf") || name.contains(".otf")) {
                        String[] strArrSplit2 = name.split("/");
                        String str2 = strArrSplit2[strArrSplit2.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[SemanticState.Obscured];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                                if (!file.delete()) {
                                    ene.a("Failed to delete temp font file " + file.getAbsolutePath() + '.');
                                }
                                map2.put(str3, typefaceCreateFromFile);
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            ene.b(a.ct(str2, str3, "Unable to save font ", " to the temporary file: ", ". "), th3);
                        }
                    } else {
                        zipInputStream.closeEntry();
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                if (obj == null) {
                    ehsVar = new ehs((Throwable) new IllegalArgumentException("Unable to parse composition"));
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Iterator it = ((egy) obj).d().values().iterator();
                        do {
                            if (!it.hasNext()) {
                                ehnVar = null;
                                break;
                            }
                            ehnVar = (ehn) it.next();
                        } while (!ehnVar.d.equals(str4));
                        if (ehnVar != null) {
                            ehnVar.f = enm.c((Bitmap) entry.getValue(), ehnVar.a, ehnVar.b);
                        }
                    }
                    for (Map.Entry entry2 : map2.entrySet()) {
                        boolean z = false;
                        for (ejt ejtVar : ((egy) obj).d.values()) {
                            if (((String) ejtVar.a).equals(entry2.getKey())) {
                                ejtVar.d = (Typeface) entry2.getValue();
                                z = true;
                            }
                        }
                        if (!z) {
                            ene.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                        }
                    }
                    if (map.isEmpty()) {
                        Iterator it2 = ((egy) obj).d().entrySet().iterator();
                        while (it2.hasNext()) {
                            ehn ehnVar2 = (ehn) ((Map.Entry) it2.next()).getValue();
                            if (ehnVar2 != null) {
                                String str5 = ehnVar2.d;
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                                    try {
                                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                                        ehnVar2.f = enm.c(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), ehnVar2.a, ehnVar2.b);
                                    } catch (IllegalArgumentException e2) {
                                        ene.b("data URL did not have correct base64 format.", e2);
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            ejx.a.b(str, (egy) obj);
                        }
                        ehsVar = new ehs(obj);
                    } else {
                        if (str != null) {
                            ejx.a.b(str, (egy) obj);
                        }
                        ehsVar = new ehs(obj);
                    }
                }
            }
            ThreadLocal threadLocal = enm.a;
            hmy.f(zipInputStream);
            return ehsVar;
        } catch (Throwable th4) {
            ThreadLocal threadLocal2 = enm.a;
            hmy.f(zipInputStream);
            throw th4;
        }
    }

    public static void n() {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ehv) arrayList.get(i)).a();
        }
    }

    private static ehs o(emz emzVar, String str, boolean z) {
        ehs ehsVar;
        egy egyVarA;
        float f;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        float f2;
        try {
            try {
                if (str == null) {
                    egyVarA = null;
                } else {
                    try {
                        egyVarA = ejx.a.a(str);
                    } catch (Exception e) {
                        ehsVar = new ehs((Throwable) e);
                    }
                }
                if (egyVarA != null) {
                    ehsVar = new ehs(egyVarA);
                } else {
                    boy boyVar = emk.a;
                    ThreadLocal threadLocal = enm.a;
                    float f3 = Resources.getSystem().getDisplayMetrics().density;
                    agk agkVar = new agk(10);
                    ArrayList arrayList3 = new ArrayList();
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    ahb ahbVar = new ahb(10);
                    egy egyVar = new egy();
                    emzVar.h();
                    int iB = 0;
                    int iB2 = 0;
                    float fA = 0.0f;
                    float fA2 = 0.0f;
                    float fA3 = 0.0f;
                    while (emzVar.n()) {
                        int i4 = 4;
                        switch (emzVar.q(emk.a)) {
                            case 0:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                iB2 = emzVar.b();
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 1:
                                iB = emzVar.b();
                                arrayList3 = arrayList3;
                                f3 = f3;
                                break;
                            case 2:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                fA = (float) emzVar.a();
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 3:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                fA2 = ((float) emzVar.a()) - 0.01f;
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 4:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                fA3 = (float) emzVar.a();
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 5:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                String[] strArrSplit = emzVar.f().split("\\.");
                                int i5 = Integer.parseInt(strArrSplit[0]);
                                int i6 = Integer.parseInt(strArrSplit[1]);
                                int i7 = Integer.parseInt(strArrSplit[2]);
                                if (i5 < 4 || (i5 <= 4 && (i6 < 4 || (i6 <= 4 && i7 < 0)))) {
                                    egyVar.e("Lottie only supports bodymovin >= 4.4.0");
                                }
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 6:
                                f = f3;
                                ArrayList arrayList5 = arrayList3;
                                i = iB;
                                emzVar.g();
                                int i8 = 0;
                                while (emzVar.n()) {
                                    elh elhVarA = emj.a(emzVar, egyVar);
                                    if (elhVarA.t == 3) {
                                        i8++;
                                    }
                                    ArrayList arrayList6 = arrayList5;
                                    arrayList6.add(elhVarA);
                                    agkVar.i(elhVarA.d, elhVarA);
                                    if (i8 > 4) {
                                        ((end) ene.a).a("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.", null);
                                    }
                                    arrayList5 = arrayList6;
                                }
                                arrayList = arrayList5;
                                emzVar.i();
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 7:
                                f = f3;
                                i = iB;
                                emzVar.g();
                                while (emzVar.n()) {
                                    ArrayList arrayList7 = new ArrayList();
                                    agk agkVar2 = new agk(10);
                                    emzVar.h();
                                    int iB3 = 0;
                                    int iB4 = 0;
                                    String strF = null;
                                    String strF2 = null;
                                    String strF3 = null;
                                    while (emzVar.n()) {
                                        int iQ = emzVar.q(emk.b);
                                        if (iQ == 0) {
                                            arrayList2 = arrayList3;
                                            strF = emzVar.f();
                                        } else if (iQ == 1) {
                                            emzVar.g();
                                            while (emzVar.n()) {
                                                elh elhVarA2 = emj.a(emzVar, egyVar);
                                                agkVar2.i(elhVarA2.d, elhVarA2);
                                                arrayList7.add(elhVarA2);
                                                arrayList3 = arrayList3;
                                            }
                                            arrayList2 = arrayList3;
                                            emzVar.i();
                                        } else if (iQ == 2) {
                                            iB3 = emzVar.b();
                                        } else if (iQ == 3) {
                                            iB4 = emzVar.b();
                                        } else if (iQ == i4) {
                                            strF2 = emzVar.f();
                                        } else if (iQ != 5) {
                                            emzVar.l();
                                            emzVar.m();
                                            arrayList2 = arrayList3;
                                        } else {
                                            strF3 = emzVar.f();
                                        }
                                        arrayList3 = arrayList2;
                                        i4 = 4;
                                    }
                                    ArrayList arrayList8 = arrayList3;
                                    emzVar.j();
                                    if (strF2 != null) {
                                        ehn ehnVar = new ehn(iB3, iB4, strF, strF2, strF3);
                                        map2.put(ehnVar.c, ehnVar);
                                    } else {
                                        map.put(strF, arrayList7);
                                    }
                                    arrayList3 = arrayList8;
                                    i4 = 4;
                                }
                                emzVar.i();
                                arrayList = arrayList3;
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 8:
                                f = f3;
                                int i9 = iB;
                                emzVar.h();
                                while (emzVar.n()) {
                                    if (emzVar.q(emk.c) != 0) {
                                        emzVar.l();
                                        emzVar.m();
                                    } else {
                                        emzVar.g();
                                        while (emzVar.n()) {
                                            boy boyVar2 = emc.a;
                                            emzVar.h();
                                            String strF4 = null;
                                            String strF5 = null;
                                            String strF6 = null;
                                            while (emzVar.n()) {
                                                int iQ2 = emzVar.q(emc.a);
                                                if (iQ2 != 0) {
                                                    i2 = i9;
                                                    if (iQ2 == 1) {
                                                        strF5 = emzVar.f();
                                                    } else if (iQ2 == 2) {
                                                        strF6 = emzVar.f();
                                                    } else if (iQ2 != 3) {
                                                        emzVar.l();
                                                        emzVar.m();
                                                    } else {
                                                        emzVar.a();
                                                    }
                                                } else {
                                                    i2 = i9;
                                                    strF4 = emzVar.f();
                                                }
                                                i9 = i2;
                                            }
                                            int i10 = i9;
                                            emzVar.j();
                                            ejt ejtVar = new ejt(strF4, strF5, strF6);
                                            map3.put(ejtVar.b, ejtVar);
                                            i9 = i10;
                                        }
                                        emzVar.i();
                                        i9 = i9;
                                    }
                                }
                                i = i9;
                                emzVar.j();
                                arrayList = arrayList3;
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 9:
                                f = f3;
                                i3 = iB;
                                emzVar.g();
                                while (emzVar.n()) {
                                    boy boyVar3 = emb.a;
                                    ArrayList arrayList9 = new ArrayList();
                                    emzVar.h();
                                    double dA = 0.0d;
                                    char cCharAt = 0;
                                    String strF7 = null;
                                    String strF8 = null;
                                    while (emzVar.n()) {
                                        int iQ3 = emzVar.q(emb.a);
                                        if (iQ3 == 0) {
                                            cCharAt = emzVar.f().charAt(0);
                                        } else if (iQ3 == 1) {
                                            emzVar.a();
                                        } else if (iQ3 == 2) {
                                            dA = emzVar.a();
                                        } else if (iQ3 == 3) {
                                            strF7 = emzVar.f();
                                        } else if (iQ3 == 4) {
                                            strF8 = emzVar.f();
                                        } else if (iQ3 != 5) {
                                            emzVar.l();
                                            emzVar.m();
                                        } else {
                                            emzVar.h();
                                            while (emzVar.n()) {
                                                if (emzVar.q(emb.b) != 0) {
                                                    emzVar.l();
                                                    emzVar.m();
                                                } else {
                                                    emzVar.g();
                                                    while (emzVar.n()) {
                                                        arrayList9.add((ekz) elx.a(emzVar, egyVar));
                                                    }
                                                    emzVar.i();
                                                }
                                            }
                                            emzVar.j();
                                        }
                                    }
                                    emzVar.j();
                                    eju ejuVar = new eju(arrayList9, cCharAt, dA, strF7, strF8);
                                    ahbVar.f(ejuVar.hashCode(), ejuVar);
                                }
                                emzVar.i();
                                i = i3;
                                arrayList = arrayList3;
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            case 10:
                                emzVar.g();
                                while (emzVar.n()) {
                                    emzVar.h();
                                    String strF9 = null;
                                    float fA4 = 0.0f;
                                    while (emzVar.n()) {
                                        int iQ4 = emzVar.q(emk.d);
                                        if (iQ4 != 0) {
                                            f2 = f3;
                                            if (iQ4 == 1) {
                                                fA4 = (float) emzVar.a();
                                            } else if (iQ4 != 2) {
                                                emzVar.l();
                                                emzVar.m();
                                            } else {
                                                emzVar.a();
                                            }
                                            f3 = f2;
                                        } else {
                                            f2 = f3;
                                            strF9 = emzVar.f();
                                        }
                                        iB = iB;
                                        f3 = f2;
                                    }
                                    emzVar.j();
                                    arrayList4.add(new qjb(strF9, fA4));
                                    iB = iB;
                                    f3 = f3;
                                }
                                f = f3;
                                i3 = iB;
                                emzVar.i();
                                i = i3;
                                arrayList = arrayList3;
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                            default:
                                f = f3;
                                arrayList = arrayList3;
                                i = iB;
                                emzVar.l();
                                emzVar.m();
                                arrayList3 = arrayList;
                                f3 = f;
                                iB = i;
                                break;
                        }
                    }
                    float f4 = f3;
                    ArrayList arrayList10 = arrayList3;
                    Rect rect = new Rect(0, 0, (int) (iB2 * f4), (int) (iB * f4));
                    float f5 = Resources.getSystem().getDisplayMetrics().density;
                    egyVar.i = rect;
                    egyVar.j = fA;
                    egyVar.k = fA2;
                    egyVar.l = fA3;
                    egyVar.h = arrayList10;
                    egyVar.g = agkVar;
                    egyVar.a = map;
                    egyVar.b = map2;
                    egyVar.c = f5;
                    egyVar.f = ahbVar;
                    egyVar.d = map3;
                    egyVar.e = arrayList4;
                    if (str != null) {
                        ejx.a.b(str, egyVar);
                    }
                    ehsVar = new ehs(egyVar);
                }
                if (z) {
                    ThreadLocal threadLocal2 = enm.a;
                    try {
                        emzVar.close();
                    } catch (Exception unused) {
                    }
                }
                return ehsVar;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            if (z) {
                ThreadLocal threadLocal3 = enm.a;
                try {
                    emzVar.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private static ehu p(final String str, Callable callable, Runnable runnable) {
        egy egyVarA = str == null ? null : ejx.a.a(str);
        ehu ehuVar = egyVarA != null ? new ehu(egyVarA) : null;
        if (str != null) {
            Map map = a;
            if (map.containsKey(str)) {
                ehuVar = (ehu) map.get(str);
            }
        }
        if (ehuVar == null) {
            final int i = 0;
            ehuVar = new ehu(callable, false);
            if (str != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final int i2 = 1;
                ehuVar.d(new eho() { // from class: eha
                    @Override // defpackage.eho
                    public final void a(Object obj) {
                        if (i2 != 0) {
                            Map map2 = ehd.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                ehd.n();
                                return;
                            }
                            return;
                        }
                        Map map3 = ehd.a;
                        map3.remove(str);
                        atomicBoolean.set(true);
                        if (map3.size() == 0) {
                            ehd.n();
                        }
                    }
                });
                ehuVar.c(new eho() { // from class: eha
                    @Override // defpackage.eho
                    public final void a(Object obj) {
                        if (i != 0) {
                            Map map2 = ehd.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                ehd.n();
                                return;
                            }
                            return;
                        }
                        Map map3 = ehd.a;
                        map3.remove(str);
                        atomicBoolean.set(true);
                        if (map3.size() == 0) {
                            ehd.n();
                        }
                    }
                });
                if (!atomicBoolean.get()) {
                    Map map2 = a;
                    map2.put(str, ehuVar);
                    if (map2.size() == 1) {
                        n();
                    }
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
        return ehuVar;
    }

    private static Boolean q(axih axihVar, byte[] bArr) {
        try {
            axin axinVar = new axin(new axil(axihVar));
            for (byte b2 : bArr) {
                if (!axinVar.l(1L)) {
                    throw new EOFException();
                }
                if (axinVar.b.b() != b2) {
                    return Boolean.FALSE;
                }
            }
            axinVar.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            ehp ehpVar = ene.a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }
}
