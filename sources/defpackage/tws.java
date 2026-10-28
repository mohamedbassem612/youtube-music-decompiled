package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tws {
    public final ContentResolver a;
    private final String b;
    private volatile boolean c;

    public tws(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        this.a = contentResolver;
        int i = typ.a;
        this.b = "youtube:music:";
    }

    public final int a(String str, int i) {
        d(str);
        return lsx.a(this.a, b(str), i);
    }

    public final String b(String str) {
        return this.b.concat(str);
    }

    public final void c() {
        String[] strArr;
        try {
            ContentResolver contentResolver = this.a;
            String[] strArr2 = {this.b};
            lsz lszVar = lsx.a;
            ((ltd) lszVar).g.lock();
            try {
                ((ltd) lszVar).f(contentResolver);
                if (((ltd) lszVar).l.length == 0) {
                    ((ltd) lszVar).l = (String[]) Arrays.copyOf(strArr2, 1);
                    strArr = ((ltd) lszVar).l;
                } else {
                    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                    Collections.addAll(linkedHashSet, ((ltd) lszVar).l);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    String str = strArr2[0];
                    if (linkedHashSet.add(str)) {
                        linkedHashSet2.add(str);
                    }
                    if (linkedHashSet2.isEmpty()) {
                        strArr = ltd.a;
                    } else {
                        ArrayList arrayList = new ArrayList(linkedHashSet);
                        Collections.sort(arrayList);
                        HashMap map = new HashMap();
                        int size = arrayList.size();
                        String str2 = null;
                        for (int i = 0; i < size; i++) {
                            String str3 = (String) arrayList.get(i);
                            if (str2 == null || !str3.startsWith(str2)) {
                                str2 = str3;
                            } else {
                                map.put(str3, str2);
                                linkedHashSet2.remove(str3);
                            }
                        }
                        if (linkedHashSet2.isEmpty()) {
                            strArr = ltd.a;
                        } else {
                            if (!map.isEmpty()) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                for (String str4 : linkedHashSet) {
                                    String str5 = (String) map.get(str4);
                                    if (str5 != null) {
                                        linkedHashSet3.add(str5);
                                    } else {
                                        linkedHashSet3.add(str4);
                                    }
                                }
                                linkedHashSet = linkedHashSet3;
                            }
                            String[] strArr3 = ltd.a;
                            ((ltd) lszVar).l = (String[]) linkedHashSet.toArray(strArr3);
                            strArr = (String[]) linkedHashSet2.toArray(strArr3);
                        }
                    }
                }
                if (!((ltd) lszVar).k) {
                    ((ltd) lszVar).e(contentResolver, ((ltd) lszVar).l);
                } else if (strArr.length != 0) {
                    ((ltd) lszVar).k = false;
                    ((ltd) lszVar).e(contentResolver, strArr);
                }
                ((ltd) lszVar).g.unlock();
                ContentResolver contentResolver2 = this.a;
                lsz lszVar2 = lsx.a;
                lszVar2.c(contentResolver2, 0L);
                lszVar2.b(contentResolver2, "http_stats", false);
                this.c = true;
            } catch (Throwable th) {
                ((ltd) lszVar).g.unlock();
                throw th;
            }
        } catch (NoSuchMethodError e) {
            e = e;
            twu.d(twu.a, 6, "[GservicesConfigHelper][preloadGservicesCacheBlocking] ".concat(e.toString()), null);
        } catch (NullPointerException e2) {
            e = e2;
            twu.d(twu.a, 6, "[GservicesConfigHelper][preloadGservicesCacheBlocking] ".concat(e.toString()), null);
        } catch (SecurityException e3) {
            e = e3;
            twu.d(twu.a, 6, "[GservicesConfigHelper][preloadGservicesCacheBlocking] ".concat(e.toString()), null);
        } catch (RuntimeException e4) {
            twu.d(twu.a, 6, "[GservicesConfigHelper][preloadGservicesCacheBlocking] ".concat(e4.toString()), null);
        }
    }

    public final void d(String str) {
        if (this.c) {
            return;
        }
        twu.d(twu.a, 5, a.bT(str, "Fetching the Gservices key '", "' before the end of the bulk initialization"), null);
    }
}
