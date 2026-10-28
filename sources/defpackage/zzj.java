package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zzj {
    static final Pattern a = Pattern.compile("(?:\\[|%5B)([a-zA-Z_:]+)(?:\\]|%5D)");
    public static final /* synthetic */ int b = 0;
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public zzj(zzi zziVar) {
        c(zziVar);
    }

    public static Set b(List list, Map map) {
        String strGroup;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                Matcher matcher = a.matcher(uri.toString());
                while (matcher.find()) {
                    if (matcher.groupCount() == 1 && (strGroup = matcher.group(1)) != null && f(map, strGroup, uri)) {
                        hashSet.add(strGroup);
                    }
                }
            }
        }
        return hashSet;
    }

    public static boolean f(Map map, String str, Uri uri) {
        if (map == null || !map.containsKey(str)) {
            return true;
        }
        Iterator it = ((List) map.get(str)).iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(uri.toString()).find()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public final Uri a(Uri uri, zzi... zziVarArr) throws tzn {
        Iterator it;
        uri.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = a.matcher(uri.toString());
        while (true) {
            String strA = null;
            if (!matcher.find()) {
                matcher.appendTail(stringBuffer);
                try {
                    return tyu.c(stringBuffer.toString());
                } catch (MalformedURLException e) {
                    throw new tzn(e, null);
                }
            }
            if (matcher.groupCount() == 1) {
                String strGroup = matcher.group(1);
                if (zziVarArr != null) {
                    int i = 0;
                    while (true) {
                        if (i < zziVarArr.length) {
                            zzi zziVar = zziVarArr[i];
                            if (zziVar == null || (strA = zziVar.a(uri, strGroup)) == null) {
                                i++;
                            }
                        } else {
                            it = this.c.values().iterator();
                            while (it.hasNext() && (strA = ((zzi) it.next()).a(uri, strGroup)) == null) {
                            }
                            if (strA == null) {
                                strA = (String) this.d.get(strGroup);
                            }
                        }
                    }
                } else {
                    it = this.c.values().iterator();
                    while (it.hasNext()) {
                    }
                    if (strA == null) {
                        strA = (String) this.d.get(strGroup);
                    }
                }
                if (strA != null) {
                    matcher.appendReplacement(stringBuffer, Uri.encode(strA));
                }
            }
        }
    }

    public final void c(zzi zziVar) {
        zziVar.getClass();
        this.c.put(zziVar.b(), zziVar);
    }

    public final void d(Map map) {
        this.d.putAll(map);
    }

    public final void e(zzi zziVar) {
        zziVar.getClass();
        Map map = this.c;
        if (map.get(zziVar.b()) == zziVar) {
            map.remove(zziVar.b());
        }
    }

    public zzj() {
    }
}
