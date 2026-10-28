package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvc {
    private static Boolean g = null;
    private static String h = null;
    private static boolean i = false;
    private static int j = -1;
    private static Boolean k;
    private static kvd o;
    private static kve p;
    public final Context f;
    private static final ThreadLocal l = new ThreadLocal();
    private static final ThreadLocal m = new kuu();
    private static final kuz n = new kuv();
    public static final kvb a = new kuw(1);
    public static final kvb b = new kuw(0);
    public static final kvb c = new kuw(2);
    public static final kvb d = new kuw(3);
    public static final kvb e = new kuw(4);

    private kvc(Context context) {
        this.f = context;
    }

    public static int a(Context context, String str) {
        int i2 = 0;
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(a.bT(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equals(declaredField.get(null), str)) {
                i2 = declaredField2.getInt(null);
            } else {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + '\'');
            }
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.bT(str, "Local module descriptor class for ", " not found."));
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.database.Cursor, java.lang.Object] */
    public static int b(Context context, String str, boolean z) {
        Throwable th;
        RemoteException e2;
        int i2;
        kuo kumVar;
        ?? r1;
        try {
            synchronized (kvc.class) {
                Boolean bool = g;
                Cursor cursor = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (kuy unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!h(context)) {
                                        return 0;
                                    }
                                    if (i || Boolean.TRUE.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iE = e(context, str, z, true);
                                            String str2 = h;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderA = kus.a();
                                                if (classLoaderA == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = h;
                                                        if (str3 == null) {
                                                            throw new NullPointerException("null reference");
                                                        }
                                                        classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = h;
                                                        if (str4 == null) {
                                                            throw new NullPointerException("null reference");
                                                        }
                                                        classLoaderA = new kut(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                f(classLoaderA);
                                                declaredField.set(null, classLoaderA);
                                                g = Boolean.TRUE;
                                            }
                                            return iE;
                                        } catch (kuy unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                                g = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", a.co(e3, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (kuy e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                kvd kvdVarI = i(context);
                try {
                    if (kvdVarI == null) {
                        return 0;
                    }
                    try {
                        int iA = kvdVarI.a();
                        if (iA >= 3) {
                            heg hegVar = (heg) l.get();
                            if (hegVar != null && (r1 = hegVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            kun kunVar = new kun(context);
                            long jLongValue = ((Long) m.get()).longValue();
                            Parcel parcelC = kvdVarI.c();
                            gdc.e(parcelC, kunVar);
                            parcelC.writeString(str);
                            parcelC.writeInt(z ? 1 : 0);
                            parcelC.writeLong(jLongValue);
                            Parcel parcelD = kvdVarI.d(7, parcelC);
                            IBinder strongBinder = parcelD.readStrongBinder();
                            if (strongBinder == null) {
                                kumVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                kumVar = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
                            }
                            parcelD.recycle();
                            Cursor cursor2 = (Cursor) kun.b(kumVar);
                            if (cursor2 != null) {
                                try {
                                    if (cursor2.moveToFirst()) {
                                        i2 = cursor2.getInt(0);
                                        cursor = (i2 <= 0 || !g(cursor2)) ? cursor2 : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor2;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = cursor2;
                                    if (cursor == null) {
                                        throw th;
                                    }
                                    cursor.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        }
                        if (iA == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            kun kunVar2 = new kun(context);
                            Parcel parcelC2 = kvdVarI.c();
                            gdc.e(parcelC2, kunVar2);
                            parcelC2.writeString(str);
                            parcelC2.writeInt(z ? 1 : 0);
                            Parcel parcelD2 = kvdVarI.d(5, parcelC2);
                            i2 = parcelD2.readInt();
                            parcelD2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            kun kunVar3 = new kun(context);
                            Parcel parcelC3 = kvdVarI.c();
                            gdc.e(parcelC3, kunVar3);
                            parcelC3.writeString(str);
                            parcelC3.writeInt(z ? 1 : 0);
                            Parcel parcelD3 = kvdVarI.d(3, parcelC3);
                            i2 = parcelD3.readInt();
                            parcelD3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            lqd.m(context);
            throw th5;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor, java.lang.Object] */
    public static kvc d(Context context, kvb kvbVar, String str) throws Throwable {
        long j2;
        long j3;
        kvc kvcVar;
        Boolean bool;
        kuo kumVar;
        kvc kvcVar2;
        kve kveVar;
        boolean z;
        Boolean boolValueOf;
        kuo kumVar2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new kuy("null application Context");
        }
        ThreadLocal threadLocal = l;
        heg hegVar = (heg) threadLocal.get();
        heg hegVar2 = new heg((char[]) null);
        threadLocal.set(hegVar2);
        ThreadLocal threadLocal2 = m;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            kva kvaVarA = kvbVar.a(context, str, n);
            j3 = 0;
            try {
                int i2 = kvaVarA.a;
                int i3 = kvaVarA.b;
                int i4 = kvaVarA.c;
                j2 = jLongValue;
                try {
                    if (i4 != 0) {
                        if (i4 == -1 && i2 == 0) {
                            i2 = 0;
                        } else if (i4 == 1 && i3 == 0) {
                            i3 = 0;
                        } else {
                            if (i4 == -1) {
                                kvc kvcVar3 = new kvc(applicationContext);
                                if (j2 == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l2);
                                }
                                ?? r1 = hegVar2.a;
                                if (r1 != 0) {
                                    r1.close();
                                }
                                threadLocal.set(hegVar);
                                return kvcVar3;
                            }
                            try {
                                if (i4 != 1) {
                                    throw new kuy(a.bR(0, "VersionPolicy returned invalid code:"));
                                }
                                try {
                                    synchronized (kvc.class) {
                                        if (!h(context)) {
                                            throw new kuy("Remote loading disabled");
                                        }
                                        bool = g;
                                    }
                                    if (bool == null) {
                                        throw new kuy("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        synchronized (kvc.class) {
                                            try {
                                                kveVar = p;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (kveVar == null) {
                                            throw new kuy("DynamiteLoaderV2 was not cached.");
                                        }
                                        heg hegVar3 = (heg) threadLocal.get();
                                        if (hegVar3 == null || hegVar3.a == null) {
                                            throw new kuy("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Object obj = hegVar3.a;
                                        new kun(null);
                                        synchronized (kvc.class) {
                                            try {
                                                z = j >= 2;
                                                boolValueOf = Boolean.valueOf(z);
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        boolValueOf.getClass();
                                        if (z) {
                                            kun kunVar = new kun(applicationContext2);
                                            kun kunVar2 = new kun(obj);
                                            Parcel parcelC = kveVar.c();
                                            ClassLoader classLoader = gdc.a;
                                            parcelC.writeStrongBinder(kunVar);
                                            parcelC.writeString(str);
                                            parcelC.writeInt(i3);
                                            parcelC.writeStrongBinder(kunVar2);
                                            Parcel parcelD = kveVar.d(3, parcelC);
                                            IBinder strongBinder = parcelD.readStrongBinder();
                                            if (strongBinder == null) {
                                                kumVar2 = null;
                                            } else {
                                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                kumVar2 = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(strongBinder);
                                            }
                                            parcelD.recycle();
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            kun kunVar3 = new kun(applicationContext2);
                                            kun kunVar4 = new kun(obj);
                                            Parcel parcelC2 = kveVar.c();
                                            gdc.e(parcelC2, kunVar3);
                                            parcelC2.writeString(str);
                                            parcelC2.writeInt(i3);
                                            gdc.e(parcelC2, kunVar4);
                                            Parcel parcelD2 = kveVar.d(2, parcelC2);
                                            IBinder strongBinder2 = parcelD2.readStrongBinder();
                                            if (strongBinder2 == null) {
                                                kumVar2 = null;
                                            } else {
                                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                kumVar2 = iInterfaceQueryLocalInterface2 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface2 : new kum(strongBinder2);
                                            }
                                            parcelD2.recycle();
                                        }
                                        Context context2 = (Context) kun.b(kumVar2);
                                        if (context2 == null) {
                                            throw new kuy("Failed to get module context");
                                        }
                                        kvcVar2 = new kvc(context2);
                                    } else {
                                        kvd kvdVarI = i(context);
                                        if (kvdVarI == null) {
                                            throw new kuy("Failed to create IDynamiteLoader.");
                                        }
                                        int iA = kvdVarI.a();
                                        if (iA >= 3) {
                                            heg hegVar4 = (heg) threadLocal.get();
                                            if (hegVar4 == null) {
                                                throw new kuy("No cached result cursor holder");
                                            }
                                            kun kunVar5 = new kun(context);
                                            kun kunVar6 = new kun(hegVar4.a);
                                            Parcel parcelC3 = kvdVarI.c();
                                            gdc.e(parcelC3, kunVar5);
                                            parcelC3.writeString(str);
                                            parcelC3.writeInt(i3);
                                            gdc.e(parcelC3, kunVar6);
                                            Parcel parcelD3 = kvdVarI.d(8, parcelC3);
                                            IBinder strongBinder3 = parcelD3.readStrongBinder();
                                            if (strongBinder3 == null) {
                                                kumVar = null;
                                            } else {
                                                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                kumVar = iInterfaceQueryLocalInterface3 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface3 : new kum(strongBinder3);
                                            }
                                            parcelD3.recycle();
                                        } else if (iA == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            kun kunVar7 = new kun(context);
                                            Parcel parcelC4 = kvdVarI.c();
                                            gdc.e(parcelC4, kunVar7);
                                            parcelC4.writeString(str);
                                            parcelC4.writeInt(i3);
                                            Parcel parcelD4 = kvdVarI.d(4, parcelC4);
                                            IBinder strongBinder4 = parcelD4.readStrongBinder();
                                            if (strongBinder4 == null) {
                                                kumVar = null;
                                            } else {
                                                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                kumVar = iInterfaceQueryLocalInterface4 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface4 : new kum(strongBinder4);
                                            }
                                            parcelD4.recycle();
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            kun kunVar8 = new kun(context);
                                            Parcel parcelC5 = kvdVarI.c();
                                            gdc.e(parcelC5, kunVar8);
                                            parcelC5.writeString(str);
                                            parcelC5.writeInt(i3);
                                            Parcel parcelD5 = kvdVarI.d(2, parcelC5);
                                            IBinder strongBinder5 = parcelD5.readStrongBinder();
                                            if (strongBinder5 == null) {
                                                kumVar = null;
                                            } else {
                                                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                kumVar = iInterfaceQueryLocalInterface5 instanceof kuo ? (kuo) iInterfaceQueryLocalInterface5 : new kum(strongBinder5);
                                            }
                                            parcelD5.recycle();
                                        }
                                        Object objB = kun.b(kumVar);
                                        if (objB == null) {
                                            throw new kuy("Failed to load remote module.");
                                        }
                                        kvcVar2 = new kvc((Context) objB);
                                    }
                                    kvcVar = kvcVar2;
                                    ThreadLocal threadLocal3 = m;
                                    if (j2 == 0) {
                                        threadLocal3.remove();
                                    } else {
                                        threadLocal3.set(l2);
                                    }
                                    ?? r2 = hegVar2.a;
                                    if (r2 != 0) {
                                        r2.close();
                                    }
                                    l.set(hegVar);
                                    return kvcVar;
                                } catch (RemoteException e2) {
                                    throw new kuy("Failed to load remote module.", e2);
                                } catch (kuy e3) {
                                    throw e3;
                                } catch (Throwable th3) {
                                    lqd.m(context);
                                    throw new kuy("Failed to load remote module.", th3);
                                }
                            } catch (kuy e4) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                                int i5 = kvaVarA.a;
                                if (i5 == 0 || kvbVar.a(context, str, new kux(i5)).c != -1) {
                                    throw new kuy("Remote load failed. No local fallback found.", e4);
                                }
                                kvcVar = new kvc(applicationContext);
                            }
                        }
                    }
                    throw new kuy("No acceptable module " + str + " found. Local version is " + i2 + " and remote version is " + i3 + '.');
                } catch (Throwable th4) {
                    th = th4;
                    ThreadLocal threadLocal4 = m;
                    if (j2 == j3) {
                        threadLocal4.remove();
                    } else {
                        threadLocal4.set(l2);
                    }
                    ?? r3 = hegVar2.a;
                    if (r3 != 0) {
                        r3.close();
                    }
                    l.set(hegVar);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                j2 = jLongValue;
            }
        } catch (Throwable th6) {
            th = th6;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[PHI: r13
      0x0121: PHI (r13v6 boolean) = (r13v5 boolean), (r13v10 boolean) binds: [B:58:0x00e9, B:72:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    private static int e(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        MatrixCursor matrixCursor;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) m.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z3 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        }
                    } catch (RemoteException unused) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        matrixCursor = null;
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } else {
                    matrixCursor = null;
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (kvc.class) {
                                    h = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        j = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        boolean z4 = matrixCursor.getInt(columnIndex2) != 0;
                                        i = z4;
                                        z3 = z4;
                                    }
                                }
                                matrixCursor2 = g(matrixCursor) ? null : matrixCursor;
                            }
                            if (z2 && z3) {
                                throw new kuy("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof kuy) {
                            throw exc;
                        }
                        throw new kuy("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th5) {
                        th = th5;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                synchronized (kvc.class) {
                    if (matrixCursor == null) {
                        if (Boolean.FALSE.equals(null)) {
                            Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                            return 0;
                        }
                    }
                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new kuy("Failed to connect to dynamite module ContentResolver.");
                }
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static void f(ClassLoader classLoader) throws kuy {
        try {
            kve kveVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kveVar = iInterfaceQueryLocalInterface instanceof kve ? (kve) iInterfaceQueryLocalInterface : new kve(iBinder);
            }
            p = kveVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new kuy("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(Cursor cursor) {
        heg hegVar = (heg) l.get();
        if (hegVar == null || hegVar.a != null) {
            return false;
        }
        hegVar.a = cursor;
        return true;
    }

    private static boolean h(Context context) {
        boolean z = true;
        if (!Boolean.TRUE.equals(null) && !Boolean.TRUE.equals(k)) {
            boolean z2 = false;
            if (k == null) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != a.aL() ? 0 : 268435456);
                if (klu.d.m(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                k = boolValueOf;
                boolValueOf.getClass();
                if (z2 && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                    i = true;
                }
            }
            z = z2;
            if (!z) {
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
            }
        }
        return z;
    }

    private static kvd i(Context context) {
        kvd kvdVar;
        synchronized (kvc.class) {
            kvd kvdVar2 = o;
            if (kvdVar2 != null) {
                return kvdVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kvdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kvdVar = iInterfaceQueryLocalInterface instanceof kvd ? (kvd) iInterfaceQueryLocalInterface : new kvd(iBinder);
                }
                if (kvdVar != null) {
                    o = kvdVar;
                    return kvdVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c(String str) {
        try {
            return (IBinder) this.f.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new kuy("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
