package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends fdr {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new h();
    public static final y a = new y();

    private y() {
    }

    public final x a(String str) {
        boolean zContainsKey;
        v vVarA;
        x xVar;
        Object[][] objArr;
        Map map = this.e;
        synchronized (map) {
            zContainsKey = map.containsKey(str);
            vVarA = null;
            xVar = zContainsKey ? (x) map.get(str) : null;
        }
        if (!zContainsKey) {
            try {
                Object[][] objArr2 = (Object[][]) d.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        objArr = null;
                        break;
                    }
                    Object[] objArr3 = objArr2[i];
                    if (str.equals(objArr3[0])) {
                        objArr = (Object[][]) objArr3[1];
                        break;
                    }
                    i++;
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr4 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr4[0]);
                    sb.append(": ");
                    sb.append((String) objArr4[1]);
                }
                String string = sb.toString();
                x xVar2 = x.a;
                String strTrim = string.trim();
                if (strTrim.length() == 0) {
                    xVar = x.a;
                } else {
                    w wVar = new w();
                    if (strTrim.endsWith(";")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    for (String str2 : x.g.split(strTrim)) {
                        v vVarA2 = x.a(str2.trim());
                        wVar.a |= (vVarA2.c == null && vVarA2.d == null) ? false : true;
                        wVar.a(vVarA2);
                    }
                    List list = wVar.b;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) it.next();
                        if ("other".equals(vVar.a)) {
                            it.remove();
                            vVarA = vVar;
                        }
                    }
                    if (vVarA == null) {
                        vVarA = x.a("other:");
                    }
                    list.add(vVarA);
                    xVar = new x(wVar);
                }
            } catch (ParseException | MissingResourceException unused) {
            }
            Map map2 = this.e;
            synchronized (map2) {
                if (map2.containsKey(str)) {
                    xVar = (x) map2.get(str);
                } else {
                    map2.put(str, xVar);
                }
            }
        }
        return xVar;
    }

    public final void b() {
        Map map;
        Map treeMap;
        Map treeMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                treeMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    treeMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                treeMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    treeMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                treeMap = Collections.EMPTY_MAP;
                treeMap2 = Collections.EMPTY_MAP;
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = treeMap;
                    this.c = treeMap2;
                }
            }
        }
    }
}
