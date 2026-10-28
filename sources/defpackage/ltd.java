package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltd implements lsz {
    public static final String[] a = new String[0];
    static final Boolean b = new Boolean(false);
    static final Integer c;
    static final Long d;
    static final String e;
    public final ReentrantReadWriteLock.ReadLock f;
    public final ReentrantReadWriteLock.WriteLock g;
    public volatile byte h;
    public final ConcurrentMap i;
    public Object j;
    public boolean k;
    public String[] l;
    private final ReentrantReadWriteLock m;
    private final ConcurrentMap n;
    private final ConcurrentMap o;
    private final ConcurrentMap p;
    private final ConcurrentMap q;

    static {
        new Float(Float.NaN);
        c = new Integer(-1);
        d = new Long(-1L);
        e = new String("");
    }

    public ltd() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.m = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.h = (byte) 0;
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap(5);
        this.i = new ConcurrentHashMap(5);
        this.p = new ConcurrentHashMap(5);
        this.q = new ConcurrentHashMap(5);
        this.j = null;
        this.k = false;
        this.l = a;
    }

    private static String i(String str, String str2) {
        return str == e ? str2 : str;
    }

    private final void j() {
        ReentrantReadWriteLock.WriteLock writeLock = this.g;
        writeLock.lock();
        try {
            if (this.h == 2) {
                writeLock.unlock();
                return;
            }
            this.n.clear();
            this.o.clear();
            this.i.clear();
            this.p.clear();
            this.q.clear();
            this.j = new Object();
            this.k = false;
            this.h = (byte) 2;
            this.g.unlock();
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.lsz
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        h(contentResolver);
        f(contentResolver);
        ReentrantReadWriteLock.ReadLock readLock = this.f;
        readLock.lock();
        try {
            Object obj = this.j;
            String str3 = (String) this.n.get(str);
            if (str3 != null) {
                String strI = i(str3, str2);
                readLock.unlock();
                return strI;
            }
            for (String str4 : this.l) {
                if (str.startsWith(str4)) {
                    if (!this.k) {
                        readLock.unlock();
                        this.g.lock();
                        try {
                            if (!this.k) {
                                e(contentResolver, this.l);
                            }
                            this.f.lock();
                            this.g.unlock();
                            String str5 = (String) this.n.get(str);
                            if (str5 != null) {
                                str2 = i(str5, str2);
                            }
                        } catch (Throwable th) {
                            this.f.lock();
                            this.g.unlock();
                            throw th;
                        }
                    }
                    this.f.unlock();
                    return str2;
                }
            }
            this.f.unlock();
            try {
                Uri uri = lsy.a;
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new ltc("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new ltc("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(str2)) {
                                string = str2;
                            }
                            this.f.lock();
                            try {
                                if (obj == this.j) {
                                    this.n.put(str, string == null ? e : string);
                                }
                                this.f.unlock();
                                return string != null ? string : str2;
                            } catch (Throwable th2) {
                                this.f.unlock();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            if (cursorQuery == null) {
                                throw th3;
                            }
                            try {
                                cursorQuery.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new ltc(e2);
                    }
                } catch (Throwable th5) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th5;
                }
            } catch (ltc unused) {
                return str2;
            }
        } catch (Throwable th6) {
            this.f.unlock();
            throw th6;
        }
    }

    @Override // defpackage.lsz
    public final boolean b(ContentResolver contentResolver, String str, boolean z) {
        h(contentResolver);
        f(contentResolver);
        this.f.lock();
        try {
            Object obj = this.j;
            Map map = this.o;
            Object objValueOf = Boolean.valueOf(z);
            Object obj2 = b;
            Boolean bool = (Boolean) d(map, str, objValueOf, obj2);
            this.f.unlock();
            if (bool != null) {
                return bool.booleanValue();
            }
            String strA = a(contentResolver, str, null);
            if (strA != null && !strA.isEmpty()) {
                if (lsy.c.matcher(strA).matches()) {
                    bool = Boolean.TRUE;
                    z = true;
                } else if (lsy.d.matcher(strA).matches()) {
                    bool = Boolean.FALSE;
                    z = false;
                } else {
                    Log.w("Gservices", a.ct(strA, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
                }
            }
            g(obj, this.o, str, bool, obj2);
            return z;
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    @Override // defpackage.lsz
    public final long c(ContentResolver contentResolver, long j) {
        h(contentResolver);
        f(contentResolver);
        this.f.lock();
        try {
            Object obj = this.j;
            Long lValueOf = (Long) d(this.p, "android_id", Long.valueOf(j), d);
            this.f.unlock();
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            String strA = a(contentResolver, "android_id", null);
            if (strA != null) {
                try {
                    long j2 = Long.parseLong(strA);
                    lValueOf = Long.valueOf(j2);
                    j = j2;
                } catch (NumberFormatException unused) {
                }
            }
            g(obj, this.p, "android_id", lValueOf, d);
            return j;
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    public final Object d(Map map, String str, Object obj, Object obj2) {
        Object obj3 = map.get(str);
        return obj3 != obj2 ? obj3 : obj;
    }

    public final void e(ContentResolver contentResolver, String[] strArr) {
        try {
            Uri uri = lsy.b;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new ltc("Unable to acquire ContentProviderClient");
            }
            try {
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (cursorQuery == null) {
                            throw new ltc("ContentProvider query returned null cursor");
                        }
                        HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                        while (cursorQuery.moveToNext()) {
                            map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                        }
                        if (!cursorQuery.isAfterLast()) {
                            throw new ltc("Cursor read incomplete (ContentProvider dead?)");
                        }
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        if (!map.isEmpty()) {
                            Set setKeySet = map.keySet();
                            ConcurrentMap concurrentMap = this.o;
                            if (!concurrentMap.isEmpty()) {
                                setKeySet.removeAll(concurrentMap.keySet());
                            }
                            ConcurrentMap concurrentMap2 = this.i;
                            if (!concurrentMap2.isEmpty()) {
                                setKeySet.removeAll(concurrentMap2.keySet());
                            }
                            ConcurrentMap concurrentMap3 = this.p;
                            if (!concurrentMap3.isEmpty()) {
                                setKeySet.removeAll(concurrentMap3.keySet());
                            }
                            ConcurrentMap concurrentMap4 = this.q;
                            if (!concurrentMap4.isEmpty()) {
                                setKeySet.removeAll(concurrentMap4.keySet());
                            }
                        }
                        if (!map.isEmpty()) {
                            this.n.putAll(map);
                        }
                        this.k = true;
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (RemoteException e2) {
                    throw new ltc(e2);
                }
            } catch (Throwable th3) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th3;
            }
        } catch (ltc unused) {
        }
    }

    public final void f(ContentResolver contentResolver) {
        byte b2 = this.h;
        if (b2 != 0) {
            if (b2 == 1) {
                j();
                return;
            }
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.g;
        writeLock.lock();
        try {
            byte b3 = this.h;
            if (b3 == 1) {
                j();
            } else if (b3 != 2) {
                this.j = new Object();
                this.h = (byte) 2;
                contentResolver.registerContentObserver(lsy.a, true, new ltb(this));
                this.g.unlock();
                return;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    public final void g(Object obj, Map map, String str, Object obj2, Object obj3) {
        this.g.lock();
        try {
            if (obj == this.j) {
                if (obj2 == null) {
                    obj2 = obj3;
                }
                map.put(str, obj2);
                this.n.remove(str);
            }
        } finally {
            this.g.unlock();
        }
    }

    public final void h(ContentResolver contentResolver) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }
}
