package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyl implements ett {
    public URL b;
    private final eym c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public eyl(String str) {
        eym eymVar = eym.a;
        this.d = null;
        gzj.bK(str);
        this.e = str;
        if (eymVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.c = eymVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        URL url = this.d;
        if (url != null) {
            return url.toString();
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f)) {
            String string = this.e;
            if (TextUtils.isEmpty(string)) {
                URL url = this.d;
                if (url == null) {
                    throw new NullPointerException("Argument must not be null");
                }
                string = url.toString();
            }
            this.f = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f;
    }

    public final Map d() {
        eym eymVar = this.c;
        eyp eypVar = (eyp) eymVar;
        if (eypVar.c == null) {
            synchronized (eymVar) {
                if (((eyp) eymVar).c == null) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : ((eyp) eymVar).b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((eyo) list.get(i)).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String string = sb.toString();
                        if (!TextUtils.isEmpty(string)) {
                            map.put((String) entry.getKey(), string);
                        }
                    }
                    ((eyp) eymVar).c = DesugarCollections.unmodifiableMap(map);
                }
            }
        }
        return eypVar.c;
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof eyl)) {
            return false;
        }
        eyl eylVar = (eyl) obj;
        return b().equals(eylVar.b()) && this.c.equals(eylVar.c);
    }

    @Override // defpackage.ett
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.c.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public eyl(URL url) {
        eym eymVar = eym.a;
        gzj.bM(url);
        this.d = url;
        this.e = null;
        gzj.bM(eymVar);
        this.c = eymVar;
    }
}
